import java.util.ArrayList;
import java.util.Date;

class Seat {
    private int seatNumber;
    private boolean isReserved;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isReserved = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserveSeat() {
        isReserved = true;
    }

    @Override
    public String toString() {
        return "Seat " + seatNumber + " (" + (seatNumber % 3 == 2 ? "Double" : "Single") + ")";
    }
}