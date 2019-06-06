package defpackage;

import com.google.common.base.Preconditions;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aixw */
public final class aixw {
    private static final Logger a = Logger.getLogger(aixw.class.getName());

    private aixw() {
    }

    private static Object a(JsonReader jsonReader) {
        Preconditions.checkState(jsonReader.hasNext(), "unexpected end of JSON");
        switch (jsonReader.peek()) {
            case BEGIN_ARRAY:
                return aixw.c(jsonReader);
            case BEGIN_OBJECT:
                return aixw.b(jsonReader);
            case STRING:
                return jsonReader.nextString();
            case NUMBER:
                return Double.valueOf(jsonReader.nextDouble());
            case BOOLEAN:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case NULL:
                jsonReader.nextNull();
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder("Bad token: ");
                stringBuilder.append(jsonReader.getPath());
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static Object a(String str) {
        String str2 = "Failed to close";
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            Object a = aixw.a(jsonReader);
            return a;
        } finally {
            try {
                jsonReader.close();
            } catch (IOException e) {
                a.log(Level.WARNING, str2, e);
            }
        }
    }

    private static Map<String, Object> b(JsonReader jsonReader) {
        jsonReader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (jsonReader.hasNext()) {
            linkedHashMap.put(jsonReader.nextName(), aixw.a(jsonReader));
        }
        boolean z = jsonReader.peek() == JsonToken.END_OBJECT;
        StringBuilder stringBuilder = new StringBuilder("Bad token: ");
        stringBuilder.append(jsonReader.getPath());
        Preconditions.checkState(z, stringBuilder.toString());
        jsonReader.endObject();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static List<Object> c(JsonReader jsonReader) {
        jsonReader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (jsonReader.hasNext()) {
            arrayList.add(aixw.a(jsonReader));
        }
        boolean z = jsonReader.peek() == JsonToken.END_ARRAY;
        StringBuilder stringBuilder = new StringBuilder("Bad token: ");
        stringBuilder.append(jsonReader.getPath());
        Preconditions.checkState(z, stringBuilder.toString());
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }
}
