

public class Developer extends Employee {
	public Developer(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	void analyseBug() {
		System.out.println("analysed");
		statusBug();
		}
	STATUS statusBug() {
		System.out.println("status set");
		return(STATUS.FIXED);
	}
	void bugReport() {
			System.out.println("bug reported");
	}


}