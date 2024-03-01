package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entities.Books;
import com.lms.services.Bookservice;



@RestController
public class MyController {
	
	@Autowired
	private Bookservice  bookervice;
	
	
	// add course
	@PostMapping("/books")
	public Books addCourse(@RequestBody Books books) {
		
		return this.bookervice.addBooks(books);
		
	}
	
	
	//get the courses
	
	
		@GetMapping("/books")
		public List<Books> getBooks(){
			
			
		return this.bookervice.getBooks();	
			
			
		}
		
	
	

}
