package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String q, p;
        int i=0,index;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a word");
        p=s.next();
        for(i=0;i<p.length();i++)
        {
            char c=p.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                index=i;
                break;
            }
        }
        System.out.println("Piglatin format : "+p.substring(i,p.length())+p.substring(0,i)+"ay");




    }
}
