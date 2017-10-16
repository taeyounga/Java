package java_20170915_Starbucks_Object_Constructor;
import java.util.*;
public class CoffeeShopStaff {
	//Field
	ArrayList<CoffeeVO> list = new ArrayList<CoffeeVO>();
	String umenu = "";
	//Constructor
	public CoffeeShopStaff(){ //���� �ڵ忡�� start()�κ��� �̰����� ��ü�� �� ����.
		System.out.println("����: ��Ÿ������ ���� ���� ȯ���մϴ�.");
	}
	
	
	//Method
	public void start(){
		System.out.println("����: �ֹ��� �Ͻðڽ��ϱ�?(y/n)");
	}
	
	public boolean orderCheck(String order){
		boolean result = true;
		if(order.equals("y")){
		}else{
			result = false;
		}
		return result;
	}
	
	public void menuGuide(){
		System.out.println("����: �޴��� ��ȣ�� �������ּ���.");
	}
	
	public boolean menuCheck(int menu){
		boolean result = true;
		switch(menu){
		case 1:
			this.umenu = CoffeeShop.AMERICANO;
			System.out.println("����: ���� �ݾ��� "+CoffeeShop.AMERICANO_PRICE+"�� �Դϴ�.");
			break;
		case 2:
			this.umenu = CoffeeShop.LATTE;
			System.out.println("����: ���� �ݾ��� "+CoffeeShop.LATTE_PRICE+"�� �Դϴ�.");
			break;
		default:
			System.out.println("����: �ش��ϴ� �޴��� �����ϴ�.");
			result = false;
		}
		return result;
	}
	
	public void paymentCheck(int payment){
		int change = 0;
		System.out.println("����: �����ݾ��� "+payment+"�� �Դϴ�.");
		if(umenu.equals(CoffeeShop.AMERICANO)){
			if(payment>4000) change = payment-CoffeeShop.AMERICANO_PRICE;
			CoffeeVO vo = new CoffeeVO();
			vo.setMenu(CoffeeShop.AMERICANO);
			vo.setPrice(4000);
			list.add(vo);
		}else if(umenu.equals(CoffeeShop.LATTE)){
			if(payment>5000) change = payment-CoffeeShop.LATTE_PRICE;
			CoffeeVO vo = new CoffeeVO();
			vo.setMenu(CoffeeShop.LATTE);
			vo.setPrice(5000);
			list.add(vo);
		}
		System.out.println("����: �Ž������� "+change+"�� �Դϴ�.");
	}
	
	//�ֹ����� ��¸޼ҵ�
	public void orderPrint(){
		System.out.println("===========�ֹ����� ����Ʈ=============");
		System.out.println("��ȣ\t�޴�\t����");
		System.out.println("----------------------------------");
		for(int i=0;i<list.size();i++){
			CoffeeVO output = list.get(i);
			System.out.print((i+1)+"\t");
			System.out.print(output.getMenu()+"\t");
			System.out.println(output.getprice()+"\t");
		}
	}
	
	public void end(){
		System.out.println("����: �ֹ��� �����մϴ�.");
	}
}
