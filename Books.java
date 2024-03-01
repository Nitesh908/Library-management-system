

package com.lms.entities;

public class Books {
	
	private long ISBN;
	private String Author_Name;
	
	private String Title;
	
	private boolean Availability;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(long iSBN, String author_Name, String title, boolean availability) {
		super();
		ISBN = iSBN;
		Author_Name = author_Name;
		Title = title;
		Availability = availability;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor_Name() {
		return Author_Name;
	}

	public void setAuthor_Name(String author_Name) {
		Author_Name = author_Name;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public boolean isAvailability() {
		return Availability;
	}

	public void setAvailability(boolean availability) {
		Availability = availability;
	}

	@Override
	public String toString() {
		return "Library [ISBN=" + ISBN + ", Author_Name=" + Author_Name + ", Title=" + Title + ", Availability="
				+ Availability + "]";
	}
	
	

}
