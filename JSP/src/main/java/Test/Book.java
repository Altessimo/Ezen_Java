package Test;

public class Book {
	
	private String code;
	private String title;
	private String contents;
	
	
	public Book(String code, String title, String contents) {
		super();
		this.code = code;
		this.title = title;
		this.contents = contents;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
