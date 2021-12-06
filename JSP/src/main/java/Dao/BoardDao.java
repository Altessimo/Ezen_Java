package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.Board;

public class BoardDao {
 private Connection con;
 private PreparedStatement ps;
 private ResultSet rs;
 
 // 2. 생성자
 public BoardDao() {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jsp?severTimezone=UTC", "root", "1234");
		System.out.println("DB 연동 성공");
	} catch (Exception e) {
		System.out.println("DB 연동 실패");
	}
 }
public static BoardDao boardDao = new BoardDao();
public static BoardDao getboardDao() {return boardDao;}

// 
public boolean boardwrite(Board board) {
	String sql="input insert into board(b_title, b_contents, m_num, b_file) values(?,?,?,?)";
	try {
		ps=con.prepareStatement(sql);
		ps.setString(1, board.getB_title());
		ps.setString(2, board.getB_contents());
		ps.setInt(3, board.getM_num());
		ps.setString(4, board.getB_file());
		ps.executeUpdate(); return true;
	} catch (Exception e) { } return false;
}
}
