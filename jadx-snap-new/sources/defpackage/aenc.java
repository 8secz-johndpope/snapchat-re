package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.snap.core.db.record.MessagingSnapModel;
import com.snap.core.db.record.SnapModel;
import java.util.Map.Entry;

/* renamed from: aenc */
public final class aenc extends TypeAdapter<aenb> {
    private final Gson a;
    private final Supplier<TypeAdapter<ahqf>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahqf.class)));
    private final Supplier<TypeAdapter<aerv>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aerv.class)));
    private final Supplier<TypeAdapter<aesg>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aesg.class)));
    private final Supplier<TypeAdapter<aeyn>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeyn.class)));

    public aenc(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:459:0x089b, code skipped:
            r8.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aenb read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aenb;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x08b5;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2062325054: goto L_0x028a;
            case -2026158838: goto L_0x027f;
            case -1964251066: goto L_0x0274;
            case -1811795673: goto L_0x0269;
            case -1685751658: goto L_0x025f;
            case -1684694938: goto L_0x0254;
            case -1618876223: goto L_0x024a;
            case -1592582058: goto L_0x023f;
            case -1539653745: goto L_0x0234;
            case -1467162620: goto L_0x0229;
            case -1448935506: goto L_0x021e;
            case -1439500848: goto L_0x0213;
            case -1361702099: goto L_0x0207;
            case -1284043749: goto L_0x01fb;
            case -1112643122: goto L_0x01ef;
            case -1057492611: goto L_0x01e3;
            case -958833316: goto L_0x01d7;
            case -954559247: goto L_0x01cb;
            case -881372350: goto L_0x01bf;
            case -701793714: goto L_0x01b3;
            case -682587753: goto L_0x01a7;
            case -646079090: goto L_0x019b;
            case -639101956: goto L_0x018f;
            case -485344353: goto L_0x0183;
            case -430311738: goto L_0x0177;
            case -212063813: goto L_0x016b;
            case -69168774: goto L_0x0160;
            case -66725129: goto L_0x0154;
            case 99: goto L_0x0148;
            case 109: goto L_0x013c;
            case 116: goto L_0x0131;
            case 3355: goto L_0x0125;
            case 3646: goto L_0x0119;
            case 3675: goto L_0x010e;
            case 3681: goto L_0x0102;
            case 3711: goto L_0x00f6;
            case 111343: goto L_0x00ea;
            case 114226: goto L_0x00de;
            case 3043959: goto L_0x00d2;
            case 96796236: goto L_0x00c6;
            case 110364485: goto L_0x00bb;
            case 317930500: goto L_0x00af;
            case 527845590: goto L_0x00a3;
            case 551953657: goto L_0x0098;
            case 551954535: goto L_0x008d;
            case 731478480: goto L_0x0081;
            case 771759896: goto L_0x0075;
            case 811092853: goto L_0x0069;
            case 915486278: goto L_0x005d;
            case 1903398155: goto L_0x0051;
            case 1905956709: goto L_0x0045;
            case 1908608852: goto L_0x0039;
            case 1982549926: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0295;
    L_0x002d:
        r4 = "seq_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0035:
        r2 = 51;
        goto L_0x0296;
    L_0x0039:
        r4 = "fi_recipient_out_gamma";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0041:
        r2 = 29;
        goto L_0x0296;
    L_0x0045:
        r4 = "fi_recipient_out_delta";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x004d:
        r2 = 25;
        goto L_0x0296;
    L_0x0051:
        r4 = "fi_recipient_out_alpha";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0059:
        r2 = 24;
        goto L_0x0296;
    L_0x005d:
        r4 = "fi_snap_iv";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0065:
        r2 = 31;
        goto L_0x0296;
    L_0x0069:
        r4 = "screen_capture_recording_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0071:
        r2 = 37;
        goto L_0x0296;
    L_0x0075:
        r4 = "broadcast_action_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x007d:
        r2 = 9;
        goto L_0x0296;
    L_0x0081:
        r4 = "fi_snap_release_ts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0089:
        r2 = 35;
        goto L_0x0296;
    L_0x008d:
        r4 = "cap_pos";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0095:
        r2 = 4;
        goto L_0x0296;
    L_0x0098:
        r4 = "cap_ori";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00a0:
        r2 = 5;
        goto L_0x0296;
    L_0x00a3:
        r4 = "screen_capture_shot_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00ab:
        r2 = 36;
        goto L_0x0296;
    L_0x00af:
        r4 = "reply_medias";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00b7:
        r2 = 50;
        goto L_0x0296;
    L_0x00bb:
        r4 = "timer";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00c3:
        r2 = 2;
        goto L_0x0296;
    L_0x00c6:
        r4 = "es_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00ce:
        r2 = 18;
        goto L_0x0296;
    L_0x00d2:
        r4 = "c_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00da:
        r2 = 14;
        goto L_0x0296;
    L_0x00de:
        r4 = "sts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00e6:
        r2 = 44;
        goto L_0x0296;
    L_0x00ea:
        r4 = "pts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00f2:
        r2 = 46;
        goto L_0x0296;
    L_0x00f6:
        r4 = "ts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x00fe:
        r2 = 43;
        goto L_0x0296;
    L_0x0102:
        r4 = "st";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x010a:
        r2 = 41;
        goto L_0x0296;
    L_0x010e:
        r4 = "sn";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0116:
        r2 = 0;
        goto L_0x0296;
    L_0x0119:
        r4 = "rp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0121:
        r2 = 13;
        goto L_0x0296;
    L_0x0125:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x012d:
        r2 = 40;
        goto L_0x0296;
    L_0x0131:
        r4 = "t";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0139:
        r2 = 1;
        goto L_0x0296;
    L_0x013c:
        r4 = "m";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0144:
        r2 = 42;
        goto L_0x0296;
    L_0x0148:
        r4 = "c";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0150:
        r2 = 17;
        goto L_0x0296;
    L_0x0154:
        r4 = "uv_tags";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x015c:
        r2 = 20;
        goto L_0x0296;
    L_0x0160:
        r4 = "cap_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0168:
        r2 = 3;
        goto L_0x0296;
    L_0x016b:
        r4 = "fi_retried";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0173:
        r2 = 38;
        goto L_0x0296;
    L_0x0177:
        r4 = "replayed";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x017f:
        r2 = 15;
        goto L_0x0296;
    L_0x0183:
        r4 = "fi_sender_out_alpha";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x018b:
        r2 = 23;
        goto L_0x0296;
    L_0x018f:
        r4 = "view_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0197:
        r2 = 52;
        goto L_0x0296;
    L_0x019b:
        r4 = "fidelius_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01a3:
        r2 = 28;
        goto L_0x0296;
    L_0x01a7:
        r4 = "pending";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01af:
        r2 = 16;
        goto L_0x0296;
    L_0x01b3:
        r4 = "zipped";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01bb:
        r2 = 45;
        goto L_0x0296;
    L_0x01bf:
        r4 = "filter_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01c7:
        r2 = 12;
        goto L_0x0296;
    L_0x01cb:
        r4 = "broadcast_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01d3:
        r2 = 8;
        goto L_0x0296;
    L_0x01d7:
        r4 = "fi_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01df:
        r2 = 22;
        goto L_0x0296;
    L_0x01e3:
        r4 = "fi_prev_sender_gamma_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01eb:
        r2 = 33;
        goto L_0x0296;
    L_0x01ef:
        r4 = "direct_download_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x01f7:
        r2 = 39;
        goto L_0x0296;
    L_0x01fb:
        r4 = "fi_send_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0203:
        r2 = 27;
        goto L_0x0296;
    L_0x0207:
        r4 = "fi_prev_sender_gamma";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x020f:
        r2 = 32;
        goto L_0x0296;
    L_0x0213:
        r4 = "orientation";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x021b:
        r2 = 47;
        goto L_0x0296;
    L_0x021e:
        r4 = "fi_recipient_out_delta_check";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0226:
        r2 = 26;
        goto L_0x0296;
    L_0x0229:
        r4 = "snap_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0231:
        r2 = 48;
        goto L_0x0296;
    L_0x0234:
        r4 = "fi_sender_out_beta";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x023c:
        r2 = 34;
        goto L_0x0296;
    L_0x023f:
        r4 = "broadcast_secondary_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0247:
        r2 = 10;
        goto L_0x0296;
    L_0x024a:
        r4 = "broadcast";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0252:
        r2 = 6;
        goto L_0x0296;
    L_0x0254:
        r4 = "fi_snap_key";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x025c:
        r2 = 30;
        goto L_0x0296;
    L_0x025f:
        r4 = "broadcast_media_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0267:
        r2 = 7;
        goto L_0x0296;
    L_0x0269:
        r4 = "eg_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0271:
        r2 = 19;
        goto L_0x0296;
    L_0x0274:
        r4 = "broadcast_hide_timer";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x027c:
        r2 = 11;
        goto L_0x0296;
    L_0x027f:
        r4 = "fi_needs_retry";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0287:
        r2 = 21;
        goto L_0x0296;
    L_0x028a:
        r4 = "send_start_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0295;
    L_0x0292:
        r2 = 49;
        goto L_0x0296;
    L_0x0295:
        r2 = -1;
    L_0x0296:
        switch(r2) {
            case 0: goto L_0x0893;
            case 1: goto L_0x087e;
            case 2: goto L_0x0869;
            case 3: goto L_0x084b;
            case 4: goto L_0x0836;
            case 5: goto L_0x0821;
            case 6: goto L_0x080b;
            case 7: goto L_0x07ec;
            case 8: goto L_0x07cd;
            case 9: goto L_0x07ae;
            case 10: goto L_0x078f;
            case 11: goto L_0x076c;
            case 12: goto L_0x074d;
            case 13: goto L_0x072e;
            case 14: goto L_0x070f;
            case 15: goto L_0x06ec;
            case 16: goto L_0x06c9;
            case 17: goto L_0x06b3;
            case 18: goto L_0x0694;
            case 19: goto L_0x0675;
            case 20: goto L_0x063d;
            case 21: goto L_0x061a;
            case 22: goto L_0x0604;
            case 23: goto L_0x05e5;
            case 24: goto L_0x05c6;
            case 25: goto L_0x05a7;
            case 26: goto L_0x0588;
            case 27: goto L_0x0572;
            case 28: goto L_0x0533;
            case 29: goto L_0x0514;
            case 30: goto L_0x04f5;
            case 31: goto L_0x04d6;
            case 32: goto L_0x04b7;
            case 33: goto L_0x04a1;
            case 34: goto L_0x0482;
            case 35: goto L_0x046c;
            case 36: goto L_0x0456;
            case 37: goto L_0x0440;
            case 38: goto L_0x041d;
            case 39: goto L_0x0401;
            case 40: goto L_0x03e2;
            case 41: goto L_0x03cc;
            case 42: goto L_0x03b6;
            case 43: goto L_0x03a0;
            case 44: goto L_0x038a;
            case 45: goto L_0x0367;
            case 46: goto L_0x0351;
            case 47: goto L_0x033b;
            case 48: goto L_0x031f;
            case 49: goto L_0x0309;
            case 50: goto L_0x02ca;
            case 51: goto L_0x02b4;
            case 52: goto L_0x029e;
            default: goto L_0x0299;
        };
    L_0x0299:
        r8.skipValue();
        goto L_0x0019;
    L_0x029e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02a8;
    L_0x02a6:
        goto L_0x089b;
    L_0x02a8:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.aa = r2;
        goto L_0x0019;
    L_0x02b4:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02be;
    L_0x02bc:
        goto L_0x089b;
    L_0x02be:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.Z = r2;
        goto L_0x0019;
    L_0x02ca:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02d4;
    L_0x02d2:
        goto L_0x089b;
    L_0x02d4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x02d8:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x02e8:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0302;
    L_0x02ee:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x02fa;
    L_0x02f6:
        r8.nextNull();
        goto L_0x02e8;
    L_0x02fa:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x02e8;
    L_0x0302:
        r8.endArray();
        r0.Y = r2;
        goto L_0x0019;
    L_0x0309:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0313;
    L_0x0311:
        goto L_0x089b;
    L_0x0313:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.X = r2;
        goto L_0x0019;
    L_0x031f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0329;
    L_0x0327:
        goto L_0x089b;
    L_0x0329:
        r2 = r7.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aeyn) r2;
        r0.W = r2;
        goto L_0x0019;
    L_0x033b:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0345;
    L_0x0343:
        goto L_0x089b;
    L_0x0345:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.V = r2;
        goto L_0x0019;
    L_0x0351:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x035b;
    L_0x0359:
        goto L_0x089b;
    L_0x035b:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.U = r2;
        goto L_0x0019;
    L_0x0367:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0371;
    L_0x036f:
        goto L_0x089b;
    L_0x0371:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x037e;
    L_0x0375:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0382;
    L_0x037e:
        r2 = r8.nextBoolean();
    L_0x0382:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.T = r2;
        goto L_0x0019;
    L_0x038a:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0394;
    L_0x0392:
        goto L_0x089b;
    L_0x0394:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.S = r2;
        goto L_0x0019;
    L_0x03a0:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03aa;
    L_0x03a8:
        goto L_0x089b;
    L_0x03aa:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.R = r2;
        goto L_0x0019;
    L_0x03b6:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03c0;
    L_0x03be:
        goto L_0x089b;
    L_0x03c0:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.Q = r2;
        goto L_0x0019;
    L_0x03cc:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03d6;
    L_0x03d4:
        goto L_0x089b;
    L_0x03d6:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.P = r2;
        goto L_0x0019;
    L_0x03e2:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03ec;
    L_0x03ea:
        goto L_0x089b;
    L_0x03ec:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x03f9;
    L_0x03f0:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x03fd;
    L_0x03f9:
        r2 = r8.nextString();
    L_0x03fd:
        r0.O = r2;
        goto L_0x0019;
    L_0x0401:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x040b;
    L_0x0409:
        goto L_0x089b;
    L_0x040b:
        r2 = r7.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aesg) r2;
        r0.N = r2;
        goto L_0x0019;
    L_0x041d:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0427;
    L_0x0425:
        goto L_0x089b;
    L_0x0427:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0434;
    L_0x042b:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0438;
    L_0x0434:
        r2 = r8.nextBoolean();
    L_0x0438:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.M = r2;
        goto L_0x0019;
    L_0x0440:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x044a;
    L_0x0448:
        goto L_0x089b;
    L_0x044a:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.L = r2;
        goto L_0x0019;
    L_0x0456:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0460;
    L_0x045e:
        goto L_0x089b;
    L_0x0460:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.K = r2;
        goto L_0x0019;
    L_0x046c:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0476;
    L_0x0474:
        goto L_0x089b;
    L_0x0476:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.J = r2;
        goto L_0x0019;
    L_0x0482:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x048c;
    L_0x048a:
        goto L_0x089b;
    L_0x048c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0499;
    L_0x0490:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x049d;
    L_0x0499:
        r2 = r8.nextString();
    L_0x049d:
        r0.I = r2;
        goto L_0x0019;
    L_0x04a1:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04ab;
    L_0x04a9:
        goto L_0x089b;
    L_0x04ab:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.H = r2;
        goto L_0x0019;
    L_0x04b7:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04c1;
    L_0x04bf:
        goto L_0x089b;
    L_0x04c1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x04ce;
    L_0x04c5:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x04d2;
    L_0x04ce:
        r2 = r8.nextString();
    L_0x04d2:
        r0.G = r2;
        goto L_0x0019;
    L_0x04d6:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04e0;
    L_0x04de:
        goto L_0x089b;
    L_0x04e0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x04ed;
    L_0x04e4:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x04f1;
    L_0x04ed:
        r2 = r8.nextString();
    L_0x04f1:
        r0.F = r2;
        goto L_0x0019;
    L_0x04f5:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04ff;
    L_0x04fd:
        goto L_0x089b;
    L_0x04ff:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x050c;
    L_0x0503:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0510;
    L_0x050c:
        r2 = r8.nextString();
    L_0x0510:
        r0.E = r2;
        goto L_0x0019;
    L_0x0514:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x051e;
    L_0x051c:
        goto L_0x089b;
    L_0x051e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x052b;
    L_0x0522:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x052f;
    L_0x052b:
        r2 = r8.nextString();
    L_0x052f:
        r0.D = r2;
        goto L_0x0019;
    L_0x0533:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x053d;
    L_0x053b:
        goto L_0x089b;
    L_0x053d:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x054d:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x056b;
    L_0x0553:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x0563;
    L_0x055f:
        r8.nextNull();
        goto L_0x054d;
    L_0x0563:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x054d;
    L_0x056b:
        r8.endObject();
        r0.C = r2;
        goto L_0x0019;
    L_0x0572:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x057c;
    L_0x057a:
        goto L_0x089b;
    L_0x057c:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.B = r2;
        goto L_0x0019;
    L_0x0588:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0592;
    L_0x0590:
        goto L_0x089b;
    L_0x0592:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x059f;
    L_0x0596:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05a3;
    L_0x059f:
        r2 = r8.nextString();
    L_0x05a3:
        r0.A = r2;
        goto L_0x0019;
    L_0x05a7:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05b1;
    L_0x05af:
        goto L_0x089b;
    L_0x05b1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05be;
    L_0x05b5:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05c2;
    L_0x05be:
        r2 = r8.nextString();
    L_0x05c2:
        r0.z = r2;
        goto L_0x0019;
    L_0x05c6:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05d0;
    L_0x05ce:
        goto L_0x089b;
    L_0x05d0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05dd;
    L_0x05d4:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05e1;
    L_0x05dd:
        r2 = r8.nextString();
    L_0x05e1:
        r0.y = r2;
        goto L_0x0019;
    L_0x05e5:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05ef;
    L_0x05ed:
        goto L_0x089b;
    L_0x05ef:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05fc;
    L_0x05f3:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0600;
    L_0x05fc:
        r2 = r8.nextString();
    L_0x0600:
        r0.x = r2;
        goto L_0x0019;
    L_0x0604:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x060e;
    L_0x060c:
        goto L_0x089b;
    L_0x060e:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.w = r2;
        goto L_0x0019;
    L_0x061a:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0624;
    L_0x0622:
        goto L_0x089b;
    L_0x0624:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0631;
    L_0x0628:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0635;
    L_0x0631:
        r2 = r8.nextBoolean();
    L_0x0635:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.v = r2;
        goto L_0x0019;
    L_0x063d:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0647;
    L_0x0645:
        goto L_0x089b;
    L_0x0647:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x064b:
        r8.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0653:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x066e;
    L_0x0659:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0666;
    L_0x065d:
        r4 = r8.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x066a;
    L_0x0666:
        r4 = r8.nextString();
    L_0x066a:
        r3.add(r4);
        goto L_0x0653;
    L_0x066e:
        r8.endArray();
        r0.u = r3;
        goto L_0x0019;
    L_0x0675:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x067f;
    L_0x067d:
        goto L_0x089b;
    L_0x067f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x068c;
    L_0x0683:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0690;
    L_0x068c:
        r2 = r8.nextString();
    L_0x0690:
        r0.t = r2;
        goto L_0x0019;
    L_0x0694:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x069e;
    L_0x069c:
        goto L_0x089b;
    L_0x069e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x06ab;
    L_0x06a2:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x06af;
    L_0x06ab:
        r2 = r8.nextString();
    L_0x06af:
        r0.s = r2;
        goto L_0x0019;
    L_0x06b3:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06bd;
    L_0x06bb:
        goto L_0x089b;
    L_0x06bd:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.r = r2;
        goto L_0x0019;
    L_0x06c9:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06d3;
    L_0x06d1:
        goto L_0x089b;
    L_0x06d3:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x06e0;
    L_0x06d7:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x06e4;
    L_0x06e0:
        r2 = r8.nextBoolean();
    L_0x06e4:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.q = r2;
        goto L_0x0019;
    L_0x06ec:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06f6;
    L_0x06f4:
        goto L_0x089b;
    L_0x06f6:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0703;
    L_0x06fa:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0707;
    L_0x0703:
        r2 = r8.nextBoolean();
    L_0x0707:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.p = r2;
        goto L_0x0019;
    L_0x070f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0719;
    L_0x0717:
        goto L_0x089b;
    L_0x0719:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0726;
    L_0x071d:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x072a;
    L_0x0726:
        r2 = r8.nextString();
    L_0x072a:
        r0.o = r2;
        goto L_0x0019;
    L_0x072e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0738;
    L_0x0736:
        goto L_0x089b;
    L_0x0738:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0745;
    L_0x073c:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0749;
    L_0x0745:
        r2 = r8.nextString();
    L_0x0749:
        r0.n = r2;
        goto L_0x0019;
    L_0x074d:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0757;
    L_0x0755:
        goto L_0x089b;
    L_0x0757:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0764;
    L_0x075b:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0768;
    L_0x0764:
        r2 = r8.nextString();
    L_0x0768:
        r0.m = r2;
        goto L_0x0019;
    L_0x076c:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0776;
    L_0x0774:
        goto L_0x089b;
    L_0x0776:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0783;
    L_0x077a:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0787;
    L_0x0783:
        r2 = r8.nextBoolean();
    L_0x0787:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x078f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0799;
    L_0x0797:
        goto L_0x089b;
    L_0x0799:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x07a6;
    L_0x079d:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x07aa;
    L_0x07a6:
        r2 = r8.nextString();
    L_0x07aa:
        r0.k = r2;
        goto L_0x0019;
    L_0x07ae:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07b8;
    L_0x07b6:
        goto L_0x089b;
    L_0x07b8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x07c5;
    L_0x07bc:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x07c9;
    L_0x07c5:
        r2 = r8.nextString();
    L_0x07c9:
        r0.j = r2;
        goto L_0x0019;
    L_0x07cd:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07d7;
    L_0x07d5:
        goto L_0x089b;
    L_0x07d7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x07e4;
    L_0x07db:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x07e8;
    L_0x07e4:
        r2 = r8.nextString();
    L_0x07e8:
        r0.i = r2;
        goto L_0x0019;
    L_0x07ec:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07f6;
    L_0x07f4:
        goto L_0x089b;
    L_0x07f6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0803;
    L_0x07fa:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0807;
    L_0x0803:
        r2 = r8.nextString();
    L_0x0807:
        r0.h = r2;
        goto L_0x0019;
    L_0x080b:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0815;
    L_0x0813:
        goto L_0x089b;
    L_0x0815:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x0821:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x082a;
    L_0x0829:
        goto L_0x089b;
    L_0x082a:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0836:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x083f;
    L_0x083e:
        goto L_0x089b;
    L_0x083f:
        r2 = r8.nextDouble();
        r2 = java.lang.Double.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x084b:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0854;
    L_0x0853:
        goto L_0x089b;
    L_0x0854:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0861;
    L_0x0858:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0865;
    L_0x0861:
        r2 = r8.nextString();
    L_0x0865:
        r0.d = r2;
        goto L_0x0019;
    L_0x0869:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0872;
    L_0x0871:
        goto L_0x089b;
    L_0x0872:
        r2 = r8.nextDouble();
        r2 = java.lang.Double.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x087e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0887;
    L_0x0886:
        goto L_0x089b;
    L_0x0887:
        r2 = r8.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x0893:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x08a0;
    L_0x089b:
        r8.nextNull();
        goto L_0x0019;
    L_0x08a0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x08ad;
    L_0x08a4:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x08b1;
    L_0x08ad:
        r2 = r8.nextString();
    L_0x08b1:
        r0.a = r2;
        goto L_0x0019;
    L_0x08b5:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aenc.read(com.google.gson.stream.JsonReader):aenb");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aenb aenb) {
        if (aenb == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aenb.a != null) {
            jsonWriter.name("sn");
            jsonWriter.value(aenb.a);
        }
        if (aenb.b != null) {
            jsonWriter.name("t");
            jsonWriter.value(aenb.b);
        }
        if (aenb.c != null) {
            jsonWriter.name("timer");
            jsonWriter.value(aenb.c);
        }
        if (aenb.d != null) {
            jsonWriter.name("cap_text");
            jsonWriter.value(aenb.d);
        }
        if (aenb.e != null) {
            jsonWriter.name("cap_pos");
            jsonWriter.value(aenb.e);
        }
        if (aenb.f != null) {
            jsonWriter.name("cap_ori");
            jsonWriter.value(aenb.f);
        }
        if (aenb.g != null) {
            jsonWriter.name(MessagingSnapModel.BROADCAST);
            jsonWriter.value(aenb.g);
        }
        if (aenb.h != null) {
            jsonWriter.name("broadcast_media_url");
            jsonWriter.value(aenb.h);
        }
        if (aenb.i != null) {
            jsonWriter.name("broadcast_url");
            jsonWriter.value(aenb.i);
        }
        if (aenb.j != null) {
            jsonWriter.name("broadcast_action_text");
            jsonWriter.value(aenb.j);
        }
        if (aenb.k != null) {
            jsonWriter.name("broadcast_secondary_text");
            jsonWriter.value(aenb.k);
        }
        if (aenb.l != null) {
            jsonWriter.name("broadcast_hide_timer");
            jsonWriter.value(aenb.l.booleanValue());
        }
        if (aenb.m != null) {
            jsonWriter.name("filter_id");
            jsonWriter.value(aenb.m);
        }
        if (aenb.n != null) {
            jsonWriter.name("rp");
            jsonWriter.value(aenb.n);
        }
        if (aenb.o != null) {
            jsonWriter.name("c_id");
            jsonWriter.value(aenb.o);
        }
        if (aenb.p != null) {
            jsonWriter.name("replayed");
            jsonWriter.value(aenb.p.booleanValue());
        }
        if (aenb.q != null) {
            jsonWriter.name("pending");
            jsonWriter.value(aenb.q.booleanValue());
        }
        if (aenb.r != null) {
            jsonWriter.name("c");
            jsonWriter.value(aenb.r);
        }
        if (aenb.s != null) {
            jsonWriter.name("es_id");
            jsonWriter.value(aenb.s);
        }
        if (aenb.t != null) {
            jsonWriter.name("eg_data");
            jsonWriter.value(aenb.t);
        }
        if (aenb.u != null) {
            jsonWriter.name("uv_tags");
            jsonWriter.beginArray();
            for (String value : aenb.u) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aenb.v != null) {
            jsonWriter.name("fi_needs_retry");
            jsonWriter.value(aenb.v.booleanValue());
        }
        if (aenb.w != null) {
            jsonWriter.name("fi_version");
            jsonWriter.value(aenb.w);
        }
        if (aenb.x != null) {
            jsonWriter.name("fi_sender_out_alpha");
            jsonWriter.value(aenb.x);
        }
        if (aenb.y != null) {
            jsonWriter.name("fi_recipient_out_alpha");
            jsonWriter.value(aenb.y);
        }
        if (aenb.z != null) {
            jsonWriter.name("fi_recipient_out_delta");
            jsonWriter.value(aenb.z);
        }
        if (aenb.A != null) {
            jsonWriter.name("fi_recipient_out_delta_check");
            jsonWriter.value(aenb.A);
        }
        if (aenb.B != null) {
            jsonWriter.name("fi_send_timestamp");
            jsonWriter.value(aenb.B);
        }
        if (aenb.C != null) {
            jsonWriter.name("fidelius_info");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginObject();
            for (Entry entry : aenb.C.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                typeAdapter.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aenb.D != null) {
            jsonWriter.name("fi_recipient_out_gamma");
            jsonWriter.value(aenb.D);
        }
        if (aenb.E != null) {
            jsonWriter.name("fi_snap_key");
            jsonWriter.value(aenb.E);
        }
        if (aenb.F != null) {
            jsonWriter.name("fi_snap_iv");
            jsonWriter.value(aenb.F);
        }
        if (aenb.G != null) {
            jsonWriter.name("fi_prev_sender_gamma");
            jsonWriter.value(aenb.G);
        }
        if (aenb.H != null) {
            jsonWriter.name("fi_prev_sender_gamma_count");
            jsonWriter.value(aenb.H);
        }
        if (aenb.I != null) {
            jsonWriter.name("fi_sender_out_beta");
            jsonWriter.value(aenb.I);
        }
        if (aenb.J != null) {
            jsonWriter.name("fi_snap_release_ts");
            jsonWriter.value(aenb.J);
        }
        if (aenb.K != null) {
            jsonWriter.name("screen_capture_shot_count");
            jsonWriter.value(aenb.K);
        }
        if (aenb.L != null) {
            jsonWriter.name("screen_capture_recording_count");
            jsonWriter.value(aenb.L);
        }
        if (aenb.M != null) {
            jsonWriter.name("fi_retried");
            jsonWriter.value(aenb.M.booleanValue());
        }
        if (aenb.N != null) {
            jsonWriter.name("direct_download_url");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aenb.N);
        }
        if (aenb.O != null) {
            jsonWriter.name("id");
            jsonWriter.value(aenb.O);
        }
        if (aenb.P != null) {
            jsonWriter.name("st");
            jsonWriter.value(aenb.P);
        }
        if (aenb.Q != null) {
            jsonWriter.name("m");
            jsonWriter.value(aenb.Q);
        }
        if (aenb.R != null) {
            jsonWriter.name("ts");
            jsonWriter.value(aenb.R);
        }
        if (aenb.S != null) {
            jsonWriter.name("sts");
            jsonWriter.value(aenb.S);
        }
        if (aenb.T != null) {
            jsonWriter.name(SnapModel.ZIPPED);
            jsonWriter.value(aenb.T.booleanValue());
        }
        if (aenb.U != null) {
            jsonWriter.name("pts");
            jsonWriter.value(aenb.U);
        }
        if (aenb.V != null) {
            jsonWriter.name("orientation");
            jsonWriter.value(aenb.V);
        }
        if (aenb.W != null) {
            jsonWriter.name("snap_metadata");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aenb.W);
        }
        if (aenb.X != null) {
            jsonWriter.name("send_start_timestamp");
            jsonWriter.value(aenb.X);
        }
        if (aenb.Y != null) {
            jsonWriter.name("reply_medias");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aerv write : aenb.Y) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aenb.Z != null) {
            jsonWriter.name("seq_num");
            jsonWriter.value(aenb.Z);
        }
        if (aenb.aa != null) {
            jsonWriter.name("view_timestamp");
            jsonWriter.value(aenb.aa);
        }
        jsonWriter.endObject();
    }
}
