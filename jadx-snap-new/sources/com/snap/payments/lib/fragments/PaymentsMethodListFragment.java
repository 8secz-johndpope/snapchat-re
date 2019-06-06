package com.snap.payments.lib.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aagf;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.tjj;
import defpackage.tki;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zkq;

public class PaymentsMethodListFragment extends PaymentsBaseFragment {
    public tki a;
    public zkq b;
    private final ajei c = new ajei();

    public final void a_(achi<zjm, zjk> achi) {
        tjj tjj;
        aagf aagf;
        super.a_(achi);
        tki tki = this.a;
        tki.e();
        tki.b();
        if (tki.a()) {
            tjj = tki.a;
            aagf = aagf.PAYMENT_METHOD_LIST;
        } else {
            tjj = tki.a;
            aagf = aagf.PAYMENTS_SETTINGS;
        }
        tjj.a(aagf);
    }

    public final void b(achi<zjm, zjk> achi) {
        super.b((achi) achi);
        this.a.a.b();
    }

    public void onAttach(Context context) {
        aipx.a(this);
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.a(getContext(), getArguments() == null ? new Bundle() : getArguments(), b(), this.d, new zkf(), requireActivity(), this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return null;
        }
        View a = this.a.a(layoutInflater, viewGroup);
        this.c.a(this.b.c.b(ajee.a(ajef.a)).f(new -$$Lambda$PaymentsMethodListFragment$2azV1R_EYrJjm6YNPxskXnxHKj0(a)));
        return a;
    }

    public void onDestroy() {
        super.onDestroy();
        tki tki = this.a;
        tki.a.g();
        tki.b.a();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.c.a();
    }

    public void onPause() {
        super.onPause();
    }
}
