package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aekr */
public final class aekr extends TypeAdapter<aekq> {
    private final Gson a;

    public aekr(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final aekq read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        aekq aekq = new aekq();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 110541305 && nextName.equals("token")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    aekq.a = peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return aekq;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aekq aekq) {
        if (aekq == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aekq.a != null) {
            jsonWriter.name("token");
            jsonWriter.value(aekq.a);
        }
        jsonWriter.endObject();
    }
}
