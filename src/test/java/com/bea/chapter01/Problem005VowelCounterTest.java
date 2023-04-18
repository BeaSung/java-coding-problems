package com.bea.chapter01;

import org.junit.jupiter.api.Test;

class Problem005VowelCounterTest {

    @Test
    void count() {
        var problem005 = new Problem005VowelCounter();

        var count = problem005.count("abc");

        System.out.println(count);
    }
}