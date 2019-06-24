package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsAmount;

    public ForumUser(final int userId, final String username, final char sex, final LocalDate birthDate, final int postsAmount) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsAmount = postsAmount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsAmount=" + postsAmount +
                '}';
    }
}
