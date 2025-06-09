import java.util.Scanner;
/**
 * GavinsBruce_Application.java
 *
 * Bruce Gavins
 * MSI-5030
 * Assignment 5.2
 * Polymorphism
 *
 * This is the driver class that demonstrates polymorphism by creating
 * and managing Point, Circle, and Cylinder objects.
 */
public class GavinsBruce_Application {
    /**
     * The main method that runs the application
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store 9 objects (3 points, 3 circles, 3 cylinders)
        GavinsBruce_Point[] objects = new GavinsBruce_Point[9];
        
        try {
            // Display clear instructions for input
            System.out.println("Please enter data for 3 sets of objects (points, circles, and cylinders).");
            System.out.println("Enter each line in the format: x y radius height");
            System.out.println("Line 1:");
            
            // First line
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            double r1 = scanner.nextDouble();
            double h1 = scanner.nextDouble();
            
            System.out.println("Line 2:");
            // Second line
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            double r2 = scanner.nextDouble();
            double h2 = scanner.nextDouble();
            
            System.out.println("Line 3:");
            // Third line
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();
            double r3 = scanner.nextDouble();
            double h3 = scanner.nextDouble();
            
            // Create the objects
            objects[0] = new GavinsBruce_Point(x1, y1);
            objects[1] = new GavinsBruce_Point(x2, y2);
            objects[2] = new GavinsBruce_Point(x3, y3);
            
            objects[3] = new GavinsBruce_Circle(x1, y1, r1);
            objects[4] = new GavinsBruce_Circle(x2, y2, r2);
            objects[5] = new GavinsBruce_Circle(x3, y3, r3);
            
            objects[6] = new GavinsBruce_Cylinder(x1, y1, r1, h1);
            objects[7] = new GavinsBruce_Cylinder(x2, y2, r2, h2);
            objects[8] = new GavinsBruce_Cylinder(x3, y3, r3, h3);
            
            // Print descriptions of all objects using polymorphism
            System.out.println("\nDescriptions of all objects:");
            for (GavinsBruce_Point obj : objects) {
                System.out.println(obj);
            }
        } catch (Exception e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
            System.out.println("Please ensure you enter data in the correct format: x y radius height");
        } finally {
            scanner.close();
        }
    }
}
