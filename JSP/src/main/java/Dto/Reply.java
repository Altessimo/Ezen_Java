package Dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import Dao.MemberDao;

public class Reply {
	
	// 필드
	private int r_num;
	private String r_contents;
	private String r_date;
	private int m_num;
	private int b_num;
	private String r_writer; // 회원아이디
	
	// 빈 생성자 : 임시로 만든것
	public Reply() { }

	// 전체 생성자 : DB에서 꺼내올때
	public Reply(int r_num, String r_contents, String r_date, int m_num, int b_num) {
		super();
		this.r_num = r_num;
		this.r_contents = r_contents;
		
		Date today = new Date();
		SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd hh:ss");
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm");
		try {
			Date date=datetimeformat.parse(r_date);
			if(dateformat.format(date).equals(dateformat.format(today))) {
				this.r_date=timeformat.format(date);
		} else {
			this.r_date=dateformat.format(date);
		}
		} catch (Exception e) { }
		this.m_num = m_num;
		this.b_num = b_num;
		this.r_writer=MemberDao.getmemberDao().getmemberid(m_num);
	}
	
	// DB 넣을때 / 특정 생성자 / 댓글
		// 어떤 게시물에 어떤 댓글이 있는지 구별
	public Reply(String r_contents, int m_num, int b_num) {
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

	public String getR_contents() {
		return r_contents;
	}

	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
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

	public String getR_writer() {
		return r_writer;
	}

	public void setR_writer(String r_writer) {
		this.r_writer = r_writer;
	}
}