package com.snap.identity.ui.legal.pages.privacy;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.identity.ui.legal.AbstractLegalAgreementFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.itl;
import defpackage.jjt;

public final class PrivacyPolicyFragment extends AbstractLegalAgreementFragment implements jjt {
    public PrivacyPolicyPresenter d;
    private View e;
    private TextView f;
    private ImageView g;

    public final View b() {
        View view = this.e;
        if (view == null) {
            akcr.a("closeButton");
        }
        return view;
    }

    public final TextView f() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("acceptButton");
        }
        return textView;
    }

    public final ImageView g() {
        ImageView imageView = this.g;
        if (imageView == null) {
            akcr.a("image");
        }
        return imageView;
    }

    public final boolean o_() {
        return !a().b(itl.PrivacyPolicy) ? true : super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        PrivacyPolicyPresenter privacyPolicyPresenter = this.d;
        if (privacyPolicyPresenter == null) {
            akcr.a("presenter");
        }
        privacyPolicyPresenter.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.fragment_privacy_policy, viewGroup, false);
        akcr.a(inflate, "inflater.inflate(R.layou…policy, container, false)");
        Object findViewById = inflate.findViewById(R.id.accept_button);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.accept_button)");
        TextView textView = (TextView) findViewById;
        String str = "<set-?>";
        akcr.b(textView, str);
        this.f = textView;
        findViewById = inflate.findViewById(R.id.close_button);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.close_button)");
        akcr.b(findViewById, str);
        this.e = findViewById;
        findViewById = inflate.findViewById(R.id.illustration);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.illustration)");
        ImageView imageView = (ImageView) findViewById;
        akcr.b(imageView, str);
        this.g = imageView;
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        PrivacyPolicyPresenter privacyPolicyPresenter = this.d;
        if (privacyPolicyPresenter == null) {
            akcr.a("presenter");
        }
        privacyPolicyPresenter.dropTarget();
    }
}
