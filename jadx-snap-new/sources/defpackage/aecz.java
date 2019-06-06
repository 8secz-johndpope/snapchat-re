package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aecz */
public final class aecz extends TypeAdapter<aecy> {
    private final Gson a;
    private final Supplier<TypeAdapter<aefi>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefi.class)));
    private final Supplier<TypeAdapter<aeio>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeio.class)));
    private final Supplier<TypeAdapter<aejo>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aejo.class)));
    private final Supplier<TypeAdapter<aekq>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aekq.class)));
    private final Supplier<TypeAdapter<aeks>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeks.class)));
    private final Supplier<TypeAdapter<aemz>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(aemz.class)));
    private final Supplier<TypeAdapter<aham>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(aham.class)));
    private final Supplier<TypeAdapter<aesz>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesz.class)));
    private final Supplier<TypeAdapter<ahaz>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahaz.class)));
    private final Supplier<TypeAdapter<ahst>> k = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahst.class)));
    private final Supplier<TypeAdapter<aexj>> l = Suppliers.memoize(new afdq(this.a, TypeToken.get(aexj.class)));
    private final Supplier<TypeAdapter<aezn>> m = Suppliers.memoize(new afdq(this.a, TypeToken.get(aezn.class)));
    private final Supplier<TypeAdapter<afbe>> n = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbe.class)));
    private final Supplier<TypeAdapter<ahxv>> o = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahxv.class)));
    private final Supplier<TypeAdapter<afeq>> p = Suppliers.memoize(new afdq(this.a, TypeToken.get(afeq.class)));

    public aecz(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:129:0x02d2, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aecy read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aecy;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x02e9;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1523674862: goto L_0x00ce;
            case -1238486215: goto L_0x00c3;
            case -1085079239: goto L_0x00b8;
            case -978873683: goto L_0x00ae;
            case -951979093: goto L_0x00a4;
            case -827729771: goto L_0x0099;
            case -782351299: goto L_0x008e;
            case -758906838: goto L_0x0084;
            case -727946416: goto L_0x007a;
            case -356210666: goto L_0x0070;
            case -293152067: goto L_0x0065;
            case 5495588: goto L_0x005b;
            case 273184745: goto L_0x0050;
            case 924928486: goto L_0x0044;
            case 928541660: goto L_0x0038;
            case 1923159307: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x00d8;
    L_0x002d:
        r4 = "feed_response_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x0035:
        r2 = 5;
        goto L_0x00d9;
    L_0x0038:
        r4 = "sec_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x0040:
        r2 = 13;
        goto L_0x00d9;
    L_0x0044:
        r4 = "background_fetch_secret_key";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x004c:
        r2 = 14;
        goto L_0x00d9;
    L_0x0050:
        r4 = "discover";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x0058:
        r2 = 9;
        goto L_0x00d9;
    L_0x005b:
        r4 = "messaging_gateway_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x0063:
        r2 = 1;
        goto L_0x00d9;
    L_0x0065:
        r4 = "feed_delta_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x006d:
        r2 = 15;
        goto L_0x00d9;
    L_0x0070:
        r4 = "updates_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x0078:
        r2 = 2;
        goto L_0x00d9;
    L_0x007a:
        r4 = "conversations_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x0082:
        r2 = 7;
        goto L_0x00d9;
    L_0x0084:
        r4 = "server_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x008c:
        r2 = 0;
        goto L_0x00d9;
    L_0x008e:
        r4 = "conversations_response_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x0096:
        r2 = 8;
        goto L_0x00d9;
    L_0x0099:
        r4 = "support_tools_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x00a1:
        r2 = 12;
        goto L_0x00d9;
    L_0x00a4:
        r4 = "friends_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x00ac:
        r2 = 3;
        goto L_0x00d9;
    L_0x00ae:
        r4 = "stories_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x00b6:
        r2 = 4;
        goto L_0x00d9;
    L_0x00b8:
        r4 = "sponsored";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x00c0:
        r2 = 11;
        goto L_0x00d9;
    L_0x00c3:
        r4 = "identity_check_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x00cb:
        r2 = 10;
        goto L_0x00d9;
    L_0x00ce:
        r4 = "mischief_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d8;
    L_0x00d6:
        r2 = 6;
        goto L_0x00d9;
    L_0x00d8:
        r2 = -1;
    L_0x00d9:
        switch(r2) {
            case 0: goto L_0x02ca;
            case 1: goto L_0x02af;
            case 2: goto L_0x0294;
            case 3: goto L_0x0279;
            case 4: goto L_0x025e;
            case 5: goto L_0x0242;
            case 6: goto L_0x0203;
            case 7: goto L_0x01c4;
            case 8: goto L_0x01a8;
            case 9: goto L_0x018c;
            case 10: goto L_0x0170;
            case 11: goto L_0x0154;
            case 12: goto L_0x0138;
            case 13: goto L_0x011c;
            case 14: goto L_0x00fd;
            case 15: goto L_0x00e1;
            default: goto L_0x00dc;
        };
    L_0x00dc:
        r7.skipValue();
        goto L_0x0019;
    L_0x00e1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00eb;
    L_0x00e9:
        goto L_0x02d2;
    L_0x00eb:
        r2 = r6.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aekq) r2;
        r0.p = r2;
        goto L_0x0019;
    L_0x00fd:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0107;
    L_0x0105:
        goto L_0x02d2;
    L_0x0107:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0114;
    L_0x010b:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0118;
    L_0x0114:
        r2 = r7.nextString();
    L_0x0118:
        r0.o = r2;
        goto L_0x0019;
    L_0x011c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0126;
    L_0x0124:
        goto L_0x02d2;
    L_0x0126:
        r2 = r6.k;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahst) r2;
        r0.n = r2;
        goto L_0x0019;
    L_0x0138:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0142;
    L_0x0140:
        goto L_0x02d2;
    L_0x0142:
        r2 = r6.o;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahxv) r2;
        r0.m = r2;
        goto L_0x0019;
    L_0x0154:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x015e;
    L_0x015c:
        goto L_0x02d2;
    L_0x015e:
        r2 = r6.m;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aezn) r2;
        r0.l = r2;
        goto L_0x0019;
    L_0x0170:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x017a;
    L_0x0178:
        goto L_0x02d2;
    L_0x017a:
        r2 = r6.h;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aham) r2;
        r0.k = r2;
        goto L_0x0019;
    L_0x018c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0196;
    L_0x0194:
        goto L_0x02d2;
    L_0x0196:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aejo) r2;
        r0.j = r2;
        goto L_0x0019;
    L_0x01a8:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01b2;
    L_0x01b0:
        goto L_0x02d2;
    L_0x01b2:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeio) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x01c4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ce;
    L_0x01cc:
        goto L_0x02d2;
    L_0x01ce:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01d2:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x01e2:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x01fc;
    L_0x01e8:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01f4;
    L_0x01f0:
        r7.nextNull();
        goto L_0x01e2;
    L_0x01f4:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x01e2;
    L_0x01fc:
        r7.endArray();
        r0.h = r2;
        goto L_0x0019;
    L_0x0203:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x020d;
    L_0x020b:
        goto L_0x02d2;
    L_0x020d:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0211:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.j;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0221:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x023b;
    L_0x0227:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0233;
    L_0x022f:
        r7.nextNull();
        goto L_0x0221;
    L_0x0233:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0221;
    L_0x023b:
        r7.endArray();
        r0.g = r2;
        goto L_0x0019;
    L_0x0242:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x024c;
    L_0x024a:
        goto L_0x02d2;
    L_0x024c:
        r2 = r6.f;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeks) r2;
        r0.f = r2;
        goto L_0x0019;
    L_0x025e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0267;
    L_0x0266:
        goto L_0x02d2;
    L_0x0267:
        r2 = r6.n;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbe) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x0279:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0282;
    L_0x0281:
        goto L_0x02d2;
    L_0x0282:
        r2 = r6.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aemz) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x0294:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x029d;
    L_0x029c:
        goto L_0x02d2;
    L_0x029d:
        r2 = r6.p;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afeq) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x02af:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02b8;
    L_0x02b7:
        goto L_0x02d2;
    L_0x02b8:
        r2 = r6.i;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aesz) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x02ca:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02d7;
    L_0x02d2:
        r7.nextNull();
        goto L_0x0019;
    L_0x02d7:
        r2 = r6.l;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aexj) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x02e9:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecz.read(com.google.gson.stream.JsonReader):aecy");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aecy aecy) {
        if (aecy == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aecy.a != null) {
            jsonWriter.name("server_info");
            ((TypeAdapter) this.l.get()).write(jsonWriter, aecy.a);
        }
        if (aecy.b != null) {
            jsonWriter.name("messaging_gateway_info");
            ((TypeAdapter) this.i.get()).write(jsonWriter, aecy.b);
        }
        if (aecy.c != null) {
            jsonWriter.name("updates_response");
            ((TypeAdapter) this.p.get()).write(jsonWriter, aecy.c);
        }
        if (aecy.d != null) {
            jsonWriter.name("friends_response");
            ((TypeAdapter) this.g.get()).write(jsonWriter, aecy.d);
        }
        if (aecy.e != null) {
            jsonWriter.name("stories_response");
            ((TypeAdapter) this.n.get()).write(jsonWriter, aecy.e);
        }
        if (aecy.f != null) {
            jsonWriter.name("feed_response_info");
            ((TypeAdapter) this.f.get()).write(jsonWriter, aecy.f);
        }
        if (aecy.g != null) {
            jsonWriter.name("mischief_response");
            typeAdapter = (TypeAdapter) this.j.get();
            jsonWriter.beginArray();
            for (ahaz write : aecy.g) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aecy.h != null) {
            jsonWriter.name("conversations_response");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aefi write2 : aecy.h) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aecy.i != null) {
            jsonWriter.name("conversations_response_info");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aecy.i);
        }
        if (aecy.j != null) {
            jsonWriter.name("discover");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aecy.j);
        }
        if (aecy.k != null) {
            jsonWriter.name("identity_check_response");
            ((TypeAdapter) this.h.get()).write(jsonWriter, aecy.k);
        }
        if (aecy.l != null) {
            jsonWriter.name("sponsored");
            ((TypeAdapter) this.m.get()).write(jsonWriter, aecy.l);
        }
        if (aecy.m != null) {
            jsonWriter.name("support_tools_response");
            ((TypeAdapter) this.o.get()).write(jsonWriter, aecy.m);
        }
        if (aecy.n != null) {
            jsonWriter.name("sec_info");
            ((TypeAdapter) this.k.get()).write(jsonWriter, aecy.n);
        }
        if (aecy.o != null) {
            jsonWriter.name("background_fetch_secret_key");
            jsonWriter.value(aecy.o);
        }
        if (aecy.p != null) {
            jsonWriter.name("feed_delta_sync_token");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aecy.p);
        }
        jsonWriter.endObject();
    }
}
