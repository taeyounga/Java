package java_20170911_vending_answer;

public class CoffeeMachine {
	
	void showMenu(){
		System.out.println("***************\r"
				+ "�ͽ�Ŀ��:\t300��\r"
				+ "ī���:\t600��\r"
				+ "īǪġ��:\t500��\r"
				+ "***************");
	}
	
	void moneyCheck(int money){
		if(money<300){
			System.out.println("���Ǳ�: �ݾ��� �����մϴ�.");
		}else if(money < 600){
			System.out.println("���Ǳ�: Ŀ��, īǪġ�� �ֹ��� �����մϴ�.");
		}else if(money >= 600){
			System.out.println("���Ǳ�: Ŀ��, īǪġ��, ī��� �ֹ��� �����մϴ�.");
		}
	}
	
	void makeCoffee(String menu){
		System.out.println("���Ǳ�: �ֹ��Ͻ� "+menu+"�� �ϼ��Ǿ����ϴ�.");
		System.out.println("���Ǳ�: ���ְ� �弼��~");
	}
	
	
	
}
