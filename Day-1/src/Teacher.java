import dataconversion.Human;

public class Teacher extends Human{
 private String name;
 private byte age;
 private String sub;
 private float salary;
public Teacher(String name) {
	setName(name);
}

public String getSub() {
	return sub;
}
public void setSub(String sub) {
   this.sub = sub;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
