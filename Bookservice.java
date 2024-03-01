package com.lms.services;

import java.util.List;

import com.lms.entities.Books;

public interface Bookservice {

		public List<Books> getBooks();
		
		
		
		public Books addBooks(Books books);
	
}
