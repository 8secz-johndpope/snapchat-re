package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aice */
public final class aice extends TypeAdapter<aicd> {
    private final Gson a;

    public aice(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:109:0x01c7, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aicd read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new aicd;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x01fa;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1987200731: goto L_0x0068;
            case -1486070196: goto L_0x005e;
            case -1392269186: goto L_0x0054;
            case -47872893: goto L_0x004a;
            case 358568643: goto L_0x0040;
            case 581715694: goto L_0x0036;
            case 1467632459: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0072;
    L_0x002c:
        r4 = "trigger_contexts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0034:
        r2 = 0;
        goto L_0x0073;
    L_0x0036:
        r4 = "media_type_contexts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x003e:
        r2 = 3;
        goto L_0x0073;
    L_0x0040:
        r4 = "visual_contexts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0048:
        r2 = 5;
        goto L_0x0073;
    L_0x004a:
        r4 = "lens_applicable_contexts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0052:
        r2 = 6;
        goto L_0x0073;
    L_0x0054:
        r4 = "camera_contexts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r2 = 2;
        goto L_0x0073;
    L_0x005e:
        r4 = "actionmoji_contexts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0066:
        r2 = 4;
        goto L_0x0073;
    L_0x0068:
        r4 = "friend_contexts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0070:
        r2 = 1;
        goto L_0x0073;
    L_0x0072:
        r2 = -1;
    L_0x0073:
        switch(r2) {
            case 0: goto L_0x01bf;
            case 1: goto L_0x0188;
            case 2: goto L_0x0151;
            case 3: goto L_0x0119;
            case 4: goto L_0x00ea;
            case 5: goto L_0x00b2;
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
        goto L_0x01c7;
    L_0x0084:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0088:
        r6.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0090:
        r4 = r6.hasNext();
        if (r4 == 0) goto L_0x00ab;
    L_0x0096:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x00a3;
    L_0x009a:
        r4 = r6.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x00a7;
    L_0x00a3:
        r4 = r6.nextString();
    L_0x00a7:
        r3.add(r4);
        goto L_0x0090;
    L_0x00ab:
        r6.endArray();
        r0.g = r3;
        goto L_0x0019;
    L_0x00b2:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00bc;
    L_0x00ba:
        goto L_0x01c7;
    L_0x00bc:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00c0:
        r6.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x00c8:
        r4 = r6.hasNext();
        if (r4 == 0) goto L_0x00e3;
    L_0x00ce:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x00db;
    L_0x00d2:
        r4 = r6.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x00df;
    L_0x00db:
        r4 = r6.nextString();
    L_0x00df:
        r3.add(r4);
        goto L_0x00c8;
    L_0x00e3:
        r6.endArray();
        r0.f = r3;
        goto L_0x0019;
    L_0x00ea:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f4;
    L_0x00f2:
        goto L_0x01c7;
    L_0x00f4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00f8:
        r6.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
    L_0x0100:
        r3 = r6.hasNext();
        if (r3 == 0) goto L_0x0112;
    L_0x0106:
        r3 = r6.nextLong();
        r3 = java.lang.Long.valueOf(r3);
        r2.add(r3);
        goto L_0x0100;
    L_0x0112:
        r6.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x0119:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0123;
    L_0x0121:
        goto L_0x01c7;
    L_0x0123:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0127:
        r6.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x012f:
        r4 = r6.hasNext();
        if (r4 == 0) goto L_0x014a;
    L_0x0135:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0142;
    L_0x0139:
        r4 = r6.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0146;
    L_0x0142:
        r4 = r6.nextString();
    L_0x0146:
        r3.add(r4);
        goto L_0x012f;
    L_0x014a:
        r6.endArray();
        r0.d = r3;
        goto L_0x0019;
    L_0x0151:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x015a;
    L_0x0159:
        goto L_0x01c7;
    L_0x015a:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x015e:
        r6.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0166:
        r4 = r6.hasNext();
        if (r4 == 0) goto L_0x0181;
    L_0x016c:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0179;
    L_0x0170:
        r4 = r6.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x017d;
    L_0x0179:
        r4 = r6.nextString();
    L_0x017d:
        r3.add(r4);
        goto L_0x0166;
    L_0x0181:
        r6.endArray();
        r0.c = r3;
        goto L_0x0019;
    L_0x0188:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0191;
    L_0x0190:
        goto L_0x01c7;
    L_0x0191:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0195:
        r6.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x019d:
        r4 = r6.hasNext();
        if (r4 == 0) goto L_0x01b8;
    L_0x01a3:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x01b0;
    L_0x01a7:
        r4 = r6.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x01b4;
    L_0x01b0:
        r4 = r6.nextString();
    L_0x01b4:
        r3.add(r4);
        goto L_0x019d;
    L_0x01b8:
        r6.endArray();
        r0.b = r3;
        goto L_0x0019;
    L_0x01bf:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01cc;
    L_0x01c7:
        r6.nextNull();
        goto L_0x0019;
    L_0x01cc:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01d0:
        r6.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x01d8:
        r4 = r6.hasNext();
        if (r4 == 0) goto L_0x01f3;
    L_0x01de:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x01eb;
    L_0x01e2:
        r4 = r6.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x01ef;
    L_0x01eb:
        r4 = r6.nextString();
    L_0x01ef:
        r3.add(r4);
        goto L_0x01d8;
    L_0x01f3:
        r6.endArray();
        r0.a = r3;
        goto L_0x0019;
    L_0x01fa:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aice.read(com.google.gson.stream.JsonReader):aicd");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aicd aicd) {
        if (aicd == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aicd.a != null) {
            jsonWriter.name("trigger_contexts");
            jsonWriter.beginArray();
            for (String value : aicd.a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aicd.b != null) {
            jsonWriter.name("friend_contexts");
            jsonWriter.beginArray();
            for (String value2 : aicd.b) {
                jsonWriter.value(value2);
            }
            jsonWriter.endArray();
        }
        if (aicd.c != null) {
            jsonWriter.name("camera_contexts");
            jsonWriter.beginArray();
            for (String value22 : aicd.c) {
                jsonWriter.value(value22);
            }
            jsonWriter.endArray();
        }
        if (aicd.d != null) {
            jsonWriter.name("media_type_contexts");
            jsonWriter.beginArray();
            for (String value222 : aicd.d) {
                jsonWriter.value(value222);
            }
            jsonWriter.endArray();
        }
        if (aicd.e != null) {
            jsonWriter.name("actionmoji_contexts");
            jsonWriter.beginArray();
            for (Number value3 : aicd.e) {
                jsonWriter.value(value3);
            }
            jsonWriter.endArray();
        }
        if (aicd.f != null) {
            jsonWriter.name("visual_contexts");
            jsonWriter.beginArray();
            for (String value2222 : aicd.f) {
                jsonWriter.value(value2222);
            }
            jsonWriter.endArray();
        }
        if (aicd.g != null) {
            jsonWriter.name("lens_applicable_contexts");
            jsonWriter.beginArray();
            for (String value4 : aicd.g) {
                jsonWriter.value(value4);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
