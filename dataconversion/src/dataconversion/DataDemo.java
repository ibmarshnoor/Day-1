package dataconversion;

public class DataDemo {
	public static void main(String[] args)
	{
		int a=20; // 4 bytes
		long lon1=a;//8bytes
		System.out.println(lon1);
		byte byte1=(byte) a;
		System.out.println(byte1);
	}

}
