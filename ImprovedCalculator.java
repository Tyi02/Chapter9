package Calculator;

import java.util.Scanner;

public class ImprovedCalculator extends Calculator
{
    private double memory;
    private double recall;

    //setter and getter
    public double getMemory() {
        return memory;

    }

    public void setMemory(double newMemory) {
        this.memory = newMemory;
    }

    public double getRecall() {
        return recall;
    }

    public void setRecall(double newRecall) {
        this.recall = newRecall;
    }


    //constructor -> memory and result to 0;
    public ImprovedCalculator()
    {
        setMemory(0);
        setResult(0);

    }

    public void savedMemory()
    {
        memory = getResult();
        System.out.println("Memory is saved");
    }

    public void recallTheMemory()
    {
        recall = memory;
        System.out.println("This was in the memory: "+recall);
    }





    public void doCalculation () throws DivideByZeroException,
            UnknownOpException
    {
        Scanner keyboard = new Scanner (System.in);
        boolean done = false;
        setResult(0);
        System.out.println ("result = " + getResult());
        while (!done)
        {
            char nextOp = (keyboard.next ()).charAt (0);

            if ((nextOp == 'e') || (nextOp == 'E'))
                done = true;

            else if((nextOp == 'c') || (nextOp == 'C'))
            {
                reset();
            }

            else if((nextOp == 'm') || (nextOp == 'M'))
            {
                //memory is saved
               savedMemory();

            }

            else if((nextOp == 'r') || (nextOp == 'R'))
            {
                //recall function will be
               recallTheMemory();
            }

            else
            {
                double nextNumber = keyboard.nextDouble ();
                setResult(evaluate (nextOp, getResult(), nextNumber));
                System.out.println ("result " + nextOp + " " +
                        nextNumber + " = " + getResult());
                System.out.println ("updated result = " + getResult());
            }
        }
    }

    public static void main(String[] args) {
        ImprovedCalculator clerk = new ImprovedCalculator();
        try
        {
            System.out.println ("Calculator is on.");
            System.out.print ("Format of each line: ");
            System.out.println ("operator space number");
            System.out.println ("For example: + 3");
            System.out.println ("To end, enter the letter e.");
                clerk.doCalculation();
        }
        catch (UnknownOpException e)
        {
            clerk.handleUnknownOpException (e);
        }
        catch (DivideByZeroException e)
        {
            clerk.handleDivideByZeroException (e);
        }
        System.out.println ("The final result is " +
                clerk.getResult());
        System.out.println ("Calculator program ending.");

    }
}
