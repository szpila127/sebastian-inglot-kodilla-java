package com.kodilla.stream.forumuser;


import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUser = new ArrayList<>();

    public Forum() {
        theUser.add(new ForumUser(1, "user1", 'M', LocalDate.of(1994, 1, 17), 0));
        theUser.add(new ForumUser(2, "user2", 'M', LocalDate.of(2000, 12, 27), 111));
        theUser.add(new ForumUser(3, "user3", 'F', LocalDate.of(2002, 10, 7), 12));
        theUser.add(new ForumUser(4, "user4", 'M', LocalDate.of(1990, 5, 6), 6));
        theUser.add(new ForumUser(5, "user5", 'F', LocalDate.of(1980, 1, 17), 12));
        theUser.add(new ForumUser(6, "user6", 'M', LocalDate.of(1973, 6, 16), 2));
        theUser.add(new ForumUser(7, "user7", 'F', LocalDate.of(1967, 7, 22), 0));
        theUser.add(new ForumUser(8, "user8", 'F', LocalDate.of(1997, 5, 31), 12));
        theUser.add(new ForumUser(9, "user9", 'M', LocalDate.of(1996, 3, 20), 142));
        theUser.add(new ForumUser(10, "user10", 'F', LocalDate.of(1999, 1, 9), 40));
        theUser.add(new ForumUser(11, "user11", 'M', LocalDate.of(1995, 2, 28), 645));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUser);
    }

}
