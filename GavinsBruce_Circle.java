/**
 * GavinsBruce_Circle.java
 *
 * Bruce Gavins
 * MSI-5030
 * Assignment 5.2
 * Polymorphism
 *
 * This class represents a circle with a center point and radius.
 * It extends the Point class.
 */
public class GavinsBruce_Circle extends GavinsBruce_Point {
    //Private instance variable for the radius of the circle
    private double radius;

    /**
     * Constructor that initializes the circle with the given coordinates of the radius
     * parameter 1 is the x-coordinate of the center point
     * parameter 2 is the y-coordinate of the center point
     * parameter 3 is the radius of the circle
     */
    public GavinsBruce_Circle(int x, int y, double radius) {
	//Calls the constructor of the parent class, Point
	super(x, y);

	//Initializes radius and validates that it is not negative
	if(radius < 0) {
	    System.out.println("Error: Radius cannot be negative");
	    this.radius = 0.0;
	} else {
	    this.radius = radius;
	}
    }

    /**
     * Accessor method to get the radius
     * returns the radius value
     */
    public double getRadius() {
	return radius;
    }

    /**
     * Mutator method to set the new radius value
     * parameter the new radius value
     */
    public void setRadius(double radius) {
	if(radius < 0) {
	    System.out.println("Error: Radius cannot be negative");
	} else {
	    this.radius = radius;
	}
    }

    /**
     * Method to calculate the area of the circle
     * returns the area of the circle
     */
    public double getArea() {
	return Math.PI * radius * radius;
    }

    /**
     * uses toString to provide a string representation of the circle
     * returns string with circles center coordinates, radius, and area
     */
    //Overrides main class toString method, so it can be modified
    public String toString() {
	//Calls parent class toString to get point information
	return super.toString() + ", Radius: " + radius + ", Area: " + getArea();
    }
}
			      
   
