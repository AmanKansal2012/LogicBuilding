package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in= new Scanner(System.in);

        System.out.println("Enter first name:");
        String first=in.next();
        System.out.println("Enter middle name:");
        String middle=in.next();
        System.out.println("Enter last name:");
        String last=in.next();

        System.out.println(first.charAt(0)+"."+middle.charAt(0)+"."+last.charAt(0));
    }
}
