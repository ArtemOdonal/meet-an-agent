package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int secretKey = 133976;

        if (secretKey != input){
            System.out.println("Access denied");
        }else{
            System.out.println("Hello, Agent");
        }
    }
}
