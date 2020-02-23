package cn.number6;

public class Account {

	protected double balance;
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	/**
	 * ��Ǯ����
	 * @param amt: ����Ǯ��
	 * @return: ���ش���Ƿ�ɹ�
	 */
	public boolean deposit(double amt){
		this.balance += amt;
		return true;
	}
	
	/**
	 * ȡǮ����
	 * @param amt: ȡ���Ǯ��
	 * @return: ����ȡ���Ƿ�ɹ�
	 */
	public boolean withdraw(double amt){

		if(amt > balance){
			return false;
		}
		
		this.balance -= amt;
		return true;
	}
	
}
