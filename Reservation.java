class Reservation {
    private Bus bus;
    private String passengerName;
    private Date reservationDate;

    public Reservation(Bus bus, String passengerName) {
        this.bus = bus;
        this.passengerName = passengerName;
        this.reservationDate = new Date();
    }

    public void reserveSeat(int seatNumber) {
        if (bus.reserveSeat(seatNumber)) {
            System.out.println("Seat reserved successfully for " + passengerName + " on " + reservationDate);
        }
    }
}
