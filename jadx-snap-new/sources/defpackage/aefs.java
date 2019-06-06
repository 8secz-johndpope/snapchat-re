package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aefs */
public final class aefs extends TypeAdapter<aefr> {
    private final Gson a;
    private final Supplier<TypeAdapter<aeie>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeie.class)));
    private final Supplier<TypeAdapter<aesr>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesr.class)));
    private final Supplier<TypeAdapter<aesv>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesv.class)));
    private final Supplier<TypeAdapter<aesx>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesx.class)));

    public aefs(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aefr read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new aefr;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x0190;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -1436512110: goto L_0x0057;
            case 140636634: goto L_0x004d;
            case 212982991: goto L_0x0043;
            case 918880570: goto L_0x0039;
            case 1790524101: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0061;
    L_0x002f:
        r4 = "erase_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0037:
        r2 = 4;
        goto L_0x0062;
    L_0x0039:
        r4 = "state_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 1;
        goto L_0x0062;
    L_0x0043:
        r4 = "preservation_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 2;
        goto L_0x0062;
    L_0x004d:
        r4 = "has_more";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 3;
        goto L_0x0062;
    L_0x0057:
        r4 = "message_updates";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 0;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x014e;
    L_0x0064:
        if (r2 == r1) goto L_0x0110;
    L_0x0066:
        if (r2 == r7) goto L_0x00d2;
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
        goto L_0x0156;
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
        if (r2 != r3) goto L_0x00b9;
    L_0x00b7:
        goto L_0x0156;
    L_0x00b9:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00c6;
    L_0x00bd:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00ca;
    L_0x00c6:
        r2 = r9.nextBoolean();
    L_0x00ca:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x00d2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00db;
    L_0x00da:
        goto L_0x0156;
    L_0x00db:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00df:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00ef:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0109;
    L_0x00f5:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0101;
    L_0x00fd:
        r9.nextNull();
        goto L_0x00ef;
    L_0x0101:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x00ef;
    L_0x0109:
        r9.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x0110:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0119;
    L_0x0118:
        goto L_0x0156;
    L_0x0119:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x011d:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x012d:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0147;
    L_0x0133:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x013f;
    L_0x013b:
        r9.nextNull();
        goto L_0x012d;
    L_0x013f:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x012d;
    L_0x0147:
        r9.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x014e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x015b;
    L_0x0156:
        r9.nextNull();
        goto L_0x0019;
    L_0x015b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x015f:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x016f:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0189;
    L_0x0175:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0181;
    L_0x017d:
        r9.nextNull();
        goto L_0x016f;
    L_0x0181:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x016f;
    L_0x0189:
        r9.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x0190:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefs.read(com.google.gson.stream.JsonReader):aefr");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aefr aefr) {
        if (aefr == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aefr.a != null) {
            jsonWriter.name("message_updates");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aeie write : aefr.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aefr.b != null) {
            jsonWriter.name("state_messages");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (aesx write2 : aefr.b) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aefr.c != null) {
            jsonWriter.name("preservation_messages");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (aesv write3 : aefr.c) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        if (aefr.d != null) {
            jsonWriter.name("has_more");
            jsonWriter.value(aefr.d.booleanValue());
        }
        if (aefr.e != null) {
            jsonWriter.name("erase_messages");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aesr write4 : aefr.e) {
                typeAdapter.write(jsonWriter, write4);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
