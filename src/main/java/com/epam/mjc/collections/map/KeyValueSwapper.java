package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int value : sourceMap.keySet()) {
            String key = sourceMap.get(value);

            if (hashMap.containsKey(key) && hashMap.get(key) > value) {
                hashMap.put(key, value);
            } else hashMap.put(key, value);
        }
        return hashMap;
    }
}
