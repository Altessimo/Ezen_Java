package Test;

public class Account {
//1. �ʵ�
	public String ano; // ���¹�ȣ
	private String owner; // ������
	private int balance; // �ʱ� �Աݾ�

// 2. �����
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
// 3. �޼ҵ�
	public String getano() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner=owner;}
	public String getBalance() {return balance;}
	public void setBalance(String balance) {this.balance=balance;}
}
