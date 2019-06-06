package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aesp */
public final class aesp extends TypeAdapter<aeso> {
    private final Gson a;
    private final Supplier<TypeAdapter<aepe>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aepe.class)));
    private final Supplier<TypeAdapter<aerv>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aerv.class)));
    private final Supplier<TypeAdapter<aerx>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aerx.class)));
    private final Supplier<TypeAdapter<aesc>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesc.class)));
    private final Supplier<TypeAdapter<aest>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(aest.class)));
    private final Supplier<TypeAdapter<aety>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(aety.class)));
    private final Supplier<TypeAdapter<aewp>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(aewp.class)));
    private final Supplier<TypeAdapter<aewr>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(aewr.class)));
    private final Supplier<TypeAdapter<aeyn>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeyn.class)));
    private final Supplier<TypeAdapter<aeyz>> k = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeyz.class)));
    private final Supplier<TypeAdapter<afaa>> l = Suppliers.memoize(new afdq(this.a, TypeToken.get(afaa.class)));
    private final Supplier<TypeAdapter<afbz>> m = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbz.class)));
    private final Supplier<TypeAdapter<afdk>> n = Suppliers.memoize(new afdq(this.a, TypeToken.get(afdk.class)));

    public aesp(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:220:0x047b, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aeso read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aeso;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0492;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2062325054: goto L_0x012e;
            case -1890252483: goto L_0x0124;
            case -1496652097: goto L_0x011a;
            case -1467162620: goto L_0x010f;
            case -1078031089: goto L_0x0105;
            case -915841003: goto L_0x00fa;
            case -914869618: goto L_0x00ef;
            case -843673474: goto L_0x00e4;
            case -583173933: goto L_0x00da;
            case -511084661: goto L_0x00cf;
            case -363415829: goto L_0x00c4;
            case -327121704: goto L_0x00b9;
            case -320237154: goto L_0x00ad;
            case 3556653: goto L_0x00a2;
            case 3575610: goto L_0x0097;
            case 103772132: goto L_0x008c;
            case 308161155: goto L_0x0080;
            case 317930500: goto L_0x0074;
            case 405645655: goto L_0x0069;
            case 427641703: goto L_0x005d;
            case 905289432: goto L_0x0051;
            case 905459521: goto L_0x0045;
            case 1075753043: goto L_0x0039;
            case 1939822840: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0139;
    L_0x002d:
        r4 = "media_save";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0035:
        r2 = 17;
        goto L_0x013a;
    L_0x0039:
        r4 = "is_screen_recording";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0041:
        r2 = 21;
        goto L_0x013a;
    L_0x0045:
        r4 = "message_parcel";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x004d:
        r2 = 22;
        goto L_0x013a;
    L_0x0051:
        r4 = "message_pallet";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0059:
        r2 = 19;
        goto L_0x013a;
    L_0x005d:
        r4 = "screen_capture_source";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0065:
        r2 = 23;
        goto L_0x013a;
    L_0x0069:
        r4 = "attributes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0071:
        r2 = 7;
        goto L_0x013a;
    L_0x0074:
        r4 = "reply_medias";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x007c:
        r2 = 18;
        goto L_0x013a;
    L_0x0080:
        r4 = "obfuscation";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0088:
        r2 = 11;
        goto L_0x013a;
    L_0x008c:
        r4 = "media";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0094:
        r2 = 0;
        goto L_0x013a;
    L_0x0097:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x009f:
        r2 = 4;
        goto L_0x013a;
    L_0x00a2:
        r4 = "text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00aa:
        r2 = 6;
        goto L_0x013a;
    L_0x00ad:
        r4 = "khaleesi_share";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00b5:
        r2 = 13;
        goto L_0x013a;
    L_0x00b9:
        r4 = "nyc_share";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00c1:
        r2 = 14;
        goto L_0x013a;
    L_0x00c4:
        r4 = "search_share_story_snap";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00cc:
        r2 = 15;
        goto L_0x013a;
    L_0x00cf:
        r4 = "media_card_attributes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00d7:
        r2 = 8;
        goto L_0x013a;
    L_0x00da:
        r4 = "type_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00e2:
        r2 = 5;
        goto L_0x013a;
    L_0x00e4:
        r4 = "search_share_story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00ec:
        r2 = 16;
        goto L_0x013a;
    L_0x00ef:
        r4 = "story_title";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x00f7:
        r2 = 9;
        goto L_0x013a;
    L_0x00fa:
        r4 = "story_share";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0102:
        r2 = 10;
        goto L_0x013a;
    L_0x0105:
        r4 = "medias";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x010d:
        r2 = 1;
        goto L_0x013a;
    L_0x010f:
        r4 = "snap_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0117:
        r2 = 12;
        goto L_0x013a;
    L_0x011a:
        r4 = "snapchatter";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0122:
        r2 = 3;
        goto L_0x013a;
    L_0x0124:
        r4 = "sticker";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x012c:
        r2 = 2;
        goto L_0x013a;
    L_0x012e:
        r4 = "send_start_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0139;
    L_0x0136:
        r2 = 20;
        goto L_0x013a;
    L_0x0139:
        r2 = -1;
    L_0x013a:
        switch(r2) {
            case 0: goto L_0x0473;
            case 1: goto L_0x0435;
            case 2: goto L_0x041a;
            case 3: goto L_0x03ff;
            case 4: goto L_0x03e0;
            case 5: goto L_0x03ca;
            case 6: goto L_0x03ab;
            case 7: goto L_0x036c;
            case 8: goto L_0x032d;
            case 9: goto L_0x030e;
            case 10: goto L_0x02f2;
            case 11: goto L_0x02dc;
            case 12: goto L_0x02c0;
            case 13: goto L_0x02a4;
            case 14: goto L_0x0288;
            case 15: goto L_0x026c;
            case 16: goto L_0x0250;
            case 17: goto L_0x0234;
            case 18: goto L_0x01f5;
            case 19: goto L_0x01b6;
            case 20: goto L_0x01a0;
            case 21: goto L_0x017d;
            case 22: goto L_0x0161;
            case 23: goto L_0x0142;
            default: goto L_0x013d;
        };
    L_0x013d:
        r7.skipValue();
        goto L_0x0019;
    L_0x0142:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014c;
    L_0x014a:
        goto L_0x047b;
    L_0x014c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0159;
    L_0x0150:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x015d;
    L_0x0159:
        r2 = r7.nextString();
    L_0x015d:
        r0.x = r2;
        goto L_0x0019;
    L_0x0161:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016b;
    L_0x0169:
        goto L_0x047b;
    L_0x016b:
        r2 = r6.f;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aest) r2;
        r0.w = r2;
        goto L_0x0019;
    L_0x017d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0187;
    L_0x0185:
        goto L_0x047b;
    L_0x0187:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0194;
    L_0x018b:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0198;
    L_0x0194:
        r2 = r7.nextBoolean();
    L_0x0198:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.v = r2;
        goto L_0x0019;
    L_0x01a0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01aa;
    L_0x01a8:
        goto L_0x047b;
    L_0x01aa:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.u = r2;
        goto L_0x0019;
    L_0x01b6:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01c0;
    L_0x01be:
        goto L_0x047b;
    L_0x01c0:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01c4:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.f;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x01d4:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x01ee;
    L_0x01da:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01e6;
    L_0x01e2:
        r7.nextNull();
        goto L_0x01d4;
    L_0x01e6:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x01d4;
    L_0x01ee:
        r7.endArray();
        r0.t = r2;
        goto L_0x0019;
    L_0x01f5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ff;
    L_0x01fd:
        goto L_0x047b;
    L_0x01ff:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0203:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0213:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x022d;
    L_0x0219:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0225;
    L_0x0221:
        r7.nextNull();
        goto L_0x0213;
    L_0x0225:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0213;
    L_0x022d:
        r7.endArray();
        r0.s = r2;
        goto L_0x0019;
    L_0x0234:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x023e;
    L_0x023c:
        goto L_0x047b;
    L_0x023e:
        r2 = r6.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aesc) r2;
        r0.r = r2;
        goto L_0x0019;
    L_0x0250:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x025a;
    L_0x0258:
        goto L_0x047b;
    L_0x025a:
        r2 = r6.h;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aewp) r2;
        r0.q = r2;
        goto L_0x0019;
    L_0x026c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0276;
    L_0x0274:
        goto L_0x047b;
    L_0x0276:
        r2 = r6.i;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aewr) r2;
        r0.p = r2;
        goto L_0x0019;
    L_0x0288:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0292;
    L_0x0290:
        goto L_0x047b;
    L_0x0292:
        r2 = r6.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aety) r2;
        r0.o = r2;
        goto L_0x0019;
    L_0x02a4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02ae;
    L_0x02ac:
        goto L_0x047b;
    L_0x02ae:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aepe) r2;
        r0.n = r2;
        goto L_0x0019;
    L_0x02c0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02ca;
    L_0x02c8:
        goto L_0x047b;
    L_0x02ca:
        r2 = r6.j;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeyn) r2;
        r0.m = r2;
        goto L_0x0019;
    L_0x02dc:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02e6;
    L_0x02e4:
        goto L_0x047b;
    L_0x02e6:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x02f2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02fc;
    L_0x02fa:
        goto L_0x047b;
    L_0x02fc:
        r2 = r6.m;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbz) r2;
        r0.k = r2;
        goto L_0x0019;
    L_0x030e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0318;
    L_0x0316:
        goto L_0x047b;
    L_0x0318:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0325;
    L_0x031c:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0329;
    L_0x0325:
        r2 = r7.nextString();
    L_0x0329:
        r0.j = r2;
        goto L_0x0019;
    L_0x032d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0337;
    L_0x0335:
        goto L_0x047b;
    L_0x0337:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x033b:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x034b:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0365;
    L_0x0351:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x035d;
    L_0x0359:
        r7.nextNull();
        goto L_0x034b;
    L_0x035d:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x034b;
    L_0x0365:
        r7.endArray();
        r0.i = r2;
        goto L_0x0019;
    L_0x036c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0376;
    L_0x0374:
        goto L_0x047b;
    L_0x0376:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x037a:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.n;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x038a:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x03a4;
    L_0x0390:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x039c;
    L_0x0398:
        r7.nextNull();
        goto L_0x038a;
    L_0x039c:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x038a;
    L_0x03a4:
        r7.endArray();
        r0.h = r2;
        goto L_0x0019;
    L_0x03ab:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03b5;
    L_0x03b3:
        goto L_0x047b;
    L_0x03b5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x03c2;
    L_0x03b9:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x03c6;
    L_0x03c2:
        r2 = r7.nextString();
    L_0x03c6:
        r0.g = r2;
        goto L_0x0019;
    L_0x03ca:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03d4;
    L_0x03d2:
        goto L_0x047b;
    L_0x03d4:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x03e0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03ea;
    L_0x03e8:
        goto L_0x047b;
    L_0x03ea:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x03f7;
    L_0x03ee:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x03fb;
    L_0x03f7:
        r2 = r7.nextString();
    L_0x03fb:
        r0.e = r2;
        goto L_0x0019;
    L_0x03ff:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0408;
    L_0x0407:
        goto L_0x047b;
    L_0x0408:
        r2 = r6.k;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeyz) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x041a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0423;
    L_0x0422:
        goto L_0x047b;
    L_0x0423:
        r2 = r6.l;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afaa) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x0435:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x043e;
    L_0x043d:
        goto L_0x047b;
    L_0x043e:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0442:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0452:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x046c;
    L_0x0458:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0464;
    L_0x0460:
        r7.nextNull();
        goto L_0x0452;
    L_0x0464:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0452;
    L_0x046c:
        r7.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x0473:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0480;
    L_0x047b:
        r7.nextNull();
        goto L_0x0019;
    L_0x0480:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aerv) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x0492:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesp.read(com.google.gson.stream.JsonReader):aeso");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeso aeso) {
        if (aeso == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeso.a != null) {
            jsonWriter.name("media");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aeso.a);
        }
        if (aeso.b != null) {
            jsonWriter.name("medias");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aerv write : aeso.b) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aeso.c != null) {
            jsonWriter.name("sticker");
            ((TypeAdapter) this.l.get()).write(jsonWriter, aeso.c);
        }
        if (aeso.d != null) {
            jsonWriter.name("snapchatter");
            ((TypeAdapter) this.k.get()).write(jsonWriter, aeso.d);
        }
        if (aeso.e != null) {
            jsonWriter.name("type");
            jsonWriter.value(aeso.e);
        }
        if (aeso.f != null) {
            jsonWriter.name("type_version");
            jsonWriter.value(aeso.f);
        }
        if (aeso.g != null) {
            jsonWriter.name("text");
            jsonWriter.value(aeso.g);
        }
        if (aeso.h != null) {
            jsonWriter.name("attributes");
            typeAdapter = (TypeAdapter) this.n.get();
            jsonWriter.beginArray();
            for (afdk write2 : aeso.h) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aeso.i != null) {
            jsonWriter.name("media_card_attributes");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (aerx write3 : aeso.i) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        if (aeso.j != null) {
            jsonWriter.name("story_title");
            jsonWriter.value(aeso.j);
        }
        if (aeso.k != null) {
            jsonWriter.name("story_share");
            ((TypeAdapter) this.m.get()).write(jsonWriter, aeso.k);
        }
        if (aeso.l != null) {
            jsonWriter.name("obfuscation");
            jsonWriter.value(aeso.l);
        }
        if (aeso.m != null) {
            jsonWriter.name("snap_metadata");
            ((TypeAdapter) this.j.get()).write(jsonWriter, aeso.m);
        }
        if (aeso.n != null) {
            jsonWriter.name("khaleesi_share");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aeso.n);
        }
        if (aeso.o != null) {
            jsonWriter.name("nyc_share");
            ((TypeAdapter) this.g.get()).write(jsonWriter, aeso.o);
        }
        if (aeso.p != null) {
            jsonWriter.name("search_share_story_snap");
            ((TypeAdapter) this.i.get()).write(jsonWriter, aeso.p);
        }
        if (aeso.q != null) {
            jsonWriter.name("search_share_story");
            ((TypeAdapter) this.h.get()).write(jsonWriter, aeso.q);
        }
        if (aeso.r != null) {
            jsonWriter.name("media_save");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aeso.r);
        }
        if (aeso.s != null) {
            jsonWriter.name("reply_medias");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aerv write4 : aeso.s) {
                typeAdapter.write(jsonWriter, write4);
            }
            jsonWriter.endArray();
        }
        if (aeso.t != null) {
            jsonWriter.name("message_pallet");
            typeAdapter = (TypeAdapter) this.f.get();
            jsonWriter.beginArray();
            for (aest write5 : aeso.t) {
                typeAdapter.write(jsonWriter, write5);
            }
            jsonWriter.endArray();
        }
        if (aeso.u != null) {
            jsonWriter.name("send_start_timestamp");
            jsonWriter.value(aeso.u);
        }
        if (aeso.v != null) {
            jsonWriter.name("is_screen_recording");
            jsonWriter.value(aeso.v.booleanValue());
        }
        if (aeso.w != null) {
            jsonWriter.name("message_parcel");
            ((TypeAdapter) this.f.get()).write(jsonWriter, aeso.w);
        }
        if (aeso.x != null) {
            jsonWriter.name("screen_capture_source");
            jsonWriter.value(aeso.x);
        }
        jsonWriter.endObject();
    }
}
