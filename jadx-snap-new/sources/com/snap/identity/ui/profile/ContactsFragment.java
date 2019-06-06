package com.snap.identity.ui.profile;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.ajyl;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.ftl;
import defpackage.itg;
import defpackage.ith;
import defpackage.iue;
import defpackage.jjw;
import defpackage.jsf;
import defpackage.jsl;
import defpackage.zhh;
import defpackage.zjq;
import defpackage.zkq;
import defpackage.zlm;
import defpackage.zmy;

public final class ContactsFragment extends FriendingFragmentV11 implements itg, zjq, zlm {
    public ContactsPresenter a;
    public zkq b;
    public ftl c;
    public zhh d;
    public ith e = ith.PROFILE;
    public boolean f;
    private RecyclerView u;
    private AlphabeticScrollbar v;
    private View w;

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

    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ ContactsFragment a;

        b(ContactsFragment contactsFragment) {
            this.a = contactsFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            View a = ContactsFragment.a(this.a);
            LayoutParams layoutParams = ContactsFragment.a(this.a).getLayoutParams();
            akcr.a(obj, "keyboardHeight");
            layoutParams.height = obj.intValue();
            a.setLayoutParams(layoutParams);
        }
    }

    static final class c extends akcq implements akbl<String, ajxw> {
        c(ContactsFragment contactsFragment) {
            super(1, contactsFragment);
        }

        public final String getName() {
            return "onScrollBarIconTouched";
        }

        public final akej getOwner() {
            return akde.a(ContactsFragment.class);
        }

        public final String getSignature() {
            return "onScrollBarIconTouched(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "p1");
            ContactsFragment.a((ContactsFragment) this.receiver, str);
            return ajxw.a;
        }
    }

    public static final /* synthetic */ void a(ContactsFragment contactsFragment, String str) {
        contactsFragment.k();
        ContactsPresenter contactsPresenter = contactsFragment.a;
        if (contactsPresenter == null) {
            akcr.a("presenter");
        }
        akcr.b(str, "touchedIconType");
        iue iue = contactsPresenter.e;
        if (iue == null) {
            akcr.a("scrollBarController");
        }
        iue.a(str);
    }

    public final long S_() {
        return -1;
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
        if (zmy instanceof jsl) {
            context = getContext();
            i = R.string.contacts_on_snapchat;
        } else if (!(zmy instanceof jsf)) {
            return null;
        } else {
            context = getContext();
            i = R.string.contacts_not_on_snapchat;
        }
        return context.getString(i);
    }

    public final void a(boolean z) {
        String str = "scrollBar";
        AlphabeticScrollbar alphabeticScrollbar;
        if (z) {
            g().setVisibility(0);
            i().setVisibility(0);
            j().setVisibility(0);
            RecyclerView recyclerView = this.u;
            if (recyclerView == null) {
                akcr.a("addFriendsRecyclerView");
            }
            recyclerView.addOnScrollListener(this.t);
            alphabeticScrollbar = this.v;
            if (alphabeticScrollbar == null) {
                akcr.a(str);
            }
            alphabeticScrollbar.setVisibility(0);
            return;
        }
        g().setVisibility(8);
        i().setVisibility(8);
        j().setVisibility(8);
        alphabeticScrollbar = this.v;
        if (alphabeticScrollbar == null) {
            akcr.a(str);
        }
        alphabeticScrollbar.setVisibility(8);
    }

    public final ith b() {
        return this.e;
    }

    public final /* synthetic */ Activity d() {
        return getActivity();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        ContactsPresenter contactsPresenter = this.a;
        if (contactsPresenter == null) {
            akcr.a("presenter");
        }
        contactsPresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_profile_contacts, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        this.u = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.scroll_bar_viewstub);
        akcr.a(findViewById, "view.findViewById(R.id.scroll_bar_viewstub)");
        this.v = (AlphabeticScrollbar) findViewById;
        findViewById = inflate.findViewById(R.id.keyboard_placeholder);
        akcr.a(findViewById, "view.findViewById(R.id.keyboard_placeholder)");
        this.w = findViewById;
        akcr.a((Object) inflate, "view");
        findViewById = getResources().getString(R.string.friend_card_add_contacts_button);
        akcr.a(findViewById, "resources.getString(R.st…card_add_contacts_button)");
        FriendingFragmentV11.a(this, inflate, (CharSequence) findViewById, 0, true, 4);
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        ContactsPresenter contactsPresenter = this.a;
        if (contactsPresenter == null) {
            akcr.a("presenter");
        }
        contactsPresenter.dropTarget();
    }

    public final void onStart() {
        super.onStart();
        a(ajyl.a(new ajxm(a(), Float.valueOf(MapboxConstants.MINIMUM_ZOOM))));
        ContactsPresenter contactsPresenter = this.a;
        if (contactsPresenter == null) {
            akcr.a("presenter");
        }
        a(contactsPresenter.f);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            akcr.a("addFriendsRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ajej f = zkq.a().f((ajfb) new a(view));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        zhh zhh = this.d;
        if (zhh == null) {
            akcr.a("keyboardDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zhh.a().f((ajfb) new b(this)), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        AlphabeticScrollbar alphabeticScrollbar = this.v;
        if (alphabeticScrollbar == null) {
            akcr.a("scrollBar");
        }
        ScopedFragment.a((ScopedFragment) this, alphabeticScrollbar.a().f((ajfb) new jjw(new c(this))), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }
}
