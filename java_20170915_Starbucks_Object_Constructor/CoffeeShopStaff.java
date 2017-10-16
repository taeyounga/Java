package java_20170915_Starbucks_Object_Constructor;
import java.util.*;
public class CoffeeShopStaff {
	//Field
	ArrayList<CoffeeVO> list = new ArrayList<CoffeeVO>();
	String umenu = "";
	//Constructor
	public CoffeeShopStaff(){ //기존 코드에서 start()부분을 이것으로 대체할 수 있음.
		System.out.println("직원: 스타벅스에 오신 것을 환영합니다.");
	}
	
	
	//Method
	public void start(){
		System.out.println("직원: 주문을 하시겠습니까?(y/n)");
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
		System.out.println("직원: 메뉴를 번호로 선택해주세요.");
	}
	
	public boolean menuCheck(int menu){
		boolean result = true;
		switch(menu){
		case 1:
			this.umenu = CoffeeShop.AMERICANO;
			System.out.println("직원: 결제 금액이 "+CoffeeShop.AMERICANO_PRICE+"원 입니다.");
			break;
		case 2:
			this.umenu = CoffeeShop.LATTE;
			System.out.println("직원: 결제 금액이 "+CoffeeShop.LATTE_PRICE+"원 입니다.");
			break;
		default:
			System.out.println("직원: 해당하는 메뉴가 없습니다.");
			result = false;
		}
		return result;
	}
	
	public void paymentCheck(int payment){
		int change = 0;
		System.out.println("직원: 받은금액은 "+payment+"원 입니다.");
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
		System.out.println("직원: 거스름돈은 "+change+"원 입니다.");
	}
	
	//주문내역 출력메소드
	public void orderPrint(){
		System.out.println("===========주문내역 리스트=============");
		System.out.println("번호\t메뉴\t가격");
		System.out.println("----------------------------------");
		for(int i=0;i<list.size();i++){
			CoffeeVO output = list.get(i);
			System.out.print((i+1)+"\t");
			System.out.print(output.getMenu()+"\t");
			System.out.println(output.getprice()+"\t");
		}
	}
	
	public void end(){
		System.out.println("직원: 주문을 종료합니다.");
	}
}
