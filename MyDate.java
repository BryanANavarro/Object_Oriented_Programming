// Bryan Navarro
// May 17, 2022
// Exam 3 - My Date

public class MyDate {
	final private String dayName[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	final private String monthName[] = {"unknown", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	final static int daysInMonth[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	private int year;
	private int month;
	private int day;
	
	/**
	 * returns the day of the week
	 * @return
	 */
	private int ZellerCongruence()
	{
		int m = month;
		int y = year;
		if (m == 1)
		{
			m = 13;
			--y;
		}
		else if (m == 2)
		{
			m = 14;
			--y;
		}
		
		int q = day;
		int k = y % 100;
		int j = y / 100;
		int h = (q + 13 * (m + 1) / 5 + k + k/4 + j/4 + 5 * j) % 7;
		return h;

	}
	
	/**
	 * no argument constructor
	 */
	public MyDate()
	{
		year = 0;
		month = 0;
		day = 0;
	}
	
	/**
	 * Mutator for year
	 * @param newYear
	 */
	public void setYear(int newYear)
	{
		year = newYear;
	}
	
	/**
	 * Accessor for year
	 * @return
	 */
	public int getYear()
	{
		return year;
	}
	
	/**
	 * Mutator for month
	 * @param newMonth
	 */
	public void setMonth(int newMonth)
	{
		month = newMonth;
	}
	
	/**
	 * Accessor for month
	 * @return
	 */
	public int getMonth()
	{
		return month;
	}
	
	/**
	 * Mutator for day
	 * @param d
	 */
	public void setDay(int d)
	{
		day = d;
	}
	
	/**
	 * Accessor for day
	 * @return
	 */
	public int getDay()
	{
		return day;
	}
	
	/**
	 * Accessor for max days in a month
	 * @return
	 */
	public int getMaxDay()
	{
		return daysInMonth[month];
	}
	
	/**
	 * Accessor for month name
	 * @return
	 */
	public String getMonthName()
	{
		return monthName[month];
	}
	
	/**
	 * Determines leap year
	 * @return
	 */
	public boolean isLeapYear()
	{
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}
	
	/**
	 * Returns output
	 */
	public String toString()
	{
		String temp = "";
		temp += dayName[ZellerCongruence()] + ", ";
		temp += getMonthName() + " ";
		temp += Integer.toString(day);
		switch (day)
		{
		case 1, 21, 31: temp += "st"; break;
		case 2, 22: temp += "nd"; break;
		case 3, 23: temp += "rd"; break;
		default: temp += "th"; 
		}
		temp += ", " + Integer.toString(year);
		return temp;
	}
	
	
}
