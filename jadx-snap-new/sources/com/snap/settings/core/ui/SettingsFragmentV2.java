package com.snap.settings.core.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.wnw;
import defpackage.zjq;
import defpackage.zkq;

public final class SettingsFragmentV2 extends MainPageFragment implements wnw, zjq {
    public SettingsPresenterV2 a;
    public zkq b;
    private final ajxe c = ajxh.a(b.a);
    private View d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        c(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            this.a.setPadding(0, rect.top, 0, rect.bottom);
        }
    }

    static final class b extends akcs implements akbk<ajei> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SettingsFragmentV2.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;");
        a aVar = new a();
    }

    private final ajei b() {
        return (ajei) this.c.b();
    }

    public final long S_() {
        return 120000;
    }

    public final View a(int i) {
        View view = this.d;
        if (view == null) {
            akcr.a("_view");
        }
        Object findViewById = view.findViewById(i);
        akcr.a(findViewById, "_view.findViewById(viewId)");
        return findViewById;
    }

    public final void a() {
        w();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        SettingsPresenterV2 settingsPresenterV2 = this.a;
        if (settingsPresenterV2 == null) {
            akcr.a("presenter");
        }
        settingsPresenterV2.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.settings_layout_new, viewGroup, false);
        akcr.a(inflate, "it");
        this.d = inflate;
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ajej f = zkq.a().f((ajfb) new c(inflate));
        akcr.a((Object) f, "insetsDetector.windowRec…ect.bottom)\n            }");
        ajvv.a(f, b());
        return inflate;
    }

    public final void onDestroyView() {
        b().a();
        super.onDestroyView();
    }

    public final void onDetach() {
        SettingsPresenterV2 settingsPresenterV2 = this.a;
        if (settingsPresenterV2 == null) {
            akcr.a("presenter");
        }
        settingsPresenterV2.dropTarget();
        super.onDetach();
    }
}
