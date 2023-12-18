// Haziq Mushtaq 2224071

import java.util.ArrayList;
import java.util.Date;

class Seat {
    private String[] seatType = new String[30];
    private String[] seatStatus = new String[30];
    private String[] seatPrice = new String[30];
    private String[] seatName = new String[30];
    
    
    public Seat() {  // Haziq Mushtaq 2224071
        for(int i = 0; i < 30; i = i + 3) {
            seatType[i] = "Single";
            seatStatus[i] = "Available";
            seatPrice[i] = "50";
            seatName[i] = "Seat " + i ;
        }
        for(int i = 1; i < 30; i = i + 3) {
            seatType[i] = "Double Aisle";
            seatStatus[i] = "Available";
            seatPrice[i] = "30";
            seatName[i] = "Seat " + i ;
        }
        for (int i = 2; i < 30; i = i + 3) {
            seatType[i] = "Double Window";
            seatStatus[i] = "Available";
            seatPrice[i] = "40";
            seatName[i] = "Seat " + i ;
        }

        
    }
    public void reserveSeat(int seatNumber) {  // Haziq Mushtaq 2224071
            seatStatus[seatNumber] = "Reserved";
        }
    public void displayAvailableSeats() { // Haziq Mushtaq 2224071
        System.out.println("Available Seats:");
        for (int i = 0; i < 30; i++) {
            if (seatStatus[i] == "Available") {
                System.out.println(seatName[i] + " " + seatType[i] + " " + seatPrice[i]);
            }
        }
    }
    public void displaySeating(){
        System.out.println("Bus");
            if(seatStatus[0].equals("Available")){
                System.out.println("# ");
            }
            for(int i = 1; i < 30; i++){
                if(i%3 == 0){
                    System.out.println("");
                    if (seatStatus[i].equals("Available")){
                        System.out.println("#  ");
                    }else{
                        System.out.println("*  ");
                }
                }
                if (seatStatus[i].equals("Available")){
                    System.out.println("# ");
                }else{
                    System.out.println("* ");
                }
                
            }

        
    }
        

    


    
}