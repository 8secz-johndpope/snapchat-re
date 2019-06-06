package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aici */
public final class aici extends TypeAdapter<aich> {
    private final Gson a;

    public aici(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final aich read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        aich aich = new aich();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == -934248835 && nextName.equals("encrypted_unlockables_direct_payload")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    aich.a = peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
            }
        }
        jsonReader.endObject();
        return aich;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aich aich) {
        if (aich == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aich.a != null) {
            jsonWriter.name("encrypted_unlockables_direct_payload");
            jsonWriter.value(aich.a);
        }
        jsonWriter.endObject();
    }
}
