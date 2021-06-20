package application;



import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller implements Initializable{	
	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label label;
	@FXML
	private Button progress;
	BigDecimal bd = new BigDecimal(String.format("%2f", 0.0));

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		progressBar.setStyle("-fx-accent:#00FF00;");
	}
	public void increaseProgress(ActionEvent e) {
		if(bd.doubleValue()<1.0) {
			bd = new BigDecimal(String.format("%2f", bd.doubleValue()+0.1));
			progressBar.setProgress(bd.doubleValue());
			label.setText((int)(bd.doubleValue() * 100) + "%");
		}
	}
	 }
	
