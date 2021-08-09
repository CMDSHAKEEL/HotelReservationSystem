package com.bridgelabz;
//importing HashMap

import java.util.HashMap;

// creating a class of HotelReservation

public class HotelReservation {
    public static HashMap<String,Hotel> listOfHotels = new HashMap<>();

// creation main method

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System");

    }

    public void add(String hotelName, int rateRegular, int regularWeekend) {
        Hotel hotel = new Hotel(hotelName,rateRegular,regularWeekend);
        listOfHotels.put(hotelName,hotel);
    }
}
