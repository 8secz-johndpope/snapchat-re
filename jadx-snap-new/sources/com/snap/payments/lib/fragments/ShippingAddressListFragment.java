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
import defpackage.aipx;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.tkj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zkq;

public final class ShippingAddressListFragment extends PaymentsBaseFragment {
    public tkj a;
    public zkq b;
    private final ajei c = new ajei();

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            this.a.setPadding(0, rect.top, 0, rect.bottom);
        }
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        tkj tkj = this.a;
        if (tkj == null) {
            akcr.a("page");
        }
        tkj.a();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        tkj tkj = this.a;
        if (tkj == null) {
            akcr.a("page");
        }
        tkj.b();
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
            tkj tkj = this.a;
            if (tkj == null) {
                akcr.a("page");
            }
            Context context = getContext();
            bundle = getArguments();
            if (bundle == null) {
                bundle = new Bundle();
            }
            tkj.a(context, bundle, b(), this.d, new zkf(), activity, this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        if (viewGroup == null) {
            return null;
        }
        tkj tkj = this.a;
        if (tkj == null) {
            akcr.a("page");
        }
        Object a = tkj.a(layoutInflater, viewGroup);
        akcr.a(a, "page.onCreateView(inflater, container)");
        View findViewById = a.findViewById(R.id.dummy_nav_bar);
        if (findViewById != null) {
            ViewStub viewStub = (ViewStub) findViewById;
            viewStub.setLayoutResource(R.layout.dummy_navigation_bar);
            viewStub.inflate();
            ajei ajei = this.c;
            zkq zkq = this.b;
            if (zkq == null) {
                akcr.a("insetsDetector");
            }
            ajei.a(zkq.a().b(ajef.a()).f((ajfb) new a(a)));
            return a;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewStub");
    }

    public final void onDestroy() {
        super.onDestroy();
        tkj tkj = this.a;
        if (tkj == null) {
            akcr.a("page");
        }
        tkj.c();
        this.c.a();
    }
}
