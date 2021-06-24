package application;



import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;


public class Controller implements Initializable{	
	@FXML
	private MediaView mediaView;
	@FXML
	private Button playButton,pauseButton,resetButton;
	
	private Media media;
	private MediaPlayer mediaPlayer;
	private File file;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		file = new File("Demo.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setMute(true);
		mediaView.setMediaPlayer(mediaPlayer);
	}
	public void play() {
		mediaPlayer.play();
	}
	public void pause() {
		mediaPlayer.pause();
	}
	public void reset() {
		if(mediaPlayer.getStatus()!=MediaPlayer.Status.READY)
		mediaPlayer.seek(Duration.seconds(0.0));
	}
	}
	
