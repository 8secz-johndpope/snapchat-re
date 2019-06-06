package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.snap.core.db.record.FriendModel;
import java.util.Map.Entry;

/* renamed from: aelg */
public final class aelg extends TypeAdapter<aelf> {
    private final Gson a;
    private final Supplier<TypeAdapter<ahql>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahql.class)));
    private final Supplier<TypeAdapter<aemr>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aemr.class)));

    public aelg(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:422:0x07a9, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aelf read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aelf;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x07c3;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2104092752: goto L_0x021e;
            case -2095153345: goto L_0x0213;
            case -2056386237: goto L_0x0208;
            case -2023621058: goto L_0x01fd;
            case -1924708416: goto L_0x01f2;
            case -1837667060: goto L_0x01e7;
            case -1431307888: goto L_0x01dc;
            case -1421068813: goto L_0x01d1;
            case -1415887398: goto L_0x01c6;
            case -1052602149: goto L_0x01bb;
            case -962590849: goto L_0x01b1;
            case -922572207: goto L_0x01a6;
            case -844053137: goto L_0x019a;
            case -837465425: goto L_0x018e;
            case -782197508: goto L_0x0183;
            case -646079090: goto L_0x0177;
            case -583409821: goto L_0x016b;
            case -573809741: goto L_0x015f;
            case -507135486: goto L_0x0153;
            case -436269100: goto L_0x0147;
            case -304334538: goto L_0x013b;
            case -303224687: goto L_0x012f;
            case -147132913: goto L_0x0124;
            case -57089424: goto L_0x0118;
            case 3711: goto L_0x010d;
            case 3373707: goto L_0x0102;
            case 3575610: goto L_0x00f7;
            case 112093807: goto L_0x00eb;
            case 153440729: goto L_0x00df;
            case 347748857: goto L_0x00d3;
            case 414872763: goto L_0x00c7;
            case 575201095: goto L_0x00bb;
            case 937259329: goto L_0x00af;
            case 1069376125: goto L_0x00a4;
            case 1106369732: goto L_0x0098;
            case 1205184064: goto L_0x008c;
            case 1377092409: goto L_0x0080;
            case 1401027156: goto L_0x0074;
            case 1603353499: goto L_0x0068;
            case 1671764162: goto L_0x005d;
            case 1759821601: goto L_0x0051;
            case 1826291212: goto L_0x0045;
            case 1879455697: goto L_0x0039;
            case 2055546233: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0229;
    L_0x002d:
        r4 = "add_source";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0035:
        r2 = 18;
        goto L_0x022a;
    L_0x0039:
        r4 = "is_incoming_friend_request_viewed";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0041:
        r2 = 40;
        goto L_0x022a;
    L_0x0045:
        r4 = "is_story_muted";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x004d:
        r2 = 39;
        goto L_0x022a;
    L_0x0051:
        r4 = "local_story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0059:
        r2 = 15;
        goto L_0x022a;
    L_0x005d:
        r4 = "display";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0065:
        r2 = 3;
        goto L_0x022a;
    L_0x0068:
        r4 = "friendmoji_symbols";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0070:
        r2 = 26;
        goto L_0x022a;
    L_0x0074:
        r4 = "friendmojis";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x007c:
        r2 = 27;
        goto L_0x022a;
    L_0x0080:
        r4 = "new_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0088:
        r2 = 23;
        goto L_0x022a;
    L_0x008c:
        r4 = "add_source_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0094:
        r2 = 19;
        goto L_0x022a;
    L_0x0098:
        r4 = "is_popular";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00a0:
        r2 = 38;
        goto L_0x022a;
    L_0x00a4:
        r4 = "birthday";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00ac:
        r2 = 4;
        goto L_0x022a;
    L_0x00af:
        r4 = "bitmoji_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00b7:
        r2 = 33;
        goto L_0x022a;
    L_0x00bb:
        r4 = "ignored_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00c3:
        r2 = 16;
        goto L_0x022a;
    L_0x00c7:
        r4 = "bitmoji_snapcode_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00cf:
        r2 = 36;
        goto L_0x022a;
    L_0x00d3:
        r4 = "dont_decay_thumbnail";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00db:
        r2 = 24;
        goto L_0x022a;
    L_0x00df:
        r4 = "study_settings";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00e7:
        r2 = 37;
        goto L_0x022a;
    L_0x00eb:
        r4 = "venue";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00f3:
        r2 = 25;
        goto L_0x022a;
    L_0x00f7:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x00ff:
        r2 = 2;
        goto L_0x022a;
    L_0x0102:
        r4 = "name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x010a:
        r2 = 0;
        goto L_0x022a;
    L_0x010d:
        r4 = "ts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0115:
        r2 = 5;
        goto L_0x022a;
    L_0x0118:
        r4 = "auto_added";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0120:
        r2 = 22;
        goto L_0x022a;
    L_0x0124:
        r4 = "user_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x012c:
        r2 = 1;
        goto L_0x022a;
    L_0x012f:
        r4 = "pending_snaps_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0137:
        r2 = 10;
        goto L_0x022a;
    L_0x013b:
        r4 = "potential_high_quality_score";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0143:
        r2 = 31;
        goto L_0x022a;
    L_0x0147:
        r4 = "needs_love";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x014f:
        r2 = 21;
        goto L_0x022a;
    L_0x0153:
        r4 = "snap_pro_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x015b:
        r2 = 42;
        goto L_0x022a;
    L_0x015f:
        r4 = "display_username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0167:
        r2 = 41;
        goto L_0x022a;
    L_0x016b:
        r4 = "snap_streak_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0173:
        r2 = 28;
        goto L_0x022a;
    L_0x0177:
        r4 = "fidelius_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x017f:
        r2 = 35;
        goto L_0x022a;
    L_0x0183:
        r4 = "reverse_ts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x018b:
        r2 = 6;
        goto L_0x022a;
    L_0x018e:
        r4 = "expiration";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0196:
        r2 = 11;
        goto L_0x022a;
    L_0x019a:
        r4 = "hidden_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01a2:
        r2 = 17;
        goto L_0x022a;
    L_0x01a6:
        r4 = "friendmoji_string";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01ae:
        r2 = 20;
        goto L_0x022a;
    L_0x01b1:
        r4 = "direction";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01b9:
        r2 = 7;
        goto L_0x022a;
    L_0x01bb:
        r4 = "snap_streak_expiration";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01c3:
        r2 = 29;
        goto L_0x022a;
    L_0x01c6:
        r4 = "can_be_shared_by_friends";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01ce:
        r2 = 34;
        goto L_0x022a;
    L_0x01d1:
        r4 = "has_custom_description";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01d9:
        r2 = 13;
        goto L_0x022a;
    L_0x01dc:
        r4 = "is_shared_story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01e4:
        r2 = 12;
        goto L_0x022a;
    L_0x01e7:
        r4 = "is_cognac_notification_muted";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01ef:
        r2 = 43;
        goto L_0x022a;
    L_0x01f2:
        r4 = "can_see_custom_stories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x01fa:
        r2 = 9;
        goto L_0x022a;
    L_0x01fd:
        r4 = "story_privacy";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0205:
        r2 = 8;
        goto L_0x022a;
    L_0x0208:
        r4 = "pending_chats_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0210:
        r2 = 32;
        goto L_0x022a;
    L_0x0213:
        r4 = "shared_story_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x021b:
        r2 = 14;
        goto L_0x022a;
    L_0x021e:
        r4 = "bitmoji_avatar_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0229;
    L_0x0226:
        r2 = 30;
        goto L_0x022a;
    L_0x0229:
        r2 = -1;
    L_0x022a:
        switch(r2) {
            case 0: goto L_0x07a1;
            case 1: goto L_0x0783;
            case 2: goto L_0x076e;
            case 3: goto L_0x0750;
            case 4: goto L_0x0732;
            case 5: goto L_0x071c;
            case 6: goto L_0x0706;
            case 7: goto L_0x06e7;
            case 8: goto L_0x06c8;
            case 9: goto L_0x06a5;
            case 10: goto L_0x068f;
            case 11: goto L_0x0679;
            case 12: goto L_0x0656;
            case 13: goto L_0x0633;
            case 14: goto L_0x0614;
            case 15: goto L_0x05f1;
            case 16: goto L_0x05ce;
            case 17: goto L_0x05ab;
            case 18: goto L_0x058c;
            case 19: goto L_0x056d;
            case 20: goto L_0x054e;
            case 21: goto L_0x052b;
            case 22: goto L_0x0508;
            case 23: goto L_0x04e5;
            case 24: goto L_0x04c2;
            case 25: goto L_0x04a3;
            case 26: goto L_0x046b;
            case 27: goto L_0x042c;
            case 28: goto L_0x0416;
            case 29: goto L_0x0400;
            case 30: goto L_0x03e1;
            case 31: goto L_0x03cb;
            case 32: goto L_0x03b5;
            case 33: goto L_0x0396;
            case 34: goto L_0x0373;
            case 35: goto L_0x0357;
            case 36: goto L_0x0338;
            case 37: goto L_0x02fc;
            case 38: goto L_0x02d9;
            case 39: goto L_0x02b6;
            case 40: goto L_0x0293;
            case 41: goto L_0x0274;
            case 42: goto L_0x0255;
            case 43: goto L_0x0232;
            default: goto L_0x022d;
        };
    L_0x022d:
        r7.skipValue();
        goto L_0x0019;
    L_0x0232:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x023c;
    L_0x023a:
        goto L_0x07a9;
    L_0x023c:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0249;
    L_0x0240:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x024d;
    L_0x0249:
        r2 = r7.nextBoolean();
    L_0x024d:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.R = r2;
        goto L_0x0019;
    L_0x0255:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x025f;
    L_0x025d:
        goto L_0x07a9;
    L_0x025f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x026c;
    L_0x0263:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0270;
    L_0x026c:
        r2 = r7.nextString();
    L_0x0270:
        r0.Q = r2;
        goto L_0x0019;
    L_0x0274:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x027e;
    L_0x027c:
        goto L_0x07a9;
    L_0x027e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x028b;
    L_0x0282:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x028f;
    L_0x028b:
        r2 = r7.nextString();
    L_0x028f:
        r0.P = r2;
        goto L_0x0019;
    L_0x0293:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x029d;
    L_0x029b:
        goto L_0x07a9;
    L_0x029d:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x02aa;
    L_0x02a1:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x02ae;
    L_0x02aa:
        r2 = r7.nextBoolean();
    L_0x02ae:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.O = r2;
        goto L_0x0019;
    L_0x02b6:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02c0;
    L_0x02be:
        goto L_0x07a9;
    L_0x02c0:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x02cd;
    L_0x02c4:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x02d1;
    L_0x02cd:
        r2 = r7.nextBoolean();
    L_0x02d1:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.N = r2;
        goto L_0x0019;
    L_0x02d9:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02e3;
    L_0x02e1:
        goto L_0x07a9;
    L_0x02e3:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x02f0;
    L_0x02e7:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x02f4;
    L_0x02f0:
        r2 = r7.nextBoolean();
    L_0x02f4:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.M = r2;
        goto L_0x0019;
    L_0x02fc:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0306;
    L_0x0304:
        goto L_0x07a9;
    L_0x0306:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x030e:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x0331;
    L_0x0314:
        r3 = r7.nextName();
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x0329;
    L_0x0320:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x032d;
    L_0x0329:
        r4 = r7.nextString();
    L_0x032d:
        r2.put(r3, r4);
        goto L_0x030e;
    L_0x0331:
        r7.endObject();
        r0.L = r2;
        goto L_0x0019;
    L_0x0338:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0342;
    L_0x0340:
        goto L_0x07a9;
    L_0x0342:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x034f;
    L_0x0346:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0353;
    L_0x034f:
        r2 = r7.nextString();
    L_0x0353:
        r0.K = r2;
        goto L_0x0019;
    L_0x0357:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0361;
    L_0x035f:
        goto L_0x07a9;
    L_0x0361:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahql) r2;
        r0.J = r2;
        goto L_0x0019;
    L_0x0373:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x037d;
    L_0x037b:
        goto L_0x07a9;
    L_0x037d:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x038a;
    L_0x0381:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x038e;
    L_0x038a:
        r2 = r7.nextBoolean();
    L_0x038e:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.I = r2;
        goto L_0x0019;
    L_0x0396:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03a0;
    L_0x039e:
        goto L_0x07a9;
    L_0x03a0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x03ad;
    L_0x03a4:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x03b1;
    L_0x03ad:
        r2 = r7.nextString();
    L_0x03b1:
        r0.H = r2;
        goto L_0x0019;
    L_0x03b5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03bf;
    L_0x03bd:
        goto L_0x07a9;
    L_0x03bf:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.G = r2;
        goto L_0x0019;
    L_0x03cb:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03d5;
    L_0x03d3:
        goto L_0x07a9;
    L_0x03d5:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.F = r2;
        goto L_0x0019;
    L_0x03e1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03eb;
    L_0x03e9:
        goto L_0x07a9;
    L_0x03eb:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x03f8;
    L_0x03ef:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x03fc;
    L_0x03f8:
        r2 = r7.nextString();
    L_0x03fc:
        r0.E = r2;
        goto L_0x0019;
    L_0x0400:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x040a;
    L_0x0408:
        goto L_0x07a9;
    L_0x040a:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.D = r2;
        goto L_0x0019;
    L_0x0416:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0420;
    L_0x041e:
        goto L_0x07a9;
    L_0x0420:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.C = r2;
        goto L_0x0019;
    L_0x042c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0436;
    L_0x0434:
        goto L_0x07a9;
    L_0x0436:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x043a:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x044a:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0464;
    L_0x0450:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x045c;
    L_0x0458:
        r7.nextNull();
        goto L_0x044a;
    L_0x045c:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x044a;
    L_0x0464:
        r7.endArray();
        r0.B = r2;
        goto L_0x0019;
    L_0x046b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0475;
    L_0x0473:
        goto L_0x07a9;
    L_0x0475:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0479:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0481:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x049c;
    L_0x0487:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0494;
    L_0x048b:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0498;
    L_0x0494:
        r4 = r7.nextString();
    L_0x0498:
        r3.add(r4);
        goto L_0x0481;
    L_0x049c:
        r7.endArray();
        r0.A = r3;
        goto L_0x0019;
    L_0x04a3:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04ad;
    L_0x04ab:
        goto L_0x07a9;
    L_0x04ad:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x04ba;
    L_0x04b1:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x04be;
    L_0x04ba:
        r2 = r7.nextString();
    L_0x04be:
        r0.z = r2;
        goto L_0x0019;
    L_0x04c2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04cc;
    L_0x04ca:
        goto L_0x07a9;
    L_0x04cc:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x04d9;
    L_0x04d0:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x04dd;
    L_0x04d9:
        r2 = r7.nextBoolean();
    L_0x04dd:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.y = r2;
        goto L_0x0019;
    L_0x04e5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04ef;
    L_0x04ed:
        goto L_0x07a9;
    L_0x04ef:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x04fc;
    L_0x04f3:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0500;
    L_0x04fc:
        r2 = r7.nextBoolean();
    L_0x0500:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.x = r2;
        goto L_0x0019;
    L_0x0508:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0512;
    L_0x0510:
        goto L_0x07a9;
    L_0x0512:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x051f;
    L_0x0516:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0523;
    L_0x051f:
        r2 = r7.nextBoolean();
    L_0x0523:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.w = r2;
        goto L_0x0019;
    L_0x052b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0535;
    L_0x0533:
        goto L_0x07a9;
    L_0x0535:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0542;
    L_0x0539:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0546;
    L_0x0542:
        r2 = r7.nextBoolean();
    L_0x0546:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.v = r2;
        goto L_0x0019;
    L_0x054e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0558;
    L_0x0556:
        goto L_0x07a9;
    L_0x0558:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0565;
    L_0x055c:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0569;
    L_0x0565:
        r2 = r7.nextString();
    L_0x0569:
        r0.u = r2;
        goto L_0x0019;
    L_0x056d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0577;
    L_0x0575:
        goto L_0x07a9;
    L_0x0577:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0584;
    L_0x057b:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0588;
    L_0x0584:
        r2 = r7.nextString();
    L_0x0588:
        r0.t = r2;
        goto L_0x0019;
    L_0x058c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0596;
    L_0x0594:
        goto L_0x07a9;
    L_0x0596:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05a3;
    L_0x059a:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05a7;
    L_0x05a3:
        r2 = r7.nextString();
    L_0x05a7:
        r0.s = r2;
        goto L_0x0019;
    L_0x05ab:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05b5;
    L_0x05b3:
        goto L_0x07a9;
    L_0x05b5:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x05c2;
    L_0x05b9:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x05c6;
    L_0x05c2:
        r2 = r7.nextBoolean();
    L_0x05c6:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.r = r2;
        goto L_0x0019;
    L_0x05ce:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05d8;
    L_0x05d6:
        goto L_0x07a9;
    L_0x05d8:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x05e5;
    L_0x05dc:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x05e9;
    L_0x05e5:
        r2 = r7.nextBoolean();
    L_0x05e9:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.q = r2;
        goto L_0x0019;
    L_0x05f1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05fb;
    L_0x05f9:
        goto L_0x07a9;
    L_0x05fb:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0608;
    L_0x05ff:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x060c;
    L_0x0608:
        r2 = r7.nextBoolean();
    L_0x060c:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.p = r2;
        goto L_0x0019;
    L_0x0614:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x061e;
    L_0x061c:
        goto L_0x07a9;
    L_0x061e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x062b;
    L_0x0622:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x062f;
    L_0x062b:
        r2 = r7.nextString();
    L_0x062f:
        r0.o = r2;
        goto L_0x0019;
    L_0x0633:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x063d;
    L_0x063b:
        goto L_0x07a9;
    L_0x063d:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x064a;
    L_0x0641:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x064e;
    L_0x064a:
        r2 = r7.nextBoolean();
    L_0x064e:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.n = r2;
        goto L_0x0019;
    L_0x0656:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0660;
    L_0x065e:
        goto L_0x07a9;
    L_0x0660:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x066d;
    L_0x0664:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0671;
    L_0x066d:
        r2 = r7.nextBoolean();
    L_0x0671:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x0679:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0683;
    L_0x0681:
        goto L_0x07a9;
    L_0x0683:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x068f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0699;
    L_0x0697:
        goto L_0x07a9;
    L_0x0699:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.k = r2;
        goto L_0x0019;
    L_0x06a5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06af;
    L_0x06ad:
        goto L_0x07a9;
    L_0x06af:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x06bc;
    L_0x06b3:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x06c0;
    L_0x06bc:
        r2 = r7.nextBoolean();
    L_0x06c0:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x06c8:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06d2;
    L_0x06d0:
        goto L_0x07a9;
    L_0x06d2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x06df;
    L_0x06d6:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x06e3;
    L_0x06df:
        r2 = r7.nextString();
    L_0x06e3:
        r0.i = r2;
        goto L_0x0019;
    L_0x06e7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06f1;
    L_0x06ef:
        goto L_0x07a9;
    L_0x06f1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x06fe;
    L_0x06f5:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0702;
    L_0x06fe:
        r2 = r7.nextString();
    L_0x0702:
        r0.h = r2;
        goto L_0x0019;
    L_0x0706:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0710;
    L_0x070e:
        goto L_0x07a9;
    L_0x0710:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x071c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0726;
    L_0x0724:
        goto L_0x07a9;
    L_0x0726:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0732:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x073b;
    L_0x073a:
        goto L_0x07a9;
    L_0x073b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0748;
    L_0x073f:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x074c;
    L_0x0748:
        r2 = r7.nextString();
    L_0x074c:
        r0.e = r2;
        goto L_0x0019;
    L_0x0750:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0759;
    L_0x0758:
        goto L_0x07a9;
    L_0x0759:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0766;
    L_0x075d:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x076a;
    L_0x0766:
        r2 = r7.nextString();
    L_0x076a:
        r0.d = r2;
        goto L_0x0019;
    L_0x076e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0777;
    L_0x0776:
        goto L_0x07a9;
    L_0x0777:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x0783:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x078c;
    L_0x078b:
        goto L_0x07a9;
    L_0x078c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0799;
    L_0x0790:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x079d;
    L_0x0799:
        r2 = r7.nextString();
    L_0x079d:
        r0.b = r2;
        goto L_0x0019;
    L_0x07a1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07ae;
    L_0x07a9:
        r7.nextNull();
        goto L_0x0019;
    L_0x07ae:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x07bb;
    L_0x07b2:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x07bf;
    L_0x07bb:
        r2 = r7.nextString();
    L_0x07bf:
        r0.a = r2;
        goto L_0x0019;
    L_0x07c3:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aelg.read(com.google.gson.stream.JsonReader):aelf");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aelf aelf) {
        if (aelf == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aelf.a != null) {
            jsonWriter.name("name");
            jsonWriter.value(aelf.a);
        }
        if (aelf.b != null) {
            jsonWriter.name("user_id");
            jsonWriter.value(aelf.b);
        }
        if (aelf.c != null) {
            jsonWriter.name("type");
            jsonWriter.value(aelf.c);
        }
        if (aelf.d != null) {
            jsonWriter.name("display");
            jsonWriter.value(aelf.d);
        }
        if (aelf.e != null) {
            jsonWriter.name(FriendModel.BIRTHDAY);
            jsonWriter.value(aelf.e);
        }
        if (aelf.f != null) {
            jsonWriter.name("ts");
            jsonWriter.value(aelf.f);
        }
        if (aelf.g != null) {
            jsonWriter.name("reverse_ts");
            jsonWriter.value(aelf.g);
        }
        if (aelf.h != null) {
            jsonWriter.name("direction");
            jsonWriter.value(aelf.h);
        }
        if (aelf.i != null) {
            jsonWriter.name("story_privacy");
            jsonWriter.value(aelf.i);
        }
        if (aelf.j != null) {
            jsonWriter.name("can_see_custom_stories");
            jsonWriter.value(aelf.j.booleanValue());
        }
        if (aelf.k != null) {
            jsonWriter.name("pending_snaps_count");
            jsonWriter.value(aelf.k);
        }
        if (aelf.l != null) {
            jsonWriter.name("expiration");
            jsonWriter.value(aelf.l);
        }
        if (aelf.m != null) {
            jsonWriter.name("is_shared_story");
            jsonWriter.value(aelf.m.booleanValue());
        }
        if (aelf.n != null) {
            jsonWriter.name("has_custom_description");
            jsonWriter.value(aelf.n.booleanValue());
        }
        if (aelf.o != null) {
            jsonWriter.name("shared_story_id");
            jsonWriter.value(aelf.o);
        }
        if (aelf.p != null) {
            jsonWriter.name("local_story");
            jsonWriter.value(aelf.p.booleanValue());
        }
        if (aelf.q != null) {
            jsonWriter.name("ignored_link");
            jsonWriter.value(aelf.q.booleanValue());
        }
        if (aelf.r != null) {
            jsonWriter.name("hidden_link");
            jsonWriter.value(aelf.r.booleanValue());
        }
        if (aelf.s != null) {
            jsonWriter.name("add_source");
            jsonWriter.value(aelf.s);
        }
        if (aelf.t != null) {
            jsonWriter.name("add_source_type");
            jsonWriter.value(aelf.t);
        }
        if (aelf.u != null) {
            jsonWriter.name("friendmoji_string");
            jsonWriter.value(aelf.u);
        }
        if (aelf.v != null) {
            jsonWriter.name("needs_love");
            jsonWriter.value(aelf.v.booleanValue());
        }
        if (aelf.w != null) {
            jsonWriter.name("auto_added");
            jsonWriter.value(aelf.w.booleanValue());
        }
        if (aelf.x != null) {
            jsonWriter.name("new_link");
            jsonWriter.value(aelf.x.booleanValue());
        }
        if (aelf.y != null) {
            jsonWriter.name("dont_decay_thumbnail");
            jsonWriter.value(aelf.y.booleanValue());
        }
        if (aelf.z != null) {
            jsonWriter.name("venue");
            jsonWriter.value(aelf.z);
        }
        if (aelf.A != null) {
            jsonWriter.name("friendmoji_symbols");
            jsonWriter.beginArray();
            for (String value : aelf.A) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aelf.B != null) {
            jsonWriter.name(FriendModel.FRIENDMOJIS);
            TypeAdapter typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aemr write : aelf.B) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aelf.C != null) {
            jsonWriter.name("snap_streak_count");
            jsonWriter.value(aelf.C);
        }
        if (aelf.D != null) {
            jsonWriter.name("snap_streak_expiration");
            jsonWriter.value(aelf.D);
        }
        if (aelf.E != null) {
            jsonWriter.name("bitmoji_avatar_id");
            jsonWriter.value(aelf.E);
        }
        if (aelf.F != null) {
            jsonWriter.name("potential_high_quality_score");
            jsonWriter.value(aelf.F);
        }
        if (aelf.G != null) {
            jsonWriter.name("pending_chats_count");
            jsonWriter.value(aelf.G);
        }
        if (aelf.H != null) {
            jsonWriter.name("bitmoji_selfie_id");
            jsonWriter.value(aelf.H);
        }
        if (aelf.I != null) {
            jsonWriter.name("can_be_shared_by_friends");
            jsonWriter.value(aelf.I.booleanValue());
        }
        if (aelf.J != null) {
            jsonWriter.name("fidelius_info");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aelf.J);
        }
        if (aelf.K != null) {
            jsonWriter.name("bitmoji_snapcode_selfie_id");
            jsonWriter.value(aelf.K);
        }
        if (aelf.L != null) {
            jsonWriter.name("study_settings");
            jsonWriter.beginObject();
            for (Entry entry : aelf.L.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aelf.M != null) {
            jsonWriter.name("is_popular");
            jsonWriter.value(aelf.M.booleanValue());
        }
        if (aelf.N != null) {
            jsonWriter.name("is_story_muted");
            jsonWriter.value(aelf.N.booleanValue());
        }
        if (aelf.O != null) {
            jsonWriter.name("is_incoming_friend_request_viewed");
            jsonWriter.value(aelf.O.booleanValue());
        }
        if (aelf.P != null) {
            jsonWriter.name("display_username");
            jsonWriter.value(aelf.P);
        }
        if (aelf.Q != null) {
            jsonWriter.name("snap_pro_id");
            jsonWriter.value(aelf.Q);
        }
        if (aelf.R != null) {
            jsonWriter.name("is_cognac_notification_muted");
            jsonWriter.value(aelf.R.booleanValue());
        }
        jsonWriter.endObject();
    }
}
