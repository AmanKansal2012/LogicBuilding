package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String q, p;
        int i=0;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter word");
        p=s.nextLine();
        q=p.substring(3,p.length());
        System.out.println(q);




    }
}
