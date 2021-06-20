package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller2 {
	@FXML
	Label label;
	public  void display(String userName) {
		label.setText("Hello: "+ userName);
	}
}
