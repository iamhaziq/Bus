public class BusTicketReservationSystem {
    public static void main(String[] args) {
        // Create an instance of the Bus class
        Bus bus = new Bus(30);

        // Create an instance of the Reservation class
        Reservation reservation = new Reservation(bus, "John Doe");

        // Example of reserving seats
        reservation.reserveSeat(1);
        reservation.reserveSeat(2);//ngnghf
        reservation.reserveSeat(3);//adding comments

        // Display available seats after reservations
        bus.displayAvailableSeats();
    }
}
