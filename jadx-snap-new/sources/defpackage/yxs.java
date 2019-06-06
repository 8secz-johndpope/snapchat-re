package defpackage;

import com.snapchat.talkcorev3.CallMetric;
import com.snapchat.talkcorev3.CallSetupPhase;
import com.snapchat.talkcorev3.Media;
import com.snapchat.talkcorev3.MetricsReporter;
import defpackage.acbm.a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: yxs */
public final class yxs extends MetricsReporter {
    private final abjq a;

    /* renamed from: yxs$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[CallMetric.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a3 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|(2:31|32)|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Missing block: B:57:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.snapchat.talkcorev3.CallSetupPhase.values();
            r0 = r0.length;
            r0 = new int[r0];
            c = r0;
            r0 = 1;
            r1 = c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.snapchat.talkcorev3.CallSetupPhase.CALL_INITIATED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = c;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.snapchat.talkcorev3.CallSetupPhase.CALL_MATURED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = c;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.snapchat.talkcorev3.CallSetupPhase.LOCAL_ACCEPTED_CONNECTED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = c;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.snapchat.talkcorev3.CallSetupPhase.LOCAL_ACCEPTED_WHILE_CONNECTING;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = c;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = com.snapchat.talkcorev3.CallSetupPhase.LOCAL_CONNECTED;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = 6;
            r6 = c;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = com.snapchat.talkcorev3.CallSetupPhase.LOCAL_REJECTED_CONNECTED;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6[r7] = r5;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r6 = c;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r7 = com.snapchat.talkcorev3.CallSetupPhase.LOCAL_REJECTED_WHILE_CONNECTING;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r8 = 7;
            r6[r7] = r8;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r6 = c;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r7 = com.snapchat.talkcorev3.CallSetupPhase.REMOTE_ACCEPTED;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r8 = 8;
            r6[r7] = r8;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r6 = c;	 Catch:{ NoSuchFieldError -> 0x006e }
            r7 = com.snapchat.talkcorev3.CallSetupPhase.REMOTE_REJECTED;	 Catch:{ NoSuchFieldError -> 0x006e }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r8 = 9;
            r6[r7] = r8;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r6 = c;	 Catch:{ NoSuchFieldError -> 0x007a }
            r7 = com.snapchat.talkcorev3.CallSetupPhase.REQUEST_RECEIVED;	 Catch:{ NoSuchFieldError -> 0x007a }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r8 = 10;
            r6[r7] = r8;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r6 = c;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r7 = com.snapchat.talkcorev3.CallSetupPhase.NONE;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r8 = 11;
            r6[r7] = r8;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r6 = com.snapchat.talkcorev3.Media.values();
            r6 = r6.length;
            r6 = new int[r6];
            b = r6;
            r6 = b;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r7 = com.snapchat.talkcorev3.Media.AUDIO;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x0099 }
            r6[r7] = r0;	 Catch:{ NoSuchFieldError -> 0x0099 }
        L_0x0099:
            r6 = b;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r7 = com.snapchat.talkcorev3.Media.AUDIO_PAUSED_VIDEO;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r6[r7] = r1;	 Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            r6 = b;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r7 = com.snapchat.talkcorev3.Media.AUDIO_VIDEO;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ad }
            r6[r7] = r2;	 Catch:{ NoSuchFieldError -> 0x00ad }
        L_0x00ad:
            r6 = b;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r7 = com.snapchat.talkcorev3.Media.MUTED_AUDIO_PAUSED_VIDEO;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r6[r7] = r3;	 Catch:{ NoSuchFieldError -> 0x00b7 }
        L_0x00b7:
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r6 = com.snapchat.talkcorev3.Media.MUTED_AUDIO_VIDEO;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r3[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x00c1 }
        L_0x00c1:
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x00cb }
            r4 = com.snapchat.talkcorev3.Media.NONE;	 Catch:{ NoSuchFieldError -> 0x00cb }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x00cb }
            r3[r4] = r5;	 Catch:{ NoSuchFieldError -> 0x00cb }
        L_0x00cb:
            r3 = com.snapchat.talkcorev3.CallMetric.values();
            r3 = r3.length;
            r3 = new int[r3];
            a = r3;
            r3 = a;	 Catch:{ NoSuchFieldError -> 0x00de }
            r4 = com.snapchat.talkcorev3.CallMetric.ATTEMPT;	 Catch:{ NoSuchFieldError -> 0x00de }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x00de }
            r3[r4] = r0;	 Catch:{ NoSuchFieldError -> 0x00de }
        L_0x00de:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r3 = com.snapchat.talkcorev3.CallMetric.LEG;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r0[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x00e8 }
        L_0x00e8:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x00f2 }
            r1 = com.snapchat.talkcorev3.CallMetric.REQUEST;	 Catch:{ NoSuchFieldError -> 0x00f2 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00f2 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00f2 }
        L_0x00f2:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yxs$1.<clinit>():void");
        }
    }

    public yxs(abjq abjq) {
        this.a = abjq;
    }

    private static abgh a(Media media) {
        switch (media) {
            case AUDIO:
                return abgh.AUDIO;
            case AUDIO_PAUSED_VIDEO:
            case AUDIO_VIDEO:
            case MUTED_AUDIO_PAUSED_VIDEO:
            case MUTED_AUDIO_VIDEO:
                return abgh.VIDEO;
            case NONE:
                new StringBuilder("Got an unsupported media type when reporting talk engagement: ").append(media);
                break;
        }
        return null;
    }

    private static abgj a(CallSetupPhase callSetupPhase) {
        switch (callSetupPhase) {
            case CALL_INITIATED:
                return abgj.CALL_INITIATED;
            case CALL_MATURED:
                return abgj.CALL_MATURED;
            case LOCAL_ACCEPTED_CONNECTED:
                return abgj.LOCAL_ACCEPTED;
            case LOCAL_ACCEPTED_WHILE_CONNECTING:
                return abgj.LOCAL_ACCEPTED;
            case LOCAL_CONNECTED:
                return abgj.ADDLIVE_CONNECTED;
            case LOCAL_REJECTED_CONNECTED:
                return abgj.LOCAL_REJECTED;
            case LOCAL_REJECTED_WHILE_CONNECTING:
                return abgj.LOCAL_REJECTED;
            case REMOTE_ACCEPTED:
                return abgj.REMOTE_ACCEPTED;
            case REMOTE_REJECTED:
                return abgj.REMOTE_REJECTED;
            case REQUEST_RECEIVED:
                return abgj.REQUEST_RECEIVED;
            case NONE:
                new StringBuilder("Got an unsupported call phase type when reporting talk engagement: ").append(callSetupPhase);
                break;
        }
        return null;
    }

    private static Double a(HashMap<String, String> hashMap, String str) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? Double.valueOf(0.0d) : Double.valueOf(str2);
    }

    private static void a(abgf abgf, String str, Media media, HashMap<String, Integer> hashMap, HashMap<String, Float> hashMap2, String str2) {
        abgf.e = str;
        abgf.i = yxs.a(media);
        abgf.h = Boolean.valueOf(yxs.d(hashMap, "was_lockscreen"));
        abgf.f = yxs.b(hashMap2, "duration_sec");
        abgf.d = yxs.c(hashMap, "group_size");
        abgf.g = yxs.c(hashMap, "media_toggles");
        abgf.k = yxs.c(hashMap, "feed_cell_view_position");
        abgf.l = str2;
        int i = 1;
        abgf.j = Boolean.valueOf(abps.b(str2) ^ 1);
        int intValue = yxs.c(hashMap, "chat_source").intValue();
        if (intValue < 0 || intValue >= abbd.values().length) {
            i = 0;
        }
        if (i != 0) {
            abgf.m = abbd.values()[intValue];
        } else {
            acbm.b().a("TalkCoreMetricsReporter");
        }
    }

    private static Double b(HashMap<String, Float> hashMap, String str) {
        Float f = (Float) hashMap.get(str);
        return Double.valueOf(f == null ? 0.0d : f.doubleValue());
    }

    private static Long c(HashMap<String, Integer> hashMap, String str) {
        Integer num = (Integer) hashMap.get(str);
        return Long.valueOf(num == null ? 0 : num.longValue());
    }

    private static boolean d(HashMap<String, Integer> hashMap, String str) {
        Integer num = (Integer) hashMap.get(str);
        return num != null && num.intValue() == 1;
    }

    public final void reportCallEvent(CallMetric callMetric, String str, Media media, CallSetupPhase callSetupPhase, HashMap<String, Integer> hashMap, HashMap<String, Float> hashMap2, String str2, String str3) {
        Exception e;
        HashMap<String, Integer> hashMap3 = hashMap;
        HashMap<String, Float> hashMap4 = hashMap2;
        try {
            abhw abge;
            int i = 1.a[callMetric.ordinal()];
            String str4 = "was_abandoned";
            if (i == 1) {
                abge = new abge();
                yxs.a(abge, str, media, hashMap, hashMap2, str2);
                abge.a = yxs.a(callSetupPhase);
                abge.c = yxs.c(hashMap3, "users_present");
                abge.b = Boolean.valueOf(yxs.d(hashMap3, str4));
                if (abge.b.booleanValue()) {
                    abge.a = abgj.REMOTE_ABANDONED;
                }
            } else if (i == 2) {
                abhw abgg = new abgg();
                yxs.a(abgg, str, media, hashMap, hashMap2, str2);
                abgg.o = yxs.c(hashMap3, "max_recipients");
                abgg.a = yxs.b(hashMap4, "audio_duration_sec");
                abgg.b = yxs.b(hashMap4, "video_duration_sec");
                abgg.c = yxs.b(hashMap4, "muted_duration_sec");
                abgg.n = yxs.b(hashMap4, "lens_active_duration_sec");
                abge = abgg;
            } else if (i != 3) {
                CallMetric callMetric2 = callMetric;
                new StringBuilder("Got unsupported instrumentation event type from TalkCore: ").append(callMetric);
                abge = null;
            } else {
                abge = new abgi();
                yxs.a(abge, str, media, hashMap, hashMap2, str2);
                abge.a = yxs.a(callSetupPhase);
                abge.b = Boolean.valueOf(yxs.d(hashMap3, str4));
                abge.c = Boolean.valueOf(yxs.d(hashMap3, "was_present"));
            }
            if (abge != null) {
                try {
                    this.a.a(abge);
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            a b = acbm.b();
            new Object[1][0] = e;
            b.a("TalkCoreMetricsReporter");
        }
    }

    public final void reportPresenceEvent(HashSet<String> hashSet, HashMap<String, String> hashMap, String str) {
        String str2 = "13_or_more_users_present_duration_s";
        String str3 = "users_with_bitmoji";
        String str4 = "duration_sec";
        String str5 = "group_size";
        String str6 = "max_simultaneous_presence";
        try {
            hashMap.containsKey(str6);
            hashMap.containsKey(str5);
            hashMap.containsKey(str4);
            hashMap.containsKey(str3);
            aaus aaus = new aaus();
            aaus.c = Long.valueOf((String) hashMap.get(str6));
            aaus.a = Long.valueOf((String) hashMap.get(str5));
            aaus.e = yxs.a(hashMap, str4);
            aaus.f = yxs.a(hashMap, "2_or_more_users_present_duration_s");
            aaus.g = yxs.a(hashMap, "3_or_more_users_present_duration_s");
            aaus.h = yxs.a(hashMap, "4_or_more_users_present_duration_s");
            aaus.i = yxs.a(hashMap, "5_or_more_users_present_duration_s");
            aaus.j = yxs.a(hashMap, "6_or_more_users_present_duration_s");
            aaus.k = yxs.a(hashMap, "7_or_more_users_present_duration_s");
            aaus.l = yxs.a(hashMap, "8_or_more_users_present_duration_s");
            aaus.m = yxs.a(hashMap, "9_or_more_users_present_duration_s");
            aaus.n = yxs.a(hashMap, "10_or_more_users_present_duration_s");
            aaus.o = yxs.a(hashMap, "11_or_more_users_present_duration_s");
            aaus.p = yxs.a(hashMap, "12_or_more_users_present_duration_s");
            aaus.q = yxs.a(hashMap, str2);
            aaus.q = yxs.a(hashMap, str2);
            aaus.r = yxs.a(hashMap, "14_or_more_users_present_duration_s");
            aaus.s = yxs.a(hashMap, "15_or_more_users_present_duration_s");
            aaus.v = str;
            aaus.d = Boolean.valueOf(!abps.b(str));
            aaus.u = str;
            aaus.t = Long.valueOf(yxs.a(hashMap, "feed_cell_view_position").longValue());
            aaus.b = Long.valueOf((String) hashMap.get(str3));
            this.a.a(aaus);
        } catch (Exception e) {
            a b = acbm.b();
            new Object[1][0] = e;
            b.a("TalkCoreMetricsReporter");
        }
    }
}
