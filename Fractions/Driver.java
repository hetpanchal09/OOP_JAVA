public class Driver {
    public static void main(String[] args) {
        // Create equivalent fractions
        Fraction frac1 = new Fraction(1, 2);
        Fraction frac2 = new Fraction(2, 4);
        Fraction frac3 = new Fraction(3, 6);
        
        // Print each fraction (should all print "1/2")
        System.out.println("Fraction 1: " + frac1);
        System.out.println("Fraction 2: " + frac2);
        System.out.println("Fraction 3: " + frac3);
        
        // Confirm they are all equal
        System.out.println("\nEquality checks:");
        System.out.println("frac1.equals(frac2): " + frac1.equals(frac2));
        System.out.println("frac2.equals(frac3): " + frac2.equals(frac3));
        System.out.println("frac1.equals(frac3): " + frac1.equals(frac3));
    }
}
