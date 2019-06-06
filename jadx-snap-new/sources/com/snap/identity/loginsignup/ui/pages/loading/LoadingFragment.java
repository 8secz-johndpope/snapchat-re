package com.snap.identity.loginsignup.ui.pages.loading;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.identity.loginsignup.ui.shared.LoginSignupFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.akcr;
import defpackage.jal;
import defpackage.jfv;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import java.util.ArrayList;
import java.util.Collection;

public final class LoadingFragment extends LoginSignupFragment {
    public jfv a;

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        jfv jfv = this.a;
        if (jfv == null) {
            akcr.a("presenter");
        }
        ((zke) jfv.b.get()).a(new jal());
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        jfv jfv = this.a;
        if (jfv == null) {
            akcr.a("presenter");
        }
        Iterable<Number> iterable = jfv.c;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (Number intValue : iterable) {
            jfv.a.getWindow().clearFlags(intValue.intValue());
            arrayList.add(ajxw.a);
        }
        super.b(achi);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        jfv jfv = this.a;
        if (jfv == null) {
            akcr.a("presenter");
        }
        Iterable<Number> iterable = jfv.c;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (Number intValue : iterable) {
            jfv.a.getWindow().addFlags(intValue.intValue());
            arrayList.add(ajxw.a);
        }
        return layoutInflater.inflate(R.layout.fragment_loading, viewGroup, false);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }
}
