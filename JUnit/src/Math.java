
public class Math {
     public int add(int... numbers) {
    	 int sum=0;
    	 for (int i = 0; i < numbers.length; i++) {
			sum=sum+numbers[i];
		}
    	 return sum;
     }
     int multiply(int...numbers) {
    	 int result=1;
    	 for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<0) {
            	throw new IllegalArgumentException();
            }
			result=result*numbers[i];
		}
    	 return result;
     }
}
//add should take any numbers of integers return the value