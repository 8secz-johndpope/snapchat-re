package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aeip */
public final class aeip extends TypeAdapter<aeio> {
    private final Gson a;

    public aeip(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final aeio read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        aeio aeio = new aeio();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 110437475 && nextName.equals("is_delta")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    aeio.a = Boolean.valueOf(peek == JsonToken.STRING ? Boolean.parseBoolean(jsonReader.nextString()) : jsonReader.nextBoolean());
                }
            }
        }
        jsonReader.endObject();
        return aeio;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeio aeio) {
        if (aeio == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeio.a != null) {
            jsonWriter.name("is_delta");
            jsonWriter.value(aeio.a.booleanValue());
        }
        jsonWriter.endObject();
    }
}
