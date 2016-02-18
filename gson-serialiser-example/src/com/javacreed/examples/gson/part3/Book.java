package com.javacreed.examples.gson.part3;

public class Book {
	private Author[] authors;
	
	private String title;
	
	private String isbn;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	
	public int[] getAuthorsIds() {
		final int[] ids = new int[authors.length];
		for(int i = 0; i < authors.length; i++) {
			ids[i] = authors[i].getId();
		}
		return ids;
	}
}
