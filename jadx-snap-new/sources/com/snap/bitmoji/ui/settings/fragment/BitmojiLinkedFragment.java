package com.snap.bitmoji.ui.settings.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.bitmoji.ui.settings.presenter.BitmojiLinkedPresenter;
import com.snap.imageloading.view.SnapImageView;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment.b;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.aipx;
import defpackage.ajfb;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.dhm;
import defpackage.zkq;
import java.io.Serializable;

public final class BitmojiLinkedFragment extends MainPageFragment implements dhm {
    public BitmojiLinkedPresenter a;
    public zkq b;
    private View c;

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;
        private /* synthetic */ View b;

        a(View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), this.a.getPaddingBottom());
            view = this.b;
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = rect.bottom;
            view.setLayoutParams(layoutParams);
        }
    }

    public final SnapImageView a() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_linked_image);
        akcr.a(findViewById, "layout.findViewById(R.id.bitmoji_linked_image)");
        return (SnapImageView) findViewById;
    }

    public final View b() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_linked_outfit_layout);
        akcr.a(findViewById, "layout.findViewById(R.id…oji_linked_outfit_layout)");
        return findViewById;
    }

    public final View c() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_linked_edit_layout);
        akcr.a(findViewById, "layout.findViewById(R.id…tmoji_linked_edit_layout)");
        return findViewById;
    }

    public final View d() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_linked_change_selfie_layout);
        akcr.a(findViewById, "layout.findViewById(R.id…ked_change_selfie_layout)");
        return findViewById;
    }

    public final LoadingSpinnerView e() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_linked_spinner);
        akcr.a(findViewById, "layout.findViewById(R.id.bitmoji_linked_spinner)");
        return (LoadingSpinnerView) findViewById;
    }

    public final TextView f() {
        View view = this.c;
        if (view == null) {
            akcr.a(Tags.LAYOUT);
        }
        Object findViewById = view.findViewById(R.id.bitmoji_linked_unlink);
        akcr.a(findViewById, "layout.findViewById(R.id.bitmoji_linked_unlink)");
        return (TextView) findViewById;
    }

    public final aaua g() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("SourcePageType") : null;
        if (serializable != null) {
            return (aaua) serializable;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.analytics.types.PageType");
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
        if (bitmojiLinkedPresenter == null) {
            akcr.a("presenter");
        }
        bitmojiLinkedPresenter.takeTarget((dhm) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mushroom_bitmoji_linked_fragment, viewGroup, false);
    }

    public final void onDetach() {
        BitmojiLinkedPresenter bitmojiLinkedPresenter = this.a;
        if (bitmojiLinkedPresenter == null) {
            akcr.a("presenter");
        }
        bitmojiLinkedPresenter.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.bitmoji_linked_page);
        akcr.a(findViewById, "view.findViewById(R.id.bitmoji_linked_page)");
        this.c = findViewById;
        findViewById = view.findViewById(R.id.navbar_inset);
        akcr.a(findViewById, "view.findViewById(R.id.navbar_inset)");
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new a(view, findViewById)), (ScopedFragment) this, b.ON_DESTROY_VIEW);
    }
}
