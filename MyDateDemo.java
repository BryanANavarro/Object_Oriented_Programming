// Bryan Navarro
// May 17, 2022
// Exam 3 - My Date Demo

public class MyDateDemo {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		date.setYear(Input.getInteger("\nEnter a valid year (1922... 2022): ", 1922, 2022));
		System.out.printf("year: %d\n", date.getYear());
		
		date.setMonth(Input.getInteger("\nEnter a valid month(1...12): ", 1, 12));
		System.out.printf("month: %d\n" , date.getMonth());
		
		System.out.printf("Name: %s\n", date.getMonth(), date.getMonthName());
		
		if (date.isLeapYear() && date.getMonth() == 2)
			date.setDay(Input.getInteger(String.format("\nEnter your day (1...%d): ", date.getMaxDay()+1), 1, date.getMaxDay()+1));
		else
			date.setDay(Input.getInteger(String.format("\nEnter your day (1...%d): ", date.getMaxDay()), 1, date.getMaxDay()));
		
		System.out.println(date);
		
	}

}
