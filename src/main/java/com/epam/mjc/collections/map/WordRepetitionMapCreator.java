package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if(!sentence.equals("")){
            String[] arr = sentence.replaceAll("[,.]*","").toLowerCase().split(" ");
            for (String word: arr) {
                if(hashMap.containsKey(word)){
                    hashMap.put(word,hashMap.get(word)+1);
                }else hashMap.put(word,1);
            }
        }
        return hashMap;
    }
}
