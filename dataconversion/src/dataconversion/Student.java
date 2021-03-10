package dataconversion;

class Student extends Human{
	public Student(String name) {
		//this.name=name;
		name=this.name;
	}
	
	void eat()
	{
		super.eat();
		System.out.println("student eats");
	}

	private String name;
    private int age;
    private GENDER gender;
	public byte getAge() {
		return (byte) age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}