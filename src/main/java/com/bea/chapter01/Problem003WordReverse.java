package com.bea.chapter01;

/**
 * 문제 : 단어 뒤집기
 *
 * input : "abc" -> "cba"
 *  arr
 *      - arr[0] : 'a'
 *      - arr[1] : 'b'
 *      - arr[2] : 'c'
 *
 */
public class Problem003WordReverse {

    public String reverse(String input) {
        char[] arr = input.toCharArray();
        StringBuilder temp = new StringBuilder(input);

//        for (int i = arr.length - 1; i >= 0; i--) {
//            temp.append(arr[i]);
//        }

        return temp.reverse().toString();
    }
}
