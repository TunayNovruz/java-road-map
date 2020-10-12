/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.builder;

public class Client {
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder();
        User user = builder
                .age(25)
                .userName("tunaynovruz")
                .build();
        System.out.println(user.toString());
    }
}
