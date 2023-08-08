// Define the base class Clothing
class Clothing {
    // Protected field to store color
    protected String color;

    // Constructor to initialize color
    public Clothing(String color) {
        this.color = color;
    }

    // Method to display clothing information
    public void displayInfo() {
        System.out.println("Color: " + color);
    }
}

// Define the derived class TShirt
class TShirt extends Clothing {
    // Private field to store size
    private int size;

    // Constructor to initialize color and size
    public TShirt(String color, int size) {
        super(color); // Call to base class constructor
        // Check for invalid size and throw exception if necessary
        if (size <= 1) {
            throw new IllegalArgumentException("Invalid size");
        }
        this.size = size;
    }

    // Method to display TShirt information
    public void displayInfo() {
        super.displayInfo(); // Call to base class method
        System.out.println("Size: " + size);
    }
}

// Main class to demonstrate the program
public class ClothingStore {
    public static void main(String[] args) {
        try {
            // Create instances of TShirt
            TShirt smallTShirt = new TShirt("Red", 2);
            TShirt mediumTShirt = new TShirt("Blue", 3);

            // Display information about the TShirts
            System.out.println("Small T-Shirt:");
            smallTShirt.displayInfo();

            System.out.println("\nMedium T-Shirt:");
            mediumTShirt.displayInfo();

            // Attempt to create a TShirt with an invalid size
            TShirt invalidSizeTShirt = new TShirt("Green", -1);
        } catch (IllegalArgumentException e) {
            // Catching and handling the exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}