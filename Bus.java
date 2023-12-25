class Bus {
        private static Seat Bus1 = new Seat("Penang");
        private static Seat Bus2 = new Seat("Johor");
        private static Seat Bus3 = new Seat("Melaka");

    public Bus(){
        
    }
    
    public static void displayBus1(){
        //System.out.println("Bus 1");
        Bus1.displaySeating();
    }
    public static void displayBus2(){
        //System.out.println("Bus 2");
        Bus2.displaySeating();
    }
    public static void displayBus3(){
        //System.out.println("Bus 3");
        Bus3.displaySeating();
    }
    public static void reserveSeatBus1(String name, String id, int seatNumber, int busChoice){
        Bus1.reserveSeat(id, name, seatNumber, busChoice);
    }
    public static void reserveSeatBus2(String name, String id, int seatNumber, int busChoice){
        Bus2.reserveSeat(id, name, seatNumber, busChoice);
    }
    public static void reserveSeatBus3(String name, String id, int seatNumber, int busChoice){
        Bus3.reserveSeat(id, name, seatNumber, busChoice);
    }

    
    public void displayBuses(){
        System.out.println("Buses");
        System.out.println("1. Bus 1 - kl to "+ Bus1.getDestination() );
        System.out.println("2. Bus 2 - kl to " + Bus2.getDestination() );
        System.out.println("3. Bus 3 - kl to " + Bus3.getDestination());
    }

}