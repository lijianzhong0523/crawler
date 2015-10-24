package com.study.crawler.wrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lijianzhong on 15/10/24.
 */
public class Params {

    private final Map<String, Object> parameters = new HashMap<String, Object>();

    public Params param(String key, Object value) {
        if (value != null) {
            parameters.put(key, value);
        }
        return this;
    }

    public <T> T get(String key, Class<T> expectedClass) {
        return get(key, expectedClass, null);
    }

    public <T> T get(String key, Class<T> expectedClass, T defaultValue) {
        Object param = parameters.get(key);
        if (param != null && expectedClass != null) {
            if (expectedClass.isAssignableFrom(param.getClass())) {
                return expectedClass.cast(param);
            }
        }
        return defaultValue;
    }
}
