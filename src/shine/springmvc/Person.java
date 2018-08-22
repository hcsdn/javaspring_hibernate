package shine.springmvc;

public class Person {
	
	public Person() {
		this.name = "Spring";
	}
	
	private String name;
	public void setName(String name){
		this.name = name;		
	}
	
	public String getName(){
		return this.name;	
	}
}
