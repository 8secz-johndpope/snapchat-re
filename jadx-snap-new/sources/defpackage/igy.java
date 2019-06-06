package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import java.util.Iterator;

/* renamed from: igy */
public final class igy implements igz<akrm> {
    /* renamed from: a */
    public final akrm deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement instanceof JsonArray) {
            JsonArray asJsonArray = jsonElement.getAsJsonArray();
            asJsonArray.size();
            Iterator it = asJsonArray.iterator();
            return new akrm(((JsonElement) it.next()).getAsInt(), ((JsonElement) it.next()).getAsInt(), ((JsonElement) it.next()).getAsInt(), ((JsonElement) it.next()).getAsInt(), ((JsonElement) it.next()).getAsInt(), ((JsonElement) it.next()).getAsInt(), ((JsonElement) it.next()).getAsInt());
        }
        throw new JsonParseException("Not a JsonPrimitive object.");
    }

    /* renamed from: a */
    public final JsonElement serialize(akrm akrm, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(new JsonPrimitive(Integer.valueOf(akrm.c())));
        jsonArray.add(new JsonPrimitive(Integer.valueOf(akrm.d())));
        jsonArray.add(new JsonPrimitive(Integer.valueOf(akrm.e())));
        jsonArray.add(new JsonPrimitive(Integer.valueOf(akrm.f())));
        jsonArray.add(new JsonPrimitive(Integer.valueOf(akrm.g())));
        jsonArray.add(new JsonPrimitive(Integer.valueOf(akrm.h())));
        jsonArray.add(new JsonPrimitive(Integer.valueOf(akrm.i())));
        return jsonArray;
    }
}
