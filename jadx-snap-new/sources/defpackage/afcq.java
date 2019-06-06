package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: afcq */
public final class afcq extends TypeAdapter<afcp> {
    private final Gson a;

    public afcq(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* renamed from: a */
    public final defpackage.afcp read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new afcp;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x00ed;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -1221029593; // 0xffffffffb7389127 float:-1.1001051E-5 double:NaN;
        r6 = 3;
        r7 = 2;
        if (r4 == r5) goto L_0x005b;
    L_0x002f:
        r5 = 113126854; // 0x6be2dc6 float:7.1537315E-35 double:5.5892092E-316;
        if (r4 == r5) goto L_0x0051;
    L_0x0034:
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r4 == r5) goto L_0x0047;
    L_0x0038:
        r5 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        if (r4 == r5) goto L_0x003d;
    L_0x003c:
        goto L_0x0065;
    L_0x003d:
        r4 = "y";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0065;
    L_0x0045:
        r2 = 1;
        goto L_0x0066;
    L_0x0047:
        r4 = "x";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0065;
    L_0x004f:
        r2 = 0;
        goto L_0x0066;
    L_0x0051:
        r4 = "width";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0065;
    L_0x0059:
        r2 = 2;
        goto L_0x0066;
    L_0x005b:
        r4 = "height";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0065;
    L_0x0063:
        r2 = 3;
        goto L_0x0066;
    L_0x0065:
        r2 = -1;
    L_0x0066:
        if (r2 == 0) goto L_0x00cb;
    L_0x0068:
        if (r2 == r1) goto L_0x00ad;
    L_0x006a:
        if (r2 == r7) goto L_0x008f;
    L_0x006c:
        if (r2 == r6) goto L_0x0072;
    L_0x006e:
        r9.skipValue();
        goto L_0x0019;
    L_0x0072:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x007b;
    L_0x007a:
        goto L_0x00d3;
    L_0x007b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0088;
    L_0x007f:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x008c;
    L_0x0088:
        r2 = r9.nextString();
    L_0x008c:
        r0.d = r2;
        goto L_0x0019;
    L_0x008f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0098;
    L_0x0097:
        goto L_0x00d3;
    L_0x0098:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00a5;
    L_0x009c:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00a9;
    L_0x00a5:
        r2 = r9.nextString();
    L_0x00a9:
        r0.c = r2;
        goto L_0x0019;
    L_0x00ad:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b6;
    L_0x00b5:
        goto L_0x00d3;
    L_0x00b6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00c3;
    L_0x00ba:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00c7;
    L_0x00c3:
        r2 = r9.nextString();
    L_0x00c7:
        r0.b = r2;
        goto L_0x0019;
    L_0x00cb:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d8;
    L_0x00d3:
        r9.nextNull();
        goto L_0x0019;
    L_0x00d8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00e5;
    L_0x00dc:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00e9;
    L_0x00e5:
        r2 = r9.nextString();
    L_0x00e9:
        r0.a = r2;
        goto L_0x0019;
    L_0x00ed:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afcq.read(com.google.gson.stream.JsonReader):afcp");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afcp afcp) {
        if (afcp == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afcp.a != null) {
            jsonWriter.name("x");
            jsonWriter.value(afcp.a);
        }
        if (afcp.b != null) {
            jsonWriter.name("y");
            jsonWriter.value(afcp.b);
        }
        if (afcp.c != null) {
            jsonWriter.name("width");
            jsonWriter.value(afcp.c);
        }
        if (afcp.d != null) {
            jsonWriter.name("height");
            jsonWriter.value(afcp.d);
        }
        jsonWriter.endObject();
    }
}
