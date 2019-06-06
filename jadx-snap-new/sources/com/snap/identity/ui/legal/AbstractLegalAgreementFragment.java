package com.snap.identity.ui.legal;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import com.snap.ui.deck.MainPageFragment;
import defpackage.achb;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.fwx;
import defpackage.itj;
import defpackage.zjj;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;

public abstract class AbstractLegalAgreementFragment extends MainPageFragment implements zjj, zjq {
    public itj a;
    public fwx b;
    public achb<zjm, zjk> c;

    public final long S_() {
        return -1;
    }

    public final itj a() {
        itj itj = this.a;
        if (itj == null) {
            akcr.a("legalAgreement");
        }
        return itj;
    }

    public final boolean d() {
        return false;
    }

    public void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(3);
            }
        }
    }
}
