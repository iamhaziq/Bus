import java.util.ArrayList;
import java.util.Date;

class Seat {
    private String[] seatType = new String[30];
    private String[] seatStatus = new String[30];
    private String[] seatPrice = new String[30];
    private String[] seatName = new String[30];
    
    
    public Seat() {
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

        public void reserveSeat(int seatNumber) {
            seatStatus[seatNumber] = "Reserved";
        }
        
    }

    


    
}