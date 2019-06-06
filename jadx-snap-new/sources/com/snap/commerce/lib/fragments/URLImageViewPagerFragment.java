package com.snap.commerce.lib.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.ViewPager.e;
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
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.fiq;
import defpackage.fls;
import defpackage.foh;
import defpackage.fqw;
import defpackage.thv;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zkq;
import java.util.ArrayList;
import java.util.Iterator;

public final class URLImageViewPagerFragment extends MainPageFragment {
    public ajwy<foh> a;
    public zkq b;
    public aipn<zgb> c;
    public zke d;
    private final ajei e = new ajei();
    private final ArrayList<e> f = new ArrayList();
    private final zkf g = new zkf();
    private final zke h = this.g.a();
    private foh i;
    private zfw j;
    private ArrayList<thv> k = new ArrayList();
    private int l;

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
        if (this.i == null) {
            akcr.a("page");
        }
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        if (this.i == null) {
            akcr.a("page");
        }
    }

    public final boolean o_() {
        if (this.i == null) {
            akcr.a("page");
        }
        return false;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ajwy ajwy = this.a;
        if (ajwy == null) {
            akcr.a("pageProvider");
        }
        Object obj = ajwy.get();
        akcr.a(obj, "pageProvider.get()");
        this.i = (foh) obj;
        foh foh = this.i;
        String str = "page";
        if (foh == null) {
            akcr.a(str);
        }
        Context context = getContext();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        foh.a(context, arguments, false, null, this.g, requireActivity(), this);
        fls fls = new fls(this.g);
        Object a = fls.a();
        akcr.a(a, "urlImageViewPagerControl…cyclicImageViewController");
        e eVar = (e) a;
        akcr.b(eVar, "observer");
        this.f.add(eVar);
        akcr.b(fls, "controller");
        ajej a2 = this.g.a(fls);
        akcr.a((Object) a2, "rxBus.subscribe(controller)");
        ajvv.a(a2, this.e);
        foh = this.i;
        if (foh == null) {
            akcr.a(str);
        }
        foh.c();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            eVar = (e) it.next();
            foh foh2 = this.i;
            if (foh2 == null) {
                akcr.a(str);
            }
            foh2.a(eVar);
        }
        foh = this.i;
        if (foh == null) {
            akcr.a(str);
        }
        zke zke = this.d;
        if (zke == null) {
            akcr.a("productDetailPageDispatcher");
        }
        foh.a(zke);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            ArrayList parcelableArrayList = arguments2.getParcelableArrayList("product_images");
            if (parcelableArrayList != null) {
                this.k = parcelableArrayList;
            }
        }
        arguments2 = getArguments();
        if (arguments2 != null) {
            this.l = arguments2.getInt("product_images_start_index");
        }
        zkf zkf = this.g;
        foh foh3 = this.i;
        if (foh3 == null) {
            akcr.a(str);
        }
        zkf.a(foh3);
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
        this.j = zgb.a(fiq.o.callsite("URLImageViewPagerFragment"));
        foh foh = this.i;
        if (foh == null) {
            akcr.a("page");
        }
        Object a = foh.a(layoutInflater, viewGroup);
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
            zfw zfw = this.j;
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
        if (this.i == null) {
            akcr.a("page");
        }
        this.e.a();
    }

    public final void onPause() {
        super.onPause();
        foh foh = this.i;
        if (foh == null) {
            akcr.a("page");
        }
        foh.b();
    }

    public final void onStart() {
        super.onStart();
        if (this.i == null) {
            akcr.a("page");
        }
        this.h.a(new fqw(this.k, this.l));
    }
}
