package com.example.demo.coding;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Al {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String hash = "35454B055CC325EA1AF2126E27707052";
        String password = "ILoveJava";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter
                .printHexBinary(digest).toUpperCase();

        System.out.println(myHash);
        System.out.println(hash);


        String string = "HOLA";
        System.out.println(string);
        System.out.println(new StringBuffer(string).reverse());
        char array[] = string.toCharArray();

    }

}
