package com.snap.impala.core.shows;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.snap.composer.api.ui.ComposerNavigationUtil;
import com.snap.composer.views.ComposerView;
import com.snap.ui.deck.MainPageFragment;
import defpackage.aats;
import defpackage.aaua;
import defpackage.achb;
import defpackage.achg;
import defpackage.achq;
import defpackage.aipx;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbw;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.alfb;
import defpackage.keq;
import defpackage.ker;
import defpackage.kji;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import java.io.Serializable;

public final class ShowProfileFragment extends MainPageFragment implements zjq {
    public static final zjm c = new zjm(kji.a, "ShowProfileFragment", false, false, true, false, null, false, false, false, false, null, 4076);
    public achb<zjm, zjk> a;
    public ker b;
    private keq d;
    private final ComposerNavigationUtil e = new ComposerNavigationUtil(null, 1, null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ ShowProfileFragment a;

        b(ShowProfileFragment showProfileFragment) {
            this.a = showProfileFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            achb achb = this.a.a;
            if (achb == null) {
                akcr.a("navigationHost");
            }
            achb.a((achg) ShowProfileFragment.c, true, true, null);
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ ShowProfileFragment a;

        d(ShowProfileFragment showProfileFragment) {
            this.a = showProfileFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.o_();
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbw<ComposerView, MotionEvent, ajxw> {
        c(ComposerNavigationUtil composerNavigationUtil) {
            super(2, composerNavigationUtil);
        }

        public final String getName() {
            return "rootViewTouchListener";
        }

        public final akej getOwner() {
            return akde.a(ComposerNavigationUtil.class);
        }

        public final String getSignature() {
            return "rootViewTouchListener(Lcom/snap/composer/views/ComposerView;Landroid/view/MotionEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ComposerView composerView = (ComposerView) obj;
            MotionEvent motionEvent = (MotionEvent) obj2;
            akcr.b(composerView, "p1");
            akcr.b(motionEvent, "p2");
            ((ComposerNavigationUtil) this.receiver).rootViewTouchListener(composerView, motionEvent);
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public final long S_() {
        return 30000;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = "controllerFactory";
        String str2 = "showProfileController";
        akcr.b(layoutInflater, "inflater");
        try {
            Bundle arguments = getArguments();
            byte[] byteArray = arguments != null ? arguments.getByteArray("SHOW_PROFILE_INFO") : null;
            if (byteArray != null) {
                Bundle arguments2 = getArguments();
                Serializable serializable = arguments2 != null ? arguments2.getSerializable("PAGE_TYPE") : null;
                if (!(serializable instanceof aaua)) {
                    serializable = null;
                }
                aaua aaua = (aaua) serializable;
                Bundle arguments3 = getArguments();
                Serializable serializable2 = arguments3 != null ? arguments3.getSerializable("ENTRY_TYPE") : null;
                if (!(serializable2 instanceof aats)) {
                    serializable2 = null;
                }
                aats aats = (aats) serializable2;
                alfb a = alfb.a(byteArray);
                ker ker = this.b;
                if (ker == null) {
                    akcr.a(str);
                }
                akcr.a((Object) a, "info");
                this.d = ker.a(a, aaua, aats, false, (akbk) new b(this));
                keq keq = this.d;
                if (keq == null) {
                    akcr.a(str2);
                }
                keq.a.setRootViewTouchListener(new c(this.e));
                achq achq = new achq(c, null, this.e.getNavigationEnabledPredicate(), "ShowProfileFragment onCreateView");
                achb achb = this.a;
                if (achb == null) {
                    akcr.a("navigationHost");
                }
                achb.a(achq);
                keq = this.d;
                if (keq == null) {
                    akcr.a(str2);
                }
                return keq.a;
            }
            throw new IllegalArgumentException("No bytes provided for show info");
        } catch (Exception unused) {
            ker ker2 = this.b;
            if (ker2 == null) {
                akcr.a(str);
            }
            this.d = ker2.a(new alfb(), null, null, false, (akbk) new d(this));
            keq keq2 = this.d;
            if (keq2 == null) {
                akcr.a(str2);
            }
            return keq2.a;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        keq keq = this.d;
        if (keq == null) {
            akcr.a("showProfileController");
        }
        keq.b.dispose();
        keq.a.destroy();
        achb achb = this.a;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.a(this.e.getNavigationEnabledPredicate());
    }
}
