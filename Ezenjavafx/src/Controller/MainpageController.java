package Controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainpageController implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		lbloginid.setText(LoginController.getinstance().getid());
		loadpage("home"); // mainpage 실행시 가운데 home.fxml 배치
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
	    
	    // 객체화
	    	// 선언
	    public static MainpageController instance;
	    	// 생성자
	    public MainpageController() {
	    	instance = this; // 현재 클래스의 모든 맴버 포함
	    }
	    	// 객체 반환
	    public static MainpageController getinstance() {
	    	return instance;
	    }
	    
	    public String getloginid(){
	    	return lbloginid.getText();
	    }
	    
	    // 가운데 pane 변경하는 메소드
	    public void loadpage(String page) {
	    	try {
	    		Parent patent = FXMLLoader.load(getClass().getResource("/fxml/"+page+".fxml"));
	    		mainpageboardpane.setCenter(patent);
	    	} catch (Exception e) {
				
			}
	    }
	    @FXML
	    void chatting(ActionEvent event) {
	    	loadpage("chatting");
	    }

	    @FXML
	    void home(ActionEvent event) {
	    	loadpage("home");
	    }
	    @FXML
	    void community(ActionEvent event) {
	    	loadpage("boardlist");
	    }
	    
	    @FXML // 로그아웃 메소드(현재 스테이지 닫고 → login 스테이지 열기   
	    void logout(ActionEvent event) {
	    	// 0. 메시지 창 띄우기 [Alert : 메시지 클래스]
	    	Alert alert = new Alert(AlertType.CONFIRMATION); // 확인 취소 버튼
	    	alert.setContentText("로그아웃");
	    	alert.setHeaderText("로그아웃 하시겠습니까?");
	    	alert.setTitle("확인");
	    	
	    	// 메시지 버튼을 눌렀을때[optional 클래스 : null 포함해주는 클래스]
	    	Optional<ButtonType> optional = alert.showAndWait();
	    	if(optional.get() == ButtonType.OK) { // 버튼타입이 OK이면
	    		
	    		 // 1. main 스테이지 숨기기
	    		btnlogout.getScene().getWindow().hide();
	    		
	    		// 2. login 스테이지 열기
	    		Stage stage = new Stage();
	    		try {
	    			Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
	    			Scene scene = new Scene(parent);
	    			stage.setScene(scene);
	    				stage.setResizable(false); // 스테이지 크기 고정
	    				stage.setTitle("Autumn"); // 스테이지 이름
	    					Image image = new Image("file:C:/Users/505/git/Ezen_Java/Ezenjavafx/src/fxml");
	    					stage.getIcons().add(image);
	    			stage.show();
	    		} catch (Exception e) {
				}
	    	}
	    }

	    @FXML
	    void myinfo(ActionEvent event) {
	    	loadpage("myinfo");
	    }

	    @FXML
	    void product(ActionEvent event) {
	    	loadpage("productlist");
	    }
	}