/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.prototype;

public class Client {
    public static void main(String[] args) {

        try {
            Car car1 = new Car("Tesla", 2019);
            Car car2 = car1.clone();
            Car car3 = car1;

            car3.year = 1995;

            System.out.println("car 1 " + car1.toString());
            System.out.println("car 2 " + car2.toString());
            System.out.println("car 3 " + car3.toString());

        } catch (Exception e) {
            System.out.println("exceptino");
            System.out.println(e.getMessage());
        }

    }
}
