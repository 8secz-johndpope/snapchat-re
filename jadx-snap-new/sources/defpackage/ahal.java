package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: ahal */
public final class ahal extends TypeAdapter<ahak> {
    private final Gson a;

    public ahal(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.ahak read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new ahak;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00df;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -1798980948; // 0xffffffff94c5baac float:-1.9965546E-26 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = -312614600; // 0xffffffffed5de138 float:-4.2917787E27 double:NaN;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = 1331842436; // 0x4f624d84 float:3.79673088E9 double:6.580175933E-315;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "latest_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 1;
        goto L_0x0058;
    L_0x0043:
        r4 = "earliest_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 2;
        goto L_0x0058;
    L_0x004d:
        r4 = "mischief_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 0;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x00bd;
    L_0x005a:
        if (r2 == r1) goto L_0x008f;
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
        goto L_0x00c5;
    L_0x006b:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x0073:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x0089;
    L_0x0079:
        r3 = r8.nextName();
        r4 = r8.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x0073;
    L_0x0089:
        r8.endObject();
        r0.c = r2;
        goto L_0x0019;
    L_0x008f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0098;
    L_0x0097:
        goto L_0x00c5;
    L_0x0098:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x00a0:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x00b6;
    L_0x00a6:
        r3 = r8.nextName();
        r4 = r8.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x00a0;
    L_0x00b6:
        r8.endObject();
        r0.b = r2;
        goto L_0x0019;
    L_0x00bd:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ca;
    L_0x00c5:
        r8.nextNull();
        goto L_0x0019;
    L_0x00ca:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d7;
    L_0x00ce:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00db;
    L_0x00d7:
        r2 = r8.nextString();
    L_0x00db:
        r0.a = r2;
        goto L_0x0019;
    L_0x00df:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahal.read(com.google.gson.stream.JsonReader):ahak");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahak ahak) {
        if (ahak == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahak.a != null) {
            jsonWriter.name("mischief_id");
            jsonWriter.value(ahak.a);
        }
        if (ahak.b != null) {
            jsonWriter.name("latest_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry : ahak.b.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((Number) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahak.c != null) {
            jsonWriter.name("earliest_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry2 : ahak.c.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                jsonWriter.value((Number) entry2.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
