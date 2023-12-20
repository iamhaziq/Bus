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
                    if (destination >= 1 && destination <= 3) {
                        Seat seat = new Seat();
                        seat.displaySeating();
                        System.out.println("\n\n# is available");
                        System.out.println("* is unavailable");
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
            

            System.out.println("single seats starts with '0' and increments with 3");
            System.out.println("aisle double seat starts with '1' and increments with 3");
            System.out.println("Window double seat starts with '2' and increments with 3");
            System.out.print("Enter your choice: ");
                        int busChoice = scanner.nextInt();
                    

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


                        // if (seat.seatType[seatNumber].equals("Single")) {
                        //     System.out.println("Single seat");
                        //     System.out.println("Price: RM" + seat.seatPrice[seatNumber]);
                        // } else if (seat.seatType[seatNumber].equals("Double Aisle")) {
                        //     System.out.println("Double Aisle seat");
                        //     System.out.println("Price: RM" + seat.seatPrice[seatNumber]);
                        // } else if (seat.seatType[seatNumber].equals("Double Window")) {
                        //     System.out.println("Double Window seat");
                        //     System.out.println("Price: RM" + seat.seatPrice[seatNumber]);
                        // } else {
                        //     System.out.println("Invalid choice");
                        // }

                        // System.out.println("========================================");
                        // System.out.println("Ticket");
                        // System.out.println("========================================");
                        // System.out.println();
                        // System.out.println("Name: " + name);
                        // System.out.println("Id: " + id);
                        // System.out.println("Seat Number: " + seatNumber);
                        // System.out.println("Seat Type: " + seat.seatType[seatNumber]);
                        // System.out.println("total price: RM" + seat.seatPrice[seatNumber]);
                        // System.out.println("========================================");

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

