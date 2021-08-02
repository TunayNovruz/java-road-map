/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int len = s.length() - 1;
        for (int i = 0; i < len; i++) {
            Character temp = s.charAt(i);
            if (map.get(s.charAt(i + 1)) > map.get(temp))
                sum -= map.get(temp);
            else sum += map.get(temp);
        }
        return sum + map.get(s.charAt(len));
    }
}
