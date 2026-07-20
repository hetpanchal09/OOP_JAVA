public class CinemaShow {
    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked = 0;

    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    public CinemaShow(String title) {
        this(title, 100);
    }

    public boolean book(int n) {
        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        return false;
    }

    public void cancel(int n) {
        if (n > 0) {
            seatsAvailable += n;
            if (seatsAvailable > capacity) {
                seatsAvailable = capacity;
            }
        }
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static int getTotalBooked() {
        return totalBooked;
    }

    public static void main(String[] args) {
        CinemaShow show = new CinemaShow("Interstellar", 5);

        System.out.println("book(3): " + show.book(3) + ", seats: " + show.getSeatsAvailable());
        System.out.println("book(4): " + show.book(4) + ", seats: " + show.getSeatsAvailable());

        show.cancel(2);
        System.out.println("after cancel(2), seats: " + show.getSeatsAvailable());

        System.out.println("book(2): " + show.book(2) + ", seats: " + show.getSeatsAvailable());
        System.out.println("book(1): " + show.book(1) + ", seats: " + show.getSeatsAvailable());
        System.out.println("book(3): " + show.book(3) + ", seats: " + show.getSeatsAvailable());

        System.out.println("Total booked: " + CinemaShow.getTotalBooked());
    }
}
