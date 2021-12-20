package Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.Board;

public class BoardDao {
	 private Connection con;
	 private PreparedStatement ps;
	 private ResultSet rs;
	 
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
	
	// 게시물 작성
	public boolean boardwrite(Board board) {
		String sql="insert into board(b_title, b_contents, m_num, b_file) values(?, ?, ?, ?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, board.getB_title());
			ps.setString(2, board.getB_contents());
			ps.setInt(3, board.getM_num());
			ps.setString(4, board.getB_file());
			return true;
		} catch (Exception e) {System.out.println("시스템"+e);} return false;
	}
	
	// 게시물 번호의 해당 게시물 가져오기
	public Board getBoard(int b_num) {
		String sql="select * from boad where b_num=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, b_num);
			rs=ps.executeQuery();
			if(rs.next()) {
				Board board = new Board(rs.getInt(1), rs.getInt(2),rs.getInt(3))
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
