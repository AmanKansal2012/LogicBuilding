package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int count=0;

        System.out.println("Enter a String");
        String input=in.next();
        int l=input.length();
        for(int i=0;i<l;i++)
        {
            if(input.charAt(i)>=65&&input.charAt(i)<=90)
            {
                count++;
            }
        }
        System.out.println(input+" - "+count);
    }
}
