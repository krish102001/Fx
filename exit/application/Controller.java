package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	AnchorPane scenePane;
	 
	Stage stage;
	 public void logout(ActionEvent e) throws IOException{
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Exit");
		alert.setHeaderText("Exiting the window");
		alert.setContentText("Do you want to Exit?");
		if(alert.showAndWait().get()==ButtonType.OK) {
		stage = (Stage) scenePane.getScene().getWindow();
		System.out.println("User logged out!");
		stage.close();
		}
	 }
	
}
