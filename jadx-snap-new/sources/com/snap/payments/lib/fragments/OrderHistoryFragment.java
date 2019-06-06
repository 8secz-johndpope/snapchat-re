package com.snap.payments.lib.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.tkg;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zkq;

public final class OrderHistoryFragment extends MainPageFragment {
    public tkg a;
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
        tkg tkg = this.a;
        if (tkg == null) {
            akcr.a("page");
        }
        tkg.a();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        tkg tkg = this.a;
        if (tkg == null) {
            akcr.a("page");
        }
        tkg.b();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tkg tkg = this.a;
        if (tkg == null) {
            akcr.a("page");
        }
        Context context = getContext();
        bundle = getArguments();
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        zkf zkf = new zkf();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            akcr.a();
        }
        tkg.a(context, bundle2, false, null, zkf, activity, this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        if (viewGroup == null) {
            return null;
        }
        tkg tkg = this.a;
        if (tkg == null) {
            akcr.a("page");
        }
        Object a = tkg.a(layoutInflater, viewGroup);
        akcr.a(a, "page.onCreateView(inflater, container)");
        ajei ajei = this.c;
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ajei.a(zkq.a().b(ajef.a()).f((ajfb) new a(a)));
        return a;
    }

    public final void onDestroy() {
        super.onDestroy();
        tkg tkg = this.a;
        if (tkg == null) {
            akcr.a("page");
        }
        tkg.c();
        this.c.a();
    }
}
