package com.CSCI185;

import java.util.Scanner;
public class ExceptionDemo
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        try //tries to do the try block
                //if it triggers the if statement, it will leave the try block(goes into the catch block)
                //then runs the program normally
        {
            System.out.println ("Enter number of donuts:");
            int donutCount = keyboard.nextInt ();
            System.out.println ("Enter number of glasses of milk:");
            int milkCount = keyboard.nextInt ();
            if (milkCount < 1)
                throw new Exception ("Exception: No milk!");
            double donutsPerGlass = donutCount / (double) milkCount;
            System.out.println (donutCount + " donuts.");
            System.out.println (milkCount + " glasses of milk.");
            System.out.println ("You have " + donutsPerGlass +
                    " donuts for each glass of milk.");
        }
        catch (Exception e)
        {
            System.out.println (e.getMessage ());
            System.out.println ("Go buy some milk.");
        }
        System.out.println ("End of program.");
    }
}