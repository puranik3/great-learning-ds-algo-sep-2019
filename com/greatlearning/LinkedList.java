package com.greatlearning;

public class LinkedList {
    private static class Node {
        Integer data;
        Node next;

        public Node( Integer data ) {
            this( data, null );
        }

        public Node( Integer data, Node next ) {
            this.data = data;
            this.next = next;
        }
    }

    Node head = new Node( 0 );

    // unshift adds a new Node to the beginning of the linked list
    public void unshift( Integer data ) {
        // Node newNode = new Node( data );
        // Node temp = head.next;
        // head.next = newNode;
        // newNode.next = temp;

        head.next = new Node( data, head.next );
    }

    public void print() {
        for( Node cur = head.next; cur != null; cur = cur.next ) {
            System.out.println( cur.data );
        }
    }

    public void shift() {
        if( head.next == null ) {
            return;
        }

        Node temp = head.next;
        head.next = temp.next;
    }
}