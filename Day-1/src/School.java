
public class School {
	public static void main(String[] args) {
		int i=0;
		//teacher.setAge((byte)34);
		/*for(int i=0;i<10;i++)
		{
			Teacher teacher=new Teacher("Sham"+i);		
		}
		while(i<10)
		{
			System.out.println();("Rss"+j);
			j++;
		}*/
 	printPattern();
		
	//	System.out.println("Name:"+teacher.getName());
	//	System.out.println("Name:"+teacher.getAge());
	}
	public static void printPattern()
	{
		for(int k=1;k<=5;k++)
		{
			for(int j=1;j<=k;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
	void studentDiscussion() {
		System.out.println("Hello");
		Student st1=new Student("Ram");
		st1.setAge((byte)10);
		//st1.name="Ram";
		//st1.setName(" ");
		System.out.println("Name:"+st1.getName());
     	System.out.println("Age:"+st1.getAge());
	}

}
