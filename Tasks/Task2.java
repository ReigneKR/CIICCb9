package Tasks;

public class Task2 {
    public static void main(String[] args) {
        // Primitives with different values
        byte b = 3;          // small integer
        short s = 1;         // small integer
        int i = 1;           // integer
        float f = 2.0f;      // floating-point number
        char h = 'H';        // character
        boolean bool = true; // boolean

        // Concatenating primitives into a string
        String output = "" + h + i + i + s + s + " w" + b + "r" + i + "d " + f + " " + bool;

        // Print the result
        System.out.println(output);
    }
}
