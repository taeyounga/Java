package java_20170912_bank;
public class BankCustomer {
	//Field(전역변수): 클래스의 어디에서나 호출해서 사용 가능
	String accountNumber = "123111";
	String accountPass = "";
	int transactionAmount = 123;
	
	//Counstructor(생성자): 

	
	//Getter Method(메소드)
	String getAccountNumber(){
		return accountNumber;
	}
	
	String getAccountPass(){
		return accountPass;
	}
	
	int getTransactionAmount(){
		return transactionAmount;
	}
}
