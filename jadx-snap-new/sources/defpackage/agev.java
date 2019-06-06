package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agev */
public final class agev extends TypeAdapter<ageu> {
    private final Gson a;
    private final Supplier<TypeAdapter<agew>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(agew.class)));
    private final Supplier<TypeAdapter<agey>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(agey.class)));

    public agev(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.ageu read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new ageu;
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
            case 735087912: goto L_0x004c;
            case 1366964929: goto L_0x0042;
            case 1669499563: goto L_0x0038;
            case 1715388522: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "recent_order";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 0;
        goto L_0x0057;
    L_0x0038:
        r4 = "story_scores";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 3;
        goto L_0x0057;
    L_0x0042:
        r4 = "auto_advance_order";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 1;
        goto L_0x0057;
    L_0x004c:
        r4 = "quality_programming_order";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 2;
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
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0071:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0081:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x009b;
    L_0x0087:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0093;
    L_0x008f:
        r8.nextNull();
        goto L_0x0081;
    L_0x0093:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x0081;
    L_0x009b:
        r8.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x00a2:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ab;
    L_0x00aa:
        goto L_0x0126;
    L_0x00ab:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00af:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00bf:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x00d9;
    L_0x00c5:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00d1;
    L_0x00cd:
        r8.nextNull();
        goto L_0x00bf;
    L_0x00d1:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x00bf;
    L_0x00d9:
        r8.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x00e0:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e9;
    L_0x00e8:
        goto L_0x0126;
    L_0x00e9:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00ed:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00fd:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0117;
    L_0x0103:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x010f;
    L_0x010b:
        r8.nextNull();
        goto L_0x00fd;
    L_0x010f:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x00fd;
    L_0x0117:
        r8.endArray();
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
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x012f:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x013f:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0159;
    L_0x0145:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0151;
    L_0x014d:
        r8.nextNull();
        goto L_0x013f;
    L_0x0151:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x013f;
    L_0x0159:
        r8.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x0160:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agev.read(com.google.gson.stream.JsonReader):ageu");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ageu ageu) {
        if (ageu == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ageu.a != null) {
            jsonWriter.name("recent_order");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (agew write : ageu.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (ageu.b != null) {
            jsonWriter.name("auto_advance_order");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (agew write2 : ageu.b) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (ageu.c != null) {
            jsonWriter.name("quality_programming_order");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (agew write22 : ageu.c) {
                typeAdapter.write(jsonWriter, write22);
            }
            jsonWriter.endArray();
        }
        if (ageu.d != null) {
            jsonWriter.name("story_scores");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (agey write3 : ageu.d) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
