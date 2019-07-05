package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sernding message: " + message + "to: " + user.getName());
        } else {
            throw new MessageNotSentException("Object user was null!");
        }
    }
}
