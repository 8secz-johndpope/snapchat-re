package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.snap.core.db.record.TalkAuthContextModel;

/* renamed from: aexq */
public final class aexq extends TypeAdapter<aexp> {
    private final Gson a;

    public aexq(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.aexp read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aexp;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00bf;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -786701938; // 0xffffffffd11be18e float:-4.1844007E10 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = 107855; // 0x1a54f float:1.51137E-40 double:5.32875E-319;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = 3575610; // 0x368f3a float:5.010497E-39 double:1.766586E-317;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 2;
        goto L_0x0058;
    L_0x0043:
        r4 = "mac";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 1;
        goto L_0x0058;
    L_0x004d:
        r4 = "payload";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 0;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x009d;
    L_0x005a:
        if (r2 == r1) goto L_0x007f;
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
        goto L_0x00a5;
    L_0x006b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0078;
    L_0x006f:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x007c;
    L_0x0078:
        r2 = r8.nextString();
    L_0x007c:
        r0.c = r2;
        goto L_0x0019;
    L_0x007f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0088;
    L_0x0087:
        goto L_0x00a5;
    L_0x0088:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0095;
    L_0x008c:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0099;
    L_0x0095:
        r2 = r8.nextString();
    L_0x0099:
        r0.b = r2;
        goto L_0x0019;
    L_0x009d:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00aa;
    L_0x00a5:
        r8.nextNull();
        goto L_0x0019;
    L_0x00aa:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b7;
    L_0x00ae:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00bb;
    L_0x00b7:
        r2 = r8.nextString();
    L_0x00bb:
        r0.a = r2;
        goto L_0x0019;
    L_0x00bf:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexq.read(com.google.gson.stream.JsonReader):aexp");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aexp aexp) {
        if (aexp == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aexp.a != null) {
            jsonWriter.name("payload");
            jsonWriter.value(aexp.a);
        }
        if (aexp.b != null) {
            jsonWriter.name(TalkAuthContextModel.MAC);
            jsonWriter.value(aexp.b);
        }
        if (aexp.c != null) {
            jsonWriter.name("type");
            jsonWriter.value(aexp.c);
        }
        jsonWriter.endObject();
    }
}
