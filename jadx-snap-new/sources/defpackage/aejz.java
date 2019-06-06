package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aejz */
public final class aejz extends TypeAdapter<aejy> {
    private final Gson a;

    public aejz(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:79:0x014e, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aejy read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new aejy;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x015f;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -951288535: goto L_0x0072;
            case -896505829: goto L_0x0068;
            case -650235272: goto L_0x005e;
            case -436616157: goto L_0x0054;
            case 3575610: goto L_0x004a;
            case 110371416: goto L_0x0040;
            case 749368042: goto L_0x0036;
            case 1217996453: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x007c;
    L_0x002c:
        r4 = "emoji_legend_rank";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0034:
        r2 = 7;
        goto L_0x007d;
    L_0x0036:
        r4 = "emoji_desc";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x003e:
        r2 = 3;
        goto L_0x007d;
    L_0x0040:
        r4 = "title";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0048:
        r2 = 2;
        goto L_0x007d;
    L_0x004a:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0052:
        r2 = 0;
        goto L_0x007d;
    L_0x0054:
        r4 = "default_val";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x005c:
        r2 = 6;
        goto L_0x007d;
    L_0x005e:
        r4 = "default_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0066:
        r2 = 5;
        goto L_0x007d;
    L_0x0068:
        r4 = "source";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0070:
        r2 = 1;
        goto L_0x007d;
    L_0x0072:
        r4 = "emoji_picker_desc";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x007a:
        r2 = 4;
        goto L_0x007d;
    L_0x007c:
        r2 = -1;
    L_0x007d:
        switch(r2) {
            case 0: goto L_0x0146;
            case 1: goto L_0x0128;
            case 2: goto L_0x010a;
            case 3: goto L_0x00ec;
            case 4: goto L_0x00ce;
            case 5: goto L_0x00b8;
            case 6: goto L_0x0099;
            case 7: goto L_0x0084;
            default: goto L_0x0080;
        };
    L_0x0080:
        r6.skipValue();
        goto L_0x0019;
    L_0x0084:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x008e;
    L_0x008c:
        goto L_0x014e;
    L_0x008e:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.h = r2;
        goto L_0x0019;
    L_0x0099:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a3;
    L_0x00a1:
        goto L_0x014e;
    L_0x00a3:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b0;
    L_0x00a7:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b4;
    L_0x00b0:
        r2 = r6.nextString();
    L_0x00b4:
        r0.g = r2;
        goto L_0x0019;
    L_0x00b8:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c2;
    L_0x00c0:
        goto L_0x014e;
    L_0x00c2:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x00ce:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d7;
    L_0x00d6:
        goto L_0x014e;
    L_0x00d7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00e4;
    L_0x00db:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00e8;
    L_0x00e4:
        r2 = r6.nextString();
    L_0x00e8:
        r0.e = r2;
        goto L_0x0019;
    L_0x00ec:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f5;
    L_0x00f4:
        goto L_0x014e;
    L_0x00f5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0102;
    L_0x00f9:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0106;
    L_0x0102:
        r2 = r6.nextString();
    L_0x0106:
        r0.d = r2;
        goto L_0x0019;
    L_0x010a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0113;
    L_0x0112:
        goto L_0x014e;
    L_0x0113:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0120;
    L_0x0117:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0124;
    L_0x0120:
        r2 = r6.nextString();
    L_0x0124:
        r0.c = r2;
        goto L_0x0019;
    L_0x0128:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0131;
    L_0x0130:
        goto L_0x014e;
    L_0x0131:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x013e;
    L_0x0135:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0142;
    L_0x013e:
        r2 = r6.nextString();
    L_0x0142:
        r0.b = r2;
        goto L_0x0019;
    L_0x0146:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0153;
    L_0x014e:
        r6.nextNull();
        goto L_0x0019;
    L_0x0153:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x015f:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejz.read(com.google.gson.stream.JsonReader):aejy");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aejy aejy) {
        if (aejy == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aejy.a != null) {
            jsonWriter.name("type");
            jsonWriter.value(aejy.a);
        }
        if (aejy.b != null) {
            jsonWriter.name("source");
            jsonWriter.value(aejy.b);
        }
        if (aejy.c != null) {
            jsonWriter.name("title");
            jsonWriter.value(aejy.c);
        }
        if (aejy.d != null) {
            jsonWriter.name("emoji_desc");
            jsonWriter.value(aejy.d);
        }
        if (aejy.e != null) {
            jsonWriter.name("emoji_picker_desc");
            jsonWriter.value(aejy.e);
        }
        if (aejy.f != null) {
            jsonWriter.name("default_type");
            jsonWriter.value(aejy.f);
        }
        if (aejy.g != null) {
            jsonWriter.name("default_val");
            jsonWriter.value(aejy.g);
        }
        if (aejy.h != null) {
            jsonWriter.name("emoji_legend_rank");
            jsonWriter.value(aejy.h);
        }
        jsonWriter.endObject();
    }
}
