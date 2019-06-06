package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: agfi */
public final class agfi extends TypeAdapter<agfh> {
    private final Gson a;

    public agfi(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    public final defpackage.agfh read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new agfh;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x007b;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 471793509; // 0x1c1eff65 float:5.2607904E-22 double:2.330969647E-315;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 955668829; // 0x38f6595d float:1.1746839E-4 double:4.72163137E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "wwan_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 1;
        goto L_0x0048;
    L_0x003d:
        r4 = "wifi_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 0;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x0064;
    L_0x004a:
        if (r2 == r1) goto L_0x0050;
    L_0x004c:
        r7.skipValue();
        goto L_0x0019;
    L_0x0050:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0059;
    L_0x0058:
        goto L_0x006c;
    L_0x0059:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x0064:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0070;
    L_0x006c:
        r7.nextNull();
        goto L_0x0019;
    L_0x0070:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x007b:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfi.read(com.google.gson.stream.JsonReader):agfh");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agfh agfh) {
        if (agfh == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agfh.a != null) {
            jsonWriter.name("wifi_count");
            jsonWriter.value(agfh.a);
        }
        if (agfh.b != null) {
            jsonWriter.name("wwan_count");
            jsonWriter.value(agfh.b);
        }
        jsonWriter.endObject();
    }
}
