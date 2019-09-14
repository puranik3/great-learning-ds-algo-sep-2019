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

    public void push( Integer data ) {
        // add a new node to the end of the linked list
        Node last = head;

        for( Node cur = head.next; cur != null; cur = cur.next ) {
            last = cur;
        }

        last.next = new Node( data );
    }

    public void pop() {
        // remove the last node of the list
        Node last = head;
        
        for( Node cur = head.next; cur.next != null; cur = cur.next ) {
            last = cur;
        }

        last.next = null;
    }

    public LinkedList add( LinkedList y ) {
        LinkedList x = this;
        LinkedList z = new LinkedList();

        int carry = 0, sum = 0;

        for( Node curX = x.head.next, curY = y.head.next; curX != null || curY != null || carry != 0; ) {
            sum = carry;

            if( curX != null ) {
                sum = sum + curX.data;
                curX = curX.next;
            } 
            
            if( curY != null ) {
                sum = sum + curY.data;
                curY = curY.next;
            }

            carry = sum / 10;
            z.push( sum % 10 );
        }

        return z;
    }
}