package H2.Q4;

import java.util.*;
import java.lang.*;

public class CashRegisterTester {

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Welcome to the Cash register");

            //Create a register object to initiate inventory
            RegisterSystem register = new RegisterSystem();

            //Create new UPC scanner object to collect UPC data
            UPCScanner scanner = new UPCScanner();

            Scanner in = new Scanner(System.in);

            //loop and collect upc number until user enters yes for payment
            while(!scanner.isComplete())
            {
                /*
                RegisterSystem class gets upc number from scanner class
                and display the details of the scanned item
                 */
                register.getProductDetails(scanner.scanItem());

                System.out.println("Pay? Yes/No");
                String answer = in.next();

                switch (answer)
                {
                    case "Yes" :
                    case "yes":
                        scanner.setComplete();
                    case "No":
                    case "no":
                        continue;
                    default:
                        throw new IllegalArgumentException("Invalid response");
                }
            }

            //Calculate the total
            register.calculateTotal();

            //Display the receipt
            register.displayReceipt();

        }
        catch (Exception err)
        {
            System.out.println(err.getMessage());
        }


    }
}
