package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: afbf */
public final class afbf extends TypeAdapter<afbe> {
    private final Gson a;
    private final Supplier<TypeAdapter<aehl>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aehl.class)));
    private final Supplier<TypeAdapter<aeml>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeml.class)));
    private final Supplier<TypeAdapter<aeti>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeti.class)));
    private final Supplier<TypeAdapter<agda>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(agda.class)));
    private final Supplier<TypeAdapter<aetm>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(aetm.class)));
    private final Supplier<TypeAdapter<ageu>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(ageu.class)));
    private final Supplier<TypeAdapter<aexj>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(aexj.class)));
    private final Supplier<TypeAdapter<afbs>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbs.class)));
    private final Supplier<TypeAdapter<agfl>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(agfl.class)));
    private final Supplier<TypeAdapter<List<String>>> k = Suppliers.memoize(new afdq(this.a, new 1()));

    /* renamed from: afbf$1 */
    class 1 extends TypeToken<List<String>> {
        1() {
        }
    }

    public afbf(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:197:0x03bc, code skipped:
            r8.nextNull();
     */
    /* renamed from: a */
    public final defpackage.afbe read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new afbe;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x03f6;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2048966646: goto L_0x00cf;
            case -2010743636: goto L_0x00c5;
            case -916340721: goto L_0x00bb;
            case -758906838: goto L_0x00b0;
            case -722240360: goto L_0x00a5;
            case -404975296: goto L_0x009b;
            case -235669503: goto L_0x0090;
            case 242499682: goto L_0x0085;
            case 425235378: goto L_0x007b;
            case 621891667: goto L_0x0070;
            case 701938414: goto L_0x0065;
            case 863919223: goto L_0x005a;
            case 870164672: goto L_0x004f;
            case 905277004: goto L_0x0044;
            case 1530963179: goto L_0x0039;
            case 1676784760: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x00d9;
    L_0x002d:
        r4 = "response_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0035:
        r2 = 13;
        goto L_0x00da;
    L_0x0039:
        r4 = "friend_stories_delta";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0041:
        r2 = 6;
        goto L_0x00da;
    L_0x0044:
        r4 = "ordering_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x004c:
        r2 = 7;
        goto L_0x00da;
    L_0x004f:
        r4 = "my_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0057:
        r2 = 0;
        goto L_0x00da;
    L_0x005a:
        r4 = "paginate";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0062:
        r2 = 15;
        goto L_0x00da;
    L_0x0065:
        r4 = "unsigned_receipt";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x006d:
        r2 = 12;
        goto L_0x00da;
    L_0x0070:
        r4 = "sync_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0078:
        r2 = 11;
        goto L_0x00da;
    L_0x007b:
        r4 = "friend_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0083:
        r2 = 2;
        goto L_0x00da;
    L_0x0085:
        r4 = "user_stories_precache_config";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x008d:
        r2 = 9;
        goto L_0x00da;
    L_0x0090:
        r4 = "my_mob_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0098:
        r2 = 10;
        goto L_0x00da;
    L_0x009b:
        r4 = "my_group_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00a3:
        r2 = 3;
        goto L_0x00da;
    L_0x00a5:
        r4 = "deleted_friend_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00ad:
        r2 = 14;
        goto L_0x00da;
    L_0x00b0:
        r4 = "server_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00b8:
        r2 = 8;
        goto L_0x00da;
    L_0x00bb:
        r4 = "my_verified_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00c3:
        r2 = 4;
        goto L_0x00da;
    L_0x00c5:
        r4 = "my_stories_with_collabs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00cd:
        r2 = 1;
        goto L_0x00da;
    L_0x00cf:
        r4 = "mature_content_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00d7:
        r2 = 5;
        goto L_0x00da;
    L_0x00d9:
        r2 = -1;
    L_0x00da:
        switch(r2) {
            case 0: goto L_0x03b4;
            case 1: goto L_0x0376;
            case 2: goto L_0x0338;
            case 3: goto L_0x02f9;
            case 4: goto L_0x02ba;
            case 5: goto L_0x027e;
            case 6: goto L_0x025b;
            case 7: goto L_0x023f;
            case 8: goto L_0x0223;
            case 9: goto L_0x0207;
            case 10: goto L_0x01c8;
            case 11: goto L_0x01a9;
            case 12: goto L_0x0186;
            case 13: goto L_0x0167;
            case 14: goto L_0x0105;
            case 15: goto L_0x00e2;
            default: goto L_0x00dd;
        };
    L_0x00dd:
        r8.skipValue();
        goto L_0x0019;
    L_0x00e2:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ec;
    L_0x00ea:
        goto L_0x03bc;
    L_0x00ec:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00f9;
    L_0x00f0:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00fd;
    L_0x00f9:
        r2 = r8.nextBoolean();
    L_0x00fd:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.p = r2;
        goto L_0x0019;
    L_0x0105:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x010f;
    L_0x010d:
        goto L_0x03bc;
    L_0x010f:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.k;
        r3.get();
        r8.beginObject();
    L_0x011c:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x0160;
    L_0x0122:
        r3 = r8.nextName();
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0132;
    L_0x012e:
        r8.nextNull();
        goto L_0x011c;
    L_0x0132:
        r5 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r4 != r5) goto L_0x011c;
    L_0x0136:
        r8.beginArray();
        r5 = new java.util.ArrayList;
        r5.<init>();
    L_0x013e:
        r6 = r8.hasNext();
        if (r6 == 0) goto L_0x0159;
    L_0x0144:
        r6 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r6) goto L_0x0151;
    L_0x0148:
        r6 = r8.nextBoolean();
        r6 = java.lang.Boolean.toString(r6);
        goto L_0x0155;
    L_0x0151:
        r6 = r8.nextString();
    L_0x0155:
        r5.add(r6);
        goto L_0x013e;
    L_0x0159:
        r8.endArray();
        r2.put(r3, r5);
        goto L_0x011c;
    L_0x0160:
        r8.endObject();
        r0.o = r2;
        goto L_0x0019;
    L_0x0167:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0171;
    L_0x016f:
        goto L_0x03bc;
    L_0x0171:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x017e;
    L_0x0175:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0182;
    L_0x017e:
        r2 = r8.nextString();
    L_0x0182:
        r0.n = r2;
        goto L_0x0019;
    L_0x0186:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0190;
    L_0x018e:
        goto L_0x03bc;
    L_0x0190:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x019d;
    L_0x0194:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01a1;
    L_0x019d:
        r2 = r8.nextBoolean();
    L_0x01a1:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x01a9:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01b3;
    L_0x01b1:
        goto L_0x03bc;
    L_0x01b3:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01c0;
    L_0x01b7:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01c4;
    L_0x01c0:
        r2 = r8.nextString();
    L_0x01c4:
        r0.l = r2;
        goto L_0x0019;
    L_0x01c8:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01d2;
    L_0x01d0:
        goto L_0x03bc;
    L_0x01d2:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01d6:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x01e6:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0200;
    L_0x01ec:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01f8;
    L_0x01f4:
        r8.nextNull();
        goto L_0x01e6;
    L_0x01f8:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x01e6;
    L_0x0200:
        r8.endArray();
        r0.k = r2;
        goto L_0x0019;
    L_0x0207:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0211;
    L_0x020f:
        goto L_0x03bc;
    L_0x0211:
        r2 = r7.j;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.agfl) r2;
        r0.j = r2;
        goto L_0x0019;
    L_0x0223:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x022d;
    L_0x022b:
        goto L_0x03bc;
    L_0x022d:
        r2 = r7.h;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aexj) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x023f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0249;
    L_0x0247:
        goto L_0x03bc;
    L_0x0249:
        r2 = r7.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.ageu) r2;
        r0.h = r2;
        goto L_0x0019;
    L_0x025b:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0265;
    L_0x0263:
        goto L_0x03bc;
    L_0x0265:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0272;
    L_0x0269:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0276;
    L_0x0272:
        r2 = r8.nextBoolean();
    L_0x0276:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x027e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0288;
    L_0x0286:
        goto L_0x03bc;
    L_0x0288:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x0290:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x02b3;
    L_0x0296:
        r3 = r8.nextName();
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x02ab;
    L_0x02a2:
        r4 = r8.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x02af;
    L_0x02ab:
        r4 = r8.nextString();
    L_0x02af:
        r2.put(r3, r4);
        goto L_0x0290;
    L_0x02b3:
        r8.endObject();
        r0.f = r2;
        goto L_0x0019;
    L_0x02ba:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02c4;
    L_0x02c2:
        goto L_0x03bc;
    L_0x02c4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x02c8:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.f;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x02d8:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x02f2;
    L_0x02de:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x02ea;
    L_0x02e6:
        r8.nextNull();
        goto L_0x02d8;
    L_0x02ea:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x02d8;
    L_0x02f2:
        r8.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x02f9:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0303;
    L_0x0301:
        goto L_0x03bc;
    L_0x0303:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0307:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0317:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0331;
    L_0x031d:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0329;
    L_0x0325:
        r8.nextNull();
        goto L_0x0317;
    L_0x0329:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x0317;
    L_0x0331:
        r8.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x0338:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0341;
    L_0x0340:
        goto L_0x03bc;
    L_0x0341:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0345:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0355:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x036f;
    L_0x035b:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0367;
    L_0x0363:
        r8.nextNull();
        goto L_0x0355;
    L_0x0367:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x0355;
    L_0x036f:
        r8.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x0376:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x037f;
    L_0x037e:
        goto L_0x03bc;
    L_0x037f:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0383:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0393:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x03ad;
    L_0x0399:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x03a5;
    L_0x03a1:
        r8.nextNull();
        goto L_0x0393;
    L_0x03a5:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x0393;
    L_0x03ad:
        r8.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x03b4:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03c1;
    L_0x03bc:
        r8.nextNull();
        goto L_0x0019;
    L_0x03c1:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x03c5:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.i;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x03d5:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x03ef;
    L_0x03db:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x03e7;
    L_0x03e3:
        r8.nextNull();
        goto L_0x03d5;
    L_0x03e7:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x03d5;
    L_0x03ef:
        r8.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x03f6:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbf.read(com.google.gson.stream.JsonReader):afbe");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afbe afbe) {
        if (afbe == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afbe.a != null) {
            jsonWriter.name("my_stories");
            typeAdapter = (TypeAdapter) this.i.get();
            jsonWriter.beginArray();
            for (afbs write : afbe.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (afbe.b != null) {
            jsonWriter.name("my_stories_with_collabs");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aehl write2 : afbe.b) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (afbe.c != null) {
            jsonWriter.name("friend_stories");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aeml write3 : afbe.c) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        if (afbe.d != null) {
            jsonWriter.name("my_group_stories");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (aeti write4 : afbe.d) {
                typeAdapter.write(jsonWriter, write4);
            }
            jsonWriter.endArray();
        }
        if (afbe.e != null) {
            jsonWriter.name("my_verified_stories");
            typeAdapter = (TypeAdapter) this.f.get();
            jsonWriter.beginArray();
            for (aetm write5 : afbe.e) {
                typeAdapter.write(jsonWriter, write5);
            }
            jsonWriter.endArray();
        }
        if (afbe.f != null) {
            jsonWriter.name("mature_content_text");
            jsonWriter.beginObject();
            for (Entry entry : afbe.f.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (afbe.g != null) {
            jsonWriter.name("friend_stories_delta");
            jsonWriter.value(afbe.g.booleanValue());
        }
        if (afbe.h != null) {
            jsonWriter.name("ordering_response");
            ((TypeAdapter) this.g.get()).write(jsonWriter, afbe.h);
        }
        if (afbe.i != null) {
            jsonWriter.name("server_info");
            ((TypeAdapter) this.h.get()).write(jsonWriter, afbe.i);
        }
        if (afbe.j != null) {
            jsonWriter.name("user_stories_precache_config");
            ((TypeAdapter) this.j.get()).write(jsonWriter, afbe.j);
        }
        if (afbe.k != null) {
            jsonWriter.name("my_mob_stories");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (agda write6 : afbe.k) {
                typeAdapter.write(jsonWriter, write6);
            }
            jsonWriter.endArray();
        }
        if (afbe.l != null) {
            jsonWriter.name("sync_metadata");
            jsonWriter.value(afbe.l);
        }
        if (afbe.m != null) {
            jsonWriter.name("unsigned_receipt");
            jsonWriter.value(afbe.m.booleanValue());
        }
        if (afbe.n != null) {
            jsonWriter.name("response_type");
            jsonWriter.value(afbe.n);
        }
        if (afbe.o != null) {
            jsonWriter.name("deleted_friend_stories");
            typeAdapter = (TypeAdapter) this.k.get();
            jsonWriter.beginObject();
            for (Entry entry2 : afbe.o.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                typeAdapter.write(jsonWriter, entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (afbe.p != null) {
            jsonWriter.name("paginate");
            jsonWriter.value(afbe.p.booleanValue());
        }
        jsonWriter.endObject();
    }
}
