package com.company;

import javax.swing.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String q, p,P,Q;
        int i=0;


        Scanner s=new Scanner(System.in);

        System.out.println("Enter first string");
        p=s.next();
        System.out.println("Enter second string");
        q=s.next();
        int l=p.length();
        int m=q.length();
        P=p.toLowerCase();
        Q=q.toLowerCase();


        if(P.charAt(0)>Q.charAt(0))
        {
            System.out.println(p+" comes later than"+q);
        }
        else if(Q.charAt(0)>P.charAt(0))
        {
            System.out.println(q+" comes later than "+p);
        }else
        if(P.equals(Q))
        {
            System.out.println("Strings are equal");
        }
        






    }
}
