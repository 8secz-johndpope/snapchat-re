package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: ahzc */
public final class ahzc extends TypeAdapter<ahzb> {
    private final Gson a;
    private final Supplier<TypeAdapter<aibu>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aibu.class)));

    public ahzc(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* renamed from: a */
    public final defpackage.ahzb read(com.google.gson.stream.JsonReader r7) {
        /*
        r6 = this;
        r0 = r7.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r7.nextNull();
        r7 = 0;
        return r7;
    L_0x000d:
        r0 = new ahzb;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x00cb;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -1867191211; // 0xffffffff90b4ec55 float:-7.136161E-29 double:NaN;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = -1330421716; // 0xffffffffb0b3602c float:-1.3051298E-9 double:NaN;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "deeplink_properties";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 0;
        goto L_0x0048;
    L_0x003d:
        r4 = "relative_time_components";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 1;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x008d;
    L_0x004a:
        if (r2 == r1) goto L_0x0050;
    L_0x004c:
        r7.skipValue();
        goto L_0x0019;
    L_0x0050:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0059;
    L_0x0058:
        goto L_0x0095;
    L_0x0059:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x005d:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x006d:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0087;
    L_0x0073:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x007f;
    L_0x007b:
        r7.nextNull();
        goto L_0x006d;
    L_0x007f:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x006d;
    L_0x0087:
        r7.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x008d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0095:
        r7.nextNull();
        goto L_0x0019;
    L_0x0099:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x00a1:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x00c4;
    L_0x00a7:
        r3 = r7.nextName();
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x00bc;
    L_0x00b3:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x00c0;
    L_0x00bc:
        r4 = r7.nextString();
    L_0x00c0:
        r2.put(r3, r4);
        goto L_0x00a1;
    L_0x00c4:
        r7.endObject();
        r0.a = r2;
        goto L_0x0019;
    L_0x00cb:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzc.read(com.google.gson.stream.JsonReader):ahzb");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahzb ahzb) {
        if (ahzb == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahzb.a != null) {
            jsonWriter.name("deeplink_properties");
            jsonWriter.beginObject();
            for (Entry entry : ahzb.a.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahzb.b != null) {
            jsonWriter.name("relative_time_components");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aibu write : ahzb.b) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
