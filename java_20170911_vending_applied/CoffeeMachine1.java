package java_20170911_vending_applied;

public class CoffeeMachine1 {
	int gmoney = 0; //���� ������ ��
	void showMenu(){
		System.out.println("***************\r"
				+ "Ŀ��:\t300��\r"
				+ "ī���:\t600��\r"
				+ "īǪġ��:\t500��\r"
				+ "***************");
	}
	
	void moneyCheck(int money){
		gmoney = money;
		if(money<300){
			System.out.println("���Ǳ�: �ݾ��� �����մϴ�.");
		}else if(money < 600){
			System.out.println("���Ǳ�: Ŀ��, īǪġ�� �ֹ��� �����մϴ�.");
		}else if(money >= 600){
			System.out.println("���Ǳ�: Ŀ��, īǪġ��, ī��� �ֹ��� �����մϴ�.");
		}
	}
	
	void makeCoffee(String menu){
		changeCheck(menu); //�߿�!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("���Ǳ�: �ֹ��Ͻ� "+menu+"�� �ϼ��Ǿ����ϴ�.");
		System.out.println("���Ǳ�: ���ְ� �弼��~");
	}
	
	void changeCheck(String menu){
		int change = 0;
		if(menu.equals("Ŀ��")){
			if(gmoney>300){
				change = gmoney - 300;
			}
		}else if(menu.equals("īǪġ��")){
			if(gmoney>300){
				change = gmoney - 500;
			}
		}else if(menu.equals("ī���")){
			if(gmoney>300){
				change = gmoney - 600;
			}
		}
		System.out.println("���Ǳ�: �Ž������� "+change+"�� �Դϴ�.");
	}
		
	
	
	
}
