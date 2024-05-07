package com.example.demo.java8qa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIpayment {
    String doPayment(String source, String dest);

    default double getScrachCard() {
        return new Random().nextDouble();
    }

    static String datePattern(String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date());
    }


}
