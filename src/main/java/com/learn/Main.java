package com.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s == "Chirag"){
            System.out.println("Hurry!!!");
        }else{
            System.out.println("NoNo");
        }

    }
}