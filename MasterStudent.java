
public class MasterStudent extends Student {
	
	private String thesisName;
	
	public MasterStudent(String name, String surname, String ID,boolean hasFoodPass,String thesisName){
		super(name , surname , ID , hasFoodPass);
		this.thesisName = thesisName;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nThesis Name: "+thesisName;
	}

}


