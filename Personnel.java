
public class Personnel implements Cafeteria {
	private String name;
	private String surname;
	
	public Personnel(String name , String surname){
		this.name = name;
		this.surname = surname;
	}

	
	@Override
	public void serveFood(){
		System.out.print("\nServing food for "+ name + " " + surname+": Is a personnel, so food is served.\n");
	}
}
