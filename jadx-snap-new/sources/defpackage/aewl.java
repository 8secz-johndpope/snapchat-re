package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aewl */
public final class aewl extends TypeAdapter<aewk> {
    private final Gson a;

    public aewl(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    public final defpackage.aewk read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aewk;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0088;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 109211271; // 0x6826e87 float:4.906297E-35 double:5.3957537E-316;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 351608024; // 0x14f51cd8 float:2.4750055E-26 double:1.737174455E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 1;
        goto L_0x0048;
    L_0x003d:
        r4 = "saved";
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
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x007d;
    L_0x0074:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0081;
    L_0x007d:
        r2 = r7.nextBoolean();
    L_0x0081:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x0088:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aewl.read(com.google.gson.stream.JsonReader):aewk");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aewk aewk) {
        if (aewk == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aewk.a != null) {
            jsonWriter.name("saved");
            jsonWriter.value(aewk.a.booleanValue());
        }
        if (aewk.b != null) {
            jsonWriter.name("version");
            jsonWriter.value(aewk.b);
        }
        jsonWriter.endObject();
    }
}
