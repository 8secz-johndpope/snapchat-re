package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: ahsu */
public final class ahsu extends TypeAdapter<ahst> {
    private final Gson a;

    public ahsu(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.ahst read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new ahst;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x011a;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -347190778: goto L_0x0057;
            case -4076688: goto L_0x004d;
            case 68598423: goto L_0x0043;
            case 210976607: goto L_0x0039;
            case 719252276: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0061;
    L_0x002f:
        r4 = "in_app_report_message";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0037:
        r2 = 3;
        goto L_0x0062;
    L_0x0039:
        r4 = "capricorn_string";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 4;
        goto L_0x0062;
    L_0x0043:
        r4 = "capricorn_number";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 0;
        goto L_0x0062;
    L_0x004d:
        r4 = "capricorn_endpoints";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 1;
        goto L_0x0062;
    L_0x0057:
        r4 = "in_app_report_message_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 2;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x0101;
    L_0x0064:
        if (r2 == r1) goto L_0x00ca;
    L_0x0066:
        if (r2 == r7) goto L_0x00ac;
    L_0x0068:
        if (r2 == r6) goto L_0x008e;
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
        goto L_0x0109;
    L_0x007a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0087;
    L_0x007e:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x008b;
    L_0x0087:
        r2 = r9.nextString();
    L_0x008b:
        r0.e = r2;
        goto L_0x0019;
    L_0x008e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0097;
    L_0x0096:
        goto L_0x0109;
    L_0x0097:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00a4;
    L_0x009b:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00a8;
    L_0x00a4:
        r2 = r9.nextString();
    L_0x00a8:
        r0.d = r2;
        goto L_0x0019;
    L_0x00ac:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b5;
    L_0x00b4:
        goto L_0x0109;
    L_0x00b5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00c2;
    L_0x00b9:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00c6;
    L_0x00c2:
        r2 = r9.nextString();
    L_0x00c6:
        r0.c = r2;
        goto L_0x0019;
    L_0x00ca:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d3;
    L_0x00d2:
        goto L_0x0109;
    L_0x00d3:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00d7:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x00df:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x00fa;
    L_0x00e5:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x00f2;
    L_0x00e9:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x00f6;
    L_0x00f2:
        r4 = r9.nextString();
    L_0x00f6:
        r3.add(r4);
        goto L_0x00df;
    L_0x00fa:
        r9.endArray();
        r0.b = r3;
        goto L_0x0019;
    L_0x0101:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x010e;
    L_0x0109:
        r9.nextNull();
        goto L_0x0019;
    L_0x010e:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x011a:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsu.read(com.google.gson.stream.JsonReader):ahst");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahst ahst) {
        if (ahst == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahst.a != null) {
            jsonWriter.name("capricorn_number");
            jsonWriter.value(ahst.a);
        }
        if (ahst.b != null) {
            jsonWriter.name("capricorn_endpoints");
            jsonWriter.beginArray();
            for (String value : ahst.b) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (ahst.c != null) {
            jsonWriter.name("in_app_report_message_id");
            jsonWriter.value(ahst.c);
        }
        if (ahst.d != null) {
            jsonWriter.name("in_app_report_message");
            jsonWriter.value(ahst.d);
        }
        if (ahst.e != null) {
            jsonWriter.name("capricorn_string");
            jsonWriter.value(ahst.e);
        }
        jsonWriter.endObject();
    }
}
