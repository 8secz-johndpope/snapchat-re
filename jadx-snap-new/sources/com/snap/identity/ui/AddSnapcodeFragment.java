package com.snap.identity.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.cfl;
import defpackage.eqx;
import defpackage.ftl;
import defpackage.jjg;
import defpackage.jri;
import defpackage.zha;
import defpackage.zkf;
import defpackage.zkq;
import defpackage.zlx;
import defpackage.zmf;
import defpackage.zms;

public final class AddSnapcodeFragment extends MainPageFragment implements jjg {
    public AddSnapcodePresenter a;
    public zkq b;
    public ftl c;
    RecyclerView d;
    ImageButton e;
    final ajxe f = ajxh.a(f.a);
    private View g;
    private final ajxe h = ajxh.a(b.a);
    private final ajxe i = ajxh.a(new a(this));
    private final ajxe j = ajxh.a(new e(this));

    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ AddSnapcodeFragment a;

        c(AddSnapcodeFragment addSnapcodeFragment) {
            this.a = addSnapcodeFragment;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "<anonymous parameter 0>");
            FragmentActivity activity = this.a.getActivity();
            if (activity == null) {
                return null;
            }
            activity.onBackPressed();
            return ajxw.a;
        }
    }

    static final class d<T> implements ajfb<Rect> {
        private /* synthetic */ AddSnapcodeFragment a;
        private /* synthetic */ View b;

        d(AddSnapcodeFragment addSnapcodeFragment, View view) {
            this.a = addSnapcodeFragment;
            this.b = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View a = AddSnapcodeFragment.a(this.a);
            LayoutParams layoutParams = AddSnapcodeFragment.a(this.a).getLayoutParams();
            layoutParams.height = rect.bottom;
            a.setLayoutParams(layoutParams);
            a = this.b;
            a.setPadding(a.getPaddingLeft(), rect.top, this.b.getPaddingRight(), this.b.getPaddingBottom());
            AddSnapcodeFragment addSnapcodeFragment = this.a;
            Object findViewById = this.b.findViewById(R.id.header_dismiss_button);
            akcr.a(findViewById, "view.findViewById(R.id.header_dismiss_button)");
            addSnapcodeFragment.e = (ImageButton) findViewById;
        }
    }

    static final class a extends akcs implements akbk<zmf> {
        private /* synthetic */ AddSnapcodeFragment a;

        a(AddSnapcodeFragment addSnapcodeFragment) {
            this.a = addSnapcodeFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zmf((zms) this.a.f.b(), this.a.a().a());
        }
    }

    static final class b extends akcs implements akbk<zkf> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zkf();
        }
    }

    static final class e extends akcs implements akbk<RecyclerView> {
        private /* synthetic */ AddSnapcodeFragment a;

        e(AddSnapcodeFragment addSnapcodeFragment) {
            this.a = addSnapcodeFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            RecyclerView recyclerView = this.a.d;
            if (recyclerView == null) {
                akcr.a("addSnapcodeRecyclerView");
            }
            return recyclerView;
        }
    }

    static final class f extends akcs implements akbk<zms> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zms((zlx) new eqx(), jri.class);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(AddSnapcodeFragment.class), "viewFactory", "getViewFactory()Lcom/snap/ui/recycling/factory/ViewFactory;"), new akdc(akde.a(AddSnapcodeFragment.class), "bus", "getBus()Lcom/snap/ui/event/RxBus;"), new akdc(akde.a(AddSnapcodeFragment.class), "adapter", "getAdapter()Lcom/snap/ui/recycling/adapter/BindingViewModelAdapter;"), new akdc(akde.a(AddSnapcodeFragment.class), "recyclerView", "getRecyclerView()Landroid/support/v7/widget/RecyclerView;")};
    }

    public static final /* synthetic */ View a(AddSnapcodeFragment addSnapcodeFragment) {
        View view = addSnapcodeFragment.g;
        if (view == null) {
            akcr.a("navbarInset");
        }
        return view;
    }

    public final zkf a() {
        return (zkf) this.h.b();
    }

    public final zmf b() {
        return (zmf) this.i.b();
    }

    public final RecyclerView c() {
        return (RecyclerView) this.j.b();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        AddSnapcodePresenter addSnapcodePresenter = this.a;
        if (addSnapcodePresenter == null) {
            akcr.a("addSnapcodePresenter");
        }
        addSnapcodePresenter.takeTarget((jjg) this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_add_snapcode_v2, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.add_snapcode_recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.add_snapcode_recycler_view)");
        this.d = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.navbar_inset);
        akcr.a(findViewById, "view.findViewById(R.id.navbar_inset)");
        this.g = findViewById;
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        AddSnapcodePresenter addSnapcodePresenter = this.a;
        if (addSnapcodePresenter == null) {
            akcr.a("addSnapcodePresenter");
        }
        addSnapcodePresenter.dropTarget();
    }

    public final void onStart() {
        super.onStart();
        ImageButton imageButton = this.e;
        if (imageButton == null) {
            akcr.a("dismissButton");
        }
        ScopedFragment.a((ScopedFragment) this, cfl.c(imageButton).p(new c(this)).l(), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_STOP);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.d;
        String str = "addSnapcodeRecyclerView";
        if (recyclerView == null) {
            akcr.a(str);
        }
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));
        Object context = view.getContext();
        akcr.a(context, "view.context");
        recyclerView.addItemDecoration(new zha(context.getResources().getDimensionPixelOffset(R.dimen.camera_roll_image_item_space), 3));
        recyclerView = this.d;
        if (recyclerView == null) {
            akcr.a(str);
        }
        recyclerView.setAdapter(b());
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new d(this, view)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }
}
