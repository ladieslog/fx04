package member;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Member {
	public void membership(Parent root) {
		Stage s = (Stage)root.getScene().getWindow();
		s.close();
		System.out.println("멤버 연결");
	}
}