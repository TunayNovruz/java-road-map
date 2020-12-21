/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package leetcode;

import java.util.HashMap;

public class FractionToRecurringDecimal {

    public static void main(String[] args) {
        String res = fractionToDecimal(4, 333);
        System.out.println(res);
    }

    public static String fractionToDecimal(int n, int d) {
        HashMap<Integer, Boolean> fs = new HashMap<>();
        int tam = n / d;
        int lenD = (d + "").length();
        int m = (int) Math.pow(10, lenD);

        String str = qaliq(n % d, d, m, fs);

        int isRepeat = str.indexOf(')');
        if (isRepeat > 0)
            str = "(" + str;
        //todo burda moterizeden sonrasini tap ve sadece orani moterizeye al
        // regex ile

        int resLen = isRepeat > 0 ? str.length() - 2 : str.length();
        if (lenD - resLen > 0) {
            String zeros = "0".repeat(lenD - resLen);
            str = zeros + str;
        } else if (lenD == resLen) {
            str = str.replaceAll("0*$", "");
        }

        str = str.replaceAll("\\).*$", "");

        if (str.equals("0")) {
            return tam + "";
        }
        return tam + "." + str;
    }

    public static String qaliq(int f, int d, int m, HashMap<Integer, Boolean> fs) {

        int temp = (f * m);
        int temp2 = temp / d;

        if (fs.get(temp2) != null)
            return ")" + temp2;
        fs.put(temp2, true);
        int gm = temp - temp2 * d;
        if (gm == 0 || fs.size() >= 10000) {
            return "" + temp2;
        }
        int lenGm = (gm + "").length();
        int lenD = (d + "").length();
        m = (int) Math.pow(10, lenD - (lenGm - 1));
        String pref = "";
        if (lenD - (lenGm - 1) > 1)
            pref = "0".repeat(lenD - lenGm - 1);
        return pref + temp2 + qaliq(gm, d, m, fs);

    }

}
