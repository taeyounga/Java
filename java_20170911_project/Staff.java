package java_20170911_project;

public class Staff {
	//������(�Ӽ�)����
	String umenu = "";
	int uprice;
	int change;
	
	//�޼ҵ� ����
	//�޴��� üũ�Ѵ�(){}
	String menuCheck(String cmenu){
		//Customer�� �ֹ� �޴��� �޴��� ����Ʈ ��
		String result= "";
		
		if(cmenu.equals("�Ƹ޸�ī��")){
			result = "�ֹ��� �����մϴ�.";
			umenu = cmenu;
			uprice = 5000;
			//System.out.println("umenu = "+umenu+", uprice = "+uprice);
			
		}else if(cmenu.equals("��")){
			result = "�ֹ��� �����մϴ�.";
			umenu = cmenu;
			uprice = 6000;
			//System.out.println("umenu = "+umenu+", uprice = "+uprice);
		}else{
			result = "�޴��� ���� �ֹ��� �Ұ����մϴ�.";
		}
		
		return result;
	}
		
		//�ݾ� üũ
		String priceCheck(int money){
			String resMsg = "";
			change = money-uprice;
			if(umenu.equals("�Ƹ޸�ī��")){
				if(money<5000){
					resMsg = "�ݾ��� �����ϴ�.";
				}else if(money==5000){
					resMsg = "�ݾ��� ��Ȯ�մϴ�.";
				}else if(money>5000){
					resMsg = "�ݾ��� �����ϴ�. �Ž����� "+ change +"���� �غ��� �帮�ڽ��ϴ�.";
				}
			}else if(umenu.equals("��")){
				if(money<6000){
					resMsg = "�ݾ��� �����ϴ�.";
				}else if(money==6000){
					resMsg = "�ݾ��� ��Ȯ�մϴ�.";
				}else if(money>6000){
					resMsg = "�ݾ��� �����ϴ�. �Ž����� "+ change +"���� �غ��� �帮�ڽ��ϴ�.";
					
				}
			}
			
			
			return resMsg;
		}
		
		
	}
	


