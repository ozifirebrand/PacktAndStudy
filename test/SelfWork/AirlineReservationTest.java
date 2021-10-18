package SelfWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* TODO: 10/10/2021 There is an airline company that has 10 seats. The system can assign seats except when seat is occupied
todo The seats are grouped into first class and economy class seats. 1 -5 for first class and 6 - 10 for economy. When first
todo is filled, assign economy for the individual. If the individual refuses, tell them to wait for the next flight by 3pm
 */
public class AirlineReservationTest {
    public AirlineReservation reservation;
    @BeforeEach
    void setUp(){
         reservation = new AirlineReservation();
    }

    @Test
    @DisplayName("Test that airline has seats")
    void testThatAirlineHasSeats(){
        assertNotNull(reservation.getSeats());
    }

    @Test
    @DisplayName("Test that airline has 10 seats")
    void testThatAirlineHas10Seats(){
        assertEquals(10, reservation.getNumberOfSeats());
    }

    @Test
    @DisplayName("Test that seat can be reserved")
    public void testThatSeatCanBeReserved(){
        reservation.bookSeat(1);
        assertNotNull(reservation.getReserveSeat()[0]);
    }

}