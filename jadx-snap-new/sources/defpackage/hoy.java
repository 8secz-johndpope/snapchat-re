package defpackage;

import android.webkit.URLUtil;
import com.google.common.base.Optional;
import defpackage.gvt.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hoy */
public final class hoy {
    public final ajwy<ftl> a;
    public final aipn<kcl> b;
    private final Map<String, Boolean> c = new ConcurrentHashMap();
    private final aipn<abkt> d;
    private final aipn<abrk> e;
    private hja f;

    public hoy(aipn<abkt> aipn, aipn<abrk> aipn2, ajwy<ftl> ajwy, aipn<kcl> aipn3) {
        this.d = aipn;
        this.e = aipn2;
        this.a = ajwy;
        this.f = new hja((byte) 0);
        this.b = aipn3;
    }

    private /* synthetic */ Boolean L() {
        return Boolean.valueOf(((ftl) this.a.get()).a(gvt.RANKING_STORIES_BYPASS_FSN_ANDROID_ENABLED));
    }

    private /* synthetic */ Optional a(Boolean bool) {
        String j = ((ftl) this.a.get()).j(gvt.RANKING_STORIES_BYPASS_FSN_ANDROID_BASE_URL);
        return (bool.booleanValue() && URLUtil.isValidUrl(j)) ? Optional.of(j) : Optional.absent();
    }

    public final int A() {
        return ((ftl) this.a.get()).f(gvt.BACKGROUND_PREFETCH_NUM_SUBSCRIPTION_STORY);
    }

    public final int B() {
        return ((ftl) this.a.get()).f(gvt.BACKGROUND_PREFETCH_NUM_SNAPS_PER_SUBSCRIPTION_STORY);
    }

    public final int C() {
        return ((ftl) this.a.get()).f(gvt.BACKGROUND_PREFETCH_SUBSCRIPTION_STORY_DELAY_MINS);
    }

    public final long D() {
        return ((ftl) this.a.get()).h(gvt.BACKGROUND_PREFETCH_SUBSCRIPTION_STORY_TIMEOUT_MINS);
    }

    public final hja E() {
        return this.f;
    }

    public final boolean F() {
        return abss.a().h() ? true : ((ftl) this.a.get()).a(gvt.ENABLE_COGNAC_TILE);
    }

    public final boolean G() {
        boolean h = abss.a().h();
        int I = I();
        return I == a.AB_TEST.ordinal() || I == a.ENABLE.ordinal() || h;
    }

    public final boolean H() {
        boolean h = abss.a().h();
        int J = J();
        return J == a.AB_TEST.ordinal() || J == a.ENABLE.ordinal() || h;
    }

    public final int I() {
        return abss.a().h() ? a.ENABLE.ordinal() : ((ftl) this.a.get()).y(gvt.ENABLE_COGNAC_IN_FOR_YOU).ordinal();
    }

    public final int J() {
        return abss.a().h() ? a.ENABLE.ordinal() : ((ftl) this.a.get()).y(gvt.ENABLE_COGNAC_PIVOT).ordinal();
    }

    public final boolean K() {
        return ((ftl) this.a.get()).a(gvt.JAGUAR_CAROUSEL_IN_FOR_YOU_ENABLED);
    }

    public final boolean a() {
        return ((ftl) this.a.get()).a(gvt.SHOW_TEAM_SNAPCHAT_STORY_ON_DISCOVER);
    }

    public final boolean b() {
        return ((ftl) this.a.get()).a(gvt.ENABLE_TEST_PUBLISHERS);
    }

    public final String c() {
        return ((ftl) this.a.get()).j(gvt.PUBLISHER_NAME_FILTER);
    }

    public final boolean d() {
        return ((ftl) this.a.get()).a(gvt.OFFICIAL_STORIES_ONLY);
    }

    public final boolean e() {
        return ((ftl) this.a.get()).a(gvt.LONGFORM_STORIES_ONLY);
    }

    public final boolean f() {
        return ((ftl) this.a.get()).a(gvt.CATEGORY_SECTIONS);
    }

