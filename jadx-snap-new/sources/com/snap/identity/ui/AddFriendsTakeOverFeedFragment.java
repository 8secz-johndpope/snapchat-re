package com.snap.identity.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment.b;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.zkq;
import defpackage.zlm;

public final class AddFriendsTakeOverFeedFragment extends MainPageFragment implements zlm {
    public AddFriendsTakeOverFeedPresenter a;
    public zkq b;
    private RecyclerView c;

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), rect.bottom);
        }
    }

    public final RecyclerView a() {
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        return recyclerView;
    }

    public final /* synthetic */ Activity d() {
        return getActivity();
    }

    public final boolean o_() {
        AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter = this.a;
        if (addFriendsTakeOverFeedPresenter == null) {
            akcr.a("presenter");
        }
        addFriendsTakeOverFeedPresenter.b();
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter = this.a;
        if (addFriendsTakeOverFeedPresenter == null) {
            akcr.a("presenter");
        }
        addFriendsTakeOverFeedPresenter.takeTarget((zlm) this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.fragment_add_friends_take_over_feed, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.reciprocation_recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.r…iprocation_recycler_view)");
        this.c = (RecyclerView) findViewById;
        akcr.a(inflate, "view");
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        AddFriendsTakeOverFeedPresenter addFriendsTakeOverFeedPresenter = this.a;
        if (addFriendsTakeOverFeedPresenter == null) {
            akcr.a("presenter");
        }
        addFriendsTakeOverFeedPresenter.dropTarget();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new a(view)), (ScopedFragment) this, b.ON_DESTROY_VIEW);
    }
}
