public class MultiplicationTableCompact {
    
    public void generateAndPrintTable(int size) {
        System.out.println("Multiplication Table " + size + "x" + size);
        System.out.println("=======================" + "=".repeat(String.valueOf(size).length() * 2));
        
        // Print header
        System.out.print("   │");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        
        // Print separator
        System.out.print("───┼");
        for (int i = 0; i < size; i++) {
            System.out.print("────");
        }
        System.out.println();
        
        // Print table
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d │", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        MultiplicationTableCompact table = new MultiplicationTableCompact();
        table.generateAndPrintTable(10);
    }
}