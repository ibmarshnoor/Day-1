
public class Tester implements Employee{

	private int id;
	private String name;
	private int mobileNumber;

	@Override
	public void id(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}

	@Override
	public void name(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void mobile(int mobileNumber) {
		// TODO Auto-generated method stub
		this.mobileNumber=mobileNumber;
	}
            
	public static void main(String[] args) {
		assignBug();
		statusBug();
		bugReport();
	}

	private static void bugReport() {
		// TODO Auto-generated method stub
		
	}

	static void statusBug() {
		// TODO Auto-generated method stub
		
	}

	private static void assignBug() {
		// TODO Auto-generated method stub
		
	}
}
