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

                switch(busChoice){
                    case 1:
                        System.out.println("Bus 1 - kl to Penang");
                         Seat seat = new Seat();
                         seat.displaySeating(); 
                        System.out.print("Enter your seat number: ");
                        int seatNumber = scanner.nextInt();
                        seat.reserveSeat(seatNumber);   

                        break;
                    case 2:
                        System.out.println("Bus 2 - kl to Johor");
                        Seat seat2 = new Seat();
                        seat.displaySeating(); 
                        System.out.print("Enter your seat number: ");
                        int seatNumber2 = scanner.nextInt();

                        break;
                    case 3:
                        System.out.println("Bus 3 - kl to Melaka");
                        Seat seat3 = new Seat();
                        seat.displaySeating(); 
                        System.out.print("Enter your seat number: ");

                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            
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
}
    
        

