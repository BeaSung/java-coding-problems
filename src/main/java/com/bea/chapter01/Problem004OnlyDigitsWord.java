package com.bea.chapter01;

/**
 * 문제 : 숫자만 포함하는 문자열인지 검사
 *
 * "12a3"
 */
public class Problem004OnlyDigitsWord {

    public boolean isDigit(String input) {
        char[] arr = input.toCharArray();
        for (char ch : arr) {
            if (isNotDigit(ch)) { // ch 가 숫자인지 검사
                return false;
            }
        }
        return true;
    }

    private boolean isNotDigit(char ch) {
        return !Character.isDigit(ch);
    }
}
