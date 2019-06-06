package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.snap.core.db.record.ConfigRuleModel;
import com.snap.core.db.record.FriendModel;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: afer */
public final class afer extends TypeAdapter<afeq> {
    private final Gson a;
    private final Supplier<TypeAdapter<afhb>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afhb.class)));
    private final Supplier<TypeAdapter<afhf>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(afhf.class)));
    private final Supplier<TypeAdapter<aecn>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aecn.class)));
    private final Supplier<TypeAdapter<aecp>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aecp.class)));
    private final Supplier<TypeAdapter<agaa>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(agaa.class)));
    private final Supplier<TypeAdapter<aehh>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(aehh.class)));
    private final Supplier<TypeAdapter<aejy>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(aejy.class)));
    private final Supplier<TypeAdapter<aekk>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(aekk.class)));
    private final Supplier<TypeAdapter<aekm>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(aekm.class)));
    private final Supplier<TypeAdapter<aeko>> k = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeko.class)));
    private final Supplier<TypeAdapter<aelf>> l = Suppliers.memoize(new afdq(this.a, TypeToken.get(aelf.class)));
    private final Supplier<TypeAdapter<aenb>> m = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenb.class)));
    private final Supplier<TypeAdapter<ahga>> n = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahga.class)));
    private final Supplier<TypeAdapter<aeue>> o = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeue.class)));
    private final Supplier<TypeAdapter<aevd>> p = Suppliers.memoize(new afdq(this.a, TypeToken.get(aevd.class)));
    private final Supplier<TypeAdapter<aewi>> q = Suppliers.memoize(new afdq(this.a, TypeToken.get(aewi.class)));
    private final Supplier<TypeAdapter<ahfc>> r = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahfc.class)));
    private final Supplier<TypeAdapter<aich>> s = Suppliers.memoize(new afdq(this.a, TypeToken.get(aich.class)));
    private final Supplier<TypeAdapter<aikk>> t = Suppliers.memoize(new afdq(this.a, TypeToken.get(aikk.class)));
    private final Supplier<TypeAdapter<afgf>> u = Suppliers.memoize(new afdq(this.a, TypeToken.get(afgf.class)));
    private final Supplier<TypeAdapter<Map<String, String>>> v = Suppliers.memoize(new afdq(this.a, new 1()));

    /* renamed from: afer$1 */
    class 1 extends TypeToken<Map<String, String>> {
        1() {
        }
    }

    public afer(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:1660:0x1f0f, code skipped:
            r9.nextNull();
     */
    /* renamed from: a */
    public final defpackage.afeq read(com.google.gson.stream.JsonReader r9) {
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
        r0 = new afeq;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x1f2d;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2145187362: goto L_0x07e2;
            case -2104092752: goto L_0x07d8;
            case -2080491865: goto L_0x07cd;
            case -2023621058: goto L_0x07c2;
            case -1992096081: goto L_0x07b8;
            case -1979619508: goto L_0x07ad;
            case -1959535603: goto L_0x07a2;
            case -1956766558: goto L_0x0798;
            case -1916627431: goto L_0x078d;
            case -1902412900: goto L_0x0782;
            case -1882318421: goto L_0x0777;
            case -1846754163: goto L_0x076c;
            case -1824345740: goto L_0x0760;
            case -1816798739: goto L_0x0754;
            case -1796623244: goto L_0x0748;
            case -1795411284: goto L_0x073c;
            case -1748209453: goto L_0x0730;
            case -1711544632: goto L_0x0724;
            case -1654690103: goto L_0x0718;
            case -1645889331: goto L_0x070c;
            case -1635945876: goto L_0x0700;
            case -1607367305: goto L_0x06f4;
            case -1595347456: goto L_0x06e8;
            case -1575607649: goto L_0x06dc;
            case -1536847814: goto L_0x06d0;
            case -1536613011: goto L_0x06c4;
            case -1476845092: goto L_0x06b8;
            case -1466798225: goto L_0x06ac;
            case -1376980313: goto L_0x06a0;
            case -1375921512: goto L_0x0694;
            case -1366381036: goto L_0x0688;
            case -1326264760: goto L_0x067c;
            case -1323966006: goto L_0x0670;
            case -1311938863: goto L_0x0664;
            case -1286888396: goto L_0x0658;
            case -1252547017: goto L_0x064c;
            case -1246434983: goto L_0x0640;
            case -1239137217: goto L_0x0634;
            case -1233757620: goto L_0x0628;
            case -1229095344: goto L_0x061c;
            case -1176792177: goto L_0x0610;
            case -1170120738: goto L_0x0604;
            case -1097337470: goto L_0x05f9;
            case -1089992607: goto L_0x05ed;
            case -1068855134: goto L_0x05e1;
            case -1047795135: goto L_0x05d5;
            case -1038250827: goto L_0x05c9;
            case -1030036527: goto L_0x05bd;
            case -962437528: goto L_0x05b1;
            case -930389691: goto L_0x05a5;
            case -907101921: goto L_0x0599;
            case -898027205: goto L_0x058d;
            case -849879622: goto L_0x0581;
            case -838117759: goto L_0x0575;
            case -815566671: goto L_0x0569;
            case -810697013: goto L_0x055d;
            case -808719903: goto L_0x0551;
            case -792337716: goto L_0x0545;
            case -747212050: goto L_0x0539;
            case -723433168: goto L_0x052d;
            case -718443712: goto L_0x0521;
            case -701961790: goto L_0x0515;
            case -650237863: goto L_0x0509;
            case -647184019: goto L_0x04fd;
            case -634374619: goto L_0x04f1;
            case -600094315: goto L_0x04e5;
            case -584604976: goto L_0x04da;
            case -573809741: goto L_0x04ce;
            case -501739481: goto L_0x04c2;
            case -488862211: goto L_0x04b6;
            case -452035569: goto L_0x04aa;
            case -441329847: goto L_0x049e;
            case -418993986: goto L_0x0492;
            case -412413477: goto L_0x0486;
            case -402867308: goto L_0x047a;
            case -265713450: goto L_0x046f;
            case -264072516: goto L_0x0463;
            case -258724840: goto L_0x0457;
            case -207737163: goto L_0x044b;
            case -206948513: goto L_0x043f;
            case -181368424: goto L_0x0433;
            case -163367435: goto L_0x0427;
            case -153973429: goto L_0x041b;
            case -147132913: goto L_0x0410;
            case -116049868: goto L_0x0404;
            case -96702670: goto L_0x03f8;
            case -68362406: goto L_0x03ec;
            case -8805804: goto L_0x03e0;
            case -4894748: goto L_0x03d4;
            case 3526552: goto L_0x03c8;
            case 93628175: goto L_0x03bc;
            case 96619420: goto L_0x03b0;
            case 102817346: goto L_0x03a4;
            case 109264530: goto L_0x0398;
            case 109578729: goto L_0x038c;
            case 140074767: goto L_0x0380;
            case 153440729: goto L_0x0374;
            case 171402126: goto L_0x0368;
            case 178019501: goto L_0x035c;
            case 183589186: goto L_0x0350;
            case 297741532: goto L_0x0344;
            case 303474045: goto L_0x0338;
            case 338699282: goto L_0x032c;
            case 347415056: goto L_0x0320;
            case 414872763: goto L_0x0314;
            case 458776311: goto L_0x0308;
            case 470740486: goto L_0x02fc;
            case 484284504: goto L_0x02f0;
            case 488564074: goto L_0x02e4;
            case 520416902: goto L_0x02d8;
            case 560373477: goto L_0x02cc;
            case 563592067: goto L_0x02c0;
            case 634783800: goto L_0x02b4;
            case 652410145: goto L_0x02a8;
            case 684237529: goto L_0x029c;
            case 684495095: goto L_0x0290;
            case 713839572: goto L_0x0284;
            case 722766870: goto L_0x0278;
            case 794640394: goto L_0x026c;
            case 818658755: goto L_0x0260;
            case 825352512: goto L_0x0254;
            case 835882840: goto L_0x0248;
            case 853880557: goto L_0x023c;
            case 910024154: goto L_0x0230;
            case 937259329: goto L_0x0224;
            case 948824081: goto L_0x0218;
            case 959812831: goto L_0x020c;
            case 984616313: goto L_0x0200;
            case 1028554472: goto L_0x01f4;
            case 1028633754: goto L_0x01e8;
            case 1031198784: goto L_0x01dc;
            case 1044168505: goto L_0x01d0;
            case 1054855510: goto L_0x01c4;
            case 1069376125: goto L_0x01b8;
            case 1082295672: goto L_0x01ac;
            case 1086056261: goto L_0x01a0;
            case 1106369732: goto L_0x0194;
            case 1117253449: goto L_0x0188;
            case 1201594272: goto L_0x017c;
            case 1289374800: goto L_0x0170;
            case 1292486936: goto L_0x0164;
            case 1307649698: goto L_0x0158;
            case 1352657365: goto L_0x014c;
            case 1361688472: goto L_0x0140;
            case 1365496791: goto L_0x0134;
            case 1370525363: goto L_0x0128;
            case 1384618805: goto L_0x011c;
            case 1388105984: goto L_0x0110;
            case 1389762097: goto L_0x0104;
            case 1429287463: goto L_0x00f8;
            case 1481071862: goto L_0x00ec;
            case 1490836601: goto L_0x00e0;
            case 1536571499: goto L_0x00d4;
            case 1602202216: goto L_0x00c8;
            case 1615086568: goto L_0x00bc;
            case 1625171726: goto L_0x00b0;
            case 1774537992: goto L_0x00a4;
            case 1789923469: goto L_0x0099;
            case 1812340176: goto L_0x008d;
            case 1832518514: goto L_0x0081;
            case 1852649041: goto L_0x0075;
            case 1855121380: goto L_0x0069;
            case 1938494204: goto L_0x005d;
            case 1941396554: goto L_0x0051;
            case 2031021758: goto L_0x0045;
            case 2111777364: goto L_0x0039;
            case 2127917851: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x07ed;
    L_0x002d:
        r4 = "client_prompts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0035:
        r2 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        goto L_0x07ee;
    L_0x0039:
        r4 = "sc_media_recorder_recommended_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0041:
        r2 = 72;
        goto L_0x07ee;
    L_0x0045:
        r4 = "enable_world_lens_grid";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x004d:
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        goto L_0x07ee;
    L_0x0051:
        r4 = "laguna_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0059:
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        goto L_0x07ee;
    L_0x005d:
        r4 = "industries";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0065:
        r2 = 91;
        goto L_0x07ee;
    L_0x0069:
        r4 = "enable_fast_frame_rate_camera_initialization_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0071:
        r2 = 18;
        goto L_0x07ee;
    L_0x0075:
        r4 = "should_text_to_verify_number";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x007d:
        r2 = 39;
        goto L_0x07ee;
    L_0x0081:
        r4 = "enable_image_transcoding";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0089:
        r2 = 14;
        goto L_0x07ee;
    L_0x008d:
        r4 = "current_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0095:
        r2 = 34;
        goto L_0x07ee;
    L_0x0099:
        r4 = "is_verified_user";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00a1:
        r2 = 5;
        goto L_0x07ee;
    L_0x00a4:
        r4 = "nft_lo_timeout";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00ac:
        r2 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        goto L_0x07ee;
    L_0x00b0:
        r4 = "blizzard_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00b8:
        r2 = 8;
        goto L_0x07ee;
    L_0x00bc:
        r4 = "display_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00c4:
        r2 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        goto L_0x07ee;
    L_0x00c8:
        r4 = "video_note_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00d0:
        r2 = 82;
        goto L_0x07ee;
    L_0x00d4:
        r4 = "is_sms_two_fa_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00dc:
        r2 = 93;
        goto L_0x07ee;
    L_0x00e0:
        r4 = "time_since_last_travel_model_change";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00e8:
        r2 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        goto L_0x07ee;
    L_0x00ec:
        r4 = "country_code";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x00f4:
        r2 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        goto L_0x07ee;
    L_0x00f8:
        r4 = "client_properties";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0100:
        r2 = 41;
        goto L_0x07ee;
    L_0x0104:
        r4 = "is_affected_by_gdpr";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x010c:
        r2 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        goto L_0x07ee;
    L_0x0110:
        r4 = "video_note_api_fallback_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0118:
        r2 = 83;
        goto L_0x07ee;
    L_0x011c:
        r4 = "speed_filters_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0124:
        r2 = 64;
        goto L_0x07ee;
    L_0x0128:
        r4 = "has_used_laguna";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0130:
        r2 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        goto L_0x07ee;
    L_0x0134:
        r4 = "camera2_take_photo_api_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x013c:
        r2 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        goto L_0x07ee;
    L_0x0140:
        r4 = "third_party_tracking_base_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0148:
        r2 = 51;
        goto L_0x07ee;
    L_0x014c:
        r4 = "smoothing_filter_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0154:
        r2 = 66;
        goto L_0x07ee;
    L_0x0158:
        r4 = "study_settings_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0160:
        r2 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        goto L_0x07ee;
    L_0x0164:
        r4 = "discover_content_disabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x016c:
        r2 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        goto L_0x07ee;
    L_0x0170:
        r4 = "require_refreshing_profile_media";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0178:
        r2 = 56;
        goto L_0x07ee;
    L_0x017c:
        r4 = "gaussian_blur_level_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0184:
        r2 = 19;
        goto L_0x07ee;
    L_0x0188:
        r4 = "should_show_suggestion_prompt";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0190:
        r2 = 57;
        goto L_0x07ee;
    L_0x0194:
        r4 = "is_popular";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x019c:
        r2 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        goto L_0x07ee;
    L_0x01a0:
        r4 = "is_two_fa_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01a8:
        r2 = 95;
        goto L_0x07ee;
    L_0x01ac:
        r4 = "recents";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01b4:
        r2 = 31;
        goto L_0x07ee;
    L_0x01b8:
        r4 = "birthday";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01c0:
        r2 = 21;
        goto L_0x07ee;
    L_0x01c4:
        r4 = "added_friends";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01cc:
        r2 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        goto L_0x07ee;
    L_0x01d0:
        r4 = "video_filters_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01d8:
        r2 = 62;
        goto L_0x07ee;
    L_0x01dc:
        r4 = "extra_friendmoji_mutable_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01e4:
        r2 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        goto L_0x07ee;
    L_0x01e8:
        r4 = "credits";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01f0:
        r2 = 29;
        goto L_0x07ee;
    L_0x01f4:
        r4 = "created";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x01fc:
        r2 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        goto L_0x07ee;
    L_0x0200:
        r4 = "unlockables_direct_auth_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0208:
        r2 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        goto L_0x07ee;
    L_0x020c:
        r4 = "camera2_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0214:
        r2 = 76;
        goto L_0x07ee;
    L_0x0218:
        r4 = "reset_disabled_transcoding_state";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0220:
        r2 = 13;
        goto L_0x07ee;
    L_0x0224:
        r4 = "bitmoji_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x022c:
        r2 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        goto L_0x07ee;
    L_0x0230:
        r4 = "suggestion_prompt_button_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0238:
        r2 = 60;
        goto L_0x07ee;
    L_0x023c:
        r4 = "raw_thumbnail_upload_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0244:
        r2 = 92;
        goto L_0x07ee;
    L_0x0248:
        r4 = "is_s2r_eligible";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0250:
        r2 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        goto L_0x07ee;
    L_0x0254:
        r4 = "should_call_to_verify_number";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x025c:
        r2 = 38;
        goto L_0x07ee;
    L_0x0260:
        r4 = "two_fa_verified_device_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0268:
        r2 = 96;
        goto L_0x07ee;
    L_0x026c:
        r4 = "contacts_resync_request";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0274:
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        goto L_0x07ee;
    L_0x0278:
        r4 = "mob_stories_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0280:
        r2 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        goto L_0x07ee;
    L_0x0284:
        r4 = "feature_settings_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x028c:
        r2 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        goto L_0x07ee;
    L_0x0290:
        r4 = "video_recording_transcoding_configuration";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0298:
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x07ee;
    L_0x029c:
        r4 = "gles3_allowed_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02a4:
        r2 = 77;
        goto L_0x07ee;
    L_0x02a8:
        r4 = "prestart_port";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02b0:
        r2 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        goto L_0x07ee;
    L_0x02b4:
        r4 = "mobile_verification_key";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02bc:
        r2 = 11;
        goto L_0x07ee;
    L_0x02c0:
        r4 = "qr_path";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02c8:
        r2 = 54;
        goto L_0x07ee;
    L_0x02cc:
        r4 = "searchable_by_phone_number";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02d4:
        r2 = 37;
        goto L_0x07ee;
    L_0x02d8:
        r4 = "nft_hi_timeout";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02e0:
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        goto L_0x07ee;
    L_0x02e4:
        r4 = "verified_shared_publications";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02ec:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x07ee;
    L_0x02f0:
        r4 = "client_prompt";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x02f8:
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        goto L_0x07ee;
    L_0x02fc:
        r4 = "chat_video_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0304:
        r2 = 84;
        goto L_0x07ee;
    L_0x0308:
        r4 = "two_fa_verified_devices";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0310:
        r2 = 97;
        goto L_0x07ee;
    L_0x0314:
        r4 = "bitmoji_snapcode_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x031c:
        r2 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        goto L_0x07ee;
    L_0x0320:
        r4 = "cash_customer_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0328:
        r2 = 49;
        goto L_0x07ee;
    L_0x032c:
        r4 = "last_updated";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0334:
        r2 = 32;
        goto L_0x07ee;
    L_0x0338:
        r4 = "cash_provider";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0340:
        r2 = 48;
        goto L_0x07ee;
    L_0x0344:
        r4 = "ad_preferences";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x034c:
        r2 = 44;
        goto L_0x07ee;
    L_0x0350:
        r4 = "sic_init";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0358:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x07ee;
    L_0x035c:
        r4 = "video_decoder_texcoord_transformation_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0364:
        r2 = 68;
        goto L_0x07ee;
    L_0x0368:
        r4 = "our_story_auths";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0370:
        r2 = 86;
        goto L_0x07ee;
    L_0x0374:
        r4 = "study_settings";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x037c:
        r2 = 46;
        goto L_0x07ee;
    L_0x0380:
        r4 = "voip_device_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0388:
        r2 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        goto L_0x07ee;
    L_0x038c:
        r4 = "snaps";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0394:
        r2 = 30;
        goto L_0x07ee;
    L_0x0398:
        r4 = "score";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03a0:
        r2 = 28;
        goto L_0x07ee;
    L_0x03a4:
        r4 = "ringing_sound";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03ac:
        r2 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        goto L_0x07ee;
    L_0x03b0:
        r4 = "email";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03b8:
        r2 = 9;
        goto L_0x07ee;
    L_0x03bc:
        r4 = "bests";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03c4:
        r2 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        goto L_0x07ee;
    L_0x03c8:
        r4 = "sent";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03d0:
        r2 = 26;
        goto L_0x07ee;
    L_0x03d4:
        r4 = "laguna_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03dc:
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        goto L_0x07ee;
    L_0x03e0:
        r4 = "last_address_book_updated_date";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03e8:
        r2 = 53;
        goto L_0x07ee;
    L_0x03ec:
        r4 = "video_thumbnail_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x03f4:
        r2 = 85;
        goto L_0x07ee;
    L_0x03f8:
        r4 = "prestart_prefix";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0400:
        r2 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        goto L_0x07ee;
    L_0x0404:
        r4 = "notification_privacy";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x040c:
        r2 = 23;
        goto L_0x07ee;
    L_0x0410:
        r4 = "user_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0418:
        r2 = 2;
        goto L_0x07ee;
    L_0x041b:
        r4 = "studio_serial_number";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0423:
        r2 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        goto L_0x07ee;
    L_0x0427:
        r4 = "suggestion_prompt_duration_in_millis";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x042f:
        r2 = 61;
        goto L_0x07ee;
    L_0x0433:
        r4 = "enable_lenses_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x043b:
        r2 = 16;
        goto L_0x07ee;
    L_0x043f:
        r4 = "camera1_take_photo_api_whitelisted_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0447:
        r2 = 75;
        goto L_0x07ee;
    L_0x044b:
        r4 = "added_friends_sync_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0453:
        r2 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        goto L_0x07ee;
    L_0x0457:
        r4 = "allowed_to_use_cash";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x045f:
        r2 = 50;
        goto L_0x07ee;
    L_0x0463:
        r4 = "registration_country_code";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x046b:
        r2 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        goto L_0x07ee;
    L_0x046f:
        r4 = "username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0477:
        r2 = 1;
        goto L_0x07ee;
    L_0x047a:
        r4 = "client_properties_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0482:
        r2 = 42;
        goto L_0x07ee;
    L_0x0486:
        r4 = "phone_number_country_code";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x048e:
        r2 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        goto L_0x07ee;
    L_0x0492:
        r4 = "ad_track_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x049a:
        r2 = 89;
        goto L_0x07ee;
    L_0x049e:
        r4 = "e_snap_media";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04a6:
        r2 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        goto L_0x07ee;
    L_0x04aa:
        r4 = "gcs_sampling";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04b2:
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x07ee;
    L_0x04b6:
        r4 = "is_cash_active";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04be:
        r2 = 47;
        goto L_0x07ee;
    L_0x04c2:
        r4 = "enable_separate_lens_list_for_back_camera";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04ca:
        r2 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        goto L_0x07ee;
    L_0x04ce:
        r4 = "display_username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04d6:
        r2 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        goto L_0x07ee;
    L_0x04da:
        r4 = "device_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04e2:
        r2 = 7;
        goto L_0x07ee;
    L_0x04e5:
        r4 = "friends";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04ed:
        r2 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        goto L_0x07ee;
    L_0x04f1:
        r4 = "iso3166_alpha2_country_code";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x04f9:
        r2 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        goto L_0x07ee;
    L_0x04fd:
        r4 = "added_friends_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0505:
        r2 = 33;
        goto L_0x07ee;
    L_0x0509:
        r4 = "is_otp_two_fa_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0511:
        r2 = 94;
        goto L_0x07ee;
    L_0x0515:
        r4 = "enable_video_transcoding_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x051d:
        r2 = 12;
        goto L_0x07ee;
    L_0x0521:
        r4 = "friendmoji_read_only_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0529:
        r2 = 99;
        goto L_0x07ee;
    L_0x052d:
        r4 = "enabled_lens_store_currencies";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0535:
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        goto L_0x07ee;
    L_0x0539:
        r4 = "snap_media_upload_connection_timeout";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0541:
        r2 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x07ee;
    L_0x0545:
        r4 = "notification_sound_setting";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x054d:
        r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        goto L_0x07ee;
    L_0x0551:
        r4 = "received";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0559:
        r2 = 27;
        goto L_0x07ee;
    L_0x055d:
        r4 = "samsung_aac_enc_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0565:
        r2 = 80;
        goto L_0x07ee;
    L_0x0569:
        r4 = "targeting";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0571:
        r2 = 87;
        goto L_0x07ee;
    L_0x0575:
        r4 = "enable_recording_hint_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x057d:
        r2 = 17;
        goto L_0x07ee;
    L_0x0581:
        r4 = "sc_media_recorder_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0589:
        r2 = 71;
        goto L_0x07ee;
    L_0x058d:
        r4 = "snap_p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0595:
        r2 = 22;
        goto L_0x07ee;
    L_0x0599:
        r4 = "d2s_media_download_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05a1:
        r2 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        goto L_0x07ee;
    L_0x05a5:
        r4 = "story_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05ad:
        r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        goto L_0x07ee;
    L_0x05b1:
        r4 = "transcoding_profile_level_configuration_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05b9:
        r2 = 15;
        goto L_0x07ee;
    L_0x05bd:
        r4 = "extra_friendmoji_read_only_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05c5:
        r2 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        goto L_0x07ee;
    L_0x05c9:
        r4 = "camera1_take_photo_api_blacklisted_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05d1:
        r2 = 74;
        goto L_0x07ee;
    L_0x05d5:
        r4 = "enabled_push_notifications";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05dd:
        r2 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        goto L_0x07ee;
    L_0x05e1:
        r4 = "mobile";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05e9:
        r2 = 10;
        goto L_0x07ee;
    L_0x05ed:
        r4 = "enable_ar_core_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x05f5:
        r2 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        goto L_0x07ee;
    L_0x05f9:
        r4 = "logged";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0601:
        r2 = 0;
        goto L_0x07ee;
    L_0x0604:
        r4 = "enable_save_story_to_gallery";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x060c:
        r2 = 20;
        goto L_0x07ee;
    L_0x0610:
        r4 = "amr_codec_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0618:
        r2 = 79;
        goto L_0x07ee;
    L_0x061c:
        r4 = "third_party_tracking_app_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0624:
        r2 = 52;
        goto L_0x07ee;
    L_0x0628:
        r4 = "business_account_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0630:
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        goto L_0x07ee;
    L_0x0634:
        r4 = "friends_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x063c:
        r2 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        goto L_0x07ee;
    L_0x0640:
        r4 = "prestart_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0648:
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        goto L_0x07ee;
    L_0x064c:
        r4 = "snapchat_phone_number";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0654:
        r2 = 36;
        goto L_0x07ee;
    L_0x0658:
        r4 = "friends_sync_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0660:
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        goto L_0x07ee;
    L_0x0664:
        r4 = "last_replayed_snap_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x066c:
        r2 = 35;
        goto L_0x07ee;
    L_0x0670:
        r4 = "reset_disabled_image_player_state";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0678:
        r2 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        goto L_0x07ee;
    L_0x067c:
        r4 = "sticker_visual_recommendation_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0684:
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x07ee;
    L_0x0688:
        r4 = "seen_tooltips";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0690:
        r2 = 40;
        goto L_0x07ee;
    L_0x0694:
        r4 = "quick_add_privacy";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x069c:
        r2 = 25;
        goto L_0x07ee;
    L_0x06a0:
        r4 = "friendmoji_blocked_keys";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06a8:
        r2 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        goto L_0x07ee;
    L_0x06ac:
        r4 = "friendmoji_mutable_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06b4:
        r2 = 98;
        goto L_0x07ee;
    L_0x06b8:
        r4 = "camera2_limited_level_high_resolution_photo_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06c0:
        r2 = 70;
        goto L_0x07ee;
    L_0x06c4:
        r4 = "suggestion_prompt_text";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06cc:
        r2 = 59;
        goto L_0x07ee;
    L_0x06d0:
        r4 = "suggestion_prompt_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06d8:
        r2 = 58;
        goto L_0x07ee;
    L_0x06dc:
        r4 = "blur_after_downscale_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06e4:
        r2 = 78;
        goto L_0x07ee;
    L_0x06e8:
        r4 = "ad_products";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06f0:
        r2 = 90;
        goto L_0x07ee;
    L_0x06f4:
        r4 = "image_player_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x06fc:
        r2 = 63;
        goto L_0x07ee;
    L_0x0700:
        r4 = "snap_media_upload_so_timeout";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0708:
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        goto L_0x07ee;
    L_0x070c:
        r4 = "blizzard_config";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0714:
        r2 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        goto L_0x07ee;
    L_0x0718:
        r4 = "front_camera_zoom_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0720:
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x07ee;
    L_0x0724:
        r4 = "fidelius_latest_beta";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x072c:
        r2 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        goto L_0x07ee;
    L_0x0730:
        r4 = "prestart_hostname";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0738:
        r2 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        goto L_0x07ee;
    L_0x073c:
        r4 = "number_of_best_friends";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0744:
        r2 = 45;
        goto L_0x07ee;
    L_0x0748:
        r4 = "pinnable_stickers_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0750:
        r2 = 69;
        goto L_0x07ee;
    L_0x0754:
        r4 = "audio_note_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x075c:
        r2 = 81;
        goto L_0x07ee;
    L_0x0760:
        r4 = "enabled_iap_currencies";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0768:
        r2 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        goto L_0x07ee;
    L_0x076c:
        r4 = "dirty_video_rendering_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0774:
        r2 = 67;
        goto L_0x07ee;
    L_0x0777:
        r4 = "android_media_recorder_surface_recording_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x077f:
        r2 = 73;
        goto L_0x07ee;
    L_0x0782:
        r4 = "ad_sources";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x078a:
        r2 = 88;
        goto L_0x07ee;
    L_0x078d:
        r4 = "favorite_stickers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x0795:
        r2 = 100;
        goto L_0x07ee;
    L_0x0798:
        r4 = "auth_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07a0:
        r2 = 6;
        goto L_0x07ee;
    L_0x07a2:
        r4 = "enable_location_mediacards";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07aa:
        r2 = 55;
        goto L_0x07ee;
    L_0x07ad:
        r4 = "feature_settings";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07b5:
        r2 = 43;
        goto L_0x07ee;
    L_0x07b8:
        r4 = "bitmoji_hide_download_prompt";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07c0:
        r2 = 4;
        goto L_0x07ee;
    L_0x07c2:
        r4 = "story_privacy";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07ca:
        r2 = 24;
        goto L_0x07ee;
    L_0x07cd:
        r4 = "reverse_filter_enabled_android";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07d5:
        r2 = 65;
        goto L_0x07ee;
    L_0x07d8:
        r4 = "bitmoji_avatar_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07e0:
        r2 = 3;
        goto L_0x07ee;
    L_0x07e2:
        r4 = "added_friends_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x07ed;
    L_0x07ea:
        r2 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        goto L_0x07ee;
    L_0x07ed:
        r2 = -1;
    L_0x07ee:
        switch(r2) {
            case 0: goto L_0x1f07;
            case 1: goto L_0x1ee9;
            case 2: goto L_0x1ecb;
            case 3: goto L_0x1ead;
            case 4: goto L_0x1e8b;
            case 5: goto L_0x1e68;
            case 6: goto L_0x1e49;
            case 7: goto L_0x1e2a;
            case 8: goto L_0x1e0b;
            case 9: goto L_0x1dec;
            case 10: goto L_0x1dcd;
            case 11: goto L_0x1dae;
            case 12: goto L_0x1d8b;
            case 13: goto L_0x1d6f;
            case 14: goto L_0x1d4c;
            case 15: goto L_0x1d29;
            case 16: goto L_0x1d06;
            case 17: goto L_0x1ce3;
            case 18: goto L_0x1cc0;
            case 19: goto L_0x1caa;
            case 20: goto L_0x1c87;
            case 21: goto L_0x1c68;
            case 22: goto L_0x1c52;
            case 23: goto L_0x1c3c;
            case 24: goto L_0x1c1d;
            case 25: goto L_0x1bfe;
            case 26: goto L_0x1be8;
            case 27: goto L_0x1bd2;
            case 28: goto L_0x1bbc;
            case 29: goto L_0x1ba6;
            case 30: goto L_0x1b67;
            case 31: goto L_0x1b2f;
            case 32: goto L_0x1b19;
            case 33: goto L_0x1b03;
            case 34: goto L_0x1aed;
            case 35: goto L_0x1ad7;
            case 36: goto L_0x1ab8;
            case 37: goto L_0x1a95;
            case 38: goto L_0x1a72;
            case 39: goto L_0x1a4f;
            case 40: goto L_0x1a17;
            case 41: goto L_0x19db;
            case 42: goto L_0x199c;
            case 43: goto L_0x1980;
            case 44: goto L_0x1964;
            case 45: goto L_0x194e;
            case 46: goto L_0x1912;
            case 47: goto L_0x18ef;
            case 48: goto L_0x18d0;
            case 49: goto L_0x18b1;
            case 50: goto L_0x1892;
            case 51: goto L_0x1873;
            case 52: goto L_0x1854;
            case 53: goto L_0x183e;
            case 54: goto L_0x181f;
            case 55: goto L_0x17fc;
            case 56: goto L_0x17d9;
            case 57: goto L_0x17b6;
            case 58: goto L_0x1797;
            case 59: goto L_0x1778;
            case 60: goto L_0x1759;
            case 61: goto L_0x1743;
            case 62: goto L_0x1720;
            case 63: goto L_0x16fd;
            case 64: goto L_0x16da;
            case 65: goto L_0x16b7;
            case 66: goto L_0x1694;
            case 67: goto L_0x1671;
            case 68: goto L_0x164e;
            case 69: goto L_0x162b;
            case 70: goto L_0x1608;
            case 71: goto L_0x15e5;
            case 72: goto L_0x15c2;
            case 73: goto L_0x159f;
            case 74: goto L_0x157c;
            case 75: goto L_0x1559;
            case 76: goto L_0x1536;
            case 77: goto L_0x1513;
            case 78: goto L_0x14f0;
            case 79: goto L_0x14cd;
            case 80: goto L_0x14aa;
            case 81: goto L_0x1487;
            case 82: goto L_0x1464;
            case 83: goto L_0x1441;
            case 84: goto L_0x141e;
            case 85: goto L_0x13fb;
            case 86: goto L_0x13bc;
            case 87: goto L_0x1380;
            case 88: goto L_0x1364;
            case 89: goto L_0x1348;
            case 90: goto L_0x132c;
            case 91: goto L_0x12f4;
            case 92: goto L_0x12d1;
            case 93: goto L_0x12ae;
            case 94: goto L_0x128b;
            case 95: goto L_0x1268;
            case 96: goto L_0x1252;
            case 97: goto L_0x1213;
            case 98: goto L_0x11d4;
            case 99: goto L_0x1195;
            case 100: goto L_0x1156;
            case 101: goto L_0x1117;
            case 102: goto L_0x10df;
            case 103: goto L_0x10a7;
            case 104: goto L_0x108b;
            case 105: goto L_0x106c;
            case 106: goto L_0x104d;
            case 107: goto L_0x1037;
            case 108: goto L_0x1021;
            case 109: goto L_0x100b;
            case 110: goto L_0x0ff5;
            case 111: goto L_0x0fd6;
            case 112: goto L_0x0fba;
            case 113: goto L_0x0f97;
            case 114: goto L_0x0f74;
            case 115: goto L_0x0f58;
            case 116: goto L_0x0f42;
            case 117: goto L_0x0f1f;
            case 118: goto L_0x0f00;
            case 119: goto L_0x0edd;
            case 120: goto L_0x0eba;
            case 121: goto L_0x0ea3;
            case 122: goto L_0x0e8c;
            case 123: goto L_0x0e6d;
            case 124: goto L_0x0e4e;
            case 125: goto L_0x0e2f;
            case 126: goto L_0x0e0c;
            case 127: goto L_0x0de9;
            case 128: goto L_0x0dca;
            case 129: goto L_0x0dab;
            case 130: goto L_0x0d8c;
            case 131: goto L_0x0d6d;
            case 132: goto L_0x0d2e;
            case 133: goto L_0x0d0f;
            case 134: goto L_0x0cf3;
            case 135: goto L_0x0cbb;
            case 136: goto L_0x0c7c;
            case 137: goto L_0x0c66;
            case 138: goto L_0x0c4a;
            case 139: goto L_0x0c27;
            case 140: goto L_0x0c08;
            case 141: goto L_0x0be9;
            case 142: goto L_0x0bc6;
            case 143: goto L_0x0ba7;
            case 144: goto L_0x0b88;
            case 145: goto L_0x0b65;
            case 146: goto L_0x0b46;
            case 147: goto L_0x0b30;
            case 148: goto L_0x0b14;
            case 149: goto L_0x0af1;
            case 150: goto L_0x0ad2;
            case 151: goto L_0x0a6c;
            case 152: goto L_0x0a49;
            case 153: goto L_0x0a26;
            case 154: goto L_0x0a07;
            case 155: goto L_0x09e4;
            case 156: goto L_0x09c5;
            case 157: goto L_0x09a6;
            case 158: goto L_0x0967;
            case 159: goto L_0x0948;
            case 160: goto L_0x0929;
            case 161: goto L_0x08ea;
            case 162: goto L_0x08b2;
            case 163: goto L_0x0873;
            case 164: goto L_0x0834;
            case 165: goto L_0x0815;
            case 166: goto L_0x07f6;
            default: goto L_0x07f1;
        };
    L_0x07f1:
        r9.skipValue();
        goto L_0x0019;
    L_0x07f6:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0800;
    L_0x07fe:
        goto L_0x1f0f;
    L_0x0800:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x080d;
    L_0x0804:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0811;
    L_0x080d:
        r2 = r9.nextString();
    L_0x0811:
        r0.i = r2;
        goto L_0x0019;
    L_0x0815:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x081f;
    L_0x081d:
        goto L_0x1f0f;
    L_0x081f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x082c;
    L_0x0823:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0830;
    L_0x082c:
        r2 = r9.nextString();
    L_0x0830:
        r0.h = r2;
        goto L_0x0019;
    L_0x0834:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x083e;
    L_0x083c:
        goto L_0x1f0f;
    L_0x083e:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.h;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r9.beginObject();
    L_0x084e:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x086c;
    L_0x0854:
        r4 = r9.nextName();
        r5 = r9.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x0864;
    L_0x0860:
        r9.nextNull();
        goto L_0x084e;
    L_0x0864:
        r5 = r3.read(r9);
        r2.put(r4, r5);
        goto L_0x084e;
    L_0x086c:
        r9.endObject();
        r0.g = r2;
        goto L_0x0019;
    L_0x0873:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x087d;
    L_0x087b:
        goto L_0x1f0f;
    L_0x087d:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.h;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r9.beginObject();
    L_0x088d:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x08ab;
    L_0x0893:
        r4 = r9.nextName();
        r5 = r9.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x08a3;
    L_0x089f:
        r9.nextNull();
        goto L_0x088d;
    L_0x08a3:
        r5 = r3.read(r9);
        r2.put(r4, r5);
        goto L_0x088d;
    L_0x08ab:
        r9.endObject();
        r0.f = r2;
        goto L_0x0019;
    L_0x08b2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x08bc;
    L_0x08ba:
        goto L_0x1f0f;
    L_0x08bc:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x08c0:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x08c8:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x08e3;
    L_0x08ce:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x08db;
    L_0x08d2:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x08df;
    L_0x08db:
        r4 = r9.nextString();
    L_0x08df:
        r3.add(r4);
        goto L_0x08c8;
    L_0x08e3:
        r9.endArray();
        r0.e = r3;
        goto L_0x0019;
    L_0x08ea:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x08f4;
    L_0x08f2:
        goto L_0x1f0f;
    L_0x08f4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x08f8:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.l;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0908:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0922;
    L_0x090e:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x091a;
    L_0x0916:
        r9.nextNull();
        goto L_0x0908;
    L_0x091a:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0908;
    L_0x0922:
        r9.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x0929:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0933;
    L_0x0931:
        goto L_0x1f0f;
    L_0x0933:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0940;
    L_0x0937:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0944;
    L_0x0940:
        r2 = r9.nextString();
    L_0x0944:
        r0.c = r2;
        goto L_0x0019;
    L_0x0948:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0952;
    L_0x0950:
        goto L_0x1f0f;
    L_0x0952:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x095f;
    L_0x0956:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0963;
    L_0x095f:
        r2 = r9.nextString();
    L_0x0963:
        r0.b = r2;
        goto L_0x0019;
    L_0x0967:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0971;
    L_0x096f:
        goto L_0x1f0f;
    L_0x0971:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0975:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.l;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0985:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x099f;
    L_0x098b:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0997;
    L_0x0993:
        r9.nextNull();
        goto L_0x0985;
    L_0x0997:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0985;
    L_0x099f:
        r9.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x09a6:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x09b0;
    L_0x09ae:
        goto L_0x1f0f;
    L_0x09b0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x09bd;
    L_0x09b4:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x09c1;
    L_0x09bd:
        r2 = r9.nextString();
    L_0x09c1:
        r0.cr = r2;
        goto L_0x0019;
    L_0x09c5:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x09cf;
    L_0x09cd:
        goto L_0x1f0f;
    L_0x09cf:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x09dc;
    L_0x09d3:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x09e0;
    L_0x09dc:
        r2 = r9.nextString();
    L_0x09e0:
        r0.cq = r2;
        goto L_0x0019;
    L_0x09e4:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x09ee;
    L_0x09ec:
        goto L_0x1f0f;
    L_0x09ee:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x09fb;
    L_0x09f2:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x09ff;
    L_0x09fb:
        r2 = r9.nextBoolean();
    L_0x09ff:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.cp = r2;
        goto L_0x0019;
    L_0x0a07:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a11;
    L_0x0a0f:
        goto L_0x1f0f;
    L_0x0a11:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0a1e;
    L_0x0a15:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0a22;
    L_0x0a1e:
        r2 = r9.nextString();
    L_0x0a22:
        r0.co = r2;
        goto L_0x0019;
    L_0x0a26:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a30;
    L_0x0a2e:
        goto L_0x1f0f;
    L_0x0a30:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0a3d;
    L_0x0a34:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0a41;
    L_0x0a3d:
        r2 = r9.nextBoolean();
    L_0x0a41:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.cn = r2;
        goto L_0x0019;
    L_0x0a49:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a53;
    L_0x0a51:
        goto L_0x1f0f;
    L_0x0a53:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0a60;
    L_0x0a57:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0a64;
    L_0x0a60:
        r2 = r9.nextBoolean();
    L_0x0a64:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.cm = r2;
        goto L_0x0019;
    L_0x0a6c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0a76;
    L_0x0a74:
        goto L_0x1f0f;
    L_0x0a76:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.v;
        r3.get();
        r9.beginObject();
    L_0x0a83:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x0acb;
    L_0x0a89:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0a99;
    L_0x0a95:
        r9.nextNull();
        goto L_0x0a83;
    L_0x0a99:
        r4 = new com.google.gson.internal.LinkedTreeMap;
        r4.<init>();
        r9.beginObject();
    L_0x0aa1:
        r5 = r9.hasNext();
        if (r5 == 0) goto L_0x0ac4;
    L_0x0aa7:
        r5 = r9.nextName();
        r6 = r9.peek();
        r7 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r6 != r7) goto L_0x0abc;
    L_0x0ab3:
        r6 = r9.nextBoolean();
        r6 = java.lang.Boolean.toString(r6);
        goto L_0x0ac0;
    L_0x0abc:
        r6 = r9.nextString();
    L_0x0ac0:
        r4.put(r5, r6);
        goto L_0x0aa1;
    L_0x0ac4:
        r9.endObject();
        r2.put(r3, r4);
        goto L_0x0a83;
    L_0x0acb:
        r9.endObject();
        r0.cl = r2;
        goto L_0x0019;
    L_0x0ad2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0adc;
    L_0x0ada:
        goto L_0x1f0f;
    L_0x0adc:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0ae9;
    L_0x0ae0:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0aed;
    L_0x0ae9:
        r2 = r9.nextString();
    L_0x0aed:
        r0.ck = r2;
        goto L_0x0019;
    L_0x0af1:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0afb;
    L_0x0af9:
        goto L_0x1f0f;
    L_0x0afb:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0b08;
    L_0x0aff:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0b0c;
    L_0x0b08:
        r2 = r9.nextBoolean();
    L_0x0b0c:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.cj = r2;
        goto L_0x0019;
    L_0x0b14:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b1e;
    L_0x0b1c:
        goto L_0x1f0f;
    L_0x0b1e:
        r2 = r8.s;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aich) r2;
        r0.ci = r2;
        goto L_0x0019;
    L_0x0b30:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b3a;
    L_0x0b38:
        goto L_0x1f0f;
    L_0x0b3a:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.ch = r2;
        goto L_0x0019;
    L_0x0b46:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b50;
    L_0x0b4e:
        goto L_0x1f0f;
    L_0x0b50:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0b5d;
    L_0x0b54:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0b61;
    L_0x0b5d:
        r2 = r9.nextString();
    L_0x0b61:
        r0.cg = r2;
        goto L_0x0019;
    L_0x0b65:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b6f;
    L_0x0b6d:
        goto L_0x1f0f;
    L_0x0b6f:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0b7c;
    L_0x0b73:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0b80;
    L_0x0b7c:
        r2 = r9.nextBoolean();
    L_0x0b80:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.cf = r2;
        goto L_0x0019;
    L_0x0b88:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0b92;
    L_0x0b90:
        goto L_0x1f0f;
    L_0x0b92:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0b9f;
    L_0x0b96:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0ba3;
    L_0x0b9f:
        r2 = r9.nextString();
    L_0x0ba3:
        r0.ce = r2;
        goto L_0x0019;
    L_0x0ba7:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0bb1;
    L_0x0baf:
        goto L_0x1f0f;
    L_0x0bb1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0bbe;
    L_0x0bb5:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0bc2;
    L_0x0bbe:
        r2 = r9.nextString();
    L_0x0bc2:
        r0.cd = r2;
        goto L_0x0019;
    L_0x0bc6:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0bd0;
    L_0x0bce:
        goto L_0x1f0f;
    L_0x0bd0:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0bdd;
    L_0x0bd4:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0be1;
    L_0x0bdd:
        r2 = r9.nextBoolean();
    L_0x0be1:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.cc = r2;
        goto L_0x0019;
    L_0x0be9:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0bf3;
    L_0x0bf1:
        goto L_0x1f0f;
    L_0x0bf3:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0c00;
    L_0x0bf7:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0c04;
    L_0x0c00:
        r2 = r9.nextString();
    L_0x0c04:
        r0.cb = r2;
        goto L_0x0019;
    L_0x0c08:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c12;
    L_0x0c10:
        goto L_0x1f0f;
    L_0x0c12:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0c1f;
    L_0x0c16:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0c23;
    L_0x0c1f:
        r2 = r9.nextString();
    L_0x0c23:
        r0.ca = r2;
        goto L_0x0019;
    L_0x0c27:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c31;
    L_0x0c2f:
        goto L_0x1f0f;
    L_0x0c31:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0c3e;
    L_0x0c35:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0c42;
    L_0x0c3e:
        r2 = r9.nextBoolean();
    L_0x0c42:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bZ = r2;
        goto L_0x0019;
    L_0x0c4a:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c54;
    L_0x0c52:
        goto L_0x1f0f;
    L_0x0c54:
        r2 = r8.q;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aewi) r2;
        r0.bY = r2;
        goto L_0x0019;
    L_0x0c66:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c70;
    L_0x0c6e:
        goto L_0x1f0f;
    L_0x0c70:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.bX = r2;
        goto L_0x0019;
    L_0x0c7c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0c86;
    L_0x0c84:
        goto L_0x1f0f;
    L_0x0c86:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0c8a:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.p;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0c9a:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0cb4;
    L_0x0ca0:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0cac;
    L_0x0ca8:
        r9.nextNull();
        goto L_0x0c9a;
    L_0x0cac:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0c9a;
    L_0x0cb4:
        r9.endArray();
        r0.bW = r2;
        goto L_0x0019;
    L_0x0cbb:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0cc5;
    L_0x0cc3:
        goto L_0x1f0f;
    L_0x0cc5:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0cc9:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0cd1:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0cec;
    L_0x0cd7:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0ce4;
    L_0x0cdb:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0ce8;
    L_0x0ce4:
        r4 = r9.nextString();
    L_0x0ce8:
        r3.add(r4);
        goto L_0x0cd1;
    L_0x0cec:
        r9.endArray();
        r0.bV = r3;
        goto L_0x0019;
    L_0x0cf3:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0cfd;
    L_0x0cfb:
        goto L_0x1f0f;
    L_0x0cfd:
        r2 = r8.f;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.agaa) r2;
        r0.bU = r2;
        goto L_0x0019;
    L_0x0d0f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0d19;
    L_0x0d17:
        goto L_0x1f0f;
    L_0x0d19:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0d26;
    L_0x0d1d:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0d2a;
    L_0x0d26:
        r2 = r9.nextString();
    L_0x0d2a:
        r0.bT = r2;
        goto L_0x0019;
    L_0x0d2e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0d38;
    L_0x0d36:
        goto L_0x1f0f;
    L_0x0d38:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0d3c:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.j;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0d4c:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0d66;
    L_0x0d52:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0d5e;
    L_0x0d5a:
        r9.nextNull();
        goto L_0x0d4c;
    L_0x0d5e:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0d4c;
    L_0x0d66:
        r9.endArray();
        r0.bS = r2;
        goto L_0x0019;
    L_0x0d6d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0d77;
    L_0x0d75:
        goto L_0x1f0f;
    L_0x0d77:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0d84;
    L_0x0d7b:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0d88;
    L_0x0d84:
        r2 = r9.nextString();
    L_0x0d88:
        r0.bR = r2;
        goto L_0x0019;
    L_0x0d8c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0d96;
    L_0x0d94:
        goto L_0x1f0f;
    L_0x0d96:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0da3;
    L_0x0d9a:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0da7;
    L_0x0da3:
        r2 = r9.nextString();
    L_0x0da7:
        r0.bQ = r2;
        goto L_0x0019;
    L_0x0dab:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0db5;
    L_0x0db3:
        goto L_0x1f0f;
    L_0x0db5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0dc2;
    L_0x0db9:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0dc6;
    L_0x0dc2:
        r2 = r9.nextString();
    L_0x0dc6:
        r0.bP = r2;
        goto L_0x0019;
    L_0x0dca:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0dd4;
    L_0x0dd2:
        goto L_0x1f0f;
    L_0x0dd4:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0de1;
    L_0x0dd8:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0de5;
    L_0x0de1:
        r2 = r9.nextString();
    L_0x0de5:
        r0.bO = r2;
        goto L_0x0019;
    L_0x0de9:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0df3;
    L_0x0df1:
        goto L_0x1f0f;
    L_0x0df3:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0e00;
    L_0x0df7:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0e04;
    L_0x0e00:
        r2 = r9.nextBoolean();
    L_0x0e04:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bN = r2;
        goto L_0x0019;
    L_0x0e0c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0e16;
    L_0x0e14:
        goto L_0x1f0f;
    L_0x0e16:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0e23;
    L_0x0e1a:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0e27;
    L_0x0e23:
        r2 = r9.nextBoolean();
    L_0x0e27:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bM = r2;
        goto L_0x0019;
    L_0x0e2f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0e39;
    L_0x0e37:
        goto L_0x1f0f;
    L_0x0e39:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0e46;
    L_0x0e3d:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0e4a;
    L_0x0e46:
        r2 = r9.nextString();
    L_0x0e4a:
        r0.bL = r2;
        goto L_0x0019;
    L_0x0e4e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0e58;
    L_0x0e56:
        goto L_0x1f0f;
    L_0x0e58:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0e65;
    L_0x0e5c:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0e69;
    L_0x0e65:
        r2 = r9.nextString();
    L_0x0e69:
        r0.bK = r2;
        goto L_0x0019;
    L_0x0e6d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0e77;
    L_0x0e75:
        goto L_0x1f0f;
    L_0x0e77:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0e84;
    L_0x0e7b:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0e88;
    L_0x0e84:
        r2 = r9.nextString();
    L_0x0e88:
        r0.bJ = r2;
        goto L_0x0019;
    L_0x0e8c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0e96;
    L_0x0e94:
        goto L_0x1f0f;
    L_0x0e96:
        r2 = r9.nextDouble();
        r2 = (float) r2;
        r2 = java.lang.Float.valueOf(r2);
        r0.bI = r2;
        goto L_0x0019;
    L_0x0ea3:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0ead;
    L_0x0eab:
        goto L_0x1f0f;
    L_0x0ead:
        r2 = r9.nextDouble();
        r2 = (float) r2;
        r2 = java.lang.Float.valueOf(r2);
        r0.bH = r2;
        goto L_0x0019;
    L_0x0eba:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0ec4;
    L_0x0ec2:
        goto L_0x1f0f;
    L_0x0ec4:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0ed1;
    L_0x0ec8:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0ed5;
    L_0x0ed1:
        r2 = r9.nextBoolean();
    L_0x0ed5:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bG = r2;
        goto L_0x0019;
    L_0x0edd:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0ee7;
    L_0x0ee5:
        goto L_0x1f0f;
    L_0x0ee7:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0ef4;
    L_0x0eeb:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0ef8;
    L_0x0ef4:
        r2 = r9.nextBoolean();
    L_0x0ef8:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bF = r2;
        goto L_0x0019;
    L_0x0f00:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0f0a;
    L_0x0f08:
        goto L_0x1f0f;
    L_0x0f0a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0f17;
    L_0x0f0e:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0f1b;
    L_0x0f17:
        r2 = r9.nextString();
    L_0x0f1b:
        r0.bE = r2;
        goto L_0x0019;
    L_0x0f1f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0f29;
    L_0x0f27:
        goto L_0x1f0f;
    L_0x0f29:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0f36;
    L_0x0f2d:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0f3a;
    L_0x0f36:
        r2 = r9.nextBoolean();
    L_0x0f3a:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bD = r2;
        goto L_0x0019;
    L_0x0f42:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0f4c;
    L_0x0f4a:
        goto L_0x1f0f;
    L_0x0f4c:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.bC = r2;
        goto L_0x0019;
    L_0x0f58:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0f62;
    L_0x0f60:
        goto L_0x1f0f;
    L_0x0f62:
        r2 = r8.u;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.afgf) r2;
        r0.bB = r2;
        goto L_0x0019;
    L_0x0f74:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0f7e;
    L_0x0f7c:
        goto L_0x1f0f;
    L_0x0f7e:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0f8b;
    L_0x0f82:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0f8f;
    L_0x0f8b:
        r2 = r9.nextBoolean();
    L_0x0f8f:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bA = r2;
        goto L_0x0019;
    L_0x0f97:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0fa1;
    L_0x0f9f:
        goto L_0x1f0f;
    L_0x0fa1:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0fae;
    L_0x0fa5:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0fb2;
    L_0x0fae:
        r2 = r9.nextBoolean();
    L_0x0fb2:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bz = r2;
        goto L_0x0019;
    L_0x0fba:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0fc4;
    L_0x0fc2:
        goto L_0x1f0f;
    L_0x0fc4:
        r2 = r8.n;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.ahga) r2;
        r0.by = r2;
        goto L_0x0019;
    L_0x0fd6:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0fe0;
    L_0x0fde:
        goto L_0x1f0f;
    L_0x0fe0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0fed;
    L_0x0fe4:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0ff1;
    L_0x0fed:
        r2 = r9.nextString();
    L_0x0ff1:
        r0.bx = r2;
        goto L_0x0019;
    L_0x0ff5:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0fff;
    L_0x0ffd:
        goto L_0x1f0f;
    L_0x0fff:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.bw = r2;
        goto L_0x0019;
    L_0x100b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1015;
    L_0x1013:
        goto L_0x1f0f;
    L_0x1015:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.bv = r2;
        goto L_0x0019;
    L_0x1021:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x102b;
    L_0x1029:
        goto L_0x1f0f;
    L_0x102b:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.bu = r2;
        goto L_0x0019;
    L_0x1037:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1041;
    L_0x103f:
        goto L_0x1f0f;
    L_0x1041:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.bt = r2;
        goto L_0x0019;
    L_0x104d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1057;
    L_0x1055:
        goto L_0x1f0f;
    L_0x1057:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1064;
    L_0x105b:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1068;
    L_0x1064:
        r2 = r9.nextString();
    L_0x1068:
        r0.bs = r2;
        goto L_0x0019;
    L_0x106c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1076;
    L_0x1074:
        goto L_0x1f0f;
    L_0x1076:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1083;
    L_0x107a:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1087;
    L_0x1083:
        r2 = r9.nextString();
    L_0x1087:
        r0.br = r2;
        goto L_0x0019;
    L_0x108b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1095;
    L_0x1093:
        goto L_0x1f0f;
    L_0x1095:
        r2 = r8.p;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aevd) r2;
        r0.bq = r2;
        goto L_0x0019;
    L_0x10a7:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x10b1;
    L_0x10af:
        goto L_0x1f0f;
    L_0x10b1:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x10b5:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x10bd:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x10d8;
    L_0x10c3:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x10d0;
    L_0x10c7:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x10d4;
    L_0x10d0:
        r4 = r9.nextString();
    L_0x10d4:
        r3.add(r4);
        goto L_0x10bd;
    L_0x10d8:
        r9.endArray();
        r0.bp = r3;
        goto L_0x0019;
    L_0x10df:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x10e9;
    L_0x10e7:
        goto L_0x1f0f;
    L_0x10e9:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x10ed:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x10f5:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x1110;
    L_0x10fb:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x1108;
    L_0x10ff:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x110c;
    L_0x1108:
        r4 = r9.nextString();
    L_0x110c:
        r3.add(r4);
        goto L_0x10f5;
    L_0x1110:
        r9.endArray();
        r0.bo = r3;
        goto L_0x0019;
    L_0x1117:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1121;
    L_0x111f:
        goto L_0x1f0f;
    L_0x1121:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x1125:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.t;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x1135:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x114f;
    L_0x113b:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x1147;
    L_0x1143:
        r9.nextNull();
        goto L_0x1135;
    L_0x1147:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x1135;
    L_0x114f:
        r9.endArray();
        r0.bn = r2;
        goto L_0x0019;
    L_0x1156:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1160;
    L_0x115e:
        goto L_0x1f0f;
    L_0x1160:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x1164:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.i;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x1174:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x118e;
    L_0x117a:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x1186;
    L_0x1182:
        r9.nextNull();
        goto L_0x1174;
    L_0x1186:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x1174;
    L_0x118e:
        r9.endArray();
        r0.bm = r2;
        goto L_0x0019;
    L_0x1195:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x119f;
    L_0x119d:
        goto L_0x1f0f;
    L_0x119f:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.h;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r9.beginObject();
    L_0x11af:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x11cd;
    L_0x11b5:
        r4 = r9.nextName();
        r5 = r9.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x11c5;
    L_0x11c1:
        r9.nextNull();
        goto L_0x11af;
    L_0x11c5:
        r5 = r3.read(r9);
        r2.put(r4, r5);
        goto L_0x11af;
    L_0x11cd:
        r9.endObject();
        r0.bl = r2;
        goto L_0x0019;
    L_0x11d4:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x11de;
    L_0x11dc:
        goto L_0x1f0f;
    L_0x11de:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.h;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r9.beginObject();
    L_0x11ee:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x120c;
    L_0x11f4:
        r4 = r9.nextName();
        r5 = r9.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x1204;
    L_0x1200:
        r9.nextNull();
        goto L_0x11ee;
    L_0x1204:
        r5 = r3.read(r9);
        r2.put(r4, r5);
        goto L_0x11ee;
    L_0x120c:
        r9.endObject();
        r0.bk = r2;
        goto L_0x0019;
    L_0x1213:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x121d;
    L_0x121b:
        goto L_0x1f0f;
    L_0x121d:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x1221:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.r;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x1231:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x124b;
    L_0x1237:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x1243;
    L_0x123f:
        r9.nextNull();
        goto L_0x1231;
    L_0x1243:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x1231;
    L_0x124b:
        r9.endArray();
        r0.bj = r2;
        goto L_0x0019;
    L_0x1252:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x125c;
    L_0x125a:
        goto L_0x1f0f;
    L_0x125c:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.bi = r2;
        goto L_0x0019;
    L_0x1268:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1272;
    L_0x1270:
        goto L_0x1f0f;
    L_0x1272:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x127f;
    L_0x1276:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1283;
    L_0x127f:
        r2 = r9.nextBoolean();
    L_0x1283:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bh = r2;
        goto L_0x0019;
    L_0x128b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1295;
    L_0x1293:
        goto L_0x1f0f;
    L_0x1295:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x12a2;
    L_0x1299:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x12a6;
    L_0x12a2:
        r2 = r9.nextBoolean();
    L_0x12a6:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bg = r2;
        goto L_0x0019;
    L_0x12ae:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x12b8;
    L_0x12b6:
        goto L_0x1f0f;
    L_0x12b8:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x12c5;
    L_0x12bc:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x12c9;
    L_0x12c5:
        r2 = r9.nextBoolean();
    L_0x12c9:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.bf = r2;
        goto L_0x0019;
    L_0x12d1:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x12db;
    L_0x12d9:
        goto L_0x1f0f;
    L_0x12db:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x12e8;
    L_0x12df:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x12ec;
    L_0x12e8:
        r2 = r9.nextBoolean();
    L_0x12ec:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.be = r2;
        goto L_0x0019;
    L_0x12f4:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x12fe;
    L_0x12fc:
        goto L_0x1f0f;
    L_0x12fe:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x1302:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x130a:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x1325;
    L_0x1310:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x131d;
    L_0x1314:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x1321;
    L_0x131d:
        r4 = r9.nextString();
    L_0x1321:
        r3.add(r4);
        goto L_0x130a;
    L_0x1325:
        r9.endArray();
        r0.bd = r3;
        goto L_0x0019;
    L_0x132c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1336;
    L_0x1334:
        goto L_0x1f0f;
    L_0x1336:
        r2 = r8.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.afhf) r2;
        r0.bc = r2;
        goto L_0x0019;
    L_0x1348:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1352;
    L_0x1350:
        goto L_0x1f0f;
    L_0x1352:
        r2 = r8.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aecp) r2;
        r0.bb = r2;
        goto L_0x0019;
    L_0x1364:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x136e;
    L_0x136c:
        goto L_0x1f0f;
    L_0x136e:
        r2 = r8.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aecn) r2;
        r0.ba = r2;
        goto L_0x0019;
    L_0x1380:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x138a;
    L_0x1388:
        goto L_0x1f0f;
    L_0x138a:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x1392:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x13b5;
    L_0x1398:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x13ad;
    L_0x13a4:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x13b1;
    L_0x13ad:
        r4 = r9.nextString();
    L_0x13b1:
        r2.put(r3, r4);
        goto L_0x1392;
    L_0x13b5:
        r9.endObject();
        r0.aZ = r2;
        goto L_0x0019;
    L_0x13bc:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x13c6;
    L_0x13c4:
        goto L_0x1f0f;
    L_0x13c6:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x13ca:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.o;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x13da:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x13f4;
    L_0x13e0:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x13ec;
    L_0x13e8:
        r9.nextNull();
        goto L_0x13da;
    L_0x13ec:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x13da;
    L_0x13f4:
        r9.endArray();
        r0.aY = r2;
        goto L_0x0019;
    L_0x13fb:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1405;
    L_0x1403:
        goto L_0x1f0f;
    L_0x1405:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1412;
    L_0x1409:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1416;
    L_0x1412:
        r2 = r9.nextBoolean();
    L_0x1416:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aX = r2;
        goto L_0x0019;
    L_0x141e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1428;
    L_0x1426:
        goto L_0x1f0f;
    L_0x1428:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1435;
    L_0x142c:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1439;
    L_0x1435:
        r2 = r9.nextBoolean();
    L_0x1439:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aW = r2;
        goto L_0x0019;
    L_0x1441:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x144b;
    L_0x1449:
        goto L_0x1f0f;
    L_0x144b:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1458;
    L_0x144f:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x145c;
    L_0x1458:
        r2 = r9.nextBoolean();
    L_0x145c:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aV = r2;
        goto L_0x0019;
    L_0x1464:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x146e;
    L_0x146c:
        goto L_0x1f0f;
    L_0x146e:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x147b;
    L_0x1472:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x147f;
    L_0x147b:
        r2 = r9.nextBoolean();
    L_0x147f:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aU = r2;
        goto L_0x0019;
    L_0x1487:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1491;
    L_0x148f:
        goto L_0x1f0f;
    L_0x1491:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x149e;
    L_0x1495:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x14a2;
    L_0x149e:
        r2 = r9.nextBoolean();
    L_0x14a2:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aT = r2;
        goto L_0x0019;
    L_0x14aa:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x14b4;
    L_0x14b2:
        goto L_0x1f0f;
    L_0x14b4:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x14c1;
    L_0x14b8:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x14c5;
    L_0x14c1:
        r2 = r9.nextBoolean();
    L_0x14c5:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aS = r2;
        goto L_0x0019;
    L_0x14cd:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x14d7;
    L_0x14d5:
        goto L_0x1f0f;
    L_0x14d7:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x14e4;
    L_0x14db:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x14e8;
    L_0x14e4:
        r2 = r9.nextBoolean();
    L_0x14e8:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aR = r2;
        goto L_0x0019;
    L_0x14f0:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x14fa;
    L_0x14f8:
        goto L_0x1f0f;
    L_0x14fa:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1507;
    L_0x14fe:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x150b;
    L_0x1507:
        r2 = r9.nextBoolean();
    L_0x150b:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aQ = r2;
        goto L_0x0019;
    L_0x1513:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x151d;
    L_0x151b:
        goto L_0x1f0f;
    L_0x151d:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x152a;
    L_0x1521:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x152e;
    L_0x152a:
        r2 = r9.nextBoolean();
    L_0x152e:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aP = r2;
        goto L_0x0019;
    L_0x1536:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1540;
    L_0x153e:
        goto L_0x1f0f;
    L_0x1540:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x154d;
    L_0x1544:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1551;
    L_0x154d:
        r2 = r9.nextBoolean();
    L_0x1551:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aO = r2;
        goto L_0x0019;
    L_0x1559:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1563;
    L_0x1561:
        goto L_0x1f0f;
    L_0x1563:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1570;
    L_0x1567:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1574;
    L_0x1570:
        r2 = r9.nextBoolean();
    L_0x1574:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aN = r2;
        goto L_0x0019;
    L_0x157c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1586;
    L_0x1584:
        goto L_0x1f0f;
    L_0x1586:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1593;
    L_0x158a:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1597;
    L_0x1593:
        r2 = r9.nextBoolean();
    L_0x1597:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aM = r2;
        goto L_0x0019;
    L_0x159f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x15a9;
    L_0x15a7:
        goto L_0x1f0f;
    L_0x15a9:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x15b6;
    L_0x15ad:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x15ba;
    L_0x15b6:
        r2 = r9.nextBoolean();
    L_0x15ba:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aL = r2;
        goto L_0x0019;
    L_0x15c2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x15cc;
    L_0x15ca:
        goto L_0x1f0f;
    L_0x15cc:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x15d9;
    L_0x15d0:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x15dd;
    L_0x15d9:
        r2 = r9.nextBoolean();
    L_0x15dd:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aK = r2;
        goto L_0x0019;
    L_0x15e5:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x15ef;
    L_0x15ed:
        goto L_0x1f0f;
    L_0x15ef:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x15fc;
    L_0x15f3:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1600;
    L_0x15fc:
        r2 = r9.nextBoolean();
    L_0x1600:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aJ = r2;
        goto L_0x0019;
    L_0x1608:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1612;
    L_0x1610:
        goto L_0x1f0f;
    L_0x1612:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x161f;
    L_0x1616:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1623;
    L_0x161f:
        r2 = r9.nextBoolean();
    L_0x1623:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aI = r2;
        goto L_0x0019;
    L_0x162b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1635;
    L_0x1633:
        goto L_0x1f0f;
    L_0x1635:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1642;
    L_0x1639:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1646;
    L_0x1642:
        r2 = r9.nextBoolean();
    L_0x1646:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aH = r2;
        goto L_0x0019;
    L_0x164e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1658;
    L_0x1656:
        goto L_0x1f0f;
    L_0x1658:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1665;
    L_0x165c:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1669;
    L_0x1665:
        r2 = r9.nextBoolean();
    L_0x1669:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aG = r2;
        goto L_0x0019;
    L_0x1671:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x167b;
    L_0x1679:
        goto L_0x1f0f;
    L_0x167b:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1688;
    L_0x167f:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x168c;
    L_0x1688:
        r2 = r9.nextBoolean();
    L_0x168c:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aF = r2;
        goto L_0x0019;
    L_0x1694:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x169e;
    L_0x169c:
        goto L_0x1f0f;
    L_0x169e:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x16ab;
    L_0x16a2:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x16af;
    L_0x16ab:
        r2 = r9.nextBoolean();
    L_0x16af:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aE = r2;
        goto L_0x0019;
    L_0x16b7:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x16c1;
    L_0x16bf:
        goto L_0x1f0f;
    L_0x16c1:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x16ce;
    L_0x16c5:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x16d2;
    L_0x16ce:
        r2 = r9.nextBoolean();
    L_0x16d2:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aD = r2;
        goto L_0x0019;
    L_0x16da:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x16e4;
    L_0x16e2:
        goto L_0x1f0f;
    L_0x16e4:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x16f1;
    L_0x16e8:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x16f5;
    L_0x16f1:
        r2 = r9.nextBoolean();
    L_0x16f5:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aC = r2;
        goto L_0x0019;
    L_0x16fd:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1707;
    L_0x1705:
        goto L_0x1f0f;
    L_0x1707:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1714;
    L_0x170b:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1718;
    L_0x1714:
        r2 = r9.nextBoolean();
    L_0x1718:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aB = r2;
        goto L_0x0019;
    L_0x1720:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x172a;
    L_0x1728:
        goto L_0x1f0f;
    L_0x172a:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1737;
    L_0x172e:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x173b;
    L_0x1737:
        r2 = r9.nextBoolean();
    L_0x173b:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.aA = r2;
        goto L_0x0019;
    L_0x1743:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x174d;
    L_0x174b:
        goto L_0x1f0f;
    L_0x174d:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.az = r2;
        goto L_0x0019;
    L_0x1759:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1763;
    L_0x1761:
        goto L_0x1f0f;
    L_0x1763:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1770;
    L_0x1767:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1774;
    L_0x1770:
        r2 = r9.nextString();
    L_0x1774:
        r0.ay = r2;
        goto L_0x0019;
    L_0x1778:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1782;
    L_0x1780:
        goto L_0x1f0f;
    L_0x1782:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x178f;
    L_0x1786:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1793;
    L_0x178f:
        r2 = r9.nextString();
    L_0x1793:
        r0.ax = r2;
        goto L_0x0019;
    L_0x1797:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x17a1;
    L_0x179f:
        goto L_0x1f0f;
    L_0x17a1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x17ae;
    L_0x17a5:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x17b2;
    L_0x17ae:
        r2 = r9.nextString();
    L_0x17b2:
        r0.aw = r2;
        goto L_0x0019;
    L_0x17b6:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x17c0;
    L_0x17be:
        goto L_0x1f0f;
    L_0x17c0:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x17cd;
    L_0x17c4:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x17d1;
    L_0x17cd:
        r2 = r9.nextBoolean();
    L_0x17d1:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.av = r2;
        goto L_0x0019;
    L_0x17d9:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x17e3;
    L_0x17e1:
        goto L_0x1f0f;
    L_0x17e3:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x17f0;
    L_0x17e7:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x17f4;
    L_0x17f0:
        r2 = r9.nextBoolean();
    L_0x17f4:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.au = r2;
        goto L_0x0019;
    L_0x17fc:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1806;
    L_0x1804:
        goto L_0x1f0f;
    L_0x1806:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1813;
    L_0x180a:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1817;
    L_0x1813:
        r2 = r9.nextBoolean();
    L_0x1817:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.at = r2;
        goto L_0x0019;
    L_0x181f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1829;
    L_0x1827:
        goto L_0x1f0f;
    L_0x1829:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1836;
    L_0x182d:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x183a;
    L_0x1836:
        r2 = r9.nextString();
    L_0x183a:
        r0.as = r2;
        goto L_0x0019;
    L_0x183e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1848;
    L_0x1846:
        goto L_0x1f0f;
    L_0x1848:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.ar = r2;
        goto L_0x0019;
    L_0x1854:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x185e;
    L_0x185c:
        goto L_0x1f0f;
    L_0x185e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x186b;
    L_0x1862:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x186f;
    L_0x186b:
        r2 = r9.nextString();
    L_0x186f:
        r0.aq = r2;
        goto L_0x0019;
    L_0x1873:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x187d;
    L_0x187b:
        goto L_0x1f0f;
    L_0x187d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x188a;
    L_0x1881:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x188e;
    L_0x188a:
        r2 = r9.nextString();
    L_0x188e:
        r0.ap = r2;
        goto L_0x0019;
    L_0x1892:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x189c;
    L_0x189a:
        goto L_0x1f0f;
    L_0x189c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x18a9;
    L_0x18a0:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x18ad;
    L_0x18a9:
        r2 = r9.nextString();
    L_0x18ad:
        r0.ao = r2;
        goto L_0x0019;
    L_0x18b1:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x18bb;
    L_0x18b9:
        goto L_0x1f0f;
    L_0x18bb:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x18c8;
    L_0x18bf:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x18cc;
    L_0x18c8:
        r2 = r9.nextString();
    L_0x18cc:
        r0.an = r2;
        goto L_0x0019;
    L_0x18d0:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x18da;
    L_0x18d8:
        goto L_0x1f0f;
    L_0x18da:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x18e7;
    L_0x18de:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x18eb;
    L_0x18e7:
        r2 = r9.nextString();
    L_0x18eb:
        r0.am = r2;
        goto L_0x0019;
    L_0x18ef:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x18f9;
    L_0x18f7:
        goto L_0x1f0f;
    L_0x18f9:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1906;
    L_0x18fd:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x190a;
    L_0x1906:
        r2 = r9.nextBoolean();
    L_0x190a:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.al = r2;
        goto L_0x0019;
    L_0x1912:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x191c;
    L_0x191a:
        goto L_0x1f0f;
    L_0x191c:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x1924:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x1947;
    L_0x192a:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x193f;
    L_0x1936:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x1943;
    L_0x193f:
        r4 = r9.nextString();
    L_0x1943:
        r2.put(r3, r4);
        goto L_0x1924;
    L_0x1947:
        r9.endObject();
        r0.ak = r2;
        goto L_0x0019;
    L_0x194e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1958;
    L_0x1956:
        goto L_0x1f0f;
    L_0x1958:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.aj = r2;
        goto L_0x0019;
    L_0x1964:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x196e;
    L_0x196c:
        goto L_0x1f0f;
    L_0x196e:
        r2 = r8.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.afhb) r2;
        r0.ai = r2;
        goto L_0x0019;
    L_0x1980:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x198a;
    L_0x1988:
        goto L_0x1f0f;
    L_0x198a:
        r2 = r8.k;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aeko) r2;
        r0.ah = r2;
        goto L_0x0019;
    L_0x199c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x19a6;
    L_0x19a4:
        goto L_0x1f0f;
    L_0x19a6:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x19aa:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.g;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x19ba:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x19d4;
    L_0x19c0:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x19cc;
    L_0x19c8:
        r9.nextNull();
        goto L_0x19ba;
    L_0x19cc:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x19ba;
    L_0x19d4:
        r9.endArray();
        r0.ag = r2;
        goto L_0x0019;
    L_0x19db:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x19e5;
    L_0x19e3:
        goto L_0x1f0f;
    L_0x19e5:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x19ed:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x1a10;
    L_0x19f3:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x1a08;
    L_0x19ff:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x1a0c;
    L_0x1a08:
        r4 = r9.nextString();
    L_0x1a0c:
        r2.put(r3, r4);
        goto L_0x19ed;
    L_0x1a10:
        r9.endObject();
        r0.af = r2;
        goto L_0x0019;
    L_0x1a17:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1a21;
    L_0x1a1f:
        goto L_0x1f0f;
    L_0x1a21:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x1a25:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x1a2d:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x1a48;
    L_0x1a33:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x1a40;
    L_0x1a37:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x1a44;
    L_0x1a40:
        r4 = r9.nextString();
    L_0x1a44:
        r3.add(r4);
        goto L_0x1a2d;
    L_0x1a48:
        r9.endArray();
        r0.ae = r3;
        goto L_0x0019;
    L_0x1a4f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1a59;
    L_0x1a57:
        goto L_0x1f0f;
    L_0x1a59:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1a66;
    L_0x1a5d:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1a6a;
    L_0x1a66:
        r2 = r9.nextBoolean();
    L_0x1a6a:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.ad = r2;
        goto L_0x0019;
    L_0x1a72:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1a7c;
    L_0x1a7a:
        goto L_0x1f0f;
    L_0x1a7c:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1a89;
    L_0x1a80:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1a8d;
    L_0x1a89:
        r2 = r9.nextBoolean();
    L_0x1a8d:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.ac = r2;
        goto L_0x0019;
    L_0x1a95:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1a9f;
    L_0x1a9d:
        goto L_0x1f0f;
    L_0x1a9f:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1aac;
    L_0x1aa3:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1ab0;
    L_0x1aac:
        r2 = r9.nextBoolean();
    L_0x1ab0:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.ab = r2;
        goto L_0x0019;
    L_0x1ab8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1ac2;
    L_0x1ac0:
        goto L_0x1f0f;
    L_0x1ac2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1acf;
    L_0x1ac6:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1ad3;
    L_0x1acf:
        r2 = r9.nextString();
    L_0x1ad3:
        r0.aa = r2;
        goto L_0x0019;
    L_0x1ad7:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1ae1;
    L_0x1adf:
        goto L_0x1f0f;
    L_0x1ae1:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.Z = r2;
        goto L_0x0019;
    L_0x1aed:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1af7;
    L_0x1af5:
        goto L_0x1f0f;
    L_0x1af7:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.Y = r2;
        goto L_0x0019;
    L_0x1b03:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1b0d;
    L_0x1b0b:
        goto L_0x1f0f;
    L_0x1b0d:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.X = r2;
        goto L_0x0019;
    L_0x1b19:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1b23;
    L_0x1b21:
        goto L_0x1f0f;
    L_0x1b23:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.W = r2;
        goto L_0x0019;
    L_0x1b2f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1b39;
    L_0x1b37:
        goto L_0x1f0f;
    L_0x1b39:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x1b3d:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x1b45:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x1b60;
    L_0x1b4b:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x1b58;
    L_0x1b4f:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x1b5c;
    L_0x1b58:
        r4 = r9.nextString();
    L_0x1b5c:
        r3.add(r4);
        goto L_0x1b45;
    L_0x1b60:
        r9.endArray();
        r0.V = r3;
        goto L_0x0019;
    L_0x1b67:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1b71;
    L_0x1b6f:
        goto L_0x1f0f;
    L_0x1b71:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x1b75:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.m;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x1b85:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x1b9f;
    L_0x1b8b:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x1b97;
    L_0x1b93:
        r9.nextNull();
        goto L_0x1b85;
    L_0x1b97:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x1b85;
    L_0x1b9f:
        r9.endArray();
        r0.U = r2;
        goto L_0x0019;
    L_0x1ba6:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1bb0;
    L_0x1bae:
        goto L_0x1f0f;
    L_0x1bb0:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.T = r2;
        goto L_0x0019;
    L_0x1bbc:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1bc6;
    L_0x1bc4:
        goto L_0x1f0f;
    L_0x1bc6:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.S = r2;
        goto L_0x0019;
    L_0x1bd2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1bdc;
    L_0x1bda:
        goto L_0x1f0f;
    L_0x1bdc:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.R = r2;
        goto L_0x0019;
    L_0x1be8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1bf2;
    L_0x1bf0:
        goto L_0x1f0f;
    L_0x1bf2:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.Q = r2;
        goto L_0x0019;
    L_0x1bfe:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1c08;
    L_0x1c06:
        goto L_0x1f0f;
    L_0x1c08:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1c15;
    L_0x1c0c:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1c19;
    L_0x1c15:
        r2 = r9.nextString();
    L_0x1c19:
        r0.P = r2;
        goto L_0x0019;
    L_0x1c1d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1c27;
    L_0x1c25:
        goto L_0x1f0f;
    L_0x1c27:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1c34;
    L_0x1c2b:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1c38;
    L_0x1c34:
        r2 = r9.nextString();
    L_0x1c38:
        r0.O = r2;
        goto L_0x0019;
    L_0x1c3c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1c46;
    L_0x1c44:
        goto L_0x1f0f;
    L_0x1c46:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.N = r2;
        goto L_0x0019;
    L_0x1c52:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1c5c;
    L_0x1c5a:
        goto L_0x1f0f;
    L_0x1c5c:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.M = r2;
        goto L_0x0019;
    L_0x1c68:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1c72;
    L_0x1c70:
        goto L_0x1f0f;
    L_0x1c72:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1c7f;
    L_0x1c76:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1c83;
    L_0x1c7f:
        r2 = r9.nextString();
    L_0x1c83:
        r0.L = r2;
        goto L_0x0019;
    L_0x1c87:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1c91;
    L_0x1c8f:
        goto L_0x1f0f;
    L_0x1c91:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1c9e;
    L_0x1c95:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1ca2;
    L_0x1c9e:
        r2 = r9.nextBoolean();
    L_0x1ca2:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.K = r2;
        goto L_0x0019;
    L_0x1caa:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1cb4;
    L_0x1cb2:
        goto L_0x1f0f;
    L_0x1cb4:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.J = r2;
        goto L_0x0019;
    L_0x1cc0:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1cca;
    L_0x1cc8:
        goto L_0x1f0f;
    L_0x1cca:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1cd7;
    L_0x1cce:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1cdb;
    L_0x1cd7:
        r2 = r9.nextBoolean();
    L_0x1cdb:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.I = r2;
        goto L_0x0019;
    L_0x1ce3:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1ced;
    L_0x1ceb:
        goto L_0x1f0f;
    L_0x1ced:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1cfa;
    L_0x1cf1:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1cfe;
    L_0x1cfa:
        r2 = r9.nextBoolean();
    L_0x1cfe:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.H = r2;
        goto L_0x0019;
    L_0x1d06:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1d10;
    L_0x1d0e:
        goto L_0x1f0f;
    L_0x1d10:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1d1d;
    L_0x1d14:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1d21;
    L_0x1d1d:
        r2 = r9.nextBoolean();
    L_0x1d21:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.G = r2;
        goto L_0x0019;
    L_0x1d29:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1d33;
    L_0x1d31:
        goto L_0x1f0f;
    L_0x1d33:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1d40;
    L_0x1d37:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1d44;
    L_0x1d40:
        r2 = r9.nextBoolean();
    L_0x1d44:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.F = r2;
        goto L_0x0019;
    L_0x1d4c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1d56;
    L_0x1d54:
        goto L_0x1f0f;
    L_0x1d56:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1d63;
    L_0x1d5a:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1d67;
    L_0x1d63:
        r2 = r9.nextBoolean();
    L_0x1d67:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.E = r2;
        goto L_0x0019;
    L_0x1d6f:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1d79;
    L_0x1d77:
        goto L_0x1f0f;
    L_0x1d79:
        r2 = r8.q;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aewi) r2;
        r0.D = r2;
        goto L_0x0019;
    L_0x1d8b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1d95;
    L_0x1d93:
        goto L_0x1f0f;
    L_0x1d95:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1da2;
    L_0x1d99:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1da6;
    L_0x1da2:
        r2 = r9.nextBoolean();
    L_0x1da6:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.C = r2;
        goto L_0x0019;
    L_0x1dae:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1db8;
    L_0x1db6:
        goto L_0x1f0f;
    L_0x1db8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1dc5;
    L_0x1dbc:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1dc9;
    L_0x1dc5:
        r2 = r9.nextString();
    L_0x1dc9:
        r0.B = r2;
        goto L_0x0019;
    L_0x1dcd:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1dd7;
    L_0x1dd5:
        goto L_0x1f0f;
    L_0x1dd7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1de4;
    L_0x1ddb:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1de8;
    L_0x1de4:
        r2 = r9.nextString();
    L_0x1de8:
        r0.A = r2;
        goto L_0x0019;
    L_0x1dec:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1df6;
    L_0x1df4:
        goto L_0x1f0f;
    L_0x1df6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1e03;
    L_0x1dfa:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1e07;
    L_0x1e03:
        r2 = r9.nextString();
    L_0x1e07:
        r0.z = r2;
        goto L_0x0019;
    L_0x1e0b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1e15;
    L_0x1e13:
        goto L_0x1f0f;
    L_0x1e15:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1e22;
    L_0x1e19:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1e26;
    L_0x1e22:
        r2 = r9.nextString();
    L_0x1e26:
        r0.y = r2;
        goto L_0x0019;
    L_0x1e2a:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1e34;
    L_0x1e32:
        goto L_0x1f0f;
    L_0x1e34:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1e41;
    L_0x1e38:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1e45;
    L_0x1e41:
        r2 = r9.nextString();
    L_0x1e45:
        r0.x = r2;
        goto L_0x0019;
    L_0x1e49:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1e53;
    L_0x1e51:
        goto L_0x1f0f;
    L_0x1e53:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1e60;
    L_0x1e57:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1e64;
    L_0x1e60:
        r2 = r9.nextString();
    L_0x1e64:
        r0.w = r2;
        goto L_0x0019;
    L_0x1e68:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1e72;
    L_0x1e70:
        goto L_0x1f0f;
    L_0x1e72:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1e7f;
    L_0x1e76:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1e83;
    L_0x1e7f:
        r2 = r9.nextBoolean();
    L_0x1e83:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.v = r2;
        goto L_0x0019;
    L_0x1e8b:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1e94;
    L_0x1e93:
        goto L_0x1f0f;
    L_0x1e94:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1ea1;
    L_0x1e98:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1ea5;
    L_0x1ea1:
        r2 = r9.nextBoolean();
    L_0x1ea5:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.u = r2;
        goto L_0x0019;
    L_0x1ead:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1eb6;
    L_0x1eb5:
        goto L_0x1f0f;
    L_0x1eb6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1ec3;
    L_0x1eba:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1ec7;
    L_0x1ec3:
        r2 = r9.nextString();
    L_0x1ec7:
        r0.t = r2;
        goto L_0x0019;
    L_0x1ecb:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1ed4;
    L_0x1ed3:
        goto L_0x1f0f;
    L_0x1ed4:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1ee1;
    L_0x1ed8:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1ee5;
    L_0x1ee1:
        r2 = r9.nextString();
    L_0x1ee5:
        r0.s = r2;
        goto L_0x0019;
    L_0x1ee9:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1ef2;
    L_0x1ef1:
        goto L_0x1f0f;
    L_0x1ef2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x1eff;
    L_0x1ef6:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x1f03;
    L_0x1eff:
        r2 = r9.nextString();
    L_0x1f03:
        r0.r = r2;
        goto L_0x0019;
    L_0x1f07:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x1f14;
    L_0x1f0f:
        r9.nextNull();
        goto L_0x0019;
    L_0x1f14:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x1f21;
    L_0x1f18:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x1f25;
    L_0x1f21:
        r2 = r9.nextBoolean();
    L_0x1f25:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.q = r2;
        goto L_0x0019;
    L_0x1f2d:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afer.read(com.google.gson.stream.JsonReader):afeq");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afeq afeq) {
        if (afeq == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afeq.q != null) {
            jsonWriter.name("logged");
            jsonWriter.value(afeq.q.booleanValue());
        }
        if (afeq.r != null) {
            jsonWriter.name("username");
            jsonWriter.value(afeq.r);
        }
        if (afeq.s != null) {
            jsonWriter.name("user_id");
            jsonWriter.value(afeq.s);
        }
        if (afeq.t != null) {
            jsonWriter.name("bitmoji_avatar_id");
            jsonWriter.value(afeq.t);
        }
        if (afeq.u != null) {
            jsonWriter.name("bitmoji_hide_download_prompt");
            jsonWriter.value(afeq.u.booleanValue());
        }
        if (afeq.v != null) {
            jsonWriter.name("is_verified_user");
            jsonWriter.value(afeq.v.booleanValue());
        }
        if (afeq.w != null) {
            jsonWriter.name("auth_token");
            jsonWriter.value(afeq.w);
        }
        if (afeq.x != null) {
            jsonWriter.name("device_token");
            jsonWriter.value(afeq.x);
        }
        if (afeq.y != null) {
            jsonWriter.name("blizzard_token");
            jsonWriter.value(afeq.y);
        }
        if (afeq.z != null) {
            jsonWriter.name("email");
            jsonWriter.value(afeq.z);
        }
        if (afeq.A != null) {
            jsonWriter.name("mobile");
            jsonWriter.value(afeq.A);
        }
        if (afeq.B != null) {
            jsonWriter.name("mobile_verification_key");
            jsonWriter.value(afeq.B);
        }
        if (afeq.C != null) {
            jsonWriter.name("enable_video_transcoding_android");
            jsonWriter.value(afeq.C.booleanValue());
        }
        if (afeq.D != null) {
            jsonWriter.name("reset_disabled_transcoding_state");
            ((TypeAdapter) this.q.get()).write(jsonWriter, afeq.D);
        }
        if (afeq.E != null) {
            jsonWriter.name("enable_image_transcoding");
            jsonWriter.value(afeq.E.booleanValue());
        }
        if (afeq.F != null) {
            jsonWriter.name("transcoding_profile_level_configuration_android");
            jsonWriter.value(afeq.F.booleanValue());
        }
        if (afeq.G != null) {
            jsonWriter.name("enable_lenses_android");
            jsonWriter.value(afeq.G.booleanValue());
        }
        if (afeq.H != null) {
            jsonWriter.name("enable_recording_hint_android");
            jsonWriter.value(afeq.H.booleanValue());
        }
        if (afeq.I != null) {
            jsonWriter.name("enable_fast_frame_rate_camera_initialization_android");
            jsonWriter.value(afeq.I.booleanValue());
        }
        if (afeq.J != null) {
            jsonWriter.name("gaussian_blur_level_android");
            jsonWriter.value(afeq.J);
        }
        if (afeq.K != null) {
            jsonWriter.name("enable_save_story_to_gallery");
            jsonWriter.value(afeq.K.booleanValue());
        }
        if (afeq.L != null) {
            jsonWriter.name(FriendModel.BIRTHDAY);
            jsonWriter.value(afeq.L);
        }
        if (afeq.M != null) {
            jsonWriter.name("snap_p");
            jsonWriter.value(afeq.M);
        }
        if (afeq.N != null) {
            jsonWriter.name("notification_privacy");
            jsonWriter.value(afeq.N);
        }
        if (afeq.O != null) {
            jsonWriter.name("story_privacy");
            jsonWriter.value(afeq.O);
        }
        if (afeq.P != null) {
            jsonWriter.name("quick_add_privacy");
            jsonWriter.value(afeq.P);
        }
        if (afeq.Q != null) {
            jsonWriter.name("sent");
            jsonWriter.value(afeq.Q);
        }
        if (afeq.R != null) {
            jsonWriter.name("received");
            jsonWriter.value(afeq.R);
        }
        if (afeq.S != null) {
            jsonWriter.name("score");
            jsonWriter.value(afeq.S);
        }
        if (afeq.T != null) {
            jsonWriter.name("credits");
            jsonWriter.value(afeq.T);
        }
        if (afeq.U != null) {
            jsonWriter.name("snaps");
            typeAdapter = (TypeAdapter) this.m.get();
            jsonWriter.beginArray();
            for (aenb write : afeq.U) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (afeq.V != null) {
            jsonWriter.name("recents");
            jsonWriter.beginArray();
            for (String value : afeq.V) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (afeq.W != null) {
            jsonWriter.name(ConfigRuleModel.LAST_UPDATED);
            jsonWriter.value(afeq.W);
        }
        if (afeq.X != null) {
            jsonWriter.name("added_friends_timestamp");
            jsonWriter.value(afeq.X);
        }
        if (afeq.Y != null) {
            jsonWriter.name("current_timestamp");
            jsonWriter.value(afeq.Y);
        }
        if (afeq.Z != null) {
            jsonWriter.name("last_replayed_snap_timestamp");
            jsonWriter.value(afeq.Z);
        }
        if (afeq.aa != null) {
            jsonWriter.name("snapchat_phone_number");
            jsonWriter.value(afeq.aa);
        }
        if (afeq.ab != null) {
            jsonWriter.name("searchable_by_phone_number");
            jsonWriter.value(afeq.ab.booleanValue());
        }
        if (afeq.ac != null) {
            jsonWriter.name("should_call_to_verify_number");
            jsonWriter.value(afeq.ac.booleanValue());
        }
        if (afeq.ad != null) {
            jsonWriter.name("should_text_to_verify_number");
            jsonWriter.value(afeq.ad.booleanValue());
        }
        if (afeq.ae != null) {
            jsonWriter.name("seen_tooltips");
            jsonWriter.beginArray();
            for (String value2 : afeq.ae) {
                jsonWriter.value(value2);
            }
            jsonWriter.endArray();
        }
        if (afeq.af != null) {
            jsonWriter.name("client_properties");
            jsonWriter.beginObject();
            for (Entry entry : afeq.af.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.ag != null) {
            jsonWriter.name("client_properties_v2");
            typeAdapter = (TypeAdapter) this.g.get();
            jsonWriter.beginArray();
            for (aehh write2 : afeq.ag) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (afeq.ah != null) {
            jsonWriter.name("feature_settings");
            ((TypeAdapter) this.k.get()).write(jsonWriter, afeq.ah);
        }
        if (afeq.ai != null) {
            jsonWriter.name("ad_preferences");
            ((TypeAdapter) this.b.get()).write(jsonWriter, afeq.ai);
        }
        if (afeq.aj != null) {
            jsonWriter.name("number_of_best_friends");
            jsonWriter.value(afeq.aj);
        }
        if (afeq.ak != null) {
            jsonWriter.name("study_settings");
            jsonWriter.beginObject();
            for (Entry entry2 : afeq.ak.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                jsonWriter.value((String) entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.al != null) {
            jsonWriter.name("is_cash_active");
            jsonWriter.value(afeq.al.booleanValue());
        }
        if (afeq.am != null) {
            jsonWriter.name("cash_provider");
            jsonWriter.value(afeq.am);
        }
        if (afeq.an != null) {
            jsonWriter.name("cash_customer_id");
            jsonWriter.value(afeq.an);
        }
        if (afeq.ao != null) {
            jsonWriter.name("allowed_to_use_cash");
            jsonWriter.value(afeq.ao);
        }
        if (afeq.ap != null) {
            jsonWriter.name("third_party_tracking_base_url");
            jsonWriter.value(afeq.ap);
        }
        if (afeq.aq != null) {
            jsonWriter.name("third_party_tracking_app_id");
            jsonWriter.value(afeq.aq);
        }
        if (afeq.ar != null) {
            jsonWriter.name("last_address_book_updated_date");
            jsonWriter.value(afeq.ar);
        }
        if (afeq.as != null) {
            jsonWriter.name("qr_path");
            jsonWriter.value(afeq.as);
        }
        if (afeq.at != null) {
            jsonWriter.name("enable_location_mediacards");
            jsonWriter.value(afeq.at.booleanValue());
        }
        if (afeq.au != null) {
            jsonWriter.name("require_refreshing_profile_media");
            jsonWriter.value(afeq.au.booleanValue());
        }
        if (afeq.av != null) {
            jsonWriter.name("should_show_suggestion_prompt");
            jsonWriter.value(afeq.av.booleanValue());
        }
        if (afeq.aw != null) {
            jsonWriter.name("suggestion_prompt_link");
            jsonWriter.value(afeq.aw);
        }
        if (afeq.ax != null) {
            jsonWriter.name("suggestion_prompt_text");
            jsonWriter.value(afeq.ax);
        }
        if (afeq.ay != null) {
            jsonWriter.name("suggestion_prompt_button_text");
            jsonWriter.value(afeq.ay);
        }
        if (afeq.az != null) {
            jsonWriter.name("suggestion_prompt_duration_in_millis");
            jsonWriter.value(afeq.az);
        }
        if (afeq.aA != null) {
            jsonWriter.name("video_filters_enabled");
            jsonWriter.value(afeq.aA.booleanValue());
        }
        if (afeq.aB != null) {
            jsonWriter.name("image_player_enabled_android");
            jsonWriter.value(afeq.aB.booleanValue());
        }
        if (afeq.aC != null) {
            jsonWriter.name("speed_filters_enabled_android");
            jsonWriter.value(afeq.aC.booleanValue());
        }
        if (afeq.aD != null) {
            jsonWriter.name("reverse_filter_enabled_android");
            jsonWriter.value(afeq.aD.booleanValue());
        }
        if (afeq.aE != null) {
            jsonWriter.name("smoothing_filter_enabled_android");
            jsonWriter.value(afeq.aE.booleanValue());
        }
        if (afeq.aF != null) {
            jsonWriter.name("dirty_video_rendering_enabled_android");
            jsonWriter.value(afeq.aF.booleanValue());
        }
        if (afeq.aG != null) {
            jsonWriter.name("video_decoder_texcoord_transformation_enabled_android");
            jsonWriter.value(afeq.aG.booleanValue());
        }
        if (afeq.aH != null) {
            jsonWriter.name("pinnable_stickers_enabled_android");
            jsonWriter.value(afeq.aH.booleanValue());
        }
        if (afeq.aI != null) {
            jsonWriter.name("camera2_limited_level_high_resolution_photo_enabled_android");
            jsonWriter.value(afeq.aI.booleanValue());
        }
        if (afeq.aJ != null) {
            jsonWriter.name("sc_media_recorder_enabled_android");
            jsonWriter.value(afeq.aJ.booleanValue());
        }
        if (afeq.aK != null) {
            jsonWriter.name("sc_media_recorder_recommended_android");
            jsonWriter.value(afeq.aK.booleanValue());
        }
        if (afeq.aL != null) {
            jsonWriter.name("android_media_recorder_surface_recording_enabled");
            jsonWriter.value(afeq.aL.booleanValue());
        }
        if (afeq.aM != null) {
            jsonWriter.name("camera1_take_photo_api_blacklisted_android");
            jsonWriter.value(afeq.aM.booleanValue());
        }
        if (afeq.aN != null) {
            jsonWriter.name("camera1_take_photo_api_whitelisted_android");
            jsonWriter.value(afeq.aN.booleanValue());
        }
        if (afeq.aO != null) {
            jsonWriter.name("camera2_enabled_android");
            jsonWriter.value(afeq.aO.booleanValue());
        }
        if (afeq.aP != null) {
            jsonWriter.name("gles3_allowed_android");
            jsonWriter.value(afeq.aP.booleanValue());
        }
        if (afeq.aQ != null) {
            jsonWriter.name("blur_after_downscale_enabled_android");
            jsonWriter.value(afeq.aQ.booleanValue());
        }
        if (afeq.aR != null) {
            jsonWriter.name("amr_codec_enabled_android");
            jsonWriter.value(afeq.aR.booleanValue());
        }
        if (afeq.aS != null) {
            jsonWriter.name("samsung_aac_enc_enabled_android");
            jsonWriter.value(afeq.aS.booleanValue());
        }
        if (afeq.aT != null) {
            jsonWriter.name("audio_note_enabled_android");
            jsonWriter.value(afeq.aT.booleanValue());
        }
        if (afeq.aU != null) {
            jsonWriter.name("video_note_enabled_android");
            jsonWriter.value(afeq.aU.booleanValue());
        }
        if (afeq.aV != null) {
            jsonWriter.name("video_note_api_fallback_android");
            jsonWriter.value(afeq.aV.booleanValue());
        }
        if (afeq.aW != null) {
            jsonWriter.name("chat_video_enabled_android");
            jsonWriter.value(afeq.aW.booleanValue());
        }
        if (afeq.aX != null) {
            jsonWriter.name("video_thumbnail_enabled_android");
            jsonWriter.value(afeq.aX.booleanValue());
        }
        if (afeq.aY != null) {
            jsonWriter.name("our_story_auths");
            typeAdapter = (TypeAdapter) this.o.get();
            jsonWriter.beginArray();
            for (aeue write3 : afeq.aY) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        if (afeq.aZ != null) {
            jsonWriter.name("targeting");
            jsonWriter.beginObject();
            for (Entry entry22 : afeq.aZ.entrySet()) {
                jsonWriter.name((String) entry22.getKey());
                jsonWriter.value((String) entry22.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.ba != null) {
            jsonWriter.name("ad_sources");
            ((TypeAdapter) this.d.get()).write(jsonWriter, afeq.ba);
        }
        if (afeq.bb != null) {
            jsonWriter.name("ad_track_info");
            ((TypeAdapter) this.e.get()).write(jsonWriter, afeq.bb);
        }
        if (afeq.bc != null) {
            jsonWriter.name("ad_products");
            ((TypeAdapter) this.c.get()).write(jsonWriter, afeq.bc);
        }
        if (afeq.bd != null) {
            jsonWriter.name("industries");
            jsonWriter.beginArray();
            for (String value22 : afeq.bd) {
                jsonWriter.value(value22);
            }
            jsonWriter.endArray();
        }
        if (afeq.be != null) {
            jsonWriter.name("raw_thumbnail_upload_enabled");
            jsonWriter.value(afeq.be.booleanValue());
        }
        if (afeq.bf != null) {
            jsonWriter.name("is_sms_two_fa_enabled");
            jsonWriter.value(afeq.bf.booleanValue());
        }
        if (afeq.bg != null) {
            jsonWriter.name("is_otp_two_fa_enabled");
            jsonWriter.value(afeq.bg.booleanValue());
        }
        if (afeq.bh != null) {
            jsonWriter.name("is_two_fa_enabled");
            jsonWriter.value(afeq.bh.booleanValue());
        }
        if (afeq.bi != null) {
            jsonWriter.name("two_fa_verified_device_num");
            jsonWriter.value(afeq.bi);
        }
        if (afeq.bj != null) {
            jsonWriter.name("two_fa_verified_devices");
            typeAdapter = (TypeAdapter) this.r.get();
            jsonWriter.beginArray();
            for (ahfc write4 : afeq.bj) {
                typeAdapter.write(jsonWriter, write4);
            }
            jsonWriter.endArray();
        }
        if (afeq.bk != null) {
            jsonWriter.name("friendmoji_mutable_dict");
            typeAdapter = (TypeAdapter) this.h.get();
            jsonWriter.beginObject();
            for (Entry entry3 : afeq.bk.entrySet()) {
                jsonWriter.name((String) entry3.getKey());
                typeAdapter.write(jsonWriter, entry3.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.bl != null) {
            jsonWriter.name("friendmoji_read_only_dict");
            typeAdapter = (TypeAdapter) this.h.get();
            jsonWriter.beginObject();
            for (Entry entry32 : afeq.bl.entrySet()) {
                jsonWriter.name((String) entry32.getKey());
                typeAdapter.write(jsonWriter, entry32.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.bm != null) {
            jsonWriter.name("favorite_stickers");
            typeAdapter = (TypeAdapter) this.i.get();
            jsonWriter.beginArray();
            for (aekk write5 : afeq.bm) {
                typeAdapter.write(jsonWriter, write5);
            }
            jsonWriter.endArray();
        }
        if (afeq.bn != null) {
            jsonWriter.name("verified_shared_publications");
            typeAdapter = (TypeAdapter) this.t.get();
            jsonWriter.beginArray();
            for (aikk write6 : afeq.bn) {
                typeAdapter.write(jsonWriter, write6);
            }
            jsonWriter.endArray();
        }
        if (afeq.bo != null) {
            jsonWriter.name("enabled_iap_currencies");
            jsonWriter.beginArray();
            for (String value222 : afeq.bo) {
                jsonWriter.value(value222);
            }
            jsonWriter.endArray();
        }
        if (afeq.bp != null) {
            jsonWriter.name("enabled_lens_store_currencies");
            jsonWriter.beginArray();
            for (String value2222 : afeq.bp) {
                jsonWriter.value(value2222);
            }
            jsonWriter.endArray();
        }
        if (afeq.bq != null) {
            jsonWriter.name("client_prompt");
            ((TypeAdapter) this.p.get()).write(jsonWriter, afeq.bq);
        }
        if (afeq.br != null) {
            jsonWriter.name("notification_sound_setting");
            jsonWriter.value(afeq.br);
        }
        if (afeq.bs != null) {
            jsonWriter.name("ringing_sound");
            jsonWriter.value(afeq.bs);
        }
        if (afeq.bt != null) {
            jsonWriter.name("contacts_resync_request");
            jsonWriter.value(afeq.bt);
        }
        if (afeq.bu != null) {
            jsonWriter.name("gcs_sampling");
            jsonWriter.value(afeq.bu);
        }
        if (afeq.bv != null) {
            jsonWriter.name("snap_media_upload_connection_timeout");
            jsonWriter.value(afeq.bv);
        }
        if (afeq.bw != null) {
            jsonWriter.name("snap_media_upload_so_timeout");
            jsonWriter.value(afeq.bw);
        }
        if (afeq.bx != null) {
            jsonWriter.name("laguna_id");
            jsonWriter.value(afeq.bx);
        }
        if (afeq.by != null) {
            jsonWriter.name("laguna_response");
            ((TypeAdapter) this.n.get()).write(jsonWriter, afeq.by);
        }
        if (afeq.bz != null) {
            jsonWriter.name("has_used_laguna");
            jsonWriter.value(afeq.bz.booleanValue());
        }
        if (afeq.bA != null) {
            jsonWriter.name("e_snap_media");
            jsonWriter.value(afeq.bA.booleanValue());
        }
        if (afeq.bB != null) {
            jsonWriter.name("video_recording_transcoding_configuration");
            ((TypeAdapter) this.u.get()).write(jsonWriter, afeq.bB);
        }
        if (afeq.bC != null) {
            jsonWriter.name("story_count");
            jsonWriter.value(afeq.bC);
        }
        if (afeq.bD != null) {
            jsonWriter.name("front_camera_zoom_enabled_android");
            jsonWriter.value(afeq.bD.booleanValue());
        }
        if (afeq.bE != null) {
            jsonWriter.name("display_name");
            jsonWriter.value(afeq.bE);
        }
        if (afeq.bF != null) {
            jsonWriter.name("camera2_take_photo_api_android");
            jsonWriter.value(afeq.bF.booleanValue());
        }
        if (afeq.bG != null) {
            jsonWriter.name("enable_world_lens_grid");
            jsonWriter.value(afeq.bG.booleanValue());
        }
        if (afeq.bH != null) {
            jsonWriter.name("nft_lo_timeout");
            jsonWriter.value(afeq.bH);
        }
        if (afeq.bI != null) {
            jsonWriter.name("nft_hi_timeout");
            jsonWriter.value(afeq.bI);
        }
        if (afeq.bJ != null) {
            jsonWriter.name("country_code");
            jsonWriter.value(afeq.bJ);
        }
        if (afeq.bK != null) {
            jsonWriter.name("voip_device_token");
            jsonWriter.value(afeq.bK);
        }
        if (afeq.bL != null) {
            jsonWriter.name("sic_init");
            jsonWriter.value(afeq.bL);
        }
        if (afeq.bM != null) {
            jsonWriter.name("enabled_push_notifications");
            jsonWriter.value(afeq.bM.booleanValue());
        }
        if (afeq.bN != null) {
            jsonWriter.name("sticker_visual_recommendation_enabled_android");
            jsonWriter.value(afeq.bN.booleanValue());
        }
        if (afeq.bO != null) {
            jsonWriter.name("prestart_token");
            jsonWriter.value(afeq.bO);
        }
        if (afeq.bP != null) {
            jsonWriter.name("prestart_prefix");
            jsonWriter.value(afeq.bP);
        }
        if (afeq.bQ != null) {
            jsonWriter.name("prestart_port");
            jsonWriter.value(afeq.bQ);
        }
        if (afeq.bR != null) {
            jsonWriter.name("prestart_hostname");
            jsonWriter.value(afeq.bR);
        }
        if (afeq.bS != null) {
            jsonWriter.name("feature_settings_response");
            typeAdapter = (TypeAdapter) this.j.get();
            jsonWriter.beginArray();
            for (aekm write7 : afeq.bS) {
                typeAdapter.write(jsonWriter, write7);
            }
            jsonWriter.endArray();
        }
        if (afeq.bT != null) {
            jsonWriter.name("mob_stories_enabled");
            jsonWriter.value(afeq.bT);
        }
        if (afeq.bU != null) {
            jsonWriter.name("blizzard_config");
            ((TypeAdapter) this.f.get()).write(jsonWriter, afeq.bU);
        }
        if (afeq.bV != null) {
            jsonWriter.name("friendmoji_blocked_keys");
            jsonWriter.beginArray();
            for (String value22222 : afeq.bV) {
                jsonWriter.value(value22222);
            }
            jsonWriter.endArray();
        }
        if (afeq.bW != null) {
            jsonWriter.name("client_prompts");
            typeAdapter = (TypeAdapter) this.p.get();
            jsonWriter.beginArray();
            for (aevd write8 : afeq.bW) {
                typeAdapter.write(jsonWriter, write8);
            }
            jsonWriter.endArray();
        }
        if (afeq.bX != null) {
            jsonWriter.name("time_since_last_travel_model_change");
            jsonWriter.value(afeq.bX);
        }
        if (afeq.bY != null) {
            jsonWriter.name("reset_disabled_image_player_state");
            ((TypeAdapter) this.q.get()).write(jsonWriter, afeq.bY);
        }
        if (afeq.bZ != null) {
            jsonWriter.name("discover_content_disabled");
            jsonWriter.value(afeq.bZ.booleanValue());
        }
        if (afeq.ca != null) {
            jsonWriter.name("bitmoji_selfie_id");
            jsonWriter.value(afeq.ca);
        }
        if (afeq.cb != null) {
            jsonWriter.name("bitmoji_snapcode_selfie_id");
            jsonWriter.value(afeq.cb);
        }
        if (afeq.cc != null) {
            jsonWriter.name("d2s_media_download_enabled");
            jsonWriter.value(afeq.cc.booleanValue());
        }
        if (afeq.cd != null) {
            jsonWriter.name("fidelius_latest_beta");
            jsonWriter.value(afeq.cd);
        }
        if (afeq.ce != null) {
            jsonWriter.name("studio_serial_number");
            jsonWriter.value(afeq.ce);
        }
        if (afeq.cf != null) {
            jsonWriter.name("enable_separate_lens_list_for_back_camera");
            jsonWriter.value(afeq.cf.booleanValue());
        }
        if (afeq.cg != null) {
            jsonWriter.name("iso3166_alpha2_country_code");
            jsonWriter.value(afeq.cg);
        }
        if (afeq.ch != null) {
            jsonWriter.name("created");
            jsonWriter.value(afeq.ch);
        }
        if (afeq.ci != null) {
            jsonWriter.name("unlockables_direct_auth_info");
            ((TypeAdapter) this.s.get()).write(jsonWriter, afeq.ci);
        }
        if (afeq.cj != null) {
            jsonWriter.name("is_popular");
            jsonWriter.value(afeq.cj.booleanValue());
        }
        if (afeq.ck != null) {
            jsonWriter.name("business_account_id");
            jsonWriter.value(afeq.ck);
        }
        if (afeq.cl != null) {
            jsonWriter.name("study_settings_v2");
            typeAdapter = (TypeAdapter) this.v.get();
            jsonWriter.beginObject();
            for (Entry entry322 : afeq.cl.entrySet()) {
                jsonWriter.name((String) entry322.getKey());
                typeAdapter.write(jsonWriter, entry322.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.cm != null) {
            jsonWriter.name("enable_ar_core_android");
            jsonWriter.value(afeq.cm.booleanValue());
        }
        if (afeq.cn != null) {
            jsonWriter.name("is_affected_by_gdpr");
            jsonWriter.value(afeq.cn.booleanValue());
        }
        if (afeq.co != null) {
            jsonWriter.name("registration_country_code");
            jsonWriter.value(afeq.co);
        }
        if (afeq.cp != null) {
            jsonWriter.name("is_s2r_eligible");
            jsonWriter.value(afeq.cp.booleanValue());
        }
        if (afeq.cq != null) {
            jsonWriter.name("phone_number_country_code");
            jsonWriter.value(afeq.cq);
        }
        if (afeq.cr != null) {
            jsonWriter.name("display_username");
            jsonWriter.value(afeq.cr);
        }
        if (afeq.a != null) {
            jsonWriter.name("friends");
            typeAdapter = (TypeAdapter) this.l.get();
            jsonWriter.beginArray();
            for (aelf write9 : afeq.a) {
                typeAdapter.write(jsonWriter, write9);
            }
            jsonWriter.endArray();
        }
        if (afeq.b != null) {
            jsonWriter.name("friends_sync_token");
            jsonWriter.value(afeq.b);
        }
        if (afeq.c != null) {
            jsonWriter.name("friends_sync_type");
            jsonWriter.value(afeq.c);
        }
        if (afeq.d != null) {
            jsonWriter.name("added_friends");
            typeAdapter = (TypeAdapter) this.l.get();
            jsonWriter.beginArray();
            for (aelf write92 : afeq.d) {
                typeAdapter.write(jsonWriter, write92);
            }
            jsonWriter.endArray();
        }
        if (afeq.e != null) {
            jsonWriter.name("bests");
            jsonWriter.beginArray();
            for (String value222222 : afeq.e) {
                jsonWriter.value(value222222);
            }
            jsonWriter.endArray();
        }
        if (afeq.f != null) {
            jsonWriter.name("extra_friendmoji_mutable_dict");
            typeAdapter = (TypeAdapter) this.h.get();
            jsonWriter.beginObject();
            for (Entry entry3222 : afeq.f.entrySet()) {
                jsonWriter.name((String) entry3222.getKey());
                typeAdapter.write(jsonWriter, entry3222.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.g != null) {
            jsonWriter.name("extra_friendmoji_read_only_dict");
            typeAdapter = (TypeAdapter) this.h.get();
            jsonWriter.beginObject();
            for (Entry entry32222 : afeq.g.entrySet()) {
                jsonWriter.name((String) entry32222.getKey());
                typeAdapter.write(jsonWriter, entry32222.getValue());
            }
            jsonWriter.endObject();
        }
        if (afeq.h != null) {
            jsonWriter.name("added_friends_sync_token");
            jsonWriter.value(afeq.h);
        }
        if (afeq.i != null) {
            jsonWriter.name("added_friends_sync_type");
            jsonWriter.value(afeq.i);
        }
        jsonWriter.endObject();
    }
}
