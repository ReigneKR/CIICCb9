package Tasks;

import static java.lang.Math.*;

public class Task9 {

    // Addition using Math.addExact
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction using Math.subtractExact
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication using Math.multiplyExact
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division using Math.floorDiv
    public static int divide(int a, int b) {
        // floorDiv returns an int, so we cast to float as per method signature
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 5;

        System.out.println("Math Operations demonstrating Static Imports:");
        System.out.println("--------------------------------------------");
        
        System.out.println("Addition (" + x + " + " + y + "): " + add(x, y));
        System.out.println("Subtraction (" + x + " - " + y + "): " + subtract(x, y));
        System.out.println("Multiplication (" + x + " * " + y + "): " + multiply(x, y));
        System.out.println("Division (" + x + " / " + y + "): " + divide(x, y));

        // Example showing overflow protection (uncomment to see exception)
        // System.out.println("Overflow Example: " + add(Integer.MAX_VALUE, 1));
    }
}