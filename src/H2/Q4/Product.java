package H2.Q4;

import java.lang.*;

/**
 * Class product details
 */
public class Product {

    /**
     *Constructor initializes product details
     */
    public Product(Integer upc, String name, Double price)
    {
        this.name = name;
        this.unit_price = price;
        this.UPC = upc;
    }

    /**
     * Get UPC number value
     * @return this.UPC
     */
    public Integer getUPC()
    {
        return this.UPC;
    }

    /**
     * Function that gets the product name
     * @return this.name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Function that get the unit price
     * @return this.unit_price
     */
    public Double getUnit_price()
    {
        return this.unit_price;
    }

    private Integer UPC;
    private String name;
    private Double unit_price;
}
