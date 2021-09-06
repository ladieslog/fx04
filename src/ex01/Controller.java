package ex01;

import java.awt.Panel;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

import login.LoginClass;
import member.Member;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller implements Initializable{
	@FXML TextField fxId;
	@FXML PasswordField fxPwd;
	private Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void MemberShip() {
		Member m = new Member();
		m.membership(root);
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	public void LoginProc() {
		//System.out.println("로그인 버튼 클릭");
		TextField t = (TextField)root.lookup("#fxId");
		System.out.println( t.getText() );
		System.out.println("어노테이션 사용 : "+fxId.getText());
		LoginClass lc = new LoginClass();
		lc.loginCheck( fxId, fxPwd );
		lc.loginCheck(root);
	}
}