package java_20170912_obj;
import java.util.Scanner;
public class Park {

	public static void main(String[] args) {
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		//개체 생성
		Person john = new Person();
		VendingMachine vm = new VendingMachine();
		boolean flag1 = true, flag2 = true;
		//FLOW: (기계)메뉴표시-> (사람)돈투입 -> (기계)돈체크 -> (기계)커피제조
		
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
