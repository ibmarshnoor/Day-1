package com.ibm.map;

import java.util.HashMap;
import java.util.Map;
import com.ibm.Book;

public class MaoDemo {
	
	
	public static void main(String[] args) {
		createMapofBooks();
	}
     
	private static void createMapofBooks() {
		Map<String, Book> books=new HashMap<String, Book>();
		System.out.println(books.size());
		//Book book1=new Book("java");
		//books.put("book1",book1);
		//System.out.println(books.size());
		for(int i=0;i<10;i++) {
			Book book1=new Book("java"+i);
			books.put("book"+i, book1);
		}
		books.remove("book2");
		//books.containsKey();
;		System.out.println(books.size());
	}
}
