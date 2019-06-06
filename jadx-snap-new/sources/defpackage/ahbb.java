package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ahbb */
public final class ahbb extends TypeAdapter<ahaz> {
    private final Gson a;
    private final Supplier<TypeAdapter<aegj>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aegj.class)));
    private final Supplier<TypeAdapter<aegz>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aegz.class)));
    private final Supplier<TypeAdapter<aehb>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aehb.class)));
    private final Supplier<TypeAdapter<aeie>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeie.class)));
    private final Supplier<TypeAdapter<aekk>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(aekk.class)));
    private final Supplier<TypeAdapter<aepk>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(aepk.class)));
    private final Supplier<TypeAdapter<aepm>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(aepm.class)));
    private final Supplier<TypeAdapter<aesr>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesr.class)));
    private final Supplier<TypeAdapter<aesx>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesx.class)));
    private final Supplier<TypeAdapter<ahbe>> k = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahbe.class)));
    private final Supplier<TypeAdapter<ahbg>> l = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahbg.class)));
    private final Supplier<TypeAdapter<ahbl>> m = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahbl.class)));
    private final Supplier<TypeAdapter<aetd>> n = Suppliers.memoize(new afdq(this.a, TypeToken.get(aetd.class)));
    private final Supplier<TypeAdapter<afgd>> o = Suppliers.memoize(new afdq(this.a, TypeToken.get(afgd.class)));
    private final Supplier<TypeAdapter<Map<String, Long>>> p = Suppliers.memoize(new afdq(this.a, new 1()));

    /* renamed from: ahbb$1 */
    class 1 extends TypeToken<Map<String, Long>> {
        1() {
        }
    }

    public ahbb(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:415:0x0823, code skipped:
            r9.nextNull();
     */
    /* renamed from: a */
    public final defpackage.ahaz read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new ahaz;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x083d;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2015229967: goto L_0x01ca;
            case -1979713632: goto L_0x01c0;
            case -1923212139: goto L_0x01b5;
            case -1837667060: goto L_0x01aa;
            case -1808669166: goto L_0x019f;
            case -1798980948: goto L_0x0195;
            case -1633355776: goto L_0x018b;
            case -1486159223: goto L_0x0180;
            case -1449610673: goto L_0x0175;
            case -1446480113: goto L_0x016a;
            case -1186103972: goto L_0x015f;
            case -1170027518: goto L_0x0154;
            case -861947948: goto L_0x0148;
            case -357251627: goto L_0x013c;
            case -312614600: goto L_0x0130;
            case -127080501: goto L_0x0124;
            case 12591112: goto L_0x0118;
            case 124804545: goto L_0x010c;
            case 769884274: goto L_0x0100;
            case 781066970: goto L_0x00f5;
            case 831846208: goto L_0x00e9;
            case 951530617: goto L_0x00dd;
            case 1040708490: goto L_0x00d1;
            case 1192129990: goto L_0x00c5;
            case 1227146819: goto L_0x00b9;
            case 1331842436: goto L_0x00ad;
            case 1379332622: goto L_0x00a1;
            case 1487479360: goto L_0x0096;
            case 1558197493: goto L_0x008a;
            case 1613156268: goto L_0x007f;
            case 1638408836: goto L_0x0073;
            case 1641527805: goto L_0x0067;
            case 1654645331: goto L_0x005b;
            case 1826291212: goto L_0x004f;
            case 2025910920: goto L_0x0044;
            case 2051278812: goto L_0x0039;
            case 2121000977: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x01d5;
    L_0x002d:
        r4 = "last_mischief_content";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0035:
        r2 = 25;
        goto L_0x01d6;
    L_0x0039:
        r4 = "mischief_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0041:
        r2 = 2;
        goto L_0x01d6;
    L_0x0044:
        r4 = "create_mischief_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x004c:
        r2 = 5;
        goto L_0x01d6;
    L_0x004f:
        r4 = "is_story_muted";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0057:
        r2 = 30;
        goto L_0x01d6;
    L_0x005b:
        r4 = "chat_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0063:
        r2 = 15;
        goto L_0x01d6;
    L_0x0067:
        r4 = "message_erase_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x006f:
        r2 = 34;
        goto L_0x01d6;
    L_0x0073:
        r4 = "release_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x007b:
        r2 = 16;
        goto L_0x01d6;
    L_0x007f:
        r4 = "ex_participants";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0087:
        r2 = 4;
        goto L_0x01d6;
    L_0x008a:
        r4 = "later_content_exists";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0092:
        r2 = 24;
        goto L_0x01d6;
    L_0x0096:
        r4 = "last_interaction_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x009e:
        r2 = 6;
        goto L_0x01d6;
    L_0x00a1:
        r4 = "creator_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00a9:
        r2 = 31;
        goto L_0x01d6;
    L_0x00ad:
        r4 = "latest_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00b5:
        r2 = 8;
        goto L_0x01d6;
    L_0x00b9:
        r4 = "blocked_participant_exceptions";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00c1:
        r2 = 26;
        goto L_0x01d6;
    L_0x00c5:
        r4 = "notification_status";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00cd:
        r2 = 18;
        goto L_0x01d6;
    L_0x00d1:
        r4 = "mischief_creation_source";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00d9:
        r2 = 32;
        goto L_0x01d6;
    L_0x00dd:
        r4 = "content";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00e5:
        r2 = 13;
        goto L_0x01d6;
    L_0x00e9:
        r4 = "content_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00f1:
        r2 = 12;
        goto L_0x01d6;
    L_0x00f5:
        r4 = "last_cleared_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x00fd:
        r2 = 7;
        goto L_0x01d6;
    L_0x0100:
        r4 = "message_state_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0108:
        r2 = 22;
        goto L_0x01d6;
    L_0x010c:
        r4 = "earlier_content_exists";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0114:
        r2 = 20;
        goto L_0x01d6;
    L_0x0118:
        r4 = "content_order";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0120:
        r2 = 14;
        goto L_0x01d6;
    L_0x0124:
        r4 = "mischief_mob_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x012c:
        r2 = 29;
        goto L_0x01d6;
    L_0x0130:
        r4 = "earliest_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0138:
        r2 = 21;
        goto L_0x01d6;
    L_0x013c:
        r4 = "sticker_favorites";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0144:
        r2 = 10;
        goto L_0x01d6;
    L_0x0148:
        r4 = "page_latest_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0150:
        r2 = 27;
        goto L_0x01d6;
    L_0x0154:
        r4 = "update_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x015c:
        r2 = 17;
        goto L_0x01d6;
    L_0x015f:
        r4 = "participant_last_content";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0167:
        r2 = 28;
        goto L_0x01d6;
    L_0x016a:
        r4 = "seen_chat_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0172:
        r2 = 33;
        goto L_0x01d6;
    L_0x0175:
        r4 = "snap_state_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x017d:
        r2 = 23;
        goto L_0x01d6;
    L_0x0180:
        r4 = "video_chat_params";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0188:
        r2 = 19;
        goto L_0x01d6;
    L_0x018b:
        r4 = "mischief_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x0193:
        r2 = 1;
        goto L_0x01d6;
    L_0x0195:
        r4 = "mischief_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x019d:
        r2 = 0;
        goto L_0x01d6;
    L_0x019f:
        r4 = "iter_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x01a7:
        r2 = 11;
        goto L_0x01d6;
    L_0x01aa:
        r4 = "is_cognac_notification_muted";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x01b2:
        r2 = 36;
        goto L_0x01d6;
    L_0x01b5:
        r4 = "last_mischief_chat_action";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x01bd:
        r2 = 9;
        goto L_0x01d6;
    L_0x01c0:
        r4 = "participants";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x01c8:
        r2 = 3;
        goto L_0x01d6;
    L_0x01ca:
        r4 = "mention_notification_status";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x01d5;
    L_0x01d2:
        r2 = 35;
        goto L_0x01d6;
    L_0x01d5:
        r2 = -1;
    L_0x01d6:
        switch(r2) {
            case 0: goto L_0x081b;
            case 1: goto L_0x0800;
            case 2: goto L_0x07e2;
            case 3: goto L_0x07a4;
            case 4: goto L_0x0765;
            case 5: goto L_0x074f;
            case 6: goto L_0x0739;
            case 7: goto L_0x0723;
            case 8: goto L_0x06f4;
            case 9: goto L_0x06d8;
            case 10: goto L_0x0699;
            case 11: goto L_0x067a;
            case 12: goto L_0x065b;
            case 13: goto L_0x061c;
            case 14: goto L_0x05e4;
            case 15: goto L_0x05a5;
            case 16: goto L_0x0566;
            case 17: goto L_0x0527;
            case 18: goto L_0x0504;
            case 19: goto L_0x04e8;
            case 20: goto L_0x04c5;
            case 21: goto L_0x0496;
            case 22: goto L_0x0457;
            case 23: goto L_0x0418;
            case 24: goto L_0x03f5;
            case 25: goto L_0x03d9;
            case 26: goto L_0x03aa;
            case 27: goto L_0x037b;
            case 28: goto L_0x033c;
            case 29: goto L_0x031d;
            case 30: goto L_0x02fa;
            case 31: goto L_0x02db;
            case 32: goto L_0x02bc;
            case 33: goto L_0x0263;
            case 34: goto L_0x0224;
            case 35: goto L_0x0201;
            case 36: goto L_0x01de;
            default: goto L_0x01d9;
        };
    L_0x01d9:
        r9.skipValue();
        goto L_0x0019;
    L_0x01de:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e8;
    L_0x01e6:
        goto L_0x0823;
    L_0x01e8:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x01f5;
    L_0x01ec:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01f9;
    L_0x01f5:
        r2 = r9.nextBoolean();
    L_0x01f9:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.K = r2;
        goto L_0x0019;
    L_0x0201:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x020b;
    L_0x0209:
        goto L_0x0823;
    L_0x020b:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0218;
    L_0x020f:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x021c;
    L_0x0218:
        r2 = r9.nextBoolean();
    L_0x021c:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.J = r2;
        goto L_0x0019;
    L_0x0224:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x022e;
    L_0x022c:
        goto L_0x0823;
    L_0x022e:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0232:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.i;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0242:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x025c;
    L_0x0248:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0254;
    L_0x0250:
        r9.nextNull();
        goto L_0x0242;
    L_0x0254:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0242;
    L_0x025c:
        r9.endArray();
        r0.I = r2;
        goto L_0x0019;
    L_0x0263:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x026d;
    L_0x026b:
        goto L_0x0823;
    L_0x026d:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.p;
        r3.get();
        r9.beginObject();
    L_0x027a:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x02b5;
    L_0x0280:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0290;
    L_0x028c:
        r9.nextNull();
        goto L_0x027a;
    L_0x0290:
        r4 = new com.google.gson.internal.LinkedTreeMap;
        r4.<init>();
        r9.beginObject();
    L_0x0298:
        r5 = r9.hasNext();
        if (r5 == 0) goto L_0x02ae;
    L_0x029e:
        r5 = r9.nextName();
        r6 = r9.nextLong();
        r6 = java.lang.Long.valueOf(r6);
        r4.put(r5, r6);
        goto L_0x0298;
    L_0x02ae:
        r9.endObject();
        r2.put(r3, r4);
        goto L_0x027a;
    L_0x02b5:
        r9.endObject();
        r0.H = r2;
        goto L_0x0019;
    L_0x02bc:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02c6;
    L_0x02c4:
        goto L_0x0823;
    L_0x02c6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02d3;
    L_0x02ca:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02d7;
    L_0x02d3:
        r2 = r9.nextString();
    L_0x02d7:
        r0.G = r2;
        goto L_0x0019;
    L_0x02db:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02e5;
    L_0x02e3:
        goto L_0x0823;
    L_0x02e5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02f2;
    L_0x02e9:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02f6;
    L_0x02f2:
        r2 = r9.nextString();
    L_0x02f6:
        r0.F = r2;
        goto L_0x0019;
    L_0x02fa:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0304;
    L_0x0302:
        goto L_0x0823;
    L_0x0304:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0311;
    L_0x0308:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0315;
    L_0x0311:
        r2 = r9.nextBoolean();
    L_0x0315:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.E = r2;
        goto L_0x0019;
    L_0x031d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0327;
    L_0x0325:
        goto L_0x0823;
    L_0x0327:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0334;
    L_0x032b:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0338;
    L_0x0334:
        r2 = r9.nextString();
    L_0x0338:
        r0.D = r2;
        goto L_0x0019;
    L_0x033c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0346;
    L_0x0344:
        goto L_0x0823;
    L_0x0346:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.h;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r9.beginObject();
    L_0x0356:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0374;
    L_0x035c:
        r4 = r9.nextName();
        r5 = r9.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x036c;
    L_0x0368:
        r9.nextNull();
        goto L_0x0356;
    L_0x036c:
        r5 = r3.read(r9);
        r2.put(r4, r5);
        goto L_0x0356;
    L_0x0374:
        r9.endObject();
        r0.C = r2;
        goto L_0x0019;
    L_0x037b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0385;
    L_0x0383:
        goto L_0x0823;
    L_0x0385:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x038d:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x03a3;
    L_0x0393:
        r3 = r9.nextName();
        r4 = r9.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x038d;
    L_0x03a3:
        r9.endObject();
        r0.B = r2;
        goto L_0x0019;
    L_0x03aa:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03b4;
    L_0x03b2:
        goto L_0x0823;
    L_0x03b4:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x03bc:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x03d2;
    L_0x03c2:
        r3 = r9.nextName();
        r4 = r9.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x03bc;
    L_0x03d2:
        r9.endObject();
        r0.A = r2;
        goto L_0x0019;
    L_0x03d9:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03e3;
    L_0x03e1:
        goto L_0x0823;
    L_0x03e3:
        r2 = r8.h;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aepm) r2;
        r0.z = r2;
        goto L_0x0019;
    L_0x03f5:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03ff;
    L_0x03fd:
        goto L_0x0823;
    L_0x03ff:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x040c;
    L_0x0403:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0410;
    L_0x040c:
        r2 = r9.nextBoolean();
    L_0x0410:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.y = r2;
        goto L_0x0019;
    L_0x0418:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0422;
    L_0x0420:
        goto L_0x0823;
    L_0x0422:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0426:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0436:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0450;
    L_0x043c:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0448;
    L_0x0444:
        r9.nextNull();
        goto L_0x0436;
    L_0x0448:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0436;
    L_0x0450:
        r9.endArray();
        r0.x = r2;
        goto L_0x0019;
    L_0x0457:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0461;
    L_0x045f:
        goto L_0x0823;
    L_0x0461:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0465:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.j;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0475:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x048f;
    L_0x047b:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0487;
    L_0x0483:
        r9.nextNull();
        goto L_0x0475;
    L_0x0487:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0475;
    L_0x048f:
        r9.endArray();
        r0.w = r2;
        goto L_0x0019;
    L_0x0496:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04a0;
    L_0x049e:
        goto L_0x0823;
    L_0x04a0:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x04a8:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x04be;
    L_0x04ae:
        r3 = r9.nextName();
        r4 = r9.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x04a8;
    L_0x04be:
        r9.endObject();
        r0.v = r2;
        goto L_0x0019;
    L_0x04c5:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04cf;
    L_0x04cd:
        goto L_0x0823;
    L_0x04cf:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x04dc;
    L_0x04d3:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x04e0;
    L_0x04dc:
        r2 = r9.nextBoolean();
    L_0x04e0:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.u = r2;
        goto L_0x0019;
    L_0x04e8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04f2;
    L_0x04f0:
        goto L_0x0823;
    L_0x04f2:
        r2 = r8.o;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.afgd) r2;
        r0.t = r2;
        goto L_0x0019;
    L_0x0504:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x050e;
    L_0x050c:
        goto L_0x0823;
    L_0x050e:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x051b;
    L_0x0512:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x051f;
    L_0x051b:
        r2 = r9.nextBoolean();
    L_0x051f:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.s = r2;
        goto L_0x0019;
    L_0x0527:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0531;
    L_0x052f:
        goto L_0x0823;
    L_0x0531:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0535:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.n;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0545:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x055f;
    L_0x054b:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0557;
    L_0x0553:
        r9.nextNull();
        goto L_0x0545;
    L_0x0557:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0545;
    L_0x055f:
        r9.endArray();
        r0.r = r2;
        goto L_0x0019;
    L_0x0566:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0570;
    L_0x056e:
        goto L_0x0823;
    L_0x0570:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0574:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0584:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x059e;
    L_0x058a:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0596;
    L_0x0592:
        r9.nextNull();
        goto L_0x0584;
    L_0x0596:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0584;
    L_0x059e:
        r9.endArray();
        r0.q = r2;
        goto L_0x0019;
    L_0x05a5:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05af;
    L_0x05ad:
        goto L_0x0823;
    L_0x05af:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x05b3:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x05c3:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x05dd;
    L_0x05c9:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x05d5;
    L_0x05d1:
        r9.nextNull();
        goto L_0x05c3;
    L_0x05d5:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x05c3;
    L_0x05dd:
        r9.endArray();
        r0.p = r2;
        goto L_0x0019;
    L_0x05e4:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05ee;
    L_0x05ec:
        goto L_0x0823;
    L_0x05ee:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x05f2:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x05fa:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0615;
    L_0x0600:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x060d;
    L_0x0604:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0611;
    L_0x060d:
        r4 = r9.nextString();
    L_0x0611:
        r3.add(r4);
        goto L_0x05fa;
    L_0x0615:
        r9.endArray();
        r0.o = r3;
        goto L_0x0019;
    L_0x061c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0626;
    L_0x0624:
        goto L_0x0823;
    L_0x0626:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x062a:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x063a:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0654;
    L_0x0640:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x064c;
    L_0x0648:
        r9.nextNull();
        goto L_0x063a;
    L_0x064c:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x063a;
    L_0x0654:
        r9.endArray();
        r0.n = r2;
        goto L_0x0019;
    L_0x065b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0665;
    L_0x0663:
        goto L_0x0823;
    L_0x0665:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0672;
    L_0x0669:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0676;
    L_0x0672:
        r2 = r9.nextString();
    L_0x0676:
        r0.m = r2;
        goto L_0x0019;
    L_0x067a:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0684;
    L_0x0682:
        goto L_0x0823;
    L_0x0684:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0691;
    L_0x0688:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0695;
    L_0x0691:
        r2 = r9.nextString();
    L_0x0695:
        r0.l = r2;
        goto L_0x0019;
    L_0x0699:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06a3;
    L_0x06a1:
        goto L_0x0823;
    L_0x06a3:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x06a7:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.f;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x06b7:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x06d1;
    L_0x06bd:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x06c9;
    L_0x06c5:
        r9.nextNull();
        goto L_0x06b7;
    L_0x06c9:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x06b7;
    L_0x06d1:
        r9.endArray();
        r0.k = r2;
        goto L_0x0019;
    L_0x06d8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06e2;
    L_0x06e0:
        goto L_0x0823;
    L_0x06e2:
        r2 = r8.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aepk) r2;
        r0.j = r2;
        goto L_0x0019;
    L_0x06f4:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06fe;
    L_0x06fc:
        goto L_0x0823;
    L_0x06fe:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x0706:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x071c;
    L_0x070c:
        r3 = r9.nextName();
        r4 = r9.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x0706;
    L_0x071c:
        r9.endObject();
        r0.i = r2;
        goto L_0x0019;
    L_0x0723:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x072d;
    L_0x072b:
        goto L_0x0823;
    L_0x072d:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.h = r2;
        goto L_0x0019;
    L_0x0739:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0743;
    L_0x0741:
        goto L_0x0823;
    L_0x0743:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x074f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0759;
    L_0x0757:
        goto L_0x0823;
    L_0x0759:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0765:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x076f;
    L_0x076d:
        goto L_0x0823;
    L_0x076f:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0773:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.k;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0783:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x079d;
    L_0x0789:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0795;
    L_0x0791:
        r9.nextNull();
        goto L_0x0783;
    L_0x0795:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0783;
    L_0x079d:
        r9.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x07a4:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07ad;
    L_0x07ac:
        goto L_0x0823;
    L_0x07ad:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x07b1:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.m;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x07c1:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x07db;
    L_0x07c7:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x07d3;
    L_0x07cf:
        r9.nextNull();
        goto L_0x07c1;
    L_0x07d3:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x07c1;
    L_0x07db:
        r9.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x07e2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07eb;
    L_0x07ea:
        goto L_0x0823;
    L_0x07eb:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x07f8;
    L_0x07ef:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x07fc;
    L_0x07f8:
        r2 = r9.nextString();
    L_0x07fc:
        r0.c = r2;
        goto L_0x0019;
    L_0x0800:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0809;
    L_0x0808:
        goto L_0x0823;
    L_0x0809:
        r2 = r8.l;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.ahbg) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x081b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0828;
    L_0x0823:
        r9.nextNull();
        goto L_0x0019;
    L_0x0828:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0835;
    L_0x082c:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0839;
    L_0x0835:
        r2 = r9.nextString();
    L_0x0839:
        r0.a = r2;
        goto L_0x0019;
    L_0x083d:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahbb.read(com.google.gson.stream.JsonReader):ahaz");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahaz ahaz) {
        if (ahaz == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahaz.a != null) {
            jsonWriter.name("mischief_id");
            jsonWriter.value(ahaz.a);
        }
        if (ahaz.b != null) {
            jsonWriter.name("mischief_metadata");
            ((TypeAdapter) this.l.get()).write(jsonWriter, ahaz.b);
        }
        if (ahaz.c != null) {
            jsonWriter.name("mischief_name");
            jsonWriter.value(ahaz.c);
        }
        if (ahaz.d != null) {
            jsonWriter.name("participants");
            typeAdapter = (TypeAdapter) this.m.get();
            jsonWriter.beginArray();
            for (ahbl write : ahaz.d) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (ahaz.e != null) {
            jsonWriter.name("ex_participants");
            typeAdapter = (TypeAdapter) this.k.get();
            jsonWriter.beginArray();
            for (ahbe write2 : ahaz.e) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (ahaz.f != null) {
            jsonWriter.name("create_mischief_timestamp");
            jsonWriter.value(ahaz.f);
        }
        if (ahaz.g != null) {
            jsonWriter.name("last_interaction_timestamp");
            jsonWriter.value(ahaz.g);
        }
        if (ahaz.h != null) {
            jsonWriter.name("last_cleared_timestamp");
            jsonWriter.value(ahaz.h);
        }
        if (ahaz.i != null) {
            jsonWriter.name("latest_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry : ahaz.i.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((Number) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahaz.j != null) {
            jsonWriter.name("last_mischief_chat_action");
            ((TypeAdapter) this.g.get()).write(jsonWriter, ahaz.j);
        }
        if (ahaz.k != null) {
            jsonWriter.name("sticker_favorites");
            typeAdapter = (TypeAdapter) this.f.get();
            jsonWriter.beginArray();
            for (aekk write3 : ahaz.k) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        if (ahaz.l != null) {
            jsonWriter.name("iter_token");
            jsonWriter.value(ahaz.l);
        }
        if (ahaz.m != null) {
            jsonWriter.name("content_type");
            jsonWriter.value(ahaz.m);
        }
        if (ahaz.n != null) {
            jsonWriter.name("content");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (aeie write4 : ahaz.n) {
                typeAdapter.write(jsonWriter, write4);
            }
            jsonWriter.endArray();
        }
        if (ahaz.o != null) {
            jsonWriter.name("content_order");
            jsonWriter.beginArray();
            for (String value : ahaz.o) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (ahaz.p != null) {
            jsonWriter.name("chat_messages");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aegj write5 : ahaz.p) {
                typeAdapter.write(jsonWriter, write5);
            }
            jsonWriter.endArray();
        }
        if (ahaz.q != null) {
            jsonWriter.name("release_messages");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aegz write6 : ahaz.q) {
                typeAdapter.write(jsonWriter, write6);
            }
            jsonWriter.endArray();
        }
        if (ahaz.r != null) {
            jsonWriter.name("update_messages");
            typeAdapter = (TypeAdapter) this.n.get();
            jsonWriter.beginArray();
            for (aetd write7 : ahaz.r) {
                typeAdapter.write(jsonWriter, write7);
            }
            jsonWriter.endArray();
        }
        if (ahaz.s != null) {
            jsonWriter.name("notification_status");
            jsonWriter.value(ahaz.s.booleanValue());
        }
        if (ahaz.t != null) {
            jsonWriter.name("video_chat_params");
            ((TypeAdapter) this.o.get()).write(jsonWriter, ahaz.t);
        }
        if (ahaz.u != null) {
            jsonWriter.name("earlier_content_exists");
            jsonWriter.value(ahaz.u.booleanValue());
        }
        if (ahaz.v != null) {
            jsonWriter.name("earliest_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry2 : ahaz.v.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                jsonWriter.value((Number) entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahaz.w != null) {
            jsonWriter.name("message_state_messages");
            typeAdapter = (TypeAdapter) this.j.get();
            jsonWriter.beginArray();
            for (aesx write8 : ahaz.w) {
                typeAdapter.write(jsonWriter, write8);
            }
            jsonWriter.endArray();
        }
        if (ahaz.x != null) {
            jsonWriter.name("snap_state_messages");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (aehb write9 : ahaz.x) {
                typeAdapter.write(jsonWriter, write9);
            }
            jsonWriter.endArray();
        }
        if (ahaz.y != null) {
            jsonWriter.name("later_content_exists");
            jsonWriter.value(ahaz.y.booleanValue());
        }
        if (ahaz.z != null) {
            jsonWriter.name("last_mischief_content");
            ((TypeAdapter) this.h.get()).write(jsonWriter, ahaz.z);
        }
        if (ahaz.A != null) {
            jsonWriter.name("blocked_participant_exceptions");
            jsonWriter.beginObject();
            for (Entry entry22 : ahaz.A.entrySet()) {
                jsonWriter.name((String) entry22.getKey());
                jsonWriter.value((Number) entry22.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahaz.B != null) {
            jsonWriter.name("page_latest_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry222 : ahaz.B.entrySet()) {
                jsonWriter.name((String) entry222.getKey());
                jsonWriter.value((Number) entry222.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahaz.C != null) {
            jsonWriter.name("participant_last_content");
            typeAdapter = (TypeAdapter) this.h.get();
            jsonWriter.beginObject();
            for (Entry entry3 : ahaz.C.entrySet()) {
                jsonWriter.name((String) entry3.getKey());
                typeAdapter.write(jsonWriter, entry3.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahaz.D != null) {
            jsonWriter.name("mischief_mob_id");
            jsonWriter.value(ahaz.D);
        }
        if (ahaz.E != null) {
            jsonWriter.name("is_story_muted");
            jsonWriter.value(ahaz.E.booleanValue());
        }
        if (ahaz.F != null) {
            jsonWriter.name("creator_id");
            jsonWriter.value(ahaz.F);
        }
        if (ahaz.G != null) {
            jsonWriter.name("mischief_creation_source");
            jsonWriter.value(ahaz.G);
        }
        if (ahaz.H != null) {
            jsonWriter.name("seen_chat_sequence_numbers");
            typeAdapter = (TypeAdapter) this.p.get();
            jsonWriter.beginObject();
            for (Entry entry32 : ahaz.H.entrySet()) {
                jsonWriter.name((String) entry32.getKey());
                typeAdapter.write(jsonWriter, entry32.getValue());
            }
            jsonWriter.endObject();
        }
        if (ahaz.I != null) {
            jsonWriter.name("message_erase_messages");
            typeAdapter = (TypeAdapter) this.i.get();
            jsonWriter.beginArray();
            for (aesr write10 : ahaz.I) {
                typeAdapter.write(jsonWriter, write10);
            }
            jsonWriter.endArray();
        }
        if (ahaz.J != null) {
            jsonWriter.name("mention_notification_status");
            jsonWriter.value(ahaz.J.booleanValue());
        }
        if (ahaz.K != null) {
            jsonWriter.name("is_cognac_notification_muted");
            jsonWriter.value(ahaz.K.booleanValue());
        }
        jsonWriter.endObject();
    }
}
