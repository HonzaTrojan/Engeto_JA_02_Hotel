package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Guest {

    String firstName = "";
    String surname = "";
    LocalDate born = LocalDate.MIN;


    /// region Getters and setters
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBorn() {
        return born;
    }
    public void setBorn(LocalDate born) {
        this.born = born;
    }
    /// endregion


    /// region Constructors
    public Guest (String firstName, String surname, LocalDate born){
        this.firstName = firstName;
        this.surname = surname;
        this.born = born;
    }


    /// endregion

    public void getDescription() {
        System.out.println(firstName + " " + surname + " " + born);
    }




}
