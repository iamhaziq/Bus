import java.util.Scanner;

public class Main {
   
        public static void main(String[] args) {
            Bus bus = new Bus();
            int exitSystem = 0;

            do{
        System.out.println();        
        System.out.println("========================================");
        System.out.println("Welcome to Bus Ticket Reservation System");
        System.out.println("========================================");
        System.out.println("1. Display Destinations");
        System.out.println("2. Book your destination");
        System.out.println("3. Exit");
        System.out.println("4. Exit System");
        System.out.println("========================================");
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

      switch (choice) {//Rafiqi Razak 2224155
                case 1:
                    bus.displayBuses();
                    System.out.println("Display the seats for destination: ");
                    int destination = scanner.nextInt();

                    if( destination == 1 ){
                        System.out.println("Bus 1 - kl to Penang");
                        Bus.displayBus1();
                    }
                    else if( destination == 2 ){
                        System.out.println("Bus 2 - kl to Johor");
                        Bus.displayBus2();
                    }
                    else if( destination == 3 ){
                        System.out.println("Bus 3 - kl to Melaka");
                        Bus.displayBus3();
                    }
                    else{
                        System.out.println("Invalid choice");

                    }
                    if (destination >= 1 && destination <= 3) {
                       
                        
                        System.out.println("\n\n# is available");
                        System.out.println("* is unavailable");
                    } 
                    else {
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
            

            System.out.print("Enter your choice: ");
                        int busChoice = scanner.nextInt();
            System.out.println();        

                        // break;
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

                case 3:
                    System.exit(0);
                    break;
                case 4:
                    exitSystem = 1;

                default:
                    System.out.println("Invalid choice");
                    break;
      }
            }
        }while(exitSystem == 0);
    }
}   

