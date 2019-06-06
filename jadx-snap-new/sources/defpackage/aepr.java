package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aepr */
public final class aepr extends TypeAdapter<aepq> {
    private final Gson a;

    public aepr(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:79:0x0147, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aepq read(com.google.gson.stream.JsonReader r6) {
        /*
        r5 = this;
        r0 = r6.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r6.nextNull();
        r6 = 0;
        return r6;
    L_0x000d:
        r0 = new aepq;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0161;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1747875261: goto L_0x0068;
            case -1354792126: goto L_0x005e;
            case -939156913: goto L_0x0054;
            case -126643040: goto L_0x004a;
            case 3355: goto L_0x0040;
            case 3373707: goto L_0x0036;
            case 204393237: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0072;
    L_0x002c:
        r4 = "activator";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0034:
        r2 = 2;
        goto L_0x0073;
    L_0x0036:
        r4 = "name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x003e:
        r2 = 1;
        goto L_0x0073;
    L_0x0040:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0048:
        r2 = 0;
        goto L_0x0073;
    L_0x004a:
        r4 = "config_checksum";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0052:
        r2 = 4;
        goto L_0x0073;
    L_0x0054:
        r4 = "additional_carousel_lenses_limit";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r2 = 6;
        goto L_0x0073;
    L_0x005e:
        r4 = "config";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0066:
        r2 = 3;
        goto L_0x0073;
    L_0x0068:
        r4 = "additional_carousel_categories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0070:
        r2 = 5;
        goto L_0x0073;
    L_0x0072:
        r2 = -1;
    L_0x0073:
        switch(r2) {
            case 0: goto L_0x013f;
            case 1: goto L_0x0121;
            case 2: goto L_0x0103;
            case 3: goto L_0x00e5;
            case 4: goto L_0x00c7;
            case 5: goto L_0x008f;
            case 6: goto L_0x007a;
            default: goto L_0x0076;
        };
    L_0x0076:
        r6.skipValue();
        goto L_0x0019;
    L_0x007a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0084;
    L_0x0082:
        goto L_0x0147;
    L_0x0084:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x008f:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0097:
        goto L_0x0147;
    L_0x0099:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x009d:
        r6.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x00a5:
        r4 = r6.hasNext();
        if (r4 == 0) goto L_0x00c0;
    L_0x00ab:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x00b8;
    L_0x00af:
        r4 = r6.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x00bc;
    L_0x00b8:
        r4 = r6.nextString();
    L_0x00bc:
        r3.add(r4);
        goto L_0x00a5;
    L_0x00c0:
        r6.endArray();
        r0.f = r3;
        goto L_0x0019;
    L_0x00c7:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d0;
    L_0x00cf:
        goto L_0x0147;
    L_0x00d0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00dd;
    L_0x00d4:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00e1;
    L_0x00dd:
        r2 = r6.nextString();
    L_0x00e1:
        r0.e = r2;
        goto L_0x0019;
    L_0x00e5:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ee;
    L_0x00ed:
        goto L_0x0147;
    L_0x00ee:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00fb;
    L_0x00f2:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ff;
    L_0x00fb:
        r2 = r6.nextString();
    L_0x00ff:
        r0.d = r2;
        goto L_0x0019;
    L_0x0103:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x010c;
    L_0x010b:
        goto L_0x0147;
    L_0x010c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0119;
    L_0x0110:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x011d;
    L_0x0119:
        r2 = r6.nextString();
    L_0x011d:
        r0.c = r2;
        goto L_0x0019;
    L_0x0121:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x012a;
    L_0x0129:
        goto L_0x0147;
    L_0x012a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0137;
    L_0x012e:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x013b;
    L_0x0137:
        r2 = r6.nextString();
    L_0x013b:
        r0.b = r2;
        goto L_0x0019;
    L_0x013f:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014c;
    L_0x0147:
        r6.nextNull();
        goto L_0x0019;
    L_0x014c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0159;
    L_0x0150:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x015d;
    L_0x0159:
        r2 = r6.nextString();
    L_0x015d:
        r0.a = r2;
        goto L_0x0019;
    L_0x0161:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepr.read(com.google.gson.stream.JsonReader):aepq");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aepq aepq) {
        if (aepq == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aepq.a != null) {
            jsonWriter.name("id");
            jsonWriter.value(aepq.a);
        }
        if (aepq.b != null) {
            jsonWriter.name("name");
            jsonWriter.value(aepq.b);
        }
        if (aepq.c != null) {
            jsonWriter.name("activator");
            jsonWriter.value(aepq.c);
        }
        if (aepq.d != null) {
            jsonWriter.name("config");
            jsonWriter.value(aepq.d);
        }
        if (aepq.e != null) {
            jsonWriter.name("config_checksum");
            jsonWriter.value(aepq.e);
        }
        if (aepq.f != null) {
            jsonWriter.name("additional_carousel_categories");
            jsonWriter.beginArray();
            for (String value : aepq.f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aepq.g != null) {
            jsonWriter.name("additional_carousel_lenses_limit");
            jsonWriter.value(aepq.g);
        }
        jsonWriter.endObject();
    }
}
