package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aemm */
public final class aemm extends TypeAdapter<aeml> {
    private final Gson a;
    private final Supplier<TypeAdapter<aemn>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aemn.class)));
    private final Supplier<TypeAdapter<agay>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(agay.class)));
    private final Supplier<TypeAdapter<afml>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(afml.class)));
    private final Supplier<TypeAdapter<afcj>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(afcj.class)));
    private final Supplier<TypeAdapter<agbw>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(agbw.class)));

    public aemm(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:192:0x0387, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aeml read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aeml;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x03a1;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1898334031: goto L_0x00fe;
            case -1884266413: goto L_0x00f4;
            case -1858159042: goto L_0x00e9;
            case -1703162617: goto L_0x00de;
            case -1581568203: goto L_0x00d4;
            case -1421068813: goto L_0x00c9;
            case -851832166: goto L_0x00be;
            case -643660801: goto L_0x00b3;
            case -537488273: goto L_0x00a8;
            case -265713450: goto L_0x009e;
            case -147132913: goto L_0x0093;
            case 3575610: goto L_0x0088;
            case 118114326: goto L_0x007d;
            case 262813286: goto L_0x0072;
            case 478287077: goto L_0x0066;
            case 523834781: goto L_0x005b;
            case 554956610: goto L_0x0050;
            case 992475430: goto L_0x0044;
            case 1615086568: goto L_0x0039;
            case 1954014628: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0109;
    L_0x002d:
        r4 = "featured_story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x0035:
        r2 = 13;
        goto L_0x010a;
    L_0x0039:
        r4 = "display_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x0041:
        r2 = 2;
        goto L_0x010a;
    L_0x0044:
        r4 = "new_story_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x004c:
        r2 = 18;
        goto L_0x010a;
    L_0x0050:
        r4 = "mature_content";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x0058:
        r2 = 7;
        goto L_0x010a;
    L_0x005b:
        r4 = "deep_link_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x0063:
        r2 = 5;
        goto L_0x010a;
    L_0x0066:
        r4 = "ad_placement_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x006e:
        r2 = 8;
        goto L_0x010a;
    L_0x0072:
        r4 = "profile_description";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x007a:
        r2 = 4;
        goto L_0x010a;
    L_0x007d:
        r4 = "is_local";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x0085:
        r2 = 3;
        goto L_0x010a;
    L_0x0088:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x0090:
        r2 = 15;
        goto L_0x010a;
    L_0x0093:
        r4 = "user_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x009b:
        r2 = 19;
        goto L_0x010a;
    L_0x009e:
        r4 = "username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00a6:
        r2 = 0;
        goto L_0x010a;
    L_0x00a8:
        r4 = "official_stories_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00b0:
        r2 = 17;
        goto L_0x010a;
    L_0x00b3:
        r4 = "allow_story_explorer";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00bb:
        r2 = 10;
        goto L_0x010a;
    L_0x00be:
        r4 = "is_manifest_story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00c6:
        r2 = 14;
        goto L_0x010a;
    L_0x00c9:
        r4 = "has_custom_description";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00d1:
        r2 = 11;
        goto L_0x010a;
    L_0x00d4:
        r4 = "shared_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00dc:
        r2 = 6;
        goto L_0x010a;
    L_0x00de:
        r4 = "thumbnails";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00e6:
        r2 = 9;
        goto L_0x010a;
    L_0x00e9:
        r4 = "publisher_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00f1:
        r2 = 16;
        goto L_0x010a;
    L_0x00f4:
        r4 = "stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x00fc:
        r2 = 1;
        goto L_0x010a;
    L_0x00fe:
        r4 = "show_viewing_jit";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0109;
    L_0x0106:
        r2 = 12;
        goto L_0x010a;
    L_0x0109:
        r2 = -1;
    L_0x010a:
        switch(r2) {
            case 0: goto L_0x037f;
            case 1: goto L_0x0341;
            case 2: goto L_0x0323;
            case 3: goto L_0x0301;
            case 4: goto L_0x02e2;
            case 5: goto L_0x02c3;
            case 6: goto L_0x02a4;
            case 7: goto L_0x0281;
            case 8: goto L_0x0265;
            case 9: goto L_0x0249;
            case 10: goto L_0x0226;
            case 11: goto L_0x0203;
            case 12: goto L_0x01e0;
            case 13: goto L_0x01c4;
            case 14: goto L_0x01a1;
            case 15: goto L_0x0182;
            case 16: goto L_0x0163;
            case 17: goto L_0x0147;
            case 18: goto L_0x0131;
            case 19: goto L_0x0112;
            default: goto L_0x010d;
        };
    L_0x010d:
        r7.skipValue();
        goto L_0x0019;
    L_0x0112:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x011c;
    L_0x011a:
        goto L_0x0387;
    L_0x011c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0129;
    L_0x0120:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x012d;
    L_0x0129:
        r2 = r7.nextString();
    L_0x012d:
        r0.t = r2;
        goto L_0x0019;
    L_0x0131:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x013b;
    L_0x0139:
        goto L_0x0387;
    L_0x013b:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.s = r2;
        goto L_0x0019;
    L_0x0147:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0151;
    L_0x014f:
        goto L_0x0387;
    L_0x0151:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.agay) r2;
        r0.r = r2;
        goto L_0x0019;
    L_0x0163:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016d;
    L_0x016b:
        goto L_0x0387;
    L_0x016d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x017a;
    L_0x0171:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x017e;
    L_0x017a:
        r2 = r7.nextString();
    L_0x017e:
        r0.q = r2;
        goto L_0x0019;
    L_0x0182:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x018c;
    L_0x018a:
        goto L_0x0387;
    L_0x018c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0199;
    L_0x0190:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x019d;
    L_0x0199:
        r2 = r7.nextString();
    L_0x019d:
        r0.p = r2;
        goto L_0x0019;
    L_0x01a1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ab;
    L_0x01a9:
        goto L_0x0387;
    L_0x01ab:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x01b8;
    L_0x01af:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01bc;
    L_0x01b8:
        r2 = r7.nextBoolean();
    L_0x01bc:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.o = r2;
        goto L_0x0019;
    L_0x01c4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ce;
    L_0x01cc:
        goto L_0x0387;
    L_0x01ce:
        r2 = r6.f;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.agbw) r2;
        r0.n = r2;
        goto L_0x0019;
    L_0x01e0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ea;
    L_0x01e8:
        goto L_0x0387;
    L_0x01ea:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x01f7;
    L_0x01ee:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01fb;
    L_0x01f7:
        r2 = r7.nextBoolean();
    L_0x01fb:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x0203:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x020d;
    L_0x020b:
        goto L_0x0387;
    L_0x020d:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x021a;
    L_0x0211:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x021e;
    L_0x021a:
        r2 = r7.nextBoolean();
    L_0x021e:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x0226:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0230;
    L_0x022e:
        goto L_0x0387;
    L_0x0230:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x023d;
    L_0x0234:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0241;
    L_0x023d:
        r2 = r7.nextBoolean();
    L_0x0241:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.k = r2;
        goto L_0x0019;
    L_0x0249:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0253;
    L_0x0251:
        goto L_0x0387;
    L_0x0253:
        r2 = r6.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afcj) r2;
        r0.j = r2;
        goto L_0x0019;
    L_0x0265:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x026f;
    L_0x026d:
        goto L_0x0387;
    L_0x026f:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afml) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x0281:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x028b;
    L_0x0289:
        goto L_0x0387;
    L_0x028b:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0298;
    L_0x028f:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x029c;
    L_0x0298:
        r2 = r7.nextBoolean();
    L_0x029c:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.h = r2;
        goto L_0x0019;
    L_0x02a4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02ae;
    L_0x02ac:
        goto L_0x0387;
    L_0x02ae:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02bb;
    L_0x02b2:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02bf;
    L_0x02bb:
        r2 = r7.nextString();
    L_0x02bf:
        r0.g = r2;
        goto L_0x0019;
    L_0x02c3:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02cd;
    L_0x02cb:
        goto L_0x0387;
    L_0x02cd:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02da;
    L_0x02d1:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02de;
    L_0x02da:
        r2 = r7.nextString();
    L_0x02de:
        r0.f = r2;
        goto L_0x0019;
    L_0x02e2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02ec;
    L_0x02ea:
        goto L_0x0387;
    L_0x02ec:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02f9;
    L_0x02f0:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02fd;
    L_0x02f9:
        r2 = r7.nextString();
    L_0x02fd:
        r0.e = r2;
        goto L_0x0019;
    L_0x0301:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x030a;
    L_0x0309:
        goto L_0x0387;
    L_0x030a:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0317;
    L_0x030e:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x031b;
    L_0x0317:
        r2 = r7.nextBoolean();
    L_0x031b:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x0323:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x032c;
    L_0x032b:
        goto L_0x0387;
    L_0x032c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0339;
    L_0x0330:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x033d;
    L_0x0339:
        r2 = r7.nextString();
    L_0x033d:
        r0.c = r2;
        goto L_0x0019;
    L_0x0341:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x034a;
    L_0x0349:
        goto L_0x0387;
    L_0x034a:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x034e:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x035e:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0378;
    L_0x0364:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0370;
    L_0x036c:
        r7.nextNull();
        goto L_0x035e;
    L_0x0370:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x035e;
    L_0x0378:
        r7.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x037f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x038c;
    L_0x0387:
        r7.nextNull();
        goto L_0x0019;
    L_0x038c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0399;
    L_0x0390:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x039d;
    L_0x0399:
        r2 = r7.nextString();
    L_0x039d:
        r0.a = r2;
        goto L_0x0019;
    L_0x03a1:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemm.read(com.google.gson.stream.JsonReader):aeml");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeml aeml) {
        if (aeml == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeml.a != null) {
            jsonWriter.name("username");
            jsonWriter.value(aeml.a);
        }
        if (aeml.b != null) {
            jsonWriter.name("stories");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aemn write : aeml.b) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aeml.c != null) {
            jsonWriter.name("display_name");
            jsonWriter.value(aeml.c);
        }
        if (aeml.d != null) {
            jsonWriter.name("is_local");
            jsonWriter.value(aeml.d.booleanValue());
        }
        if (aeml.e != null) {
            jsonWriter.name("profile_description");
            jsonWriter.value(aeml.e);
        }
        if (aeml.f != null) {
            jsonWriter.name("deep_link_url");
            jsonWriter.value(aeml.f);
        }
        if (aeml.g != null) {
            jsonWriter.name("shared_id");
            jsonWriter.value(aeml.g);
        }
        if (aeml.h != null) {
            jsonWriter.name("mature_content");
            jsonWriter.value(aeml.h.booleanValue());
        }
        if (aeml.i != null) {
            jsonWriter.name("ad_placement_metadata");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aeml.i);
        }
        if (aeml.j != null) {
            jsonWriter.name("thumbnails");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aeml.j);
        }
        if (aeml.k != null) {
            jsonWriter.name("allow_story_explorer");
            jsonWriter.value(aeml.k.booleanValue());
        }
        if (aeml.l != null) {
            jsonWriter.name("has_custom_description");
            jsonWriter.value(aeml.l.booleanValue());
        }
        if (aeml.m != null) {
            jsonWriter.name("show_viewing_jit");
            jsonWriter.value(aeml.m.booleanValue());
        }
        if (aeml.n != null) {
            jsonWriter.name("featured_story");
            ((TypeAdapter) this.f.get()).write(jsonWriter, aeml.n);
        }
        if (aeml.o != null) {
            jsonWriter.name("is_manifest_story");
            jsonWriter.value(aeml.o.booleanValue());
        }
        if (aeml.p != null) {
            jsonWriter.name("type");
            jsonWriter.value(aeml.p);
        }
        if (aeml.q != null) {
            jsonWriter.name("publisher_id");
            jsonWriter.value(aeml.q);
        }
        if (aeml.r != null) {
            jsonWriter.name("official_stories_metadata");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aeml.r);
        }
        if (aeml.s != null) {
            jsonWriter.name("new_story_count");
            jsonWriter.value(aeml.s);
        }
        if (aeml.t != null) {
            jsonWriter.name("user_id");
            jsonWriter.value(aeml.t);
        }
        jsonWriter.endObject();
    }
}
