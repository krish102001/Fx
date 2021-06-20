package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {	
	@FXML
	CheckBox checkBox;
	@FXML
	Label label;
	@FXML
	ImageView imageView;
	Image on = new Image(getClass().getResourceAsStream("on.jpg"));
	Image off = new Image(getClass().getResourceAsStream("off.png"));
	public void check(ActionEvent e) {
		if(checkBox.isSelected()) {
			label.setText("ON");
			imageView.setImage(on);
		}
		else {
			label.setText("OFF");
			imageView.setImage(off);
		}
	}
	
	 }
	
