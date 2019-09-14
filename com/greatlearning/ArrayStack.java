package com.greatlearning;

public class ArrayStack<T> implements Stack<T> {
    final private static int MAX_SIZE = 100;
    T[] stack = (T[]) new Object[MAX_SIZE];
    int head = 0;

    public void push( T data ) {
        if( head == MAX_SIZE ) {
            throw new IllegalStateException( "stack is full" );
        }

        stack[head] = data;
        ++head;
    }

    public T pop() {
        if( head == 0 ) {
            throw new IllegalStateException( "stack is empty" );
        }

        --head;
        return stack[head];
    }

    public T peek() {
        return stack[head - 1];
    }

    public int size() {
        return head;
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();

        for( int i = 0; i < head; i++ ) {
            buf.insert( 0, stack[i] );

            if( i != head - 1 ) {
                buf.insert( 0, "," );
            } else {
                buf.insert( 0, "HEAD -> " );
            }
        }

        return buf.toString();
    }
}