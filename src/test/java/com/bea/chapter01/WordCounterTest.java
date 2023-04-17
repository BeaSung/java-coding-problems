package com.bea.chapter01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class WordCounterTest {

    @Test
    void mapBasic() {
        Map<String, Integer> map = new HashMap<>();

        map.put("bea", 32);
        map.put("kay", 30);

        System.out.println(map);

        boolean none = map.containsKey("bea");
        System.out.println(none);
    }

    @Test
    void count() {
        WordCounter counter = new WordCounter();
        String input = "aba";

        Map<Character, Integer> map = counter.count(input);

        System.out.println(map);
    }
}