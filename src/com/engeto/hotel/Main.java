package com.engeto.hotel;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

    Room room1 = new Room(1, 1, true, true, 1000);
    Room room2 = new Room(2, 1, true, true, 1000);
    Room room3 = new Room(3, 3, false, true, 2400);

    Guest guest1 = new Guest("Adéla", "Malíková",
            LocalDate.of(1993,3,13));
    Guest guest2 = new Guest("Jan", "Dvořáček",
            LocalDate.of(1995, 5,5));
    Guest guest3 = new Guest("Tomáš", "Krpálek",
            LocalDate.of(1955, 7,29));

    ListOfGuests listOfGuests = new ListOfGuests();
    listOfGuests.addGuest(guest1);
    listOfGuests.addGuest(guest2);
    listOfGuests.addGuest(guest3);
    listOfGuests.printListOfGuests();

    ListOfRooms listOfRooms = new ListOfRooms();
    listOfRooms.addRoom(room1);
    listOfRooms.addRoom(room2);
    listOfRooms.addRoom(room3);
    listOfRooms.printRooms();

    ListOfBookings listOfBookings = new ListOfBookings();

    listOfBookings.addReservation(new Booking(guest1, LocalDate.of(2021, 7, 19),
            LocalDate.of(2021, 7, 26), room1, TypeOfStay.WORK));
    listOfBookings.addReservation(new Booking(guest1, guest2, LocalDate.of(2021, 9, 1),
            LocalDate.of(2021, 9, 14), room3, TypeOfStay.VACATION));
    listOfBookings.addReservation(new Booking(guest1, LocalDate.of(2022, 1, 1),
            LocalDate.of(2022, 1, 15), room2, TypeOfStay.WORK));
    listOfBookings.addReservation(new Booking(guest3, LocalDate.of(2022, 1, 1),
            LocalDate.of(2022, 1, 15), room3, TypeOfStay.VACATION));
    listOfBookings.addReservation(new Booking(guest3, TypeOfStay.VACATION,                          // booking with automatic lenght of vacation
            LocalDate.of(2023, 4, 5), room2));


        listOfBookings.printListOfBookings();

    guest1.getDescription();
    guest2.getDescription();
    guest3.getDescription();

    // možnost přímo v zadávání vytvořit nového hosta
//    listOfBookings.addReservation(new Booking(new Guest("Franta", "Vomáčka",
//            LocalDate.of(1999, 1, 1)), LocalDate.of(2023, 10, 1),
//            LocalDate.of(2023, 10, 17), false, room1));
//    listOfBookings.addReservation(new Booking(new Guest("Kateřina", "Vomáčková",
//            LocalDate.of(2005, 9, 15)), LocalDate.of(2023, 10, 1),
//            LocalDate.of(2023, 10, 17), false, room1));
//    listOfBookings.addReservation(new Booking(new Guest("Tomáš", "Krpálek",
//            LocalDate.of(1955, 12, 5)), LocalDate.of(2023, 10, 17),
//            LocalDate.of(2023, 10, 20), true, room2));






    }
}