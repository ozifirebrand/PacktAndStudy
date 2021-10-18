package SelfWork;

public class AirlineReservation {
    private final Seat[] seats = new Seat[10];
    private int seatNumber = 0;
    private boolean isFirstClass;


    public Seat[] getSeats() {
        return seats;
    }

    public int getNumberOfSeats() {
        return seats.length;
    }

    public void bookSeat(int seatType) {
        seatNumber += 1;
        Seat seat = new Seat();
        seats[seatNumber - 1] = seat;
    }

    public boolean isItFirstClassSeat(int seatType) {
        if ( seatNumber < 6 )
            isFirstClass = true;
        return isFirstClass;
    }

    public Seat[] getReserveSeat() {
        return seats;
    }
}
