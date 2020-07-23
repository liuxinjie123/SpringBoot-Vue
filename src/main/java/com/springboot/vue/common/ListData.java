package com.springboot.vue.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@NoArgsConstructor
public class ListData<T> implements Serializable {
    private String title;
    private List<String> header = new ArrayList<>();
    private List<String> keyList = new ArrayList<>();
    private List<T> list = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getHeader() {
        return header;
    }

    public void setHeader(List<String> header) {
        this.header = header;
    }

    public List<String> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<String> keyList) {
        this.keyList = keyList;
    }

    public List<Map<String, Object>> getList() {
        List<Map<String, Object>> newList = new ArrayList<>();
        for (T obj : list) {
            Map<String, Object> map = new TreeMap<>();
            for (Field field : obj.getClass().getDeclaredFields()) {
                String name = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                try {
                    Method m = null;
                    try {
                        m = obj.getClass().getMethod("get" + name);
                    } catch (NoSuchMethodException e) {
                        m = obj.getClass().getMethod("is" + name);
                    }
                    // 调用getter方法获取属性值
                    String value = String.valueOf(m.invoke(obj));
                    map.put(field.getName(), value);
                } catch (IllegalAccessException | NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            newList.add(map);
        }
        return newList;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
