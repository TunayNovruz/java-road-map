/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package Regex;

import java.io.PrintStream;
import java.util.regex.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("\\d{1,}");
        Matcher matcher = pat.matcher("hello wordl 2 times 3");
        boolean boo = matcher.find();
        //boolean foo = matcher.matches();
        //Stream res = matcher.results();
        String t = matcher.group();
        int say = matcher.groupCount();
        for (int i = 0; i <say ; i++) {
            System.out.println(matcher.group(i));
        }
        System.out.println(t);
    }
}
