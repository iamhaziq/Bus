import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bus bus = new Bus();
        int choice;
        int ex = 2;

        do {
            choice = 0;    
            System.out.println("========================================");
            System.out.println("Welcome to Bus Ticket Reservation System");
            System.out.println("========================================");
            System.out.println("1. Display Destinations");
            System.out.println("2. Book your destination");
            System.out.println("========================================");
              
            do {
                try {
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid choice");
                    scanner.nextLine();
                }
            } while (choice < 1 || choice > 2);

            if (choice == 1) {
                bus.displayBuses();
                System.out.println("Display the seats for destination: ");
                int destination = scanner.nextInt();

                if (destination == 1) {
                    System.out.println("Bus 1 - kl to Penang");
                    Bus.displayBus1();
                } else if (destination == 2) {
                    System.out.println("Bus 2 - kl to Johor");
                    Bus.displayBus2();
                } else if (destination == 3) {
                    System.out.println("Bus 3 - kl to Melaka");
                    Bus.displayBus3();
                } else {
                    System.out.println("Invalid choice");
                }
                
                System.out.println();
                System.out.println("Do you want to exit to the main menu? (1. Yes 2. No) : ");
                ex = scanner.nextInt();
                
            } else if (choice == 2) {
                System.out.print("Enter your name: ");
                String name = scanner.next();
                System.out.print("Enter your Id: ");
                String id = scanner.next();
                System.out.println();
                bus.displayBuses();

                System.out.print("Enter your choice: ");
                int busChoice = scanner.nextInt();
                System.out.println();

                if (busChoice == 1) {
                    System.out.println("Bus 1 - kl to Penang");
                    Bus.displayBus1();
                    System.out.print("\nEnter your seat number: ");
                    int seatNumber = scanner.nextInt();
                    Bus.reserveSeatBus1(name, id, seatNumber, busChoice);
                } else if (busChoice == 2) {
                    System.out.println("Bus 2 - kl to Johor");
                    Bus.displayBus2();
                    
                    System.out.print("\nEnter your seat number: ");
                    int seatNumber = scanner.nextInt();
                    Bus.reserveSeatBus2(name, id, seatNumber, busChoice);
                } else if (busChoice == 3) {
                    System.out.println("Bus 3 - kl to Melaka");
                    Bus.displayBus3();
                    System.out.print("\nEnter your seat number: ");
                    int seatNumber = scanner.nextInt();
                    Bus.reserveSeatBus3(name, id, seatNumber, busChoice);
                } else {
                    System.out.println("Invalid choice");
                }

                System.out.println("Do you want to buy another ticket? (1. Yes 2. No) : ");
                ex = scanner.nextInt();

                if (ex == 2) {
                    System.out.println("\nthank you for using our system");
                }

                System.out.println();
            }else{
                System.out.println("Invalid choice");
                ex = 1;
            }
                
            
        } while (ex == 1);
    }

    public static void displayBuses() {
        System.out.println("Buses");
        System.out.println("1. Bus 1 - kl to Penang");
        System.out.println("2. Bus 2 - kl to Johor");
        System.out.println("3. Bus 3 - kl to Melaka");
    }
}
