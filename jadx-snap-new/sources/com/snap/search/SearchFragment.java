package com.snap.search;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.brightcove.player.media.MediaService;
import com.snap.search.ui.SearchPresenter;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.SnapFontEditText;
import com.snapchat.android.R;
import defpackage.absi;
import defpackage.acgw;
import defpackage.achi;
import defpackage.achj;
import defpackage.aipx;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.ipt;
import defpackage.pql;
import defpackage.vxc;
import defpackage.vxe;
import defpackage.vzi;
import defpackage.vzn;
import defpackage.vzy;
import defpackage.wae;
import defpackage.waf;
import defpackage.wai;
import defpackage.wbi;
import defpackage.weg;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zlm;
import java.util.List;

public final class SearchFragment extends MainPageFragment implements zlm {
    public SearchPresenter a;
    public vzn b;
    public ipt c;
    public zgb d;
    public wai e;
    private View f;
    private weg g;
    private RecyclerView h;
    private List<? extends vzy> i;
    private Class<? extends vzi> j;
    private vxe k;
    private boolean l;
    private boolean m;
    private a n;
    private final e o = new e(this);
    private final OnEditorActionListener p = new c(this);
    private final OnClickListener q = new b(this);
    private final f r = new f(this);

    public static final class a implements OnLayoutChangeListener {
        private final RecyclerView a;

        public a(RecyclerView recyclerView) {
            akcr.b(recyclerView, "recyclerView");
            this.a = recyclerView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            RecyclerView recyclerView = this.a;
            i = recyclerView.getPaddingLeft();
            Object context = this.a.getContext();
            akcr.a(context, "recyclerView.context");
            recyclerView.setPadding(i, i4 + context.getResources().getDimensionPixelOffset(R.dimen.search_recycler_view_top_padding), this.a.getPaddingRight(), this.a.getPaddingBottom());
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ SearchFragment a;

        b(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        public final void onClick(View view) {
            Object p = this.a.b().d.p();
            if (p == null) {
                akcr.a();
            }
            if ((((CharSequence) ((wae) p).b).length() == 0 ? 1 : null) == null) {
                SearchFragment.a(this.a).a();
                return;
            }
            FragmentActivity activity = this.a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class c implements OnEditorActionListener {
        private /* synthetic */ SearchFragment a;

        c(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.a.c();
            this.a.b().d.a(new wae(SearchFragment.a(this.a).b.getText().toString(), waf.KEYBOARD_ENTER_KEY));
            return true;
        }
    }

    public static final class e implements TextWatcher {
        private /* synthetic */ SearchFragment a;

        e(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            akcr.b(charSequence, "s");
            this.a.b().d.a(new wae(charSequence.toString(), waf.USER_INPUT));
        }
    }

    public static final class f extends OnScrollListener {
        private /* synthetic */ SearchFragment a;

        f(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            vzn vzn = this.a.b;
            if (vzn == null) {
                akcr.a("searchEventObserver");
            }
            vzn.b();
            this.a.c();
        }
    }

    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ SearchFragment a;

        d(SearchFragment searchFragment) {
            this.a = searchFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.w();
            return ajxw.a;
        }
    }

    public final RecyclerView a() {
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        return recyclerView;
    }

    public final void a(Class<? extends vzi> cls) {
        akcr.b(cls, "viewTypeClass");
        this.j = cls;
    }

    public final void a(List<? extends vzy> list) {
        akcr.b(list, "searchSectionProviders");
        this.i = list;
    }

    public final void a(vxe vxe) {
        akcr.b(vxe, "searchLaunchOptions");
        this.k = vxe;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        weg weg = this.g;
        if (weg == null) {
            akcr.a("searchBar");
        }
        weg.b.setFocusableInTouchMode(true);
    }

    public final SearchPresenter b() {
        SearchPresenter searchPresenter = this.a;
        if (searchPresenter == null) {
            akcr.a("presenter");
        }
        return searchPresenter;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        weg weg = this.g;
        String str = "searchBar";
        if (weg == null) {
            akcr.a(str);
        }
        weg.b.setFocusable(false);
        if (akcr.a((zjm) achi.f.e(), pql.a)) {
            weg weg2 = this.g;
            if (weg2 == null) {
                akcr.a(str);
            }
            weg2.a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        FragmentActivity activity = getActivity();
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager != null) {
            RecyclerView recyclerView = this.h;
            if (recyclerView == null) {
                akcr.a("recyclerView");
            }
            inputMethodManager.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
        }
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.c(achi);
        if (achi.l) {
            this.m = false;
        }
        if (achi.l && (akcr.a((zjm) achi.f.e(), vxc.a) ^ 1) != 0) {
            c();
        }
        if (!this.m && akcr.a((zjm) achi.f.e(), vxc.a) && achi.d == acgw.PRESENT && achi.g == achj.SETTLING_TO_DESTINATION) {
            weg weg = this.g;
            if (weg == null) {
                akcr.a("searchBar");
            }
            weg.b.requestFocus();
            this.m = true;
        }
    }

    public final /* synthetic */ Activity d() {
        return getActivity();
    }

    public final void n_() {
        super.n_();
        weg weg = this.g;
        String str = "searchBar";
        if (weg == null) {
            akcr.a(str);
        }
        weg.b.addTextChangedListener(this.o);
        weg = this.g;
        if (weg == null) {
            akcr.a(str);
        }
        View view = weg.d;
        if (view != null) {
            view.setOnClickListener(this.q);
        }
        weg = this.g;
        if (weg == null) {
            akcr.a(str);
        }
        weg.b.setOnEditorActionListener(this.p);
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        recyclerView.addOnScrollListener(this.r);
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        SearchPresenter searchPresenter = this.a;
        String str = "presenter";
        if (searchPresenter == null) {
            akcr.a(str);
        }
        vxe vxe = this.k;
        String str2 = "searchOptions";
        if (vxe == null) {
            akcr.a(str2);
        }
        List list = this.i;
        String str3 = "searchSectionProviders";
        if (list == null) {
            akcr.a(str3);
        }
        Class cls = this.j;
        String str4 = "viewTypeClass";
        if (cls == null) {
            akcr.a(str4);
        }
        akcr.b(vxe, "searchLaunchOptions");
        akcr.b(list, str3);
        akcr.b(cls, str4);
        searchPresenter.a = vxe;
        wbi wbi = searchPresenter.e;
        vxe vxe2 = searchPresenter.a;
        if (vxe2 == null) {
            akcr.a(str2);
        }
        akcr.b(list, str3);
        akcr.b(vxe2, MediaService.OPTIONS);
        wbi.c = list;
        wbi.d = vxe2;
        searchPresenter.b = cls;
        searchPresenter = this.a;
        if (searchPresenter == null) {
            akcr.a(str);
        }
        searchPresenter.takeTarget(this);
        wai wai = this.e;
        if (wai == null) {
            akcr.a("loadCompleteMetricsManager");
        }
        akbk dVar = new d(this);
        akcr.b(dVar, "loadCompleteAction");
        wai.a = dVar;
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.mushroom_search_fragment, viewGroup, false);
        akcr.a(inflate, "inflater.inflate(R.layou…agment, container, false)");
        this.f = inflate;
        View view = this.f;
        String str = "fragmentView";
        if (view == null) {
            akcr.a(str);
        }
        inflate = view.findViewById(R.id.recycler_view);
        akcr.a(inflate, "fragmentView.findViewById(R.id.recycler_view)");
        this.h = (RecyclerView) inflate;
        RecyclerView recyclerView = this.h;
        String str2 = "recyclerView";
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null) {
            akcr.a(str2);
        }
        int paddingLeft = recyclerView2.getPaddingLeft();
        RecyclerView recyclerView3 = this.h;
        if (recyclerView3 == null) {
            akcr.a(str2);
        }
        int paddingTop = recyclerView3.getPaddingTop();
        RecyclerView recyclerView4 = this.h;
        if (recyclerView4 == null) {
            akcr.a(str2);
        }
        recyclerView.setPadding(paddingLeft, paddingTop, recyclerView4.getPaddingRight(), absi.a().b(true));
        view = this.f;
        if (view == null) {
            akcr.a(str);
        }
        return view;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        a aVar = this.n;
        if (aVar != null) {
            weg weg = this.g;
            if (weg == null) {
                akcr.a("searchBar");
            }
            weg.b.removeOnLayoutChangeListener(aVar);
        }
    }

