package H1.Q1;

import java.util.Scanner;
import java.io.IOException;

public class Fib {

    // constructor
    public Fib(int f0, int f1){
        this.F0 = f0;
        this.F1 = f1;
    }

    // Computes F(n) using an ***iterative*** algorithm,
    // where F(n) = F(n-1) + F(n-2)
    // is the recursive definition.
    // use instance variables that store F(0) and F(1).
    // check parameter and throw exception if n < 0.0
    // Don't worry about arithmetic overflow.
    public int f(int n) {
        if (n < 0) throw new IllegalArgumentException("Limit value can not be less than 0");

        int tFirst = this.F0;
        int tNext = this.F1;

        for (int i = 0; i < n; i++){
            System.out.print(tFirst);
            System.out.print( (i < n-1) ? ", ":"\n");
            int nextSum  = tFirst + tNext;
            tFirst = tNext;
            tNext = nextSum;
        }
        return 0;
    }

    // Computes F(n) using the ***recursive*** algorithm,
    // where F(n) = F(n-1) + F(n-2) is the recursive definition.
    // use instance variables that store F(0) and F(1).
    // check parameter and throw exception if n < 0.
    // Don't worry about arithmetic overflow.
    public int fRec(int n) {
        if (n < 0) throw new IllegalArgumentException("Limit value can not be less than 0");
        if (n == 0) {
            System.out.println("\n");
            return 0;
        }
        else{
            System.out.print(this.F0 );
            System.out.print( (n - 1 != 0) ? ", ":"\n");
            int nextSum  = this.F0 + this.F1;
            this.F0 = this.F1;
            this.F1 = nextSum;
            return fRec(n - 1);
        }
    }



    public static void main(String[] args) throws IOException, NumberFormatException
    {

        try{

            // get numbers F(0) and F(1) from args[0] and args[1].
            // use either the Scanner class or Integer.parseInt(args[...])
            // you must handle possible exceptions !
            System.out.println("Starting Fib program");

            if(args.length != 3) throw new IllegalArgumentException("Invalid number of arguments!");

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // get n from args[2]:
            int num3 = Integer.parseInt(args[2]);

            // create a Fib object with params F(0) and F(1)
            Fib fibonacci = new Fib(num1, num2);


            // calculate F(0), ..., F(n) and display them with System.out.println(...) using
            // the iterative method f(i)
            System.out.println("\nRunning Fibonacci using iteration");
            fibonacci.f(num3);

            // calculate F(0), ..., F(n) and display them with System.out.println(...) using
            // the recursive method fRec(i)
            System.out.println("\nRunning Fibonacci using iteration");
            fibonacci.fRec(num3);

        }
        catch (NumberFormatException exec){
            System.out.println("Invalid input format " + exec.getMessage().toLowerCase());
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally{
            System.out.println("Thank you for running my code!");
        }

    }

    // instance variables store F(0) and F(1):
    private int F0; //save the first number
    private int F1; //save the second number
}
