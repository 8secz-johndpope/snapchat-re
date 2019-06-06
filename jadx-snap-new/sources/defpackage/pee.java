package defpackage;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;

/* renamed from: pee */
public final class pee implements igz<pnw> {
    private final oom a;

    public pee(oom oom) {
        akcr.b(oom, "memoriesEditsHelper");
        this.a = oom;
    }

    /* renamed from: a */
    public final JsonElement serialize(pnw pnw, Type type, JsonSerializationContext jsonSerializationContext) {
        akcr.b(pnw, "src");
        akcr.b(type, "typeOfSrc");
        akcr.b(jsonSerializationContext, "context");
        if (((abyy) pnw.get()) != null) {
            return new JsonPrimitive(pnw.a());
        }
        Object obj = JsonNull.INSTANCE;
        akcr.a(obj, "JsonNull.INSTANCE");
        return (JsonElement) obj;
    }

    /* renamed from: a */
    public final pnw deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        akcr.b(jsonElement, "json");
        akcr.b(type, "typeOfT");
        akcr.b(jsonDeserializationContext, "context");
        String asString = jsonElement.getAsString();
        return new pnw(asString, asString != null ? this.a.a(asString) : null);
    }
}
