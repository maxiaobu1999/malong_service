package com.norman.common.aspect.validator;

import com.norman.common.BaseResponse;
import com.norman.common.aspect.validator.annotation.AutoValidate;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.lang.reflect.Parameter;
import java.util.Set;

/**
 * 参数验证AOP处理
 */
@Component
@Aspect // 把当前类标识为一个切面供容器读取
public class AutoValidateAspect {
    private static final Logger logger = LoggerFactory.getLogger(AutoValidateAspect.class);
    private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * 切入点 ：com.norman所有方法
     */
    @Pointcut(value = "execution(* com.norman..*.*(..))")
    public void autoValidatePointcut() {
    }

    /**
     * 自动验证环绕通知
     * 决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
     * 验证有@AutoValidate注解的方法中被@RequestBody注解修饰的参数的合法性
     * @param joinPoint 第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
     * @param autoValidate 注解
     * @return
     * @throws Throwable
     */
    @Around(value = "autoValidatePointcut() && @annotation(autoValidate)", argNames = "joinPoint,autoValidate")
    public Object autoValidateAround(ProceedingJoinPoint joinPoint, AutoValidate autoValidate) throws Throwable {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        //获取方法的所有参数
        Parameter[] parameters = methodSignature.getMethod().getParameters();
        Object[] args = joinPoint.getArgs();
        Class targetParamType = autoValidate.targetParamType();
        //获取被@RequestBody注解修饰的参数
        for(int i=0; i<parameters.length; i++) {
            Parameter parameter = parameters[i];
            if(void.class.equals(targetParamType) && parameter.getDeclaredAnnotation(RequestBody.class) != null) {
                BaseResponse baseResponse = validate(methodSignature, args[i]);
                if(baseResponse != null) {
                    return baseResponse;
                }
                //验证过一个参数后，不再对其他参数进行验证
                break;
            } else if(!void.class.equals(targetParamType) && targetParamType.equals(parameter.getClass())) {
                BaseResponse baseResponse = validate(methodSignature, args[i]);
                if(baseResponse != null) {
                    return baseResponse;
                }
                //验证过一个参数后，不再对其他参数进行验证
                break;
            }
        }
        return joinPoint.proceed();
    }

    private BaseResponse validate(MethodSignature methodSignature, Object targetArg) throws Exception {
        BaseResponse baseResponse = null;
        //对参数进行验证
        Set<ConstraintViolation<Object>> constraintViolationSet = validator.validate(targetArg);
        //若参数不合法，返回错误信息
        if(!constraintViolationSet.isEmpty()) {
            ConstraintViolation<Object> first = constraintViolationSet.iterator().next();
            if(BaseResponse.class.isAssignableFrom(methodSignature.getReturnType())) {//判断返回类型是否继承BaseResponse
                baseResponse = (BaseResponse) methodSignature.getReturnType().newInstance();
                baseResponse.setCode(-2);
                baseResponse.setMsg(first.getMessage());
            } else {
                throw new Exception("被@AutoValidate修饰的方法的返回值必须为BaseResponse类型");
            }
        }
        return baseResponse;
    }

}
