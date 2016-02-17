package com.javacreed.examples.gson.part2;

public class Book {
	private Author[] authors;

	private String isbn;

	private String title;

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		final StringBuilder formatted = new StringBuilder();
		formatted.append(title);
		formatted.append(" [").append(isbn).append("]\nWritten by:");
		for (final Author author : authors) {
			formatted.append("\n  >> ").append(author);
		}

		return formatted.toString();
	}
}
