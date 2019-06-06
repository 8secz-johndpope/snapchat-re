package defpackage;

import android.content.Context;
import android.view.View;
import com.snap.identity.ui.AddSnapcodeFragment;
import com.snap.identity.ui.profile.ContactsFragment;
import com.snapchat.android.R;
import defpackage.zgy.a;

/* renamed from: iys */
public final class iys extends ajed implements iqs {
    final ajei a = new ajei();
    final iqv b;
    private final zfw c = zgb.a(irc.t.callsite("FriendActionDispatcher"));
    private final ajxe d;
    private final ajxe e;
    private final ajdx<ira> f;
    private final ajws<psh> g;
    private final achb<zjm, zjk> h;
    private final ajwy<usd> i;
    private final ajwy<pqn> j;
    private final Context k;

    /* renamed from: iys$k */
    static final class k extends akcq implements akbk<upx> {
        k(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (upx) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: iys$a */
    static final class a extends akcq implements akbk<zhn> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zhn) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: iys$b */
    static final class b implements ajev {
        public static final b a = new b();

        b() {
        }

        public final void run() {
        }
    }

    /* renamed from: iys$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            abpe.a("FriendActionDispatcher", (Throwable) obj, "Failed to add a friend", new Object[0]);
        }
    }

    /* renamed from: iys$d */
    static final class d implements ajev {
        public static final d a = new d();

        d() {
        }

        public final void run() {
        }
    }

    /* renamed from: iys$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ void accept(Object obj) {
            abpe.a("FriendActionDispatcher", (Throwable) obj, "Failed to block a friend", new Object[0]);
        }
    }

    /* renamed from: iys$g */
    static final class g<T, R> implements ajfc<ira, ajdb> {
        private /* synthetic */ isu a;

        g(isu isu) {
            this.a = isu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ira ira = (ira) obj;
            akcr.b(ira, "it");
            return ira.a(this.a);
        }
    }

    /* renamed from: iys$i */
    static final class i implements ajev {
        public static final i a = new i();

        i() {
        }

        public final void run() {
        }
    }

    /* renamed from: iys$j */
    static final class j<T> implements ajfb<Throwable> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ void accept(Object obj) {
            abpe.a("FriendActionDispatcher", (Throwable) obj, "Failed to delete a friend", new Object[0]);
        }
    }

    /* renamed from: iys$f */
    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ iys a;
        private /* synthetic */ ist b;

        /* renamed from: iys$f$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        /* renamed from: iys$f$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        f(iys iys, ist ist) {
            this.a = iys;
            this.b = ist;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ajej a = this.a.b.a(this.b).a((ajev) 1.a, (ajfb) 2.a);
            akcr.a((Object) a, "friendActionProcessor.pr…led to hide a friend\") })");
            ajvv.a(a, this.a.a);
            return ajxw.a;
        }
    }

    /* renamed from: iys$h */
    static final class h extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ iys a;
        private /* synthetic */ isv b;

