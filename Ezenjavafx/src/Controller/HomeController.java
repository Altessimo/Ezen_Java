package Controller;

import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.swing.text.PlainDocument;

import dao.BoardDao;
import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import domain.ProductDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class HomeController implements Initializable {
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 전체 수
		lbltotalmember.setText(MemberDao.getMemberDao().membercount()+"");
		lbltotalmember.setAlignment(Pos.CENTER); // 정렬
		
		lbltotalboard.setText(BoardDao.getboardDao().boardcount()+"");
		lbltotalboard.setAlignment(Pos.CENTER);
		
		lbltotalboard.setText(ProductDao.getProductDao().productcount()+"");
		lbltotalboard.setAlignment(Pos.CENTER);
		
/* 		선 차트
		XYChart.Series series = new XYChart.Series<>(); // 1. 계열 생성
		series.setName("테스트"); // 2. 계열 이름 / 범례 넣기
		XYChart.Data data1 = new XYChart.Data<>("1", 30); // 3. 데이터 생성"
		series.getData().add(data1); // 4. 계열에 데이터 넣기
		lc.getData().add(series); // 5. 계열을 차트에 넣기
		제품 등록 날짜 = 가로축 // 제품 수 = 세로축
 */
		
		/* 선 차트에 날짜별 제품 수 표시
		XYChart.Series series = new XYChart.Series<>(); // 1. 계열 생성
		series.setName("등록 수"); // 2. 계열 이름
		// 데이터
		ObservableList<Product> products = ProductDao.getProductDao().productlist(); // 모든 제품의 리스트
		// 날짜로 구분
		ArrayList<ProductDate> dates = new ArrayList<>(); // 날짜별 개수를 저장하는 리스트
						// 날짜, 개수
		for(Product product : products) { // 모든 제품을 하나씩 객체 꺼내기
			String date=product.getP_date().split(" ")[0]; // 날짜만 가져오기
			boolean datecheck = true; // 중복체크
			for(int i=0; i<dates.size(); i++) { 
				if(dates.get(i).getDate().equals(date)) { // 만약에 날짜별 개수 리스트에 동일한 날짜가 있으면
					dates.get(i).setCount(dates.get(i).getCount()+1); // 개수 ++
					datecheck=false; break;
			}
		}
			if(datecheck) dates.add(new ProductDate(date,1)); // 동일한 날짜가 없으면 리스트에 추가
		}
		for(ProductDate date : dates) { // 날짜별 개수 리스트에서 하나씩 객체 꺼내기
			XYChart.Data data = new XYChart.Data<>(date.getDate()+"", date.getCount()); // 객체를 값에 넣기
			series.getData().add(data); // 3. 계열에 값 넣기
		}
		lc.getData().add(series); // 4. 계열을 차트에 넣기
		*/
		XYChart.Series series = new XYChart.Series<>(); // 1. 계열 생성
		series.setName("제품 수"); // 2. 계열 이름
		
		// DB 처리[Query:series 검색결과] : 리스트 내 하나씩 꺼내기
		ArrayList<ProductDate> productDates = ProductDao.getProductDao().productdatelist();
		for(ProductDate productDate : productDates) {
			// 3. 계열에 값 넣기
				// 1. 값 설정
			XYChart.Data data = new XYChart.Data<>(productDate.getDate(), productDate.getCount());
				// 2. 값에 노드설정[data.setNode(컨테이너);]
			AnchorPane anchorPane = new AnchorPane(); // 1. 컨테이너 만들기
			Label label = new Label(productDate.getCount()+""); // 2. 레이블 생성
			label.setPadding(new Insets(5)); // setPadding(new Insets(수직)); : 안쪽 여백
			anchorPane.getChildren().add(label); // 3. 컨테이너 레이블 넣기
			
			
			data.setNode(anchorPane);
			// 계열에 값 넣기
			series.getData().add(data);
			
		}
		// y축 설정
		lc.getYAxis().setAnimated(false);// y축 자동 설정 끄기
		lc.getData().add(series); // 4. 계열을 차트에 넣기
		
		// 레이블 증감설정
		if(productDates.get(productDates.size()-1).getCount() >
		productDates.get(productDates.size()-2).getCount());
		// 리스트 내 마지막 객체 내 날짜의 수 > 리스트 내 마지막 전 객체 내 날짜의 수
		lbldecrease.setVisible(false); // 감소 레이블 숨기기
	} else {
		lblincrease.setVisible(false); // 증가 레이블 숨기기
	}
	/*
	 * 
	 */
	
	// 막대차트 // 중복이 있을 경우에는 1번째 값으로 들어옴
	XYChart.Series series2 = new XYChart.Series<>(); // 1. 계열생성
	// 3. 계열에 값 넣기
	HashMap<String, Integer> hashMap = ProductDao.getProductDao().productcategorylist();
	// Map 컬렉션<key, value>
	String maxcategorykey=" ";
	int max = 0;
	for(String key : hashMap.keyset()) {
		if(hashMap.get(key)>max) {
			max = hashMap.get(key);
			maxcategorykey=key;
		}
		XYChart.Data data = new XYChart.Data(key, hashMap.get(key));
		series2.getData().add(data);
		
	}
	// 4. 차트에 계열 넣기
	bc.getDate().add(series2);
	lblcategory.setText(maxcategorykey);
	
	// 원형 차트[중복제거 미완성]
	ObservableList<Product> products = ProductDao.getProductDao().productlist();
	for(Product product : product) {
	observablelist.add(new PieChart.Data(product.getActivation(),1));
	}
	pc.setData(ObservableList);
}
	@FXML
	private PieChart pc;

	@FXML
	private Label lblcategory;
	
	@FXML
	private BarChart bc;

	@FXML
	private LineChart lc;
	
	@FXML
	private Label lbltotalmember;
	
	@FXML
	private Label lbltotalboard;
	
	@FXML
	private Label lbltotalproduct;

}
