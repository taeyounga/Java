package java_20170922_Exception;
import java.util.*;
import java.time.*;
public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println("year = " +date1.getYear());
		System.out.println("month = " +date1.getMonth());
		System.out.println("time = " +date1.getTime());
		
		
		Calendar date2 = Calendar.getInstance();
		System.out.println(date2.getTime());
		date2.set(Calendar.YEAR, 2000);
		date2.set(Calendar.MONTH, 9);
		System.out.println(date2.getTime());
		System.out.println(date2.get(Calendar.YEAR));
		System.out.println(date2.get(Calendar.MONTH));
		System.out.println(date2.get(Calendar.DATE));
		System.out.println(date2.get(Calendar.HOUR));
		
		
		LocalDate date3 = LocalDate.now();
		
		System.out.println(date3);
		System.out.println(date3.getDayOfMonth());
		
	}
}
