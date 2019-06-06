package com.snap.commerce.lib.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import defpackage.aayb;
import defpackage.achi;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.akqq;
import defpackage.fiq;
import defpackage.fmo;
import defpackage.fmo.e;
import defpackage.fmo.f;
import defpackage.fmp;
import defpackage.fof;
import defpackage.vpc;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zkq;
import org.greenrobot.eventbus.ThreadMode;

public final class PlaceOrderFragment extends MainPageFragment {
    public ajwy<fof> a;
    public zkq b;
    public aipn<zgb> c;
    public vpc d;
    public fmo e;
    private final ajei f = new ajei();
    private final zkf g = new zkf();
    private fof h;
    private zfw i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            this.a.setPadding(0, rect.top, 0, rect.bottom);
        }
    }

    static {
        a aVar = new a();
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        fof fof = this.h;
        if (fof == null) {
            akcr.a("page");
        }
        fof.a();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        if (this.h == null) {
            akcr.a("page");
        }
    }

    public final boolean o_() {
        fof fof = this.h;
        if (fof == null) {
            akcr.a("page");
        }
        return fof.c();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object activity = getActivity();
        if (activity != null) {
            akcr.a(activity, "activity?: return");
            ajwy ajwy = this.a;
            if (ajwy == null) {
                akcr.a("pageProvider");
            }
            Object obj = ajwy.get();
            akcr.a(obj, "pageProvider.get()");
            this.h = (fof) obj;
            ajej a = this.g.a(this);
            akcr.a((Object) a, "pageBus.subscribe(this)");
            ajvv.a(a, this.f);
            fof fof = this.h;
            if (fof == null) {
                akcr.a("page");
            }
            Context context = getContext();
            bundle = getArguments();
            if (bundle == null) {
                bundle = new Bundle();
            }
            fof.a(context, bundle, false, null, this.g, activity, this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        if (viewGroup == null) {
            return null;
        }
        aipn aipn = this.c;
        if (aipn == null) {
            akcr.a("schedulersProvider");
        }
        aipn.get();
        this.i = zgb.a(fiq.o.callsite("PlaceOrderFragment"));
        fof fof = this.h;
        if (fof == null) {
            akcr.a("page");
        }
        Object a = fof.a(layoutInflater, viewGroup);
        akcr.a(a, "page.onCreateView(inflater, container)");
        ajei ajei = this.f;
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ajdp a2 = zkq.a();
        zfw zfw = this.i;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ajei.a(a2.b((ajdw) zfw.l()).f((ajfb) new b(a)));
        return a;
    }

    public final void onDestroy() {
        super.onDestroy();
        fof fof = this.h;
        if (fof == null) {
            akcr.a("page");
        }
        fof.b();
        this.f.a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onReceivedUnlockableDataEvent(defpackage.fof.a aVar) {
        akcr.b(aVar, "event");
        for (String str : aVar.a) {
            fmo fmo = this.e;
            if (fmo == null) {
                akcr.a("unlockLensHandler");
            }
            vpc vpc = this.d;
            if (vpc == null) {
                akcr.a("scanCardClient");
            }
            akcr.a((Object) str, "scanData");
            ajdp a = vpc.a(new defpackage.vpb.a(str, 1, aayb.UNLOCK_DEEPLINK, null, 24));
            akcr.b(a, "eventSource");
            ajej a2 = a.a((ajdw) fmo.a.l()).a((ajfb) new fmp(new e(fmo)), (ajfb) f.a);
            akcr.a((Object) a2, "eventSource\n            …hrowable, \"Got error \") }");
            ajvv.a(a2, fmo.b);
        }
    }
}
