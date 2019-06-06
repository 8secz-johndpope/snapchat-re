package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aegc */
public final class aegc extends TypeAdapter<aegb> {
    private final Gson a;
    private final Supplier<TypeAdapter<aefi>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefi.class)));
    private final Supplier<TypeAdapter<aeio>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeio.class)));
    private final Supplier<TypeAdapter<aekq>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aekq.class)));
    private final Supplier<TypeAdapter<aeks>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeks.class)));
    private final Supplier<TypeAdapter<aemz>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(aemz.class)));
    private final Supplier<TypeAdapter<aesz>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesz.class)));
    private final Supplier<TypeAdapter<ahaz>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahaz.class)));
    private final Supplier<TypeAdapter<aexj>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(aexj.class)));
    private final Supplier<TypeAdapter<afeq>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(afeq.class)));

    public aegc(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:83:0x01b9, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aegb read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aegb;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x01d0;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1523674862: goto L_0x007d;
            case -951979093: goto L_0x0073;
            case -782351299: goto L_0x0069;
            case -758906838: goto L_0x005f;
            case -727946416: goto L_0x0055;
            case -356210666: goto L_0x004b;
            case -293152067: goto L_0x0040;
            case 5495588: goto L_0x0036;
            case 1923159307: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0087;
    L_0x002c:
        r4 = "feed_response_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0034:
        r2 = 4;
        goto L_0x0088;
    L_0x0036:
        r4 = "messaging_gateway_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x003e:
        r2 = 1;
        goto L_0x0088;
    L_0x0040:
        r4 = "feed_delta_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0048:
        r2 = 8;
        goto L_0x0088;
    L_0x004b:
        r4 = "updates_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0053:
        r2 = 2;
        goto L_0x0088;
    L_0x0055:
        r4 = "conversations_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x005d:
        r2 = 6;
        goto L_0x0088;
    L_0x005f:
        r4 = "server_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0067:
        r2 = 0;
        goto L_0x0088;
    L_0x0069:
        r4 = "conversations_response_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0071:
        r2 = 7;
        goto L_0x0088;
    L_0x0073:
        r4 = "friends_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x007b:
        r2 = 3;
        goto L_0x0088;
    L_0x007d:
        r4 = "mischief_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0085:
        r2 = 5;
        goto L_0x0088;
    L_0x0087:
        r2 = -1;
    L_0x0088:
        switch(r2) {
            case 0: goto L_0x01b1;
            case 1: goto L_0x0196;
            case 2: goto L_0x017b;
            case 3: goto L_0x0160;
            case 4: goto L_0x0145;
            case 5: goto L_0x0106;
            case 6: goto L_0x00c7;
            case 7: goto L_0x00ab;
            case 8: goto L_0x008f;
            default: goto L_0x008b;
        };
    L_0x008b:
        r7.skipValue();
        goto L_0x0019;
    L_0x008f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0097:
        goto L_0x01b9;
    L_0x0099:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aekq) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x00ab:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b5;
    L_0x00b3:
        goto L_0x01b9;
    L_0x00b5:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeio) r2;
        r0.h = r2;
        goto L_0x0019;
    L_0x00c7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d1;
    L_0x00cf:
        goto L_0x01b9;
    L_0x00d1:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00d5:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00e5:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x00ff;
    L_0x00eb:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00f7;
    L_0x00f3:
        r7.nextNull();
        goto L_0x00e5;
    L_0x00f7:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x00e5;
    L_0x00ff:
        r7.endArray();
        r0.g = r2;
        goto L_0x0019;
    L_0x0106:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0110;
    L_0x010e:
        goto L_0x01b9;
    L_0x0110:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0114:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.h;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0124:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x013e;
    L_0x012a:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0136;
    L_0x0132:
        r7.nextNull();
        goto L_0x0124;
    L_0x0136:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0124;
    L_0x013e:
        r7.endArray();
        r0.f = r2;
        goto L_0x0019;
    L_0x0145:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014e;
    L_0x014d:
        goto L_0x01b9;
    L_0x014e:
        r2 = r6.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeks) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x0160:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0169;
    L_0x0168:
        goto L_0x01b9;
    L_0x0169:
        r2 = r6.f;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aemz) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x017b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0184;
    L_0x0183:
        goto L_0x01b9;
    L_0x0184:
        r2 = r6.j;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afeq) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x0196:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x019f;
    L_0x019e:
        goto L_0x01b9;
    L_0x019f:
        r2 = r6.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aesz) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x01b1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01be;
    L_0x01b9:
        r7.nextNull();
        goto L_0x0019;
    L_0x01be:
        r2 = r6.i;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aexj) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x01d0:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aegc.read(com.google.gson.stream.JsonReader):aegb");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aegb aegb) {
        if (aegb == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aegb.a != null) {
            jsonWriter.name("server_info");
            ((TypeAdapter) this.i.get()).write(jsonWriter, aegb.a);
        }
        if (aegb.b != null) {
            jsonWriter.name("messaging_gateway_info");
            ((TypeAdapter) this.g.get()).write(jsonWriter, aegb.b);
        }
        if (aegb.c != null) {
            jsonWriter.name("updates_response");
            ((TypeAdapter) this.j.get()).write(jsonWriter, aegb.c);
        }
        if (aegb.d != null) {
            jsonWriter.name("friends_response");
            ((TypeAdapter) this.f.get()).write(jsonWriter, aegb.d);
        }
        if (aegb.e != null) {
            jsonWriter.name("feed_response_info");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aegb.e);
        }
        if (aegb.f != null) {
            jsonWriter.name("mischief_response");
            typeAdapter = (TypeAdapter) this.h.get();
            jsonWriter.beginArray();
            for (ahaz write : aegb.f) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aegb.g != null) {
            jsonWriter.name("conversations_response");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aefi write2 : aegb.g) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aegb.h != null) {
            jsonWriter.name("conversations_response_info");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aegb.h);
        }
        if (aegb.i != null) {
            jsonWriter.name("feed_delta_sync_token");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aegb.i);
        }
        jsonWriter.endObject();
    }
}
