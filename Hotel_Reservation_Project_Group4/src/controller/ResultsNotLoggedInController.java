/**
 * Hotel Reservation Project
 * UTSA CS 3773-002 - Fall 2021
 * Team 4: Andres De La Rosa, Jackson Raymond, Jalyn Merritt, Aden Rojas, Christa Baca 
 */

package controller;

import application.Main;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.util.Callback;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.DateCell;
import javafx.scene.input.*;

/**
 * ResultsNotLoggedInController is a class that handles events that occur when the user
 * interacts with results_not_loggedin.fxml
 * 
 * @author Christa Baca
 */
public class ResultsNotLoggedInController implements Initializable{
	// Buttons
	@FXML
	private Button button; // Search Button
	
	// Labels
	@FXML
	private Label label1; // Find the best hotels at the best price, here
	
	// HyperLinks
	@FXML
	private Hyperlink hyperlink1; // Nomad+, links to home_page
	
	@FXML
	private Hyperlink hyperlink2; // login
	
	@FXML
	private Hyperlink hyperlink3; // signup
	
	// MenuButtons
	@FXML
	private MenuButton menubutton; // Amenities
	
	// ComboBoxes
	@FXML
	private ComboBox<String> combobox1; // Number of Rooms
	
	@FXML
	private ComboBox<String> combobox2; // # of Guests (Adults)
	
	@FXML
	private ComboBox<String> combobox22; // Price Ranges
	
	@FXML
	private ComboBox<String> combobox21; // Types of Rooms / Beds
	
	// DatePickers 
	@FXML
	private DatePicker datepicker1; // Check-in
	
	@FXML
	private DatePicker datepicker2;	//check-out
	
	//@FXML
	//private ScrollPane scrollpane;
	
	// List of items for ComboBoxes (prices and rooms)
	ObservableList<String> list1 = FXCollections.observableArrayList("1 Room", "2 Rooms", "3 Rooms", "4 Rooms", "5 Rooms", "6 Rooms", "7 Rooms");
	ObservableList<String> list2 = FXCollections.observableArrayList("Low", "Mid", "High");
	ObservableList<String> list3 = FXCollections.observableArrayList("1 - 2 Guests", "3 Guests", "4 Guests", "5 Guests", "6+ Guests");
	ObservableList<String> list4 = FXCollections.observableArrayList("1 King", "1 Queen", "2 King", "2 Queen", "Suites");

	// Static variables to set style for button when mouse is away/hovering
	private static String normal_button_style = "-fx-background-color: white; -fx-background-radius: 20";
	private static String hovered_button_style = "-fx-background-color: #d3d3d3; -fx-background-radius: 20;";
	
	/**
	 * Initializes items for Number of Rooms and Price Range ComboBoxes
	 * 
	 * @param location  location properties for controller and FXMLLoader
	 * @param resources  resources for controller and FXMLLoader
	 */
	@Override
	public void initialize( URL location, ResourceBundle resources ) {
		// Sets list items for ComboBoxes
		combobox1.setItems(list1);
		combobox22.setItems(list4);
		combobox2.setItems(list3);
		combobox21.setItems(list2);
		
		// Normal button style set to white
	    button.setStyle(normal_button_style);
	    
	    // Changes to hovered button style, set to a light grey
	    button.setOnMouseEntered(e -> button.setStyle(hovered_button_style));
	    
	    // Changes back to normal button style when mouse stops hovering
	    button.setOnMouseExited(e -> button.setStyle(normal_button_style));
	}

	/**
	 * Handles event in which user wants to login
	 * 
	 * @param event  event in which user clicks Login HyperLink
	 * @throws IOException  if a file is unable to be read
	 */
	@FXML
	public void handleLogin(ActionEvent event) throws IOException {
		// Loads the FXML document for login_screen and displays it
		Parent root = FXMLLoader.load(getClass().getResource("/application/login_screen.fxml"));
		Stage window = (Stage)button.getScene().getWindow();
		window.setScene(new Scene (root));
		window.setMaximized(true);
		
	}
	
	/**
	 * Handles event in which user wants to sign in
	 * 
	 * @param event  event in which user clicks signup HyperLink
	 * @throws IOException  if a file is unable to be read
	 */
	@FXML
	public void handleSignUp(ActionEvent event) throws IOException {
		// Loads the FXML document for signup_screen and displays it
		Parent root = FXMLLoader.load(getClass().getResource("/application/signup_screen.fxml"));
		Stage window = (Stage)button.getScene().getWindow();
		window.setScene(new Scene (root));
		window.setMaximized(true);
		
	}
	
	/**
	 * Handles event in which user clicks to search hotels
	 * 
	 * @param event  event in which user clicks SEARCH button
	 * @throws IOException  if a file is unable to be read
	 */
	@FXML
	public void handleSearch(ActionEvent event) throws IOException {
		// Loads the FXML document for search results and displays it
		Parent root = FXMLLoader.load(getClass().getResource("/application/results_not_loggedin.fxml"));
		Stage window = (Stage)button.getScene().getWindow();
		window.setScene(new Scene (root));
		window.setMaximized(true);
		
	}
	
	/**
	 * Changes view to the first HOME PAGE after link is clicked
	 * 
	 * @param event	 event in which user clicks on the Nomad+ hyperlink
	 * @throws IOException	if a file is unable to be read
	 */
	
	@FXML
	public void handleBackToHomePage( ActionEvent event ) throws IOException {
		// Loads the FXML document for home_page and displays it
		Parent root = FXMLLoader.load(getClass().getResource("/application/home_page.fxml"));
		Stage window = (Stage)button.getScene().getWindow();
		window.setScene(new Scene (root));
	}
}