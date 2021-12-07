package Dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reply {
	
	// 필드
	private int r_num;
	private int r_contents;
	private String b_date;
	private int m_num;
	private int b_num;
	
	// 빈 생성자
	public Reply() { }

	// 전체 생성자
	public Reply(int r_num, int r_contents, String b_date, int m_num, int b_num) {
		super();
		this.r_num = r_num;
		this.r_contents = r_contents;
		
		Date today = new Date();
		SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd hh:ss");
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm");
		try {
			Date date=datetimeformat.parse(b_date);
			if(dateformat.format(date).equals(dateformat.format(today))) {
				this.b_date=timeformat.format(date);
		} else {
			this.b_date=dateformat.format(date);
		}
		} catch (Exception e) { }
		this.m_num = m_num;
		this.b_num = b_num;
	}
	
	// 댓글 
		// 어떤 게시물에 어떤 댓글이 있는지 구별
	public Reply(int r_contents, int m_num, int b_num) {
		this.r_contents = r_contents;
		this.m_num = m_num;
		this.b_num = b_num;
	}

	// get, set
	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public int getR_contents() {
		return r_contents;
	}

	public void setR_contents(int r_contents) {
		this.r_contents = r_contents;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
}