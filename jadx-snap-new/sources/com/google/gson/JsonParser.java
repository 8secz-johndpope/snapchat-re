package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class JsonParser {
    public final JsonElement parse(JsonReader jsonReader) {
        StringBuilder stringBuilder;
        String str = " to Json";
        String str2 = "Failed parsing JSON source: ";
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            str = Streams.parse(jsonReader);
            jsonReader.setLenient(isLenient);
            return str;
        } catch (StackOverflowError e) {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(jsonReader);
            stringBuilder.append(str);
            throw new JsonParseException(stringBuilder.toString(), e);
        } catch (OutOfMemoryError e2) {
            stringBuilder = new StringBuilder(str2);
            stringBuilder.append(jsonReader);
            stringBuilder.append(str);
            throw new JsonParseException(stringBuilder.toString(), e2);
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
        }
    }

    public final JsonElement parse(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement parse = parse(jsonReader);
            if (!parse.isJsonNull()) {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return parse;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (NumberFormatException e22) {
            throw new JsonSyntaxException(e22);
        }
    }

    public final JsonElement parse(String str) {
        return parse(new StringReader(str));
    }
}
