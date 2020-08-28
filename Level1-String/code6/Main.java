package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String p, q;

        Scanner s=new Scanner(System.in);
        p=s.nextLine();
        q=s.nextLine();
        if(p.equals(q))
        {
            System.out.println("Strings are same");
        }
        else
            System.out.println("Strings are different");
    }
}
