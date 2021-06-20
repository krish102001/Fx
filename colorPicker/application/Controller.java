package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

public class Controller {	
	@FXML
	private ColorPicker colorPicker;
	@FXML
	private Pane pane;
	public void changeColor(ActionEvent e) throws Exception{
		Color color = colorPicker.getValue();
		pane.setBackground(new Background(new BackgroundFill(color,null,null)));
	}
	 }
	
