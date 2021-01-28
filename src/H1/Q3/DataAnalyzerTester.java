package H1.Q3;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Define a class DataAnalyzerTester that reads the numbers from System.in, builds the number list,
 * creates the DataAnalyzer object, and displays the min, max, and average using the DataAnalyzer instance.
 * The DataAnalyzerTester class implements the main() method.
 *
 * Your code needs to handle invalid input and I/O exceptions.
 * Write javadoc comments.
 * Include both java files in your solution document.
 */
public class DataAnalyzerTester {
    /**
     * Function that collects integer inputs
     */
    public static LinkedList<Integer> ReadTerminal() throws IOException, ArrayStoreException, NumberFormatException, InputMismatchException
    {
        Scanner input = new Scanner(System.in);
        Boolean proceed = true;

        LinkedList<Integer> userList = new LinkedList<Integer>();

        System.out.println("Enter the size of your list");
        int size = input.nextInt();
        System.out.println("Enter your numbers one by one");
        do{
            userList.add(input.nextInt());
        }while(userList.size() < size);

        return userList;
    }

    public static void main(String[] args){
        try {
            System.out.println("Start of DataAnalyzerTester program");
            Scanner input = new Scanner(System.in);

            //Create object of type DataAnalyser
            LinkedList<Integer> userList = ReadTerminal();
            DataAnalyzer dataAnalyzer = new DataAnalyzer(userList);
            //Request the name of the storage file
            //Calculate and write to terminal and file the results
            System.out.println("Enter the name of the File for data storage");
            String fileName = input.next();
            dataAnalyzer.WriteToFile(fileName);

        }
        catch (NumberFormatException exec){
            System.out.println("Invalid input format " + exec.getMessage().toLowerCase());
        }
        catch(Exception exec){
            System.out.println(exec.getMessage());
            System.out.println(exec.getLocalizedMessage());
        }

    }
}
