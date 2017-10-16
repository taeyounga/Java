package java_20170908;

import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String list[] = new String[10];
		int i=0;
		boolean flag = true;
		
		
		while(flag){
			System.out.print("이름을 입력하십시오: ");
			list[i] = scan.next();
			i++;
			if(i==list.length){
				flag=false;
			}else if(list[i-1].equals("quit")){
				list[i-1] = null;
				flag=false;
			}else{}
		}
		if(list[i-1]==null){
			for(int j=0;j<i-1;j++){
				System.out.println(list[j]);
			}
		}else{
			for(int j=0;j<i;j++){
				System.out.println(list[j]);
			}
		}
scan.close();
}
}