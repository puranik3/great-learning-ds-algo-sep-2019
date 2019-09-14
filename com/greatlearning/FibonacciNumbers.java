package com.greatlearning;

public class FibonacciNumbers {
    public static void main(String[] args) {
        BigInt x = new BigInt( "0" );
        BigInt y = new BigInt( "1" );
        BigInt z = null;

        x.print();
        y.print();

        for( int i = 3; i <= 100; i++ ) {
            z = x.add( y );
            x = y;
            y = z;

            System.out.println( "***" + i + "***" );
            z.print();
        }
    }
}