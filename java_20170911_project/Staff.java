package java_20170911_project;

public class Staff {
	//변수명(속성)정의
	String umenu = "";
	int uprice;
	int change;
	
	//메소드 정의
	//메뉴를 체크한다(){}
	String menuCheck(String cmenu){
		//Customer의 주문 메뉴와 메뉴판 리스트 비교
		String result= "";
		
		if(cmenu.equals("아메리카노")){
			result = "주문이 가능합니다.";
			umenu = cmenu;
			uprice = 5000;
			//System.out.println("umenu = "+umenu+", uprice = "+uprice);
			
		}else if(cmenu.equals("라떼")){
			result = "주문이 가능합니다.";
			umenu = cmenu;
			uprice = 6000;
			//System.out.println("umenu = "+umenu+", uprice = "+uprice);
		}else{
			result = "메뉴에 없어 주문이 불가능합니다.";
		}
		
		return result;
	}
		
		//금액 체크
		String priceCheck(int money){
			String resMsg = "";
			change = money-uprice;
			if(umenu.equals("아메리카노")){
				if(money<5000){
					resMsg = "금액이 적습니다.";
				}else if(money==5000){
					resMsg = "금액이 정확합니다.";
				}else if(money>5000){
					resMsg = "금액이 많습니다. 거스름돈 "+ change +"원을 준비해 드리겠습니다.";
				}
			}else if(umenu.equals("라떼")){
				if(money<6000){
					resMsg = "금액이 적습니다.";
				}else if(money==6000){
					resMsg = "금액이 정확합니다.";
				}else if(money>6000){
					resMsg = "금액이 많습니다. 거스름돈 "+ change +"원을 준비해 드리겠습니다.";
					
				}
			}
			
			
			return resMsg;
		}
		
		
	}
	


