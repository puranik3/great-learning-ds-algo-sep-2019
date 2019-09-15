package com.greatlearning;

public class ArrayQueue implements Queue {
    final private int MAX_SIZE = 100;
    Object[] queue = new Object[MAX_SIZE];
    int tail = -1; // tail refers to index of last element (right now there are no elements, hence -1)

    public void enqueue( Object data ) {
        // add data end of array

        // queue is full
        if( tail == MAX_SIZE - 1 ) {
            throw new IllegalStateException( "queue is full" );
        }

        ++tail;
        queue[tail] = data;
        return;
    }

    public Object dequeue() {
        // remove data from beginning of array

        if( tail == -1 ) {
            throw new IllegalStateException( "queue is empty" );
        }

        --tail;
        Object elementToDequeue = queue[0];

        // shift elements
        for( int i = 0; i <= tail; i++ ) {
            queue[i] = queue[i + 1];
        }

        return elementToDequeue;
    }

    public Object peek() {
        // return the element at the beginning of the array
        
        if( tail == -1 ) {
            return null;
        }

        return queue[0];
    }

    public int size() {
        // return the size of the LL

        return tail + 1;
    }

    public void print() {
        for( int i = 0; i <= tail; i++ ) {
            System.out.print( queue[i] + "  " );
        }
        System.out.println();
    }
}