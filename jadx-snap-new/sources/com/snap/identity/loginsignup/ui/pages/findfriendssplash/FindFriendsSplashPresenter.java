package com.snap.identity.loginsignup.ui.pages.findfriendssplash;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import android.widget.Toast;
import com.google.common.base.MoreObjects;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aawg;
import defpackage.aawh;
import defpackage.aawn;
import defpackage.aaxp;
import defpackage.achb;
import defpackage.achd;
import defpackage.agza;
import defpackage.agze;
import defpackage.ahen;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxs;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.ajyn;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akgb;
import defpackage.gpb;
import defpackage.ifs;
import defpackage.ifu;
import defpackage.ifx;
import defpackage.iho;
import defpackage.iqm;
import defpackage.irc;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.iyp;
import defpackage.jaa;
import defpackage.jab;
import defpackage.jbk;
import defpackage.jbo;
import defpackage.jbp;
import defpackage.jbv;
import defpackage.jdy;
import defpackage.jeb;
import defpackage.jfg;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zhh;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public final class FindFriendsSplashPresenter extends zll<jfg> implements defpackage.k {
    boolean a;
    final aipn<zke> b;
    final aipn<Context> c;
    final iqm d;
    final jbv e;
    final jdy f;
    final jbk g;
    final jbp h;
    final aipn<zhh> i;
    final aipn<gpb> j;
    private iyp k = iyp.a;
    private final ajxe l = ajxh.a(new m(this));
    private final aipn<achb<zjm, zjk>> m;
    private final zgb n;
    private final ifs o;
    private final aipn<isf> p;

    public static final class f implements OnGlobalLayoutListener {
        private /* synthetic */ FindFriendsSplashPresenter a;

        f(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final void onGlobalLayout() {
            jfg jfg = (jfg) this.a.getTarget();
            if (jfg != null) {
                View a = jfg.a();
                if (a != null) {
                    ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            }
            FindFriendsSplashPresenter.b(this.a);
        }
    }

    static final class i implements OnClickListener {
        private /* synthetic */ FindFriendsSplashPresenter a;

        i(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final void onClick(View view) {
            FindFriendsSplashPresenter.a(this.a);
        }
    }

    static final class j implements OnClickListener {
        private /* synthetic */ FindFriendsSplashPresenter a;

        j(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final void onClick(View view) {
            FindFriendsSplashPresenter findFriendsSplashPresenter = this.a;
            Object obj = findFriendsSplashPresenter.j.get();
            akcr.a(obj, "userAuthStore.get()");
            CharSequence charSequence = ((gpb) obj).a().e;
            obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj != null) {
                findFriendsSplashPresenter.c();
            } else {
                findFriendsSplashPresenter.d();
            }
        }
    }

    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        a(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (Set) obj;
            akcr.b(obj, "addressBookContacts");
            jbp jbp = this.a.h;
            ajej e = ajcx.a((Runnable) new defpackage.jbp.f(jbp, obj.size())).b(jbp.b).e();
            akcr.a((Object) e, "Completable.fromRunnable…zedScheduler).subscribe()");
            ajvv.a(e, jbp.c);
            return this.a.d.a(defpackage.agzc.a.REGISTRATION, false, ajdx.b(obj), true);
        }
    }

    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        b(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agze agze = (agze) obj;
            akcr.b(agze, "it");
            jdy jdy = this.a.f;
            String str = "findFriendsResponse";
            akcr.b(agze, str);
            Iterable<ahen> iterable = (Iterable) MoreObjects.firstNonNull(agze.d, ajyw.a);
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ahen ahen : iterable) {
                arrayList.add(ajxs.a(ahen.a, ahen));
            }
            jdy.a = ajzm.a((Iterable) (List) arrayList);
            Iterable<agza> iterable2 = (Iterable) MoreObjects.firstNonNull(agze.a, ajyw.a);
            arrayList = new ArrayList(ajyn.a((Iterable) iterable2, 10));
            for (agza agza : iterable2) {
                arrayList.add(ajxs.a(agza.b, agza));
            }
            jdy.b = ajzm.a((Iterable) (List) arrayList);
            Object firstNonNull = MoreObjects.firstNonNull(agze.e, ajyw.a);
            akcr.a(firstNonNull, "firstNonNull(findFriends…FriendOrdering, listOf())");
            jdy.d = (List) firstNonNull;
            firstNonNull = MoreObjects.firstNonNull(agze.f, ajyw.a);
            akcr.a(firstNonNull, "firstNonNull(findFriends…stionsOrdering, listOf())");
            jdy.e = (List) firstNonNull;
            firstNonNull = MoreObjects.firstNonNull(agze.a, ajyw.a);
            akcr.a(firstNonNull, "firstNonNull(findFriends…sponse.results, listOf())");
            jdy.c = (List) firstNonNull;
            List list = jdy.c;
            if (list == null) {
                akcr.a("contactResultOrdering");
            }
            jdy.c = ajyu.a((Iterable) list, (Comparator) new defpackage.jdy.c());
            jbp jbp = this.a.h;
            akcr.b(agze, str);
            ajej e = ajcx.a((Runnable) new defpackage.jbp.g(jbp, agze)).b(jbp.b).e();
            akcr.a((Object) e, "Completable.fromRunnable…zedScheduler).subscribe()");
            ajvv.a(e, jbp.c);
            return this.a.h.a();
        }
    }

    static final class c<T> implements ajfb<ajej> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        c(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jfg jfg = (jfg) this.a.getTarget();
            if (jfg != null) {
                jfg.j();
            }
        }
    }

    static final class d<T> implements ajfb<jbo> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        d(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jbo jbo = (jbo) obj;
            jbk jbk = this.a.g;
            long j = jbo.c;
            jeb c = jbk.b().c();
            if (!akgb.a(c.n)) {
                aawn aawn = new aawn();
                aawn.b(c.n);
                aawn.d(Boolean.valueOf(jbk.m()));
                aawn.a(Long.valueOf(j));
                aawn.a(Boolean.FALSE);
                aawn.a(((isc) jbk.g.get()).a());
                jbk.a().a(aawn);
            }
            akcr.a((Object) jbo, "friendingMetadata");
            if (!FindFriendsSplashPresenter.a(jbo)) {
                this.a.g.a(jbo.c, 0, jbo.e, 0, jbo.b, jbo.g, jbo.h);
            }
            ((zke) this.a.b.get()).a(new jaa(FindFriendsSplashPresenter.a(jbo)));
        }
    }

    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        e(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Toast.makeText((Context) this.a.c.get(), R.string.default_error_try_again_later, 0).show();
            jfg jfg = (jfg) this.a.getTarget();
            if (jfg != null) {
                jfg.k();
            }
            ((zke) this.a.b.get()).a(new jaa(false));
        }
    }

    static final class g<T> implements ajfb<ifx> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        g(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ifx ifx = (ifx) obj;
            if (ifx.a == ifu.REG_FIND_FRIENDS) {
                String str = "android.permission.READ_CONTACTS";
                if (ifx.a(str)) {
                    this.a.a(ifx.b(str), true);
                }
            }
        }
    }

    static final class h<T> implements ajfb<Throwable> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        h(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(true, false);
        }
    }

    static final class k<T> implements ajfb<Integer> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        k(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            FindFriendsSplashPresenter.b(this.a);
        }
    }

    static final class l<T> implements ajfb<Throwable> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class m extends akcs implements akbk<zfw> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        m(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.e.callsite("FindFriendsSplashPresenter"));
        }
    }

    static final class n extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        n(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            FindFriendsSplashPresenter.a(this.a);
            return ajxw.a;
        }
    }

    static final class o extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ FindFriendsSplashPresenter a;

        o(FindFriendsSplashPresenter findFriendsSplashPresenter) {
            this.a = findFriendsSplashPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.a(false, false);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(FindFriendsSplashPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public FindFriendsSplashPresenter(aipn<zke> aipn, aipn<Context> aipn2, aipn<achb<zjm, zjk>> aipn3, iqm iqm, jbv jbv, zgb zgb, ifs ifs, jdy jdy, jbk jbk, aipn<isf> aipn4, jbp jbp, aipn<zhh> aipn5, aipn<gpb> aipn6) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "context");
        akcr.b(aipn3, "navigationHost");
        akcr.b(iqm, "contactApi");
        akcr.b(jbv, "loginSignupFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ifs, "permissionHelper");
        akcr.b(jdy, "friendSuggestionProvider");
        akcr.b(jbk, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn4, "stateTransitionService");
        akcr.b(jbp, "friendingMetadataService");
        akcr.b(aipn5, "softKeyboardDetector");
        akcr.b(aipn6, "userAuthStore");
        this.b = aipn;
        this.c = aipn2;
        this.m = aipn3;
        this.d = iqm;
        this.e = jbv;
        this.n = zgb;
        this.o = ifs;
        this.f = jdy;
        this.g = jbk;
        this.p = aipn4;
        this.h = jbp;
        this.i = aipn5;
        this.j = aipn6;
    }

    private final void a(ajdx<agze> ajdx) {
        zln.bindTo$default(this, ajdx.a((ajfc) new b(this)).a((ajdw) a().l()).b((ajfb) new c(this)).a((ajfb) new d(this), (ajfb) new e(this)), this, null, null, 6, null);
    }

    public static final /* synthetic */ void b(FindFriendsSplashPresenter findFriendsSplashPresenter) {
        jfg jfg = (jfg) findFriendsSplashPresenter.getTarget();
        if (jfg != null) {
            View a = jfg.a();
            if (a != null) {
                jfg jfg2 = (jfg) findFriendsSplashPresenter.getTarget();
                if (!(jfg2 == null || jfg2.d() == null)) {
                    jfg jfg3 = (jfg) findFriendsSplashPresenter.getTarget();
                    if (!(jfg3 == null || jfg3.g() == null)) {
                        jfg jfg4 = (jfg) findFriendsSplashPresenter.getTarget();
                        if (!(jfg4 == null || jfg4.h() == null)) {
                            jfg jfg5 = (jfg) findFriendsSplashPresenter.getTarget();
                            if (jfg5 != null) {
                                View i = jfg5.i();
                                if (i != null) {
                                    int height = a.getHeight();
                                    Iterable<TextView> b = ajym.b((Object[]) new TextView[]{r1, r2, r3});
                                    Collection arrayList = new ArrayList(ajyn.a((Iterable) b, 10));
                                    for (TextView height2 : b) {
                                        arrayList.add(Integer.valueOf(height2.getHeight()));
                                    }
                                    int w = ajyu.w((List) arrayList);
                                    Collection arrayList2 = new ArrayList(ajyn.a((Iterable) b, 10));
                                    for (View view : b) {
                                        arrayList2.add(Integer.valueOf(iho.g(view) + iho.h(view)));
                                    }
                                    height = ((height - w) - ajyu.w((List) arrayList2)) - (iho.g(i) + iho.h(i));
                                    Object obj = findFriendsSplashPresenter.c.get();
                                    akcr.a(obj, "context.get()");
                                    if (height >= ((Context) obj).getResources().getDimensionPixelSize(R.dimen.signup_find_friends_splash_image_min_height)) {
                                        findFriendsSplashPresenter.a = true;
                                        LayoutParams layoutParams = i.getLayoutParams();
                                        layoutParams.height = height;
                                        i.setLayoutParams(layoutParams);
                                        i.setVisibility(0);
                                        return;
                                    }
                                    findFriendsSplashPresenter.a = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.l.b();
    }

    /* renamed from: a */
    public final void takeTarget(jfg jfg) {
        akcr.b(jfg, "target");
        super.takeTarget(jfg);
        jfg.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, boolean z2) {
        boolean z3 = true;
        String str = "userAuthStore.get()";
        jbk jbk;
        if (z) {
            iqm iqm = this.d;
            Object obj = this.j.get();
            akcr.a(obj, str);
            String b = ((gpb) obj).b();
            akcr.a((Object) b, "userAuthStore.get().username");
            iqm.a(b);
            this.h.b();
            jbp jbp = this.h;
            ajej e = ajcx.a((Runnable) new defpackage.jbp.d(jbp)).b(jbp.b).e();
            akcr.a((Object) e, "Completable.fromRunnable…zedScheduler).subscribe()");
            ajvv.a(e, jbp.c);
            this.g.a(true);
            jbk = this.g;
            aawh aawh = new aawh();
            aawh.a(aaxp.V2);
            aawh.a(((isc) jbk.g.get()).a());
            jbk.a().a(aawh);
            ((isf) this.p.get()).a(aaoo.SIGNUP_FIND_FRIENDS_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
            ajdx a = this.d.b().b((ajdw) a().b()).a((ajdw) a().g()).a((ajfc) new a(this));
            akcr.a((Object) a, "contactApi.getAllContact…= true)\n                }");
            a(a);
            return;
        }
        this.g.a(false);
        jbk = this.g;
        aawg aawg = new aawg();
        aawg.a(aaxp.V2);
        aawg.a(((isc) jbk.g.get()).a());
        jbk.a().a(aawg);
        Object obj2 = this.j.get();
        akcr.a(obj2, str);
        CharSequence charSequence = ((gpb) obj2).a().e;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z3 = false;
        }
        if (z3 || !z2) {
            ((zke) this.b.get()).a(new jab());
        } else {
            d();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        jfg jfg = (jfg) getTarget();
        if (jfg != null) {
            View a = jfg.a();
            if (a != null) {
                ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new f(this));
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        zjm zjm = new zjm(irc.t, "FindFriendsSplashPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
        Object obj = this.m.get();
        akcr.a(obj, "navigationHost.get()");
        achb achb = (achb) obj;
        obj = this.c.get();
        akcr.a(obj, "context.get()");
        zgy a = defpackage.zgy.a.a(new defpackage.zgy.a((Context) obj, achb, zjm, false, null, 24).b((int) R.string.signup_skip_dialog_description).a((int) R.string.signup_skip_dialog_yes, (akbl) new n(this), false), (akbl) new o(this), false, Integer.valueOf(R.string.signup_skip_dialog_no), null, null, 24).a();
        ((achb) this.m.get()).a((achd) a, a.a, null);
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        a(this.d.a(defpackage.agzc.a.REGISTRATION, true, null, true));
    }

    public final void dropTarget() {
        Object obj = (jfg) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }
}
