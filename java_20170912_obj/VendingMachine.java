package java_20170912_obj;
import java.util.Scanner;
public class VendingMachine {
	Scanner scan = new Scanner(System.in);
	int localMoney = 0;
	int change = 0;
	String addMoney;
	boolean mflag = true, dflag = true;
	//�޴�ǥ��
	void showMenu(){
		System.out.println("**********************");
		System.out.println("�������ֽ�:\t1000��");
		System.out.println("���̴�:\t900��");
		System.out.println("�ݶ�:\t900��");
		System.out.println("ȯŸ:\t700��");
		System.out.println("**********************");
	}
	//���Աݾ� Ȯ��
	boolean checkMoney(int inserted){
		localMoney = localMoney + inserted;
		System.out.println("���Ե� �ݾ��� "+localMoney+"�� �Դϴ�.");
		if(localMoney<700){
			System.out.println("���Ǳ�: �ݾ��� �����մϴ�");
			mflag = false;
		}else if(localMoney<=899){
			System.out.println("���Ǳ�: ȯŸ ������ �����մϴ�.");
			mflag = true;
		}else if(localMoney<=999){
			System.out.println("���Ǳ�: ȯŸ, �ݶ�, ���̴� ������ �����մϴ�.");
			mflag = true;
		}else if(localMoney>=1000){
			System.out.println("���Ǳ�: ȯŸ, �ݶ�, ���̴�, �������ֽ� ������ �����մϴ�.");
			mflag = true;
		}
		return mflag;
	}
	
	//�ܵ�Ȯ��
	void checkChange(String menu){
		if(menu.equals("ȯŸ")) change = localMoney - 700;
		if(menu.equals("�ݶ�")||menu.equals("���̴�")) change = localMoney - 900;
		if(menu.equals("�������ֽ�")) change = localMoney - 1000;
	}
	
	
	//���� out
	boolean getDrink(String menu){
		checkChange(menu);
		if(change<0){
			System.out.println("���Ǳ�: �����Ͻ� �ݾ����δ� �ش� ���Ḧ �����Ͻ� �� �����ϴ�.");
			System.out.print("���Ǳ�: �ش� ���Ḧ �����Ͻñ� ���� ���� �� �����Ͻðڽ��ϱ�?(��/�ƴϿ�): ");
			addMoney = scan.next();
			if(addMoney.equals("��")){
				System.out.println("���Ǳ�: ���� �߰��� �������ֽʽÿ�.");
				dflag = false;
			}else {
				System.out.println("���Ǳ�: �ȳ��� ���ʽÿ�.");
				change = localMoney;
				dflag = true;
			}
		}else{
			dflag = true;
			System.out.println("���Ǳ�: ������ �����: "+menu+"�Դϴ�.");
			System.out.println("���Ǳ�: �Ž������� "+change+"�� �Դϴ�.");
			System.out.println("���Ǳ�: ���ְ� �弼��!");
		}
		return dflag;
	}	
	
	int giveChange(){
		return change;
	}

}
