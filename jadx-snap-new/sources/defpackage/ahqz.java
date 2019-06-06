package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: ahqz */
public final class ahqz extends TypeAdapter<ahqy> {
    private final Gson a;

    public ahqz(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final ahqy read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ahqy ahqy = new ahqy();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 53903425 && nextName.equals("out_beta")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    ahqy.a = peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return ahqy;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahqy ahqy) {
        if (ahqy == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahqy.a != null) {
            jsonWriter.name("out_beta");
            jsonWriter.value(ahqy.a);
        }
        jsonWriter.endObject();
    }
}
