package com.company;

import javax.swing.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String p,P;


        Scanner s=new Scanner(System.in);

        System.out.println("Enter a string");
        p=s.nextLine();
        String L=p.replace("15 august", "26 january");
        String S=L.replace("independence", "republic");
        System.out.println(S);







    }
}
