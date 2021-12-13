package Dto;

import java.text.DecimalFormat;

public class Product {

	private int p_num; // 제품명
	private String p_name; // 제품 이름
	private int p_price; // 제품 가격
    private String p_category; // 카테고리
    private String p_manufacturer; // 제조사
    private int p_active; // 판매상태
    private String p_size; // 제품 사이즈
    private int p_stock; // 제품 재고
	private String p_img; // 제품 이미지
	private String p_contents; // 제품 설명
	private String p_date; // 등록일
	
	// this용
	public String getprice() { // 천단위 쉼표 메소드
		DecimalFormat decimalFormat = new DecimalFormat("###,###"); // DecimalFormat : 숫자형식
		return decimalFormat.format(this.p_price);
	}

	public String getactive() { // 상태를 문자형으로 나타내주는 메소드
		if(this.p_active==1) {return "준비중";}
		if(this.p_active==2) {return "판매중";}
		if(this.p_active==3) {return "품절";}
		if(this.p_active==4) {return "인기상품";}
		return null;
	}
	
	// 빈 생성자
	public Product() { }
	
	// 풀 생성자
	public Product(int p_num, String p_name, int p_price, String p_category, String p_manufacturer, int p_active,
			String p_size, int p_stock, String p_img, String p_contents, String p_date) {
		super();
		this.p_num = p_num;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_category = p_category;
		this.p_manufacturer = p_manufacturer;
		this.p_active = p_active;
		this.p_size = p_size;
		this.p_stock = p_stock;
		this.p_img = p_img;
		this.p_contents = p_contents;
		this.p_date = p_date;
	}

	
	
	// 제품 등록 생성자
	public Product(String p_name, int p_price, String p_category, String p_manufacturer, int p_active, String p_size,
			int p_stock, String p_img, String p_contents) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_category = p_category;
		this.p_manufacturer = p_manufacturer;
		this.p_active = p_active;
		this.p_size = p_size;
		this.p_stock = p_stock;
		this.p_img = p_img;
		this.p_contents = p_contents;
	}
	
	// get, set
	public int getP_num() {
		return p_num;
	}


	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public String getP_manufacturer() {
		return p_manufacturer;
	}

	public void setP_manufacturer(String p_manufacturer) {
		this.p_manufacturer = p_manufacturer;
	}

	public int getP_active() {
		return p_active;
	}

	public void setP_active(int p_active) {
		this.p_active = p_active;
	}

	public String getP_size() {
		return p_size;
	}

	public void setP_size(String p_size) {
		this.p_size = p_size;
	}

	public int getP_stock() {
		return p_stock;
	}

	public void setP_stock(int p_stock) {
		this.p_stock = p_stock;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_contents() {
		return p_contents;
	}

	public void setP_contents(String p_contents) {
		this.p_contents = p_contents;
	}

	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
	
	
}
