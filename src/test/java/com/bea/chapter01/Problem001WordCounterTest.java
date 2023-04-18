package com.bea.chapter01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class Problem001WordCounterTest {

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
        Problem001WordCounter counter = new Problem001WordCounter();
        String input = "aba";

        Map<Character, Integer> map = counter.count(input);

        System.out.println(map);
    }
}