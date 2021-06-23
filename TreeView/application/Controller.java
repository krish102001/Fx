package application;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller implements Initializable{	
	@FXML
	private TreeView<String> treeView;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> root = new TreeItem<>("Files");
		TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
		TreeItem<String> branchItem2 = new TreeItem<>("Videos");
		TreeItem<String> branchItem3 = new TreeItem<>("Audios");
		TreeItem<String> leafItem1 = new TreeItem<>("picture1");
		TreeItem<String> leafItem2 = new TreeItem<>("picture2");
		TreeItem<String> leafItem3 = new TreeItem<>("video1");
		TreeItem<String> leafItem4 = new TreeItem<>("video2");
		TreeItem<String> leafItem5 = new TreeItem<>("audio1");
		TreeItem<String> leafItem6 = new TreeItem<>("audio2");
		branchItem1.getChildren().addAll(leafItem1,leafItem2);
		branchItem2.getChildren().addAll(leafItem3,leafItem4);
		branchItem3.getChildren().addAll(leafItem5,leafItem6);
		root.getChildren().addAll(branchItem1,branchItem2,branchItem3);
		treeView.setShowRoot(false);
		treeView.setRoot(root);
		
	}
	public void selectedItem() {
		TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
		if(item!=null) {
			System.out.println(item.getValue());
		}
	}
	 }
	
