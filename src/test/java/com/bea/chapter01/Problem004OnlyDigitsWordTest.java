package com.bea.chapter01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem004OnlyDigitsWordTest {

    @Test
    void isDigit() {
        var problem004 = new Problem004OnlyDigitsWord();

        System.out.println(problem004.isDigit("123"));

        System.out.println(problem004.isDigit("1a23"));
    }
}