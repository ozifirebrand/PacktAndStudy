package SelfWork;

public class AirlineReservation {
    private final Seat seats = new Seat();
    private  boolean isFirstClassSeatBooked;
    private boolean isEconomySeatBooked;
    private int seatNumber =0;
    public Seat  getSeats() {
        return seats;
    }

    public int getNumberOfSeats() {
        return 10;
    }

    public void bookSeat(int seatType) {
        increaseSeatNumber();
        if ( seatType==1 ) bookFirstClassSeat(seatType);
        if ( seatType == 2 ) bookEconomySeat(seatType);
    }

    private void increaseSeatNumber() {
        seatNumber +=1;
    }

    //todo REFACTOR THESE METHODS

    private void bookFirstClassSeat(int seatType) {
        boolean seatIsGreaterThan0 = seatNumber > 0;
        boolean seatIsLesserThan6 = seatNumber < 6;
        if ( seatIsGreaterThan0 && seatIsLesserThan6 )
        isFirstClassSeatBooked= seatType == 1;
    }

    private void bookEconomySeat(int seatType) {
        isEconomySeatBooked = seatType==2;
    }

    public boolean firstClassSeatIsBooked() {
        return isFirstClassSeatBooked;
    }

    public boolean economySeatIsBooked() {
        return isEconomySeatBooked;
    }

}
