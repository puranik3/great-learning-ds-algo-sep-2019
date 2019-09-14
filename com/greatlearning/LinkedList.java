package com.greatlearning;

public class LinkedList {
    private static class Node {
        Integer data;
        Node next;

        public Node( Integer data ) {
            this.data = data;
            this.next = null;
        }

        public Node( Integer data, Node next ) {
            this.data = data;
            this.next = next;
        }
    }
}