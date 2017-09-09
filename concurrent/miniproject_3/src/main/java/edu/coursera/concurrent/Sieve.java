package edu.coursera.concurrent;

/**
 * An abstract class that exposes a single countPrimes interface for testing.
 */
public interface Sieve {
    /**
     * Counts the number of prime numbers <= the provided limit using the Sieve
     * of Eratosthenes.
     *
     * @param limit Only find primes less than or equal to this limit.
     * @return The number of primes that are <= limit.
     */
    public abstract int countPrimes(final int limit);

    public default void echo(String message){
        System.out.println(message);
    }
}