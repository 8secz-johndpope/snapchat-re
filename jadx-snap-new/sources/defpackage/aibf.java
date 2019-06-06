package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aibf */
public final class aibf extends TypeAdapter<aibe> {
    private final Gson a;

    public aibf(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final aibe read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        aibe aibe = new aibe();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == -474240384 && nextName.equals("is_ranked")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    aibe.a = Boolean.valueOf(peek == JsonToken.STRING ? Boolean.parseBoolean(jsonReader.nextString()) : jsonReader.nextBoolean());
                }
            }
        }
        jsonReader.endObject();
        return aibe;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aibe aibe) {
        if (aibe == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aibe.a != null) {
            jsonWriter.name("is_ranked");
            jsonWriter.value(aibe.a.booleanValue());
        }
        jsonWriter.endObject();
    }
}
