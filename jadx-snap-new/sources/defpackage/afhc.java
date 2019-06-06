package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: afhc */
public final class afhc extends TypeAdapter<afhb> {
    private final Gson a;

    public afhc(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* renamed from: a */
    public final defpackage.afhb read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new afhb;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0095;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -281827849; // 0xffffffffef33a5f7 float:-5.5598456E28 double:NaN;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 577466114; // 0x226b6f02 float:3.1907206E-18 double:2.853061686E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "is_audience_match_opt_out";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 0;
        goto L_0x0048;
    L_0x003d:
        r4 = "is_external_activity_match_opt_out";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 1;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x0071;
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
        goto L_0x0079;
    L_0x0059:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0066;
    L_0x005d:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x006a;
    L_0x0066:
        r2 = r7.nextBoolean();
    L_0x006a:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x0071:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x007d;
    L_0x0079:
        r7.nextNull();
        goto L_0x0019;
    L_0x007d:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x008a;
    L_0x0081:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x008e;
    L_0x008a:
        r2 = r7.nextBoolean();
    L_0x008e:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x0095:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afhc.read(com.google.gson.stream.JsonReader):afhb");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afhb afhb) {
        if (afhb == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afhb.a != null) {
            jsonWriter.name("is_audience_match_opt_out");
            jsonWriter.value(afhb.a.booleanValue());
        }
        if (afhb.b != null) {
            jsonWriter.name("is_external_activity_match_opt_out");
            jsonWriter.value(afhb.b.booleanValue());
        }
        jsonWriter.endObject();
    }
}
