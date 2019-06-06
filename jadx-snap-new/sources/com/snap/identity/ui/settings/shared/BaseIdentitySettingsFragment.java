package com.snap.identity.ui.settings.shared;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajex;
import defpackage.ajfb;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.itt;
import defpackage.jrl;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zkq;

public class BaseIdentitySettingsFragment extends MainPageFragment {
    private zfw a;
    public ajwy<zkq> g;
    public ajwy<zhh> h;
    public ajwy<zgb> i;

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
            akcr.b(rect, "padding");
            this.a.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    static final class c<T1, T2, R> implements ajex<Rect, Integer, Rect> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Rect rect = (Rect) obj;
            int intValue = ((Number) obj2).intValue();
            akcr.b(rect, "rect");
            return new Rect(0, rect.top, 0, rect.bottom + intValue);
        }
    }

    static {
        a aVar = new a();
    }

    public final ajwy<zgb> o() {
        ajwy ajwy = this.i;
        if (ajwy == null) {
            akcr.a("schedulersProvider");
        }
        return ajwy;
    }

    public boolean o_() {
        jrl.a(getContext());
        return super.o_();
    }

    public void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        ajwy ajwy = this.i;
        if (ajwy == null) {
            akcr.a("schedulersProvider");
        }
        ajwy.get();
        this.a = zgb.a(itt.a.callsite("BaseIdentitySettingsFragment"));
        ajwy = this.g;
        if (ajwy == null) {
            akcr.a("insetsDetector");
        }
        Object obj = ajwy.get();
        akcr.a(obj, "insetsDetector.get()");
        ajdt a = ((zkq) obj).a();
        ajwy ajwy2 = this.h;
        if (ajwy2 == null) {
            akcr.a("softKeyboardDetector");
        }
        Object obj2 = ajwy2.get();
        akcr.a(obj2, "softKeyboardDetector.get()");
        obj = ajdp.a(a, (ajdt) ((zhh) obj2).a(), (ajex) c.a);
        akcr.a(obj, "Observable.combineLatest…t)\n                    })");
        zfw zfw = this.a;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, obj.a((ajdw) zfw.l()).f((ajfb) new b(view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }
}
