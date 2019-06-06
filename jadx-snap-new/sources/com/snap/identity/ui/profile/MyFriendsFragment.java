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
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.ScopedMainPageFragment;
import com.snapchat.android.R;
import defpackage.achi;
import defpackage.acih;
import defpackage.aipx;
import defpackage.ajcx;
import defpackage.ajcz;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.ajwl;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.ajxm;
import defpackage.ajxw;
import defpackage.ajyl;
import defpackage.ajyu;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.iek;
import defpackage.igs;
import defpackage.iho;
import defpackage.irc;
import defpackage.iri;
import defpackage.irm;
import defpackage.iro;
import defpackage.irp;
import defpackage.iue;
import defpackage.jjx;
import defpackage.jjy;
import defpackage.jtv;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkq;
import defpackage.zlm;
import defpackage.zmy;
import java.util.concurrent.Callable;

public final class MyFriendsFragment extends FriendingFragmentV11 implements zlm {
    public MyFriendsPresenter a;
    public zkq b;
    public zgb c;
    RecyclerView d;
    final ajxe e = ajxh.a(new c(this));
    final ajwl<CharSequence> f;
    private AlphabeticScrollbar u;
    private ProgressButton v;
    private int w;
    private int x;
    private final OnGlobalLayoutListener y;

    static final class a implements OnGlobalLayoutListener {
        private /* synthetic */ MyFriendsFragment a;

        a(MyFriendsFragment myFriendsFragment) {
            this.a = myFriendsFragment;
        }

        public final void onGlobalLayout() {
            if (this.a.isAdded()) {
                RecyclerView recyclerView = this.a.d;
                if (recyclerView == null) {
                    akcr.a("recyclerView");
                }
                int height = recyclerView.getHeight();
            }
        }
    }

    static final class d implements OnClickListener {
        final /* synthetic */ MyFriendsFragment a;
        private /* synthetic */ iri b;

        /* renamed from: com.snap.identity.ui.profile.MyFriendsFragment$d$1 */
        static final class AnonymousClass1<T> implements ajfb<Throwable> {
            private /* synthetic */ d a;

            AnonymousClass1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                MyFriendsFragment.a(this.a.a).setState(1);
            }
        }

        d(MyFriendsFragment myFriendsFragment, iri iri) {
            this.a = myFriendsFragment;
            this.b = iri;
        }

