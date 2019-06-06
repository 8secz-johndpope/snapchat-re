package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: ahza */
public final class ahza extends TypeAdapter<ahyz> {
    private final Gson a;
    private final Supplier<TypeAdapter<aibe>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aibe.class)));

    public ahza(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final ahyz read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ahyz ahyz = new ahyz();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == 902182479 && nextName.equals("scheduled_lenses_info")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                ahyz.a = (aibe) ((TypeAdapter) this.b.get()).read(jsonReader);
            }
        }
        jsonReader.endObject();
        return ahyz;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahyz ahyz) {
        if (ahyz == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahyz.a != null) {
            jsonWriter.name("scheduled_lenses_info");
            ((TypeAdapter) this.b.get()).write(jsonWriter, ahyz.a);
        }
        jsonWriter.endObject();
    }
}
