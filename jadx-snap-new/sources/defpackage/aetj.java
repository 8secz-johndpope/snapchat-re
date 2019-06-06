package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aetj */
public final class aetj extends TypeAdapter<aeti> {
    private final Gson a;
    private final Supplier<TypeAdapter<aeug>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeug.class)));
    private final Supplier<TypeAdapter<afbg>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbg.class)));

    public aetj(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aeti read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new aeti;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x014f;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -1884266413: goto L_0x0057;
            case -1421068813: goto L_0x004d;
            case 408052536: goto L_0x0043;
            case 506361563: goto L_0x0039;
            case 1615086568: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0061;
    L_0x002f:
        r4 = "display_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0037:
        r2 = 1;
        goto L_0x0062;
    L_0x0039:
        r4 = "group_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 0;
        goto L_0x0062;
    L_0x0043:
        r4 = "search_lookup_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 4;
        goto L_0x0062;
    L_0x004d:
        r4 = "has_custom_description";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 3;
        goto L_0x0062;
    L_0x0057:
        r4 = "stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 2;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x012d;
    L_0x0064:
        if (r2 == r1) goto L_0x010f;
    L_0x0066:
        if (r2 == r7) goto L_0x00d1;
    L_0x0068:
        if (r2 == r6) goto L_0x00af;
    L_0x006a:
        if (r2 == r5) goto L_0x0070;
    L_0x006c:
        r9.skipValue();
        goto L_0x0019;
    L_0x0070:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x007a;
    L_0x0078:
        goto L_0x0135;
    L_0x007a:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x007e:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x008e:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x00a8;
    L_0x0094:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00a0;
    L_0x009c:
        r9.nextNull();
        goto L_0x008e;
    L_0x00a0:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x008e;
    L_0x00a8:
        r9.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x00af:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b8;
    L_0x00b7:
        goto L_0x0135;
    L_0x00b8:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00c5;
    L_0x00bc:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00c9;
    L_0x00c5:
        r2 = r9.nextBoolean();
    L_0x00c9:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x00d1:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00da;
    L_0x00d9:
        goto L_0x0135;
    L_0x00da:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00de:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00ee:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0108;
    L_0x00f4:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0100;
    L_0x00fc:
        r9.nextNull();
        goto L_0x00ee;
    L_0x0100:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x00ee;
    L_0x0108:
        r9.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x010f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0118;
    L_0x0117:
        goto L_0x0135;
    L_0x0118:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0125;
    L_0x011c:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0129;
    L_0x0125:
        r2 = r9.nextString();
    L_0x0129:
        r0.b = r2;
        goto L_0x0019;
    L_0x012d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x013a;
    L_0x0135:
        r9.nextNull();
        goto L_0x0019;
    L_0x013a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0147;
    L_0x013e:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x014b;
    L_0x0147:
        r2 = r9.nextString();
    L_0x014b:
        r0.a = r2;
        goto L_0x0019;
    L_0x014f:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetj.read(com.google.gson.stream.JsonReader):aeti");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeti aeti) {
        if (aeti == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeti.a != null) {
            jsonWriter.name("group_id");
            jsonWriter.value(aeti.a);
        }
        if (aeti.b != null) {
            jsonWriter.name("display_name");
            jsonWriter.value(aeti.b);
        }
        if (aeti.c != null) {
            jsonWriter.name("stories");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aeug write : aeti.c) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aeti.d != null) {
            jsonWriter.name("has_custom_description");
            jsonWriter.value(aeti.d.booleanValue());
        }
        if (aeti.e != null) {
            jsonWriter.name("search_lookup_data");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (afbg write2 : aeti.e) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
