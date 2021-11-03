package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SignupController implements Initializable{
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	lblconfirm.setText(" ");
	
}
	
	@FXML
    private Label btnback;

    @FXML
    private Button btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private AnchorPane signuppane;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtid;
    
    @FXML
    private TextField txtname;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private PasswordField txtpasswordconfirm;
    
    @FXML
    void signup(ActionEvent event) {
    	// 0.컨트롤 호출시 => fx:id 호출 [ 객체 ] 
    	// 1. 유효성검사 
    		// 1. 아이디 길이 체크 
    	if(txtid.getText().length()<4 || txtid.getText().length()>13) {
    		lblconfirm.setText("아이디는 4~12 글자로만 가능합니다");
    		return; // 메소드 끝
    	}
    	// 2. 패스워드 길이 체크
    	if(txtpassword.getText().length()<4 || txtpassword.getText().length()>9) {
    		lblconfirm.setText("비밀번호는 4~9 글자로만 가능합니다");
    		return; // 메소드 끝 
    	}
    	// 3. 패스워드 동일 체크
    	if(!txtpassword.getText().equals(txtpasswordconfirm.getText())){
    		// ! : 부정 [반대]
    		lblconfirm.setText("비밀번호가 동일하지 않습니다.");
    		return; // 메소드 끝 
    	}
    	// 4. 이름 길이 체크 
    	if(txtname.getText().length()<2) {
    		lblconfirm.setText("이름은 2글자 이상으로만 가능합니다.");
    		return; // 메소드 끝 
    		}
    	// 5. 이메일 길이체크  // 이메일 @ 포함 체크
    	if(txtemail.getText().length()<5 && !txtemail.getText().contains("@")) {
    		lblconfirm.setText("이메일 형식으로 입력해 주세요."); return;
    		}
    	// 2. 중복체크
    	boolean idcheck = MemberDao.getMemberDao().idcheck(txtid.getText());
    	if(idcheck) {lblconfirm.setText("현재 사용중인 아이디 입니다"); return;}
    	
    	// 3. 객체화
    Member member = new Member(txtid.getText(), txtpassword.getText(),txtname.getText(), txtemail.getText());
 
    // 4. 파일 혹은 DB 처리
    boolean result = MemberDao.getMemberDao().signup(member);
    
    if(result) {
    lblconfirm.setText("가입해주셔서 감사합니다");
	// 5. 메시지창 띄우고 페이지 전환
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setContentText("회원가입 성공"); // 2. 메시지 내용 
	alert.setHeaderText("Autumn community 가입을 축하합니다. [포인트 1000 지급]"); // 3. 메시지 제목 
	alert.setTitle("알림");
	alert.showAndWait(); // 4. 메시지를 띄우고 버튼 입력시까지 대기 
	LoginController.getinstance().loadpage("login"); // 로그인 fxml 파일로 이동
    } else {
    	lblconfirm.setText("회원가입 실패[관리자에게 문의] : DB 오류");
    }
}

    @FXML
    void back(MouseEvent event) {
    	// !! 새로운 객체 선언시에는 새로운 메모리
    	// LoginController loginController = new LoginController();
    	
    		// 동일한 메모리 사용하기 위해서 this 키워드를 사용한 객체 호출
    	LoginController.getinstance().loadpage("login");
    }
}
