package com.company;


import java.util.Objects;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Person vasya = new Person("Anriy", 54, "male");
        String path = "";
        vasya.ToJson(path);
        Person vasya1 = vasya.FromJson(path);
        System.out.println(vasya.equals(vasya1));
    }
}
