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
        else
            findCombination(nums, letters, result);
        return result;
    }

    public static void findCombination(ArrayList<Integer> nums, String[][] letters, List<String> result) {
        String[] temp = letters[nums.get(0)];
        for (String s : temp)
            for (int i = 1; i < nums.size(); i++)
                for (String s2 : letters[nums.get(i)])
                    for (int j = i + 1; j < nums.size(); j++)
                        for (String s3 : letters[nums.get(j)])
                            result.add(s + s2 + s3);

        nums.remove(0);
        if (nums.size() == 0)
            return;
        findCombination(nums, letters, result);

    }

    public void iterateLetters() {
        
    }
}
