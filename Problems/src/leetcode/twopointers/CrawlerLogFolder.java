/*
 * Copyright (c) 2021.
 * @author TunayNovruz
 *
 */

package leetcode.twopointers;

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (count > 0) count--;
            } else if (!log.equals("./"))
                count++;
        }
        return count;
    }
}
