package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aekt */
public final class aekt extends TypeAdapter<aeks> {
    private final Gson a;

    public aekt(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final aeks read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        aeks aeks = new aeks();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == -636270765 && nextName.equals("feed_iter_token")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    aeks.a = peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return aeks;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeks aeks) {
        if (aeks == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeks.a != null) {
            jsonWriter.name("feed_iter_token");
            jsonWriter.value(aeks.a);
        }
        jsonWriter.endObject();
    }
}
