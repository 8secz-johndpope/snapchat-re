package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aetn */
public final class aetn extends TypeAdapter<aetm> {
    private final Gson a;
    private final Supplier<TypeAdapter<aehl>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aehl.class)));
    private final Supplier<TypeAdapter<afbs>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbs.class)));

    public aetn(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aetm read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new aetm;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x014b;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -1884266413: goto L_0x0057;
            case -265713450: goto L_0x004d;
            case -147132913: goto L_0x0043;
            case 1095260705: goto L_0x0039;
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
        r2 = 2;
        goto L_0x0062;
    L_0x0039:
        r4 = "collab_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 4;
        goto L_0x0062;
    L_0x0043:
        r4 = "user_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 1;
        goto L_0x0062;
    L_0x004d:
        r4 = "username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 0;
        goto L_0x0062;
    L_0x0057:
        r4 = "stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 3;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x0129;
    L_0x0064:
        if (r2 == r1) goto L_0x010b;
    L_0x0066:
        if (r2 == r7) goto L_0x00ed;
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
        goto L_0x0131;
    L_0x007a:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x007e:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.b;
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
        goto L_0x0131;
    L_0x00b8:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00bc:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00cc:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x00e6;
    L_0x00d2:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00de;
    L_0x00da:
        r9.nextNull();
        goto L_0x00cc;
    L_0x00de:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x00cc;
    L_0x00e6:
        r9.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x00ed:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f6;
    L_0x00f5:
        goto L_0x0131;
    L_0x00f6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0103;
    L_0x00fa:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0107;
    L_0x0103:
        r2 = r9.nextString();
    L_0x0107:
        r0.c = r2;
        goto L_0x0019;
    L_0x010b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0114;
    L_0x0113:
        goto L_0x0131;
    L_0x0114:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0121;
    L_0x0118:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0125;
    L_0x0121:
        r2 = r9.nextString();
    L_0x0125:
        r0.b = r2;
        goto L_0x0019;
    L_0x0129:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0136;
    L_0x0131:
        r9.nextNull();
        goto L_0x0019;
    L_0x0136:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0143;
    L_0x013a:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0147;
    L_0x0143:
        r2 = r9.nextString();
    L_0x0147:
        r0.a = r2;
        goto L_0x0019;
    L_0x014b:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetn.read(com.google.gson.stream.JsonReader):aetm");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aetm aetm) {
        if (aetm == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aetm.a != null) {
            jsonWriter.name("username");
            jsonWriter.value(aetm.a);
        }
        if (aetm.b != null) {
            jsonWriter.name("user_id");
            jsonWriter.value(aetm.b);
        }
        if (aetm.c != null) {
            jsonWriter.name("display_name");
            jsonWriter.value(aetm.c);
        }
        if (aetm.d != null) {
            jsonWriter.name("stories");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (afbs write : aetm.d) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aetm.e != null) {
            jsonWriter.name("collab_stories");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aehl write2 : aetm.e) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
