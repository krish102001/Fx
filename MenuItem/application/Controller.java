package application;



import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller{	
	@FXML
	private AnchorPane scenePane;
	private Stage stage;
	public void newFile() {
		System.out.println("New File is created....");
		}
	public void close() {
		stage = (Stage) scenePane.getScene().getWindow();
		stage.close();
	}
	}
	
