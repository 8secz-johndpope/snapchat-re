package com.snap.bitmoji.ui.settings.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.bitmoji.ui.settings.presenter.BitmojiOAuth2Presenter;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.dhn;

public final class BitmojiOAuth2Fragment extends MainPageFragment implements dhn {
    public BitmojiOAuth2Presenter a;
    private View b;

    public final LoadingSpinnerView a() {
        View view = this.b;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_oauth2_spinner);
        akcr.a(findViewById, "layout.findViewById(R.id.bitmoji_oauth2_spinner)");
        return (LoadingSpinnerView) findViewById;
    }

    public final Uri b() {
        Bundle arguments = getArguments();
        Uri uri = arguments != null ? (Uri) arguments.getParcelable("OAuth2Uri") : null;
        if (uri != null) {
            return uri;
        }
        throw new ajxt("null cannot be cast to non-null type android.net.Uri");
    }

    public final boolean c() {
        Uri b = b();
        if (b != null) {
            String queryParameter = b.getQueryParameter("is_linking");
            if (queryParameter != null) {
                return Boolean.parseBoolean(queryParameter);
            }
        }
        return false;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        BitmojiOAuth2Presenter bitmojiOAuth2Presenter = this.a;
        if (bitmojiOAuth2Presenter == null) {
            akcr.a("presenter");
        }
        bitmojiOAuth2Presenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.mushroom_bitmoji_oauth2_fragment, viewGroup, false);
        akcr.a(inflate, "it");
        this.b = inflate;
        return inflate;
    }

    public final void onDetach() {
        BitmojiOAuth2Presenter bitmojiOAuth2Presenter = this.a;
        if (bitmojiOAuth2Presenter == null) {
            akcr.a("presenter");
        }
        bitmojiOAuth2Presenter.dropTarget();
        super.onDetach();
    }
}
