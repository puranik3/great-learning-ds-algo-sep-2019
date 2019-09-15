package com.greatlearning;

public class Transaction {
    int numShares;
    Double price;
    String date;

    public Transaction( int numShares, Double price, String date ) {
        this.numShares = numShares;
        this.price = price;
        this.date = date;
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public int getNumShares() {
        return this.numShares;
    }

    public String getDate() {
        return this.date;
    }

    public void reduceNumShares( int numToReduceBy ) {
        if( this.numShares - numToReduceBy < 0 ) {
            throw new IllegalStateException( "cannot reduce by amount that exceeds number of shares" );
        }

        this.numShares = this.numShares - numToReduceBy;
    }
}