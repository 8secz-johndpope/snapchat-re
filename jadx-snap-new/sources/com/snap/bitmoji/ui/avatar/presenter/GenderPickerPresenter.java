package com.snap.bitmoji.ui.avatar.presenter;

import android.view.View;
import defpackage.achb;
import defpackage.acig;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxw;
import defpackage.ajzm;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.dge;
import defpackage.dgh;
import defpackage.dgi;
import defpackage.dgj;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;

public final class GenderPickerPresenter extends zll<dgj> implements k {
    final achb<zjm, zjk> a;

    static final class a extends akcq implements akbl<View, ajxw> {
        a(GenderPickerPresenter genderPickerPresenter) {
            super(1, genderPickerPresenter);
        }

        public final String getName() {
            return "onFemaleButtonSelected";
        }

        public final akej getOwner() {
            return akde.a(GenderPickerPresenter.class);
        }

        public final String getSignature() {
            return "onFemaleButtonSelected(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            akcr.b(view, "p1");
            GenderPickerPresenter genderPickerPresenter = (GenderPickerPresenter) this.receiver;
            akcr.b(view, "view");
            if (((dgj) genderPickerPresenter.getTarget()) != null) {
                genderPickerPresenter.a(dgh.FEMALE);
            }
            return ajxw.a;
        }
    }

    static final class b extends akcq implements akbl<View, ajxw> {
        b(GenderPickerPresenter genderPickerPresenter) {
            super(1, genderPickerPresenter);
        }

        public final String getName() {
            return "onMaleButtonSelected";
        }

        public final akej getOwner() {
            return akde.a(GenderPickerPresenter.class);
        }

        public final String getSignature() {
            return "onMaleButtonSelected(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            akcr.b(view, "p1");
            GenderPickerPresenter genderPickerPresenter = (GenderPickerPresenter) this.receiver;
            akcr.b(view, "view");
            if (((dgj) genderPickerPresenter.getTarget()) != null) {
                genderPickerPresenter.a(dgh.MALE);
            }
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbl<View, ajxw> {
        c(GenderPickerPresenter genderPickerPresenter) {
            super(1, genderPickerPresenter);
        }

        public final String getName() {
            return "onExitButtonSelected";
        }

        public final akej getOwner() {
            return akde.a(GenderPickerPresenter.class);
        }

        public final String getSignature() {
            return "onExitButtonSelected(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            akcr.b(view, "p1");
            GenderPickerPresenter genderPickerPresenter = (GenderPickerPresenter) this.receiver;
            akcr.b(view, "view");
            dgj dgj = (dgj) genderPickerPresenter.getTarget();
            if (dgj != null) {
                genderPickerPresenter.a.a(dgj.e().a);
            }
            return ajxw.a;
        }
    }

    public GenderPickerPresenter(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        this.a = achb;
    }

    public final void a(dgh dgh) {
        String str = "gender";
        akcr.b(dgh, str);
        dgj dgj = (dgj) getTarget();
        if (dgj != null) {
            ajxm[] ajxmArr = new ajxm[2];
            ajxmArr[0] = ajxs.a(str, Long.valueOf(dgh.longValue));
            ajxmArr[1] = ajxs.a("style", Long.valueOf(5));
            dge dge = new dge(ajzm.a(ajxmArr));
            acig acig = dgj.e().b;
            acig[] acigArr = new acig[]{acig};
            this.a.a((acig) defpackage.acie.a.a(acigArr, dge));
        }
    }

    /* renamed from: a */
    public final void takeTarget(dgj dgj) {
        akcr.b(dgj, "target");
        super.takeTarget(dgj);
        dgj.getLifecycle().a(this);
    }

    public final void dropTarget() {
        super.dropTarget();
        dgj dgj = (dgj) getTarget();
        if (dgj != null) {
            j lifecycle = dgj.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        dgj dgj = (dgj) getTarget();
        if (dgj != null) {
            dgj.a().setOnClickListener(null);
            dgj.b().setOnClickListener(null);
            dgj.d().setOnClickListener(null);
        }
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        dgj dgj = (dgj) getTarget();
        if (dgj != null) {
            GenderPickerPresenter genderPickerPresenter = this;
            dgj.a().setOnClickListener(new dgi(new a(genderPickerPresenter)));
            dgj.b().setOnClickListener(new dgi(new b(genderPickerPresenter)));
            dgj.d().setOnClickListener(new dgi(new c(genderPickerPresenter)));
        }
    }
}
