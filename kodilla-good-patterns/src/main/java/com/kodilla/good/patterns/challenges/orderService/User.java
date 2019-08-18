package com.kodilla.good.patterns.challenges.orderService;

public class User {

    private String name;
    private String surname;
    private String nickname;

    public User(String name, String surname, String nickname) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }
}
