package com.solcc.library.core.models;

public class TestClass {

	public static void main(String args[]) {
		Book book1 = new Book();
		
		book1.setTitle("book1");
		System.out.println(book1.getTitle());
		
		Book book2 = new Book();
		book2.setTitle("book2");
		System.out.println(book2.getTitle());
	}
}
