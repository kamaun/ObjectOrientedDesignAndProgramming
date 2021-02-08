package H2.Q4;

import java.util.*;
import java.lang.*;

/**
 * Cash register class
 */
public class RegisterSystem {

    /**
     * Initialize Product list
     * Calls inventory function and display inventory function
     */
    public RegisterSystem()
    {
        this.inventory = new ArrayList<Product>();
        this.scannedProducts = new ArrayList<Product>();
        generateInventory();
        displayInventory();
    }

    /**
     * Create a list of inventory items
     */
    private void generateInventory() {
        //default products
        Product eggs = new Product(101, "eggs", 3.99);
        Product milk = new Product(102, "milk", 4.99);
        Product bread = new Product(103, "bread", 7.99);
        Product cheese = new Product(104, "cheese", 1.99);
        Product chips = new Product(105, "chips", 5.99);
        Product banana = new Product(106, "banana", 10.99);
        Product mango = new Product(107, "mango", 0.99);
        Product cabbage = new Product(108, "cabbage", 2.99);
        Product pencil = new Product(109, "pencil", 21.99);

        //add products to inventory list
        this.inventory.add(eggs);
        this.inventory.add(milk);
        this.inventory.add(bread);
        this.inventory.add(cheese);
        this.inventory.add(chips);
        this.inventory.add(banana);
        this.inventory.add(mango);
        this.inventory.add(cabbage);
        this.inventory.add(pencil);
    }

    /**
     *Display a list of available product in the inventory in details
     */
    private void displayInventory()
    {

        System.out.println("Here's a list of our current Inventory:\n");
        System.out.println("\tUPC\tProduct\tUnit Price");

        //loop through the whole inventory
        for (Product prod : this.inventory)
        {
            System.out.print("\t" + prod.getUPC());
            System.out.print("\t" + prod.getName());
            System.out.println("\t$" + prod.getUnit_price());
        }
        System.out.println();
    }

    /**
     * Display details of an individually scanned item
     * @param upc get UPC number from the scanner class
     */
    public void getProductDetails(Integer upc)
    {
        //true if the upc number exists in the inventory
        boolean itemFound = false;

        /*
        Loop through the inventory and to match the UPC number
        If found break from the loop
         */
        for (Product prod : this.inventory) {
            if (prod.getUPC().equals(upc))
            {
                System.out.print("Product: '" + prod.getName() + "', ");
                System.out.print("UPC: " + prod.getUPC() + ", ");
                System.out.println("Unit Price: $" + prod.getUnit_price() + "\n");
                itemFound = true;
                this.scannedProducts.add(prod);
                break;
            }
        }
        if(!itemFound) throw new IllegalArgumentException("UPC item not found in inventory");
    }

    /**
     * Get the sum of all the items scanned
     */
    public void calculateTotal()
    {
        this.currentTotal = 0.00;
        for (Product prod : this.scannedProducts)
        {
            this.currentTotal += prod.getUnit_price();
        }
    }


    /**
     * Display list of scanned items along with the total price
     */
    public void displayReceipt()
    {
        System.out.println("\nHere's your receipt\n");
        System.out.println("\tUPC\tProduct\tUnit Price");

        //loop through the scanned product
        for (Product prod : this.scannedProducts)
        {
            System.out.print("\t" + prod.getUPC());
            System.out.print("\t" + prod.getName());
            System.out.println("\t$" + prod.getUnit_price());
        }

        System.out.println("\n\tTotal: $" + this.currentTotal);
    }

    private ArrayList<Product> inventory;
    private ArrayList<Product> scannedProducts;
    private Double currentTotal;
}
