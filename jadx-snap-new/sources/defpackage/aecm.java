package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aecm */
public final class aecm extends TypeAdapter<aecl> {
    private final Gson a;

    public aecm(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aecl read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aecl;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00fc;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -995427962: goto L_0x004c;
            case 3373707: goto L_0x0042;
            case 3575610: goto L_0x0038;
            case 1510912594: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "behavior";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 2;
        goto L_0x0057;
    L_0x0038:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 1;
        goto L_0x0057;
    L_0x0042:
        r4 = "name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 0;
        goto L_0x0057;
    L_0x004c:
        r4 = "params";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 3;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x00da;
    L_0x0059:
        if (r2 == r1) goto L_0x00bc;
    L_0x005b:
        if (r2 == r6) goto L_0x009e;
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
        goto L_0x00e2;
    L_0x006c:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x0074:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x0097;
    L_0x007a:
        r3 = r8.nextName();
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x008f;
    L_0x0086:
        r4 = r8.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0093;
    L_0x008f:
        r4 = r8.nextString();
    L_0x0093:
        r2.put(r3, r4);
        goto L_0x0074;
    L_0x0097:
        r8.endObject();
        r0.d = r2;
        goto L_0x0019;
    L_0x009e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00e2;
    L_0x00a7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b4;
    L_0x00ab:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b8;
    L_0x00b4:
        r2 = r8.nextString();
    L_0x00b8:
        r0.c = r2;
        goto L_0x0019;
    L_0x00bc:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c5;
    L_0x00c4:
        goto L_0x00e2;
    L_0x00c5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d2;
    L_0x00c9:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d6;
    L_0x00d2:
        r2 = r8.nextString();
    L_0x00d6:
        r0.b = r2;
        goto L_0x0019;
    L_0x00da:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e7;
    L_0x00e2:
        r8.nextNull();
        goto L_0x0019;
    L_0x00e7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00f4;
    L_0x00eb:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00f8;
    L_0x00f4:
        r2 = r8.nextString();
    L_0x00f8:
        r0.a = r2;
        goto L_0x0019;
    L_0x00fc:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecm.read(com.google.gson.stream.JsonReader):aecl");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aecl aecl) {
        if (aecl == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aecl.a != null) {
            jsonWriter.name("name");
            jsonWriter.value(aecl.a);
        }
        if (aecl.b != null) {
            jsonWriter.name("type");
            jsonWriter.value(aecl.b);
        }
        if (aecl.c != null) {
            jsonWriter.name("behavior");
            jsonWriter.value(aecl.c);
        }
        if (aecl.d != null) {
            jsonWriter.name("params");
            jsonWriter.beginObject();
            for (Entry entry : aecl.d.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
