package com.CSCI185;

public class NegativeNumberException extends Exception
{
    public NegativeNumberException ()
    {
        super ("Negative Number Exception!");
    }


    public NegativeNumberException (String message)
    {
        super (message);
    }
}