package application;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller implements Initializable{	
	@FXML
	private Slider slider;
	@FXML
	private Label label;
	int temperature;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		temperature = (int)slider.getValue();
		label.setText(temperature + "�C");
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				temperature = (int)slider.getValue();
				label.setText(Integer.toString(temperature) + "�C");
				
			}
			
		});
	}
	 }
	
