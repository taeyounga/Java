package java_20170912_bank;

public class BankStaff {
	//Field
	//���� ����(���¹�ȣ, ��й�ȣ, �ݾ�)�� ���� ���� ����
	String accountNumber;
	String accountPass;
	int transactionAmount = 0;
	
	//Constructor
	//Method
	boolean accountCheck(AccountVO chit){
		String msg = "";
		boolean flag = true;
		if(chit.getAccountNumber().equals("")){
			System.out.println("���¹�ȣ�� �Էµ��� �ʾҽ��ϴ�.");
			flag = false;
		}
		if(chit.getAccountPass().equals("")){
			System.out.println("��й�ȣ�� �Էµ��� �ʾҽ��ϴ�.");
			flag = false;
		}
		if(chit.getTransactionAmount()==0){
			System.out.println("����ݾ��� �Էµ��� �ʾҽ��ϴ�.");
			flag = false;
		}
		if(chit.getAccountNumber().equals("")||chit.getAccountPass().equals("")||chit.getTransactionAmount()==0){
			msg = "�Է������� Ȯ���Ͻʽÿ�.";
			flag = false;
		}else{
			msg = "��� ������ �ԷµǾ����ϴ�.";
		}System.out.println(msg);
		return flag;
	}
	

}
