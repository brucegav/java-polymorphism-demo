/**
 * GavinsBruce_Point.java
 *
 * Bruce Gavins
 * MSI-5030
 * Assignment 5.2
 * Polymorphism
 *
 * This class represents a point with x and y coordinates
 */
public class GavinsBruce_Point {
    //Private instance variables for the x and y coordinates
    private int x;
    private int y;

    /**
     * Constructor that initializes the point with the given coordinates
     * parameter 1 the x-coordinate
     * parameter 2 the y-coordinate
     */
    public GavinsBruce_Point(int x, int y) {
	this.x = x;
	this.y = y;
    }

    /**
     * Accessor method to get the x-coordinate
     * returns the x-coordinate
     */
    public int getX() {
	return x;
    }

    /**
     * Accessor method to get the y-coordinate
     * returns the y-coordinate
     */
    public int getY() {
	return y;
    }

    /**
     * Mutator method to set the x-coordinate
     * parameter the new x-coordinate value
     */
    public void setX(int x) {
	this.x = x;
    }

    /**
     * Mutator method to set the y-coordinate
     * parameter the new y-coordinate value
     */
    public void setY(int y) {
	this.y = y;
    }

    /**
     * toString method to create a string representation of the new point
     * returns a string with the point's new coordinates
     */
    public String toString() {
	return "Point at (" + x + ", " + y + ")";
    }
}
