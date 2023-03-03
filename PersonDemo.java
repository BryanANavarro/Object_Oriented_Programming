// Bryan Navarro
// May 24, 2022
// Exam 3 - Person Demo

public class PersonDemo {

	public static void main(String[] args) {
		
		 final Person person1 = new Person();
		 person1.setFirstName(Input.getString("\nEnter person's first name: "));
		 person1.setMiddleName(Input.getString("Enter person's middle name: "));
		 person1.setLastName(Input.getString("Enter person's last name: "));
		 person1.setBirthDate(inputDate());
		 System.out.printf("\n%s\n", person1);
	}
	
	public static MyDate inputDate() {
		MyDate date = new MyDate();
		date.setYear(Input.getInteger("Enter his/her birth year (1922...2022): ", 1921, 2021));
		date.setMonth(Input.getInteger("Enter his/her birth month number (1...12): ", 1, 12));
		if (date.isLeapYear() && date.getMonth() == 2) {
			date.setDay(Input.getInteger(String.format("Enter his/her birth day (1...%d): ", date.getMaxDay()+1, 1, date.getMaxDay()+1)));
		}
		else {
			date.setDay(Input.getInteger(String.format("Enter his/her birth day (1...%d): ", date.getMaxDay()), 1, date.getMaxDay()));
		}
		return date;
	}
}
