package java_20170912_bank;
import java_20170913.Address;
public class Bank {

	public static void main(String[] args) {
		BankCustomer ted = new BankCustomer();
		BankStaff banker = new BankStaff();
		AccountVO chit = new AccountVO();
		
		Address address = new Address();
		System.out.println("이름 = "+address.name); //외부에서 객체를 통해 접근 가능.
		//System.out.println("이름3 = "+address.name3); //name3은 default String이기에, 같은 패키지에서 객체를 통해 접근 가능. 다른 패키지이기에 접근불가.
		
		//빌지에 정보 쓰는 작업
		chit.setAccountNumber(ted.getAccountNumber());
		chit.setAccountPass(ted.getAccountPass());
		chit.setTransactionAmount(ted.getTransactionAmount());
		
		if(banker.accountCheck(chit)){
			//출금진행
			System.out.println("출금을 진행합니다");
		}else{
			//빠진부분 입력받기
			System.out.println("재입력 받습니다.");
		}
	}

}
