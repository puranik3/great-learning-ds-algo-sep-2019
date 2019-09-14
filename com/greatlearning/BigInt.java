package com.greatlearning;

public class BigInt {
    LinkedList number;

    public BigInt() {
        number = new LinkedList();
    }

    public BigInt( String s ) {
        number = new LinkedList();

        for( int i = s.length() - 1; i >= 0; i-- ) {
            int digit = Character.getNumericValue( s.charAt( i ) );
            number.push( digit );
        }
    }

    public void print() {
        number.print();
    }
}