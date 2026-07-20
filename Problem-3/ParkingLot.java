public class ParkingLot {
    private int twoWheelers;
    private int fourWheelers;
    private final int twoCap = 3;
    private final int fourCap = 2;
    private static long revenue = 0;

    public void park(String type) {
        if ("two".equalsIgnoreCase(type)) {
            if (twoWheelers < twoCap) {
                twoWheelers++;
                revenue += 20;
                System.out.println("Parked a two-wheeler.");
            } else {
                System.out.println("Full");
            }
        } else if ("four".equalsIgnoreCase(type)) {
            if (fourWheelers < fourCap) {
                fourWheelers++;
                revenue += 40;
                System.out.println("Parked a four-wheeler.");
            } else {
                System.out.println("Full");
            }
        } else {
            System.out.println("Invalid vehicle type.");
        }
    }

    public void leave(String type) {
        if ("two".equalsIgnoreCase(type)) {
            if (twoWheelers > 0) {
                twoWheelers--;
                System.out.println("Left a two-wheeler.");
            } else {
                System.out.println("No two-wheeler to leave.");
            }
        } else if ("four".equalsIgnoreCase(type)) {
            if (fourWheelers > 0) {
                fourWheelers--;
                System.out.println("Left a four-wheeler.");
            } else {
                System.out.println("No four-wheeler to leave.");
            }
        } else {
            System.out.println("Invalid vehicle type.");
        }
    }

    public void printStatus() {
        System.out.println("Final occupancy: twoWheelers=" + twoWheelers + ", fourWheelers=" + fourWheelers);
        System.out.println("Revenue=" + revenue);
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        System.out.println("Event 1: park(two)");
        lot.park("two");

        System.out.println("Event 2: park(four)");
        lot.park("four");

        System.out.println("Event 3: park(two)");
        lot.park("two");

        System.out.println("Event 4: park(four)");
        lot.park("four");

        System.out.println("Event 5: park(two)");
        lot.park("two");

        System.out.println("Event 6: park(two)");
        lot.park("two");

        System.out.println("Event 7: leave(four)");
        lot.leave("four");

        System.out.println("Event 8: park(four)");
        lot.park("four");

        System.out.println("Event 9: leave(two)");
        lot.leave("two");

        lot.printStatus();
    }
}
