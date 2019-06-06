package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aekl */
public final class aekl extends TypeAdapter<aekk> {
    private final Gson a;

    public aekl(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aekk read(com.google.gson.stream.JsonReader r10) {
        /*
        r9 = this;
        r0 = r10.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r10.nextNull();
        r10 = 0;
        return r10;
    L_0x000d:
        r0 = new aekk;
        r0.<init>();
        r1 = 1;
        r10.setLenient(r1);
        r10.beginObject();
    L_0x0019:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x013d;
    L_0x001f:
        r2 = r10.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 5;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        switch(r4) {
            case -2030994180: goto L_0x0062;
            case -1487597642: goto L_0x0058;
            case -1195408547: goto L_0x004e;
            case -807064319: goto L_0x0044;
            case -76704913: goto L_0x003a;
            case 2013347782: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x006c;
    L_0x0030:
        r4 = "last_used";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0038:
        r2 = 5;
        goto L_0x006d;
    L_0x003a:
        r4 = "num_times_used";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0042:
        r2 = 4;
        goto L_0x006d;
    L_0x0044:
        r4 = "pack_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x004c:
        r2 = 0;
        goto L_0x006d;
    L_0x004e:
        r4 = "sticker_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0056:
        r2 = 1;
        goto L_0x006d;
    L_0x0058:
        r4 = "capabilities";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2 = 3;
        goto L_0x006d;
    L_0x0062:
        r4 = "sticker_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x006a:
        r2 = 2;
        goto L_0x006d;
    L_0x006c:
        r2 = -1;
    L_0x006d:
        if (r2 == 0) goto L_0x011b;
    L_0x006f:
        if (r2 == r1) goto L_0x00fd;
    L_0x0071:
        if (r2 == r8) goto L_0x00df;
    L_0x0073:
        if (r2 == r7) goto L_0x00a8;
    L_0x0075:
        if (r2 == r6) goto L_0x0092;
    L_0x0077:
        if (r2 == r5) goto L_0x007d;
    L_0x0079:
        r10.skipValue();
        goto L_0x0019;
    L_0x007d:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0087;
    L_0x0085:
        goto L_0x0123;
    L_0x0087:
        r2 = r10.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0092:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x009c;
    L_0x009a:
        goto L_0x0123;
    L_0x009c:
        r2 = r10.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x00a8:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b1;
    L_0x00b0:
        goto L_0x0123;
    L_0x00b1:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00b5:
        r10.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x00bd:
        r4 = r10.hasNext();
        if (r4 == 0) goto L_0x00d8;
    L_0x00c3:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x00d0;
    L_0x00c7:
        r4 = r10.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x00d4;
    L_0x00d0:
        r4 = r10.nextString();
    L_0x00d4:
        r3.add(r4);
        goto L_0x00bd;
    L_0x00d8:
        r10.endArray();
        r0.d = r3;
        goto L_0x0019;
    L_0x00df:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e8;
    L_0x00e7:
        goto L_0x0123;
    L_0x00e8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00f5;
    L_0x00ec:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00f9;
    L_0x00f5:
        r2 = r10.nextString();
    L_0x00f9:
        r0.c = r2;
        goto L_0x0019;
    L_0x00fd:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0106;
    L_0x0105:
        goto L_0x0123;
    L_0x0106:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0113;
    L_0x010a:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0117;
    L_0x0113:
        r2 = r10.nextString();
    L_0x0117:
        r0.b = r2;
        goto L_0x0019;
    L_0x011b:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0128;
    L_0x0123:
        r10.nextNull();
        goto L_0x0019;
    L_0x0128:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0135;
    L_0x012c:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0139;
    L_0x0135:
        r2 = r10.nextString();
    L_0x0139:
        r0.a = r2;
        goto L_0x0019;
    L_0x013d:
        r10.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekl.read(com.google.gson.stream.JsonReader):aekk");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aekk aekk) {
        if (aekk == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aekk.a != null) {
            jsonWriter.name("pack_id");
            jsonWriter.value(aekk.a);
        }
        if (aekk.b != null) {
            jsonWriter.name("sticker_id");
            jsonWriter.value(aekk.b);
        }
        if (aekk.c != null) {
            jsonWriter.name("sticker_type");
            jsonWriter.value(aekk.c);
        }
        if (aekk.d != null) {
            jsonWriter.name("capabilities");
            jsonWriter.beginArray();
            for (String value : aekk.d) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aekk.e != null) {
            jsonWriter.name("num_times_used");
            jsonWriter.value(aekk.e);
        }
        if (aekk.f != null) {
            jsonWriter.name("last_used");
            jsonWriter.value(aekk.f);
        }
        jsonWriter.endObject();
    }
}
