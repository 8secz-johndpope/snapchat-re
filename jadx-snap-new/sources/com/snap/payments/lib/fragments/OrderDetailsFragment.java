package com.snap.payments.lib.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
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
import defpackage.tfv;
import defpackage.tkf;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zkq;

public final class OrderDetailsFragment extends PaymentsBaseFragment {
    public ajwy<tkf> a;
    public zkq b;
    public aipn<zgb> c;
    private final ajei e = new ajei();
    private tkf f;
    private zfw g;

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
        tkf tkf = this.f;
        if (tkf == null) {
            akcr.a("page");
        }
        tkf.a();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        tkf tkf = this.f;
        if (tkf == null) {
            akcr.a("page");
        }
        tkf.b();
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
            this.f = (tkf) obj;
            tkf tkf = this.f;
            if (tkf == null) {
                akcr.a("page");
            }
            Context context = getContext();
            bundle = getArguments();
            if (bundle == null) {
                bundle = new Bundle();
            }
            tkf.a(context, bundle, b(), null, new zkf(), activity, this);
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
        this.g = zgb.a(tfv.A.callsite("OrderDetailsFragment"));
        tkf tkf = this.f;
        if (tkf == null) {
            akcr.a("page");
        }
        Object a = tkf.a(layoutInflater, viewGroup);
        akcr.a(a, "page.onCreateView(inflater, container)");
        View findViewById = a.findViewById(R.id.dummy_nav_bar);
        if (findViewById != null) {
            ViewStub viewStub = (ViewStub) findViewById;
            viewStub.setLayoutResource(R.layout.dummy_navigation_bar);
            viewStub.inflate();
            ajei ajei = this.e;
            zkq zkq = this.b;
            if (zkq == null) {
                akcr.a("insetsDetector");
            }
            ajdp a2 = zkq.a();
            zfw zfw = this.g;
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
        tkf tkf = this.f;
        if (tkf == null) {
            akcr.a("page");
        }
        tkf.c();
        this.e.a();
    }
}
