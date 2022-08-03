package com.flipkart.exception;

/*
* @author JEDI-group05
 * Exception arises when payment is failed.
 */
public class PaymentFailedException extends Exception {

    public String getMessage() {
        return "Payment was not successful ! Please try again";
    }
}