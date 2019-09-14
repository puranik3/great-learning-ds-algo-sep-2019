package com.greatlearning;

public class ArrayStackTest {
    private static ArrayStack<Integer> primesStack;

    public static void main(String[] args) {
        testPush();
        testPop();
        testPeek();
        testSize();
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
        createStack();

        System.out.println( primesStack.pop() );
        System.out.println( primesStack );
    }
    
    private static void testPeek() {
        createStack();

        System.out.println( primesStack.peek() );
        System.out.println( primesStack );
    }
    
    private static void testSize() {
        createStack();

        System.out.println( primesStack.size() );
    }
}