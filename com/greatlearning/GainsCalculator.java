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
        Transaction sellTransaction, buyTransaction;
        int buyNumShares, sellNumShares, minNumShares;
        Double gains = 0.0;

        // calculate and print gains when shares are sold
        while( sell.peek() != null ) {
            sellTransaction = (Transaction) sell.peek();
            buyTransaction = (Transaction) buy.peek();

            buyNumShares = buyTransaction.getNumShares();
            sellNumShares = sellTransaction.getNumShares();

            minNumShares = Math.min( buyNumShares, sellNumShares );

            if( buyTransaction.getNumShares() == 0 ) {
                buy.dequeue();
            }

            if( sellTransaction.getNumShares() == 0 ) {
                sell.dequeue();

                gains = gains + ( sellTransaction.getPrice() - buyTransaction.getPrice() ) * minNumShares;

                System.out.println( "gains on " + sellTransaction.getDate() + " = " + gains );
                gains = 0.0;
            }
        }
    }
}