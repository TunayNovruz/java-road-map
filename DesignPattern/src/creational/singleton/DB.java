/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.singleton;

@SuppressWarnings("ALL")
public class DB {
    private static DB instance;

    private DB(String dbName) {
    }

    static DB getInstance(String name) {
        if (instance == null) instance = new DB(name);
        return instance;
    }
}
