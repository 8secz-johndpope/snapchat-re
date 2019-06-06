package com.snap.identity.ui.legal.pages.terms;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.identity.ui.legal.AbstractLegalAgreementFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.itl;
import defpackage.jju;

public final class TermsOfUseFragment extends AbstractLegalAgreementFragment implements jju {
    public TermsOfUsePresenter d;
    private TextView e;
    private TextView f;
    private View g;

    public final TextView b() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("acceptButton");
        }
        return textView;
    }

    public final TextView f() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("title");
        }
        return textView;
    }

    public final View g() {
        View view = this.g;
        if (view == null) {
            akcr.a("closeButton");
        }
        return view;
    }

    public final boolean o_() {
        return !a().b(itl.TermsOfUse) ? true : super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        TermsOfUsePresenter termsOfUsePresenter = this.d;
        if (termsOfUsePresenter == null) {
            akcr.a("presenter");
        }
        termsOfUsePresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.fragment_terms_of_use, viewGroup, false);
        akcr.a(inflate, "inflater.inflate(R.layou…of_use, container, false)");
        Object findViewById = inflate.findViewById(R.id.accept_button);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.accept_button)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.e = textView;
        findViewById = inflate.findViewById(R.id.title);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.title)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        findViewById = inflate.findViewById(R.id.close_button);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.close_button)");
        akcr.b(findViewById, str);
        this.g = findViewById;
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        TermsOfUsePresenter termsOfUsePresenter = this.d;
        if (termsOfUsePresenter == null) {
            akcr.a("presenter");
        }
        termsOfUsePresenter.dropTarget();
    }
}
