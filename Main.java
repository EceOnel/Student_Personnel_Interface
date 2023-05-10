import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

enum MenuItems{
	First("1. Create a student"),
	//Second("2.Create a student with ID"),
	Second("2. Create a MasterStudent"),
	Third("3. Create a PhDStudent"),
	Fourth("4. Display all students"),
	Fifth("5. Display the student count"),
	Sixth("6. Find and remove a student"),
	Seventh("7. Add a personnel"),
	Eighth("8. Serve people waiting in cafeteria line"),
	Ninth("0. Exit");
	
	private String Choice;
	
	MenuItems(String Menu_number){
		this.Choice = Menu_number;
	}
	
	String getChoice() {
		return Choice;
	}
	
}

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Cafeteria> cafeteriaList = new ArrayList<Cafeteria>();
		Scanner myScanner = new Scanner(System.in);
					
		int number = 8;
		Scanner myInput = new Scanner( System.in );
		
		while(number!=0){
			for (MenuItems a : MenuItems.values())
				System.out.println(a.getChoice());
			number = myInput.nextInt();
			
			if(number == 1) {
				boolean hasFoodPass;
				System.out.print("\nName: ");
				String name = myScanner.nextLine();
				System.out.print("Surname: ");
				String surname = myScanner.nextLine();
				System.out.print("ID: ");
				String id = myScanner.nextLine();
				//if the input is not n,N,y,Y it should ask it again it was not mentioned in the lab sheet but it was logical thing to do.
				while(true) {
					System.out.print("Does the student have food pass (y/n): ");
					String hasFoodPassCheck = myScanner.nextLine();
					//since Y and y is similar and sometimes we can forget that caps lock is on so I added Y too.
					if(hasFoodPassCheck.equals("y") || hasFoodPassCheck.equals("Y")) {
						hasFoodPass = true;
						break;
					} 
					else if(hasFoodPassCheck.equals("n") || hasFoodPassCheck.equals("N")) {
						hasFoodPass = false;
						break;
					}
				}
				studentList.add(new Student(name, surname , id , hasFoodPass));
				cafeteriaList.add(new Student(name, surname , id , hasFoodPass));
				Student.studentCount++;
				System.out.print("\n");
			}
			
			if(number == 2) {
				boolean hasFoodPass;
				System.out.print("\nName: ");
				String name = myScanner.nextLine();
				System.out.print("Surname: ");
				String surname = myScanner.nextLine();
				System.out.print("ID: ");
				String id = myScanner.nextLine();
				//if the input is not n,N,y,Y it should ask it again it was not mentioned in the lab sheet but it was logical thing to do.
				while(true) {
					System.out.print("Does the student have food pass (y/n): ");
					String hasFoodPassCheck = myScanner.nextLine();
					//since Y and y is similar and sometimes we can forget that caps lock is on so I added Y too.
					if(hasFoodPassCheck.equals("y") || hasFoodPassCheck.equals("Y")) {
						hasFoodPass = true;
						break;
					} 
					else if(hasFoodPassCheck.equals("n") || hasFoodPassCheck.equals("N")) {
						hasFoodPass = false;
						break;
					}
				}
				System.out.print("Thesis Name: ");
				String thesisName = myScanner.nextLine();
				studentList.add(new MasterStudent(name , surname , id , hasFoodPass , thesisName));
				cafeteriaList.add(new MasterStudent(name , surname , id , hasFoodPass , thesisName));
				Student.studentCount++;
				System.out.print("\n");
			}
			
			if(number == 3) {
				boolean hasFoodPass;
				System.out.print("\nName: ");
				String name = myScanner.nextLine();
				System.out.print("Surname: ");
				String surname = myScanner.nextLine();
				System.out.print("ID: ");
				String id = myScanner.nextLine();
				//if the input is not n,N,y,Y it should ask it again it was not mentioned in the lab sheet but it was logical thing to do.
				while(true) {
					System.out.print("Does the student have food pass (y/n): ");
					String hasFoodPassCheck = myScanner.nextLine();
					//since Y and y is similar and sometimes we can forget that caps lock is on so I added Y too.
					if(hasFoodPassCheck.equals("y") || hasFoodPassCheck.equals("Y")) {
						hasFoodPass = true;
						break;
					} 
					else if(hasFoodPassCheck.equals("n") || hasFoodPassCheck.equals("N")) {
						hasFoodPass = false;
						break;
					}
				}
				System.out.print("Thesis Name: ");
				String thesisName = myScanner.nextLine();
				System.out.print("Lecture Hours: ");
				String lectureHours = myScanner.nextLine();
				studentList.add(new PhDStudent(name , surname , id , hasFoodPass , thesisName , lectureHours));
				cafeteriaList.add(new PhDStudent(name , surname , id , hasFoodPass , thesisName , lectureHours));
				Student.studentCount++;
				System.out.print("\n");
			}
			
			if(number == 4) {
				//Collections.shuffle(studentList);
				//System.out.println("\nList is shuffled...");
				Collections.sort(studentList);
				System.out.println("\nList is sorted...");
				Iterator<Student> iterator1 = studentList.iterator();
				while(iterator1.hasNext()){
					System.out.println(iterator1.next());
				}
				System.out.print("\n");
			}
			
			if(number == 5) {
				System.out.println("\nThe number of created student objects: " + Student.studentCount);
				System.out.print("\n");
			}
			
			if(number == 6) {
				System.out.print("\nEnter the student ID to search the list: ");
				String id = myScanner.nextLine();
				Iterator<Student> iterator = studentList.iterator();
				while(iterator.hasNext()){
					Student currentStudent= iterator.next();
					String currentId = currentStudent.getId();
					//System.out.println("\n current id: "  +currentId); to check if they are correct 
					//System.out.println("\n id: "  +id);
					if(currentId.equals(id)){
						System.out.println("\nFound "+ currentStudent.getname() +" "+ currentStudent.getsurname());
						System.out.println("Removing...");
						iterator.remove();
						//since we removed one student we need to decrease the student number too (this is not mentioned in the lab sheet but I did it because this makes sense)
						Student.studentCount--;
					}
				}
				System.out.print("\n");
			}
			
			if(number == 7) {
				System.out.print("\nName: ");
				String name = myScanner.nextLine();
				System.out.print("Surname: ");
				String surname = myScanner.nextLine();
				cafeteriaList.add(new Personnel(name , surname));
				System.out.print("\n");
			}
			
			if(number == 8) {
				Iterator<Cafeteria> iterator2 = cafeteriaList.iterator();
				System.out.println("\nInitiating food service...");
				while(iterator2.hasNext()){
					iterator2.next().serveFood();
				
				}
				System.out.print("\n");
			}
		}
		myScanner.close();
		myInput.close();
	}
}
	