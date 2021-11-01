package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Member;

public class MemberDao {
	
	/* DB연동 테스트
	public static void main(String[] args) {
		// 1. mysql 드라이브 확인
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이브 가져오기 성공");
			// 2. DB연동
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezome=UTC", "root", "1234");
			System.out.println("2. DB 연동 성공");
		} catch (Exception e) {
			System.out.println("DB 연동 실패");
			e.printStackTrace();
		}
		}
	*/
	
// JDBC 주요 인터페이스, 클래스
	// 1. Connection : DB연결 인터페이스[DriverManager 클래스]
	// 1. 필드
	private Connection connection; // DB 연결 인터페이스 선언
	private PreparedStatement preparedStatement; // sql 연결 인터페이스 선언
	private ResultSet resultSet; // 쿼리(검색결과) 연결
	
	// 현재 클래스 내 갹체 만들기
	private static MemberDao memberDao = new MemberDao();
	
	// 2. 생성자
	public MemberDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?severTimezome=UTC", "root", "1234");
		} catch (Exception e) {
			System.out.println("DB연동 실패 : " + e);
		}
	}
	// 3. 메소드
	public static MemberDao getMemberDao() { return memberDao; }
	
	// 기능 메소드
	// 1. 회원가입 메소드
	public boolean signup(Member member) {
		// 1. SQL 작성[SQL : DB 조작어 DML]
		String sql = "insert into member(m_id, m_password, m_name, m_email, m_point)" + "values(?, ?, ?, ?, ?)";
		// 2. SQL → DB 연결[prepareStatement 인터페이스 : 연결된 DB에 SQL 조작]
		try{
		preparedStatement = connection.prepareStatement(sql);
		// 3. SQL 설정[?에 데이터 넣기]
		preparedStatement.setString(1, member.getM_id()); // 1번째 ?에 데이터 넣기
		preparedStatement.setString(2, member.getM_password()); // 2번째 ?에 데이터 넣기
		preparedStatement.setString(3, member.getM_name());
		preparedStatement.setString(4, member.getM_enail());
		preparedStatement.setInt(5, member.getM_point());
		
		// 4. SQL 실행
		preparedStatement.executeUpdate();
		
		// 5. SQL 결과
		return true; // DB 저장 성공시 true 발생
		
		} catch (Exception e) { }
		return false;
	}
	
	// 2. 로그인 메소드
	public boolean login(String id, String password) {
		// 1. SQL 작성
			// 특정 필드 : 3. select 필드명 3, 1. from 테이블 명 1, where 조건 2
			// 모든 필드 : select *from 테이블명 where 조건
		String sql = "select * from member where m_id=? and m_password=?";
		// and : 이면서, 면서, 이고, 그리고 = 조건1 and 조건2
		// or : 이거나, 거나, 또는
		
		// 2. SQL → DB연결
		try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		// 3. SQL 설정[현재 메소드로 들어온 인수를 ?에 대입]
		preparedStatement.setString(1, id);
		preparedStatement.setString(2, password);
		
		// 4. SQL 실행[Query : 쿼리(검색결과)]
		ResultSet resultSet = preparedStatement.executeQuery();
		
		// 5. SQL 결과[검색 결과 연결]
		if(resultSet.next()) { // 쿼리 결과에 다음 내용이 있으면 true 없으면 false
			return true; // 로그인 성공
		} else {
			return false; // 로그인 실패
		}
	} catch (Exception e) {
		return false; // DB 오류
	}
}
	
	// 3. 아이디 찾기 메소드
	public String findid(String name, String email) {
		// 1. SQL 저장
		String sql = "select = m_id from member where name=? and m_email=?";
		// 2. 
		try {
		preparedStatement = connection.prepareStatement(sql);
		// 3. 
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, email);
		// 4. 
		resultSet=preparedStatement.executeQuery();
		// 5. 
		if(resultSet.next()) {
			return resultSet.getString(1); // 쿼리(검색결과) 내 1번째 필드를 반환
		} else {
			return null; // 검색 결과가 없으면 null 변환
		}
		} catch (Exception e) {
			return null;
		}
		
	}
	
	// 4. 패스워드 찾기 메소드
	public String findpassword(String name, String email) {
		// 1. SQL 저장
		String sql = "select = m_password from member where id=? and m_email=?";
		// 2. 
		try {
		preparedStatement = connection.prepareStatement(sql);
		// 3. 
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, email);
		// 4. 
		resultSet=preparedStatement.executeQuery();
		// 5. 
		if(resultSet.next()) {
			return resultSet.getString(1); // 쿼리(검색결과) 내 1번째 필드를 반환
		} else {
			return null; // 검색 결과가 없으면 null 변환
		}
		} catch (Exception e) {}
			return null; // DB 오류
	}
	
	// 5. 회원수정 메소드
	
	
	// 6. 회원 탈퇴 메소드
	public boolean delete(String loginid) {
		String sql = "delete from member where m_id=?";
					// delete from 테이블명
					// delete from 테이블명 where 조건
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginid);
			preparedStatement.executeUpdate();
			return true; // 탈퇴 성공시
			
		} catch (Exception e) { }
			return false; // DB 오류
	}
	
	// 7. 회원 정보 메소드[
	public Member getmember(String loginid) {
		// 1. SQL 작성
		String sql = "select*from member where m_id=?";
		// 2. SQL 연결
		try {
			preparedStatement = connection.prepareStatement(sql);
			// 3. SQL 설정
			preparedStatement.setString(1, loginid);
			// 4. SQL 실행
			resultSet = preparedStatement.executeQuery();
			// 5. SQL 결과
			if(resultSet.next()) {
				// 회원정보, 패스워드를 제외한 회원정보 변환
				Member member = new Member(resultSet.getString(2), " ", resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				return member; // 찾은 정보를 객체로 반환
			} else {
				return null; // 회원정보가 없을경우
			}
		} catch (Exception e) { }
			return null; // DB 오류
	}
	
	
	
}
