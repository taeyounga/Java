package java_20170914_Starbucks_Object_Answer;
public class CoffeeShop {
	static String AMERICANO = "�Ƹ޸�ī��";
	static String LATTE = "��";
	static int AMERICANO_PRICE = 4000;
	static int LATTE_PRICE = 5000;
	
	public static void main(String[] args) {
		CoffeeShopGuest ted = new CoffeeShopGuest();
		CoffeeShopStaff john = new CoffeeShopStaff();
		boolean flag = true;
		while(flag){
			john.start();
			if(john.orderCheck(ted.order())){
				//�ֹ�����
				john.menuGuide();
				if(john.menuCheck(ted.menuChoice())){
					john.paymentCheck(ted.payment());
				}
			}else{
				flag = false;
				john.end();
				john.orderPrint();
				//�ֹ�����
			}//if
		}
	}

}
