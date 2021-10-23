/*
 *  UCF COP3330 Fall 2021 Application Assignment 1
 *  Copyright 2021 Patrick Brookshire
 */

import java.time.LocalDate;

public class Item {

    @Override
    public String toString(){
        //Sets status of listing
        //If / Else statements to check if list is complete or not
        return null;
    }


    public void setDescription(String description) {
        //Sets description for : string
        this.description = null;
    }
    public LocalDate getDate() {
        return date;
    }
    //getter date for listing

    public void setDate(LocalDate date) {
        this.date = date;
    }
    //setter for date for listing

    public Boolean getComplete() {
        return complete;
    }
    //getter for complete status of listing

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
    //setter for complete status of listing

    public String getCompletedBoolean(Boolean complete) {
        //checks status of complete variable
        // returns value as string
        return null;
    }

    //variables for item : listing in to do list
    private String description;
    private LocalDate date;
    private Boolean complete;

    //constructor for item : listing in to do list
    public Item(String description, LocalDate date, Boolean complete) {
        this.description = null;
        this.date = null;
        this.complete = null;
    }


    public String getDescription() {
        return null;
    }
    //getter for description of listing
}
