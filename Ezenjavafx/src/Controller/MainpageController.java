package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainpageController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lbloginid.setText(LoginController.getinstance().getid());
	}
	 @FXML
	    private Button btnchatting;

	    @FXML
	    private Button btnhome;

	    @FXML
	    private Button btnlogout;

	    @FXML
	    private Button btnmyinfo;

	    @FXML
	    private Button btnnotice;

	    @FXML
	    private Button btnproduct;

	    @FXML
	    private AnchorPane cp;

	    @FXML
	    private Label lbloginid;

	    @FXML
	    private AnchorPane lp;

	    @FXML
	    private BorderPane mainpageboardpane;

	    @FXML
	    void chatting(ActionEvent event) {

	    }

	    @FXML
	    void home(ActionEvent event) {

	    }

	    @FXML
	    void logput(ActionEvent event) {

	    }

	    @FXML
	    void myinfo(ActionEvent event) {

	    }

	    @FXML
	    void notice(ActionEvent event) {

	    }

	    @FXML
	    void product(ActionEvent event) {

	    }
	}