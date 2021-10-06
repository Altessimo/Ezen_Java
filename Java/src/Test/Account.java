package Test;

public class Account {
//1. 필드
	public String ano; // 계좌번호
	private String owner; // 계좌주
	private int balance; // 초기 입금액

// 2. 사용자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
// 3. 메소드
	public String getano() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner=owner;}
	public String getBalance() {return balance;}
	public void setBalance(String balance) {this.balance=balance;}
}
