package H1.Q2;

/**
 * Class for producings a somple greeting
 */
public class Greeter {

    /**
     * Explicit constructor
     * @param aName -  contian the name of a person being greeted
     */
    public Greeter(String aName){
        this.name = aName;
    }

    /**
     * Function that greets the user
     * @return returns a concatenated string saying hello to the user
     */
    public String sayHello(){
        return "Hello, " + name + "!";
    }

    /**
     * Question 2.a
     * Write a new method for the Greeter class,
     * hat swaps the names of this greeter and another instance.
     * @param other Object of type Greeter with the new name
     */
    public void swapNames(Greeter other) throws NullPointerException
    {
        this.name = other.name;
    }

    /**
     * Question 2.b
     * write a new method for the Greeter class:
     *    	public Greeter createQualifiedGreeter(String qualifier) { ..... }
     * that returns a new Greeter object with its name being the qualifier string followed by
     * " " and the executing greeter's name (i.e. this.name).
     *
     * For example:
     * 	Greeter g = new Greeter("world");
     * 	Greeter g2 = g.createQualifiedGreeter("beautiful");
     * 	g2.name will be the string "beautiful world"
     *
     * @param qualifier pass qualifier string
     * @return object of type greeter with the qualifier
     */
    public Greeter createQualifiedGreeter(String qualifier) {
        Greeter newGreeter = new Greeter(qualifier + " " + this.name);
        return newGreeter;
    }



    private String name;
}
