package Day02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day02_1 extends Application {
					// 1. javafx로 부터 상속 받기
	@Override // 2. start 메소드 오버라이딩
	public void start(Stage stage) throws Exception {
						// 3. stage 이름 정하기
		// 6. 씬빌더 파일 가져오기
			// 1. fxml 동일한 패키지에 없을경우
		Parent parent = FXMLLoader.load(getClass().getResource("test1.fxml"));
		// ㄴ> 암기
		
		// fxml 동일한 패키지에 있을경우 
			// Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
					
				Scene scene = new Scene(parent); // 2.씬에 넣기 / 스테이지 안에 넣어야함
				
				stage.setScene(scene); // 3.스테이지에 씬 넣기
		
		stage.show(); // 4. stage 열기
	}
	public static void main(String[] args) {
		launch(args); // 5. start 메소드 호출
	}
}
