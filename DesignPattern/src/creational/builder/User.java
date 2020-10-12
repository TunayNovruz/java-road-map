/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.builder;

public class User {
    private final String userName;
    private final String lastName;
    private final String firstName;
    private final int age;

    public User(UserBuilder builder) {
        this.userName = builder.userName;
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
