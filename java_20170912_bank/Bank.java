package java_20170912_bank;
import java_20170913.Address;
public class Bank {

	public static void main(String[] args) {
		BankCustomer ted = new BankCustomer();
		BankStaff banker = new BankStaff();
		AccountVO chit = new AccountVO();
		
		Address address = new Address();
		System.out.println("�̸� = "+address.name); //�ܺο��� ��ü�� ���� ���� ����.
		//System.out.println("�̸�3 = "+address.name3); //name3�� default String�̱⿡, ���� ��Ű������ ��ü�� ���� ���� ����. �ٸ� ��Ű���̱⿡ ���ٺҰ�.
		
		//������ ���� ���� �۾�
		chit.setAccountNumber(ted.getAccountNumber());
		chit.setAccountPass(ted.getAccountPass());
		chit.setTransactionAmount(ted.getTransactionAmount());
		
		if(banker.accountCheck(chit)){
			//�������
			System.out.println("����� �����մϴ�");
		}else{
			//�����κ� �Է¹ޱ�
			System.out.println("���Է� �޽��ϴ�.");
		}
	}

}
