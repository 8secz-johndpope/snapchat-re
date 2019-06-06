package com.snap.serengeti.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.common.base.Predicate;
import com.snap.ui.deck.MainPageFragment;
import defpackage.achb;
import defpackage.achq;
import defpackage.aipx;
import defpackage.ajei;
import defpackage.akcr;
import defpackage.alpu;
import defpackage.wks;
import defpackage.wkw;
import defpackage.wkz;
import defpackage.wkz.e;
import defpackage.wlc;
import defpackage.wlx;
import defpackage.wly;
import defpackage.wme;
import defpackage.wmf;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;

public final class SerengetiFragment extends MainPageFragment {
    public static final zjm f = new zjm(wkw.a, "SerengetiFragment", false, false, true, false, null, false, false, false, false, null, 4076);
    public zgb a;
    public achb<zjm, zjk> b;
    public wmf c;
    public wkz d;
    wks e;
    private final ajei g = new ajei();
    private final Predicate<Void> h = new b(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b<T> implements Predicate<Void> {
        private /* synthetic */ SerengetiFragment a;

        b(SerengetiFragment serengetiFragment) {
            this.a = serengetiFragment;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            WebView f;
            wks wks = this.a.e;
            if (wks != null) {
                f = wks.f();
                if (f != null && f.canGoBack()) {
                    return false;
                }
            }
            wks = this.a.e;
            if (wks != null) {
                f = wks.f();
                return (f == null || f.canScrollVertically(-1)) ? false : true;
            }
        }
    }

    static {
        a aVar = new a();
    }

    public final boolean o_() {
        wks wks = this.e;
        return wks != null ? wks.b() : false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        wks wks = this.e;
        if (wks != null) {
            wks.a(i, i2, intent);
        }
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Context context = getContext();
        Activity activity = getActivity();
        achb achb = this.b;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        wlx wlx = new wlx(context, activity, achb, f, this.g);
        wmf wmf = this.c;
        if (wmf == null) {
            akcr.a("serengetiFactory");
        }
        wme a = wmf.a(getContext(), viewGroup, wlx);
        View view = a.a;
        wks wks = a.b;
        this.e = wks;
        achq achq = new achq(f, null, this.h, "SerengetiFragment onCreateView");
        achb achb2 = this.b;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a(achq);
        if (bundle != null) {
            return view;
        }
        bundle = getArguments();
        if (bundle != null) {
            str = "EXTRA_SERENGETI_LINK";
            if (bundle.containsKey(str)) {
                try {
                    Object a2 = alpu.a(bundle.getByteArray(str));
                    wks.a(wlc.a(getContext()).a(a2.c).a());
                    String string = bundle.getString("REGISTRY_NAME");
                    wkz wkz = this.d;
                    if (wkz == null) {
                        akcr.a("serengetiRegistry");
                    }
                    context = getContext();
                    Object applicationContext = getContext().getApplicationContext();
                    akcr.a(applicationContext, "context.applicationContext");
                    zgb zgb = this.a;
                    if (zgb == null) {
                        akcr.a("schedulersProvider");
                    }
                    akcr.a(a2, "link");
                    wkz.a(context, (e) new wly(applicationContext, zgb, wks, a2), string);
                } catch (Exception unused) {
                }
            }
        }
        return view;
    }

    public final void onDestroyView() {
        wks wks = this.e;
        if (wks != null) {
            wks.e();
        }
        this.e = null;
        achb achb = this.b;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.a(this.h);
        this.g.dispose();
        super.onDestroyView();
    }

    public final void onPause() {
        super.onPause();
        wks wks = this.e;
        if (wks != null) {
            wks.d();
        }
    }

    public final void onResume() {
        super.onResume();
        wks wks = this.e;
        if (wks != null) {
            wks.c();
        }
    }
}
