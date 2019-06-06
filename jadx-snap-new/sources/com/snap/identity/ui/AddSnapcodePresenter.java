package com.snap.identity.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import com.snap.scan.core.SnapScanResult;
import defpackage.aayb;
import defpackage.ajde;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajej;
import defpackage.ajew;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajym;
import defpackage.ajyn;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.eps;
import defpackage.eqj;
import defpackage.eqp;
import defpackage.eqq;
import defpackage.eqr;
import defpackage.erb;
import defpackage.ere;
import defpackage.ftt;
import defpackage.idl;
import defpackage.ifp;
import defpackage.irc;
import defpackage.jjg;
import defpackage.jri;
import defpackage.jta;
import defpackage.jwh;
import defpackage.jwi;
import defpackage.s;
import defpackage.vpc;
import defpackage.vsm;
import defpackage.vso;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmf;
import defpackage.znk;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class AddSnapcodePresenter extends zll<jjg> implements defpackage.k {
    ifp<eps> a;
    final AtomicBoolean b = new AtomicBoolean(false);
    final ArrayList<erb> c = new ArrayList();
    boolean d;
    final vpc e;
    final ajwy<vsm> f;
    private final ajxe g = ajxh.a(new l(this));
    private final ajxe h = ajxh.a(new m(this));
    private zgb i;
    private final eqj j;
    private final ajwy<jwi> k;

    static final class b<V> implements Callable<U> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object call() {
            return new ArrayList();
        }
    }

    public static final class a extends OnScrollListener {
        private /* synthetic */ AddSnapcodePresenter a;

        a(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            akcr.b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (!AddSnapcodePresenter.a(this.a).c() && !this.a.b.get()) {
                LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    if (((GridLayoutManager) layoutManager).findLastVisibleItemPosition() + 50 >= this.a.c.size()) {
                        this.a.b();
                        AddSnapcodePresenter.a(this.a).a();
                    }
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
        }
    }

    static final class c<T1, T2> implements ajew<U, T> {
        private /* synthetic */ AddSnapcodePresenter a;

        c(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            List list = (List) obj;
            obj2 = (List) obj2;
            akcr.a(obj2, "input");
            Iterable<eps> iterable = (Iterable) obj2;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (eps a : iterable) {
                arrayList.add(AddSnapcodePresenter.a(a));
            }
            list.addAll((List) arrayList);
        }
    }

    static final class d<T> implements ajfb<List<erb>> {
        private /* synthetic */ AddSnapcodePresenter a;

        d(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            this.a.c.clear();
            this.a.c.addAll(list);
            this.a.c();
        }
    }

    static final class e<T> implements ajfb<List<? extends eps>> {
        private /* synthetic */ AddSnapcodePresenter a;

        e(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object<eps> obj2 = (List) obj;
            AddSnapcodePresenter addSnapcodePresenter = this.a;
            akcr.a((Object) obj2, "medias");
            if (addSnapcodePresenter.c.isEmpty()) {
                ArrayList arrayList = addSnapcodePresenter.c;
                Iterable<eps> iterable = (Iterable) obj2;
                Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (eps a : iterable) {
                    arrayList2.add(AddSnapcodePresenter.a(a));
                }
                arrayList.addAll((List) arrayList2);
            } else {
                for (eps a2 : obj2) {
                    addSnapcodePresenter.a(a2, false);
                }
            }
            if (addSnapcodePresenter.b.compareAndSet(true, false)) {
                addSnapcodePresenter.c();
            }
        }
    }

    static final class f<T> implements ajfb<eqq<eps>> {
        private /* synthetic */ AddSnapcodePresenter a;

        f(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            eqq eqq = (eqq) obj;
            if (eqq instanceof eqp) {
                this.a.a((eps) ((eqp) eqq).a, true);
                return;
            }
            if (eqq instanceof eqr) {
                AddSnapcodePresenter addSnapcodePresenter = this.a;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                ifp ifp = addSnapcodePresenter.a;
                String str = "paginator";
                if (ifp == null) {
                    akcr.a(str);
                }
                int i2 = ifp.b.get();
                if (i2 >= 0) {
                    while (true) {
                        ifp ifp2 = addSnapcodePresenter.a;
                        if (ifp2 == null) {
                            akcr.a(str);
                        }
                        arrayList.add(ifp2.a(i).b((ajdw) addSnapcodePresenter.a().i()));
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
                zln.bindTo$default(addSnapcodePresenter, ajdx.a(ajde.a((Iterable) arrayList)).a((Callable) b.a, (ajew) new c(addSnapcodePresenter)).a((ajdw) addSnapcodePresenter.a().l()).e((ajfb) new d(addSnapcodePresenter)), addSnapcodePresenter, null, null, 6, null);
            }
        }
    }

    static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "inputStream");
            return BitmapFactory.decodeStream(inputStream);
        }
    }

    static final class h<T, R> implements ajfc<T, R> {
        private /* synthetic */ AddSnapcodePresenter a;

        h(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            akcr.b(bitmap, "bitmap");
            return ((vsm) this.a.f.get()).a(bitmap);
        }
    }

    static final class i<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ AddSnapcodePresenter a;

        i(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SnapScanResult snapScanResult = (SnapScanResult) obj;
            akcr.b(snapScanResult, "it");
            return this.a.e.a(defpackage.vpb.b.a(snapScanResult, aayb.CAMERA_ROLL_SNAPCODE_MANAGER));
        }
    }

    static final class j<T> implements ajfb<vso> {
        private /* synthetic */ AddSnapcodePresenter a;

        j(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.a.d = false;
        }
    }

    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class l extends akcs implements akbk<zfw> {
        private /* synthetic */ AddSnapcodePresenter a;

        l(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(irc.t, "AddSnapcodePresenter");
        }
    }

    static final class m extends akcs implements akbk<OnScrollListener> {
        private /* synthetic */ AddSnapcodePresenter a;

        m(AddSnapcodePresenter addSnapcodePresenter) {
            this.a = addSnapcodePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(AddSnapcodePresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(AddSnapcodePresenter.class), "scrollListener", "getScrollListener()Landroid/support/v7/widget/RecyclerView$OnScrollListener;")};
    }

    public AddSnapcodePresenter(zgb zgb, eqj eqj, ajwy<jwi> ajwy, vpc vpc, ajwy<vsm> ajwy2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(eqj, "provider");
        akcr.b(ajwy, "contentUriResolver");
        akcr.b(vpc, "scanCardsClient");
        akcr.b(ajwy2, "snapScan");
        this.i = zgb;
        this.j = eqj;
        this.k = ajwy;
        this.e = vpc;
        this.f = ajwy2;
    }

    static erb a(eps eps) {
        return new erb(eps, jri.CAMERA_ROLL_IMAGE, ere.IMAGE);
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(eps eps, boolean z) {
        erb a = a(eps);
        int a2 = ajym.a(this.c, a);
        if (a2 < 0) {
            this.c.add((-a2) - 1, a);
        } else if (!((erb) this.c.get(a2)).areContentsTheSame(a)) {
            this.c.set(a2, a);
        } else {
            return;
        }
        if (z) {
            c();
        }
    }

    /* renamed from: a */
    public final void takeTarget(jjg jjg) {
        akcr.b(jjg, "target");
        super.takeTarget(jjg);
        zln zln = this;
        zln.bindTo$default(this, jjg.a(), zln, null, null, 6, null);
        zln.bindTo$default(this, jjg.a().a(this), zln, null, null, 6, null);
        jjg.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.b.compareAndSet(false, true);
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        jjg jjg = (jjg) getTarget();
        if (jjg != null) {
            zmf b = jjg.b();
            if (b != null) {
                b.a(znk.a((List) this.c));
            }
        }
    }

    public final void dropTarget() {
        jjg jjg = (jjg) getTarget();
        if (jjg != null) {
            defpackage.j lifecycle = jjg.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        this.c.clear();
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        RecyclerView recyclerView = null;
        this.a = defpackage.eqm.a.a(this.j, null, null, 0, 31).a(a().f());
        jjg jjg = (jjg) getTarget();
        if (jjg != null) {
            recyclerView = jjg.c();
        }
        if (recyclerView == null) {
            akcr.a();
        }
        recyclerView.addOnScrollListener((OnScrollListener) this.h.b());
        b();
        ifp ifp = this.a;
        if (ifp == null) {
            akcr.a("paginator");
        }
        ajej f = ifp.b().a((ajdw) a().l()).f((ajfb) new e(this));
        zln zln = this;
        zln.bindTo$default(this, f, zln, null, null, 6, null);
        zln.bindTo$default(this, this.j.a((ajdw) a().b()).a((ajdw) a().l()).f((ajfb) new f(this)), zln, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSnapcodeCameraRollSelectionEvent(jta jta) {
        akcr.b(jta, "event");
        if (!this.d) {
            this.d = true;
            zln.bindTo$default(this, ((jwi) this.k.get()).a(new jwh(ftt.b(jta.a.b()), (idl) irc.t.getPage(), 0, 12)).f(g.a).f(new h(this)).b((ajdw) a().f()).a((ajdw) a().l()).d((ajfc) new i(this)).c(1).a((ajfb) new j(this), (ajfb) k.a), this, null, null, 6, null);
        }
    }
}
