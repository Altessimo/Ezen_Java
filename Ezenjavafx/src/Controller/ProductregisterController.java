package Controller;

import java.io.File;

import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductregisterController {

	 @FXML
	    private Button btncancel;

	    @FXML
	    private Button btnimhadd;

	    @FXML
	    private Button btnregister;

	    @FXML
	    private ToggleGroup category;

	    @FXML
	    private Label lblimgpath;

	    @FXML
	    private RadioButton opt_1;

	    @FXML
	    private RadioButton opt_2;

	    @FXML
	    private RadioButton opt_3;

	    @FXML
	    private RadioButton opt_4;

	    @FXML
	    private ImageView pimg;

	    @FXML
	    private TextField txtpcontents;

	    @FXML
	    private TextField txtpname;

	    @FXML
	    private TextField txtprice;

	    @FXML
	    void cancel(ActionEvent event) {
	    	MainpageController.getinstance().loadpage("productlist");
	    }

	    @FXML
	    void register(ActionEvent event) {
	    
	    // 유효성 검사 생략
	    String pname = txtpname.getText(); // 제품명
	    String pcontents = txtpcontents.getText(); // 제품설명
	    int pprice = Integer.parseInt(txtprice.getText()); //가격 / 정수형 형변환
	    String pcategory = "";
	    if(opt_1.isSelected()) {pcategory="의류";} // 해당 라디오 버튼을 클릭 했을때
	    if(opt_2.isSelected()) {pcategory="신발";}
	    if(opt_3.isSelected()) {pcategory="가방";}
	    if(opt_4.isSelected()) {pcategory="ACC";}
	    
	    // 로그인된 아이디의 회원번호 검색 Db처리
	    int m_no = MemberDao.getMemberDao().mnocheck(MainpageController.getinstance().getloginid());
	    System.out.println(m_no);
	    // 객체화[상태 초기 값 = 1]
	    Product product = new Product(pname, pimage, pcontents, pcategory, pprice, 1, m_no);
	    
	    // Db처리
	    boolean result = ProductDao.getProductDao().register(product);
	    
	    Alert alert = new Alert(AlertType.INFORMATION);
	    
	    if(result) {
	    	alert.setHeaderText("제품등록성공"); alert.showAndWait(); // 
	    	MainpageController.getinstance().loadpage("productlist"); // 
	    }
	    		
	    ProductDao.getProductDao().register(product);
	   
	    }
	    // 파일 경로 찾기
	    private String pimage; // 파일경로 저장할 변수
	    private Stage stage; // 파일 경로 찾을 화면
	    
	    @FXML
	    void imgadd(ActionEvent event) {
	    	// 1. 파일 선택 클래스
	    	FileChooser fileChooser = new FileChooser(); // 파일 선택시 경로 저장
	    	// 2. 파일 스테이지 설정 getExtensionFilters : 선택한 파일 필터
	    	fileChooser.getExtensionFilters().add(new ExtensionFilter("그림파일 : Image File",  "*png", "*jpg", "*gif"));
	    	// 3. 스테이지에 파일 선택 클래스 넣기
	    	File file = fileChooser.showOpenDialog(stage); // 그림 파일 여는 것이 Stage 
	    	// 선택한 파일을 파일 클래스에 저장
	    	lblimgpath.setText("파일경로 : " + file.getParent());
	    	// 
	    	pimage=file.toURI().toString();
//	    	System.out.println("URL 경로 : " + file.getParent());
//	    	System.out.println("URI 경로 : " + pimage);
	    	Image image = new Image(pimage);
	    	pimg.setImage(image);
	    }
}
