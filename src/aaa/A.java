package aaa;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class A {
	public void display() {
		System.out.println("aaa기능입니다");
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("전자레인지.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}