        public final void onClick(View view) {
            MyFriendsFragment.a(this.a).setState(2);
            MyFriendsFragment myFriendsFragment = this.a;
            akbl akbl = this.b.b;
            MyFriendsPresenter myFriendsPresenter = this.a.a;
            if (myFriendsPresenter == null) {
                akcr.a("presenter");
            }
            ScopedMainPageFragment.a(myFriendsFragment, ((ajcx) akbl.invoke(myFriendsPresenter.l)).a((ajdw) ((zfw) this.a.e.b()).l()).b((ajfb) new AnonymousClass1(this)).a((ajfb) AnonymousClass2.a).a(ajfu.g).e(), this.a, null, null, 6);
        }
    }

    static final class b<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), rect.bottom);
        }
    }

    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ MyFriendsFragment a;

        c(MyFriendsFragment myFriendsFragment) {
            this.a = myFriendsFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.c == null) {
                akcr.a("schedulersProvider");
            }
            return zgb.a(irc.t.callsite("MyFriendsFragment"));
        }
    }

    static final class e extends akcq implements akbl<String, ajxw> {
        e(MyFriendsFragment myFriendsFragment) {
            super(1, myFriendsFragment);
        }

        public final String getName() {
            return "onScrollBarIconTouched";
        }

        public final akej getOwner() {
            return akde.a(MyFriendsFragment.class);
        }

        public final String getSignature() {
            return "onScrollBarIconTouched(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "p1");
            MyFriendsFragment.a((MyFriendsFragment) this.receiver, str);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(MyFriendsFragment.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public MyFriendsFragment() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<CharSequence>()");
        this.f = ajwl;
        this.y = new a(this);
    }

    public static final /* synthetic */ void a(MyFriendsFragment myFriendsFragment, String str) {
        myFriendsFragment.k();
        MyFriendsPresenter myFriendsPresenter = myFriendsFragment.a;
        if (myFriendsPresenter == null) {
            akcr.a("presenter");
        }
        akcr.b(str, "touchedIconType");
        iue iue = myFriendsPresenter.j;
        if (iue == null) {
            akcr.a("scrollBarController");
        }
        iue.a(str);
    }

    private final void c() {
        ProgressButton progressButton = this.v;
        if (progressButton == null) {
            akcr.a("actionButton");
        }
        MyFriendsPresenter myFriendsPresenter = this.a;
        if (myFriendsPresenter == null) {
            akcr.a("presenter");
        }
        progressButton.setVisibility(myFriendsPresenter.a() ? 0 : 8);
    }

    private final void l() {
        MyFriendsPresenter myFriendsPresenter = this.a;
        if (myFriendsPresenter == null) {
            akcr.a("presenter");
        }
        int i = myFriendsPresenter.a() ? this.x : 0;
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        iho.e(recyclerView, i);
    }

    public final RecyclerView a() {
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        return recyclerView;
    }

    public final String a(zmy zmy) {
        if (!(zmy instanceof jtv)) {
            return null;
        }
        jtv jtv = (jtv) zmy;
        int i = jjx.a[jtv.r.ordinal()];
        if (i != 1) {
            Context context;
            if (i == 2) {
                context = getContext();
                i = R.string.my_friends_best_friends;
            } else if (i == 3) {
                context = getContext();
                i = R.string.my_friends_currently_selected;
            } else if (i == 4) {
                context = getContext();
                i = R.string.my_friends_recent_friends;
            } else {
                throw new ajxk();
            }
            return context.getString(i);
        }
        String a = iek.a(jtv.a);
        if (a == null) {
            a = jtv.b;
        }
        char toUpperCase = Character.toUpperCase(a.charAt(0));
        if ('A' > toUpperCase || 'Z' < toUpperCase) {
            toUpperCase = '#';
        }
        return String.valueOf(toUpperCase);
    }

    public final void a(acih acih) {
        super.a(acih);
        if (!(acih instanceof irm)) {
            acih = null;
        }
        irm irm = (irm) acih;
        if (irm != null) {
            Integer num = irm.e;
            if (num != null) {
                g().setText(getString(num.intValue()));
            }
            num = irm.f;
            if (num != null) {
                Object text = getText(num.intValue());
                akcr.a(text, "getText(it)");
                this.f.a(text);
            }
            MyFriendsPresenter myFriendsPresenter = this.a;
            String str = "presenter";
            if (myFriendsPresenter == null) {
                akcr.a(str);
            }
            myFriendsPresenter.k = irm.b;
            irp irp = irm.a;
            if (irp instanceof iro) {
                iro iro = (iro) irp;
                MyFriendsPresenter myFriendsPresenter2 = this.a;
                if (myFriendsPresenter2 == null) {
                    akcr.a(str);
                }
                myFriendsPresenter2.h.a(Boolean.TRUE);
                myFriendsPresenter2 = this.a;
                if (myFriendsPresenter2 == null) {
                    akcr.a(str);
                }
                Object m = ajyu.m(iro.b);
                akcr.b(m, "preselectedFriendsUserIds");
                myFriendsPresenter2.f.a(m);
                myFriendsPresenter2.g.a(m);
                myFriendsPresenter2.l = ajyu.p((Iterable) m);
                MyFriendsFragment myFriendsFragment = (MyFriendsFragment) myFriendsPresenter2.getTarget();
                if (myFriendsFragment != null) {
                    myFriendsFragment.b();
                }
                iri iri = iro.a;
                Object string = getString(iri.a);
                akcr.a(string, "getString(actionButtonConfiguration.textResId)");
                ProgressButton progressButton = this.v;
                String str2 = "actionButton";
                if (progressButton == null) {
                    akcr.a(str2);
                }
                progressButton.a(1, string);
                progressButton = this.v;
                if (progressButton == null) {
                    akcr.a(str2);
                }
                progressButton.a(2, string);
                ProgressButton progressButton2 = this.v;
                if (progressButton2 == null) {
                    akcr.a(str2);
                }
                progressButton2.setState(1);
                progressButton2 = this.v;
                if (progressButton2 == null) {
                    akcr.a(str2);
                }
                progressButton2.setOnClickListener(new d(this, iri));
            }
            myFriendsPresenter = this.a;
            if (myFriendsPresenter == null) {
                akcr.a(str);
            }
            akcr.b(irm, "payload");
            ajcx b = ajcx.b((Callable) new a(myFriendsPresenter, irm));
            akcr.a((Object) b, "Completable.fromCallable…ribe().bindTo(this)\n    }");
            igs.a(b, "initAdapterAsync").b((ajdw) myFriendsPresenter.b.h()).a((ajdw) myFriendsPresenter.b.l()).a((ajcz) myFriendsPresenter.e);
        }
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.y);
    }

    public final void b() {
        c();
        l();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b(achi);
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.y);
    }

    public final /* synthetic */ Activity d() {
        return getActivity();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        MyFriendsPresenter myFriendsPresenter = this.a;
        if (myFriendsPresenter == null) {
            akcr.a("presenter");
        }
        myFriendsPresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.fragment_my_friends, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        this.d = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.my_friend_scroll_bar_viewstub);
        akcr.a(findViewById, "view.findViewById(R.id.m…iend_scroll_bar_viewstub)");
        this.u = (AlphabeticScrollbar) findViewById;
        findViewById = inflate.findViewById(R.id.action_button);
        akcr.a(findViewById, "view.findViewById(R.id.action_button)");
        this.v = (ProgressButton) findViewById;
        this.w = getResources().getDimensionPixelOffset(R.dimen.default_gap_4_5x);
        this.x = getResources().getDimensionPixelOffset(R.dimen.my_friends_recycler_view_padding_bottom);
        akcr.a(inflate, "view");
        findViewById = getResources().getString(R.string.my_friends_title);
        akcr.a(findViewById, "resources.getString(R.string.my_friends_title)");
        a(inflate, (CharSequence) findViewById, 1, true);
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        MyFriendsPresenter myFriendsPresenter = this.a;
        if (myFriendsPresenter == null) {
            akcr.a("presenter");
        }
        myFriendsPresenter.dropTarget();
    }

    public final void onStart() {
        super.onStart();
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        a(ajyl.a(new ajxm(recyclerView, Float.valueOf(MapboxConstants.MINIMUM_ZOOM))));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addOnScrollListener(this.t);
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ajej f = zkq.a().f((ajfb) new b(view));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        ProgressButton progressButton = this.v;
        if (progressButton == null) {
            akcr.a("actionButton");
        }
        iho.g(progressButton, this.w);
        AlphabeticScrollbar alphabeticScrollbar = this.u;
        if (alphabeticScrollbar == null) {
            akcr.a("scrollBar");
        }
        ScopedFragment.a((ScopedFragment) this, alphabeticScrollbar.a().f((ajfb) new jjy(new e(this))), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }
}
