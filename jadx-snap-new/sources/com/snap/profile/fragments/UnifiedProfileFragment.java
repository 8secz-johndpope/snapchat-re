package com.snap.profile.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.snap.profile.ui.UnifiedProfilePresenter;
import com.snap.ui.deck.AsyncPresenterFragment;
import com.snapchat.android.R;
import defpackage.aajt;
import defpackage.abhd;
import defpackage.abhe;
import defpackage.achi;
import defpackage.ajdx;
import defpackage.ajwy;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.ide;
import defpackage.ihh;
import defpackage.upp;
import defpackage.upt;
import defpackage.usg;
import defpackage.usq;
import defpackage.uxf;
import defpackage.zjk;
import defpackage.zjm;
import java.io.Serializable;
import java.util.concurrent.Callable;

public final class UnifiedProfileFragment extends AsyncPresenterFragment<UnifiedProfilePresenter> implements upt {
    public ajwy<UnifiedProfilePresenter> a;
    public ajwy<ihh> b;
    private final ide c = upp.h;
    private View d;
    private usq e;
    private long f;
    private abhe g;
    private long h;

    static final class a<V> implements Callable<T> {
        private /* synthetic */ UnifiedProfileFragment a;

        a(UnifiedProfileFragment unifiedProfileFragment) {
            this.a = unifiedProfileFragment;
        }

        private UnifiedProfilePresenter a() {
            ajwy ajwy = this.a.a;
            if (ajwy == null) {
                akcr.a("presenterProvider");
            }
            return (UnifiedProfilePresenter) ajwy.get();
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    public final int R_() {
        return R.layout.unified_profile_fragment;
    }

    public final View a() {
        View view = this.d;
        if (view == null) {
            akcr.a("pageView");
        }
        return view;
    }

    public final void a(View view) {
        akcr.b(view, "view");
        super.a(view);
        akcr.b(view, "<set-?>");
        this.d = view;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        UnifiedProfilePresenter unifiedProfilePresenter = (UnifiedProfilePresenter) this.t;
        if (unifiedProfilePresenter != null) {
            long j = this.h;
            unifiedProfilePresenter.o.set(true);
            long c = unifiedProfilePresenter.c().c();
            if (j != 0 && unifiedProfilePresenter.m != 0 && unifiedProfilePresenter.l != null) {
                uxf b = unifiedProfilePresenter.b();
                usq usq = unifiedProfilePresenter.b;
                if (usq == null) {
                    akcr.a("pageSessionModel");
                }
                usg usg = usq.a;
                String str = unifiedProfilePresenter.l;
                if (str == null) {
                    akcr.a();
                }
                abhe abhe = unifiedProfilePresenter.n;
                long j2 = unifiedProfilePresenter.m;
                akcr.b(usg, "unifiedProfilePageType");
                akcr.b(str, "profileSessionId");
                akcr.b(abhe, "profileSource");
                abhd abhd = new abhd();
                abhd.a(Long.valueOf(c - j2));
                abhd.b(Long.valueOf(j - j2));
                abhd.a(abhe);
                abhd.a(defpackage.upn.a.a(usg));
                abhd.d(str);
                b.a().a((aajt) abhd);
                unifiedProfilePresenter.e();
            }
        }
    }

    public final ajdx<UnifiedProfilePresenter> b() {
        Object c = ajdx.c((Callable) new a(this));
        akcr.a(c, "Single.fromCallable {\n  …der.get()\n        }\n    }");
        return c;
    }

    public final ide c() {
        return this.c;
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.c(achi);
        if (this.e != null && achi.l) {
            Object obj = (zjm) achi.f.e();
            usq usq = this.e;
            if (usq == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (akcr.a(obj, usq.a.deckPageType)) {
                ajwy ajwy = this.b;
                if (ajwy == null) {
                    akcr.a("clock");
                }
                this.h = ((ihh) ajwy.get()).c();
            }
        }
    }

    public final usq d() {
        return this.e;
    }

    public final long e() {
        return this.f;
    }

    public final abhe f() {
        abhe abhe = this.g;
        if (abhe == null) {
            akcr.a("profileAnimationSource");
        }
        return abhe;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("PROFILE_PAGE_SESSION_KEY");
            if (serializable != null) {
                this.e = (usq) serializable;
                serializable = arguments.getSerializable("START_TIME");
                if (serializable != null) {
                    this.f = ((Long) serializable).longValue();
                    Serializable serializable2 = arguments.getSerializable("ANIMATION_SOURCE");
                    if (serializable2 != null) {
                        abhe abhe = (abhe) serializable2;
                        akcr.b(abhe, "<set-?>");
                        this.g = abhe;
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type com.snapchat.analytics.types.UnifiedProfileOpenAnimationSource");
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Long");
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.profile.api.viewmodel.UnifiedProfilePageSessionModel");
        }
    }

    public final void onDetach() {
        UnifiedProfilePresenter unifiedProfilePresenter = (UnifiedProfilePresenter) this.t;
        if (unifiedProfilePresenter != null) {
            unifiedProfilePresenter.dropTarget();
        }
        super.onDetach();
    }
}
