package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;

/* renamed from: afhg */
public final class afhg extends TypeAdapter<afhf> {
    private final Gson a;
    private final Supplier<TypeAdapter<afhd>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afhd.class)));

    public afhg(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final afhf read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        afhf afhf = new afhf();
        jsonReader.setLenient(true);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            if (nextName.hashCode() == -1595347456 && nextName.equals("ad_products")) {
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
                    TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            arrayList.add(typeAdapter.read(jsonReader));
                        }
                    }
                    jsonReader.endArray();
                    afhf.a = arrayList;
                }
            }
        }
        jsonReader.endObject();
        return afhf;
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afhf afhf) {
        if (afhf == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afhf.a != null) {
            jsonWriter.name("ad_products");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (afhd write : afhf.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
