package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agfg */
public final class agfg extends TypeAdapter<agff> {
    private final Gson a;
    private final Supplier<TypeAdapter<agfh>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(agfh.class)));

    public agfg(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* renamed from: a */
    public final defpackage.agff read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new agff;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0087;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -1195796854; // 0xffffffffb8b9968a float:-8.8495275E-5 double:NaN;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 761451721; // 0x2d62d4c9 float:1.28938605E-11 double:3.762071363E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "low_power_counts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 1;
        goto L_0x0048;
    L_0x003d:
        r4 = "main_counts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 0;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x006a;
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
        goto L_0x0072;
    L_0x0059:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.agfh) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x006a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0076;
    L_0x0072:
        r7.nextNull();
        goto L_0x0019;
    L_0x0076:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.agfh) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x0087:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfg.read(com.google.gson.stream.JsonReader):agff");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agff agff) {
        if (agff == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agff.a != null) {
            jsonWriter.name("main_counts");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agff.a);
        }
        if (agff.b != null) {
            jsonWriter.name("low_power_counts");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agff.b);
        }
        jsonWriter.endObject();
    }
}
