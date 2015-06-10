package com.solcc.library.core.models;

import org.joda.time.DateTime;

public class BookLog {

	private Long id;
	private Long bookCardId;
	private BookStatus bookStatus;
	private DateTime logDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookCardId() {
		return bookCardId;
	}

	public void setBookCardId(Long bookCardId) {
		this.bookCardId = bookCardId;
	}

	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}

	public DateTime getLogDate() {
		return logDate;
	}

	public void setLogDate(DateTime logDate) {
		this.logDate = logDate;
	}

}
