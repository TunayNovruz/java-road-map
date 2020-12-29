/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    public static void main(String[] args) {

        for (String a : letterCombinations("234")) {
            System.out.println(a);
        }
    }


    public static List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();
        String[][] letters = {{}, {},
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"},
        };
        int len = digits.length();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int n = 0; n < len; n++) {
            try {
                nums.add(Integer.parseInt(digits.substring(n, n + 1)));
            } catch (NumberFormatException ignored) {
            }
        }
        if (len == 0)
            return result;
        if (len == 1)
            result.addAll(Arrays.asList(letters[nums.get(0)]));
        else {
            findCombination(0, "", nums, letters, result);
        }
        return result;
    }

    public static void findCombination(int k, String letter, ArrayList<Integer> nums, String[][] letters, List<String> result) {

        if (k >= nums.size()) {
            result.add(letter);
            return;
        }
        int n = nums.get(k);
        String[] temps = letters[n];
        for (String temp : temps) {
            if (letter.length() > 0 && letter.charAt(letter.length() - 1) == 'b' && temp.equals("d"))
                continue;
            findCombination(k + 1, letter + temp, nums, letters, result);
        }
    }
}
