// Bryan Navarro
// May 24, 2022
// Exam 3 - Western Horoscope

public class WesternHoroscope extends MyDate {
	private String WesternSign[];
	
	/**
	 * No argument constructor
	 */
	public WesternHoroscope()
	{
		super();
		WesternSign = new String[13];
		
		WesternSign[0] = "unknown";
		WesternSign[1] = "Capricorn - Ambitious, pessimistic, and responsible";
		WesternSign[2] = "Aquarius - Unique, idealistic, and friendly";
		WesternSign[3] = "Pisces - Creative, empathetic, and intuitive";
		WesternSign[4] = "Aries - Courageous, passionate, and confident";
		WesternSign[5] = "Taurus - Reliable, stubborn, and patient";
		WesternSign[6] = "Gemini - Social, impulsive, and intelligent";
		WesternSign[7] = "Cancer - Sensitive, nostalgic, and protective";
		WesternSign[8] = "Leo - Generous, self-centered, and charismatic";
		WesternSign[9] = "Virgo - perfectionist, critical, and hard-workings";
		WesternSign[10] = "Libra - clever, indecisive, and charming";
		WesternSign[11]= "Scorpio - Mysterious, private, and loyal";
		WesternSign[12] = "Sagittarius - Honest, optimistic, and independent";
	}
	
	/**
	 * Mutator for My Date
	 * @param newDate
	 */
	public void setDate(MyDate newDate)
	{
		super.setDay(newDate.getDay());
		super.setMonth(newDate.getMonth());
		super.setYear(newDate.getYear());
	}
	
	/**
	 * returns the index of Western Sign
	 * @return
	 */
	public int getIndex()
	{
		int day = super.getDay();
		int month = super.getMonth();
		switch (month)
		{
		case 1: 
			return (day <= 21) ? 1: 2;
		case 2: 	
			return (day <= 18) ? 2: 3;
		case 3: 
			return (day <= 20) ? 3: 4;
		case 4: 
			return (day <= 20) ? 4: 5;
		case 5: 
			return (day <= 20) ? 5: 6;
		case 6: 
			return (day <= 20) ? 6: 7;
		case 7: 
			return (day <= 22) ? 7: 8;
		case 8: 
			return (day <= 22) ? 8: 9;
		case 9: 
			return (day <= 21) ? 9: 10;
		case 10: 
			return (day <= 20) ? 10: 11;
		case 11: 
			return (day <= 20) ? 11: 12;
		case 12: 
			return (day <= 21) ? 12: 1;
		default:
			return 0;
		}
	}
	
	/**
	 * Accessor for Western Sign
	 * @return
	 */
	public String getSign()
	{
		return WesternSign[getIndex()];
	}
	
	/**
	 * Determines the compatible people
	 * @param obj
	 * @return
	 */
	public boolean isCompatible(WesternHoroscope obj)
	{
		int person1 = getIndex();
		int person2 = obj.getIndex();
		
		if ((person1 == 1 || person1 == 5 || person1 == 9) && (person2 == 1 || person2 == 5 || person2 == 9))
			return true;
		else if ((person1 == 2 || person1 == 6 || person1 == 10) && (person2 == 2 || person2 == 6 || person2 == 10))
			return true;
		else if ((person1 == 3 || person1 == 7 || person1 == 11) && (person2 == 3 || person2 == 7 || person2 == 11))
			return true;
		else if ((person1 == 4 || person1 == 8 || person1 == 12) && (person2 == 4 || person2 == 8 || person2 == 12))
			return true;
		else
			return false;
	}
	
	/**
	 * returns output
	 */
	public String toString()
	{
		return getSign();
	}
}
