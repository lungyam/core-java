package com.core.java.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qilongxin
 * @date 2022/1/26 11:06
 */
public class MapAnalyze {
    public static void main(String[] args) {
        // HashMap的容量是2的N次幂，默认负载因子是0.75f
        HashMap<Integer, String> map = new HashMap<>(4);
        map.put(1, "a");
        map.put(2, "b");
        map.put(1, "c");
        map.forEach((k, v) -> System.out.println(k + v));
        System.out.println("result:" + map);
        System.out.println(map.size());
        System.out.println(map);
    }
}
