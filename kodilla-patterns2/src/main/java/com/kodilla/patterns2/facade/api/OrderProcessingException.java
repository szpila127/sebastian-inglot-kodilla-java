package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {

    public static String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR = "Verification error";
    public static String ERR_SUBMITTING_ERROR = "User is not authorised";

    public OrderProcessingException(String message) {
        super(message);
    }
}
