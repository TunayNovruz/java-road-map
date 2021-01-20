/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalTriangle {

    public Map<Integer, List<Integer>> store = new HashMap<>();
    public List<List<Integer>> rows = new ArrayList<>();

    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>();
        result.add(0, 1);
        if (rowIndex == 0) {
            return result;
        }
        if (rowIndex == 1) {
            result.add(1, 1);
            return result;
        }

        if (store.containsKey(rowIndex))
            return store.get(rowIndex);


        List<Integer> before = getRow(rowIndex - 1);
        for (int i = 1; i < rowIndex; i++) {
            result.add(i, before.get(i) + before.get(i - 1));
        }
        result.add(rowIndex, 1);
        store.put(rowIndex, result);
        rows.add(rowIndex, result);

        return result;
    }
}
