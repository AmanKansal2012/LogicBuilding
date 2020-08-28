package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String q, p;
        int i=0;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter word");
        q=s.next();
        p=q.toLowerCase();
        int l=p.length()-1;
       while(i<l)
       {
           if(p.charAt(i)!=p.charAt(l))
               System.out.println("not a pallindrome");

               i++;
               l--;

       }
        System.out.println("Pallindrome");



    }
}
