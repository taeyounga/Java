package java_20170915_Starbucks_Object_Constructor;
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
			john.start();   //////////이 코드의 "어서오십시오"를 CoffeeShopStaff의 생성자로 대체 가능. 하지만 "추가주문"은 while로 루프이기때문에 남겨두자
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
