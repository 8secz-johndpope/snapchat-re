package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agfd */
public final class agfd extends TypeAdapter<agfc> {
    private final Gson a;
    private final Supplier<TypeAdapter<agfa>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(agfa.class)));

    public agfd(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* renamed from: a */
    public final defpackage.agfc read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new agfc;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x008a;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 434195637; // 0x19e14cb5 float:2.3295436E-23 double:2.14521148E-315;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 1463997404; // 0x5742d3dc float:2.14215185E14 double:7.23310823E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "lookahead_precache";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 1;
        goto L_0x0048;
    L_0x003d:
        r4 = "section_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 0;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x006a;
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
        goto L_0x0072;
    L_0x0059:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.agfa) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x006a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0076;
    L_0x0072:
        r7.nextNull();
        goto L_0x0019;
    L_0x0076:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0083;
    L_0x007a:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0087;
    L_0x0083:
        r2 = r7.nextString();
    L_0x0087:
        r0.a = r2;
        goto L_0x0019;
    L_0x008a:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfd.read(com.google.gson.stream.JsonReader):agfc");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agfc agfc) {
        if (agfc == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agfc.a != null) {
            jsonWriter.name("section_id");
            jsonWriter.value(agfc.a);
        }
        if (agfc.b != null) {
            jsonWriter.name("lookahead_precache");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agfc.b);
        }
        jsonWriter.endObject();
    }
}