    public final void onDetach() {
        wai wai = this.e;
        if (wai == null) {
            akcr.a("loadCompleteMetricsManager");
        }
        wai.a = null;
        SearchPresenter searchPresenter = this.a;
        if (searchPresenter == null) {
            akcr.a("presenter");
        }
        searchPresenter.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        String str = "searchBar";
        if (!this.l) {
            ipt ipt = this.c;
            String str2 = "hovaController";
            if (ipt == null) {
                akcr.a(str2);
            }
            View a = ipt.a(R.id.neon_header_title, vxc.a);
            if (a != null) {
                SnapFontEditText snapFontEditText = (SnapFontEditText) a;
                ipt ipt2 = this.c;
                if (ipt2 == null) {
                    akcr.a(str2);
                }
                View a2 = ipt2.a(R.id.clear_search_button, vxc.a);
                if (a2 != null) {
                    ImageView imageView = (ImageView) a2;
                    ipt ipt3 = this.c;
                    if (ipt3 == null) {
                        akcr.a(str2);
                    }
                    this.g = new weg(snapFontEditText, imageView, ipt3.a(R.id.neon_header_back_button, vxc.a));
                    weg weg = this.g;
                    if (weg == null) {
                        akcr.a(str);
                    }
                    weg.b.setOnClickListener(new defpackage.weg.a(weg));
                    weg.c.setOnClickListener(new defpackage.weg.b(weg));
                    weg.b.setOnFocusChangeListener(new defpackage.weg.c(weg));
                    weg = this.g;
                    if (weg == null) {
                        akcr.a(str);
                    }
                    weg.b.setFocusableInTouchMode(true);
                    this.l = true;
                } else {
                    throw new ajxt("null cannot be cast to non-null type android.widget.ImageView");
                }
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.SnapFontEditText");
        }
        Object findViewById = view.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById<Recycl…View>(R.id.recycler_view)");
        this.n = new a((RecyclerView) findViewById);
        weg weg2 = this.g;
        if (weg2 == null) {
            akcr.a(str);
        }
        weg2.b.addOnLayoutChangeListener(this.n);
    }

    public final void q_() {
        super.q_();
        weg weg = this.g;
        String str = "searchBar";
        if (weg == null) {
            akcr.a(str);
        }
        weg.b.removeTextChangedListener(this.o);
        weg = this.g;
        if (weg == null) {
            akcr.a(str);
        }
        View view = weg.d;
        if (view != null) {
            view.setOnClickListener(null);
        }
        weg = this.g;
        if (weg == null) {
            akcr.a(str);
        }
        weg.b.setOnEditorActionListener(null);
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a("recyclerView");
        }
        recyclerView.removeOnScrollListener(this.r);
        weg = this.g;
        if (weg == null) {
            akcr.a(str);
        }
        weg.a();
    }
}
