package com.example.demo.java8qa;

public class Paytm implements UPIpayment {
    @Override
    public String doPayment(String source, String dest) {
        this.getScrachCard();
        return null;
    }
}
