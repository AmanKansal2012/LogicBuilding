package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String s;
        int c;
        System.out.println("Enter a string");
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
         c=1;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    c++;
                }

            }


        System.out.println("Number of words are "+c);
    }
}
