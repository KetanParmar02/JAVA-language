package com.strings_and_string_bulider;

public class Main {
    public static void main(String[] args) {

        String name = "ketan";
        String name1 = "ketan";

        String name2 = new String("ketan");
        String name3 = new String("ketan");

        // here == comparator check the both value and check the both variable points to the same objects or not.
        // if both variables are points to the same object and both values are same then == return the true otherwise false.
        System.out.println(name2 == name3);

        // here .equals method is check only both values are same or not if yes then return true otherwise false.
        // .equals method not check the both variables are point to the same object or not.
        System.out.println(name.equals(name1));
    }
}
