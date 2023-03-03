// Bryan Navarro
// May 11, 2022
// Exam 3 - Western and Eastern Horoscope
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Exam3 {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		// Menu 
		while (true) 
		{
			System.out.print("\n\tWestern and Eastern Horoscope by Bryan Navarro");
			System.out.print("\n\t=========================================================================================================");
			System.out.print("\n\t                                                 |            |                                         ");
			System.out.print("\n\t                                                 |            |                  .      .                ");
			System.out.print("\n\t JJJJJJJ                                    -----+-----       |            |   (( \\    /                ");
			System.out.print("\n\t    J                                           /|\\  ---------+--------    |   ))  \\WW/ _  _          ");
			System.out.print("\n\t    J                                         ./ | \\          |       -----+-- oo__@@\\\\/^\\/^\\       ");
			System.out.print("\n\t    J                                         /*.*.*\\         |           /|\\  Y,,,,_):\\ / ^ \\      ");
			System.out.print("\n\t    J                                       */**.   +\\*       |          / | \\      {_|:/ ^ ^ \\      ");
			System.out.print("\n\t    J     aa    v   v    aa                */*****.   \\*      |         /  |  \\_____{_\\ :\\^ ^ ^\\   ");
			System.out.print("\n\t    J    a  a   v   v   a  a               /********  .\\      |        /   |  (,____{_ \\ :\\^ ^ ^\\   /\\");
			System.out.print("\n\t    J    a  a   v   v   a  a              / .***-***. . \\     |       /    |    \\  {__{|.:|)^\\^\\^\\ <.:> ");
			System.out.print("\n\t J  J    a  a    v v    a  a             /     *.*.*     \\    |      /     |     \\{___{(,,):)  ^\\^\\ ||");
			System.out.print("\n\t J  J    a  a    v v    a  a            (((((((((-)))))))))   |     /      |  ___{____{  .:::)    ^\\||   ");
			System.out.print("\n\t  JJ      aa a    v      aa a               ...........       |    /       | (,,__{___{/  .:::)     ||    ");
			System.out.print("\n\t                                                              |   (((((((((-))))))){__(   :) .:)-._/:|    ");
			System.out.print(" \n\t                                                         +++++++++++  ...........   (,,____:)\\______/  ");
			System.out.print("\n\n\tProgramming is absolutely fun, challenging at the same time, and definitely helps in training your mind!");
			System.out.print("\n\t=========================================================================================================\n");
			System.out.println("\t\t1. You as a person");
			System.out.println("\t\t2. Compatible between you and another person");
			System.out.println("\t\t3. Display compatible list between you and a list of people");
			System.out.println("\t\t4. Output compatible list between you and a list of people");
			System.out.println("\t------------------------------------------------------------------------------------------------------");
			System.out.println("\t\t0. Exit the program");
			System.out.print("\t==========================================================================================================\n");
			
			switch (Input.getInteger("\t\tOption: ", 0, 4)) 
			{
				case 0: 
				{
					System.out.println("\tThanks for watching! \n\tThis concludes the demonstration! \n\n\tSee you next time! :D");
					System.exit(0);
				}
				case 1: 
				{
					onePerson(person);
					continue;
				}
				
				case 2: 
				{
					twoPeople(person);
					continue;
				}
				case 3: 
				{
					comparePeople('S', person);
					continue;
				}
				
				case 4: 
				{
					comparePeople('F', person);
					continue;
				}
			}
		}
	}
	
	/**
	 * Input for person
	 * @param person
	 * @param prompt
	 */
	public static void inputPerson(Person person, String prompt)
	{
		person.setFirstName(Input.getString("\t\tEnter " + prompt + " first name: "));
		person.setMiddleName(Input.getString("\t\tEnter " + prompt + " middle name: "));
		person.setLastName(Input.getString("\t\tEnter " + prompt + " last name: "));
		
		MyDate date = new MyDate();
		date.setYear(Input.getInteger("\t\tEnter " + prompt + " birth year (1922...2022): ", 1922, 2022));
		date.setMonth(Input.getInteger("\t\tEnter " + prompt + " birth month (1...12): ", 1, 12));
		if (date.isLeapYear() && date.getMonth() == 2) {
			date.setDay(Input.getInteger(String.format("\t\tEnter " + prompt + " birth day (1...%d): ", date.getMaxDay()+1), 1, date.getMaxDay()+1));
		}
		else {
			date.setDay(Input.getInteger(String.format("\t\tEnter " + prompt + " birth day (1...%d): ", date.getMaxDay()), 1, date.getMaxDay()));
		}
		person.setBirthDate(date);
	}
	
	/**
	 * Option 1 - take input and display Eastern and Western sign
	 * @param person
	 */
	public static void onePerson(Person person)
	{
		inputPerson(person, "your");
		displayPerson(person, "Your");
	}
	
	/**
	 * displays output 
	 * @param person
	 * @param prompt
	 */
	public static void displayPerson(Person person, String prompt)
	{
		System.out.printf("\n\t\t%s information:", prompt);
		System.out.println("\n\t\t--------------------------------------------------------------------------------------------");
        System.out.printf("%s\n", person);
	}
	
	/**
	 * Tests the compatibility of two people 
	 * @param person
	 */
	public static void twoPeople(Person person)
	{
		if (person.getFirstName().equals("unknown"))
		{
			System.out.println("\n\t\tERROR: Option #1 has not been performed. Please complete before selecting this option. \n");
			return;
		}
		
		Person person2 = new Person();
		inputPerson(person2, "Person#2");
		displayPerson(person, "Your");
		displayPerson(person2, "Second Person's");
		System.out.println("\n\t\tResults:");
		System.out.println("\t\t--------------------------------------------------------------------------");
		
		 if (person.getWesternHoroscope().isCompatible(person2.getWesternHoroscope())) 
		 {
	           System.out.printf("\n\t\tAccording to Western horoscope, %s is compatible with %s.", person.getFullName(), person2.getFullName());
		 }
		 else 
		 {
			 System.out.printf("\n\t\tAccording to Western horoscope, %s is NOT compatible with %s.", person.getFullName(), person2.getFullName());
		 }
		 if (person.getEasternHoroscope().isCompatible(person2.getEasternHoroscope())) 
		 {
			 System.out.printf("\n\t\tAccording to Eastern horoscope, %s is compatible with %s.\n", person.getFullName(), person2.getFullName());
		 }
		 else 
		 {
			 System.out.printf("\n\t\tAccording to Eastern horoscope, %s is NOT compatible with %s.\n", person.getFullName(), person2.getFullName());
		 }
	}
	
	/**
	 * compare to a list of people from people.txt file
	 * @param option
	 * @param person
	 * @throws Exception
	 */
	public static void comparePeople(char option, Person person) throws Exception
	{
		if (person.getFirstName().equals("unknown"))
		{
			System.out.println("\n\t\tERROR: Option#1 has not been performed. Please complete before selecting this option. \n");
			return;
		}
		
		String fileName = Input.getString("\n\t\tEnter the input data file name (PEOPLE.TXT): ");
		File obj = new File(fileName);
		if (!obj.exists()) 
		{
			System.out.printf("\n\t\tERROR: file, %s, does not exist. \n",  fileName);
			return;
		}
		
		// Creating array lists for compatible/incompatible people
		ArrayList<Person> compatibleWesternPeople = new ArrayList<Person>();
		ArrayList<Person> incompatibleWesternPeople = new ArrayList<Person>();
		ArrayList<Person> compatibleEasternPeople = new ArrayList<Person>();
		ArrayList<Person> incompatibleEasternPeople = new ArrayList<Person>();
		
		fileName = "test.txt";
		Writer writer = new FileWriter(fileName);
		
		if (option == 'F')
		{
			fileName = Input.getString("\n\t\tEnter an output file name (RESULTS.TXT): ");
			File outputFile = new File(fileName);
			if (outputFile.exists() && Input.getChar("\n\t\tFile, " + fileName + ", already existed. Do you want to overwrite (Y-yes or N-no) ?", 'Y', 'N') == 'N')
			{
				return;
			}
			
			writer = new FileWriter(fileName);
			writer.write("\n\tYour person information:");
			writer.write("\n\t-------------------------------------------------------------------------------------------------------------------------\n");
			writer.write(person.toString());
			System.out.println("\n\t\tYour file has been created.");
		}
		else 
			displayPerson(person, "Your");
		
		Scanner reader = new Scanner(obj);
		while (reader.hasNextLine()) 
		{
			String people = reader.nextLine();
			String[] array = people.split(",| |-");
			Person personList = new Person();
			personList.setFirstName(array[0]);
            personList.setMiddleName(array[1]);
            personList.setLastName(array[2]);
            
            MyDate date = new MyDate();
            date.setMonth(Integer.parseInt(array[3]));
            date.setDay(Integer.parseInt(array[4]));
            date.setYear(Integer.parseInt(array[5]));
			
            personList.setBirthDate(date);
            if (person.getWesternHoroscope().isCompatible(personList.getWesternHoroscope()))
            		compatibleWesternPeople.add(personList);
            else
            	incompatibleWesternPeople.add(personList);
            if (person.getEasternHoroscope().isCompatible(personList.getEasternHoroscope()))
            		compatibleEasternPeople.add(personList);
            else
            	incompatibleEasternPeople.add(personList);
		}
		reader.close();
		
		if(option == 'S')
		{
			System.out.println("\n\t\t1) Western horoscope compatible list:");
			System.out.println("\t\t--------------------------------------------------------------------------");
			for (int i = 0; i < compatibleWesternPeople.size(); ++i)
				System.out.printf("%s\n", compatibleWesternPeople.get(i).getWestern());
			
			System.out.println("\n\t\t2) Western horoscope incompatible list:");
			System.out.println("\t\t--------------------------------------------------------------------------");
			for (int i = 0; i < incompatibleWesternPeople.size(); ++i)
				System.out.printf("%s\n", incompatibleWesternPeople.get(i).getWestern());
			
			System.out.println("\n\t\t3) Eastern horoscope compatible list:");
			System.out.println("\t\t--------------------------------------------------------------------------");
			for (int i = 0; i < compatibleEasternPeople.size(); ++i)
				System.out.printf("%s\n", compatibleEasternPeople.get(i).getEastern());
			
			System.out.println("\n\t\t4) Eastern horoscope incompatible list:");
			System.out.println("\t\t--------------------------------------------------------------------------");
			for (int i = 0; i < incompatibleEasternPeople.size(); ++i)
				System.out.printf("%s\n", incompatibleEasternPeople.get(i).getEastern());
		}
		else 
		{
			writer.write("\n\t\t1) Western horoscope compatible list:\n");
			writer.write("\t\t--------------------------------------------------------------------------\n");
			for (int i = 0; i < compatibleWesternPeople.size(); ++i)
				writer.write(String.format("%s\n", compatibleWesternPeople.get(i).getWestern()));
			
			writer.write("\n\t\t2) Western horoscope incompatible list:\n");
			writer.write("\t\t--------------------------------------------------------------------------\n");
			for (int i = 0; i < incompatibleWesternPeople.size(); ++i)
				writer.write(String.format("%s\n", incompatibleWesternPeople.get(i).getWestern()));
			
			writer.write("\n\t\t3) Eastern horoscope compatible list:\n");
			writer.write("\t\t--------------------------------------------------------------------------\n");
			for (int i = 0; i < compatibleEasternPeople.size(); ++i)
				writer.write(String.format("%s\n", compatibleEasternPeople.get(i).getEastern()));
			
			writer.write("\n\t\t4) Eastern horoscope incompatible list:\n");
			writer.write("\t\t--------------------------------------------------------------------------\n");
			for (int i = 0; i < incompatibleEasternPeople.size(); ++i)
				writer.write(String.format("%s\n", incompatibleEasternPeople.get(i).getEastern()));
			
			writer.close();
			System.out.printf("\n\t\tFile, %s, has been saved.\n\n", fileName);
		}
	}
}
