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
            char ch=input.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        System.out.println("Number of vowels in "+input+" :"+count);
    }
}
