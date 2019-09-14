package com.greatlearning;

public class LinkedListTest {
    private static LinkedList primesList;
    public static void main(String[] args) {
        testUnshift();
    }

    private static void createNewList() {
        primesList = new LinkedList();
    }

    private static void testUnshift() {
        primesList.unshift( 2 );
        primesList.unshift( 3 );
        primesList.unshift( 5 );
        primesList.unshift( 7 );

        
    }
}