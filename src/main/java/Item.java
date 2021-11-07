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

        String isComplete;
        if(getComplete().equals(true)) {
            isComplete = "completed";
        } else {
            isComplete = "incomplete";
        }

        return (this.getDate() + "\t" + this.getDescription() + " - " + isComplete);
    }


    public void setDescription(String description) {
        //Sets description for : string
        this.description = description;
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

        String temp;
        if(getComplete().equals(true)) {
            temp = "completed";
        } else {
            temp = "incomplete";
        }

        return temp;
    }

    //variables for item : listing in to do list
    private String description;
    private LocalDate date;
    private Boolean complete;

    //constructor for item : listing in to do list
    public Item(String description, LocalDate date, Boolean complete) {
        this.description = description;
        this.date = date;
        this.complete = complete;
    }


    public String getDescription() {
        return description;
    }
    //getter for description of listing
}
