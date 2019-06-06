package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aheg */
public final class aheg extends TypeAdapter<ahef> {
    private final Gson a;
    private final Supplier<TypeAdapter<ahej>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahej.class)));
    private final Supplier<TypeAdapter<ahel>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahel.class)));
    private final Supplier<TypeAdapter<ahen>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahen.class)));
    private final Supplier<TypeAdapter<aher>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aher.class)));

    public aheg(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:227:0x043c, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.ahef read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new ahef;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0476;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1553988042: goto L_0x00ce;
            case -1247321816: goto L_0x00c3;
            case -1097337470: goto L_0x00b9;
            case -792963303: goto L_0x00ae;
            case -364121949: goto L_0x00a3;
            case -289262636: goto L_0x0098;
            case -68393321: goto L_0x008e;
            case 38311725: goto L_0x0083;
            case 129644984: goto L_0x0078;
            case 638812179: goto L_0x006d;
            case 811761584: goto L_0x0063;
            case 954925063: goto L_0x0059;
            case 984885233: goto L_0x004e;
            case 1454181762: goto L_0x0043;
            case 1794472330: goto L_0x0038;
            case 1922108056: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x00d9;
    L_0x002d:
        r4 = "stories_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0035:
        r2 = 6;
        goto L_0x00da;
    L_0x0038:
        r4 = "suggested_friend_results_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0040:
        r2 = 4;
        goto L_0x00da;
    L_0x0043:
        r4 = "suggestion_placement_to_reason_mapping";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x004b:
        r2 = 3;
        goto L_0x00da;
    L_0x004e:
        r4 = "suggested_friend_results";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0056:
        r2 = 0;
        goto L_0x00da;
    L_0x0059:
        r4 = "message";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0061:
        r2 = 1;
        goto L_0x00da;
    L_0x0063:
        r4 = "add_friends_footer_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x006b:
        r2 = 5;
        goto L_0x00da;
    L_0x006d:
        r4 = "friends_horizontal_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0075:
        r2 = 13;
        goto L_0x00da;
    L_0x0078:
        r4 = "stories_view_all_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0080:
        r2 = 12;
        goto L_0x00da;
    L_0x0083:
        r4 = "search_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x008b:
        r2 = 9;
        goto L_0x00da;
    L_0x008e:
        r4 = "send_to_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x0096:
        r2 = 7;
        goto L_0x00da;
    L_0x0098:
        r4 = "full_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00a0:
        r2 = 11;
        goto L_0x00da;
    L_0x00a3:
        r4 = "feed_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00ab:
        r2 = 8;
        goto L_0x00da;
    L_0x00ae:
        r4 = "search_result_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00b6:
        r2 = 10;
        goto L_0x00da;
    L_0x00b9:
        r4 = "logged";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00c1:
        r2 = 2;
        goto L_0x00da;
    L_0x00c3:
        r4 = "discover_carousel_style";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00cb:
        r2 = 15;
        goto L_0x00da;
    L_0x00ce:
        r4 = "friends_view_all_page_ordering";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00d9;
    L_0x00d6:
        r2 = 14;
        goto L_0x00da;
    L_0x00d9:
        r2 = -1;
    L_0x00da:
        switch(r2) {
            case 0: goto L_0x0434;
            case 1: goto L_0x0416;
            case 2: goto L_0x03f4;
            case 3: goto L_0x03b6;
            case 4: goto L_0x0377;
            case 5: goto L_0x0338;
            case 6: goto L_0x02f9;
            case 7: goto L_0x02ba;
            case 8: goto L_0x027b;
            case 9: goto L_0x023c;
            case 10: goto L_0x01fd;
            case 11: goto L_0x01be;
            case 12: goto L_0x017f;
            case 13: goto L_0x0140;
            case 14: goto L_0x0101;
            case 15: goto L_0x00e2;
            default: goto L_0x00dd;
        };
    L_0x00dd:
        r7.skipValue();
        goto L_0x0019;
    L_0x00e2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ec;
    L_0x00ea:
        goto L_0x043c;
    L_0x00ec:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00f9;
    L_0x00f0:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00fd;
    L_0x00f9:
        r2 = r7.nextString();
    L_0x00fd:
        r0.p = r2;
        goto L_0x0019;
    L_0x0101:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x010b;
    L_0x0109:
        goto L_0x043c;
    L_0x010b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x010f:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x011f:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0139;
    L_0x0125:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0131;
    L_0x012d:
        r7.nextNull();
        goto L_0x011f;
    L_0x0131:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x011f;
    L_0x0139:
        r7.endArray();
        r0.o = r2;
        goto L_0x0019;
    L_0x0140:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014a;
    L_0x0148:
        goto L_0x043c;
    L_0x014a:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x014e:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x015e:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0178;
    L_0x0164:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0170;
    L_0x016c:
        r7.nextNull();
        goto L_0x015e;
    L_0x0170:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x015e;
    L_0x0178:
        r7.endArray();
        r0.n = r2;
        goto L_0x0019;
    L_0x017f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0189;
    L_0x0187:
        goto L_0x043c;
    L_0x0189:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x018d:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x019d:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x01b7;
    L_0x01a3:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01af;
    L_0x01ab:
        r7.nextNull();
        goto L_0x019d;
    L_0x01af:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x019d;
    L_0x01b7:
        r7.endArray();
        r0.m = r2;
        goto L_0x0019;
    L_0x01be:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01c8;
    L_0x01c6:
        goto L_0x043c;
    L_0x01c8:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01cc:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x01dc:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x01f6;
    L_0x01e2:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01ee;
    L_0x01ea:
        r7.nextNull();
        goto L_0x01dc;
    L_0x01ee:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x01dc;
    L_0x01f6:
        r7.endArray();
        r0.l = r2;
        goto L_0x0019;
    L_0x01fd:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0207;
    L_0x0205:
        goto L_0x043c;
    L_0x0207:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x020b:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x021b:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0235;
    L_0x0221:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x022d;
    L_0x0229:
        r7.nextNull();
        goto L_0x021b;
    L_0x022d:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x021b;
    L_0x0235:
        r7.endArray();
        r0.k = r2;
        goto L_0x0019;
    L_0x023c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0246;
    L_0x0244:
        goto L_0x043c;
    L_0x0246:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x024a:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x025a:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0274;
    L_0x0260:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x026c;
    L_0x0268:
        r7.nextNull();
        goto L_0x025a;
    L_0x026c:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x025a;
    L_0x0274:
        r7.endArray();
        r0.j = r2;
        goto L_0x0019;
    L_0x027b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0285;
    L_0x0283:
        goto L_0x043c;
    L_0x0285:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0289:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0299:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x02b3;
    L_0x029f:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x02ab;
    L_0x02a7:
        r7.nextNull();
        goto L_0x0299;
    L_0x02ab:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0299;
    L_0x02b3:
        r7.endArray();
        r0.i = r2;
        goto L_0x0019;
    L_0x02ba:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02c4;
    L_0x02c2:
        goto L_0x043c;
    L_0x02c4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x02c8:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x02d8:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x02f2;
    L_0x02de:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x02ea;
    L_0x02e6:
        r7.nextNull();
        goto L_0x02d8;
    L_0x02ea:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x02d8;
    L_0x02f2:
        r7.endArray();
        r0.h = r2;
        goto L_0x0019;
    L_0x02f9:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0303;
    L_0x0301:
        goto L_0x043c;
    L_0x0303:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0307:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0317:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0331;
    L_0x031d:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0329;
    L_0x0325:
        r7.nextNull();
        goto L_0x0317;
    L_0x0329:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0317;
    L_0x0331:
        r7.endArray();
        r0.g = r2;
        goto L_0x0019;
    L_0x0338:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0342;
    L_0x0340:
        goto L_0x043c;
    L_0x0342:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0346:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0356:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0370;
    L_0x035c:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0368;
    L_0x0364:
        r7.nextNull();
        goto L_0x0356;
    L_0x0368:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0356;
    L_0x0370:
        r7.endArray();
        r0.f = r2;
        goto L_0x0019;
    L_0x0377:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0381;
    L_0x037f:
        goto L_0x043c;
    L_0x0381:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0385:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0395:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x03af;
    L_0x039b:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x03a7;
    L_0x03a3:
        r7.nextNull();
        goto L_0x0395;
    L_0x03a7:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0395;
    L_0x03af:
        r7.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x03b6:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03bf;
    L_0x03be:
        goto L_0x043c;
    L_0x03bf:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x03c3:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x03d3:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x03ed;
    L_0x03d9:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x03e5;
    L_0x03e1:
        r7.nextNull();
        goto L_0x03d3;
    L_0x03e5:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x03d3;
    L_0x03ed:
        r7.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x03f4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03fd;
    L_0x03fc:
        goto L_0x043c;
    L_0x03fd:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x040a;
    L_0x0401:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x040e;
    L_0x040a:
        r2 = r7.nextBoolean();
    L_0x040e:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x0416:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x041f;
    L_0x041e:
        goto L_0x043c;
    L_0x041f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x042c;
    L_0x0423:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0430;
    L_0x042c:
        r2 = r7.nextString();
    L_0x0430:
        r0.b = r2;
        goto L_0x0019;
    L_0x0434:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0441;
    L_0x043c:
        r7.nextNull();
        goto L_0x0019;
    L_0x0441:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0445:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0455:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x046f;
    L_0x045b:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0467;
    L_0x0463:
        r7.nextNull();
        goto L_0x0455;
    L_0x0467:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0455;
    L_0x046f:
        r7.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x0476:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aheg.read(com.google.gson.stream.JsonReader):ahef");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahef ahef) {
        if (ahef == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahef.a != null) {
            jsonWriter.name("suggested_friend_results");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (ahej write : ahef.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (ahef.b != null) {
            jsonWriter.name(ErrorFields.MESSAGE);
            jsonWriter.value(ahef.b);
        }
        if (ahef.c != null) {
            jsonWriter.name("logged");
            jsonWriter.value(ahef.c.booleanValue());
        }
        if (ahef.d != null) {
            jsonWriter.name("suggestion_placement_to_reason_mapping");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (aher write2 : ahef.d) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (ahef.e != null) {
            jsonWriter.name("suggested_friend_results_v2");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (ahen write3 : ahef.e) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        if (ahef.f != null) {
            jsonWriter.name("add_friends_footer_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write4 : ahef.f) {
                typeAdapter.write(jsonWriter, write4);
            }
            jsonWriter.endArray();
        }
        if (ahef.g != null) {
            jsonWriter.name("stories_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write42 : ahef.g) {
                typeAdapter.write(jsonWriter, write42);
            }
            jsonWriter.endArray();
        }
        if (ahef.h != null) {
            jsonWriter.name("send_to_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write422 : ahef.h) {
                typeAdapter.write(jsonWriter, write422);
            }
            jsonWriter.endArray();
        }
        if (ahef.i != null) {
            jsonWriter.name("feed_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write4222 : ahef.i) {
                typeAdapter.write(jsonWriter, write4222);
            }
            jsonWriter.endArray();
        }
        if (ahef.j != null) {
            jsonWriter.name("search_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write42222 : ahef.j) {
                typeAdapter.write(jsonWriter, write42222);
            }
            jsonWriter.endArray();
        }
        if (ahef.k != null) {
            jsonWriter.name("search_result_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write422222 : ahef.k) {
                typeAdapter.write(jsonWriter, write422222);
            }
            jsonWriter.endArray();
        }
        if (ahef.l != null) {
            jsonWriter.name("full_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write4222222 : ahef.l) {
                typeAdapter.write(jsonWriter, write4222222);
            }
            jsonWriter.endArray();
        }
        if (ahef.m != null) {
            jsonWriter.name("stories_view_all_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write42222222 : ahef.m) {
                typeAdapter.write(jsonWriter, write42222222);
            }
            jsonWriter.endArray();
        }
        if (ahef.n != null) {
            jsonWriter.name("friends_horizontal_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write422222222 : ahef.n) {
                typeAdapter.write(jsonWriter, write422222222);
            }
            jsonWriter.endArray();
        }
        if (ahef.o != null) {
            jsonWriter.name("friends_view_all_page_ordering");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (ahel write4222222222 : ahef.o) {
                typeAdapter.write(jsonWriter, write4222222222);
            }
            jsonWriter.endArray();
        }
        if (ahef.p != null) {
            jsonWriter.name("discover_carousel_style");
            jsonWriter.value(ahef.p);
        }
        jsonWriter.endObject();
    }
}
