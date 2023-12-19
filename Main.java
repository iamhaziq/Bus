import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();

        System.out.println("========================================");
        System.out.println("Welcome to Bus Ticket Reservation System");
        System.out.println("========================================");
        System.out.println("1. Display Destinations");
        System.out.println("2. Book your destination");
        System.out.println("3. Exit");
        System.out.println("========================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bus.displayBuses();
                System.out.println("display the seats for destination: ");
                int destination = scanner.nextInt();
                if (destination >= 1 && destination <= 3) {
                    Seat seat = new Seat();
                    seat.displaySeating();
                } else {
                    System.out.println("Invalid choice");
                }
                break;
            case 2:
                System.out.print("Enter your name: ");
                String name = scanner.next();
                System.out.print("Enter your Id: ");
                String id = scanner.next();
                System.out.println();
                bus.displayBuses();

                Object answer;
                
                    System.out.print("Enter your choice: ");
                    int busChoice = scanner.nextInt();

                    // break;
                    if (busChoice == 1) {
                        System.out.println("Bus 1 - kl to Penang");
                        Seat seat = new Seat();
                        seat.displaySeating();
                        System.out.print("Enter your seat number: ");
                        int seatNumber = scanner.nextInt();
                        seat.reserveSeat(seatNumber);

                    } else if (busChoice == 2) {
                        System.out.println("Bus 2 - kl to Johor");
                        Seat seat = new Seat();
                        seat.displaySeating();
                        System.out.print("Enter your seat number: ");
                        int seatNumber = scanner.nextInt();
                        seat.reserveSeat(seatNumber);

                    } else if (busChoice == 3) {
                        System.out.println("Bus 3 - kl to Melaka");
                        Seat seat = new Seat();
                        seat.displaySeating();
                        System.out.print("Enter your seat number: ");
                        int seatNumber = scanner.nextInt();
                        seat.reserveSeat(seatNumber);
                    } else {
                        System.out.println("Invalid choice");
                    }

                    Seat seat = new Seat();
                    int seatNumber = scanner.nextInt();

                    if (seat.seatType[seatNumber].equals("Single")) {
                        System.out.println("Single seat");
                        System.out.println("Price: RM" + seat.seatPrice[seatNumber]);
                    } else if (seat.seatType[seatNumber].equals("Double Aisle")) {
                        System.out.println("Double Aisle seat");
                        System.out.println("Price: RM" + seat.seatPrice[seatNumber]);
                    } else if (seat.seatType[seatNumber].equals("Double Window")) {
                        System.out.println("Double Window seat");
                        System.out.println("Price: RM" + seat.seatPrice[seatNumber]);
                    } else {
                        System.out.println("Invalid choice");
                    }

                    System.out.println("========================================");
                    System.out.println("Ticket");
                    System.out.println("========================================");
                    System.out.println();
                    System.out.println("Name: " + name);
                    System.out.println("Id: " + id);
                    System.out.println("Seat Number: " + seatNumber);
                    System.out.println("Seat Type: " + seat.seatType[seatNumber]);
                    System.out.println("total price: RM" + seat.seatPrice[seatNumber]);
                    System.out.println("========================================");



            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}       

