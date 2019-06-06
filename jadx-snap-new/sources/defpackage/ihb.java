package defpackage;

import android.net.Uri;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;

/* renamed from: ihb */
public final class ihb implements igz<Uri> {
    /* renamed from: a */
    public final Uri deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        akcr.b(jsonElement, "json");
        akcr.b(type, "typeOfT");
        akcr.b(jsonDeserializationContext, "context");
        Object parse = Uri.parse(jsonElement.getAsString());
        akcr.a(parse, "Uri.parse(json.getAsString())");
        return parse;
    }

    /* renamed from: a */
    public final JsonElement serialize(Uri uri, Type type, JsonSerializationContext jsonSerializationContext) {
        akcr.b(uri, "src");
        akcr.b(type, "typeOfSrc");
        akcr.b(jsonSerializationContext, "context");
        return new JsonPrimitive(uri.toString());
    }
}
