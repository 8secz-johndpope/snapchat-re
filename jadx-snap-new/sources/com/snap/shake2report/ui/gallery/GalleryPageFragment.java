package com.snap.shake2report.ui.gallery;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.wwk;
import defpackage.zha;

public final class GalleryPageFragment extends MainPageFragment implements wwk {
    public GalleryPagePresenter a;
    private ScHeaderView b;
    private RecyclerView c;

    public final ScHeaderView b() {
        ScHeaderView scHeaderView = this.b;
        if (scHeaderView == null) {
            akcr.a("headerView");
        }
        return scHeaderView;
    }

    public final RecyclerView c() {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        return recyclerView;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        GalleryPagePresenter galleryPagePresenter = this.a;
        if (galleryPagePresenter == null) {
            akcr.a("presenter");
        }
        galleryPagePresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.s2r_gallery_fragment, viewGroup, false);
        if (inflate != null) {
            View findViewById = inflate.findViewById(R.id.s2r_gallery_fragment_header);
            if (findViewById != null) {
                ScHeaderView scHeaderView = (ScHeaderView) findViewById;
                String str = "<set-?>";
                akcr.b(scHeaderView, str);
                this.b = scHeaderView;
                findViewById = inflate.findViewById(R.id.s2r_gallery_recycler_view);
                if (findViewById != null) {
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    akcr.b(recyclerView, str);
                    this.c = recyclerView;
                    recyclerView = c();
                    recyclerView.setLayoutManager(new GridLayoutManager(inflate.getContext(), 3));
                    Object context = inflate.getContext();
                    akcr.a(context, "fragmentView.context");
                    recyclerView.addItemDecoration(new zha(context.getResources().getDimensionPixelOffset(R.dimen.s2r_gallery_item_spacing), 3));
                    return inflate;
                }
                throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.ScHeaderView");
        }
        throw new ajxt("null cannot be cast to non-null type android.view.View");
    }

    public final void onDetach() {
        super.onDetach();
        GalleryPagePresenter galleryPagePresenter = this.a;
        if (galleryPagePresenter == null) {
            akcr.a("presenter");
        }
        galleryPagePresenter.dropTarget();
    }
}
