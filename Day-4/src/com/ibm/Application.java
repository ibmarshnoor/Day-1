package com.ibm;

class Book{
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if(title==null)
		{
			throw new Exception();
		}
		this.title = title;
	}
	public String toString() {
		return this.getTitle();
	}
	
}

public class Application {
      public static void main(String[] args) {
    	  Book book=new Book();
    	  try {
			book.setTitle("Ram");
		} catch(IllegalArgumentException illwgalArgumentException) {
			
		}
    	  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  finally {
    		  System.out.println("always");
    	  }
    	  System.out.println(book.toString());
 /*   	  Book book1=new Book();
    	  try {
			book1.setTitle("Learning Javascript");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  System.out.println(book1);
*/    	  
      }
}
