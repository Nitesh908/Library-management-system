package com.lms.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lms.entities.Books;


@Service
public class BooksserviceIml implements Bookservice {


	List<Books> list;
	


	public BooksserviceIml() {
		
		list = new ArrayList<>();
		
		list.add(new Books(1111,"JeffKiller", "Attitude is Everything",true));
		
		list.add(new Books(1112," power of subconcious Mind ", "Joseph Murphy",true));
		
		
	}



	@Override
	public List<Books> getBooks() {
		// TODO Auto-generated method stub
		return list;
	}







	@Override
	public Books addBooks(Books books) {
		// TODO Auto-generated method stub
		
		list.add(books);
		return books;
	}

}
