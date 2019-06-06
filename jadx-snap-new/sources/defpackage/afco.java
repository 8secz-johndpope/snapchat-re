package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: afco */
public final class afco extends TypeAdapter<afcn> {
    private final Gson a;

    public afco(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* renamed from: a */
    public final defpackage.afcn read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new afcn;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x008b;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r4 == r5) goto L_0x003b;
    L_0x002c:
        r5 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        if (r4 == r5) goto L_0x0031;
    L_0x0030:
        goto L_0x0045;
    L_0x0031:
        r4 = "y";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0045;
    L_0x0039:
        r2 = 1;
        goto L_0x0046;
    L_0x003b:
        r4 = "x";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0045;
    L_0x0043:
        r2 = 0;
        goto L_0x0046;
    L_0x0045:
        r2 = -1;
    L_0x0046:
        if (r2 == 0) goto L_0x006b;
    L_0x0048:
        if (r2 == r1) goto L_0x004e;
    L_0x004a:
        r7.skipValue();
        goto L_0x0019;
    L_0x004e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0057;
    L_0x0056:
        goto L_0x0073;
    L_0x0057:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0064;
    L_0x005b:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0068;
    L_0x0064:
        r2 = r7.nextString();
    L_0x0068:
        r0.b = r2;
        goto L_0x0019;
    L_0x006b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0077;
    L_0x0073:
        r7.nextNull();
        goto L_0x0019;
    L_0x0077:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0084;
    L_0x007b:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0088;
    L_0x0084:
        r2 = r7.nextString();
    L_0x0088:
        r0.a = r2;
        goto L_0x0019;
    L_0x008b:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afco.read(com.google.gson.stream.JsonReader):afcn");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afcn afcn) {
        if (afcn == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afcn.a != null) {
            jsonWriter.name("x");
            jsonWriter.value(afcn.a);
        }
        if (afcn.b != null) {
            jsonWriter.name("y");
            jsonWriter.value(afcn.b);
        }
        jsonWriter.endObject();
    }
}
