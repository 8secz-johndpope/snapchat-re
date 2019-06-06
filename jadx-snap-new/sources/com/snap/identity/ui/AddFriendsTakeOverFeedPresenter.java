package com.snap.identity.ui;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import com.snap.core.db.column.FriendSuggestionPlacement;
import defpackage.ajcx;
import defpackage.ajcz;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajwl;
import defpackage.ajwm;
import defpackage.ajyl;
import defpackage.akcr;
import defpackage.akqq;
import defpackage.idj;
import defpackage.igs;
import defpackage.iqs;
import defpackage.iqt;
import defpackage.iqy;
import defpackage.irc;
import defpackage.isj;
import defpackage.ith;
import defpackage.j;
import defpackage.jkd;
import defpackage.jri;
import defpackage.jsa;
import defpackage.jsw;
import defpackage.jtg;
import defpackage.jth;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zlm;
import defpackage.zln;
import defpackage.zmg;
import defpackage.zms;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;

public final class AddFriendsTakeOverFeedPresenter extends zll<zlm> implements k {
    zmg a;
    public zkf b;
    final zms c = new zms(jri.class);
    final zfw d = zgb.a(irc.t.callsite("AddFriendsTakeOverFeedPresenter"));
    final jth e;
    final jkd f;
    final iqy g;
    private ajwm h;
    private final iqs i;

    static final class a<V> implements Callable<Object> {
        private /* synthetic */ AddFriendsTakeOverFeedPresenter a;

        a(AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter) {
            this.a = addFriendsTakeOverFeedPresenter;
        }

        public final /* synthetic */ Object call() {
            Object i = ajwl.i(Long.valueOf(Math.max(this.a.g.a(), this.a.g.c())));
            akcr.a(i, "BehaviorSubject.createDe…edMeTakeOverTimestamp()))");
            AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter = this.a;
            akcr.b(i, "lastSeenAddedMeTimestampSubject");
            ajdp c = addFriendsTakeOverFeedPresenter.f.c();
            idj idj = irc.a;
            iqt iqt = iqt.FRIENDS_FEED;
            ith ith = ith.TAKE_OVER_PAGE_ON_FRIENDS_FEED;
            zkf zkf = addFriendsTakeOverFeedPresenter.b;
            if (zkf == null) {
                akcr.a("bus");
            }
            Object a = zkf.a();
            akcr.a(a, "bus.eventDispatcher");
            jsa jsa = new jsa(c, i, idj, iqt, ith, a, addFriendsTakeOverFeedPresenter.e);
            AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter2 = this.a;
            zln.bindTo$default(addFriendsTakeOverFeedPresenter2, addFriendsTakeOverFeedPresenter2.a().a(jsa), this.a, null, null, 6, null);
            addFriendsTakeOverFeedPresenter = this.a;
            addFriendsTakeOverFeedPresenter.a = new zmg(addFriendsTakeOverFeedPresenter.c, this.a.a().a(), this.a.d.b(), ajyl.a(jsa));
            AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter3 = this.a;
            return zln.bindTo$default(addFriendsTakeOverFeedPresenter3, AddFriendsTakeOverFeedPresenter.a(addFriendsTakeOverFeedPresenter3).c(), this.a, null, null, 6, null);
        }
    }

    static final class b implements ajev {
        private /* synthetic */ AddFriendsTakeOverFeedPresenter a;

        b(AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter) {
            this.a = addFriendsTakeOverFeedPresenter;
        }

        public final void run() {
            zlm zlm = (zlm) this.a.getTarget();
            RecyclerView a = zlm != null ? zlm.a() : null;
            if (a == null) {
                akcr.a();
            }
            a.setAdapter(AddFriendsTakeOverFeedPresenter.a(this.a).a());
        }
    }

    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public AddFriendsTakeOverFeedPresenter(jkd jkd, iqy iqy, zgb zgb, iqs iqs, jtg jtg) {
        akcr.b(jkd, "dataProvider");
        akcr.b(iqy, "friendingApi");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(iqs, "friendActionDispatcher");
        akcr.b(jtg, "addedMeAndQuickAddSeenListener");
        this.f = jkd;
        this.g = iqy;
        this.i = iqs;
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        this.h = ajwm;
        this.e = new jth(FriendSuggestionPlacement.RECIPROCATION_TAKEOVER_FEED, jtg);
    }

    public final zkf a() {
        zkf zkf = this.b;
        if (zkf == null) {
            akcr.a("bus");
        }
        return zkf;
    }

    /* renamed from: a */
    public final void takeTarget(zlm zlm) {
        akcr.b(zlm, "target");
        super.takeTarget(zlm);
        zkf zkf = new zkf();
        zln.bindTo$default(this, zkf, this, null, null, 6, null);
        this.b = zkf;
        zkf = this.b;
        if (zkf == null) {
            akcr.a("bus");
        }
        zkf.a(this);
        zlm.getLifecycle().a(this);
        ajcx b = ajcx.b((Callable) new a(this));
        akcr.a((Object) b, "Completable.fromCallable…ribe().bindTo(this)\n    }");
        igs.a(b, "initAdapterAsync").b((ajdw) this.d.h()).a((ajdw) this.d.l()).a((ajcz) this.h);
    }

    public final void b() {
        this.g.a(System.currentTimeMillis());
    }

    public final void dropTarget() {
        zlm zlm = (zlm) getTarget();
        if (zlm != null) {
            j lifecycle = zlm.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.i.a(isj);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCloseTakeOverSectionEvent(jsw jsw) {
        akcr.b(jsw, "event");
        b();
        zlm zlm = (zlm) getTarget();
        if (zlm != null) {
            Activity d = zlm.d();
            if (d != null) {
                d.onBackPressed();
            }
        }
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        zln.bindTo$default(this, this.h.a((ajev) new b(this), (ajfb) c.a), this, null, null, 6, null);
        this.e.b();
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        b();
        this.e.a();
    }
}
