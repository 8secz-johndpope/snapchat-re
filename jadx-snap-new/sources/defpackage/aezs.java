package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aezs */
public final class aezs extends TypeAdapter<aezr> {
    private final Gson a;
    private final Supplier<TypeAdapter<afcn>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afcn.class)));

    public aezs(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aezr read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new aezr;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x0106;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -1037596717: goto L_0x0057;
            case -791072253: goto L_0x004d;
            case 3148879: goto L_0x0043;
            case 94842723: goto L_0x0039;
            case 517862387: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0061;
    L_0x002f:
        r4 = "dropshadow_color";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0037:
        r2 = 3;
        goto L_0x0062;
    L_0x0039:
        r4 = "color";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 2;
        goto L_0x0062;
    L_0x0043:
        r4 = "font";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 0;
        goto L_0x0062;
    L_0x004d:
        r4 = "dropshadow_offset";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 4;
        goto L_0x0062;
    L_0x0057:
        r4 = "text_size";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 1;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x00e4;
    L_0x0064:
        if (r2 == r1) goto L_0x00c6;
    L_0x0066:
        if (r2 == r7) goto L_0x00a8;
    L_0x0068:
        if (r2 == r6) goto L_0x008a;
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
        goto L_0x00ec;
    L_0x0079:
        r2 = r8.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.afcn) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x008a:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0093;
    L_0x0092:
        goto L_0x00ec;
    L_0x0093:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00a0;
    L_0x0097:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00a4;
    L_0x00a0:
        r2 = r9.nextString();
    L_0x00a4:
        r0.d = r2;
        goto L_0x0019;
    L_0x00a8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b1;
    L_0x00b0:
        goto L_0x00ec;
    L_0x00b1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00be;
    L_0x00b5:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00c2;
    L_0x00be:
        r2 = r9.nextString();
    L_0x00c2:
        r0.c = r2;
        goto L_0x0019;
    L_0x00c6:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cf;
    L_0x00ce:
        goto L_0x00ec;
    L_0x00cf:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00dc;
    L_0x00d3:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00e0;
    L_0x00dc:
        r2 = r9.nextString();
    L_0x00e0:
        r0.b = r2;
        goto L_0x0019;
    L_0x00e4:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f1;
    L_0x00ec:
        r9.nextNull();
        goto L_0x0019;
    L_0x00f1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00fe;
    L_0x00f5:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0102;
    L_0x00fe:
        r2 = r9.nextString();
    L_0x0102:
        r0.a = r2;
        goto L_0x0019;
    L_0x0106:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezs.read(com.google.gson.stream.JsonReader):aezr");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aezr aezr) {
        if (aezr == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aezr.a != null) {
            jsonWriter.name("font");
            jsonWriter.value(aezr.a);
        }
        if (aezr.b != null) {
            jsonWriter.name("text_size");
            jsonWriter.value(aezr.b);
        }
        if (aezr.c != null) {
            jsonWriter.name("color");
            jsonWriter.value(aezr.c);
        }
        if (aezr.d != null) {
            jsonWriter.name("dropshadow_color");
            jsonWriter.value(aezr.d);
        }
        if (aezr.e != null) {
            jsonWriter.name("dropshadow_offset");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aezr.e);
        }
        jsonWriter.endObject();
    }
}
