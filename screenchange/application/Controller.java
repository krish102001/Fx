package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	 @FXML
	 TextField text;
	 @FXML
	 Label label;
	 
	 Parent root;
	 Stage stage;
	 Scene scene;
	 
	 public void switchScene(ActionEvent e) throws IOException{
		
		 FXMLLoader load = new FXMLLoader(getClass().getResource("/Scene2.fxml"));
		 	root = load.load();
		 	String user = text.getText();
		 	label.setText("Type Valid name only.");
		 	Controller2 control = load.getController();
		 	control.display(user);
//		  root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
		  stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	 }
	
}
