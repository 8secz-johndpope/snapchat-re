package com.snap.identity.ui.profile;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.view.ViewStubWrapper;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajwa;
import defpackage.ajwl;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajym;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.isk;
import defpackage.itg;
import defpackage.ith;
import defpackage.jjv;
import defpackage.jrx;
import defpackage.jrz;
import defpackage.jtv;
import defpackage.jvh;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkq;
import defpackage.zln;
import defpackage.zmy;

public final class AddFriendsFragmentV2 extends FriendingFragmentV11 implements itg, jjv {
    public AddFriendsPresenterV2 a;
    public zkq b;
    RecyclerView c;
    public ith d = ith.PROFILE;
    public boolean e;
    public int f;
    private RecyclerView u;
    private View v;
    private ViewStubWrapper<? extends View> w;
    private float x;
    private boolean y;
    private final ajxe z = ajxh.a(new d(this));

    static final class a implements OnClickListener {
        private /* synthetic */ AddFriendsFragmentV2 a;

        a(AddFriendsFragmentV2 addFriendsFragmentV2) {
            this.a = addFriendsFragmentV2;
        }

        public final void onClick(View view) {
            this.a.c().onClickAddSnapcode(new isk());
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ AddFriendsFragmentV2 a;

        b(AddFriendsFragmentV2 addFriendsFragmentV2) {
            this.a = addFriendsFragmentV2;
        }

        public final void onClick(View view) {
            AddFriendsPresenterV2 c = this.a.c();
            zln.bindTo$default(c, ajwa.a(c.k, c.l).b((ajdw) c.i.b()).a((ajdw) c.i.l()).c(1).f((ajfb) new l(c)), c, null, null, 6, null);
        }
    }

