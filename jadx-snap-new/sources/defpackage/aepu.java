package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aepu */
public final class aepu extends TypeAdapter<aept> {
    private final Gson a;
    private final Supplier<TypeAdapter<aepo>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aepo.class)));
    private final Supplier<TypeAdapter<aeqb>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeqb.class)));
    private final Supplier<TypeAdapter<aeqd>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeqd.class)));
    private final Supplier<TypeAdapter<akrm>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(akrm.class)));

    public aepu(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:335:0x05e6, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aept read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aept;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0600;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2146320699: goto L_0x018e;
            case -2010365843: goto L_0x0183;
            case -1963301957: goto L_0x0178;
            case -1474744839: goto L_0x016d;
            case -1419591010: goto L_0x0162;
            case -1390669824: goto L_0x0158;
            case -1108208007: goto L_0x014d;
            case -983452636: goto L_0x0142;
            case -815730344: goto L_0x0137;
            case -732378966: goto L_0x012c;
            case -443675168: goto L_0x0121;
            case -403309970: goto L_0x0116;
            case -276158956: goto L_0x010a;
            case -133367503: goto L_0x00fe;
            case -48681657: goto L_0x00f3;
            case 3059181: goto L_0x00e8;
            case 3373707: goto L_0x00dc;
            case 17388290: goto L_0x00d1;
            case 223196827: goto L_0x00c6;
            case 725242288: goto L_0x00ba;
            case 769419470: goto L_0x00ae;
            case 769653819: goto L_0x00a2;
            case 922300883: goto L_0x0097;
            case 1030986238: goto L_0x008b;
            case 1073584312: goto L_0x0080;
            case 1130695971: goto L_0x0074;
            case 1442920300: goto L_0x0068;
            case 1530630021: goto L_0x005c;
            case 1711773763: goto L_0x0050;
            case 1981586504: goto L_0x0044;
            case 2016477850: goto L_0x0039;
            case 2051154863: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0199;
    L_0x002d:
        r4 = "snappable_tagline_key";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0035:
        r2 = 24;
        goto L_0x019a;
    L_0x0039:
        r4 = "hint_translations";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0041:
        r2 = 5;
        goto L_0x019a;
    L_0x0044:
        r4 = "is_creator_deactivated";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x004c:
        r2 = 31;
        goto L_0x019a;
    L_0x0050:
        r4 = "is_left_carousel";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0058:
        r2 = 26;
        goto L_0x019a;
    L_0x005c:
        r4 = "filter_image_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0064:
        r2 = 19;
        goto L_0x019a;
    L_0x0068:
        r4 = "lens_attribution_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0070:
        r2 = 14;
        goto L_0x019a;
    L_0x0074:
        r4 = "lens_descriptors";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x007c:
        r2 = 20;
        goto L_0x019a;
    L_0x0080:
        r4 = "signature";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0088:
        r2 = 6;
        goto L_0x019a;
    L_0x008b:
        r4 = "lens_creator_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0093:
        r2 = 28;
        goto L_0x019a;
    L_0x0097:
        r4 = "hint_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x009f:
        r2 = 4;
        goto L_0x019a;
    L_0x00a2:
        r4 = "client_cache_ttl";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00aa:
        r2 = 27;
        goto L_0x019a;
    L_0x00ae:
        r4 = "snappable_reply_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00b6:
        r2 = 21;
        goto L_0x019a;
    L_0x00ba:
        r4 = "bitmoji_comic_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00c2:
        r2 = 8;
        goto L_0x019a;
    L_0x00c6:
        r4 = "lens_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00ce:
        r2 = 3;
        goto L_0x019a;
    L_0x00d1:
        r4 = "config_path";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00d9:
        r2 = 1;
        goto L_0x019a;
    L_0x00dc:
        r4 = "name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00e4:
        r2 = 18;
        goto L_0x019a;
    L_0x00e8:
        r4 = "code";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00f0:
        r2 = 0;
        goto L_0x019a;
    L_0x00f3:
        r4 = "demo_start_date";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x00fb:
        r2 = 7;
        goto L_0x019a;
    L_0x00fe:
        r4 = "snappable_play_button_gradient";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0106:
        r2 = 25;
        goto L_0x019a;
    L_0x010a:
        r4 = "is_studio_preview";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0112:
        r2 = 12;
        goto L_0x019a;
    L_0x0116:
        r4 = "activation_camera";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x011e:
        r2 = 15;
        goto L_0x019a;
    L_0x0121:
        r4 = "is_disabled_for_video_chat";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0129:
        r2 = 16;
        goto L_0x019a;
    L_0x012c:
        r4 = "lens_creator_username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0134:
        r2 = 13;
        goto L_0x019a;
    L_0x0137:
        r4 = "snap_pro_profile_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x013f:
        r2 = 30;
        goto L_0x019a;
    L_0x0142:
        r4 = "lens_resources";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x014a:
        r2 = 29;
        goto L_0x019a;
    L_0x014d:
        r4 = "is_third_party";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0155:
        r2 = 11;
        goto L_0x019a;
    L_0x0158:
        r4 = "icon_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0160:
        r2 = 2;
        goto L_0x019a;
    L_0x0162:
        r4 = "asset_manifest";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x016a:
        r2 = 9;
        goto L_0x019a;
    L_0x016d:
        r4 = "unlock_companion_back_reference_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0175:
        r2 = 17;
        goto L_0x019a;
    L_0x0178:
        r4 = "lens_creator_user_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0180:
        r2 = 22;
        goto L_0x019a;
    L_0x0183:
        r4 = "lens_creator_avatar_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x018b:
        r2 = 23;
        goto L_0x019a;
    L_0x018e:
        r4 = "hide_until_assets_downloaded";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0199;
    L_0x0196:
        r2 = 10;
        goto L_0x019a;
    L_0x0199:
        r2 = -1;
    L_0x019a:
        switch(r2) {
            case 0: goto L_0x05de;
            case 1: goto L_0x05c0;
            case 2: goto L_0x05a2;
            case 3: goto L_0x0584;
            case 4: goto L_0x0566;
            case 5: goto L_0x052a;
            case 6: goto L_0x050b;
            case 7: goto L_0x04ef;
            case 8: goto L_0x04d0;
            case 9: goto L_0x0491;
            case 10: goto L_0x046e;
            case 11: goto L_0x044b;
            case 12: goto L_0x0428;
            case 13: goto L_0x0409;
            case 14: goto L_0x03ea;
            case 15: goto L_0x03cb;
            case 16: goto L_0x03a8;
            case 17: goto L_0x0389;
            case 18: goto L_0x036a;
            case 19: goto L_0x034b;
            case 20: goto L_0x0313;
            case 21: goto L_0x02f4;
            case 22: goto L_0x02d5;
            case 23: goto L_0x02b6;
            case 24: goto L_0x0297;
            case 25: goto L_0x027b;
            case 26: goto L_0x0258;
            case 27: goto L_0x0242;
            case 28: goto L_0x0223;
            case 29: goto L_0x01e4;
            case 30: goto L_0x01c5;
            case 31: goto L_0x01a2;
            default: goto L_0x019d;
        };
    L_0x019d:
        r7.skipValue();
        goto L_0x0019;
    L_0x01a2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ac;
    L_0x01aa:
        goto L_0x05e6;
    L_0x01ac:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x01b9;
    L_0x01b0:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01bd;
    L_0x01b9:
        r2 = r7.nextBoolean();
    L_0x01bd:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.F = r2;
        goto L_0x0019;
    L_0x01c5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01cf;
    L_0x01cd:
        goto L_0x05e6;
    L_0x01cf:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01dc;
    L_0x01d3:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01e0;
    L_0x01dc:
        r2 = r7.nextString();
    L_0x01e0:
        r0.E = r2;
        goto L_0x0019;
    L_0x01e4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ee;
    L_0x01ec:
        goto L_0x05e6;
    L_0x01ee:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01f2:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0202:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x021c;
    L_0x0208:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0214;
    L_0x0210:
        r7.nextNull();
        goto L_0x0202;
    L_0x0214:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0202;
    L_0x021c:
        r7.endArray();
        r0.D = r2;
        goto L_0x0019;
    L_0x0223:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x022d;
    L_0x022b:
        goto L_0x05e6;
    L_0x022d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x023a;
    L_0x0231:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x023e;
    L_0x023a:
        r2 = r7.nextString();
    L_0x023e:
        r0.C = r2;
        goto L_0x0019;
    L_0x0242:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x024c;
    L_0x024a:
        goto L_0x05e6;
    L_0x024c:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.B = r2;
        goto L_0x0019;
    L_0x0258:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0262;
    L_0x0260:
        goto L_0x05e6;
    L_0x0262:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x026f;
    L_0x0266:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0273;
    L_0x026f:
        r2 = r7.nextBoolean();
    L_0x0273:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.A = r2;
        goto L_0x0019;
    L_0x027b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0285;
    L_0x0283:
        goto L_0x05e6;
    L_0x0285:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeqd) r2;
        r0.z = r2;
        goto L_0x0019;
    L_0x0297:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02a1;
    L_0x029f:
        goto L_0x05e6;
    L_0x02a1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02ae;
    L_0x02a5:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02b2;
    L_0x02ae:
        r2 = r7.nextString();
    L_0x02b2:
        r0.y = r2;
        goto L_0x0019;
    L_0x02b6:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02c0;
    L_0x02be:
        goto L_0x05e6;
    L_0x02c0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02cd;
    L_0x02c4:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02d1;
    L_0x02cd:
        r2 = r7.nextString();
    L_0x02d1:
        r0.x = r2;
        goto L_0x0019;
    L_0x02d5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02df;
    L_0x02dd:
        goto L_0x05e6;
    L_0x02df:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02ec;
    L_0x02e3:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02f0;
    L_0x02ec:
        r2 = r7.nextString();
    L_0x02f0:
        r0.w = r2;
        goto L_0x0019;
    L_0x02f4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02fe;
    L_0x02fc:
        goto L_0x05e6;
    L_0x02fe:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x030b;
    L_0x0302:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x030f;
    L_0x030b:
        r2 = r7.nextString();
    L_0x030f:
        r0.v = r2;
        goto L_0x0019;
    L_0x0313:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x031d;
    L_0x031b:
        goto L_0x05e6;
    L_0x031d:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0321:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0329:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0344;
    L_0x032f:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x033c;
    L_0x0333:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0340;
    L_0x033c:
        r4 = r7.nextString();
    L_0x0340:
        r3.add(r4);
        goto L_0x0329;
    L_0x0344:
        r7.endArray();
        r0.u = r3;
        goto L_0x0019;
    L_0x034b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0355;
    L_0x0353:
        goto L_0x05e6;
    L_0x0355:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0362;
    L_0x0359:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0366;
    L_0x0362:
        r2 = r7.nextString();
    L_0x0366:
        r0.t = r2;
        goto L_0x0019;
    L_0x036a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0374;
    L_0x0372:
        goto L_0x05e6;
    L_0x0374:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0381;
    L_0x0378:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0385;
    L_0x0381:
        r2 = r7.nextString();
    L_0x0385:
        r0.s = r2;
        goto L_0x0019;
    L_0x0389:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0393;
    L_0x0391:
        goto L_0x05e6;
    L_0x0393:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x03a0;
    L_0x0397:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x03a4;
    L_0x03a0:
        r2 = r7.nextString();
    L_0x03a4:
        r0.r = r2;
        goto L_0x0019;
    L_0x03a8:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03b2;
    L_0x03b0:
        goto L_0x05e6;
    L_0x03b2:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x03bf;
    L_0x03b6:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x03c3;
    L_0x03bf:
        r2 = r7.nextBoolean();
    L_0x03c3:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.q = r2;
        goto L_0x0019;
    L_0x03cb:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03d5;
    L_0x03d3:
        goto L_0x05e6;
    L_0x03d5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x03e2;
    L_0x03d9:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x03e6;
    L_0x03e2:
        r2 = r7.nextString();
    L_0x03e6:
        r0.p = r2;
        goto L_0x0019;
    L_0x03ea:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03f4;
    L_0x03f2:
        goto L_0x05e6;
    L_0x03f4:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0401;
    L_0x03f8:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0405;
    L_0x0401:
        r2 = r7.nextString();
    L_0x0405:
        r0.o = r2;
        goto L_0x0019;
    L_0x0409:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0413;
    L_0x0411:
        goto L_0x05e6;
    L_0x0413:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0420;
    L_0x0417:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0424;
    L_0x0420:
        r2 = r7.nextString();
    L_0x0424:
        r0.n = r2;
        goto L_0x0019;
    L_0x0428:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0432;
    L_0x0430:
        goto L_0x05e6;
    L_0x0432:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x043f;
    L_0x0436:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0443;
    L_0x043f:
        r2 = r7.nextBoolean();
    L_0x0443:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x044b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0455;
    L_0x0453:
        goto L_0x05e6;
    L_0x0455:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0462;
    L_0x0459:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0466;
    L_0x0462:
        r2 = r7.nextBoolean();
    L_0x0466:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x046e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0478;
    L_0x0476:
        goto L_0x05e6;
    L_0x0478:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0485;
    L_0x047c:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0489;
    L_0x0485:
        r2 = r7.nextBoolean();
    L_0x0489:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.k = r2;
        goto L_0x0019;
    L_0x0491:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x049b;
    L_0x0499:
        goto L_0x05e6;
    L_0x049b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x049f:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x04af:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x04c9;
    L_0x04b5:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x04c1;
    L_0x04bd:
        r7.nextNull();
        goto L_0x04af;
    L_0x04c1:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x04af;
    L_0x04c9:
        r7.endArray();
        r0.j = r2;
        goto L_0x0019;
    L_0x04d0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04da;
    L_0x04d8:
        goto L_0x05e6;
    L_0x04da:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x04e7;
    L_0x04de:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x04eb;
    L_0x04e7:
        r2 = r7.nextString();
    L_0x04eb:
        r0.i = r2;
        goto L_0x0019;
    L_0x04ef:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04f9;
    L_0x04f7:
        goto L_0x05e6;
    L_0x04f9:
        r2 = r6.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.akrm) r2;
        r0.h = r2;
        goto L_0x0019;
    L_0x050b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0515;
    L_0x0513:
        goto L_0x05e6;
    L_0x0515:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0522;
    L_0x0519:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0526;
    L_0x0522:
        r2 = r7.nextString();
    L_0x0526:
        r0.g = r2;
        goto L_0x0019;
    L_0x052a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0534;
    L_0x0532:
        goto L_0x05e6;
    L_0x0534:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x053c:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x055f;
    L_0x0542:
        r3 = r7.nextName();
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x0557;
    L_0x054e:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x055b;
    L_0x0557:
        r4 = r7.nextString();
    L_0x055b:
        r2.put(r3, r4);
        goto L_0x053c;
    L_0x055f:
        r7.endObject();
        r0.f = r2;
        goto L_0x0019;
    L_0x0566:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x056f;
    L_0x056e:
        goto L_0x05e6;
    L_0x056f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x057c;
    L_0x0573:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0580;
    L_0x057c:
        r2 = r7.nextString();
    L_0x0580:
        r0.e = r2;
        goto L_0x0019;
    L_0x0584:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x058d;
    L_0x058c:
        goto L_0x05e6;
    L_0x058d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x059a;
    L_0x0591:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x059e;
    L_0x059a:
        r2 = r7.nextString();
    L_0x059e:
        r0.d = r2;
        goto L_0x0019;
    L_0x05a2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05ab;
    L_0x05aa:
        goto L_0x05e6;
    L_0x05ab:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05b8;
    L_0x05af:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05bc;
    L_0x05b8:
        r2 = r7.nextString();
    L_0x05bc:
        r0.c = r2;
        goto L_0x0019;
    L_0x05c0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05c9;
    L_0x05c8:
        goto L_0x05e6;
    L_0x05c9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05d6;
    L_0x05cd:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05da;
    L_0x05d6:
        r2 = r7.nextString();
    L_0x05da:
        r0.b = r2;
        goto L_0x0019;
    L_0x05de:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05eb;
    L_0x05e6:
        r7.nextNull();
        goto L_0x0019;
    L_0x05eb:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05f8;
    L_0x05ef:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05fc;
    L_0x05f8:
        r2 = r7.nextString();
    L_0x05fc:
        r0.a = r2;
        goto L_0x0019;
    L_0x0600:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepu.read(com.google.gson.stream.JsonReader):aept");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aept aept) {
        if (aept == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aept.a != null) {
            jsonWriter.name("code");
            jsonWriter.value(aept.a);
        }
        if (aept.b != null) {
            jsonWriter.name("config_path");
            jsonWriter.value(aept.b);
        }
        if (aept.c != null) {
            jsonWriter.name("icon_link");
            jsonWriter.value(aept.c);
        }
        if (aept.d != null) {
            jsonWriter.name("lens_link");
            jsonWriter.value(aept.d);
        }
        if (aept.e != null) {
            jsonWriter.name("hint_id");
            jsonWriter.value(aept.e);
        }
        if (aept.f != null) {
            jsonWriter.name("hint_translations");
            jsonWriter.beginObject();
            for (Entry entry : aept.f.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aept.g != null) {
            jsonWriter.name("signature");
            jsonWriter.value(aept.g);
        }
        if (aept.h != null) {
            jsonWriter.name("demo_start_date");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aept.h);
        }
        if (aept.i != null) {
            jsonWriter.name("bitmoji_comic_id");
            jsonWriter.value(aept.i);
        }
        if (aept.j != null) {
            jsonWriter.name("asset_manifest");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aepo write : aept.j) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aept.k != null) {
            jsonWriter.name("hide_until_assets_downloaded");
            jsonWriter.value(aept.k.booleanValue());
        }
        if (aept.l != null) {
            jsonWriter.name("is_third_party");
            jsonWriter.value(aept.l.booleanValue());
        }
        if (aept.m != null) {
            jsonWriter.name("is_studio_preview");
            jsonWriter.value(aept.m.booleanValue());
        }
        if (aept.n != null) {
            jsonWriter.name("lens_creator_username");
            jsonWriter.value(aept.n);
        }
        if (aept.o != null) {
            jsonWriter.name("lens_attribution_name");
            jsonWriter.value(aept.o);
        }
        if (aept.p != null) {
            jsonWriter.name("activation_camera");
            jsonWriter.value(aept.p);
        }
        if (aept.q != null) {
            jsonWriter.name("is_disabled_for_video_chat");
            jsonWriter.value(aept.q.booleanValue());
        }
        if (aept.r != null) {
            jsonWriter.name("unlock_companion_back_reference_id");
            jsonWriter.value(aept.r);
        }
        if (aept.s != null) {
            jsonWriter.name("name");
            jsonWriter.value(aept.s);
        }
        if (aept.t != null) {
            jsonWriter.name("filter_image_link");
            jsonWriter.value(aept.t);
        }
        if (aept.u != null) {
            jsonWriter.name("lens_descriptors");
            jsonWriter.beginArray();
            for (String value : aept.u) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aept.v != null) {
            jsonWriter.name("snappable_reply_type");
            jsonWriter.value(aept.v);
        }
        if (aept.w != null) {
            jsonWriter.name("lens_creator_user_id");
            jsonWriter.value(aept.w);
        }
        if (aept.x != null) {
            jsonWriter.name("lens_creator_avatar_id");
            jsonWriter.value(aept.x);
        }
        if (aept.y != null) {
            jsonWriter.name("snappable_tagline_key");
            jsonWriter.value(aept.y);
        }
        if (aept.z != null) {
            jsonWriter.name("snappable_play_button_gradient");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aept.z);
        }
        if (aept.A != null) {
            jsonWriter.name("is_left_carousel");
            jsonWriter.value(aept.A.booleanValue());
        }
        if (aept.B != null) {
            jsonWriter.name("client_cache_ttl");
            jsonWriter.value(aept.B);
        }
        if (aept.C != null) {
            jsonWriter.name("lens_creator_selfie_id");
            jsonWriter.value(aept.C);
        }
        if (aept.D != null) {
            jsonWriter.name("lens_resources");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aeqb write2 : aept.D) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aept.E != null) {
            jsonWriter.name("snap_pro_profile_id");
            jsonWriter.value(aept.E);
        }
        if (aept.F != null) {
            jsonWriter.name("is_creator_deactivated");
            jsonWriter.value(aept.F.booleanValue());
        }
        jsonWriter.endObject();
    }
}
