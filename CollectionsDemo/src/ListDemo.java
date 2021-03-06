import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;

public class ListDemo{
	public static void main(String[] args) {
    	  //demo1();
    	  bookList();
      }
      private static void bookList() {
    	  List<Book> books=new ArrayList<Book>();
    	  Book book1=new Book("learn Java");
    	  book1.setPrice(100.0f);
    	  book1.setPublisherYear(2002);
    	  books.add(book1);
          Book book2=new Book("Learn Javascript");
          book2.setPrice(20.f);
          books.add(book2);
          book2.setPublisherYear(2006);
    	//  System.out.println(books);
    	  
    /*Iterator<Book> it=books.iterator();
    	  while (it.hasNext()) {
			Book book = (Book) it.next();
			if(book.getTitle().contains("learn")) {
			System.out.println(book);
		}
		}*///sorting
    	  //sort the books in ascending order of price
    	 /* books.sort(new Comparator<Book>() {
    		  
    		  public int compare(Book book1,Book book2) {
    			 return (int)(book1.getPrice()-book2.getPrice());
    		  }
    	  });
    	  System.out.println("after sorting="+books);*/
          books.sort(new Comparator<Book>() {
    		  
    		  public int compare(Book book1,Book book2) {
    			 return (int)(book1.getPublisherYear()-book2.getPublisherYear());
    		  }
    	  });
    	  System.out.println("after sorting="+books);
     }
      private static void demo1(){
    	  List<Integer> list=new ArrayList<Integer>();
    	  list.add(1);
    	  list.add(3);
    	  System.out.println("before= "+list);
    	 // list.remove(1);
    	  System.out.println(list.contains(3));
    	  System.out.println("after= "+list);
    	  
    	 for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
      }
}