        /* renamed from: iys$h$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        /* renamed from: iys$h$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        h(iys iys, isv isv) {
            this.a = iys;
            this.b = isv;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ajej a = this.a.b.a(this.b).a((ajev) 1.a, (ajfb) 2.a);
            akcr.a((Object) a, "friendActionProcessor.pr…ore a friend request\") })");
            ajvv.a(a, this.a.a);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iys.class), "profileActionMenuData", "getProfileActionMenuData()Lcom/snap/profile/api/actionmenu/ProfileActionMenuDataProvider;"), new akdc(akde.a(iys.class), "actionMenuLauncher", "getActionMenuLauncher()Lcom/snap/ui/actionmenu/ActionMenuLauncher;")};
    }

    public iys(ajdx<ira> ajdx, iqv iqv, ajws<psh> ajws, achb<zjm, zjk> achb, ajwy<usd> ajwy, zgb zgb, ajwy<pqn> ajwy2, Context context, ajwy<zhn> ajwy3, ajwy<upx> ajwy4) {
        akcr.b(ajdx, "identityApi");
        akcr.b(iqv, "friendActionProcessor");
        akcr.b(ajws, "quickReplyEventSubject");
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy, "unifiedProfileLauncher");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "chatLauncher");
        akcr.b(context, "context");
        akcr.b(ajwy3, "actionMenuLauncherProvider");
        akcr.b(ajwy4, "profileActionMenuDataProvider");
        this.f = ajdx;
        this.b = iqv;
        this.g = ajws;
        this.h = achb;
        this.i = ajwy;
        this.j = ajwy2;
        this.k = context;
        this.d = ajxh.a(new k(ajwy4));
        this.e = ajxh.a(new a(ajwy3));
    }

    private final void a() {
        zjf zjf = new zjf(irc.g, new ContactsFragment(), acgv.a().a(irc.i).a());
        achb achb = this.h;
        achd achd = zjf;
        acgu acgu = irc.h;
        akcr.a((Object) acgu, "IdentityFeature.PROFILE_…_CONTACTS_PRESENT_DEFAULT");
        achb.a(achd, acgu, null);
    }

    public final void a(isi isi) {
        akcr.b(isi, "event");
        a();
    }

    public final void a(isj isj) {
        akcr.b(isj, "event");
        ajej a = this.b.a(isj).a((ajev) b.a, (ajfb) c.a);
        akcr.a((Object) a, "friendActionProcessor.pr…ailed to add a friend\")})");
        ajvv.a(a, this.a);
    }

    public final void a(isk isk) {
        akcr.b(isk, "event");
        zjf zjf = new zjf(irc.j, new AddSnapcodeFragment(), acgv.a().a(irc.l).a());
        achb achb = this.h;
        achd achd = zjf;
        acgu acgu = irc.k;
        akcr.a((Object) acgu, "IdentityFeature.PROFILE_…_SNAPCODE_PRESENT_DEFAULT");
        achb.a(achd, acgu, null);
    }

    public final void a(isl isl) {
        akcr.b(isl, "event");
        ajej a = this.b.a(isl).a((ajev) d.a, (ajfb) e.a);
        akcr.a((Object) a, "friendActionProcessor.pr…led to block a friend\")})");
        ajvv.a(a, this.a);
    }

    public final void a(ism ism) {
        akcr.b(ism, "event");
        a();
    }

    public final void a(iso iso) {
        usd usd;
        akcr.b(iso, "event");
        usq usq;
        if (iso.c != null) {
            usd = (usd) this.i.get();
            usq = new usq(usg.FRIEND_PROFILE, iso.b, null, iso.d, null, 20);
        } else {
            usd = (usd) this.i.get();
            usq = new usq(usg.FRIEND_PROFILE, iso.b, null, iso.d, null, 20);
        }
        usd.a(r8);
    }

    public final void a(isq isq) {
        isq isq2 = isq;
        akcr.b(isq2, "event");
        usq usq = new usq(usg.FRIEND_PROFILE, isq2.b, null, abbd.ADD_FRIENDS_PAGE, null, 20);
        Long l = isq2.a;
        String str = isq2.d;
        String str2 = isq2.b;
        if (str2 != null) {
            zhk a = ((upx) this.d.b()).a(new upu(l, str, str2, isq2.c, isq2.g, usq, aaua.PROFILE_ACTION_MENU, isq2.e, isq2.f, null, null, null, false, 7680), isq2.h);
            zhn zhn = (zhn) this.e.b();
            zjm zjm = r3;
            zjm zjm2 = new zjm(irc.t, "FriendActionDispatcher", false, false, true, false, null, false, false, false, false, null, 4076);
            zhn.a(zjm, a);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void a(isr isr) {
        String str = "event";
        akcr.b(isr, str);
        akcr.b(isr, str);
        ((usd) this.i.get()).a(new usq(usg.FRIEND_PROFILE, isr.a, null, abbd.ADD_FRIENDS_PAGE, null, 20));
    }

    public final void a(ist ist) {
        ist ist2 = ist;
        akcr.b(ist2, "event");
        zgy a = a.a(new a(this.k, this.h, new zjm(irc.t, "hide quick add", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.action_menu_hide_friend_question, ist2.e).a((int) R.string.unblock_yes, (akbl) new f(this, ist2), true), null, false, null, null, null, 31).a();
        this.h.a((achd) a, a.a, null);
    }

    public final void a(isu isu) {
        akcr.b(isu, "event");
        ajej e = this.f.e((ajfc) new g(isu)).e();
        akcr.a((Object) e, "identityApi\n            …             .subscribe()");
        ajvv.a(e, this.a);
    }

    public final void a(isv isv) {
        isv isv2 = isv;
        akcr.b(isv2, "event");
        zgy a = a.a(new a(this.k, this.h, new zjm(irc.t, "ignore friend request", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.action_menu_ignore_friend_question, isv2.a).a((int) R.string.ignore_button, (akbl) new h(this, isv2), true), null, false, null, null, null, 31).a();
        this.h.a((achd) a, a.a, null);
    }

    public final void a(isw isw) {
        akcr.b(isw, "event");
        ajvv.a(this.b.a(isw), this.a);
    }

    public final void a(isy isy) {
        akcr.b(isy, "event");
        ajej e = ((pqn) this.j.get()).b(isy.a, this.c, abbd.CHAT).e();
        akcr.a((Object) e, "chatLauncher.get().launc…             .subscribe()");
        ajvv.a(e, this.a);
    }

    public final void a(itc itc) {
        akcr.b(itc, "event");
        ajej a = this.b.a(itc).a((ajev) i.a, (ajfb) j.a);
        akcr.a((Object) a, "friendActionProcessor.pr…ed to delete a friend\")})");
        ajvv.a(a, this.a);
    }

    public final void a(ite ite) {
        akcr.b(ite, "event");
        if (ite.a != null && ite.c != null) {
            gcn gcn;
            String str = ite.a;
            if (str == null) {
                akcr.a();
            }
            String str2 = ite.b;
            String str3 = ite.c;
            if (str3 == null) {
                akcr.a();
            }
            switch (iqu.a[ite.d.ordinal()]) {
                case 1:
                    gcn = gcn.FEED_DOUBLE_TAP;
                    break;
                case 2:
                    gcn = gcn.DISCOVER;
                    break;
                case 3:
                    gcn = gcn.SEARCH_CONTACT;
                    break;
                case 4:
                    gcn = gcn.MINI_PROFILE;
                    break;
                case 5:
                    gcn = gcn.SNAPCODE;
                    break;
                case 6:
                    gcn = gcn.SEARCH_NEW_FRIENDS;
                    break;
                case 7:
                    gcn = gcn.CAMERA;
                    break;
                case 8:
                    gcn = gcn.STORY;
                    break;
                default:
                    throw new ajxk();
            }
            this.g.a((Object) new psh(new psv(str, str2, str3, gcn, ite.e), null, null, false, null, 30));
        }
    }

    public final void onDispose() {
        this.a.dispose();
    }
}
