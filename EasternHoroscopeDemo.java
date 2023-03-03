// Bryan Navarro
// May 24, 2022
// Exam 3 - Eastern Horoscope Demo

public class EasternHoroscopeDemo {

	public static void main(String[] args) {
		EasternHoroscope easternTest = new EasternHoroscope();
		
		MyDate date = new MyDate();
		date.setYear(Input.getInteger("\nEnter a valid year (1922... 2022): ", 1922, 2022));
		System.out.printf("Year: %d\n", date.getYear());
		
		date.setMonth(Input.getInteger("\nEnter a valid month(1...12): ", 1, 12));
		System.out.printf("Month: %d \nMonth Name: %s\n", date.getMonth(), date.getMonthName());
		
		if (date.isLeapYear() && date.getMonth() == 2)
			date.setDay(Input.getInteger(String.format("\nEnter your day (1...%d): ",date.getMaxDay()+1), 1, date.getMaxDay()+1));
		else
			date.setDay(Input.getInteger(String.format("\nEnter your day (1...%d): ",date.getMaxDay()), 1, date.getMaxDay()));
		
		easternTest.setDate(date);
		
		System.out.println();
		System.out.println(date);
		System.out.println(easternTest);

	}

}
