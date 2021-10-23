/*
 *  UCF COP3330 Fall 2021 Application Assignment 1
 *  Copyright 2021 Patrick Brookshire
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;

public class ListController {

    //Selector for file initialization
    FileChooser fileChooser = new FileChooser();


    public void initialize(URL url, ResourceBundle rb) {
        datePicker.setValue(null);
    }

    //Sets the buttons
    @FXML
    TextField descriptionTextField;
    @FXML
    ListView<Item> itemList;
    @FXML
    Button addButton;
    @FXML
    Button removeButton;
    @FXML
    Button clearButton;
    @FXML
    Button updateButton;
    @FXML
    Button exportButton;
    @FXML
    Button displayCompletedButton;
    @FXML
    Button importButton;
    @FXML
    Button markCompleteButton;
    @FXML
    Button markIncompleteButton;
    @FXML
    Button displayIncompletedButton;
    @FXML
    Button displayAllButton;
    @FXML
    DatePicker datePicker;

    ObservableList<Item> list = FXCollections.observableArrayList();

    public void refresh() {
        //sets values for entry in the list from what was entered
    }

    @FXML
    public void addItem(Event e) {
        //adds items to the list
        //has text, date, and completion status
        //call refresh
    }

    @FXML
    public void removeItem(Event e) {
        //removes values from item on list
        //calls refresh
    }

    @FXML
    public void clearAll(Event e) {
        //clears all values from items
        //calls refresh
    }

    public void listViewSelectedItem() {
        //shows values for listing after being clicked
        //calls refresh
    }

    @FXML
    public void updateItem(Event e) {
        //updates and saves values for item in list
        //calls refresh
    }

    @FXML
    public void exportList(javafx.scene.input.MouseEvent mouseEvent) {
        //export methods for list to csv file type
        //creates file chooser and sets file

        //checks files if null
        //exports values from list
    }

    @FXML
    public void importList(javafx.scene.input.MouseEvent mouseEvent) {
        //import list as csv file type
        //creates file choose and sets files

        //reads file and checks if null
        //checks if file is csv

        //adds values to list from csv
    }

    @FXML
    public void markComplete(Event e) {
        //marks item as complete
        //calls refresh
    }

    @FXML
    public void markIncomplete(Event e) {
        //marks item as incomplete
        //calls refresh
    }

    @FXML
    public void displayComplete(Event e) {
        //displays only completed items
        //calls refresh
    }

    @FXML
    public void displayIncomplete(Event e) {
        //displays only incomplete items
        //calls refresh
    }

    @FXML
    public void displayAll(Event e) {
        //displays only all items
        //calls refresh
    }

}
