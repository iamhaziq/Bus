// Haziq Mushtaq 2224071

import java.util.ArrayList;
import java.util.Date;

class Seat  {
    public String[] seatType = new String[30];
    private String[] seatStatus = new String[30];
    public String[] seatPrice = new String[30];
    private String[] seatName = new String[30];

    public Seat() {
        for (int i = 0; i < 30; i = i + 3) {
            seatType[i] = "Single";
            seatStatus[i] = "Available";
            seatPrice[i] = "50";
            seatName[i] = "Seat " + i;
        }
        for (int i = 1; i < 30; i = i + 3) {
            seatType[i] = "Double Aisle";
            seatStatus[i] = "Available";
            seatPrice[i] = "30";
            seatName[i] = "Seat " + i;
        }
        for (int i = 2; i < 30; i = i + 3) {
            seatType[i] = "Double Window";
            seatStatus[i] = "Available";
            seatPrice[i] = "40";
            seatName[i] = "Seat " + i;
        }
    }

    private void printReciept(String name, String id, int seatNumber, int busChoice) {
        Date date = new Date();
        System.out.println("");
        System.out.println("========================================");
        System.out.println("Ticket");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Date: " + date.toString());
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Bus: " + busChoice);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + seatPrice[seatNumber]);
    }

    public void reserveSeat(String name, String id, int seatNumber, int busChoice) {
        seatStatus[seatNumber] = "Reserved";
        printReciept(name, id, seatNumber, busChoice);
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (int i = 0; i < 30; i++) {
            if (seatStatus[i].equals("Available")) {
                System.out.println(seatName[i] + " " + seatType[i] + " " + seatPrice[i]);
            }
        }
    }

    public void displaySeating() {
        System.out.println("Bus");
        if (seatStatus[0].equals("Available")) {
            System.out.print("#  ");
        }
        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0) {
                System.out.println("");
                if (seatStatus[i].equals("Available")) {
                    System.out.print("#  ");
                } else {
                    System.out.print("*  ");
                }
            } else {
                if (seatStatus[i].equals("Available")) {
                    System.out.print("# ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }

    public void displaySeatNumber() {
        System.out.println("Bus");
        System.out.print("0  ");
        for (int i = 1; i < 30; i++) {
            if (i % 3 == 0) {
                System.out.println("");
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}