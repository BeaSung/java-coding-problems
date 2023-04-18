package com.bea.chapter01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem003WordReverseTest {

    @Test
    void reverse() {
        Problem003WordReverse word = new Problem003WordReverse();

        String result = word.reverse("abc");

        System.out.println(result);
    }
}