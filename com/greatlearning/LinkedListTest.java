package com.greatlearning;

public class LinkedListTest {
    private static LinkedList primesList;
    public static void main(String[] args) {
        testUnshift();
        testShift();
    }

    private static void createNewList() {
        primesList = new LinkedList();
    }

    private static void testUnshift() {
        createNewList();

        primesList.unshift( 2 );
        primesList.unshift( 3 );
        primesList.unshift( 5 );
        primesList.unshift( 7 );

        primesList.print();
    }

    private static void testShift() {
        System.out.println( "*** testing unshift ***" );
        createNewList();

        primesList.unshift( 2 );
        primesList.unshift( 3 );
        primesList.unshift( 5 );

        // remove something
        primesList.shift();

        primesList.print();
    }
}