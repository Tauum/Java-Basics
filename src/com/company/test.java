package com.company;

public class test {

    public static void main(String[] args) {
        System.out.println(InputVerifier.CheckString("aaaa"));

        System.out.println(InputVerifier.CheckString(""));

        System.out.println(InputVerifier.CheckStringAndConvertInt("5"));

        System.out.println(InputVerifier.CheckStringAndConvertInt(""));
        System.out.println(InputVerifier.CheckStringAndConvertInt("a"));
    }
}
