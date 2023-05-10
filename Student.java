//import java.util.Random;
import java.util.Scanner;

public class Student implements Cafeteria, Comparable<Student>{
	private String name;
	private String surname;
	private String id;
	private boolean hasFoodPass;
	public static int studentCount = 0;
	Scanner myScanner = new Scanner(System.in);
		
/*	public Student(String name,String surname) {
		System.out.print("\nName: ");
		this.name = myScanner.nextLine();
		System.out.print("Surname: ");
		this.surname = myScanner .nextLine();
		id = "0000";
		studentCount++;
	}*/
	
	// Since taking input in constructor is not a good way to take input I changed my way and took the inputs in main class.
	
	public Student(String name , String surname , String id , boolean hasFoodPass) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.hasFoodPass = hasFoodPass;
	}
	
	public int compareTo(Student m) {
		int id = Integer.parseInt(this.id);
		int idOfM = Integer.parseInt(m.id);
		return id - idOfM;
	}
	
	/*
	 * First I added every student gets a random price but then I was not sure about does every student class type gets a different but constant price so I leaved this part as a comment line in case I understood correctly at the first time.
	@Override
	public void serveFood(){
		// Since we can use random variables I thought that every single student gets a random price for the food according to the meal that they buy. And logically I thought that  it shound'nt be expensive the 100 dollars 
		// Since they can buy things that does'nt have an integer price I made the final price double.
		Random price = new Random();
		double finalprice = price.nextInt(100);
		System.out.print("\nServing food for "+ name +" "+ surname +": ");
		if(hasFoodPass == true) {
			System.out.print("Has a food coupon, food is served.\n");
		}
		else {
			System.out.print("Does not have a food coupon.");
			System.out.print("\nThe food is $"+ finalprice+". Are you going to pay (y/n) : ");
			String choice = myScanner.nextLine();
			//since Y and y is similar and sometimes we can forget that caps lock is on so I added Y too.
			if(choice.equals("y") || choice.equals("Y")) {
				System.out.print("Food is served.\n");
			}
			// I did'nt use else if because if its not yes then it should be no, no matter if its a "n" or not.
			else {
				System.out.print("Food is not served.\n");
			}
		}
	}*/
	
	//THIS IS THE serveFood function that every student class gets different but constant price over meal.If you want to try the other function you should take this function into comment line.
	@Override
	public void serveFood(){
		System.out.print("\nServing food for "+ name +" "+ surname +": ");
		if(hasFoodPass == true) {
			System.out.print("Has a food coupon, food is served.\n");
		}
		else {
			System.out.print("Does not have a food coupon.");
			//if the input is not n,N,y,Y it should ask it again it was not mentioned in the lab sheet but it was logical thing to do.
			while(true) {
				//I did'nt want rewrite this function to every class just to change the value of the class so I did it like this it chooses the price according to the class type.
				if (this.getClass() == Student.class)
					System.out.print("\nThe food is $7. Are you going to pay (y/n) : ");
				else if (this.getClass() == MasterStudent.class)
					System.out.print("\nThe food is $10. Are you going to pay (y/n) : ");
				else if (this.getClass() == PhDStudent.class)
					System.out.print("\nThe food is $15. Are you going to pay (y/n) : ");
				String choice = myScanner.nextLine();
				//since Y and y is similar and sometimes we can forget that caps lock is on so I added Y too.
				if(choice.equals("y") || choice.equals("Y")) {
					System.out.print("Food is served.\n");
					break;
				}
				else if (choice.equals("n") || choice.equals("N")){
					System.out.print("Food is not served.\n");
					break;
				
				}
			}
		}
	}
	
	public String getId() {
		    return id;
	  }
	public String getname() {
		    return name;
	  }
	  
	public String getsurname() {
		    return surname;
	  } 
	
	public boolean gethasFoodPass(){
			return hasFoodPass;
	}
	
	
	public String toString() {
		return "\nName: "+ name +"\nSurname: "+ surname +"\nId: "+ id;
	}

}