    public final boolean g() {
        return ((ftl) this.a.get()).a(gvt.SHOW_ALL_CATEGORY_SECTIONS);
    }

    public final int h() {
        return ((ftl) this.a.get()).y(gvt.CATEGORY_SECTIONS_TREATMENT_GROUP).ordinal();
    }

    public final boolean i() {
        return ((ftl) this.a.get()).a(gvt.ENABLE_PREFETCH_DEBUGGER);
    }

    public final ajdx<Optional<String>> j() {
        return ajdx.c(new -$$Lambda$hoy$EukFxEUS2ORjDwriC31hpra4GrA(this)).f(new -$$Lambda$hoy$l8sUvhNmaRXzFNXPPHn_RqBMzZI(this));
    }

    public final boolean k() {
        return ((ftl) this.a.get()).a(jic.SHOW_QUICK_ADD_UNIT) && ((ftl) this.a.get()).a(jic.QUICK_ADD_IN_DF_V2);
    }

    public final boolean l() {
        return ((ftl) this.a.get()).a(gvt.ENABLE_RECOMMENDED_SUBSCRIPTIONS);
    }

    public final boolean m() {
        return ((ftl) this.a.get()).a(gvt.FRIEND_TEACHING_BUTTON_ENABLED);
    }

    public final boolean n() {
        return ((ftl) this.a.get()).a(gvt.FRIEND_TEACHING_BUTTON_COOLDOWN_HOURS_OVERRIDE);
    }

    public final boolean o() {
        return ((ftl) this.a.get()).a(gvt.FRIEND_TEACHING_BUTTON_TRIGGER_HOURS_OVERRIDE);
    }

    public final int p() {
        return Long.valueOf(((ftl) this.a.get()).h(gvt.FRIEND_TEACHING_BUTTON_COOLDOWN_HOURS)).intValue();
    }

    public final int q() {
        return Long.valueOf(((ftl) this.a.get()).h(gvt.FRIEND_TEACHING_BUTTON_TRIGGER_HOURS)).intValue();
    }

    public final int r() {
        return Long.valueOf(((ftl) this.a.get()).h(gvt.FRIEND_TEACHING_BUTTON_NUM_UNVIEWED_STORIES)).intValue();
    }

    public final boolean s() {
        boolean a = ((ftl) this.a.get()).a(gvt.BACKGROUND_PREFETCH_ENABLE_FRIEND_STORY);
        ((ftl) this.a.get()).w(gvt.BACKGROUND_PREFETCH_ENABLE_FRIEND_STORY);
        return a;
    }

    public final int t() {
        return ((ftl) this.a.get()).f(gvt.BACKGROUND_PREFETCH_NUM_FRIEND_STORY);
    }

    public final int u() {
        return ((ftl) this.a.get()).f(gvt.BACKGROUND_PREFETCH_NUM_SNAPS_PER_FRIEND_STORY);
    }

    public final int v() {
        return ((ftl) this.a.get()).f(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_DELAY_MINS);
    }

    public final long w() {
        return ((ftl) this.a.get()).h(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_TIMEOUT_MINS);
    }

    public final int[] x() {
        String j = ((ftl) this.a.get()).j(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_PREFETCH_FIXED_TIME);
        int i = 0;
        int[] iArr = new int[0];
        if (!"N/A".equalsIgnoreCase(j)) {
            String[] split = j.split(ppy.b);
            iArr = new int[split.length];
            while (i < split.length) {
                iArr[i] = Integer.parseInt(split[i]);
                i++;
            }
        }
        return iArr;
    }

    public final boolean y() {
        return ((ftl) this.a.get()).a(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_SKIP_DOWNLOADED_STORIES);
    }

    public final boolean z() {
        boolean a = ((ftl) this.a.get()).a(gvt.BACKGROUND_PREFETCH_ENABLE_SUBSCRIPTION_STORY);
        ((ftl) this.a.get()).w(gvt.BACKGROUND_PREFETCH_ENABLE_SUBSCRIPTION_STORY);
        return a;
    }
}
