package com.snap.identity.loginsignup.ui.pages.findfriends;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aavy;
import defpackage.aawi;
import defpackage.aaxo;
import defpackage.aaxp;
import defpackage.achb;
import defpackage.achd;
import defpackage.agzs;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfd;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akgb;
import defpackage.akqq;
import defpackage.ide;
import defpackage.igs;
import defpackage.iqv;
import defpackage.ira;
import defpackage.irc;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.isj;
import defpackage.ixj;
import defpackage.izz;
import defpackage.jbk;
import defpackage.jbo;
import defpackage.jbp;
import defpackage.jbv;
import defpackage.jdy;
import defpackage.jeb;
import defpackage.jew;
import defpackage.jex;
import defpackage.jey;
import defpackage.jez;
import defpackage.jfa;
import defpackage.jfb;
import defpackage.jrl;
import defpackage.jtj;
import defpackage.jtk;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zma;
import defpackage.zmg;
import defpackage.zms;
import java.util.List;
import java.util.concurrent.Callable;

public final class FindFriendsPresenter extends zll<jez> implements defpackage.k {
    private static final String s = s;
    zkf a;
    final zfw b = zgb.a(irc.t.callsite(s));
    public zmg c;
    boolean d;
    jtk e;
    final aipn<Context> f;
    final ajwy<zke> g;
    final SnapDb h;
    final jdy i;
    final ajwy<ixj> j;
    final jbk k;
    final aipn<isf> l;
    final jbp m;
    private final ajxe n = ajxh.a(new c(this));
    private boolean o;
    private final iqv p;
    private final ira q;
    private final aipn<achb<zjm, zjk>> r;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class d<V> implements Callable<Object> {
        private /* synthetic */ FindFriendsPresenter a;

        d(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final /* synthetic */ Object call() {
            zms zms = new zms(jfa.class);
            zma[] zmaArr = new zma[2];
            jdy jdy = this.a.i;
            Object obj = jdy.c;
            if (obj == null) {
                akcr.a("contactResultOrdering");
            }
            ajdt b = ajdp.b(obj);
            Object obj2 = jdy.b;
            if (obj2 == null) {
                akcr.a("userIdToContactFriendMap");
            }
            Object a = ajdp.a(b, (ajdt) ajdp.b(obj2), (ajdt) jdy.f, (ajfd) new defpackage.jdy.a(jdy));
            akcr.a(a, "Observable.combineLatest…     }\n                })");
            jdy jdy2 = this.a.i;
            List list = jdy2.d;
            if (list == null) {
                akcr.a("suggestedFriendOrdering");
            }
            ajdp a2 = jdy2.a(list);
            jez jez = (jez) this.a.getTarget();
            if (jez == null) {
                akcr.a();
            }
            zmaArr[0] = new jew(a, a2, jez.getString(R.string.signup_add_friends_contacts_header), this.a.e);
            jdy2 = this.a.i;
            list = jdy2.e;
            if (list == null) {
                akcr.a("officialAccountOrdering");
            }
            a2 = jdy2.a(list);
            jez = (jez) this.a.getTarget();
            if (jez == null) {
                akcr.a();
            }
            zmaArr[1] = new jex(a2, jez.getString(R.string.signup_add_friends_top_stories_header), this.a.e);
            List b2 = ajym.b((Object[]) zmaArr);
            FindFriendsPresenter findFriendsPresenter = this.a;
            zkf zkf = findFriendsPresenter.a;
            if (zkf == null) {
                akcr.a("bus");
            }
            zmg zmg = new zmg(zms, zkf.a(), this.a.b.b(), b2);
            akcr.b(zmg, "<set-?>");
            findFriendsPresenter.c = zmg;
            FindFriendsPresenter findFriendsPresenter2 = this.a;
            return zln.bindTo$default(findFriendsPresenter2, findFriendsPresenter2.a().c(), this.a, null, null, 6, null);
        }
    }

    static final class j implements OnClickListener {
        private /* synthetic */ FindFriendsPresenter a;

        j(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final void onClick(View view) {
            this.a.c();
        }
    }

    static final class k implements OnClickListener {
        private /* synthetic */ FindFriendsPresenter a;

        k(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final void onClick(View view) {
            this.a.b();
        }
    }

    static final class b<T> implements ajfb<jbo> {
        private /* synthetic */ FindFriendsPresenter a;

        b(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jbo jbo = (jbo) obj;
            jbk jbk = this.a.k;
            long j = jbo.d;
            jeb c = jbk.b().c();
            if (!akgb.a(c.n)) {
                aavy aavy = new aavy();
                aavy.b(c.n);
                aavy.d(Boolean.valueOf(jbk.m()));
                aavy.a(Long.valueOf(j));
                aavy.a(((isc) jbk.g.get()).a());
                jbk.a().a(aavy);
            }
            this.a.k.a(jbo.c, jbo.d, jbo.e, jbo.f, jbo.b, jbo.g, jbo.h);
            ((zke) this.a.g.get()).a(new izz());
        }
    }

    static final class e implements ajev {
        private /* synthetic */ FindFriendsPresenter a;
        private /* synthetic */ isj b;

        e(FindFriendsPresenter findFriendsPresenter, isj isj) {
            this.a = findFriendsPresenter;
            this.b = isj;
        }

        public final void run() {
            if (this.b.b != null) {
                jdy jdy = this.a.i;
                String str = this.b.b;
                if (str == null) {
                    akcr.a();
                }
                jdy.a(str);
            }
            this.a.m.a(false);
            ((isf) this.a.l.get()).a(aaoo.SIGNUP_ADD_FRIEND_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
            FindFriendsPresenter findFriendsPresenter = this.a;
            findFriendsPresenter.d = true;
            findFriendsPresenter.d();
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ FindFriendsPresenter a;

        f(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a().a().notifyDataSetChanged();
        }
    }

    static final class g<T> implements ajfb<agzs> {
        private /* synthetic */ FindFriendsPresenter a;

        g(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            final agzs agzs = (agzs) obj;
            ((ixj) this.a.j.get()).a(agzs.a).k(new ajfc<ajdx<T>, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((ajdx) obj, "it");
                    return agzs;
                }
            });
            jdy jdy = this.a.i;
            String str = agzs.a.b;
            akcr.a((Object) str, "resp.`object`.userId");
            jdy.a(str);
        }
    }

    static final class h<T> implements ajfb<agzs> {
        private /* synthetic */ FindFriendsPresenter a;

        h(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.m.a(true);
            ((isf) this.a.l.get()).a(aaoo.SIGNUP_ADD_FRIEND_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
            FindFriendsPresenter findFriendsPresenter = this.a;
            findFriendsPresenter.d = true;
            findFriendsPresenter.d();
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ FindFriendsPresenter a;

        i(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a().a().notifyDataSetChanged();
        }
    }

    static final class r<T> implements ajfb<jbo> {
        private /* synthetic */ FindFriendsPresenter a;

        r(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jbo jbo = (jbo) obj;
            jbk jbk = this.a.k;
            long j = jbo.c;
            long j2 = jbo.e;
            long j3 = jbo.b;
            boolean z = jbo.g;
            double d = jbo.h;
            aawi aawi = new aawi();
            aawi.a(Boolean.TRUE);
            aawi.a(Long.valueOf(j));
            aawi.b(Long.valueOf(j2));
            aawi.c(Long.valueOf(j3));
            aawi.b(Boolean.valueOf(z));
            aawi.a(Double.valueOf(d));
            aawi.a(jbk.b().c().j ? aaxo.PHONE : aaxo.CAPTCHA);
            aawi.a(aaxp.V2);
            aawi.a(((isc) jbk.g.get()).a());
            jbk.a().a(aawi);
            ((zke) this.a.g.get()).a(new izz());
        }
    }

    static final class s implements ajev {
        private /* synthetic */ FindFriendsPresenter a;
        private /* synthetic */ jez b;

        s(FindFriendsPresenter findFriendsPresenter, jez jez) {
            this.a = findFriendsPresenter;
            this.b = jez;
        }

        public final void run() {
            this.b.getLifecycle().a(this.a);
        }
    }

    static final class t<T> implements ajfb<Throwable> {
        public static final t a = new t();

        t() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c extends akcs implements akbk<DbClient> {
        private /* synthetic */ FindFriendsPresenter a;

        c(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.h.getDbClient((ide) irc.t);
        }
    }

    static final class q extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ FindFriendsPresenter a;

        q(FindFriendsPresenter findFriendsPresenter) {
            this.a = findFriendsPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            FindFriendsPresenter findFriendsPresenter = this.a;
            zln.bindTo$default(findFriendsPresenter, findFriendsPresenter.m.a().b((ajdw) findFriendsPresenter.b.l()).e((ajfb) new r(findFriendsPresenter)), findFriendsPresenter, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class l extends akcq implements akbk<Integer> {
        l(ProgressButton progressButton) {
            super(0, progressButton);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(ProgressButton.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((ProgressButton) this.receiver).getVisibility());
        }
    }

    static final class m extends akcq implements akbl<Integer, ajxw> {
        m(ProgressButton progressButton) {
            super(1, progressButton);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(ProgressButton.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ProgressButton) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class n extends akcq implements akbk<Integer> {
        n(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class o extends akcq implements akbl<Integer, ajxw> {
        o(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class p extends akcq implements akbl<Integer, ajxw> {
        p(ProgressButton progressButton) {
            super(1, progressButton);
        }

        public final String getName() {
            return "setState";
        }

        public final akej getOwner() {
            return akde.a(ProgressButton.class);
        }

        public final String getSignature() {
            return "setState(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ProgressButton) this.receiver).setState(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(FindFriendsPresenter.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
        a aVar = new a();
    }

    public FindFriendsPresenter(aipn<Context> aipn, zgb zgb, ajwy<zke> ajwy, SnapDb snapDb, iqv iqv, jdy jdy, ajwy<ixj> ajwy2, ira ira, jbk jbk, aipn<achb<zjm, zjk>> aipn2, aipn<isf> aipn3, jbp jbp, jtj jtj) {
        akcr.b(aipn, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "eventDispatcher");
        akcr.b(snapDb, "snapDb");
        akcr.b(iqv, "friendActionProcessor");
        akcr.b(jdy, "friendSuggestionProvider");
        akcr.b(ajwy2, "friendRepository");
        akcr.b(ira, "identityApi");
        akcr.b(jbk, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn2, "navigationHost");
        akcr.b(aipn3, "stateTransitionService");
        akcr.b(jbp, "friendingMetadataService");
        akcr.b(jtj, "registrationSeenContactsListener");
        this.f = aipn;
        this.g = ajwy;
        this.h = snapDb;
        this.p = iqv;
        this.i = jdy;
        this.j = ajwy2;
        this.q = ira;
        this.k = jbk;
        this.r = aipn2;
        this.l = aipn3;
        this.m = jbp;
        this.e = new jtk(jtj);
    }

    public final zmg a() {
        zmg zmg = this.c;
        if (zmg == null) {
            akcr.a("adapter");
        }
        return zmg;
    }

    /* renamed from: a */
    public final void takeTarget(jez jez) {
        akcr.b(jez, "target");
        super.takeTarget(jez);
        zkf zkf = new zkf();
        zln zln = this;
        zln.bindTo$default(this, zkf, zln, null, null, 6, null);
        this.a = zkf;
        zkf = this.a;
        if (zkf == null) {
            akcr.a("bus");
        }
        zkf.a(this);
        ajcx b = ajcx.b((Callable) new d(this));
        akcr.a((Object) b, "Completable.fromCallable…ribe().bindTo(this)\n    }");
        zln.bindTo$default(this, igs.a(b, "initSignupFindFriendsAdapterAsync").b((ajdw) this.b.h()).a((ajdw) this.b.l()).a((ajev) new s(this, jez), (ajfb) t.a), zln, null, null, 6, null);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        zln.bindTo$default(this, this.m.a().b((ajdw) this.b.l()).e((ajfb) new b(this)), this, null, null, 6, null);
        this.o = true;
        d();
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        zjm zjm = new zjm(jbv.y, "signup_find_friends_skip_to_camera", false, false, true, false, null, false, false, false, false, null, 4076);
        Object obj = this.f.get();
        akcr.a(obj, "context.get()");
        Context context = (Context) obj;
        obj = this.r.get();
        akcr.a(obj, "navigationHost.get()");
        defpackage.zgy.a aVar = new defpackage.zgy.a(context, (achb) obj, zjm, false, null, 24);
        String string = ((Context) this.f.get()).getString(R.string.signup_add_friends_skip_dialogue);
        akcr.a((Object) string, "context.get().getString(…dd_friends_skip_dialogue)");
        zgy a = defpackage.zgy.a.a(aVar.b(string).a((int) R.string.yes, (akbl) new q(this), true), null, true, Integer.valueOf(R.string.no), null, null, 25).a();
        ((achb) this.r.get()).a((achd) a, a.a, null);
    }

    public final void d() {
        Object obj = (jez) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            int i = 0;
            jrl.a(Integer.valueOf(this.d ? 0 : 4), new l(obj.c()), new m(obj.c()));
            if (this.d) {
                i = 4;
            }
            jrl.a(Integer.valueOf(i), new n(obj.b()), new o(obj.b()));
            boolean z = this.o;
            i = 1;
            if (z) {
                i = 2;
            } else if (z) {
                throw new ajxk();
            }
            jrl.a(Integer.valueOf(i), new jey(obj.c()), new p(obj.c()));
        }
    }

    public final void dropTarget() {
        Object obj = (jez) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @akqq
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        ((isf) this.l.get()).a(aaoo.SIGNUP_ADD_FRIEND_SUBMIT, aaop.USER_PRESSED_BUTTON, ish.SIGNUP);
        zln.bindTo$default(this, this.p.a(isj).a((ajdw) this.b.l()).a((ajev) new e(this, isj), (ajfb) new f(this)), this, null, null, 6, null);
    }

    @akqq
    public final void onAddSignupSuggestedFriend(jfb jfb) {
        akcr.b(jfb, "event");
        ((isf) this.l.get()).a(aaoo.SIGNUP_ADD_FRIEND_SUBMIT, aaop.USER_PRESSED_BUTTON, ish.SIGNUP);
        zln.bindTo$default(this, this.q.a(jfb.a).a((ajdw) this.b.f()).c((ajfb) new g(this)).a((ajdw) this.b.l()).a((ajfb) new h(this), (ajfb) new i(this)), this, null, null, 6, null);
    }

    @defpackage.s(a = defpackage.j.a.ON_RESUME)
    public final void onFragmentResume() {
        jez jez = (jez) getTarget();
        if (jez != null) {
            View b = jez.b();
            if (b != null) {
                b.setOnClickListener(new j(this));
            }
        }
        jez = (jez) getTarget();
        if (jez != null) {
            ProgressButton c = jez.c();
            if (c != null) {
                c.setOnClickListener(new k(this));
            }
        }
        d();
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        jez jez = (jez) getTarget();
        RecyclerView a = jez != null ? jez.a() : null;
        if (a == null) {
            akcr.a();
        }
        zmg zmg = this.c;
        if (zmg == null) {
            akcr.a("adapter");
        }
        a.setAdapter(zmg.a());
        this.e.b();
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onFragmentStop() {
        jez jez = (jez) getTarget();
        if (jez != null) {
            View b = jez.b();
            if (b != null) {
                b.setOnClickListener(null);
            }
        }
        jez = (jez) getTarget();
        if (jez != null) {
            ProgressButton c = jez.c();
            if (c != null) {
                c.setOnClickListener(null);
            }
        }
        this.e.a();
    }
}
