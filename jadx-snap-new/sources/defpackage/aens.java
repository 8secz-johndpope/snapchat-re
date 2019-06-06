package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.snapchat.soju.android.Geofence;
import java.util.Map.Entry;

/* renamed from: aens */
public final class aens extends TypeAdapter<aenr> {
    private final Supplier<TypeAdapter<afdx>> A = Suppliers.memoize(new afdq(this.a, TypeToken.get(afdx.class)));
    private final Supplier<TypeAdapter<byte[]>> B = Suppliers.memoize(new afdq(this.a, TypeToken.get(byte[].class)));
    private final Gson a;
    private final Supplier<TypeAdapter<ahxz>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahxz.class)));
    private final Supplier<TypeAdapter<ahyc>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahyc.class)));
    private final Supplier<TypeAdapter<ahye>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahye.class)));
    private final Supplier<TypeAdapter<ahyg>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahyg.class)));
    private final Supplier<TypeAdapter<ahyl>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahyl.class)));
    private final Supplier<TypeAdapter<ahyr>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahyr.class)));
    private final Supplier<TypeAdapter<ahyz>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahyz.class)));
    private final Supplier<TypeAdapter<aeju>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeju.class)));
    private final Supplier<TypeAdapter<ahzb>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahzb.class)));
    private final Supplier<TypeAdapter<Geofence>> k = Suppliers.memoize(new afdq(this.a, TypeToken.get(Geofence.class)));
    private final Supplier<TypeAdapter<aenj>> l = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenj.class)));
    private final Supplier<TypeAdapter<aenn>> m = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenn.class)));
    private final Supplier<TypeAdapter<aenp>> n = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenp.class)));
    private final Supplier<TypeAdapter<aepq>> o = Suppliers.memoize(new afdq(this.a, TypeToken.get(aepq.class)));
    private final Supplier<TypeAdapter<aept>> p = Suppliers.memoize(new afdq(this.a, TypeToken.get(aept.class)));
    private final Supplier<TypeAdapter<aepz>> q = Suppliers.memoize(new afdq(this.a, TypeToken.get(aepz.class)));
    private final Supplier<TypeAdapter<akrm>> r = Suppliers.memoize(new afdq(this.a, TypeToken.get(akrm.class)));
    private final Supplier<TypeAdapter<aiao>> s = Suppliers.memoize(new afdq(this.a, TypeToken.get(aiao.class)));
    private final Supplier<TypeAdapter<aibc>> t = Suppliers.memoize(new afdq(this.a, TypeToken.get(aibc.class)));
    private final Supplier<TypeAdapter<aezp>> u = Suppliers.memoize(new afdq(this.a, TypeToken.get(aezp.class)));
    private final Supplier<TypeAdapter<aezr>> v = Suppliers.memoize(new afdq(this.a, TypeToken.get(aezr.class)));
    private final Supplier<TypeAdapter<afag>> w = Suppliers.memoize(new afdq(this.a, TypeToken.get(afag.class)));
    private final Supplier<TypeAdapter<aibw>> x = Suppliers.memoize(new afdq(this.a, TypeToken.get(aibw.class)));
    private final Supplier<TypeAdapter<aicd>> y = Suppliers.memoize(new afdq(this.a, TypeToken.get(aicd.class)));
    private final Supplier<TypeAdapter<afds>> z = Suppliers.memoize(new afdq(this.a, TypeToken.get(afds.class)));

    public aens(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:635:0x0c7c, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aenr read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aenr;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0c96;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2075062275: goto L_0x0356;
            case -2072673026: goto L_0x034b;
            case -1963501277: goto L_0x0340;
            case -1937937481: goto L_0x0335;
            case -1918005779: goto L_0x032a;
            case -1855105388: goto L_0x031f;
            case -1851072558: goto L_0x0315;
            case -1840544998: goto L_0x030a;
            case -1819282677: goto L_0x02ff;
            case -1705398038: goto L_0x02f4;
            case -1699806423: goto L_0x02e9;
            case -1654618394: goto L_0x02df;
            case -1530233576: goto L_0x02d3;
            case -1463968248: goto L_0x02c7;
            case -1446833566: goto L_0x02bb;
            case -1354032756: goto L_0x02af;
            case -1268482881: goto L_0x02a3;
            case -1240108365: goto L_0x0297;
            case -1165461084: goto L_0x028b;
            case -1140076541: goto L_0x027f;
            case -1069297133: goto L_0x0273;
            case -1066858098: goto L_0x0267;
            case -1025689693: goto L_0x025b;
            case -886317247: goto L_0x0250;
            case -881372350: goto L_0x0245;
            case -735834452: goto L_0x0239;
            case -697920873: goto L_0x022d;
            case -588380701: goto L_0x0221;
            case -550378151: goto L_0x0215;
            case -515902924: goto L_0x0209;
            case -450623914: goto L_0x01fe;
            case -436367090: goto L_0x01f2;
            case -389443166: goto L_0x01e7;
            case -369937696: goto L_0x01db;
            case -349072091: goto L_0x01cf;
            case -318253818: goto L_0x01c3;
            case -295108195: goto L_0x01b7;
            case -287066429: goto L_0x01ab;
            case -178025351: goto L_0x019f;
            case -132481551: goto L_0x0193;
            case -24654465: goto L_0x0187;
            case -24194982: goto L_0x017b;
            case 49168835: goto L_0x016f;
            case 93166550: goto L_0x0163;
            case 100313435: goto L_0x0158;
            case 222950987: goto L_0x014c;
            case 331646715: goto L_0x0140;
            case 536157754: goto L_0x0134;
            case 747804969: goto L_0x0128;
            case 774202889: goto L_0x011c;
            case 778933239: goto L_0x0110;
            case 871519451: goto L_0x0104;
            case 891661183: goto L_0x00f8;
            case 914228612: goto L_0x00ec;
            case 983143960: goto L_0x00e0;
            case 1044886242: goto L_0x00d4;
            case 1086169066: goto L_0x00c8;
            case 1116575511: goto L_0x00bc;
            case 1132566768: goto L_0x00b0;
            case 1185979800: goto L_0x00a4;
            case 1320704794: goto L_0x0098;
            case 1406298059: goto L_0x008c;
            case 1536908355: goto L_0x0080;
            case 1717483658: goto L_0x0074;
            case 1799152161: goto L_0x0068;
            case 1839549312: goto L_0x005d;
            case 1898781796: goto L_0x0051;
            case 1939945315: goto L_0x0045;
            case 1970241253: goto L_0x0039;
            case 2082010867: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0361;
    L_0x002d:
        r4 = "is_lens";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0035:
        r2 = 20;
        goto L_0x0362;
    L_0x0039:
        r4 = "section";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0041:
        r2 = 23;
        goto L_0x0362;
    L_0x0045:
        r4 = "unlockable_track_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x004d:
        r2 = 43;
        goto L_0x0362;
    L_0x0051:
        r4 = "is_sponsored";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0059:
        r2 = 15;
        goto L_0x0362;
    L_0x005d:
        r4 = "geofence";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0065:
        r2 = 6;
        goto L_0x0362;
    L_0x0068:
        r4 = "appstore_iap_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0070:
        r2 = 25;
        goto L_0x0362;
    L_0x0074:
        r4 = "dynamic_content_setting";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x007c:
        r2 = 19;
        goto L_0x0362;
    L_0x0080:
        r4 = "checksum";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0088:
        r2 = 69;
        goto L_0x0362;
    L_0x008c:
        r4 = "guarantee_delivery";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0094:
        r2 = 37;
        goto L_0x0362;
    L_0x0098:
        r4 = "server_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00a0:
        r2 = 36;
        goto L_0x0362;
    L_0x00a4:
        r4 = "unlockable_attributes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00ac:
        r2 = 46;
        goto L_0x0362;
    L_0x00b0:
        r4 = "ar_segmentation";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00b8:
        r2 = 59;
        goto L_0x0362;
    L_0x00bc:
        r4 = "context_hint";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00c4:
        r2 = 64;
        goto L_0x0362;
    L_0x00c8:
        r4 = "exclusion_tags";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00d0:
        r2 = 38;
        goto L_0x0362;
    L_0x00d4:
        r4 = "unlockable_content_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00dc:
        r2 = 8;
        goto L_0x0362;
    L_0x00e0:
        r4 = "caption_style";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00e8:
        r2 = 67;
        goto L_0x0362;
    L_0x00ec:
        r4 = "sponsored_slug_img_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x00f4:
        r2 = 18;
        goto L_0x0362;
    L_0x00f8:
        r4 = "is_frame_filter";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0100:
        r2 = 42;
        goto L_0x0362;
    L_0x0104:
        r4 = "client_cache_ttl_minutes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x010c:
        r2 = 14;
        goto L_0x0362;
    L_0x0110:
        r4 = "unlock_duration_message";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0118:
        r2 = 32;
        goto L_0x0362;
    L_0x011c:
        r4 = "eligible_for_notification";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0124:
        r2 = 47;
        goto L_0x0362;
    L_0x0128:
        r4 = "position";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0130:
        r2 = 10;
        goto L_0x0362;
    L_0x0134:
        r4 = "should_subsample_image";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x013c:
        r2 = 34;
        goto L_0x0362;
    L_0x0140:
        r4 = "sync_sensitivity";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0148:
        r2 = 52;
        goto L_0x0362;
    L_0x014c:
        r4 = "lens_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0154:
        r2 = 21;
        goto L_0x0362;
    L_0x0158:
        r4 = "image";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0160:
        r2 = 2;
        goto L_0x0362;
    L_0x0163:
        r4 = "audio";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x016b:
        r2 = 65;
        goto L_0x0362;
    L_0x016f:
        r4 = "dynamic_context_properties";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0177:
        r2 = 48;
        goto L_0x0362;
    L_0x017b:
        r4 = "geofilter_prompt";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0183:
        r2 = 30;
        goto L_0x0362;
    L_0x0187:
        r4 = "unlockable_category";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x018f:
        r2 = 44;
        goto L_0x0362;
    L_0x0193:
        r4 = "sponsored_slug";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x019b:
        r2 = 16;
        goto L_0x0362;
    L_0x019f:
        r4 = "dynamic_content";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01a7:
        r2 = 11;
        goto L_0x0362;
    L_0x01ab:
        r4 = "is_menu_filter";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01b3:
        r2 = 55;
        goto L_0x0362;
    L_0x01b7:
        r4 = "enc_geo_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01bf:
        r2 = 29;
        goto L_0x0362;
    L_0x01c3:
        r4 = "gplay_iap_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01cb:
        r2 = 26;
        goto L_0x0362;
    L_0x01cf:
        r4 = "has_context_card";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01d7:
        r2 = 57;
        goto L_0x0362;
    L_0x01db:
        r4 = "carousel_group";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01e3:
        r2 = 58;
        goto L_0x0362;
    L_0x01e7:
        r4 = "extra_image_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01ef:
        r2 = 5;
        goto L_0x0362;
    L_0x01f2:
        r4 = "unlockable_context";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x01fa:
        r2 = 45;
        goto L_0x0362;
    L_0x01fe:
        r4 = "url_params";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0206:
        r2 = 3;
        goto L_0x0362;
    L_0x0209:
        r4 = "is_dynamic_geofilter";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0211:
        r2 = 12;
        goto L_0x0362;
    L_0x0215:
        r4 = "filter_id_long";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x021d:
        r2 = 68;
        goto L_0x0362;
    L_0x0221:
        r4 = "sponsored_slug_style";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0229:
        r2 = 54;
        goto L_0x0362;
    L_0x022d:
        r4 = "schedule";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0235:
        r2 = 31;
        goto L_0x0362;
    L_0x0239:
        r4 = "lens_categories_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0241:
        r2 = 35;
        goto L_0x0362;
    L_0x0245:
        r4 = "filter_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x024d:
        r2 = 0;
        goto L_0x0362;
    L_0x0250:
        r4 = "unlockable_content_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0258:
        r2 = 7;
        goto L_0x0362;
    L_0x025b:
        r4 = "is_featured";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0263:
        r2 = 24;
        goto L_0x0362;
    L_0x0267:
        r4 = "sticker_pack_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x026f:
        r2 = 49;
        goto L_0x0362;
    L_0x0273:
        r4 = "meta_tags";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x027b:
        r2 = 56;
        goto L_0x0362;
    L_0x027f:
        r4 = "tooltip";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0287:
        r2 = 63;
        goto L_0x0362;
    L_0x028b:
        r4 = "priority";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0293:
        r2 = 9;
        goto L_0x0362;
    L_0x0297:
        r4 = "post_capture_lens_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x029f:
        r2 = 66;
        goto L_0x0362;
    L_0x02a3:
        r4 = "client_cache_expiration_date_time";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02ab:
        r2 = 13;
        goto L_0x0362;
    L_0x02af:
        r4 = "excluded_by_tags";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02b7:
        r2 = 39;
        goto L_0x0362;
    L_0x02bb:
        r4 = "below_drawing_layer";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02c3:
        r2 = 28;
        goto L_0x0362;
    L_0x02c7:
        r4 = "targeting_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02cf:
        r2 = 27;
        goto L_0x0362;
    L_0x02d3:
        r4 = "is_animated";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02db:
        r2 = 51;
        goto L_0x0362;
    L_0x02df:
        r4 = "expires_countdown";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02e7:
        r2 = 1;
        goto L_0x0362;
    L_0x02e9:
        r4 = "lens_placement_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02f1:
        r2 = 41;
        goto L_0x0362;
    L_0x02f4:
        r4 = "auto_stacking";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x02fc:
        r2 = 50;
        goto L_0x0362;
    L_0x02ff:
        r4 = "filter_score";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0307:
        r2 = 33;
        goto L_0x0362;
    L_0x030a:
        r4 = "debug_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0312:
        r2 = 61;
        goto L_0x0362;
    L_0x0315:
        r4 = "image_cropped_to_visible";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x031d:
        r2 = 4;
        goto L_0x0362;
    L_0x031f:
        r4 = "lens_carousel_index";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0327:
        r2 = 40;
        goto L_0x0362;
    L_0x032a:
        r4 = "populated_unlockable_context_types";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0332:
        r2 = 53;
        goto L_0x0362;
    L_0x0335:
        r4 = "sponsored_slug_position";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x033d:
        r2 = 17;
        goto L_0x0362;
    L_0x0340:
        r4 = "attachment";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0348:
        r2 = 60;
        goto L_0x0362;
    L_0x034b:
        r4 = "scannable_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x0353:
        r2 = 62;
        goto L_0x0362;
    L_0x0356:
        r4 = "lens_categories";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0361;
    L_0x035e:
        r2 = 22;
        goto L_0x0362;
    L_0x0361:
        r2 = -1;
    L_0x0362:
        switch(r2) {
            case 0: goto L_0x0c74;
            case 1: goto L_0x0c5f;
            case 2: goto L_0x0c41;
            case 3: goto L_0x0c06;
            case 4: goto L_0x0be7;
            case 5: goto L_0x0bcb;
            case 6: goto L_0x0baf;
            case 7: goto L_0x0b90;
            case 8: goto L_0x0b71;
            case 9: goto L_0x0b5b;
            case 10: goto L_0x0b23;
            case 11: goto L_0x0ae4;
            case 12: goto L_0x0ac1;
            case 13: goto L_0x0aa5;
            case 14: goto L_0x0a8f;
            case 15: goto L_0x0a6c;
            case 16: goto L_0x0a50;
            case 17: goto L_0x0a31;
            case 18: goto L_0x0a12;
            case 19: goto L_0x09f6;
            case 20: goto L_0x09d3;
            case 21: goto L_0x09b7;
            case 22: goto L_0x097f;
            case 23: goto L_0x0960;
            case 24: goto L_0x093d;
            case 25: goto L_0x091e;
            case 26: goto L_0x08ff;
            case 27: goto L_0x08e0;
            case 28: goto L_0x08bd;
            case 29: goto L_0x089e;
            case 30: goto L_0x0882;
            case 31: goto L_0x0866;
            case 32: goto L_0x0847;
            case 33: goto L_0x0831;
            case 34: goto L_0x080e;
            case 35: goto L_0x07cf;
            case 36: goto L_0x07b9;
            case 37: goto L_0x0796;
            case 38: goto L_0x075e;
            case 39: goto L_0x0726;
            case 40: goto L_0x0710;
            case 41: goto L_0x06f4;
            case 42: goto L_0x06d1;
            case 43: goto L_0x06b5;
            case 44: goto L_0x0696;
            case 45: goto L_0x067a;
            case 46: goto L_0x0642;
            case 47: goto L_0x061f;
            case 48: goto L_0x0603;
            case 49: goto L_0x05e7;
            case 50: goto L_0x05cb;
            case 51: goto L_0x05a8;
            case 52: goto L_0x0589;
            case 53: goto L_0x0551;
            case 54: goto L_0x0535;
            case 55: goto L_0x0512;
            case 56: goto L_0x04da;
            case 57: goto L_0x04b7;
            case 58: goto L_0x049b;
            case 59: goto L_0x047f;
            case 60: goto L_0x0463;
            case 61: goto L_0x0447;
            case 62: goto L_0x042b;
            case 63: goto L_0x040f;
            case 64: goto L_0x03f0;
            case 65: goto L_0x03d4;
            case 66: goto L_0x03b8;
            case 67: goto L_0x039c;
            case 68: goto L_0x0386;
            case 69: goto L_0x036a;
            default: goto L_0x0365;
        };
    L_0x0365:
        r7.skipValue();
        goto L_0x0019;
    L_0x036a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0374;
    L_0x0372:
        goto L_0x0c7c;
    L_0x0374:
        r2 = r6.B;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (byte[]) r2;
        r0.ar = r2;
        goto L_0x0019;
    L_0x0386:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0390;
    L_0x038e:
        goto L_0x0c7c;
    L_0x0390:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.aq = r2;
        goto L_0x0019;
    L_0x039c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03a6;
    L_0x03a4:
        goto L_0x0c7c;
    L_0x03a6:
        r2 = r6.f;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahyl) r2;
        r0.ap = r2;
        goto L_0x0019;
    L_0x03b8:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03c2;
    L_0x03c0:
        goto L_0x0c7c;
    L_0x03c2:
        r2 = r6.s;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aiao) r2;
        r0.ao = r2;
        goto L_0x0019;
    L_0x03d4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03de;
    L_0x03dc:
        goto L_0x0c7c;
    L_0x03de:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahye) r2;
        r0.an = r2;
        goto L_0x0019;
    L_0x03f0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03fa;
    L_0x03f8:
        goto L_0x0c7c;
    L_0x03fa:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0407;
    L_0x03fe:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x040b;
    L_0x0407:
        r2 = r7.nextString();
    L_0x040b:
        r0.am = r2;
        goto L_0x0019;
    L_0x040f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0419;
    L_0x0417:
        goto L_0x0c7c;
    L_0x0419:
        r2 = r6.x;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aibw) r2;
        r0.al = r2;
        goto L_0x0019;
    L_0x042b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0435;
    L_0x0433:
        goto L_0x0c7c;
    L_0x0435:
        r2 = r6.t;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aibc) r2;
        r0.ak = r2;
        goto L_0x0019;
    L_0x0447:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0451;
    L_0x044f:
        goto L_0x0c7c;
    L_0x0451:
        r2 = r6.h;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahyz) r2;
        r0.aj = r2;
        goto L_0x0019;
    L_0x0463:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x046d;
    L_0x046b:
        goto L_0x0c7c;
    L_0x046d:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahyc) r2;
        r0.ai = r2;
        goto L_0x0019;
    L_0x047f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0489;
    L_0x0487:
        goto L_0x0c7c;
    L_0x0489:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahxz) r2;
        r0.ah = r2;
        goto L_0x0019;
    L_0x049b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04a5;
    L_0x04a3:
        goto L_0x0c7c;
    L_0x04a5:
        r2 = r6.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahyr) r2;
        r0.ag = r2;
        goto L_0x0019;
    L_0x04b7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04c1;
    L_0x04bf:
        goto L_0x0c7c;
    L_0x04c1:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x04ce;
    L_0x04c5:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x04d2;
    L_0x04ce:
        r2 = r7.nextBoolean();
    L_0x04d2:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.af = r2;
        goto L_0x0019;
    L_0x04da:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04e4;
    L_0x04e2:
        goto L_0x0c7c;
    L_0x04e4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x04e8:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x04f0:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x050b;
    L_0x04f6:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0503;
    L_0x04fa:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0507;
    L_0x0503:
        r4 = r7.nextString();
    L_0x0507:
        r3.add(r4);
        goto L_0x04f0;
    L_0x050b:
        r7.endArray();
        r0.ae = r3;
        goto L_0x0019;
    L_0x0512:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x051c;
    L_0x051a:
        goto L_0x0c7c;
    L_0x051c:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0529;
    L_0x0520:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x052d;
    L_0x0529:
        r2 = r7.nextBoolean();
    L_0x052d:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.ad = r2;
        goto L_0x0019;
    L_0x0535:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x053f;
    L_0x053d:
        goto L_0x0c7c;
    L_0x053f:
        r2 = r6.v;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aezr) r2;
        r0.ac = r2;
        goto L_0x0019;
    L_0x0551:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x055b;
    L_0x0559:
        goto L_0x0c7c;
    L_0x055b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x055f:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0567:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0582;
    L_0x056d:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x057a;
    L_0x0571:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x057e;
    L_0x057a:
        r4 = r7.nextString();
    L_0x057e:
        r3.add(r4);
        goto L_0x0567;
    L_0x0582:
        r7.endArray();
        r0.ab = r3;
        goto L_0x0019;
    L_0x0589:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0593;
    L_0x0591:
        goto L_0x0c7c;
    L_0x0593:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x05a0;
    L_0x0597:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x05a4;
    L_0x05a0:
        r2 = r7.nextString();
    L_0x05a4:
        r0.aa = r2;
        goto L_0x0019;
    L_0x05a8:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05b2;
    L_0x05b0:
        goto L_0x0c7c;
    L_0x05b2:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x05bf;
    L_0x05b6:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x05c3;
    L_0x05bf:
        r2 = r7.nextBoolean();
    L_0x05c3:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.Z = r2;
        goto L_0x0019;
    L_0x05cb:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05d5;
    L_0x05d3:
        goto L_0x0c7c;
    L_0x05d5:
        r2 = r6.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahyg) r2;
        r0.Y = r2;
        goto L_0x0019;
    L_0x05e7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x05f1;
    L_0x05ef:
        goto L_0x0c7c;
    L_0x05f1:
        r2 = r6.w;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afag) r2;
        r0.X = r2;
        goto L_0x0019;
    L_0x0603:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x060d;
    L_0x060b:
        goto L_0x0c7c;
    L_0x060d:
        r2 = r6.j;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.ahzb) r2;
        r0.W = r2;
        goto L_0x0019;
    L_0x061f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0629;
    L_0x0627:
        goto L_0x0c7c;
    L_0x0629:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0636;
    L_0x062d:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x063a;
    L_0x0636:
        r2 = r7.nextBoolean();
    L_0x063a:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.V = r2;
        goto L_0x0019;
    L_0x0642:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x064c;
    L_0x064a:
        goto L_0x0c7c;
    L_0x064c:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0650:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0658:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0673;
    L_0x065e:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x066b;
    L_0x0662:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x066f;
    L_0x066b:
        r4 = r7.nextString();
    L_0x066f:
        r3.add(r4);
        goto L_0x0658;
    L_0x0673:
        r7.endArray();
        r0.U = r3;
        goto L_0x0019;
    L_0x067a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0684;
    L_0x0682:
        goto L_0x0c7c;
    L_0x0684:
        r2 = r6.y;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aicd) r2;
        r0.T = r2;
        goto L_0x0019;
    L_0x0696:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06a0;
    L_0x069e:
        goto L_0x0c7c;
    L_0x06a0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x06ad;
    L_0x06a4:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x06b1;
    L_0x06ad:
        r2 = r7.nextString();
    L_0x06b1:
        r0.S = r2;
        goto L_0x0019;
    L_0x06b5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06bf;
    L_0x06bd:
        goto L_0x0c7c;
    L_0x06bf:
        r2 = r6.z;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afds) r2;
        r0.R = r2;
        goto L_0x0019;
    L_0x06d1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06db;
    L_0x06d9:
        goto L_0x0c7c;
    L_0x06db:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x06e8;
    L_0x06df:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x06ec;
    L_0x06e8:
        r2 = r7.nextBoolean();
    L_0x06ec:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.Q = r2;
        goto L_0x0019;
    L_0x06f4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x06fe;
    L_0x06fc:
        goto L_0x0c7c;
    L_0x06fe:
        r2 = r6.q;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aepz) r2;
        r0.P = r2;
        goto L_0x0019;
    L_0x0710:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x071a;
    L_0x0718:
        goto L_0x0c7c;
    L_0x071a:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.O = r2;
        goto L_0x0019;
    L_0x0726:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0730;
    L_0x072e:
        goto L_0x0c7c;
    L_0x0730:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0734:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x073c:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0757;
    L_0x0742:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x074f;
    L_0x0746:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0753;
    L_0x074f:
        r4 = r7.nextString();
    L_0x0753:
        r3.add(r4);
        goto L_0x073c;
    L_0x0757:
        r7.endArray();
        r0.N = r3;
        goto L_0x0019;
    L_0x075e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0768;
    L_0x0766:
        goto L_0x0c7c;
    L_0x0768:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x076c:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0774:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x078f;
    L_0x077a:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0787;
    L_0x077e:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x078b;
    L_0x0787:
        r4 = r7.nextString();
    L_0x078b:
        r3.add(r4);
        goto L_0x0774;
    L_0x078f:
        r7.endArray();
        r0.M = r3;
        goto L_0x0019;
    L_0x0796:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07a0;
    L_0x079e:
        goto L_0x0c7c;
    L_0x07a0:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x07ad;
    L_0x07a4:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x07b1;
    L_0x07ad:
        r2 = r7.nextBoolean();
    L_0x07b1:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.L = r2;
        goto L_0x0019;
    L_0x07b9:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07c3;
    L_0x07c1:
        goto L_0x0c7c;
    L_0x07c3:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.K = r2;
        goto L_0x0019;
    L_0x07cf:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x07d9;
    L_0x07d7:
        goto L_0x0c7c;
    L_0x07d9:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x07dd:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.o;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x07ed:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0807;
    L_0x07f3:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x07ff;
    L_0x07fb:
        r7.nextNull();
        goto L_0x07ed;
    L_0x07ff:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x07ed;
    L_0x0807:
        r7.endArray();
        r0.J = r2;
        goto L_0x0019;
    L_0x080e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0818;
    L_0x0816:
        goto L_0x0c7c;
    L_0x0818:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0825;
    L_0x081c:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0829;
    L_0x0825:
        r2 = r7.nextBoolean();
    L_0x0829:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.I = r2;
        goto L_0x0019;
    L_0x0831:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x083b;
    L_0x0839:
        goto L_0x0c7c;
    L_0x083b:
        r2 = r7.nextDouble();
        r2 = java.lang.Double.valueOf(r2);
        r0.H = r2;
        goto L_0x0019;
    L_0x0847:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0851;
    L_0x084f:
        goto L_0x0c7c;
    L_0x0851:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x085e;
    L_0x0855:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0862;
    L_0x085e:
        r2 = r7.nextString();
    L_0x0862:
        r0.G = r2;
        goto L_0x0019;
    L_0x0866:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0870;
    L_0x086e:
        goto L_0x0c7c;
    L_0x0870:
        r2 = r6.A;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afdx) r2;
        r0.F = r2;
        goto L_0x0019;
    L_0x0882:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x088c;
    L_0x088a:
        goto L_0x0c7c;
    L_0x088c:
        r2 = r6.n;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aenp) r2;
        r0.E = r2;
        goto L_0x0019;
    L_0x089e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x08a8;
    L_0x08a6:
        goto L_0x0c7c;
    L_0x08a8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x08b5;
    L_0x08ac:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x08b9;
    L_0x08b5:
        r2 = r7.nextString();
    L_0x08b9:
        r0.D = r2;
        goto L_0x0019;
    L_0x08bd:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x08c7;
    L_0x08c5:
        goto L_0x0c7c;
    L_0x08c7:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x08d4;
    L_0x08cb:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x08d8;
    L_0x08d4:
        r2 = r7.nextBoolean();
    L_0x08d8:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.C = r2;
        goto L_0x0019;
    L_0x08e0:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x08ea;
    L_0x08e8:
        goto L_0x0c7c;
    L_0x08ea:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x08f7;
    L_0x08ee:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x08fb;
    L_0x08f7:
        r2 = r7.nextString();
    L_0x08fb:
        r0.B = r2;
        goto L_0x0019;
    L_0x08ff:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0909;
    L_0x0907:
        goto L_0x0c7c;
    L_0x0909:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0916;
    L_0x090d:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x091a;
    L_0x0916:
        r2 = r7.nextString();
    L_0x091a:
        r0.A = r2;
        goto L_0x0019;
    L_0x091e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0928;
    L_0x0926:
        goto L_0x0c7c;
    L_0x0928:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0935;
    L_0x092c:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0939;
    L_0x0935:
        r2 = r7.nextString();
    L_0x0939:
        r0.z = r2;
        goto L_0x0019;
    L_0x093d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0947;
    L_0x0945:
        goto L_0x0c7c;
    L_0x0947:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0954;
    L_0x094b:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0958;
    L_0x0954:
        r2 = r7.nextBoolean();
    L_0x0958:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.y = r2;
        goto L_0x0019;
    L_0x0960:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x096a;
    L_0x0968:
        goto L_0x0c7c;
    L_0x096a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0977;
    L_0x096e:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x097b;
    L_0x0977:
        r2 = r7.nextString();
    L_0x097b:
        r0.x = r2;
        goto L_0x0019;
    L_0x097f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0989;
    L_0x0987:
        goto L_0x0c7c;
    L_0x0989:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x098d:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0995:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x09b0;
    L_0x099b:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x09a8;
    L_0x099f:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x09ac;
    L_0x09a8:
        r4 = r7.nextString();
    L_0x09ac:
        r3.add(r4);
        goto L_0x0995;
    L_0x09b0:
        r7.endArray();
        r0.w = r3;
        goto L_0x0019;
    L_0x09b7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x09c1;
    L_0x09bf:
        goto L_0x0c7c;
    L_0x09c1:
        r2 = r6.p;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aept) r2;
        r0.v = r2;
        goto L_0x0019;
    L_0x09d3:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x09dd;
    L_0x09db:
        goto L_0x0c7c;
    L_0x09dd:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x09ea;
    L_0x09e1:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x09ee;
    L_0x09ea:
        r2 = r7.nextBoolean();
    L_0x09ee:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.u = r2;
        goto L_0x0019;
    L_0x09f6:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a00;
    L_0x09fe:
        goto L_0x0c7c;
    L_0x0a00:
        r2 = r6.i;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeju) r2;
        r0.t = r2;
        goto L_0x0019;
    L_0x0a12:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a1c;
    L_0x0a1a:
        goto L_0x0c7c;
    L_0x0a1c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0a29;
    L_0x0a20:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0a2d;
    L_0x0a29:
        r2 = r7.nextString();
    L_0x0a2d:
        r0.s = r2;
        goto L_0x0019;
    L_0x0a31:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a3b;
    L_0x0a39:
        goto L_0x0c7c;
    L_0x0a3b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0a48;
    L_0x0a3f:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0a4c;
    L_0x0a48:
        r2 = r7.nextString();
    L_0x0a4c:
        r0.r = r2;
        goto L_0x0019;
    L_0x0a50:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a5a;
    L_0x0a58:
        goto L_0x0c7c;
    L_0x0a5a:
        r2 = r6.u;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aezp) r2;
        r0.q = r2;
        goto L_0x0019;
    L_0x0a6c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a76;
    L_0x0a74:
        goto L_0x0c7c;
    L_0x0a76:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0a83;
    L_0x0a7a:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0a87;
    L_0x0a83:
        r2 = r7.nextBoolean();
    L_0x0a87:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.p = r2;
        goto L_0x0019;
    L_0x0a8f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a99;
    L_0x0a97:
        goto L_0x0c7c;
    L_0x0a99:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.o = r2;
        goto L_0x0019;
    L_0x0aa5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0aaf;
    L_0x0aad:
        goto L_0x0c7c;
    L_0x0aaf:
        r2 = r6.r;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.akrm) r2;
        r0.n = r2;
        goto L_0x0019;
    L_0x0ac1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0acb;
    L_0x0ac9:
        goto L_0x0c7c;
    L_0x0acb:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0ad8;
    L_0x0acf:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0adc;
    L_0x0ad8:
        r2 = r7.nextBoolean();
    L_0x0adc:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x0ae4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0aee;
    L_0x0aec:
        goto L_0x0c7c;
    L_0x0aee:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0af2:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.m;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0b02:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0b1c;
    L_0x0b08:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0b14;
    L_0x0b10:
        r7.nextNull();
        goto L_0x0b02;
    L_0x0b14:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0b02;
    L_0x0b1c:
        r7.endArray();
        r0.l = r2;
        goto L_0x0019;
    L_0x0b23:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b2d;
    L_0x0b2b:
        goto L_0x0c7c;
    L_0x0b2d:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0b31:
        r7.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0b39:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0b54;
    L_0x0b3f:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0b4c;
    L_0x0b43:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0b50;
    L_0x0b4c:
        r4 = r7.nextString();
    L_0x0b50:
        r3.add(r4);
        goto L_0x0b39;
    L_0x0b54:
        r7.endArray();
        r0.k = r3;
        goto L_0x0019;
    L_0x0b5b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b65;
    L_0x0b63:
        goto L_0x0c7c;
    L_0x0b65:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x0b71:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b7b;
    L_0x0b79:
        goto L_0x0c7c;
    L_0x0b7b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0b88;
    L_0x0b7f:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0b8c;
    L_0x0b88:
        r2 = r7.nextString();
    L_0x0b8c:
        r0.i = r2;
        goto L_0x0019;
    L_0x0b90:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b9a;
    L_0x0b98:
        goto L_0x0c7c;
    L_0x0b9a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0ba7;
    L_0x0b9e:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0bab;
    L_0x0ba7:
        r2 = r7.nextString();
    L_0x0bab:
        r0.h = r2;
        goto L_0x0019;
    L_0x0baf:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0bb9;
    L_0x0bb7:
        goto L_0x0c7c;
    L_0x0bb9:
        r2 = r6.k;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (com.snapchat.soju.android.Geofence) r2;
        r0.g = r2;
        goto L_0x0019;
    L_0x0bcb:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0bd5;
    L_0x0bd3:
        goto L_0x0c7c;
    L_0x0bd5:
        r2 = r6.l;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aenj) r2;
        r0.f = r2;
        goto L_0x0019;
    L_0x0be7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0bf1;
    L_0x0bef:
        goto L_0x0c7c;
    L_0x0bf1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0bfe;
    L_0x0bf5:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0c02;
    L_0x0bfe:
        r2 = r7.nextString();
    L_0x0c02:
        r0.e = r2;
        goto L_0x0019;
    L_0x0c06:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c0f;
    L_0x0c0e:
        goto L_0x0c7c;
    L_0x0c0f:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x0c17:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x0c3a;
    L_0x0c1d:
        r3 = r7.nextName();
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x0c32;
    L_0x0c29:
        r4 = r7.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0c36;
    L_0x0c32:
        r4 = r7.nextString();
    L_0x0c36:
        r2.put(r3, r4);
        goto L_0x0c17;
    L_0x0c3a:
        r7.endObject();
        r0.d = r2;
        goto L_0x0019;
    L_0x0c41:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c4a;
    L_0x0c49:
        goto L_0x0c7c;
    L_0x0c4a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0c57;
    L_0x0c4e:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0c5b;
    L_0x0c57:
        r2 = r7.nextString();
    L_0x0c5b:
        r0.c = r2;
        goto L_0x0019;
    L_0x0c5f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c68;
    L_0x0c67:
        goto L_0x0c7c;
    L_0x0c68:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x0c74:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c81;
    L_0x0c7c:
        r7.nextNull();
        goto L_0x0019;
    L_0x0c81:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0c8e;
    L_0x0c85:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0c92;
    L_0x0c8e:
        r2 = r7.nextString();
    L_0x0c92:
        r0.a = r2;
        goto L_0x0019;
    L_0x0c96:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aens.read(com.google.gson.stream.JsonReader):aenr");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aenr aenr) {
        if (aenr == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aenr.a != null) {
            jsonWriter.name("filter_id");
            jsonWriter.value(aenr.a);
        }
        if (aenr.b != null) {
            jsonWriter.name("expires_countdown");
            jsonWriter.value(aenr.b);
        }
        if (aenr.c != null) {
            jsonWriter.name("image");
            jsonWriter.value(aenr.c);
        }
        if (aenr.d != null) {
            jsonWriter.name("url_params");
            jsonWriter.beginObject();
            for (Entry entry : aenr.d.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aenr.e != null) {
            jsonWriter.name("image_cropped_to_visible");
            jsonWriter.value(aenr.e);
        }
        if (aenr.f != null) {
            jsonWriter.name("extra_image_metadata");
            ((TypeAdapter) this.l.get()).write(jsonWriter, aenr.f);
        }
        if (aenr.g != null) {
            jsonWriter.name("geofence");
            ((TypeAdapter) this.k.get()).write(jsonWriter, aenr.g);
        }
        if (aenr.h != null) {
            jsonWriter.name("unlockable_content_type");
            jsonWriter.value(aenr.h);
        }
        if (aenr.i != null) {
            jsonWriter.name("unlockable_content_id");
            jsonWriter.value(aenr.i);
        }
        if (aenr.j != null) {
            jsonWriter.name("priority");
            jsonWriter.value(aenr.j);
        }
        if (aenr.k != null) {
            jsonWriter.name("position");
            jsonWriter.beginArray();
            for (String value : aenr.k) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aenr.l != null) {
            jsonWriter.name("dynamic_content");
            typeAdapter = (TypeAdapter) this.m.get();
            jsonWriter.beginArray();
            for (aenn write : aenr.l) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aenr.m != null) {
            jsonWriter.name("is_dynamic_geofilter");
            jsonWriter.value(aenr.m.booleanValue());
        }
        if (aenr.n != null) {
            jsonWriter.name("client_cache_expiration_date_time");
            ((TypeAdapter) this.r.get()).write(jsonWriter, aenr.n);
        }
        if (aenr.o != null) {
            jsonWriter.name("client_cache_ttl_minutes");
            jsonWriter.value(aenr.o);
        }
        if (aenr.p != null) {
            jsonWriter.name("is_sponsored");
            jsonWriter.value(aenr.p.booleanValue());
        }
        if (aenr.q != null) {
            jsonWriter.name("sponsored_slug");
            ((TypeAdapter) this.u.get()).write(jsonWriter, aenr.q);
        }
        if (aenr.r != null) {
            jsonWriter.name("sponsored_slug_position");
            jsonWriter.value(aenr.r);
        }
        if (aenr.s != null) {
            jsonWriter.name("sponsored_slug_img_link");
            jsonWriter.value(aenr.s);
        }
        if (aenr.t != null) {
            jsonWriter.name("dynamic_content_setting");
            ((TypeAdapter) this.i.get()).write(jsonWriter, aenr.t);
        }
        if (aenr.u != null) {
            jsonWriter.name("is_lens");
            jsonWriter.value(aenr.u.booleanValue());
        }
        if (aenr.v != null) {
            jsonWriter.name("lens_data");
            ((TypeAdapter) this.p.get()).write(jsonWriter, aenr.v);
        }
        if (aenr.w != null) {
            jsonWriter.name("lens_categories");
            jsonWriter.beginArray();
            for (String value2 : aenr.w) {
                jsonWriter.value(value2);
            }
            jsonWriter.endArray();
        }
        if (aenr.x != null) {
            jsonWriter.name("section");
            jsonWriter.value(aenr.x);
        }
        if (aenr.y != null) {
            jsonWriter.name("is_featured");
            jsonWriter.value(aenr.y.booleanValue());
        }
        if (aenr.z != null) {
            jsonWriter.name("appstore_iap_id");
            jsonWriter.value(aenr.z);
        }
        if (aenr.A != null) {
            jsonWriter.name("gplay_iap_id");
            jsonWriter.value(aenr.A);
        }
        if (aenr.B != null) {
            jsonWriter.name("targeting_type");
            jsonWriter.value(aenr.B);
        }
        if (aenr.C != null) {
            jsonWriter.name("below_drawing_layer");
            jsonWriter.value(aenr.C.booleanValue());
        }
        if (aenr.D != null) {
            jsonWriter.name("enc_geo_data");
            jsonWriter.value(aenr.D);
        }
        if (aenr.E != null) {
            jsonWriter.name("geofilter_prompt");
            ((TypeAdapter) this.n.get()).write(jsonWriter, aenr.E);
        }
        if (aenr.F != null) {
            jsonWriter.name("schedule");
            ((TypeAdapter) this.A.get()).write(jsonWriter, aenr.F);
        }
        if (aenr.G != null) {
            jsonWriter.name("unlock_duration_message");
            jsonWriter.value(aenr.G);
        }
        if (aenr.H != null) {
            jsonWriter.name("filter_score");
            jsonWriter.value(aenr.H);
        }
        if (aenr.I != null) {
            jsonWriter.name("should_subsample_image");
            jsonWriter.value(aenr.I.booleanValue());
        }
        if (aenr.J != null) {
            jsonWriter.name("lens_categories_data");
            typeAdapter = (TypeAdapter) this.o.get();
            jsonWriter.beginArray();
            for (aepq write2 : aenr.J) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aenr.K != null) {
            jsonWriter.name("server_timestamp");
            jsonWriter.value(aenr.K);
        }
        if (aenr.L != null) {
            jsonWriter.name("guarantee_delivery");
            jsonWriter.value(aenr.L.booleanValue());
        }
        if (aenr.M != null) {
            jsonWriter.name("exclusion_tags");
            jsonWriter.beginArray();
            for (String value22 : aenr.M) {
                jsonWriter.value(value22);
            }
            jsonWriter.endArray();
        }
        if (aenr.N != null) {
            jsonWriter.name("excluded_by_tags");
            jsonWriter.beginArray();
            for (String value222 : aenr.N) {
                jsonWriter.value(value222);
            }
            jsonWriter.endArray();
        }
        if (aenr.O != null) {
            jsonWriter.name("lens_carousel_index");
            jsonWriter.value(aenr.O);
        }
        if (aenr.P != null) {
            jsonWriter.name("lens_placement_info");
            ((TypeAdapter) this.q.get()).write(jsonWriter, aenr.P);
        }
        if (aenr.Q != null) {
            jsonWriter.name("is_frame_filter");
            jsonWriter.value(aenr.Q.booleanValue());
        }
        if (aenr.R != null) {
            jsonWriter.name("unlockable_track_info");
            ((TypeAdapter) this.z.get()).write(jsonWriter, aenr.R);
        }
        if (aenr.S != null) {
            jsonWriter.name("unlockable_category");
            jsonWriter.value(aenr.S);
        }
        if (aenr.T != null) {
            jsonWriter.name("unlockable_context");
            ((TypeAdapter) this.y.get()).write(jsonWriter, aenr.T);
        }
        if (aenr.U != null) {
            jsonWriter.name("unlockable_attributes");
            jsonWriter.beginArray();
            for (String value2222 : aenr.U) {
                jsonWriter.value(value2222);
            }
            jsonWriter.endArray();
        }
        if (aenr.V != null) {
            jsonWriter.name("eligible_for_notification");
            jsonWriter.value(aenr.V.booleanValue());
        }
        if (aenr.W != null) {
            jsonWriter.name("dynamic_context_properties");
            ((TypeAdapter) this.j.get()).write(jsonWriter, aenr.W);
        }
        if (aenr.X != null) {
            jsonWriter.name("sticker_pack_data");
            ((TypeAdapter) this.w.get()).write(jsonWriter, aenr.X);
        }
        if (aenr.Y != null) {
            jsonWriter.name("auto_stacking");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aenr.Y);
        }
        if (aenr.Z != null) {
            jsonWriter.name("is_animated");
            jsonWriter.value(aenr.Z.booleanValue());
        }
        if (aenr.aa != null) {
            jsonWriter.name("sync_sensitivity");
            jsonWriter.value(aenr.aa);
        }
        if (aenr.ab != null) {
            jsonWriter.name("populated_unlockable_context_types");
            jsonWriter.beginArray();
            for (String value22222 : aenr.ab) {
                jsonWriter.value(value22222);
            }
            jsonWriter.endArray();
        }
        if (aenr.ac != null) {
            jsonWriter.name("sponsored_slug_style");
            ((TypeAdapter) this.v.get()).write(jsonWriter, aenr.ac);
        }
        if (aenr.ad != null) {
            jsonWriter.name("is_menu_filter");
            jsonWriter.value(aenr.ad.booleanValue());
        }
        if (aenr.ae != null) {
            jsonWriter.name("meta_tags");
            jsonWriter.beginArray();
            for (String value222222 : aenr.ae) {
                jsonWriter.value(value222222);
            }
            jsonWriter.endArray();
        }
        if (aenr.af != null) {
            jsonWriter.name("has_context_card");
            jsonWriter.value(aenr.af.booleanValue());
        }
        if (aenr.ag != null) {
            jsonWriter.name("carousel_group");
            ((TypeAdapter) this.g.get()).write(jsonWriter, aenr.ag);
        }
        if (aenr.ah != null) {
            jsonWriter.name("ar_segmentation");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aenr.ah);
        }
        if (aenr.ai != null) {
            jsonWriter.name("attachment");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aenr.ai);
        }
        if (aenr.aj != null) {
            jsonWriter.name("debug_info");
            ((TypeAdapter) this.h.get()).write(jsonWriter, aenr.aj);
        }
        if (aenr.ak != null) {
            jsonWriter.name("scannable_data");
            ((TypeAdapter) this.t.get()).write(jsonWriter, aenr.ak);
        }
        if (aenr.al != null) {
            jsonWriter.name("tooltip");
            ((TypeAdapter) this.x.get()).write(jsonWriter, aenr.al);
        }
        if (aenr.am != null) {
            jsonWriter.name("context_hint");
            jsonWriter.value(aenr.am);
        }
        if (aenr.an != null) {
            jsonWriter.name("audio");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aenr.an);
        }
        if (aenr.ao != null) {
            jsonWriter.name("post_capture_lens_data");
            ((TypeAdapter) this.s.get()).write(jsonWriter, aenr.ao);
        }
        if (aenr.ap != null) {
            jsonWriter.name("caption_style");
            ((TypeAdapter) this.f.get()).write(jsonWriter, aenr.ap);
        }
        if (aenr.aq != null) {
            jsonWriter.name("filter_id_long");
            jsonWriter.value(aenr.aq);
        }
        if (aenr.ar != null) {
            jsonWriter.name("checksum");
            ((TypeAdapter) this.B.get()).write(jsonWriter, aenr.ar);
        }
        jsonWriter.endObject();
    }
}
