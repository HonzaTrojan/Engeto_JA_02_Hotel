package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfRooms {
    List<Room> roomList = new ArrayList<>();

    public void addRoom(Room room){
        roomList.add(room);
    }

    public void removeRoom(Room room){
        roomList.remove(room);
    }

    public int numberOfRooms(){
        return roomList.size();
    }
    public void printRooms(){
        for (Room room : roomList){
            System.out.println("Room no.: " + room.numberOfRoom + ", number of bets: "
                    + room.numberOfBets + ", balcony available: " + room.isBalcony +
                    ", sea view: " + room.isSea + ", price per night: " + room.roomPricePerNight
                    + "Kč / night");
        }
    }

}
