/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.singleton;

public class Model {
    public static void main(String[] args) {
        DB conn = DB.getInstance("localhost");
    }
}
