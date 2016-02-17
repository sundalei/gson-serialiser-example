package com.javacreed.examples.gson.part2;

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
		
		JsonElement jsonAuthorsArray = context.serialize(book.getAuthors());

		jsonObject.add("authors", jsonAuthorsArray);

		return jsonObject;
	}
}
