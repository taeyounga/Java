/*
 * 데이터만 갖는 VO 객체는 항상 Getter와 Setter Method가 반.드.시 있어야함.
 * 전역변수는 this.를 붙임.
 */

package java_20170912_bank;
public class AccountVO {
	//Field
	String accountNumber="", accountPass="";
	int transactionAmount=0;
	
	//Constructor
	
	
	//Method: Setter
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountPass(String accountPass){
		this.accountPass = accountPass;
	}
	public void setTransactionAmount(int transactionAmount){
		this.transactionAmount = transactionAmount;
	}
	
	//Method: Getter
	public String getAccountNumber(){
		return accountNumber;
	}
	public String getAccountPass(){
		return accountPass;
	}
	public int getTransactionAmount(){
		return transactionAmount;
	}
	
}
