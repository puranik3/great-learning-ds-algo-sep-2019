package com.greatlearning;

/**
 * Location
 */
public class Location {
    private int x, y;

    public Location() {
        this.x = -1;
        this.y = -1;
    }

    public Location( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX( int x ) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }

    public void setY( int y ) {
        this.y = y;
    }

    public String toString() {
        return "( " + x + " , " + y + " )";
    }
}