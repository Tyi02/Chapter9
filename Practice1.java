package com.CSCI185;

import java.util.Scanner;

public class Practice1 {

    //Write a statement that will throw an exception  * if the value of String variable named status is "bad"
    // The string recovered by getMessage should be "Exception   thrown: bad status". You do


    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter status: ");
            String status = keyboard.nextLine();

            if (status.equals("Bad")) {
                throw new Exception("Exception thrown: bad status");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
