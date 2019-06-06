package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aglc */
public final class aglc extends TypeAdapter<aglb> {
    private final Gson a;
    private final Supplier<TypeAdapter<agkv>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(agkv.class)));
    private final Supplier<TypeAdapter<agld>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(agld.class)));
    private final Supplier<TypeAdapter<aglf>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aglf.class)));
    private final Supplier<TypeAdapter<aglh>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aglh.class)));

    public aglc(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aglb read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aglb;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0160;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -1459930251: goto L_0x004c;
            case -708078551: goto L_0x0042;
            case -650267819: goto L_0x0038;
            case 1044125728: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "stringConfigs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 0;
        goto L_0x0057;
    L_0x0038:
        r4 = "longConfigs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 2;
        goto L_0x0057;
    L_0x0042:
        r4 = "booleanConfigs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 3;
        goto L_0x0057;
    L_0x004c:
        r4 = "floatConfigs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 1;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x011e;
    L_0x0059:
        if (r2 == r1) goto L_0x00e0;
    L_0x005b:
        if (r2 == r6) goto L_0x00a2;
    L_0x005d:
        if (r2 == r5) goto L_0x0063;
    L_0x005f:
        r8.skipValue();
        goto L_0x0019;
    L_0x0063:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006d;
    L_0x006b:
        goto L_0x0126;
    L_0x006d:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x007d:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x009b;
    L_0x0083:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x0093;
    L_0x008f:
        r8.nextNull();
        goto L_0x007d;
    L_0x0093:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x007d;
    L_0x009b:
        r8.endObject();
        r0.d = r2;
        goto L_0x0019;
    L_0x00a2:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ab;
    L_0x00aa:
        goto L_0x0126;
    L_0x00ab:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x00bb:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x00d9;
    L_0x00c1:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x00d1;
    L_0x00cd:
        r8.nextNull();
        goto L_0x00bb;
    L_0x00d1:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x00bb;
    L_0x00d9:
        r8.endObject();
        r0.c = r2;
        goto L_0x0019;
    L_0x00e0:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e9;
    L_0x00e8:
        goto L_0x0126;
    L_0x00e9:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x00f9:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0117;
    L_0x00ff:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x010f;
    L_0x010b:
        r8.nextNull();
        goto L_0x00f9;
    L_0x010f:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x00f9;
    L_0x0117:
        r8.endObject();
        r0.b = r2;
        goto L_0x0019;
    L_0x011e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x012b;
    L_0x0126:
        r8.nextNull();
        goto L_0x0019;
    L_0x012b:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x013b:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0159;
    L_0x0141:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x0151;
    L_0x014d:
        r8.nextNull();
        goto L_0x013b;
    L_0x0151:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x013b;
    L_0x0159:
        r8.endObject();
        r0.a = r2;
        goto L_0x0019;
    L_0x0160:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglc.read(com.google.gson.stream.JsonReader):aglb");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aglb aglb) {
        if (aglb == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aglb.a != null) {
            jsonWriter.name("stringConfigs");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginObject();
            for (Entry entry : aglb.a.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                typeAdapter.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aglb.b != null) {
            jsonWriter.name("floatConfigs");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginObject();
            for (Entry entry2 : aglb.b.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                typeAdapter.write(jsonWriter, entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (aglb.c != null) {
            jsonWriter.name("longConfigs");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginObject();
            for (Entry entry22 : aglb.c.entrySet()) {
                jsonWriter.name((String) entry22.getKey());
                typeAdapter.write(jsonWriter, entry22.getValue());
            }
            jsonWriter.endObject();
        }
        if (aglb.d != null) {
            jsonWriter.name("booleanConfigs");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginObject();
            for (Entry entry3 : aglb.d.entrySet()) {
                jsonWriter.name((String) entry3.getKey());
                typeAdapter.write(jsonWriter, entry3.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
