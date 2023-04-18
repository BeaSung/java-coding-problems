package com.bea.chapter01;

/**
 * 문제 : 문자열에서 모음(a, e, i, o, u)의 개수를 세는 프로그램
 *  - cf. 문자열은 영어로만 이루어져있다.
 */
public class Problem005VowelCounter {

    public int count(String input) {
        int count = 0;

        // input : abc
        char[] arr = input.toCharArray();
        for (char ch : arr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }


}
