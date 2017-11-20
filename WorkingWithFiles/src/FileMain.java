import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

 	public class FileMain {
	
	private static final String peopleFile = "C:\\Users\\Admin\\Development\\personwriter.txt";
	
	
	public static void main(String[]args) throws IOException {
				
		FileMain fm = new FileMain();
		
		PersonManager personManager = new PersonManager();
				
		People steve = new People("Steve", 20, "Trainee");
		People jay = new People("Jay", 23, "Administrator");
		People bill = new People("Bill", 21, "Megalord");
		People gimli = new People("Gimli", 41, "Beard Groom");
		People girathe = new People("Girathe", 23, "Zooman");
		
		personManager.addPerson(steve);
		personManager.addPerson(jay);
		personManager.addPerson(bill);
		personManager.addPerson(gimli);
		personManager.addPerson(girathe);
		
		fm.writePeopleToFile(personManager);
		
		System.out.println("Entries:");
		for (People Person : personManager.personListing) {
			System.out.println(Person);
		}			
		
		System.out.println("\nCheck Array for reading people file using scanner");
		fm.checkScannerArrayTry(personManager);
		fm.readPeopleFromFile(personManager);
		
		System.out.println("\nUsing buffered reader:");
		fm.readFile(personManager);
		fm.checkBufferedReaderArrayTry(personManager);
		//Loop through array and write the objects to a file
		//Read the objects from the file back to an array list
		
	}
	
	private void checkScannerArrayTry(PersonManager personManager) {
		for (String person : personManager.newList) {
			System.out.println(person);
		}
		
	}
	
	private void checkBufferedReaderArrayTry(PersonManager personManager) {
		for (String person : personManager.secondNewList) {
			System.out.println(person);
		}
	}	

	public void writePeopleToFile(PersonManager personManager) {
		
		BufferedWriter peopleWriter = null;
		try {
			peopleWriter = new BufferedWriter(new FileWriter(peopleFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (People Person : personManager.personListing) {
			//Write each person to the the people file
			try {
				peopleWriter.write(Person.toString());
				peopleWriter.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
							
		}
		try {
			peopleWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFile(PersonManager personManager) {
		
		BufferedReader peopleReader = null;
		String storePeople = null;
		
		try {
			peopleReader = new BufferedReader(new FileReader(peopleFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			while ((storePeople = peopleReader.readLine()) != null) {
				String[] splittedFile = storePeople.split(",");

				for (String segment : splittedFile) {
					//System.out.println(segment);
					personManager.secondNewList.add(segment);
					
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {

			try {
				peopleReader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		People garethTest = new People(personManager.secondNewList.get(0),Integer.parseInt(personManager.secondNewList.get(1)),personManager.secondNewList.get(2));
		System.out.println(garethTest + "Wooooooo");
	}	
	
	
	public void readPeopleFromFile(PersonManager personManager) throws FileNotFoundException {
				
		Scanner peopleScanner = new Scanner(new File("C:\\Users\\Admin\\Development\\personwriter.txt"));
		System.out.println("File reader value:");
		
		while (peopleScanner.hasNext()){
		    personManager.newList.add(peopleScanner.nextLine());
		}
		
		peopleScanner.close();
		
	}
	
	
	
}
	
	
