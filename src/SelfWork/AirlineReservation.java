package SelfWork;

public class AirlineReservation {
    private Seat [] seats = new Seat[10];
    private  boolean isFirstClassSeatBooked;
    private boolean isEconomySeatBooked;
    public Seat [] getSeats() {
        return seats;
    }

    public int getNumberOfSeats() {
        return 10;
    }

    public void bookSeat(int seatType) {
        if ( seatType != 1 ){
            isFirstClassSeatBooked = false;
        }else {isFirstClassSeatBooked = true;}
        if ( seatType!=2  ){
            isEconomySeatBooked = false;
        }else {isEconomySeatBooked = true;}
    }

    public boolean firstClassSeatIsBooked() {
        return isFirstClassSeatBooked;
    }

    public boolean isEconomySeatBooked() {
        return isEconomySeatBooked;
    }

}
