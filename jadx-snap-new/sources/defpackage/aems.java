package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aems */
public final class aems extends TypeAdapter<aemr> {
    private final Gson a;

    public aems(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    public final defpackage.aemr read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aemr;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0084;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 338683180; // 0x142fe52c float:8.880438E-27 double:1.67331724E-315;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 767170141; // 0x2dba165d float:2.1155683E-11 double:3.79032411E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "expiration_time";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 1;
        goto L_0x0048;
    L_0x003d:
        r4 = "category_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 0;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x0064;
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
        goto L_0x006c;
    L_0x0059:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x0064:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0070;
    L_0x006c:
        r7.nextNull();
        goto L_0x0019;
    L_0x0070:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x007d;
    L_0x0074:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0081;
    L_0x007d:
        r2 = r7.nextString();
    L_0x0081:
        r0.a = r2;
        goto L_0x0019;
    L_0x0084:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aems.read(com.google.gson.stream.JsonReader):aemr");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aemr aemr) {
        if (aemr == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aemr.a != null) {
            jsonWriter.name("category_name");
            jsonWriter.value(aemr.a);
        }
        if (aemr.b != null) {
            jsonWriter.name("expiration_time");
            jsonWriter.value(aemr.b);
        }
        jsonWriter.endObject();
    }
}
