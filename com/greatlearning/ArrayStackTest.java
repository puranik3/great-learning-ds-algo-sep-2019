package com.greatlearning;

public class ArrayStackTest {
    private static ArrayStack<Integer> primesStack;

    public static void main(String[] args) {
        testPush();
    }

    private static void createStack() {
        primesStack = new ArrayStack<Integer>();

        primesStack.push( 2 );
        primesStack.push( 3 );
        primesStack.push( 5 );
        primesStack.push( 7 );
    }

    private static void testPush() {
        createStack();

        primesStack.push( 11 );
        primesStack.push( 13 );
        primesStack.push( 17 );

        System.out.println( primesStack );
    }

    private static void testPop() {
        // write your code here...
    }
    
    private static void testPeek() {
        // write your code here...
    }
    
    private static void testSize() {
        // write your code here...
    }
}