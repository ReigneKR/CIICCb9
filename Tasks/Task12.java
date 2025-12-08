package Tasks;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    /**
     * Scales the point's coordinates by half,
     * moving it 50% closer to the origin (0,0).
     */
    public void scale() {
        this.x = this.x / 2;
        this.y = this.y / 2;
    }
}

public class Task12 {
    public static void main(String[] args) {
        // Start with (32, 32)
        Point p = new Point(32, 32);
        
        // Loop 5 times to scale the point iteratively
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}