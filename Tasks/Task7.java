package Tasks;
import java.util.Scanner;

public class Task7 {

    static double add(double a, double b){ return a + b; }
        static double sub(double a, double b){ return a - b; }
            static double mul(double a, double b){ return a * b; }
                static double div(double a, double b){ return a / b; }

                    public static void main(String[] args) {
                            try (Scanner s = new Scanner(System.in)) {
                                        System.out.print("Enter first number: ");
                                                    double x = s.nextDouble();
                                                                System.out.print("Enter second number: ");
                                                                            double y = s.nextDouble();

                                                                                        System.out.println("Add: " + add(x,y));
                                                                                                    System.out.println("Sub: " + sub(x,y));
                                                                                                                System.out.println("Mul: " + mul(x,y));
                                                                                                                            System.out.println("Div: " + (y != 0 ? div(x,y) : "Cannot divide by zero"));
                                                                                                                                    }
                                                                                                                                        }
                                                                                                                                        }

                                                                                                                                        