package com.greatlearning;

public class BigIntTest {
    public static void main(String[] args) {
        BigInt x = new BigInt( "1234" );
        BigInt y = new BigInt( "5678" );

        x.print();
        y.print();

        BigInt z = x.add( y );
        z.print();
    }
}