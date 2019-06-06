package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aeun */
public final class aeun extends TypeAdapter<aeum> {
    private final Gson a;

    public aeun(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cc  */
    /* renamed from: a */
    public final defpackage.aeum read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new aeum;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x00ee;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -567991544; // 0xffffffffde252308 float:-2.97484086E18 double:NaN;
        r6 = 3;
        r7 = 2;
        if (r4 == r5) goto L_0x005c;
    L_0x002f:
        r5 = 3355; // 0xd1b float:4.701E-42 double:1.6576E-320;
        if (r4 == r5) goto L_0x0052;
    L_0x0033:
        r5 = 3575610; // 0x368f3a float:5.010497E-39 double:1.766586E-317;
        if (r4 == r5) goto L_0x0048;
    L_0x0038:
        r5 = 30491792; // 0x1d14490 float:7.6872857E-38 double:1.5064947E-316;
        if (r4 == r5) goto L_0x003e;
    L_0x003d:
        goto L_0x0066;
    L_0x003e:
        r4 = "app_engine_target";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0066;
    L_0x0046:
        r2 = 3;
        goto L_0x0067;
    L_0x0048:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0066;
    L_0x0050:
        r2 = 1;
        goto L_0x0067;
    L_0x0052:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0066;
    L_0x005a:
        r2 = 2;
        goto L_0x0067;
    L_0x005c:
        r4 = "ping_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0066;
    L_0x0064:
        r2 = 0;
        goto L_0x0067;
    L_0x0066:
        r2 = -1;
    L_0x0067:
        if (r2 == 0) goto L_0x00cc;
    L_0x0069:
        if (r2 == r1) goto L_0x00ae;
    L_0x006b:
        if (r2 == r7) goto L_0x0090;
    L_0x006d:
        if (r2 == r6) goto L_0x0073;
    L_0x006f:
        r9.skipValue();
        goto L_0x0019;
    L_0x0073:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x007c;
    L_0x007b:
        goto L_0x00d4;
    L_0x007c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0089;
    L_0x0080:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x008d;
    L_0x0089:
        r2 = r9.nextString();
    L_0x008d:
        r0.q = r2;
        goto L_0x0019;
    L_0x0090:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0098:
        goto L_0x00d4;
    L_0x0099:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00a6;
    L_0x009d:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00aa;
    L_0x00a6:
        r2 = r9.nextString();
    L_0x00aa:
        r0.p = r2;
        goto L_0x0019;
    L_0x00ae:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b7;
    L_0x00b6:
        goto L_0x00d4;
    L_0x00b7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00c4;
    L_0x00bb:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00c8;
    L_0x00c4:
        r2 = r9.nextString();
    L_0x00c8:
        r0.o = r2;
        goto L_0x0019;
    L_0x00cc:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d9;
    L_0x00d4:
        r9.nextNull();
        goto L_0x0019;
    L_0x00d9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00e6;
    L_0x00dd:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ea;
    L_0x00e6:
        r2 = r9.nextString();
    L_0x00ea:
        r0.a = r2;
        goto L_0x0019;
    L_0x00ee:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeun.read(com.google.gson.stream.JsonReader):aeum");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeum aeum) {
        if (aeum == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeum.a != null) {
            jsonWriter.name("ping_id");
            jsonWriter.value(aeum.a);
        }
        if (aeum.o != null) {
            jsonWriter.name("type");
            jsonWriter.value(aeum.o);
        }
        if (aeum.p != null) {
            jsonWriter.name("id");
            jsonWriter.value(aeum.p);
        }
        if (aeum.q != null) {
            jsonWriter.name("app_engine_target");
            jsonWriter.value(aeum.q);
        }
        jsonWriter.endObject();
    }
}
