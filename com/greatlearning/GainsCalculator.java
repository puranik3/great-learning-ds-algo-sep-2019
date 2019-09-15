package com.greatlearning;

public class GainsCalculator {
    private static ArrayQueue buy = new ArrayQueue(), sell = new ArrayQueue();

    public static void main(String[] args) {
        buy.enqueue( new Transaction( 30, 100.00, "Sep 15 2018" ) ); 
        buy.enqueue( new Transaction( 100, 90.00, "Jan 15 2019" ) ); 
        
        sell.enqueue( new Transaction( 70, 130.00, "Mar 15 2019" ) ); 
        sell.enqueue( new Transaction( 60, 150.00, "Jun 15 2019" ) );

        printGains();
    }

    private static void printGains() {
        // calculate and print gains when shares are sold
    }
}