package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

public class ListOfGuests {

    /*
    creating a database of guests
     */
    List<Guest> listOfGuests = new ArrayList<>();

    /// region Methods

    public void addGuest(Guest guest){
        listOfGuests.add(guest);
    }
    public void removeGuest(Guest guest){
        listOfGuests.remove(guest);
    }
    public int amountOfGuests(){
        return listOfGuests.size();
    }

    public void printListOfGuests(){
        for (Guest guest : listOfGuests){
            System.out.println("Name and surname: " + guest.firstName + " " + guest.surname
                    + ", born: " + guest.born);

        }
    }


    /// endregion
}
