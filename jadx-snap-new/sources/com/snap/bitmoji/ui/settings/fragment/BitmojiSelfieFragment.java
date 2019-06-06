package com.snap.bitmoji.ui.settings.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.snap.bitmoji.ui.settings.presenter.BitmojiSelfiePresenter;
import com.snap.bitmoji.ui.settings.view.SaveBitmojiSelfieButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment.b;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aaua;
import defpackage.aipx;
import defpackage.ajfb;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.dho;
import defpackage.zkq;
import java.io.Serializable;

public final class BitmojiSelfieFragment extends MainPageFragment implements dho {
    public BitmojiSelfiePresenter a;
    public zkq b;
    private RecyclerView c;
    private SaveBitmojiSelfieButton d;

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

    public final RecyclerView a() {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        return recyclerView;
    }

    public final SaveBitmojiSelfieButton b() {
        SaveBitmojiSelfieButton saveBitmojiSelfieButton = this.d;
        if (saveBitmojiSelfieButton == null) {
            akcr.a("bitmojiSelfieSaveButton");
        }
        return saveBitmojiSelfieButton;
    }

    public final aaua c() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("SourcePageType") : null;
        if (serializable != null) {
            return (aaua) serializable;
        }
        throw new ajxt("null cannot be cast to non-null type com.snapchat.analytics.types.PageType");
    }

    public final /* synthetic */ Activity d() {
        return getActivity();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        BitmojiSelfiePresenter bitmojiSelfiePresenter = this.a;
        if (bitmojiSelfiePresenter == null) {
            akcr.a("presenter");
        }
        bitmojiSelfiePresenter.takeTarget((dho) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mushroom_bitmoji_selfie_fragment, viewGroup, false);
    }

    public final void onDetach() {
        BitmojiSelfiePresenter bitmojiSelfiePresenter = this.a;
        if (bitmojiSelfiePresenter == null) {
            akcr.a("presenter");
        }
        bitmojiSelfiePresenter.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.bitmoji_selfie_button);
        akcr.a(findViewById, "it.findViewById(R.id.bitmoji_selfie_button)");
        this.d = (SaveBitmojiSelfieButton) findViewById;
        findViewById = view.findViewById(R.id.navbar_inset);
        akcr.a(findViewById, "it.findViewById(R.id.navbar_inset)");
        Object findViewById2 = view.findViewById(R.id.bitmoji_selfie_recyler_view);
        akcr.a(findViewById2, "it.findViewById(R.id.bitmoji_selfie_recyler_view)");
        this.c = (RecyclerView) findViewById2;
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new a(view, findViewById)), (ScopedFragment) this, b.ON_DESTROY_VIEW);
    }
}
