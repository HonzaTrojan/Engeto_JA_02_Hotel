package com.engeto.hotel;

public class Room {

    int numberOfRoom = 0;
    int numberOfBets = 0;
    boolean isBalcony = false;
    boolean isSea = false;
    int roomPricePerNight = 0;

    /// region Getters and Setters
    public int getNumberOfRoom(){
        return numberOfRoom;
    }
    public void setNumberOfRoom(int numberOfRoom){
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBets() {
        return numberOfBets;
    }
    public void setNumberOfBets(int numberOfBets) {
        this.numberOfBets = numberOfBets;
    }

    public boolean isBalcony() {
        return isBalcony;
    }
    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSea() {
        return isSea;
    }
    public void setSea(boolean sea) {
        isSea = sea;
    }

    public int getRoomPricePerNight() {
        return roomPricePerNight;
    }
    public void setRoomPricePerNight(int roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    /// endregion

    /// region Constructors
    public Room (int numberOfRoom, int numberOfBets, boolean isBalcony,
                 boolean isSea, int roomPricePerNight){
        this.numberOfRoom = numberOfRoom;
        this.numberOfBets = numberOfBets;
        this.isBalcony = isBalcony;
        this.isSea = isSea;
        this.roomPricePerNight =roomPricePerNight;
    }


    /// endregion




}
