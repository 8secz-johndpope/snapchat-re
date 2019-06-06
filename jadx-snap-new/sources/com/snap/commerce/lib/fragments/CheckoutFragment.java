package com.snap.commerce.lib.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajwy;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.fiq;
import defpackage.foe;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkf;
import defpackage.zkq;
import java.util.concurrent.TimeUnit;

public final class CheckoutFragment extends MainPageFragment implements zjq {
    public ajwy<foe> a;
    public zkq b;
    public aipn<zgb> c;
    private final ajei d = new ajei();
    private foe e;
    private zfw f;

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

    public final long S_() {
        return TimeUnit.MINUTES.toMillis(5);
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        foe foe = this.e;
        if (foe == null) {
            akcr.a("page");
        }
        foe.a();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        foe foe = this.e;
        if (foe == null) {
            akcr.a("page");
        }
        foe.b();
    }

    public final boolean o_() {
        foe foe = this.e;
        if (foe == null) {
            akcr.a("page");
        }
        return foe.e();
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
            this.e = (foe) obj;
            foe foe = this.e;
            if (foe == null) {
                akcr.a("page");
            }
            Context context = getContext();
            bundle = getArguments();
            if (bundle == null) {
                bundle = new Bundle();
            }
            foe.a(context, bundle, false, null, new zkf(), activity, this);
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
        this.f = zgb.a(fiq.o.callsite("CheckoutFragment"));
        foe foe = this.e;
        if (foe == null) {
            akcr.a("page");
        }
        Object a = foe.a(layoutInflater, viewGroup);
        akcr.a(a, "page.onCreateView(inflater, container)");
        View findViewById = a.findViewById(R.id.dummy_nav_bar);
        if (findViewById != null) {
            ViewStub viewStub = (ViewStub) findViewById;
            viewStub.setLayoutResource(R.layout.dummy_navigation_bar);
            viewStub.inflate();
            ajei ajei = this.d;
            zkq zkq = this.b;
            if (zkq == null) {
                akcr.a("insetsDetector");
            }
            ajdp a2 = zkq.a();
            zfw zfw = this.f;
            if (zfw == null) {
                akcr.a("schedulers");
            }
            ajei.a(a2.b((ajdw) zfw.l()).f((ajfb) new b(a)));
            return a;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewStub");
    }

    public final void onDestroy() {
        super.onDestroy();
        foe foe = this.e;
        if (foe == null) {
            akcr.a("page");
        }
        foe.c();
        this.d.a();
    }
}
