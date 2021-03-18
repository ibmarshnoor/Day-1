
public class Manager implements Employee{

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
		acknowledgeBug();
	}

	private static void acknowledgeBug() {
		// TODO Auto-generated method stub
		
	}

	private static void assignBug() {
		// TODO Auto-generated method stub
		
	}

}
