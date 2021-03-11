
public class VarargsDemo {
        public static void main(String[] args) {
        	int result=add("Ram",2, 3, 4, 5 ,6 ,7);
        	System.out.println(result);
        }
        static int add(String name,int... numbers) {// number of parameters 
        	int sum=0;
        	for (int i = 0; i < numbers.length; i++) {
				sum = sum+numbers[i];
			}
        	return sum;
        }
       /* static int add(int... numbers) {// varargs 
        	int sum=0;
        	for (int i = 0; i < numbers.length; i++) {
				sum = sum+numbers[i];
			}
        	return sum;
        }*/
      /*  static int add(int a,int b) {
        	return a+b;
        }*/
}

class Book{
	private String genre;
	private Author[] authors;
	Book(){
		authors=new Author[3];
	}
	class Author{
		String name;
		String email;
	}
}