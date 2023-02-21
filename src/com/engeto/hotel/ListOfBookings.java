package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
        List<Booking> bookingList = new ArrayList<>();

        public void addReservation(Booking booking){
            bookingList.add(booking);
        }

        public void removeReservation(Booking removeBooking){
            bookingList.remove(removeBooking);
        }

        public int amountOfBookings(){
            return bookingList.size();
        }

        public void printListOfBookings(){
            for (Booking booking : bookingList){
                System.out.println("Name of Guest: " + booking.guest.firstName + " "
                        + booking.guest.surname + ", room no." + booking.room.numberOfRoom + ", date of arrival: "
                        + booking.dateOfArrival + ", date of leaving: " + booking.dateOfLeaving
                        + ", price per night: " + booking.room.roomPricePerNight + "Kč / night");
            }
        }



}
