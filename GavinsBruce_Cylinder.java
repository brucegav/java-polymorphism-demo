/**
 * GavinsBruce_Cylinder.java
 *
 * Bruce Gavins
 * MSI-5030
 * Assignment 5.2
 * Polymorphism
 *
 * This class represents a cylinder with a circle as its base and a height
 * It extends the Circle class
 */
public class GavinsBruce_Cylinder extends GavinsBruce_Circle {
    //Private instance variable for height
    private double height;

    /**
     * Constructor that initializes the cylinder with given coordinates, radius, and height
     * parameter 1 x-coordinate of the center of the base
     * parameter 2 y-coordinate of the center of the base
     * parameter 3 the radius of the base
     * parameter 4 the height of the cylinder
     */
    public GavinsBruce_Cylinder(int x, int y, double radius, double height) {
	//Calls the constructor of the Circle class(parent)
	super(x, y, radius);
	this.height = height;
    }

    /**
     * Accessor method to get the height
     * returns height value of the cylinder
     */
    public double getHeight() {
	return height;
    }

    /**
     * Mutator method to set new height
     * parameter height of the new cylinder
     */
    public void setHeight(double height) {
	this.height = height;
    }

    /**
     * Method to calculate the volume of the cylinder
     * returns the volume of the cylinder
     */
    public double getVolume() {
	//Volume = base area * height
	return getArea() * height;
    }

    /**
     * Returns a string representation of the cylinder
     * returns a string with the cylinder's base coordinates, radius, height, and volume
     */
    @Override
    public String toString() {
	//Calls parent class's toString to get the circles dimensions/values
	return super.toString() + ", Height: " + height + ", Volume: " + getVolume();
    }
}
