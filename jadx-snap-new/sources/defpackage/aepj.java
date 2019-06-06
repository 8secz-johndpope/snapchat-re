package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aepj */
public final class aepj extends TypeAdapter<aepi> {
    private final Gson a;

    public aepj(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aepi read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new aepi;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x00f7;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -2146559428: goto L_0x0057;
            case 971599075: goto L_0x004d;
            case 1211854093: goto L_0x0043;
            case 1990235766: goto L_0x0039;
            case 1993002636: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0061;
    L_0x002f:
        r4 = "last_reader";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0037:
        r2 = 0;
        goto L_0x0062;
    L_0x0039:
        r4 = "last_read_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 1;
        goto L_0x0062;
    L_0x0043:
        r4 = "last_write_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 3;
        goto L_0x0062;
    L_0x004d:
        r4 = "last_write_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 4;
        goto L_0x0062;
    L_0x0057:
        r4 = "last_writer";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 2;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x00d5;
    L_0x0064:
        if (r2 == r1) goto L_0x00c0;
    L_0x0066:
        if (r2 == r7) goto L_0x00a2;
    L_0x0068:
        if (r2 == r6) goto L_0x008d;
    L_0x006a:
        if (r2 == r5) goto L_0x0070;
    L_0x006c:
        r9.skipValue();
        goto L_0x0019;
    L_0x0070:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0079;
    L_0x0078:
        goto L_0x00dd;
    L_0x0079:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0086;
    L_0x007d:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x008a;
    L_0x0086:
        r2 = r9.nextString();
    L_0x008a:
        r0.e = r2;
        goto L_0x0019;
    L_0x008d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0096;
    L_0x0095:
        goto L_0x00dd;
    L_0x0096:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x00a2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ab;
    L_0x00aa:
        goto L_0x00dd;
    L_0x00ab:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b8;
    L_0x00af:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00bc;
    L_0x00b8:
        r2 = r9.nextString();
    L_0x00bc:
        r0.c = r2;
        goto L_0x0019;
    L_0x00c0:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c9;
    L_0x00c8:
        goto L_0x00dd;
    L_0x00c9:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x00d5:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e2;
    L_0x00dd:
        r9.nextNull();
        goto L_0x0019;
    L_0x00e2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ef;
    L_0x00e6:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00f3;
    L_0x00ef:
        r2 = r9.nextString();
    L_0x00f3:
        r0.a = r2;
        goto L_0x0019;
    L_0x00f7:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepj.read(com.google.gson.stream.JsonReader):aepi");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aepi aepi) {
        if (aepi == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aepi.a != null) {
            jsonWriter.name("last_reader");
            jsonWriter.value(aepi.a);
        }
        if (aepi.b != null) {
            jsonWriter.name("last_read_timestamp");
            jsonWriter.value(aepi.b);
        }
        if (aepi.c != null) {
            jsonWriter.name("last_writer");
            jsonWriter.value(aepi.c);
        }
        if (aepi.d != null) {
            jsonWriter.name("last_write_timestamp");
            jsonWriter.value(aepi.d);
        }
        if (aepi.e != null) {
            jsonWriter.name("last_write_type");
            jsonWriter.value(aepi.e);
        }
        jsonWriter.endObject();
    }
}
