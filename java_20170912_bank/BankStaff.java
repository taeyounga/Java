package java_20170912_bank;

public class BankStaff {
	//Field
	//고객의 정보(계좌번호, 비밀번호, 금액)를 담을 변수 선언
	String accountNumber;
	String accountPass;
	int transactionAmount = 0;
	
	//Constructor
	//Method
	boolean accountCheck(AccountVO chit){
		String msg = "";
		boolean flag = true;
		if(chit.getAccountNumber().equals("")){
			System.out.println("계좌번호가 입력되지 않았습니다.");
			flag = false;
		}
		if(chit.getAccountPass().equals("")){
			System.out.println("비밀번호가 입력되지 않았습니다.");
			flag = false;
		}
		if(chit.getTransactionAmount()==0){
			System.out.println("인출금액이 입력되지 않았습니다.");
			flag = false;
		}
		if(chit.getAccountNumber().equals("")||chit.getAccountPass().equals("")||chit.getTransactionAmount()==0){
			msg = "입력정보를 확인하십시오.";
			flag = false;
		}else{
			msg = "모든 정보가 입력되었습니다.";
		}System.out.println(msg);
		return flag;
	}
	

}
