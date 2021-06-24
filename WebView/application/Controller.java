package application;




import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;



public class Controller implements Initializable{	
	@FXML
	private WebView webView;
	@FXML
	private TextField text;
	private String homePage;
	private WebEngine engine;
	private WebHistory history;
	private double zoom ;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webView.getEngine();
		homePage = "www.google.com/";
		text.setText(homePage);
		zoom = 1.0;
		load();
	}
	public void load() {
		engine.load("https://"+text.getText());
	}
	public void refresh() {
		engine.reload();
	}
	public void zoomIn() {
		zoom+= 0.25;
		webView.setZoom(zoom);
	}
	public void zoomOut() {
		zoom-=0.25;
		webView.setZoom(zoom);
	}
	public void forward() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(1);
		text.setText(entries.get(history.getCurrentIndex()).getUrl());
	}
	public void backward() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(-1);
		text.setText(entries.get(history.getCurrentIndex()).getUrl());
	}
	public void history() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		for(WebHistory.Entry entry : entries) {
			System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
		}
	}
	public void executeJs() {
		engine.executeScript("window.location = \"https://www.youtube.com/\"");
	}
	}
	
