package May17;

public class Student {
	private String name ;
	private int id;
	
	Student(String name,int id){
		this.name= name;
		this.id=id;
	}
	
	public void setStudent(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public int getid() {
		return this.id;
	}
}
