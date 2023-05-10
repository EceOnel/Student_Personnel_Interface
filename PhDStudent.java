

public class PhDStudent extends MasterStudent {
	
	private String lectureHours;

	public PhDStudent(String name , String surname , String ID , boolean hasFoodPass , String thesisName , String lectureHours){
		super(name, surname, ID , hasFoodPass , thesisName);
		this.lectureHours = lectureHours;
	}
	
	@Override
	public String toString() {
			return super.toString()+"\nLecture Hours: "+lectureHours;
	}

}
