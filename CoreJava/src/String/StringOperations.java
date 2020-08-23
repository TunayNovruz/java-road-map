/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package String;
import java.util.Arrays;

import static java.lang.System.out;

public class StringOperations {
    public static void main(String[] args) {
        String str = " Hello world! ";
        int len = str.length();
        out.println(str.charAt(5));
        out.println(Arrays.toString(str.chars().toArray()));
        out.println(str.contains("world"));
        String newStr = str.replaceAll("Hello","Bye");
        out.println(newStr);
        out.println(str.trim());

    }
}
