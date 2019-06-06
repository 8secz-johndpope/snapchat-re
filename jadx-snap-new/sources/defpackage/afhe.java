package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: afhe */
public final class afhe extends TypeAdapter<afhd> {
    private final Gson a;

    public afhe(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.afhd read(com.google.gson.stream.JsonReader r8) {
        /*
        r7 = this;
        r0 = r8.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r8.nextNull();
        r8 = 0;
        return r8;
    L_0x000d:
        r0 = new afhd;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00fa;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -995427962; // 0xffffffffc4aaf986 float:-1367.7976 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = 3575610; // 0x368f3a float:5.010497E-39 double:1.766586E-317;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = 1739164884; // 0x67a98cd4 float:1.6013555E24 double:8.592616216E-315;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "targeting_params";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 2;
        goto L_0x0058;
    L_0x0043:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 0;
        goto L_0x0058;
    L_0x004d:
        r4 = "params";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 1;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x00d8;
    L_0x005a:
        if (r2 == r1) goto L_0x009d;
    L_0x005c:
        if (r2 == r6) goto L_0x0062;
    L_0x005e:
        r8.skipValue();
        goto L_0x0019;
    L_0x0062:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006b;
    L_0x006a:
        goto L_0x00e0;
    L_0x006b:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x0073:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x0096;
    L_0x0079:
        r3 = r8.nextName();
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x008e;
    L_0x0085:
        r4 = r8.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0092;
    L_0x008e:
        r4 = r8.nextString();
    L_0x0092:
        r2.put(r3, r4);
        goto L_0x0073;
    L_0x0096:
        r8.endObject();
        r0.c = r2;
        goto L_0x0019;
    L_0x009d:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00e0;
    L_0x00a6:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x00ae:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x00d1;
    L_0x00b4:
        r3 = r8.nextName();
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x00c9;
    L_0x00c0:
        r4 = r8.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x00cd;
    L_0x00c9:
        r4 = r8.nextString();
    L_0x00cd:
        r2.put(r3, r4);
        goto L_0x00ae;
    L_0x00d1:
        r8.endObject();
        r0.b = r2;
        goto L_0x0019;
    L_0x00d8:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e5;
    L_0x00e0:
        r8.nextNull();
        goto L_0x0019;
    L_0x00e5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00f2;
    L_0x00e9:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00f6;
    L_0x00f2:
        r2 = r8.nextString();
    L_0x00f6:
        r0.a = r2;
        goto L_0x0019;
    L_0x00fa:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afhe.read(com.google.gson.stream.JsonReader):afhd");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afhd afhd) {
        if (afhd == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afhd.a != null) {
            jsonWriter.name("type");
            jsonWriter.value(afhd.a);
        }
        if (afhd.b != null) {
            jsonWriter.name("params");
            jsonWriter.beginObject();
            for (Entry entry : afhd.b.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (afhd.c != null) {
            jsonWriter.name("targeting_params");
            jsonWriter.beginObject();
            for (Entry entry2 : afhd.c.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                jsonWriter.value((String) entry2.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
