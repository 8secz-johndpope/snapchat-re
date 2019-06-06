package defpackage;

import com.brightcove.player.event.Event;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aezq */
public final class aezq extends TypeAdapter<aezp> {
    private final Gson a;
    private final Supplier<TypeAdapter<afcp>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afcp.class)));

    public aezq(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:109:0x01ce, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aezp read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new aezp;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x01e5;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1573079234: goto L_0x0093;
            case -1526918964: goto L_0x0088;
            case -1518200785: goto L_0x007e;
            case -132458381: goto L_0x0074;
            case 3556653: goto L_0x006a;
            case 564909476: goto L_0x0060;
            case 747804969: goto L_0x0056;
            case 1024759830: goto L_0x004c;
            case 1142355524: goto L_0x0041;
            case 1767875043: goto L_0x0037;
            case 2132383941: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x009d;
    L_0x002c:
        r4 = "longform_time_before_fadeout";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0034:
        r2 = 10;
        goto L_0x009e;
    L_0x0037:
        r4 = "alignment";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x003f:
        r2 = 1;
        goto L_0x009e;
    L_0x0041:
        r4 = "time_before_fadeout";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0049:
        r2 = 8;
        goto L_0x009e;
    L_0x004c:
        r4 = "hmargin";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0054:
        r2 = 3;
        goto L_0x009e;
    L_0x0056:
        r4 = "position";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x005e:
        r2 = 2;
        goto L_0x009e;
    L_0x0060:
        r4 = "vmargin";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0068:
        r2 = 4;
        goto L_0x009e;
    L_0x006a:
        r4 = "text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0072:
        r2 = 5;
        goto L_0x009e;
    L_0x0074:
        r4 = "sponsored_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x007c:
        r2 = 6;
        goto L_0x009e;
    L_0x007e:
        r4 = "sponsored_channel_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0086:
        r2 = 7;
        goto L_0x009e;
    L_0x0088:
        r4 = "longform_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0090:
        r2 = 9;
        goto L_0x009e;
    L_0x0093:
        r4 = "view_rect";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x009b:
        r2 = 0;
        goto L_0x009e;
    L_0x009d:
        r2 = -1;
    L_0x009e:
        switch(r2) {
            case 0: goto L_0x01c6;
            case 1: goto L_0x01a8;
            case 2: goto L_0x018a;
            case 3: goto L_0x016c;
            case 4: goto L_0x014e;
            case 5: goto L_0x012f;
            case 6: goto L_0x0110;
            case 7: goto L_0x00f1;
            case 8: goto L_0x00db;
            case 9: goto L_0x00bc;
            case 10: goto L_0x00a6;
            default: goto L_0x00a1;
        };
    L_0x00a1:
        r6.skipValue();
        goto L_0x0019;
    L_0x00a6:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b0;
    L_0x00ae:
        goto L_0x01ce;
    L_0x00b0:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.k = r2;
        goto L_0x0019;
    L_0x00bc:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c6;
    L_0x00c4:
        goto L_0x01ce;
    L_0x00c6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d3;
    L_0x00ca:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d7;
    L_0x00d3:
        r2 = r6.nextString();
    L_0x00d7:
        r0.j = r2;
        goto L_0x0019;
    L_0x00db:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e5;
    L_0x00e3:
        goto L_0x01ce;
    L_0x00e5:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.i = r2;
        goto L_0x0019;
    L_0x00f1:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00fb;
    L_0x00f9:
        goto L_0x01ce;
    L_0x00fb:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0108;
    L_0x00ff:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x010c;
    L_0x0108:
        r2 = r6.nextString();
    L_0x010c:
        r0.h = r2;
        goto L_0x0019;
    L_0x0110:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x011a;
    L_0x0118:
        goto L_0x01ce;
    L_0x011a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0127;
    L_0x011e:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x012b;
    L_0x0127:
        r2 = r6.nextString();
    L_0x012b:
        r0.g = r2;
        goto L_0x0019;
    L_0x012f:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0139;
    L_0x0137:
        goto L_0x01ce;
    L_0x0139:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0146;
    L_0x013d:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x014a;
    L_0x0146:
        r2 = r6.nextString();
    L_0x014a:
        r0.f = r2;
        goto L_0x0019;
    L_0x014e:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0157;
    L_0x0156:
        goto L_0x01ce;
    L_0x0157:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0164;
    L_0x015b:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0168;
    L_0x0164:
        r2 = r6.nextString();
    L_0x0168:
        r0.e = r2;
        goto L_0x0019;
    L_0x016c:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0175;
    L_0x0174:
        goto L_0x01ce;
    L_0x0175:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0182;
    L_0x0179:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0186;
    L_0x0182:
        r2 = r6.nextString();
    L_0x0186:
        r0.d = r2;
        goto L_0x0019;
    L_0x018a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0193;
    L_0x0192:
        goto L_0x01ce;
    L_0x0193:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01a0;
    L_0x0197:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01a4;
    L_0x01a0:
        r2 = r6.nextString();
    L_0x01a4:
        r0.c = r2;
        goto L_0x0019;
    L_0x01a8:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01b1;
    L_0x01b0:
        goto L_0x01ce;
    L_0x01b1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01be;
    L_0x01b5:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01c2;
    L_0x01be:
        r2 = r6.nextString();
    L_0x01c2:
        r0.b = r2;
        goto L_0x0019;
    L_0x01c6:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01d3;
    L_0x01ce:
        r6.nextNull();
        goto L_0x0019;
    L_0x01d3:
        r2 = r5.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r6);
        r2 = (defpackage.afcp) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x01e5:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezq.read(com.google.gson.stream.JsonReader):aezp");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aezp aezp) {
        if (aezp == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aezp.a != null) {
            jsonWriter.name("view_rect");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aezp.a);
        }
        if (aezp.b != null) {
            jsonWriter.name(Event.ALIGNMENT);
            jsonWriter.value(aezp.b);
        }
        if (aezp.c != null) {
            jsonWriter.name("position");
            jsonWriter.value(aezp.c);
        }
        if (aezp.d != null) {
            jsonWriter.name("hmargin");
            jsonWriter.value(aezp.d);
        }
        if (aezp.e != null) {
            jsonWriter.name("vmargin");
            jsonWriter.value(aezp.e);
        }
        if (aezp.f != null) {
            jsonWriter.name("text");
            jsonWriter.value(aezp.f);
        }
        if (aezp.g != null) {
            jsonWriter.name("sponsored_text");
            jsonWriter.value(aezp.g);
        }
        if (aezp.h != null) {
            jsonWriter.name("sponsored_channel_text");
            jsonWriter.value(aezp.h);
        }
        if (aezp.i != null) {
            jsonWriter.name("time_before_fadeout");
            jsonWriter.value(aezp.i);
        }
        if (aezp.j != null) {
            jsonWriter.name("longform_text");
            jsonWriter.value(aezp.j);
        }
        if (aezp.k != null) {
            jsonWriter.name("longform_time_before_fadeout");
            jsonWriter.value(aezp.k);
        }
        jsonWriter.endObject();
    }
}
