package com.serialization.entity;

import java.io.Serializable;

public class BookImp implements Book, Serializable{
	private static final long serialVersionUID = 1L;

	public String getTitle() {
		return "Book title sample string";
	}
}
