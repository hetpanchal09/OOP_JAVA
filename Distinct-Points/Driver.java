public class Driver {
    public static void main(String[] args) {
        // Create an array of 5 points with 2 repeats (3 distinct points)
        Point[] points = new Point[]{
            new Point(1, 2),    // 1st distinct
            new Point(3, 4),    // 2nd distinct
            new Point(1, 2),    // repeat
            new Point(5, 6),    // 3rd distinct
            new Point(3, 4)     // repeat
        };
        
        // Count distinct points
        int distinctCount = 0;
        
        for (int i = 0; i < points.length; i++) {
            boolean isNew = true;
            // Check if this point equals any previous point
            for (int j = 0; j < i; j++) {
                if (points[i].equals(points[j])) {
                    isNew = false;
                    break;
                }
            }
            if (isNew) {
                distinctCount++;
            }
        }
        
        System.out.println("Distinct: " + distinctCount);
    }
}
