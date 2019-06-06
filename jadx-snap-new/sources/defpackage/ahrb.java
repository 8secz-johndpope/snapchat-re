package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: ahrb */
public final class ahrb extends TypeAdapter<ahra> {
    private final Gson a;
    private final Supplier<TypeAdapter<ahpp>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahpp.class)));

    public ahrb(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final ahra read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ahra ahra = new ahra();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == -234430262 && nextName.equals("updates")) {
                obj = null;
            }
            if (obj != null) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                    } else {
                        linkedTreeMap.put(nextName2, typeAdapter.read(jsonReader));
                    }
                }
                jsonReader.endObject();
                ahra.a = linkedTreeMap;
            }
        }
        jsonReader.endObject();
        return ahra;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahra ahra) {
        if (ahra == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahra.a != null) {
            jsonWriter.name("updates");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginObject();
            for (Entry entry : ahra.a.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                typeAdapter.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
