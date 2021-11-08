package Controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import dao.ProductDao;
import domain.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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

public class productupdateController implements Initializable{
	
	Product product = ProductlistController.product;
	
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	
	txtpname.setText(product.getP_name());
	txtpcontents.setText(product.getP_contents());
	txtprice.setText(product.getP_price()+"");
	Image image = new Image(product.getP_img());
	pimg.setImage(image);
	lblimgpath.setText(product.getP_img());
	pimage = product.getP_img();
	
	// 
	if(product.getP_category().equals("의류")); {opt_1.setSelected(true);}
	if(product.getP_category().equals("신발")); {opt_2.setSelected(true);}
	if(product.getP_category().equals("가방")); {opt_3.setSelected(true);}
	if(product.getP_category().equals("ACC")); {opt_4.setSelected(true);}
	}

	@FXML
    private Button btncancel;

    @FXML
    private Button btnimhadd;

    @FXML
    private Button btnupdate;

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
    
    private Stage stage; //
    private String pimage;
    
    @FXML
    void imgadd(ActionEvent event) {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("그림파일만가능", "*jpg", "*png", "*gif"));
    	File file = fileChooser.showOpenDialog(stage);
    	lblimgpath.setText("파일경로 : " + file.getPath());
    	pimage = file.toURI().toString();
    	Image image = new Image(pimage);
    	pimg.setImage(image);
    }

    @FXML
    void update(ActionEvent event) {

    	String p_name = txtpname.getText();
    	String p_contents = txtpname.getText();
    	int p_price = Integer.parseInt(txtprice.getText());
    	
    	String category = "";
    	if(opt_1.isSelected()) {category="의류";}
    	if(opt_2.isSelected()) {category="신발";}
    	if(opt_3.isSelected()) {category="가방";}
    	if(opt_4.isSelected()) {category="ACC";}
    	
    	// 객체화
    	Product product2 = new Product(product.getP_no(), p_name, pimage, p_contents, category, p_price, 0, "0", 0);
    	
    	// DB넣기
    	boolean result = ProductDao.getProductDao().update(product2);
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("제품수정 완료"); alert.showAndWait();
    		MainpageController.getinstance().loadpage("productlist");
    }
}
}