    static final class c<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        c(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), rect.bottom);
        }
    }

    static final class d extends akcs implements akbk<RecyclerView> {
        private /* synthetic */ AddFriendsFragmentV2 a;

        d(AddFriendsFragmentV2 addFriendsFragmentV2) {
            this.a = addFriendsFragmentV2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            RecyclerView recyclerView = this.a.c;
            if (recyclerView == null) {
                akcr.a("addFriendsSearchRecyclerView");
            }
            return recyclerView;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(AddFriendsFragmentV2.class), "searchRecyclerView", "getSearchRecyclerView()Landroid/support/v7/widget/RecyclerView;");
    }

    private final void l() {
        if (this.e) {
            View view = this.v;
            if (view == null) {
                akcr.a("addSnapcodeButton");
            }
            view.setVisibility(0);
        }
    }

    public final RecyclerView a() {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            akcr.a("addFriendsRecyclerView");
        }
        return recyclerView;
    }

    public final String a(zmy zmy) {
        Context context;
        int i;
        Object text = h().getText();
        akcr.a(text, "searchText.text");
        if ((((CharSequence) text).length() > 0 ? 1 : null) != null) {
            if (zmy instanceof jtv) {
                context = getContext();
                i = R.string.search_my_friends;
            } else if (!(zmy instanceof jrx) && !(zmy instanceof jvh)) {
                return null;
            } else {
                context = getContext();
                i = R.string.search_header_title;
            }
        } else if (zmy instanceof jrx) {
            context = getContext();
            i = R.string.ff_added_me_title;
        } else if (zmy instanceof jvh) {
            context = getContext();
            i = R.string.df_quick_add;
        } else {
            if (zmy instanceof jrz) {
                this.y = ((jrz) zmy).b;
            }
            return null;
        }
        return context.getString(i);
    }

    public final void a(CharSequence charSequence) {
        akcr.b(charSequence, "text");
        if ((charSequence.length() > 0 ? 1 : null) != null) {
            f().setVisibility(0);
            a().setVisibility(8);
            View view = this.v;
            if (view == null) {
                akcr.a("addSnapcodeButton");
            }
            view.setVisibility(8);
            return;
        }
        f().setVisibility(8);
        a().setVisibility(0);
        l();
    }

    public final void a(String str) {
        ViewStubWrapper viewStubWrapper;
        int i;
        akcr.b(str, "text");
        String str2 = "secondHeaderStub";
        if (this.y && akcr.a((Object) str, getContext().getString(R.string.df_quick_add))) {
            viewStubWrapper = this.w;
            if (viewStubWrapper == null) {
                akcr.a(str2);
            }
            i = 0;
        } else {
            viewStubWrapper = this.w;
            if (viewStubWrapper == null) {
                akcr.a(str2);
            }
            i = 8;
        }
        viewStubWrapper.setVisibility(i);
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        if (isAdded()) {
            AddFriendsPresenterV2 addFriendsPresenterV2 = this.a;
            if (addFriendsPresenterV2 == null) {
                akcr.a("presenter");
            }
            ajwl ajwl = addFriendsPresenterV2.k;
            Object d = addFriendsPresenterV2.d();
            akcr.a(d, "userAuth");
            ajwl.a(Boolean.valueOf(d.a().e != null));
            ajwl = addFriendsPresenterV2.l;
            addFriendsPresenterV2.c();
            ajwl.a(Boolean.FALSE);
        }
    }

    public final ith b() {
        return this.d;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b(achi);
        AddFriendsPresenterV2 addFriendsPresenterV2 = this.a;
        if (addFriendsPresenterV2 == null) {
            akcr.a("presenter");
        }
        addFriendsPresenterV2.m.a();
    }

    public final AddFriendsPresenterV2 c() {
        AddFriendsPresenterV2 addFriendsPresenterV2 = this.a;
        if (addFriendsPresenterV2 == null) {
            akcr.a("presenter");
        }
        return addFriendsPresenterV2;
    }

    public final /* synthetic */ Activity d() {
        return getActivity();
    }

    public final RecyclerView f() {
        return (RecyclerView) this.z.b();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        AddFriendsPresenterV2 addFriendsPresenterV2 = this.a;
        if (addFriendsPresenterV2 == null) {
            akcr.a("presenter");
        }
        addFriendsPresenterV2.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_add_friends, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.add_friends_recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.add_friends_recycler_view)");
        this.u = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.add_friends_search_recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.a…nds_search_recycler_view)");
        this.c = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.add_snapcode_button);
        akcr.a(findViewById, "view.findViewById(R.id.add_snapcode_button)");
        this.v = findViewById;
        Object findViewById2 = inflate.findViewById(R.id.second_header_container);
        akcr.a(findViewById2, "view.findViewById(R.id.second_header_container)");
        this.w = new ViewStubWrapper((ViewStub) findViewById2);
        this.x = getResources().getDimension(R.dimen.add_friends_buttons_margin_top);
        akcr.a((Object) inflate, "view");
        findViewById = getResources().getString(R.string.add_friends);
        akcr.a(findViewById, "resources.getString(R.string.add_friends)");
        FriendingFragmentV11.a(this, inflate, (CharSequence) findViewById, 0, false, 12);
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        AddFriendsPresenterV2 addFriendsPresenterV2 = this.a;
        if (addFriendsPresenterV2 == null) {
            akcr.a("presenter");
        }
        addFriendsPresenterV2.dropTarget();
    }

    public final void onStart() {
        super.onStart();
        l();
        a(ajym.b((Object[]) new ajxm[]{new ajxm(a(), Float.valueOf(this.x)), new ajxm(f(), Float.valueOf(MapboxConstants.MINIMUM_ZOOM))}));
        View view = this.v;
        if (view == null) {
            akcr.a("addSnapcodeButton");
        }
        view.setOnClickListener(new a(this));
        ViewStubWrapper viewStubWrapper = this.w;
        if (viewStubWrapper == null) {
            akcr.a("secondHeaderStub");
        }
        viewStubWrapper.setOnClickListener(new b(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            akcr.a("addFriendsRecyclerView");
        }
        recyclerView.addOnScrollListener(this.t);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView = this.c;
        if (recyclerView == null) {
            akcr.a("addFriendsSearchRecyclerView");
        }
        recyclerView.addOnScrollListener(this.t);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new c(view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }
}
