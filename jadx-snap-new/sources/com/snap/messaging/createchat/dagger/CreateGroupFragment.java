package com.snap.messaging.createchat.dagger;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import com.snap.messaging.createchat.ui.view.CreateChatRecipientBarView;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achi;
import defpackage.ahbd;
import defpackage.aipx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.akcr;
import defpackage.qqm;
import defpackage.qqq;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkq;
import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

public final class CreateGroupFragment extends MainPageFragment {
    public zkq a;
    public achb<zjm, zjk> b;
    public zgb c;
    public defpackage.qra.a d;
    qqm e;
    ahbd f = ahbd.FRIENDS_FEED;
    qqq g;
    private RecyclerView h;
    private VerticalRecyclerViewFastScroller i;
    private View j;
    private View k;
    private ImageButton l;
    private CreateChatRecipientBarView m;
    private View n;
    private defpackage.qqk.a o;
    private View p;
    private ajei q;
    private zhh r;

    public static final class a {
        public qqq a;
        public ahbd b = ahbd.FRIENDS_FEED;
        private qqm c;

        public final a a(qqm qqm) {
            akcr.b(qqm, "createGroupCallback");
            this.c = qqm;
            return this;
        }

        public final CreateGroupFragment a() {
            CreateGroupFragment createGroupFragment = new CreateGroupFragment();
            createGroupFragment.e = this.c;
            createGroupFragment.g = this.a;
            createGroupFragment.f = this.b;
            return createGroupFragment;
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ CreateGroupFragment a;

        b(CreateGroupFragment createGroupFragment) {
            this.a = createGroupFragment;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class c<T> implements ajfb<Rect> {
        private /* synthetic */ CreateGroupFragment a;

        c(CreateGroupFragment createGroupFragment) {
            this.a = createGroupFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            LayoutParams layoutParams = CreateGroupFragment.a(this.a).getLayoutParams();
            layoutParams.height = rect.bottom;
            CreateGroupFragment.a(this.a).setLayoutParams(layoutParams);
            layoutParams = CreateGroupFragment.b(this.a).getLayoutParams();
            layoutParams.height = rect.top;
            CreateGroupFragment.b(this.a).setLayoutParams(layoutParams);
        }
    }

    static final class d<T> implements ajfb<Integer> {
        private /* synthetic */ CreateGroupFragment a;

        d(CreateGroupFragment createGroupFragment) {
            this.a = createGroupFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            View c = CreateGroupFragment.c(this.a);
            LayoutParams layoutParams = CreateGroupFragment.c(this.a).getLayoutParams();
            akcr.a(obj, "it");
            layoutParams.height = obj.intValue();
            c.setLayoutParams(layoutParams);
        }
    }

    public static final /* synthetic */ View a(CreateGroupFragment createGroupFragment) {
        View view = createGroupFragment.k;
        if (view == null) {
            akcr.a("navbarInset");
        }
        return view;
    }

    public static final /* synthetic */ View c(CreateGroupFragment createGroupFragment) {
        View view = createGroupFragment.p;
        if (view == null) {
            akcr.a("keyboardPlaceHolder");
        }
        return view;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        defpackage.qqk.a aVar = this.o;
        if (aVar == null) {
            akcr.a("createGroupPresenter");
        }
        aVar.b();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        defpackage.qqk.a aVar = this.o;
        if (aVar == null) {
            akcr.a("createGroupPresenter");
        }
        aVar.c();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        aipx.a(this);
        this.q = new ajei();
        View inflate = layoutInflater.inflate(R.layout.fragment_create_group, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        this.h = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.fast_scroller);
        akcr.a(findViewById, "view.findViewById(R.id.fast_scroller)");
        this.i = (VerticalRecyclerViewFastScroller) findViewById;
        findViewById = inflate.findViewById(R.id.statusbar_inset);
        akcr.a(findViewById, "view.findViewById(R.id.statusbar_inset)");
        this.j = findViewById;
        findViewById = inflate.findViewById(R.id.navbar_inset);
        akcr.a(findViewById, "view.findViewById(R.id.navbar_inset)");
        this.k = findViewById;
        findViewById = inflate.findViewById(R.id.dismiss_chat_creation_btn);
        akcr.a(findViewById, "view.findViewById(R.id.dismiss_chat_creation_btn)");
        this.l = (ImageButton) findViewById;
        ImageButton imageButton = this.l;
        String str = "dismissFragmentButton";
        if (imageButton == null) {
            akcr.a(str);
        }
        imageButton.setOnClickListener(new b(this));
        findViewById = inflate.findViewById(R.id.create_chat_recipients);
        akcr.a(findViewById, "view.findViewById(R.id.create_chat_recipients)");
        this.m = (CreateChatRecipientBarView) findViewById;
        findViewById = inflate.findViewById(R.id.create_chat_button);
        akcr.a(findViewById, "view.findViewById(R.id.create_chat_button)");
        this.n = findViewById;
        findViewById = inflate.findViewById(R.id.keyboard_placeholder);
        akcr.a(findViewById, "view.findViewById(R.id.keyboard_placeholder)");
        this.p = findViewById;
        defpackage.qra.a aVar = this.d;
        if (aVar == null) {
            akcr.a("createGroupComponent");
        }
        ImageButton imageButton2 = this.l;
        if (imageButton2 == null) {
            akcr.a(str);
        }
        aVar = aVar.a((View) imageButton2);
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a("_recyclerView");
        }
        aVar = aVar.a(recyclerView);
        CreateChatRecipientBarView createChatRecipientBarView = this.m;
        if (createChatRecipientBarView == null) {
            akcr.a("recipientBar");
        }
        aVar = aVar.a(createChatRecipientBarView);
        View view = this.n;
        if (view == null) {
            akcr.a("createGroupButton");
        }
        this.o = aVar.b(view).a(this.e).a(this.g).a(this.f).a().a();
        Context context = getContext();
        zkq zkq = this.a;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        this.r = new zhh(context, zkq);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        ajei ajei = this.q;
        if (ajei == null) {
            akcr.a("disposeOnDestroyView");
        }
        ajei.dispose();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        defpackage.qqk.a aVar = this.o;
        if (aVar == null) {
            akcr.a("createGroupPresenter");
        }
        ajej start = aVar.start();
        akcr.a((Object) start, "createGroupPresenter.start()");
        ajei ajei = this.q;
        String str = "disposeOnDestroyView";
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        RecyclerView recyclerView = this.h;
        String str2 = "_recyclerView";
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.setItemAnimator(null);
        VerticalRecyclerViewFastScroller verticalRecyclerViewFastScroller = this.i;
        String str3 = "fastScroller";
        if (verticalRecyclerViewFastScroller == null) {
            akcr.a(str3);
        }
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null) {
            akcr.a(str2);
        }
        verticalRecyclerViewFastScroller.a(recyclerView2);
        recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        VerticalRecyclerViewFastScroller verticalRecyclerViewFastScroller2 = this.i;
        if (verticalRecyclerViewFastScroller2 == null) {
            akcr.a(str3);
        }
        recyclerView.addOnScrollListener(verticalRecyclerViewFastScroller2.a());
        zkq zkq = this.a;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        start = zkq.a().f((ajfb) new c(this));
        akcr.a((Object) start, "insetsDetector.windowRec…s = statusbarLp\n        }");
        ajei = this.q;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        zhh zhh = this.r;
        if (zhh == null) {
            akcr.a("keyboardDetector");
        }
        start = zhh.a().f((ajfb) new d(this));
        akcr.a((Object) start, "keyboardDetector.keyboar…t\n            }\n        }");
        ajei = this.q;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
    }
}
