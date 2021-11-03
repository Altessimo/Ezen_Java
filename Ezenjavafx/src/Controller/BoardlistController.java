package Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class BoardlistController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
// 1. Dao 호풀
	ObservableList<Board> boards = BoardDao.getboardDao().boardlist();
	// 2. 테이블뷰의 필드 가져오기
	TableColumn tc = boardlist.getColumns().get(0); // 테이블 뷰의 1번째 필드
	tc.setCellValueFactory(new PropertyValueFactory<>("b_no")); // 객체내 필드명[리스트 내 객체와 동일]
	
	tc = boardlist.getColumns().get(1); // 테이블 뷰의 2번째 필드
	tc.setCellValueFactory(new PropertyValueFactory<>("b_title"));
	
	tc = boardlist.getColumns().get(2); // 테이블 뷰의 3번째 필드
	tc.setCellValueFactory(new PropertyValueFactory<>("b_write"));
	
	tc = boardlist.getColumns().get(3); // 테이블 뷰의 4번째 필드
	tc.setCellValueFactory(new PropertyValueFactory<>("b_date"));
	
	tc = boardlist.getColumns().get(4); // 테이블 뷰의 5번째 필드
	tc.setCellValueFactory(new PropertyValueFactory<>("b_view"));
	
	// 3. 테이블 뷰에 리스트 설정
	boardlist.setItems(boards);
	
	/* 4. 클릭한 아이템을 가지고 페이지 전환
	 * boardlist.setOnMouseClicked(e ->{정의 return});
	 * 람다식 표현 인수 -> 정의 : 익명 메소드[1회성 메소드]
	 */
	boardlist.setOnMouseClicked(e ->{
		if(e.getButton().equals(MouseButton.PRIMARY)) { // 해딩 이벤트가 클릭이면
			 board = boardlist.getSelectionModel().getSelectedItem();
			// 테이블 뷰에 선택된 모델의 아이템[객체] / 괄호안에서 사용 되어서 지역변수
			 // 전역변수와 같이 사용할 경우 앞의 ?을 지운다
			// 페이지 전환
		MainpageController.getinstance().loadpage("boardview");
		
		}
	});
	}
	
	public static Board board;
	/* 
	 * 전역변수
	 * board의 BoardviewController의
	 * Board board = BoardlistController.board;로 이동
	*/
	
	 @FXML
	    private TableView<Board> boardlist;
	 // 테이블에 넣을 객체의 클래스명 : 제네릭
	 
	    @FXML
	    private Button btnwrier;
	    
	    @FXML
	    void wrier(ActionEvent event) {
	    	MainpageController.getinstance().loadpage("boardwrite");
	    }
}