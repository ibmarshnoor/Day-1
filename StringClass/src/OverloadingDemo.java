import java.util.logging.Logger;

public class OverloadingDemo {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.study();
	//	s1.study(1);
	//	s1.study(1,"Maths");
	}

}

//same method name, different number and type of arguments, access could be anything
class Student1{
	public void study(int duration,String subject) {
		System.out.println("study.. for "+duration+" hour "+subject);
	}
	public void study(int duration) {
		System.out.println("study.. for "+duration+" hour ");
	}
	public static void study() {
		System.out.println("study...");
	}
}
	
