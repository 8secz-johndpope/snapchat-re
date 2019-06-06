package com.snap.identity.loginsignup.ui.pages.permissions;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.brightcove.player.event.Event;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.akcr;
import defpackage.ifs;
import defpackage.ifu;
import defpackage.ifx;
import defpackage.jaq;
import defpackage.jbv;
import defpackage.jgr;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class PermissionsPresenter extends zll<jgr> implements k {
    final ifs a;
    final zfw b = zgb.a(jbv.y.callsite(jbv.i.b()));
    final Activity c;
    final aipn<zke> d;

    static final class a implements OnClickListener {
        private /* synthetic */ PermissionsPresenter a;

        a(PermissionsPresenter permissionsPresenter) {
            this.a = permissionsPresenter;
        }

        public final void onClick(View view) {
            PermissionsPresenter permissionsPresenter = this.a;
            zln.bindTo$default(permissionsPresenter, permissionsPresenter.a.b(permissionsPresenter.c, ifu.REG_BLITZ).b((ajdw) permissionsPresenter.b.h()).a((ajfl) b.a).e().a((ajdw) permissionsPresenter.b.l()).a((ajfb) new c(permissionsPresenter), (ajfb) new d(permissionsPresenter)), permissionsPresenter, null, null, 6, null);
        }
    }

    static final class b<T> implements ajfl<ifx> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ifx ifx = (ifx) obj;
            akcr.b(ifx, "it");
            return ifx.a(ifu.REG_BLITZ);
        }
    }

    static final class c<T> implements ajfb<ifx> {
        private /* synthetic */ PermissionsPresenter a;

        c(PermissionsPresenter permissionsPresenter) {
            this.a = permissionsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((zke) this.a.d.get()).a(new jaq());
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ PermissionsPresenter a;

        d(PermissionsPresenter permissionsPresenter) {
            this.a = permissionsPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((zke) this.a.d.get()).a(new jaq());
        }
    }

    public PermissionsPresenter(Activity activity, zgb zgb, aipn<zke> aipn) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "eventDispatcher");
        this.c = activity;
        this.d = aipn;
        Object a = ifs.a();
        akcr.a(a, "PermissionHelper.getInstance()");
        this.a = a;
    }

    /* renamed from: a */
    public final void takeTarget(jgr jgr) {
        akcr.b(jgr, "target");
        super.takeTarget(jgr);
        jgr.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jgr) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        jgr jgr = (jgr) getTarget();
        if (jgr != null) {
            jgr.a().setOnClickListener(null);
        }
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        jgr jgr = (jgr) getTarget();
        if (jgr != null) {
            jgr.a().setOnClickListener(new a(this));
        }
        Object obj = (jgr) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            obj.a().setState(1);
        }
    }
}
