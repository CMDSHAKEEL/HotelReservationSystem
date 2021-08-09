package com.bridgelabz;


import org.junit.Test;

// creating HotelReservation Test class
public class HotelReservationTest {

    @Test
    public void givenHotelNameAndRatesShouldReturnTrue() {

       /*
       creating a object of hotelReservation
        */
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add("BridgeWood",160,60);
        hotelReservation.add("LikeWood",110,90);
        hotelReservation.add("RidgeWood",220,150);

    }
}
