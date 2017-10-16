package java_20170914_Starbucks_Object_Answer;
public class CoffeeShop {
	static String AMERICANO = "아메리카노";
	static String LATTE = "라떼";
	static int AMERICANO_PRICE = 4000;
	static int LATTE_PRICE = 5000;
	
	public static void main(String[] args) {
		CoffeeShopGuest ted = new CoffeeShopGuest();
		CoffeeShopStaff john = new CoffeeShopStaff();
		boolean flag = true;
		while(flag){
			john.start();
			if(john.orderCheck(ted.order())){
				//주문진행
				john.menuGuide();
				if(john.menuCheck(ted.menuChoice())){
					john.paymentCheck(ted.payment());
				}
			}else{
				flag = false;
				john.end();
				john.orderPrint();
				//주문종료
			}//if
		}
	}

}
