package com.solcc.library.core.models;

import java.util.ArrayList;

public class BookCard {
	private Long id;
	private Patron patron;
	private Book book;
	private ArrayList<BookLog> bookLogList = new ArrayList<BookLog>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patron getPatron() {
		return patron;
	}

	public void setPatron(Patron patron) {
		this.patron = patron;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public ArrayList<BookLog> getBookLogList() {
		return bookLogList;
	}

	public void setBookLogList(ArrayList<BookLog> bookLogList) {
		this.bookLogList = bookLogList;
	}
}
