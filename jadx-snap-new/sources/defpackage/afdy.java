package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: afdy */
public final class afdy extends TypeAdapter<afdx> {
    private final Gson a;
    private final Supplier<TypeAdapter<afdz>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afdz.class)));

    public afdy(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:102:0x01af, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.afdx read(com.google.gson.stream.JsonReader r7) {
        /*
        r6 = this;
        r0 = r7.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r7.nextNull();
        r7 = 0;
        return r7;
    L_0x000d:
        r0 = new afdx;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x01c9;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2076227591: goto L_0x007d;
            case -1830951647: goto L_0x0073;
            case -127019350: goto L_0x0068;
            case 199835397: goto L_0x005e;
            case 458214405: goto L_0x0054;
            case 700982874: goto L_0x004a;
            case 783821580: goto L_0x0040;
            case 1305850638: goto L_0x0036;
            case 1572999966: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0087;
    L_0x002c:
        r4 = "weekly_frequency";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0034:
        r2 = 7;
        goto L_0x0088;
    L_0x0036:
        r4 = "repetition_frequency";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x003e:
        r2 = 5;
        goto L_0x0088;
    L_0x0040:
        r4 = "repetition_end_date_time";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0048:
        r2 = 6;
        goto L_0x0088;
    L_0x004a:
        r4 = "end_date_time";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0052:
        r2 = 2;
        goto L_0x0088;
    L_0x0054:
        r4 = "use_local_timezone";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x005c:
        r2 = 4;
        goto L_0x0088;
    L_0x005e:
        r4 = "scheduling_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0066:
        r2 = 0;
        goto L_0x0088;
    L_0x0068:
        r4 = "repeat_intervals";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0070:
        r2 = 8;
        goto L_0x0088;
    L_0x0073:
        r4 = "start_date_time";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x007b:
        r2 = 1;
        goto L_0x0088;
    L_0x007d:
        r4 = "timezone";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0085:
        r2 = 3;
        goto L_0x0088;
    L_0x0087:
        r2 = -1;
    L_0x0088:
        switch(r2) {
            case 0: goto L_0x01a7;
            case 1: goto L_0x0189;
            case 2: goto L_0x016b;
            case 3: goto L_0x014d;
            case 4: goto L_0x012b;
            case 5: goto L_0x010c;
            case 6: goto L_0x00ed;
            case 7: goto L_0x00ce;
            case 8: goto L_0x008f;
            default: goto L_0x008b;
        };
    L_0x008b:
        r7.skipValue();
        goto L_0x0019;
    L_0x008f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0097:
        goto L_0x01af;
    L_0x0099:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x009d:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00ad:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x00c7;
    L_0x00b3:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00bf;
    L_0x00bb:
        r7.nextNull();
        goto L_0x00ad;
    L_0x00bf:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x00ad;
    L_0x00c7:
        r7.endArray();
        r0.i = r2;
        goto L_0x0019;
    L_0x00ce:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d8;
    L_0x00d6:
        goto L_0x01af;
    L_0x00d8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00e5;
    L_0x00dc:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00e9;
    L_0x00e5:
        r2 = r7.nextString();
    L_0x00e9:
        r0.h = r2;
        goto L_0x0019;
    L_0x00ed:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f7;
    L_0x00f5:
        goto L_0x01af;
    L_0x00f7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0104;
    L_0x00fb:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0108;
    L_0x0104:
        r2 = r7.nextString();
    L_0x0108:
        r0.g = r2;
        goto L_0x0019;
    L_0x010c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0116;
    L_0x0114:
        goto L_0x01af;
    L_0x0116:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0123;
    L_0x011a:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0127;
    L_0x0123:
        r2 = r7.nextString();
    L_0x0127:
        r0.f = r2;
        goto L_0x0019;
    L_0x012b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0134;
    L_0x0133:
        goto L_0x01af;
    L_0x0134:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0141;
    L_0x0138:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0145;
    L_0x0141:
        r2 = r7.nextBoolean();
    L_0x0145:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x014d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0156;
    L_0x0155:
        goto L_0x01af;
    L_0x0156:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0163;
    L_0x015a:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0167;
    L_0x0163:
        r2 = r7.nextString();
    L_0x0167:
        r0.d = r2;
        goto L_0x0019;
    L_0x016b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0174;
    L_0x0173:
        goto L_0x01af;
    L_0x0174:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0181;
    L_0x0178:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0185;
    L_0x0181:
        r2 = r7.nextString();
    L_0x0185:
        r0.c = r2;
        goto L_0x0019;
    L_0x0189:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0192;
    L_0x0191:
        goto L_0x01af;
    L_0x0192:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x019f;
    L_0x0196:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01a3;
    L_0x019f:
        r2 = r7.nextString();
    L_0x01a3:
        r0.b = r2;
        goto L_0x0019;
    L_0x01a7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01b4;
    L_0x01af:
        r7.nextNull();
        goto L_0x0019;
    L_0x01b4:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01c1;
    L_0x01b8:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01c5;
    L_0x01c1:
        r2 = r7.nextString();
    L_0x01c5:
        r0.a = r2;
        goto L_0x0019;
    L_0x01c9:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdy.read(com.google.gson.stream.JsonReader):afdx");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afdx afdx) {
        if (afdx == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afdx.a != null) {
            jsonWriter.name("scheduling_type");
            jsonWriter.value(afdx.a);
        }
        if (afdx.b != null) {
            jsonWriter.name("start_date_time");
            jsonWriter.value(afdx.b);
        }
        if (afdx.c != null) {
            jsonWriter.name("end_date_time");
            jsonWriter.value(afdx.c);
        }
        if (afdx.d != null) {
            jsonWriter.name("timezone");
            jsonWriter.value(afdx.d);
        }
        if (afdx.e != null) {
            jsonWriter.name("use_local_timezone");
            jsonWriter.value(afdx.e.booleanValue());
        }
        if (afdx.f != null) {
            jsonWriter.name("repetition_frequency");
            jsonWriter.value(afdx.f);
        }
        if (afdx.g != null) {
            jsonWriter.name("repetition_end_date_time");
            jsonWriter.value(afdx.g);
        }
        if (afdx.h != null) {
            jsonWriter.name("weekly_frequency");
            jsonWriter.value(afdx.h);
        }
        if (afdx.i != null) {
            jsonWriter.name("repeat_intervals");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (afdz write : afdx.i) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
