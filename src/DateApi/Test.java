package DateApi;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) 
	{

		LocalDate date= LocalDate.now();
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		
		System.out.println(dd+"/"+mm+"/"+yy);
		
	}

}
