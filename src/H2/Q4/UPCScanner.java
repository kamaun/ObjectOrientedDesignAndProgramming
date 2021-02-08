package H2.Q4;

import java.util.*;
import java.lang.*;


/**
 * Class for the UPC Scanner
 */
public class UPCScanner {

    /**
     * Initialize list of scanned items
     */
    public UPCScanner()
    {
        this.isComplete = false;
    }


    /**
     * Gets UPC input from the casher via terminal
     * @return upc integer
     * @throws NumberFormatException throws exception should
     * the user enter a string for the upc number
     */
    public int scanItem() throws NumberFormatException
    {
        Scanner upcInput = new Scanner(System.in);
        System.out.println("Enter product UPC number");

        String upc_input = upcInput.next();
        int upc = Integer.parseInt(upc_input);
        return upc;
    }

    /**
     * Returns true if Cashier
     * @return this.isComplete
     */
    public Boolean isComplete()
    {
        return this.isComplete;
    }

    /**
     * Set isComplete to true.
     * Called when the items are ready to be paid for
     */
    public void setComplete()
    {
        this.isComplete = true;
    }

    private Boolean isComplete;
}
