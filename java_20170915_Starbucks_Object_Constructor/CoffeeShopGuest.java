package java_20170915_Starbucks_Object_Constructor;
import java.util.Scanner;
public class CoffeeShopGuest {
	//Field
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	//Method
	public String order(){
		System.out.print("��(�ֹ����μ���): ");
		return scan.next();
	}
	
	public int menuChoice(){
		System.out.print("��(�޴���ȣ����): ");
		return scan.nextInt();
	}
	
	public int payment(){
		System.out.print("��(���ұݾ� ����): ");
		return scan.nextInt();
	}
}
