package com.snap.ui.deck;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.R;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfq;
import defpackage.ajwc;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxj;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.ide;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zmv;

public abstract class AsyncPresenterFragment<T> extends MainPageFragment {
    private final ajxe a = ajxh.a(ajxj.PUBLICATION, new f(this));
    private boolean b;
    private boolean c;
    private ajej d;
    private final ajxe e;
    ViewGroup s;
    public T t;
    public zgb u;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ AsyncPresenterFragment a;

        f(AsyncPresenterFragment asyncPresenterFragment) {
            this.a = asyncPresenterFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            AsyncPresenterFragment asyncPresenterFragment = this.a;
            ide c = asyncPresenterFragment.c();
            akcr.b(c, "attributedFeature");
            if (asyncPresenterFragment.u == null) {
                akcr.a("schedulersProvider");
            }
            return zgb.a(c.callsite("AsyncPresenterFragment"));
        }
    }

    static final class e extends akcs implements akbk<ajdw> {
        private /* synthetic */ AsyncPresenterFragment a;

        e(AsyncPresenterFragment asyncPresenterFragment) {
            this.a = asyncPresenterFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.k().h();
        }
    }

    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ AsyncPresenterFragment a;
        private /* synthetic */ LayoutInflater b;

        b(AsyncPresenterFragment asyncPresenterFragment, LayoutInflater layoutInflater) {
            this.a = asyncPresenterFragment;
            this.b = layoutInflater;
        }

        public final /* synthetic */ Object apply(Object obj) {
            View view = (View) obj;
            akcr.b(view, "contentView");
            AsyncPresenterFragment asyncPresenterFragment = this.a;
            LayoutInflater layoutInflater = this.b;
            ViewGroup viewGroup = asyncPresenterFragment.s;
            if (viewGroup == null) {
                akcr.a("viewContainer");
            }
            asyncPresenterFragment.a(view, layoutInflater, viewGroup);
            return view;
        }
    }

    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class d<T> implements ajfb<ajxm<? extends View, ? extends T>> {
        private /* synthetic */ AsyncPresenterFragment a;

        d(AsyncPresenterFragment asyncPresenterFragment) {
            this.a = asyncPresenterFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = ((ajxm) obj).b;
            AsyncPresenterFragment asyncPresenterFragment = this.a;
            asyncPresenterFragment.t = obj;
            asyncPresenterFragment.a(obj);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(AsyncPresenterFragment.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(AsyncPresenterFragment.class), "schedulerForViewPrefetcher", "getSchedulerForViewPrefetcher()Lio/reactivex/Scheduler;")};
        a aVar = new a();
    }

    public AsyncPresenterFragment() {
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        this.d = obj;
        this.e = ajxh.a(new e(this));
    }

    public abstract int R_();

    public void a(View view) {
        akcr.b(view, "view");
    }

    public void a(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        akcr.b(view, "contentView");
        akcr.b(layoutInflater, "inflater");
        akcr.b(viewGroup, "container");
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        a(view);
        this.b = true;
    }

    public void a(T t) {
    }

    public abstract ajdx<T> b();

    public void b(View view) {
        akcr.b(view, "placeholderView");
    }

    public abstract ide c();

    public final zfw k() {
        return (zfw) this.a.b();
    }

    public void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        this.c = true;
        Object from = LayoutInflater.from(context);
        akcr.a(from, "LayoutInflater.from(context)");
        akcr.b(from, "inflater");
        from = new zmv(k().h(), from, null).b(R_()).b((ajdw) k().h()).a((ajdw) k().l()).f(new b(this, from)).d((ajfb) c.a);
        akcr.a(from, "CompletableViewPrefetche…, it.cause, it.message) }");
        from = ajwc.a((ajeb) from, b()).b((ajdw) k().h()).a((ajdw) k().l()).e((ajfb) new d(this));
        akcr.a(from, "Singles.zip(\n           …senter)\n                }");
        this.d = from;
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.placeholder_fragment, viewGroup, false);
        if (inflate != null) {
            this.s = (ViewGroup) inflate;
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 == null) {
                akcr.a("viewContainer");
            }
            return viewGroup2;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public void onDetach() {
        this.d.dispose();
        this.c = false;
        this.t = null;
        super.onDetach();
    }

    public void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.b) {
            b(view);
        }
    }
}
