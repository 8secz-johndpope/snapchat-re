package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;

/* renamed from: ahfm */
public final class ahfm extends TypeAdapter<ahfl> {
    private final Gson a;

    public ahfm(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final ahfl read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ahfl ahfl = new ahfl();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 1106420116 && nextName.equals("user_segments")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else if (peek == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    ArrayList arrayList = new ArrayList();
                    while (jsonReader.hasNext()) {
                        arrayList.add(peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    ahfl.a = arrayList;
                }
            }
        }
        jsonReader.endObject();
        return ahfl;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahfl ahfl) {
        if (ahfl == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahfl.a != null) {
            jsonWriter.name("user_segments");
            jsonWriter.beginArray();
            for (String value : ahfl.a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
