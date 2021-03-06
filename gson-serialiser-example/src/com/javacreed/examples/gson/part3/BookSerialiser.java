package com.javacreed.examples.gson.part3;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class BookSerialiser implements JsonSerializer<Book> {

	@Override
	public JsonElement serialize(Book book, Type typeOfSrc, JsonSerializationContext context) {
		final JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("title", book.getTitle());
		jsonObject.addProperty("isbn", book.getIsbn());
		
		final JsonElement jsonAuthors = context.serialize(book.getAuthorsIds());
		jsonObject.add("authors", jsonAuthors);
		
		return jsonObject;
	}

}
