package Tasks;

public class Task3 {
    public static void main(String[] args) {
        String a = "Hello!";       // string literal
        String b = a;              // same reference as a
        String c = "Hi";           // different content than a
        String d = "Hello!";       // equals b + "!"? adjust below

        // Fix d so that it equals b + "!"
        d = b + "!";               // b + "!" = "Hello!!"

        boolean b1 = a == b;       // true (same reference)
        boolean b2 = d.equals(b + "!"); // true
        boolean b3 = !c.equals(a); // true (Hi != Hello!)

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
