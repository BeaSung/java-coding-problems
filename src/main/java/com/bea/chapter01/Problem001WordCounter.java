package com.bea.chapter01;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제 : 문자 개수 세기
 * 주어진 문자열에서 문자 개수를 세는 프로그램
 *
 * ex. He is kay. kay is developer.
 * - {KEY} : {VALUE} // key: alphabet, value: count
 *  - a : 2
 *  - e : 4
 */
public class Problem001WordCounter {

    public Map<Character, Integer> count(String input) {
        Map<Character, Integer> countMap = new HashMap<>();
        char[] charArray = input.toCharArray();

        for (char key : charArray) {
            // countMap 에 이미 해당 key 가 존재하는지 확인
//            if (countMap.containsKey(key)) {
//                // 동일한 key 가 있다면, 그 key 가 가진 value 를 가져와서 +1
//                int count = countMap.get(key);
//                countMap.put(key, count + 1);
//            } else {
//                // 동일한 key 가 없다면, 그냥 1을 넣으면된다.
//                countMap.put(key, 1);
//            }

            int count = countMap.getOrDefault(key, 0);
            countMap.put(key, count + 1);
        }

        return countMap;
    }
}
