
public class ArrayDemo {
      public static void main(String[] args) {
/*    	  int[] scores=new int [10];
    	  for(int i=0;i<scores.length;i++) {
    		  System.out.println(scores[i]);
    	  }
    	  int[] numbers= {1,2,3,4};
    	  for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		  }
    	  boolean[] booleans= {true,false};
    	  for (boolean value : booleans) {
    		  System.out.println(value);
		  }*/
    	  String[] names=new String[10];// create an array object with capacity=10, no string object created here
    	  for(String name:names) {
    		  name=new String("Ram");//goes to heap
    		  name="Ram";// pool of string
    		 // System.out.println(name);
    	  }
    	  //create array of 10 students
    	  Student[] students=new Student[10];
    	  for (int i = 0; i < students.length; i++) {
			Student student=new Student("Ram"+i);
			students[i]=student;
			if(i==5)
				break;
		}
    	  System.out.println("length"+students.length);
    	  for (int i = 0; i < students.length; i++) {
		    System.out.println(students[i].getName());	
		}
      }
}
class Student{
	private String name;
	
	public Student(String name) {
		super();
		this.name=name;
	}
     public void setName()
     {
    	 this.name=name;
     }
	public String getName() {
		// TODO Auto-generated method stub
		//this.name=name;
		return name;
	}

}