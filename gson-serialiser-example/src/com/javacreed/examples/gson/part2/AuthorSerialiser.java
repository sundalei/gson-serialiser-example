package com.javacreed.examples.gson.part2;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class AuthorSerialiser implements JsonSerializer<Author> {

	@Override
	public JsonElement serialize(Author author, Type typeOfSrc, JsonSerializationContext context) {
		final JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("id", author.getId());
		jsonObject.addProperty("name", author.getName());
		
		return jsonObject;
	}
}
