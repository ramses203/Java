package chapter05;

public class MyDateTest {

	public static void main(String[] args) {
 
		
		MyDate date1 = new MyDate();
		
		date1.setDay(day);
		date1.setmonth(month);
		date1.setyear(year);

        date1.getDay(day);
        date1.getMonth(month);
        date1.getYear(year);
        System.out.println();
		
        
        
	}
		
		
		
		
		
		
		
		
		
		
		
		MyDate date1 = new MyDate(30,2,2000));
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2,10,2006);
		System.out.println(date2.isvalid());
		
	}

}
