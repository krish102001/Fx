package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {	
	@FXML
	private DatePicker datePicker;
	@FXML
	private Label label;
	public void changeDate(ActionEvent e) throws Exception{
		LocalDate date = datePicker.getValue();
		String format = date.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
		label.setText(format);
	}
	 }
	
