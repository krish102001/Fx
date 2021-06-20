package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {	
	@FXML
	Button submitButton;
	@FXML
	Label label;
	@FXML
	TextField textField;
	public void submit(ActionEvent e) {
		try {
		int age = Integer.parseInt(textField.getText());
		if(age>=18) {
			label.setText("You are signed Up successfully!");
		}
		else {
			label.setText("You must above 18 years to sign in");
		}
		}
		catch(NumberFormatException exc) {
			label.setText("Enter Numbers only..");
		}
		catch(Exception ex) {
			label.setText("error");
		}
	}
	
	 }
	
