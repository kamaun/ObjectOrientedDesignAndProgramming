package H1.Q2;

public class GreaterTester {

    public static void main(String[] args)
    {
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);

        // Swap the name from another Greeter object
        System.out.println("\nSwapping names...");
        System.out.println("Original:\t" + worldGreeter.sayHello());

        Greeter jitGreeter = new Greeter("Jit");
        worldGreeter.swapNames(jitGreeter);

        System.out.println("Result:\t" + worldGreeter.sayHello());


        //Modifying greeter object by adding a qualifier
        System.out.println("\nAdding qualifier...");
        System.out.println("Original:\t" + worldGreeter.sayHello());
        Greeter qualifiedGreeter = worldGreeter.createQualifiedGreeter("wonderful");
        System.out.println("Result:\t" + qualifiedGreeter.sayHello());

    }
}
