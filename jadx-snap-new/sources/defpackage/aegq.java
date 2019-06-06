package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aegq */
public final class aegq extends TypeAdapter<aegp> {
    private final Gson a;

    public aegq(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    public final defpackage.aegp read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aegp;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x007b;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 746204894; // 0x2c7a2ede float:3.5553153E-12 double:3.68674203E-315;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 1164895567; // 0x456ee54f float:3822.3318 double:5.755348806E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "release_sequence_number";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 1;
        goto L_0x0048;
    L_0x003d:
        r4 = "release_timestamp";
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
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x007b:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aegq.read(com.google.gson.stream.JsonReader):aegp");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aegp aegp) {
        if (aegp == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aegp.a != null) {
            jsonWriter.name("release_timestamp");
            jsonWriter.value(aegp.a);
        }
        if (aegp.b != null) {
            jsonWriter.name("release_sequence_number");
            jsonWriter.value(aegp.b);
        }
        jsonWriter.endObject();
    }
}
