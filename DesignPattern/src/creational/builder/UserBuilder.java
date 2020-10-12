/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package creational.builder;

public class UserBuilder {
    public String userName;
    public String lastName;
    public String firstName;
    public int age;

    public UserBuilder userName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
