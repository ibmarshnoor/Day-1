import dataconversion.Human;

public class Student extends Human {
	
	private byte age;
	void study() {
	System.out.println(getName()+"is studying");
	}
	
	Student(){
	}
	
	Student(String name)
	{
		//this.name=name;
		setName(name);
	}

}
