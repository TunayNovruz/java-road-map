/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.abstractfactory;

public class LuxryCar implements Car {
    Locations location;
    @Override
    public void signal() {
        System.out.println("Luxry Car signal");
    }
}
