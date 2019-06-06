package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agbk */
public final class agbk extends TypeAdapter<agbj> {
    private final Gson a;

    public agbk(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final agbj read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        agbj agbj = new agbj();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 573763299 && nextName.equals("mob_story_type")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    agbj.a = peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return agbj;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agbj agbj) {
        if (agbj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agbj.a != null) {
            jsonWriter.name("mob_story_type");
            jsonWriter.value(agbj.a);
        }
        jsonWriter.endObject();
    }
}
