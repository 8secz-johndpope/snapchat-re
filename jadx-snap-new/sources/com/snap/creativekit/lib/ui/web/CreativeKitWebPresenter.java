package com.snap.creativekit.lib.ui.web;

import com.brightcove.player.event.EventType;
import com.snap.loginkit.lib.net.SnapKitHttpInterface;
import com.snap.ui.view.LoadingSpinnerView;
import defpackage.achb;
import defpackage.acig;
import defpackage.acik;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.akws;
import defpackage.dnh;
import defpackage.gtt;
import defpackage.gtu;
import defpackage.gue;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.wjd;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;

public final class CreativeKitWebPresenter extends zll<gue> implements k {
    final achb<zjm, zjk> a;
    private final zfw b = zgb.a(gtu.c, "CreativeKitWebPresenter");
    private final aipn<SnapKitHttpInterface> c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<T> implements ajfb<akws<Object>> {
        private /* synthetic */ CreativeKitWebPresenter a;

        b(CreativeKitWebPresenter creativeKitWebPresenter) {
            this.a = creativeKitWebPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (akws) obj;
            akcr.a(obj, EventType.RESPONSE);
            if (obj.e()) {
                gue gue = (gue) this.a.getTarget();
                if (akcr.a(gue != null ? gue.d() : null, Boolean.TRUE)) {
                    CreativeKitWebPresenter creativeKitWebPresenter = this.a;
                    gue gue2 = (gue) creativeKitWebPresenter.getTarget();
                    creativeKitWebPresenter.a.b((acig) new acik(dnh.a, true, new defpackage.dnk.a(new gtt(null, null, gue2 != null ? gue2.b() : null, 15), false, 6)));
                }
                return;
            }
            CreativeKitWebPresenter.a(this.a);
        }
    }

    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ CreativeKitWebPresenter a;

        c(CreativeKitWebPresenter creativeKitWebPresenter) {
            this.a = creativeKitWebPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            CreativeKitWebPresenter.a(this.a);
        }
    }

    static {
        a aVar = new a();
    }

    public CreativeKitWebPresenter(zgb zgb, achb<zjm, zjk> achb, aipn<SnapKitHttpInterface> aipn) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn, "snapkitHttpInterface");
        this.a = achb;
        this.c = aipn;
    }

    /* renamed from: a */
    public final void takeTarget(gue gue) {
        akcr.b(gue, "target");
        super.takeTarget(gue);
        gue.getLifecycle().a(this);
    }

    public final void dropTarget() {
        gue gue = (gue) getTarget();
        if (gue != null) {
            j lifecycle = gue.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreativeKitWebFragmentCreate() {
        gue gue = (gue) getTarget();
        if (gue != null) {
            LoadingSpinnerView a = gue.a();
            if (a != null) {
                a.setVisibility(0);
            }
        }
        SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) this.c.get();
        gue gue2 = (gue) getTarget();
        String b = gue2 != null ? gue2.b() : null;
        Object a2 = wjd.SNAP_KIT.a();
        akcr.a(a2, "SnapTokenAccessTokenScop…P_KIT.serverSideScopeName");
        zln.bindTo$default(this, snapKitHttpInterface.getCreativeKitWebMetadata(b, a2).b((ajdw) this.b.g()).a((ajdw) this.b.l()).a((ajfb) new b(this), (ajfb) new c(this)), this, null, null, 6, null);
    }
}
