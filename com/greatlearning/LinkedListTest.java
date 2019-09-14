package com.greatlearning;

public class LinkedListTest {
    private static LinkedList primesList;
    public static void main(String[] args) {
        testUnshift();
        testShift();
        testPush();
    }

    private static void createNewList() {
        primesList = new LinkedList();

        primesList.unshift( 2 );
        primesList.unshift( 3 );
        primesList.unshift( 5 );
        primesList.unshift( 7 );
    }

    private static void testUnshift() {
        createNewList();

        primesList.print();
    }

    private static void testShift() {
        System.out.println( "*** testing unshift ***" );
        createNewList();

        // remove something
        primesList.shift();

        primesList.print();
    }

    private static void testPush() {
        System.out.println( "*** testing push ***" );
        createNewList();

        primesList.push( 11 );
        primesList.print();
    }
}