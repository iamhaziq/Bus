import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("Welcome to Bus Ticket Reservation System");
        System.out.println("========================================");
        System.out.println("1. Reserve a seat");
        System.out.println("2. Display available seats");
        System.out.println("3. Exit");
        System.out.println("========================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter your name: ");
                String name = scanner.next();
                System.out.print("Enter number of seats to reserve: ");
                int numberOfSeats = scanner.nextInt();
                System.out.print("Enter seat numbers to reserve: ");
                int[] seatNumbers = new int[numberOfSeats];
                for (int i = 0; i < numberOfSeats; i++) {
                    seatNumbers[i] = scanner.nextInt();
                }
                Bus bus = new Bus(30);
                Reservation reservation = new Reservation(bus, name);
                for (int i = 0; i < numberOfSeats; i++) {
                    reservation.reserveSeat(seatNumbers[i]);
                }
                break;
            case 2:
                Bus bus1 = new Bus(30);
                bus1.displayAvailableSeats();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
