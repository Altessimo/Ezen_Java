package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyinfoupdateController implements Initializable {
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	String loginid = MainpageController.getinstance().getloginid();
	Member member =  MemberDao.getMemberDao().getmember(loginid);
	lblid.setText(member.getM_id());
	txtname.setText(member.getM_name());
	txtemail.setText(member.getM_enail());
	lblpoint.setText(member.getM_point() + " ");
	
}
	@FXML
	private Button btncancel;

	@FXML
	private Button btnupdate;

	@FXML
	private Label lblid;

	@FXML
	private Label lblpoint;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtname;

	@FXML
	void cancel(ActionEvent event) {
		MainpageController.getinstance().loadpage("myinfo");
	}
	@FXML
	void update(ActionEvent event) {
		boolean result = MemberDao.getMemberDao().update(lblid.getText(), txtname.getText(), txtemail.getText());
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION); alert.setHeaderText("회원정보 수정 완료"); alert.showAndWait(); 
    		MainpageController.getinstance().loadpage("myinfo");
    	}
    	else { 
    		Alert alert = new Alert(AlertType.INFORMATION); alert.setHeaderText("회원정보 수정 오류[관리자에게문의]"); alert.showAndWait();  
    	}
	}
}
