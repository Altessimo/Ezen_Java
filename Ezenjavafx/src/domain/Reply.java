package domain;

public class Reply {
	int r_no;
	private String r_contents; // 댓글 번호
	private String r_write; // 댓글 내용
	private String r_date; // 댓글 작성자
	private int b_no; // 게시물 번호
	// 게시물 Pk 댓글 b_no FK
	
	public Reply() { }

	public Reply(int r_no, String r_contents, String r_write, String r_date, int b_no) {
		super();
		this.r_no = r_no;
		this.r_contents = r_contents;
		this.r_write = r_write;
		this.r_date = r_date;
		this.b_no = b_no;
	}

	public Reply(String r_contents, String r_write, int b_no) {
		super();
		this.r_contents = r_contents;
		this.r_write = r_write;
		this.b_no = b_no;
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}


	public String getR_contents() {
		return r_contents;
	}

	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}

	public String getR_write() {
		return r_write;
	}

	public void setR_writer(String r_write) {
		this.r_write = r_write;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
}