package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String q, p;
        int i=0,index;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a name");
        p=s.nextLine();
        q=p.toLowerCase();

            if(q.startsWith("mr.")||q.startsWith("mr"))
                System.out.println("Male");
            else if(q.startsWith("miss"))
                System.out.println("Female");
            else if(q.startsWith("mrs"))
                System.out.println("Married Female");
            else if(q.endsWith("kumari"))
                System.out.println("Female");
            else
                System.out.println("Cannot determined");




    }
}
