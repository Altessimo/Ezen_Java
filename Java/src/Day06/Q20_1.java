package Day06;

public class Q20_1 {
	// 1. �ʵ�
	private String ano;
	private String owner;
	private int balance;
	
	// �����
	public Q20_1(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner= owner;
		this.balance = balance;
	}
	// �޼ҵ�
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String Owner){this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}
