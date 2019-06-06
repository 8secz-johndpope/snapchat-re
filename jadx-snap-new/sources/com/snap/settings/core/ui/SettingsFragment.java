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
import defpackage.akcr;
import defpackage.wnw;
import defpackage.zjq;
import defpackage.zkq;

public final class SettingsFragment extends MainPageFragment implements wnw, zjq {
    public SettingsPresenter a;
    public zkq b;
    private ajei c;
    private View d;

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
        SettingsPresenter settingsPresenter = this.a;
        if (settingsPresenter == null) {
            akcr.a("presenter");
        }
        settingsPresenter.takeTarget((wnw) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        this.c = new ajei();
        Object inflate = layoutInflater.inflate(R.layout.settings_layout, viewGroup, false);
        akcr.a(inflate, "it");
        this.d = inflate;
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ajej f = zkq.a().f((ajfb) new b(inflate));
        akcr.a((Object) f, "insetsDetector.windowRec…ect.bottom)\n            }");
        ajei ajei = this.c;
        if (ajei == null) {
            akcr.a("disposable");
        }
        ajvv.a(f, ajei);
        return inflate;
    }

    public final void onDestroyView() {
        ajei ajei = this.c;
        if (ajei == null) {
            akcr.a("disposable");
        }
        ajei.a();
        super.onDestroyView();
    }

    public final void onDetach() {
        SettingsPresenter settingsPresenter = this.a;
        if (settingsPresenter == null) {
            akcr.a("presenter");
        }
        settingsPresenter.dropTarget();
        super.onDetach();
    }
}
