package com.snap.lenses.app.explorer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajpy;
import defpackage.ajvv;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajxw;
import defpackage.akcr;
import defpackage.mit;
import defpackage.mpz;
import defpackage.mpz.a;
import defpackage.mqs;
import defpackage.mqt;
import defpackage.mqt.a.b;
import defpackage.mqt.a.c;
import defpackage.mqt.a.d;
import defpackage.mqt.a.e;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;

public final class LensExplorerFragment extends MainPageFragment {
    public a a;
    public final ajdp<mqt.a> b;
    private final ajws<ajxw> c;
    private final ajws<mqt.a> d;
    private final ajei e = new ajei();

    public LensExplorerFragment() {
        Object r = new ajwl().r();
        akcr.a(r, "BehaviorSubject.create<Unit>().toSerialized()");
        this.c = r;
        r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Le…r.Event>().toSerialized()");
        this.d = r;
        r = ajpy.k(this.d.f()).a();
        akcr.a(r, "outputEventSubject.hide().share()");
        this.b = r;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        this.d.a((Object) e.a);
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        this.d.a((Object) b.a);
    }

    public final void n_() {
        super.n_();
        this.c.a((Object) ajxw.a);
    }

    public final boolean o_() {
        boolean o_ = super.o_();
        if (!o_) {
            this.d.a((Object) c.a);
        }
        return o_;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        super.onAttach(context);
        aipx.a(this);
        this.d.a((Object) d.a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.lenses_explorer_fragment, viewGroup, false);
        a aVar = this.a;
        if (aVar == null) {
            akcr.a("lensExplorerComponent");
        }
        ajdp f = this.c.f();
        akcr.a((Object) f, "showWhenSubject.hide()");
        aVar = aVar.b(f);
        Object b = ajdp.b(inflate);
        akcr.a(b, "Observable.just(view)");
        f = mit.a(R.id.lenses_explorer_view_stub, b);
        akcr.b(f, "viewStub");
        a aVar2 = aVar;
        String str = "parentComponent";
        if (aVar2.j == null) {
            akcr.a(str);
        }
        mpz.d dVar = aVar2.j;
        if (dVar == null) {
            akcr.a(str);
        }
        zfw a = zgb.a(dVar.a().callsite("LensExplorerComponent"));
        mpz.d dVar2 = aVar2.j;
        if (dVar2 == null) {
            akcr.a(str);
        }
        f = f.a(mit.a((int) R.layout.lenses_explorer_view, mqs.class, true, dVar2.d(), true, true)).b((ajdw) a.l()).c((ajdw) a.l()).i().a();
        akcr.a((Object) f, "viewStub.compose(\n      …              .refCount()");
        aVar2.a(f);
        ajvv.a(this.e, ((mpz) aVar.a()).a());
        akcr.a(inflate, "view");
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.d.a((Object) mqt.a.a.a);
        this.e.a();
    }

    public final void onDetach() {
        super.onDetach();
        this.d.a();
    }
}
