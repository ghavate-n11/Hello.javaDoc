/**
 * This is the Hello class, demonstrating JavaDoc usage.
 * It includes methods for greeting, addition, and displaying information.
 * 
 * @author Nilesh Ghavate
 * @version 1.1
 * @since 2025-03-08
 */
public class Hello {

    /**
     * Default constructor for the Hello class.
     * Initializes the Hello object.
     */
    public Hello() {
        // Default constructor
    }

    /**
     * Prints a welcome message.
     */
    public void greet() {
        System.out.println("Hello, welcome to JavaDoc!");
    }

    /**
     * Adds two numbers and returns the sum.
     * 
     * @param a The first number
     * @param b The second number
     * @return The sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Displays information about the author.
     * 
     * @return A string containing the author's name and version
     */
    public String getAuthorInfo() {
        return "Author: Nilesh Ghavate, Version: 1.1";
    }

    /**
     * The main method to execute the program.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.greet();
        
        int sum = hello.add(10, 20);
        System.out.println("Sum: " + sum);
        
        System.out.println(hello.getAuthorInfo());
    }
}
