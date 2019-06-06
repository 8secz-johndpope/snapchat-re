package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agdb */
public final class agdb extends TypeAdapter<agda> {
    private final Gson a;
    private final Supplier<TypeAdapter<afbs>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbs.class)));

    public agdb(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.agda read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new agda;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00fe;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -1884266413: goto L_0x004c;
            case -1798980948: goto L_0x0042;
            case -978173180: goto L_0x0038;
            case 1615086568: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "display_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 1;
        goto L_0x0057;
    L_0x0038:
        r4 = "mob_story_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 0;
        goto L_0x0057;
    L_0x0042:
        r4 = "mischief_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 3;
        goto L_0x0057;
    L_0x004c:
        r4 = "stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 2;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x00dc;
    L_0x0059:
        if (r2 == r1) goto L_0x00be;
    L_0x005b:
        if (r2 == r6) goto L_0x0080;
    L_0x005d:
        if (r2 == r5) goto L_0x0063;
    L_0x005f:
        r8.skipValue();
        goto L_0x0019;
    L_0x0063:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006c;
    L_0x006b:
        goto L_0x00e4;
    L_0x006c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0079;
    L_0x0070:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x007d;
    L_0x0079:
        r2 = r8.nextString();
    L_0x007d:
        r0.d = r2;
        goto L_0x0019;
    L_0x0080:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0089;
    L_0x0088:
        goto L_0x00e4;
    L_0x0089:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x008d:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x009d:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x00b7;
    L_0x00a3:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00af;
    L_0x00ab:
        r8.nextNull();
        goto L_0x009d;
    L_0x00af:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x009d;
    L_0x00b7:
        r8.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x00be:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c7;
    L_0x00c6:
        goto L_0x00e4;
    L_0x00c7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d4;
    L_0x00cb:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d8;
    L_0x00d4:
        r2 = r8.nextString();
    L_0x00d8:
        r0.b = r2;
        goto L_0x0019;
    L_0x00dc:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e9;
    L_0x00e4:
        r8.nextNull();
        goto L_0x0019;
    L_0x00e9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00f6;
    L_0x00ed:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00fa;
    L_0x00f6:
        r2 = r8.nextString();
    L_0x00fa:
        r0.a = r2;
        goto L_0x0019;
    L_0x00fe:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdb.read(com.google.gson.stream.JsonReader):agda");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agda agda) {
        if (agda == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agda.a != null) {
            jsonWriter.name("mob_story_id");
            jsonWriter.value(agda.a);
        }
        if (agda.b != null) {
            jsonWriter.name("display_name");
            jsonWriter.value(agda.b);
        }
        if (agda.c != null) {
            jsonWriter.name("stories");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (afbs write : agda.c) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (agda.d != null) {
            jsonWriter.name("mischief_id");
            jsonWriter.value(agda.d);
        }
        jsonWriter.endObject();
    }
}
