package H1.Q5;

import java.util.*;

/**
 * Write a program that computes the prime factorization of a positive integer number. The number in question is
 * computed as the product of prime numbers raised to various exponents. The prime factorization problem is
 * finding the primes and their exponents.
 * For instance, number 72 is the product 72 = 2^3*3^2 and 60 = 2^2*3*5, where ^ is the power (exponentiation)
 * operator; ^ has higher precedence than multiplication.
 */
public class PrimeFactorizer {

    /**
     * Initialize the object with target number n.
     */
    public PrimeFactorizer(int n) {
        this.targetNum = n;
        this.computeCalled = false;
        this.currentPrime = 2;
    }

    /**
     * Return n, the target number.
     */
    public int getN() {
        return this.targetNum;
    }

    /**
     * Compute factorization. Do not repeat operation if it was called before.
     */
    public void compute() {
        if(computeCalled)return;

        int tempNum = this.targetNum;
        int expon = 0;
        for(int i = this.currentPrime; i < this.targetNum; i++ ){

            while(tempNum % this.currentPrime == 0){
                tempNum = tempNum / this.currentPrime;
                expon++;
            }

        }

        computeCalled = true;
    }

    /**
     * Return the factors and exponents in two arraylists. Call compute() first, if necessary.
     * For instance, if n=60, primes=[2,3,5], and exponents=[2,1,1].
     * This function overwrites the 'n' parameter passed to the constructor.
     */
    public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents) {
    }


    /**
     * Return a string with the "pretty" representation of the prime factorization.
     * For instance, if n is 60, then toString() for the PrimeFactorizer(60) object
     * should be "60 = 2^2*3*5". Call compute() if not done before.
     */
    public String toString() {
        return " ";
    }

    // other code, helper functions, etc.
    private int targetNum;
    private boolean computeCalled;
    private int currentPrime;
    private ArrayList<Integer> factorsList;
    private ArrayList<Integer> exponentsList;
}
