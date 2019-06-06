package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aesn */
public final class aesn extends TypeAdapter<aesm> {
    private final Gson a;

    public aesn(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* renamed from: a */
    public final defpackage.aesm read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aesm;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00be;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3355; // 0xd1b float:4.701E-42 double:1.6576E-320;
        r6 = 2;
        if (r4 == r5) goto L_0x004c;
    L_0x002d:
        r5 = 3575610; // 0x368f3a float:5.010497E-39 double:1.766586E-317;
        if (r4 == r5) goto L_0x0042;
    L_0x0032:
        r5 = 30491792; // 0x1d14490 float:7.6872857E-38 double:1.5064947E-316;
        if (r4 == r5) goto L_0x0038;
    L_0x0037:
        goto L_0x0056;
    L_0x0038:
        r4 = "app_engine_target";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 2;
        goto L_0x0057;
    L_0x0042:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 0;
        goto L_0x0057;
    L_0x004c:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 1;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x009c;
    L_0x0059:
        if (r2 == r1) goto L_0x007e;
    L_0x005b:
        if (r2 == r6) goto L_0x0061;
    L_0x005d:
        r8.skipValue();
        goto L_0x0019;
    L_0x0061:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006a;
    L_0x0069:
        goto L_0x00a4;
    L_0x006a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0077;
    L_0x006e:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x007b;
    L_0x0077:
        r2 = r8.nextString();
    L_0x007b:
        r0.q = r2;
        goto L_0x0019;
    L_0x007e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0087;
    L_0x0086:
        goto L_0x00a4;
    L_0x0087:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0094;
    L_0x008b:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0098;
    L_0x0094:
        r2 = r8.nextString();
    L_0x0098:
        r0.p = r2;
        goto L_0x0019;
    L_0x009c:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a9;
    L_0x00a4:
        r8.nextNull();
        goto L_0x0019;
    L_0x00a9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b6;
    L_0x00ad:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ba;
    L_0x00b6:
        r2 = r8.nextString();
    L_0x00ba:
        r0.o = r2;
        goto L_0x0019;
    L_0x00be:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesn.read(com.google.gson.stream.JsonReader):aesm");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aesm aesm) {
        if (aesm == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aesm.o != null) {
            jsonWriter.name("type");
            jsonWriter.value(aesm.o);
        }
        if (aesm.p != null) {
            jsonWriter.name("id");
            jsonWriter.value(aesm.p);
        }
        if (aesm.q != null) {
            jsonWriter.name("app_engine_target");
            jsonWriter.value(aesm.q);
        }
        jsonWriter.endObject();
    }
}
