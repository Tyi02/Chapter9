package com.CSCI185;

public class CoreBreachException extends Exception
{
    //Define an exception class called CoreBreachException. The class should have a default
    //constructor. If an exception is thrown using this zero argument constructor, getMessage should
    //return “Core Breach: Evacuate Ship!” The class should also define a constructor having a single
    //parameter of type String. IF an exception is thrown using this constructor, getMessage should
    //return the value that was used as an argument to the constructor.


    public CoreBreachException ()
    {
        super ("Core Breach: Evacuate ship!");
    }


    public CoreBreachException (String message)
    {
        super (message);
    }

    public CoreBreachException(int level)
    {

    }
}