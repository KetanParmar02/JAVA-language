package com.strings_and_string_bulider;

public class Main {
    public static void main(String[] args) {

        String name = "ketan";
        String name1 = "ketan";

        String name2 = new String("ketan");
        String name3 = new String("ketan");

        System.out.println(name2 == name3);
        System.out.println(name.equals(name1));
    }
}
