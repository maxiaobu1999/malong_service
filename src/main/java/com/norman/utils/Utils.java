package com.norman.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static int getMixLength(String str) {
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        float length = 0f;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            // 中文
            if ((c >= 0x0391 && c <= 0xFFE5)) {
                length += 1;
            } else {
                // 其他字符
                length += 0.5;
            }
        }
        return (int) (length + 0.5);
    }

    public static long convertStringToLongSafe(String string) {
        if (StringUtils.isEmpty(string)) {
            return 0L;
        }
        long ret = 0L;
        try {
            ret = Long.parseLong(string);
        } catch (NumberFormatException e) {
           e.printStackTrace();
        }
        return ret;
    }
    /** 验证手机号码 */
    public static boolean isPhone(String phone) {
        if (TextUtils.isEmpty(phone)) {
            return false;
        }
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (phone.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            boolean isMatch = m.matches();
            return isMatch;
        }
    }
}
