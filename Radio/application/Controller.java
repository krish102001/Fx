package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {	
	@FXML
	RadioButton button1;
	@FXML
	Label label;
	@FXML
	RadioButton button2;
	@FXML
	RadioButton button3;
	public void change(ActionEvent e) {
		if(button1.isSelected()) {
			label.setText(button1.getText());
		}
		else if(button2.isSelected()) {
			label.setText(button2.getText());
		}
		else if(button3.isSelected()) {
			label.setText(button3.getText());
		}
	}
	 }
	
