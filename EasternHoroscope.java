// Bryan Navarro
// May 24, 2022
// Exam 3 - Eastern Horoscope

public class EasternHoroscope extends MyDate {
	private String EasternSign[];
	
	/**
	 * No argument Constructor
	 */
	public EasternHoroscope()
	{
		super();
		EasternSign = new String[13];
		
		EasternSign[0] = "unknown";
		EasternSign[1] = "Monkey - wise, intelligent, confident, charismatic, loyal, and inventive";
		EasternSign[2] = "Rooster - beautiful, kind-hearted, hard-working, courageous, independent, humorous and honest";
        EasternSign[3] = "Dog - honest, friendly, faithful, loyal, smart, straightforward, and responsible";
        EasternSign[4] = "Pig - happy, easygoing, honest, trusting, educated, sincere and brave";
        EasternSign[5] = "Rat - intelligent, charming, quick-witted, practical, and ambitious";
        EasternSign[6] = "Ox - hard working, honest, creative, ambitious, cautious, and patient";
        EasternSign[7] = "Tiger - friendly, brave, competitive, charming and endowed with authority";
        EasternSign[8] = "Rabbit - kind-hearted, friendly, intelligent, cautious, skillful, and gentle";
        EasternSign[9] = "Dragon - powerful, kind-hearted, successful, innovative, brave, and courageous";
        EasternSign[10] = "Snake - wise, discreet, agile, attractive and full of sympathy";
        EasternSign[11] = "Horse - clever, active, energetic, quick-witted, fashionable, and agile";
        EasternSign[12] = "Goat - polite, mild mannered, shy, imaginative, determined and well-mannered";
	}
	
	/**
	 * Mutator for MyDate
	 * @param newDate
	 */
	public void setDate(MyDate newDate)
	{
		super.setDay(newDate.getDay());
		super.setMonth(newDate.getMonth());
		super.setYear(newDate.getYear());
	}
	
	/**
	 * Returns the index of Eastern Sign
	 * @return
	 */
	public int getIndex() 
	{
        return super.getYear() % 12 + 1;
    }
	
	/**
	 * Accessor for Eastern Sign
	 * @return
	 */
	public String getSign()
	{
		return EasternSign[getIndex()];
	}
	
	/**
	 * Determines the compatible people
	 * @param obj
	 * @return
	 */
	public boolean isCompatible(EasternHoroscope obj)
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
