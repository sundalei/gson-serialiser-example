package com.javacreed.examples.gson.part1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) throws IOException {
		Gson gson = new GsonBuilder().registerTypeAdapter(Book.class, new BookSerialiser()).setPrettyPrinting().create();
		
		Book book = new Book();
		book.setTitle("Java Puzzlers: Traps, Pitfalls, and Corner Cases");
		book.setIsbn10("032133678X");
		book.setIsbn13("978-0321336781");
		
		String[] authors = {"Joshua Bloch", "Neal Gafter"};
		book.setAuthors(authors);
		
		try(Writer writer = new OutputStreamWriter(new FileOutputStream("book.json"), "UTF-8")) {
			gson.toJson(book, writer);
		}
	}
}
