
public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers= {7, 8, 4, 5};
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=0;j<numbers.length-i-1;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
				int swap1=numbers[j];
				numbers[j]=numbers[j+1];
				numbers[j+1]=swap1;
		      	}
			}
		}
		//System.out.println(numbers);
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		//System.out.println(counter);
	}

}
