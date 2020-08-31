package com.company;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String p ;



        Scanner s=new Scanner(System.in);

        System.out.println("Enter a string");


            p=s.nextLine();
            int l=p.length();
        char ch[]=p.toCharArray();
        for(int i=0;i<l;i++)
        {
            if(i%2==0)
            {
                ch[i]=Character.toUpperCase(ch[i]);
            }
            else
                ch[i]=Character.toLowerCase(ch[i]);
        }
        String string = new String(ch);
        System.out.println(string);
        }







}
