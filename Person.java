// Bryan Navarro
// May 24, 2022
// Exam 3 - Person

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private MyDate birthDate;
	private WesternHoroscope westernSign;
	private EasternHoroscope easternSign;
	
	/**
	 * 5 argument Constructor
	 */
	public Person()
	{
		firstName = "unknown";
		middleName = "unknown";
		lastName = "unknown";
		birthDate = new MyDate();
		westernSign = new WesternHoroscope();
		easternSign = new EasternHoroscope();
	}
	
	/**
	 * Mutator for first name
	 * @param name
	 */
	public void setFirstName(String name)
	{
		firstName = name;
		do
		 {
			 if (firstName.isBlank())
			 {
				 System.out.println("\t\tERROR: Input value must contain at least one character.");
				 firstName = (Input.getString("\t\tEnter first name: "));
				 continue;
			 }
			 else
				 break;
		 }while (true);
	}
	
	/**
	 * Accessor for first name
	 * @return
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Mutator for middle name
	 * @param name
	 */
	public void setMiddleName(String name)
	{
		middleName = name;
		do
		 {
			 if (middleName.isBlank())
			 {
				 System.out.println("\t\tERROR: Input value must contain at least one character.");
				 middleName = (Input.getString("\t\tEnter middle name: "));
				 continue;
			 }
			 else
				 break;
		 }while (true);
	}
	
	/**
	 * Accessor for middle name
	 * @return
	 */
	public String getMiddleName()
	{
		return middleName;
	}
	
	/**
	 * Mutator for last name
	 * @param name
	 */
	public void setLastName(String name)
	{
		lastName = name;
		do
		 {
			 if (lastName.isBlank())
			 {
				 System.out.println("\t\tERROR: Input value must contain at least one character.");
				 lastName = (Input.getString("\t\tEnter last name: "));
				 continue;
			 }
			 else
				 break;
		 }while (true);
	}
	
	/**
	 * Accessor for last name
	 * @return
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * returns full name 
	 * @return
	 */
	public String getFullName()
	{
		return String.format("%s %s. %s", getFirstName(), getMiddleName().charAt(0), getLastName());
	}
	
	/**
	 * Mutator for birth date
	 * @param date
	 */
	public void setBirthDate(MyDate date)
	{
		birthDate = date;
		westernSign.setDate(date);
		easternSign.setDate(date);
	}
	
	/**
	 * Accessor for birth date
	 * @return
	 */
	public MyDate getBirthDate()
	{
		return birthDate;
	}
	
	/**
	 * Returns western horoscope
	 * @return
	 */
	public WesternHoroscope getWesternHoroscope()
	{
		return westernSign;
	}
	
	/**
	 * returns eastern horoscope
	 * @return
	 */
	public EasternHoroscope getEasternHoroscope()
	{
		return easternSign;
	}
	
	/**
	 * returns western horoscope output
	 * @return
	 */
	public String getWestern()
	{
		String temp = "";
		temp += String.format("\t\tName:		%s\n", getFullName());
		temp += String.format("\t\tBirthdate:	%s\n", birthDate);
		temp += String.format("\t\tWestern Sign:	%s\n", westernSign);
		return temp;
	}
	
	/**
	 * returns eastern horoscope output
	 * @return
	 */
	public String getEastern()
	{
		String temp = "";
		temp += String.format("\t\tName:		%s\n", getFullName());
		temp += String.format("\t\tBirthdate:	%s\n", birthDate);
		temp += String.format("\t\tEastern Sign:	%s\n", easternSign);
		return temp;
	}
	
	/**
	 * returns output
	 */
	public String toString()
	{
		String temp = "";
		temp += String.format("\t\tName:		%s\n", getFullName());
		temp += String.format("\t\tBirthdate:	%s\n", birthDate);
		temp += String.format("\t\tWestern Sign:	%s\n", westernSign);
		temp += String.format("\t\tEastern Sign:	%s\n", easternSign);
		return temp;
		
	}
	
}
