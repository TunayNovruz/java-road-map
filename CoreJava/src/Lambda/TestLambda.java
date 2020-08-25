/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package Lambda;

public class TestLambda {
    public static void main(String[] args) {
        MyNumber<Double> num;

        num = (double a)->a*2; //lambda, closure etc.
        num = (double b)->{
            long c = Math.round(b);
            c++;
            return b;
        };
        System.out.println(num.getValue(5.6));

    }
}
