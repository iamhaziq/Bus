import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();

        System.out.println("========================================");
        System.out.println("Welcome to Bus Ticket Reservation System"); // dsjfkdsjf
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
                
                
                break;
            case 2:

            System.out.print("Enter your name: ");
                String name = scanner.next();
                System.out.print("Enter your Id: ");
                String id = scanner.next();
                System.out.println();
                bus.displayBuses();
                System.out.print("Enter your choice: ");
                int busChoice = scanner.nextInt();
                System.out.println();
                
                 
                break;
            case 3:
                 System.exit(0);
                break;

            case 4:
                   
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
