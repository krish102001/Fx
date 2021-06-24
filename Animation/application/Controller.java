package application;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class Controller implements Initializable{	
	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		TranslateTransition translate = new TranslateTransition();
//		translate.setNode(imageView);
//		translate.setByX(200);
//		translate.setDuration(Duration.millis(1000));
//		translate.setAutoReverse(true);
//		translate.setCycleCount(TranslateTransition.INDEFINITE);
//		translate.play();
//		RotateTransition rotate = new RotateTransition();
//		rotate.setNode(imageView);
//		rotate.setByAngle(180);
//		rotate.setDuration(Duration.millis(1000));
//		rotate.setAutoReverse(true);
//		rotate.setCycleCount(TranslateTransition.INDEFINITE);
//		rotate.play();
//		ScaleTransition scale = new ScaleTransition();
//		scale.setNode(imageView);
//		scale.setByX(2.0);
//		scale.setByY(2.0);
//		scale.setDuration(Duration.millis(2000));
//		scale.setAutoReverse(true);
//		scale.setCycleCount(TranslateTransition.INDEFINITE);
//		scale.play();
		FadeTransition fade = new FadeTransition();
		fade.setNode(imageView);
		fade.setDuration(Duration.millis(1000));
		fade.setAutoReverse(true);
		fade.setCycleCount(TranslateTransition.INDEFINITE);
		fade.setInterpolator(Interpolator.LINEAR);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}
	
	}
	
