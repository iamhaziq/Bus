class Bus {
    private ArrayList<Seat> seats;

    public Bus(int numSeats) {
        seats = new ArrayList<>();
        for (int i = 1; i <= numSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public boolean reserveSeat(int seatNumber) {
        Seat seat = seats.get(seatNumber - 1);

        if (!seat.isReserved()) {
            seat.reserveSeat();
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is already reserved. Please choose another seat.");
            return false;
        }
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (Seat seat : seats) {
            if (!seat.isReserved()) {
                System.out.println(seat);
            }
        }
    }
}