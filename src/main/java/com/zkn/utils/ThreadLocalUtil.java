package com.zkn.utils;

import org.springframework.core.NamedThreadLocal;

import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by zkn on 2017/10/4.
 */
public class ThreadLocalUtil {

    public static void dumpThreadDetails() {
        try {
            //获取当前线程对象
            Thread thread = Thread.currentThread();
            //获取Thread中的threadLocals对象
            Field threadLocals = Thread.class.getDeclaredField("threadLocals");
            threadLocals.setAccessible(true);
            //ThreadLocalMap是ThreadLocal中的一个内部类，并且访问权限是default
            // 这里获取的是ThreadLocal.ThreadLocalMap
            Object threadLocalMap = threadLocals.get(thread);

            //这里要这样获取ThreadLocal.ThreadLocalMap
            Class threadLocalMapClazz = Class.forName("java.lang.ThreadLocal$ThreadLocalMap");
            //获取ThreadLocalMap中的Entry对象
            Field tableField = threadLocalMapClazz.getDeclaredField("table");
            tableField.setAccessible(true);
            //获取ThreadLocalMap中的Entry
            Object[] objects = (Object[]) tableField.get(threadLocalMap);

            //获取ThreadLocalMap中的Entry
            Class entryClass = Class.forName("java.lang.ThreadLocal$ThreadLocalMap$Entry");
            //获取ThreadLocalMap中的Entry中的value字段
            Field entryValueField = entryClass.getDeclaredField("value");
            entryValueField.setAccessible(true);
            //Entry继承了WeakReference，WeakReference继承了Reference
            Field referEnceField = Reference.class.getDeclaredField("referent");
            referEnceField.setAccessible(true);

            Arrays.stream(objects).filter(obj -> obj != null).forEach((obj) -> {
                try {
                    Object value = entryValueField.get(obj);
                    if (value != null) {
                        ThreadLocal threadLocal = (ThreadLocal) referEnceField.get(obj);
                        if (threadLocal instanceof NamedThreadLocal) {
                            System.out.print("spring threadlocal name: " + threadLocal + " value: ");
                        }
                        if (value instanceof Reference) {
                            Reference ref = (Reference) value;
                            System.out.println(" ref " + ref.getClass().getName() + " ref to " + ref.get());
                        } else {
                            System.out.println(value);
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal();
        Map<String, String> maps = new HashMap<String, String>() {{
            put("zhangsan", "lisiwww");
            put("zhangsan000000", "lisi7845www");
            put("zha0124545ngsan", "lisiw02255ww");
        }};
        threadLocal.set(maps);
        ThreadLocal<List<String>> threadLocalList = new ThreadLocal();
        List<String> lists = new ArrayList<String>() {{
            add("qwwweweqqqqqq2222");
            add("qww111weweqqqqqq2222");
            add("qwww44444eweqqqqqq2222");
        }};
        threadLocalList.set(lists);
        dumpThreadDetails();
    }
}
