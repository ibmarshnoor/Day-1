
public class InnerClassDemo {
     public static void main(String[] args) {
    	 Account[] accounts=new Account[10];
    	/* for (int i = 0; i < accounts.length; i++) {
			Account account=new Account("ABC"+i);
		}*/
     }
}

class Account{
//  private Address address;	
	private Address[] addresses;//multiple addresses can be handled
	private int number;
	public Account() {
	     this.addresses=new Address[3];
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] address) {
		this.addresses = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	private class Address{
		private String streetName;
	}
}