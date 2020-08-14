package com.norman.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.util.StringUtils;

/**
 * JSON工具类
 *
 */
public final class JSONUtils {
    /** TAG */
    private static final String TAG = "JSONUtils";

    /**
     * default constructor
     */
    private JSONUtils() {

    }

    /**
     * 将String解析成JSONObject
     *
     * @param json String
     * @return JSONObject
     */
    public static JSONObject parseString(String json) {
        if (StringUtils.isEmpty(json)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(json);
        } catch (JSONException e) {
            return new JSONObject();
        }
    }

    /**
     * 从JSONObject中通过name读取value
     *
     * @param <T>  数据泛型
     * @param json JSONObject
     * @param name name
     * @param cls  希望的value类型
     * @return value
     */
    public static <T> T get(JSONObject json, String name, Class<T> cls) {
        if (json == null) {
            return null;
        }

        Object value = json.opt(name);

        if (cls.isInstance(value)) {
            return (T) value;
        }


        return null;
    }

    /**
     * @param array JSONArray
     * @param index index
     * @return JSONObject
     * @see JSONUtils#getItem(JSONArray, int, Class)
     */
    public static JSONObject getJSONObjectItem(JSONArray array, int index) {
        return getItem(array, index, JSONObject.class);
    }

    /**
     * @param json JSONObject
     * @param name name
     * @return Object
     * @see JSONUtils#get(JSONObject, String, Class)
     */
    public static Object get(JSONObject json, String name) {
        return get(json, name, Object.class);
    }


    /**
     * 从JSONArray中读取index位置的value
     *
     * @param <T>   数据泛型
     * @param array JSONArray
     * @param index index
     * @param cls   希望的value类型
     * @return value
     */
    public static <T> T getItem(JSONArray array, int index, Class<T> cls) {
        Object value = array.opt(index);

        if (cls.isInstance(value)) {
            return (T) value;
        }


        return null;
    }

    /**
     * @param json JSONObject
     * @param name name
     * @return JSONArray
     * @see JSONUtils#get(JSONObject, String, Class)
     */
    public static JSONArray getJSONArray(JSONObject json, String name) {
        return get(json, name, JSONArray.class);
    }

    /**
     * @param json JSONObject
     * @param name name
     * @return JSONObject
     * @see JSONUtils#get(JSONObject, String, Class)
     */
    public static JSONObject getJSONObject(JSONObject json, String name) {
        return get(json, name, JSONObject.class);
    }

    /**
     * @param json JSONObject
     * @param name name
     * @return String
     * @see JSONUtils#get(JSONObject, String, Class)
     */
    public static String getString(JSONObject json, String name) {
        return get(json, name, String.class);
    }

    /**
     * @param json         JSONObject
     * @param name         name
     * @param defaultValue defaultValue
     * @return int
     * @see JSONUtils#get(JSONObject, String, Class)
     */
    public static int getInt(JSONObject json, String name, int defaultValue) {
        Integer value = get(json, name, Integer.class);
        if (value == null) {
            return defaultValue;
        }
        return get(json, name, Integer.class);
    }

    /**
     * @param json         JSONObject
     * @param name         key
     * @param defaultValue default
     * @return boolean
     * @see JSONUtils#get(JSONObject, String, Class)
     */
    public static boolean getBoolean(JSONObject json, String name, boolean defaultValue) {
        Boolean value = get(json, name, Boolean.class);
        if (value == null) {
            return defaultValue;
        }
        return value.booleanValue();
    }

    /**
     * @param json JSONObject
     * @param name name
     * @return String
     * @see JSONUtils#get(JSONObject, String, Class)
     */
    public static String getIntOrString(JSONObject json, String name) {
        Integer value = get(json, name, Integer.class);

        if (value == null) {
            return get(json, name, String.class);
        }

        return value.toString();
    }

    /**
     * 获取float值
     *
     * @param json         JSONObject
     * @param name         key
     * @param defaultValue default
     * @return float
     */
    public static float getFloat(JSONObject json, String name, float defaultValue) {
        if (json == null) {
            return defaultValue;
        }
        return (float) json.optDouble(name, defaultValue);
    }
}