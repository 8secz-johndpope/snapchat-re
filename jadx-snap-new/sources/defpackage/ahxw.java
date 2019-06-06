package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: ahxw */
public final class ahxw extends TypeAdapter<ahxv> {
    private final Gson a;

    public ahxw(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final ahxv read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ahxv ahxv = new ahxv();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == -1795333997 && nextName.equals("helpvideos_listing_last_updated")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                ahxv.a = Long.valueOf(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return ahxv;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahxv ahxv) {
        if (ahxv == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahxv.a != null) {
            jsonWriter.name("helpvideos_listing_last_updated");
            jsonWriter.value(ahxv.a);
        }
        jsonWriter.endObject();
    }
}
