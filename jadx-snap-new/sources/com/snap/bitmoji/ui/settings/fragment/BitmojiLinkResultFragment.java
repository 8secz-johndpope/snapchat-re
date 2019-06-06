package com.snap.bitmoji.ui.settings.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.bitmoji.ui.settings.presenter.BitmojiLinkResultPresenter;
import com.snap.imageloading.view.SnapImageView;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment.b;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.dhl;
import defpackage.zkq;

public final class BitmojiLinkResultFragment extends MainPageFragment implements dhl {
    public BitmojiLinkResultPresenter a;
    public zkq b;
    private View c;

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            Object findViewById = this.a.findViewById(R.id.navbar_inset);
            akcr.a(findViewById, "view.findViewById(R.id.navbar_inset)");
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), this.a.getPaddingBottom());
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = rect.bottom;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final LoadingSpinnerView a() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_link_result_image_loading_spinner);
        akcr.a(findViewById, "layout.findViewById(R.id…lt_image_loading_spinner)");
        return (LoadingSpinnerView) findViewById;
    }

    public final SnapImageView b() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_link_result_image);
        akcr.a(findViewById, "layout.findViewById(R.id…itmoji_link_result_image)");
        return (SnapImageView) findViewById;
    }

    public final String c() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("LinkResultSelfieId") : null;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        BitmojiLinkResultPresenter bitmojiLinkResultPresenter = this.a;
        if (bitmojiLinkResultPresenter == null) {
            akcr.a("presenter");
        }
        bitmojiLinkResultPresenter.takeTarget((dhl) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mushroom_bitmoji_link_result_fragment, viewGroup, false);
    }

    public final void onDetach() {
        BitmojiLinkResultPresenter bitmojiLinkResultPresenter = this.a;
        if (bitmojiLinkResultPresenter == null) {
            akcr.a("presenter");
        }
        bitmojiLinkResultPresenter.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.bitmoji_link_result_page);
        akcr.a(findViewById, "view.findViewById(R.id.bitmoji_link_result_page)");
        this.c = findViewById;
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new a(view)), (ScopedFragment) this, b.ON_DESTROY_VIEW);
    }
}
