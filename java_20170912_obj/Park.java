package java_20170912_obj;
import java.util.Scanner;
public class Park {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		//��ü ����
		Person john = new Person();
		VendingMachine vm = new VendingMachine();
		boolean flag1 = true, flag2 = true;
		//FLOW: (���)�޴�ǥ��-> (���)������ -> (���)��üũ -> (���)Ŀ������
		
		vm.showMenu();
		while(flag1){
			if(vm.checkMoney(john.insertMoney())){
				flag1 = false;
			}else{
			}
		}
		while(flag2){
			if(vm.getDrink(john.choose())){
				flag2 = false;
			}else{
				vm.checkMoney(john.insertMoney());
			}
		}
		john.takeChange(vm.giveChange());
		scan.close();
	}

}
