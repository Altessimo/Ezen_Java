package Controller;

import java.net.URL;
import java.time.chrono.MinguoChronology;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import domain.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoardviewController implements Initializable {
	
	Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		replytableload();
		// 조회수 증가
		BoardDao.getboardDao().veiwupdate(board.getB_no());
		
		txttile.setText(board.getB_title());
		txtcontents.setText(board.getB_contents());
		lblwriter.setText("작성자 : " + board.getB_write());
		lbldate.setText("작성일 : " + board.getB_date().split(" ")[0]); // 0 : 날짜 1 : 시간
		lblview.setText("조회수 : " + board.getB_view());
		
		if(!MainpageController.getinstance().getloginid().equals(board.getB_write())) {
			// 게시물 작성자와 로그인 된 아이디가 다를 경우
				// 버튼 숨기기
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
// txttitle.setDisable(false);
// txtcontents.setDisable(false);
// txttitle.setEditable(false);
// txtcontents.setEditable(false);
	}
	
	@FXML
	private TextArea txtreply;
	
	@FXML
	private Label lbldate;

	@FXML
	private Label lblview;

	@FXML
	private Label lblwriter;
	
	@FXML
    private Button btncancel;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnreplywrite;

    @FXML
    private Button btnupdate;

    @FXML
    private TableView<Reply> replylist;
    // 테이블 값 로드 메소드
    public void replytableload() {
    	
    	ObservableList<Reply> reply = BoardDao.getboardDao().replylist(board.getB_no());
    	
    	TableColumn tc = replylist.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_no"));
    	
    	tc = replylist.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_write"));
    	
    	tc = replylist.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_contents"));
    	
    	tc = replylist.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_date"));
    	
    	replylist.setItems(reply);
    }
    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txttile;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("해당 게시물을 삭제 하시겠습니까?");
    	alert.setTitle("알림");
    	Optional<ButtonType> optional=alert.showAndWait();
    	if(optional.get()==ButtonType.OK) {
    		// 삭제 진행
    		boolean result = BoardDao.getboardDao().delete(board.getB_no());
    		if(result) { MainpageController.getinstance().loadpage("boardlist");}
    			
    		}
    	}

    @FXML
    void replywrite(ActionEvent event) {
    	Reply reply = new Reply(txtreply.getText(), MainpageController.getinstance().getloginid(), board.getB_no());
    	// 댓글처리
    	boolean result = BoardDao.getboardDao().replywrite(reply);
    			if(result) {
    				Alert alert = new Alert(AlertType.INFORMATION);
    				alert.setHeaderText("댓글등록");
    				alert.showAndWait(); 
    				// 댓글 리스트 로드
    				replytableload();
    				// 댓글 입력창 초기화
    				txtreply.setText("");
    				
    			}
    }
    
    boolean upcheck = true; // 업데이트 버튼 스위치 변수
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	
    	if(upcheck) {
    	alert.setHeaderText("내용 수정 후 다시 버튼 클릭시 수정완료 됩니다");
    	alert.showAndWait();
    	
    	txttile.setEditable(true); // 수정가능
    	txtcontents.setEditable(true); // 수정가능
    	upcheck=false;
    	}
    	else {
    		BoardDao.getboardDao().update(board.getB_no(), txttile.getText(), txtcontents.getText());
    		alert.setHeaderText("게시물이 수정 되었습니다.");
    		alert.showAndWait();
    		
    		upcheck=true;
    		txttile.setEditable(false); // 수정 불가능
    		txtcontents.setEditable(false); // 수정 불가능
    	}
    }
}
