package com.company;

import javax.swing.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String[] names = new String[5];



        Scanner s=new Scanner(System.in);

        System.out.println("Enter 5 string");

        for(int i=0;i<5;i++)
        {
            names[i]=s.nextLine();
        }
        for(int i=0;i<5;i++)
        {
           String n=names[i];
           char ch=n.charAt(0);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               System.out.println(names[i]);
           }
        }






    }
}
