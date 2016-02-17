package com.javacreed.examples.gson.part2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) throws IOException {
		Gson gson = new GsonBuilder()
				.registerTypeAdapter(Book.class, new BookSerialiser())
				.registerTypeAdapter(Author.class, new AuthorSerialiser())
				.setPrettyPrinting().create();
		
		Book book = new Book();
		book.setTitle("Java Puzzlers: Traps, Pitfalls, and Corner Cases");
		book.setIsbn("032133678X");
		
		Author author = new Author();
		author.setId(1);
		author.setName("Joshua Bloch");
		
		Author author2 = new Author();
		author2.setId(2);
		author2.setName("Neal Gafter");
		
		Author[] authors = new Author[]{author, author2};
		book.setAuthors(authors);
		
		try(Writer writer = new OutputStreamWriter(new FileOutputStream("book2.json"), "UTF-8")) {
			gson.toJson(book, writer);
		}
	}
}
