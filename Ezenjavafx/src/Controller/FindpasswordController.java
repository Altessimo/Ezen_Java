package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class FindpasswordController implements Initializable {
	
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	lblconfirm.setText("");
}

	@FXML
    private Label btnback;

    @FXML
    private Button btnsignup;

    @FXML
    private Label find;

    @FXML
    private AnchorPane findpasswordpane;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;
    
	    @FXML
	    void back(MouseEvent event) {
	    	LoginController.getinstance().loadpage("login");
	    }

	    @FXML
	    void findpassword(ActionEvent event) {
	    	// Dap
	    	String result =  MemberDao.getMemberDao().findpassword(txtid.getText(), txtpassword.getText());
	    	if(result != null) {
	    	
	    } else {
	    	lblconfirm.setText("일치하는 회원정보가 존재하지 않습니다");
	    }
	    }

	    @FXML
	    void signup(ActionEvent event) {

	    }
}