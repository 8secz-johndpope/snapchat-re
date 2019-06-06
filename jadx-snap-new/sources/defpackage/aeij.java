package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aeij */
public final class aeij extends TypeAdapter<aeii> {
    private final Gson a;
    private final Supplier<TypeAdapter<aeik>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeik.class)));
    private final Supplier<TypeAdapter<aeim>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeim.class)));
    private final Supplier<TypeAdapter<Map<String, Long>>> d = Suppliers.memoize(new afdq(this.a, new 1()));

    /* renamed from: aeij$1 */
    class 1 extends TypeToken<Map<String, Long>> {
        1() {
        }
    }

    public aeij(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:101:0x020e, code skipped:
            r9.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aeii read(com.google.gson.stream.JsonReader r9) {
        /*
        r8 = this;
        r0 = r9.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r9.nextNull();
        r9 = 0;
        return r9;
    L_0x000d:
        r0 = new aeii;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x0238;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1995572051: goto L_0x0068;
            case -1584788260: goto L_0x005e;
            case -1199941156: goto L_0x0054;
            case 453403998: goto L_0x004a;
            case 850434894: goto L_0x0040;
            case 1138325727: goto L_0x0036;
            case 1714140829: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0072;
    L_0x002c:
        r4 = "snap_sequences";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0034:
        r2 = 2;
        goto L_0x0073;
    L_0x0036:
        r4 = "user_chat_releases";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x003e:
        r2 = 5;
        goto L_0x0073;
    L_0x0040:
        r4 = "user_snap_releases_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0048:
        r2 = 4;
        goto L_0x0073;
    L_0x004a:
        r4 = "user_sequences";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0052:
        r2 = 0;
        goto L_0x0073;
    L_0x0054:
        r4 = "user_chat_releases_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r2 = 3;
        goto L_0x0073;
    L_0x005e:
        r4 = "update_sequences";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0066:
        r2 = 1;
        goto L_0x0073;
    L_0x0068:
        r4 = "user_snap_releases";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0070:
        r2 = 6;
        goto L_0x0073;
    L_0x0072:
        r2 = -1;
    L_0x0073:
        switch(r2) {
            case 0: goto L_0x0206;
            case 1: goto L_0x01d8;
            case 2: goto L_0x01aa;
            case 3: goto L_0x016b;
            case 4: goto L_0x012c;
            case 5: goto L_0x00d3;
            case 6: goto L_0x007a;
            default: goto L_0x0076;
        };
    L_0x0076:
        r9.skipValue();
        goto L_0x0019;
    L_0x007a:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0084;
    L_0x0082:
        goto L_0x020e;
    L_0x0084:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.d;
        r3.get();
        r9.beginObject();
    L_0x0091:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x00cc;
    L_0x0097:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00a7;
    L_0x00a3:
        r9.nextNull();
        goto L_0x0091;
    L_0x00a7:
        r4 = new com.google.gson.internal.LinkedTreeMap;
        r4.<init>();
        r9.beginObject();
    L_0x00af:
        r5 = r9.hasNext();
        if (r5 == 0) goto L_0x00c5;
    L_0x00b5:
        r5 = r9.nextName();
        r6 = r9.nextLong();
        r6 = java.lang.Long.valueOf(r6);
        r4.put(r5, r6);
        goto L_0x00af;
    L_0x00c5:
        r9.endObject();
        r2.put(r3, r4);
        goto L_0x0091;
    L_0x00cc:
        r9.endObject();
        r0.g = r2;
        goto L_0x0019;
    L_0x00d3:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00dd;
    L_0x00db:
        goto L_0x020e;
    L_0x00dd:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.d;
        r3.get();
        r9.beginObject();
    L_0x00ea:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x0125;
    L_0x00f0:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0100;
    L_0x00fc:
        r9.nextNull();
        goto L_0x00ea;
    L_0x0100:
        r4 = new com.google.gson.internal.LinkedTreeMap;
        r4.<init>();
        r9.beginObject();
    L_0x0108:
        r5 = r9.hasNext();
        if (r5 == 0) goto L_0x011e;
    L_0x010e:
        r5 = r9.nextName();
        r6 = r9.nextLong();
        r6 = java.lang.Long.valueOf(r6);
        r4.put(r5, r6);
        goto L_0x0108;
    L_0x011e:
        r9.endObject();
        r2.put(r3, r4);
        goto L_0x00ea;
    L_0x0125:
        r9.endObject();
        r0.f = r2;
        goto L_0x0019;
    L_0x012c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0136;
    L_0x0134:
        goto L_0x020e;
    L_0x0136:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x013a:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x014a:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0164;
    L_0x0150:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x015c;
    L_0x0158:
        r9.nextNull();
        goto L_0x014a;
    L_0x015c:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x014a;
    L_0x0164:
        r9.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x016b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0175;
    L_0x0173:
        goto L_0x020e;
    L_0x0175:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0179:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0189:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x01a3;
    L_0x018f:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x019b;
    L_0x0197:
        r9.nextNull();
        goto L_0x0189;
    L_0x019b:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0189;
    L_0x01a3:
        r9.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x01aa:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01b3;
    L_0x01b2:
        goto L_0x020e;
    L_0x01b3:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x01bb:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x01d1;
    L_0x01c1:
        r3 = r9.nextName();
        r4 = r9.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x01bb;
    L_0x01d1:
        r9.endObject();
        r0.c = r2;
        goto L_0x0019;
    L_0x01d8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e1;
    L_0x01e0:
        goto L_0x020e;
    L_0x01e1:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x01e9:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x01ff;
    L_0x01ef:
        r3 = r9.nextName();
        r4 = r9.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x01e9;
    L_0x01ff:
        r9.endObject();
        r0.b = r2;
        goto L_0x0019;
    L_0x0206:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0213;
    L_0x020e:
        r9.nextNull();
        goto L_0x0019;
    L_0x0213:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x021b:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x0231;
    L_0x0221:
        r3 = r9.nextName();
        r4 = r9.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x021b;
    L_0x0231:
        r9.endObject();
        r0.a = r2;
        goto L_0x0019;
    L_0x0238:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeij.read(com.google.gson.stream.JsonReader):aeii");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeii aeii) {
        if (aeii == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeii.a != null) {
            jsonWriter.name("user_sequences");
            jsonWriter.beginObject();
            for (Entry entry : aeii.a.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((Number) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aeii.b != null) {
            jsonWriter.name("update_sequences");
            jsonWriter.beginObject();
            for (Entry entry2 : aeii.b.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                jsonWriter.value((Number) entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (aeii.c != null) {
            jsonWriter.name("snap_sequences");
            jsonWriter.beginObject();
            for (Entry entry22 : aeii.c.entrySet()) {
                jsonWriter.name((String) entry22.getKey());
                jsonWriter.value((Number) entry22.getValue());
            }
            jsonWriter.endObject();
        }
        if (aeii.d != null) {
            jsonWriter.name("user_chat_releases_v2");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aeik write : aeii.d) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aeii.e != null) {
            jsonWriter.name("user_snap_releases_v2");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aeim write2 : aeii.e) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aeii.f != null) {
            jsonWriter.name("user_chat_releases");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginObject();
            for (Entry entry3 : aeii.f.entrySet()) {
                jsonWriter.name((String) entry3.getKey());
                typeAdapter.write(jsonWriter, entry3.getValue());
            }
            jsonWriter.endObject();
        }
        if (aeii.g != null) {
            jsonWriter.name("user_snap_releases");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginObject();
            for (Entry entry222 : aeii.g.entrySet()) {
                jsonWriter.name((String) entry222.getKey());
                typeAdapter.write(jsonWriter, entry222.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
