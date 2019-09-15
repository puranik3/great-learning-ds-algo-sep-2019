package com.greatlearning;

public interface Queue {
    public void enqueue( Object data );
    public Object dequeue();
    public Object peek();
    public int size();
}