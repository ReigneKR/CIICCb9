package Tasks;


public class Task8 {

    /**
     * Calculates the triangular sum for each argument and returns 
     * the total sum of all those triangular sums.
     * * @param numbers Variable arguments of integers
     * @return The grand total sum
     */
    public static int sumTriangular(int... numbers) {
        int totalSum = 0;

        System.out.println("Processing Cumulative Sums:");
        for (int num : numbers) {
            int currentCumulative = 0;
            
            // Calculate sum from 1 to num
            for (int i = 1; i <= num; i++) {
                currentCumulative += i;
            }
            
            System.out.println("Value: " + num + " -> Cumulative Sum: " + currentCumulative);
            totalSum += currentCumulative;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // Example case: (4, 5, 10)
        // 4 -> 1+2+3+4 = 10
        // 5 -> 1+2+3+4+5 = 15
        // 10 -> 1+2+...+10 = 55
        // Total expected: 10 + 15 + 55 = 80
        
        int result = sumTriangular(4, 5, 10);
        
        System.out.println("----------------------------");
        System.out.println("Total Grand Sum: " + result);
    }
}