package com.engeto.hotel;

import java.time.LocalDate;

public class Booking {

    Guest guest;
    Guest guest1;
    LocalDate dateOfArrival;
    LocalDate dateOfLeaving;
    boolean isWorkingStay;
    Room room;
    TypeOfStay typeOfStay;

    /// region Getters and setters
    public Guest getGuest(){
        return guest;
    }
    public void setGuest(Guest guest){
        this.guest = guest;
    }

//    public Guest getGuest1() {
//        return guest1;
//    }
//
//    public void setGuest1(Guest guest1) {
//        this.guest1 = guest1;
//    }

    public LocalDate getDateOfArrival() {
        return dateOfArrival;
    }
    public void setDateOfArrival(LocalDate dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public LocalDate getDateOfLeaving() {
        return dateOfLeaving;
    }
    public void setDateOfLeaving(LocalDate dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }

    public boolean isWorkingStay() {
        return isWorkingStay;
    }
    public void setWorkingStay(boolean workingStay) {
        isWorkingStay = workingStay;
    }

    public Room getRoom(){
        return room;
    }
    public void setRoom(Room room){
        this.room = room;
    }

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
    }
    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }

    /// endregion


    /// region Constructors
    public Booking(Guest guest, LocalDate dateOfArrival, LocalDate dateOfLeaving,
                   boolean isWorkingStay, Room room, TypeOfStay typeOfStay){
        this.guest = guest;
        this.dateOfArrival = dateOfArrival;
        this.dateOfLeaving = dateOfLeaving;
        this.isWorkingStay = isWorkingStay;
        this.room = room;
        this.typeOfStay = typeOfStay;
    }

    public Booking(Guest guest, LocalDate dateOfArrival, LocalDate dateOfLeaving,
                   Room room, TypeOfStay typeOfStay){
        this.guest = guest;
        this.dateOfArrival = dateOfArrival;
        this.dateOfLeaving = dateOfLeaving;
        this.room = room;
        this.typeOfStay = typeOfStay;

    }
    /*
    * Constructor with automatic lenght of vacation
    */

 public Booking(Guest guest, TypeOfStay typeOfStay, LocalDate dateOfArrival,
                   Room room){
        this.guest = guest;
        this.typeOfStay = typeOfStay;
        this.dateOfArrival = dateOfArrival;
        if (typeOfStay == TypeOfStay.VACATION){
            this.dateOfLeaving = dateOfArrival.plusDays(6);
        }
        this.room = room;
        }

    public Booking(Guest guest, Guest guest1, LocalDate dateOfArrival, LocalDate dateOfLeaving,
                   Room room, TypeOfStay typeOfStay){
        this.guest = guest;
        this.guest1 = guest1;
        this.dateOfArrival = dateOfArrival;
        this.dateOfLeaving = dateOfLeaving;
        this.room = room;
        this.typeOfStay = typeOfStay;
    }

//    public Booking(Guest guest, Guest guest1, LocalDate dateOfArrival, LocalDate dateOfLeaving, Room room){
//        this.guest = guest;
//        this.guest1 = guest1;
//        this.dateOfArrival = dateOfArrival;
//        this.dateOfLeaving = dateOfLeaving;
//    }



    /// endregion





}
