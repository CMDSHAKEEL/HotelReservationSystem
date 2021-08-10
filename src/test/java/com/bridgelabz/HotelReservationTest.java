package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

// creating HotelReservation Test class

public class HotelReservationTest {

    @Test
    public void givenHotelNameAndRatesShouldReturnTrue() {
       /*
       creating a object of hotelReservation
        */
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add("BridgeWood", 160, 60);
        hotelReservation.add("LikeWood", 110, 90);
        hotelReservation.add("RidgeWood", 220, 150);

    }

    @Test
    public void givenHotelNameAndRatesShouldReturnFalse() {
       /*
       creating a object of hotelReservation
        */
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add("BridgeWood", 160, 60);
        hotelReservation.add("LikeWood", 110, 90);
        hotelReservation.add("RidgeWood", 220, 150);


        Assert.assertEquals(160,HotelReservation.listOfHotels.get("BridgeWood").getRateRegularCustomer());
        Assert.assertEquals(60,HotelReservation.listOfHotels.get("BridgeWood").getRateRegularWeekend());
        Assert.assertEquals(110,HotelReservation.listOfHotels.get("LikeWood").getRateRegularCustomer());
        Assert.assertEquals(90,HotelReservation.listOfHotels.get("LikeWood").getRateRegularWeekend());
        Assert.assertEquals(220,HotelReservation.listOfHotels.get("RidgeWood").getRateRegularCustomer());
        Assert.assertEquals(150,HotelReservation.listOfHotels.get("RidgeWood").getRateRegularWeekend());

    }
    @Test
    public void givenDatesShouldReturnCheapestHotel() throws ParseException {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add("BridgeWood",160,60);
        hotelReservation.add("LikeWood",100,90);
        hotelReservation.add("RidgeWood",220,150);
        String cheapestHotel = hotelReservation.findCheapestHotel("10sep2020", "11sep2020");
        Assert.assertEquals("LikeWood",cheapestHotel);

    }
    //creating weekdays and weekrates method

    @Test
    public void givenWeekDaysAndWeekendRatesShouldReturnTrue() {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.add("BridgeWood",160,60);
        hotelReservation.add("LikeWood",110,90);
        hotelReservation.add("RidgeWood",220,150);
        Assert.assertEquals(160,HotelReservation.listOfHotels.get("BridgeWood").getRateRegularCustomer());
        Assert.assertEquals(60,HotelReservation.listOfHotels.get("BridgeWood").getRateRegularWeekend());
        Assert.assertEquals(110,HotelReservation.listOfHotels.get("LikeWood").getRateRegularCustomer());
        Assert.assertEquals(90,HotelReservation.listOfHotels.get("LikeWood").getRateRegularWeekend());
        Assert.assertEquals(220,HotelReservation.listOfHotels.get("RidgeWood").getRateRegularCustomer());
        Assert.assertEquals(150,HotelReservation.listOfHotels.get("RidgeWood").getRateRegularWeekend());

    }
}
