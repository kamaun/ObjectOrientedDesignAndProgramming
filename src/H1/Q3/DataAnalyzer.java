package H1.Q3;

import java.io.*;
import java.util.*;


/**
 * 3
 * Write a program that:
 * a. reads from the terminal a sequence of numbers (integers)
 * b. saves them to a file with the name given from the command line
 * c. calculates,then displays on the terminal, and also saves to that file
 * the maximum,  minimum, and average.
 *
 *
 * Additional requirements:
 * Store the numbers in a LinkedList<Integer>.
 * Define a class DataAnalyzer that
 *
 *     * has a constructor that stores the list of numbers:
 * 	public DataAnalyzer(LinkedList<Integer> numList) {...}
 *     * has a method each for computing min(), max() and average():
 * 	 public int min() {...}, etc.
 */
public class DataAnalyzer {
    /**
     * Explicit constructor
     * assigns a linked list to nulist
     * @param numList user assigned linked list
     */
    public DataAnalyzer(LinkedList<Integer> numList){
        this.numList = numList;
    }



    /**
     * Print the user input list and its calculations to a user input file
     * @param fileName
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void WriteToFile(String fileName) throws FileNotFoundException, IOException
    {

        PrintWriter filePrinter = new PrintWriter(fileName);

        filePrinter.print("List:\t");
        System.out.print("List:\t");

        for (int num:
             this.numList) {
            filePrinter.print(num + " ");
            System.out.print(num + " ");
        }

        filePrinter.println();
        System.out.println();

        int minimum = min();
        filePrinter.println("The Maximum number is:\t" + minimum);
        System.out.println("The Maximum number is:\t" + minimum);

        int maximum = max();
        filePrinter.println("The Minimum number is:\t" + maximum);
        System.out.println("The Minimum number is:\t" + maximum);

        double average = average();
        filePrinter.println("The Average number is:\t" + average);
        System.out.println("The Average number is:\t" + average);

        filePrinter.close();

    }


    /**
     * Function that calculates the minimum value in the list
     * @return minimum value
     */
    public int min(){
        int minimum = this.numList.getFirst();

        for (int num:
             this.numList) {
            if (num < minimum) minimum = num;
        }

        return minimum;
    }

    /**
     * Function that calculates the maximum value in the list
     * @return maximum value
     */
    public int max(){
        int maximum = this.numList.getFirst();

        for (int num:
                this.numList) {
            if (num > maximum) maximum = num;
        }

        return maximum;
    }

    public double average(){
        int sum = 0;

        for (int num :
                this.numList) {
            sum += num;
        }

        return sum/this.numList.size();
    }

    private LinkedList<Integer> numList;
}
