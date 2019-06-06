package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aekn */
public final class aekn extends TypeAdapter<aekm> {
    private final Gson a;

    public aekn(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.aekm read(com.google.gson.stream.JsonReader r8) {
        /*
        r7 = this;
        r0 = r8.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r8.nextNull();
        r8 = 0;
        return r8;
    L_0x000d:
        r0 = new aekm;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00b5;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -1156053310; // 0xffffffffbb1806c2 float:-0.0023197387 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = 516658970; // 0x1ecb971a float:2.1555955E-20 double:2.552634477E-315;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = 1903483936; // 0x7174dc20 float:1.2124873E30 double:9.4044602E-315;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "latest_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 2;
        goto L_0x0058;
    L_0x0043:
        r4 = "setting_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 0;
        goto L_0x0058;
    L_0x004d:
        r4 = "setting_value";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 1;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x0093;
    L_0x005a:
        if (r2 == r1) goto L_0x0076;
    L_0x005c:
        if (r2 == r6) goto L_0x0062;
    L_0x005e:
        r8.skipValue();
        goto L_0x0019;
    L_0x0062:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006b;
    L_0x006a:
        goto L_0x009b;
    L_0x006b:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x0076:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x007f;
    L_0x007e:
        goto L_0x009b;
    L_0x007f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x008c;
    L_0x0083:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0090;
    L_0x008c:
        r2 = r8.nextString();
    L_0x0090:
        r0.b = r2;
        goto L_0x0019;
    L_0x0093:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a0;
    L_0x009b:
        r8.nextNull();
        goto L_0x0019;
    L_0x00a0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ad;
    L_0x00a4:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b1;
    L_0x00ad:
        r2 = r8.nextString();
    L_0x00b1:
        r0.a = r2;
        goto L_0x0019;
    L_0x00b5:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekn.read(com.google.gson.stream.JsonReader):aekm");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aekm aekm) {
        if (aekm == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aekm.a != null) {
            jsonWriter.name("setting_name");
            jsonWriter.value(aekm.a);
        }
        if (aekm.b != null) {
            jsonWriter.name("setting_value");
            jsonWriter.value(aekm.b);
        }
        if (aekm.c != null) {
            jsonWriter.name("latest_version");
            jsonWriter.value(aekm.c);
        }
        jsonWriter.endObject();
    }
}
