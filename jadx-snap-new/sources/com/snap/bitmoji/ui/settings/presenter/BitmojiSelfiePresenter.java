package com.snap.bitmoji.ui.settings.presenter;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.SpanSizeLookup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.common.collect.ImmutableList;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snap.bitmoji.ui.settings.view.SaveBitmojiSelfieButton;
import com.snapchat.android.R;
import defpackage.aabq;
import defpackage.aabr;
import defpackage.aajt;
import defpackage.aaua;
import defpackage.aazk;
import defpackage.aazn;
import defpackage.aazo;
import defpackage.aazp;
import defpackage.abkq;
import defpackage.achb;
import defpackage.afyy;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwl;
import defpackage.ajxw;
import defpackage.ajyu;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.akhw;
import defpackage.akqq;
import defpackage.akxa;
import defpackage.ddd;
import defpackage.ddg;
import defpackage.dgr;
import defpackage.dgt;
import defpackage.dhe;
import defpackage.dhi;
import defpackage.dhj;
import defpackage.dho;
import defpackage.dhq;
import defpackage.dhr;
import defpackage.dib;
import defpackage.gpb;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zmh;
import defpackage.zms;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class BitmojiSelfiePresenter extends zll<dho> implements k {
    final zfw a = zgb.a(ddg.l, "BitmojiSelfiePresenter");
    String b;
    boolean c;
    final ajwl<String> d;
    SaveBitmojiSelfieButton e;
    final Context f;
    final gpb g;
    final aipn<BitmojiFsnHttpInterface> h;
    final aipn<achb<zjm, zjk>> i;
    final aipn<ddd> j;
    private final AtomicBoolean k = new AtomicBoolean();
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final ajei m = new ajei();
    private zms n;
    private zkf o;
    private zmh p;
    private RecyclerView q;
    private final a r;
    private final aipn<dgt> s;

    public static final class a implements OnClickListener {
        final /* synthetic */ BitmojiSelfiePresenter a;

        static final class b<V> implements Callable<T> {
            private /* synthetic */ String a;

            b(String str) {
                this.a = str;
            }

            public final /* synthetic */ Object call() {
                afyy afyy = new afyy();
                afyy.a = this.a;
                return afyy;
            }
        }

        static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                afyy afyy = (afyy) obj;
                akcr.b(afyy, "request");
                return ((BitmojiFsnHttpInterface) this.a.a.h.get()).updateBitmojiSelfie(afyy);
            }
        }

        static final class d implements ajev {
            public static final d a = new d();

            d() {
            }

            public final void run() {
            }
        }

        static final class c extends akcq implements akbl<akxa<akhw>, ajcx> {
            c(BitmojiSelfiePresenter bitmojiSelfiePresenter) {
                super(1, bitmojiSelfiePresenter);
            }

            public final String getName() {
                return "onSaveBitmojiSelfieRequestSuccess";
            }

            public final akej getOwner() {
                return akde.a(BitmojiSelfiePresenter.class);
            }

            public final String getSignature() {
                return "onSaveBitmojiSelfieRequestSuccess(Lretrofit2/adapter/rxjava2/Result;)Lio/reactivex/Completable;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((akxa) obj, "p1");
                BitmojiSelfiePresenter bitmojiSelfiePresenter = (BitmojiSelfiePresenter) this.receiver;
                obj = ajdx.c((Callable) new d(bitmojiSelfiePresenter)).a((ajdw) bitmojiSelfiePresenter.a.h()).e((ajfc) new e(bitmojiSelfiePresenter)).a((ajdw) bitmojiSelfiePresenter.a.l()).b((ajev) new f(bitmojiSelfiePresenter));
                akcr.a(obj, "Single.fromCallable { us… = true\n                }");
                return obj;
            }
        }

        static final class e extends akcq implements akbl<Throwable, ajxw> {
            e(BitmojiSelfiePresenter bitmojiSelfiePresenter) {
                super(1, bitmojiSelfiePresenter);
            }

            public final String getName() {
                return "onSaveBitmojiSelfieRequestFailure";
            }

            public final akej getOwner() {
                return akde.a(BitmojiSelfiePresenter.class);
            }

            public final String getSignature() {
                return "onSaveBitmojiSelfieRequestFailure(Ljava/lang/Throwable;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                BitmojiSelfiePresenter bitmojiSelfiePresenter = (BitmojiSelfiePresenter) this.receiver;
                SaveBitmojiSelfieButton saveBitmojiSelfieButton = bitmojiSelfiePresenter.e;
                if (saveBitmojiSelfieButton == null) {
                    akcr.a("saveButton");
                }
                saveBitmojiSelfieButton.setState(0);
                Toast.makeText(bitmojiSelfiePresenter.f, R.string.bitmoji_error_toast_text, 0).show();
                return ajxw.a;
            }
        }

        a(BitmojiSelfiePresenter bitmojiSelfiePresenter) {
            this.a = bitmojiSelfiePresenter;
        }

        public final void onClick(View view) {
            String str = this.a.b;
            if (str != null) {
                dho dho = (dho) this.a.getTarget();
                if (dho != null) {
                    aaua c = dho.c();
                    if (c != null) {
                        ddd ddd = (ddd) this.a.j.get();
                        Long valueOf = Long.valueOf(Long.parseLong(str));
                        akcr.b(c, "source");
                        aazp aazp = new aazp();
                        aazp.a(c);
                        aazp.a(valueOf);
                        aazp.a(Boolean.TRUE);
                        aazp.a(ddd.a);
                        ((dib) ddd.b.get()).a((aajt) aazp);
                    }
                }
            }
            str = this.a.b;
            if (str != null) {
                BitmojiSelfiePresenter.a(this.a).setState(1);
                zln.bindTo$default(this.a, ajdx.c((Callable) new b(str)).a((ajfc) new a(this)).b((ajdw) this.a.a.g()).a((ajdw) this.a.a.l()).e((ajfc) new dhj(new c(this.a))).a((ajev) d.a, (ajfb) new dhi(new e(this.a))), this.a, null, null, 6, null);
            }
        }
    }

    static final class d<V> implements Callable<T> {
        private /* synthetic */ BitmojiSelfiePresenter a;

        d(BitmojiSelfiePresenter bitmojiSelfiePresenter) {
            this.a = bitmojiSelfiePresenter;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a.g;
        }
    }

    public static final class b extends ItemDecoration {
        b() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            akcr.b(rect, "outRect");
            akcr.b(view, "view");
            akcr.b(recyclerView, "parent");
            akcr.b(state, "state");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition != 0) {
                childAdapterPosition = (childAdapterPosition - 1) % 3;
                int width = (int) (((float) recyclerView.getWidth()) * 0.25f);
                int i = width / 4;
                width /= 3;
                if (childAdapterPosition == 0) {
                    rect.left = i;
                    width -= i;
                } else if (childAdapterPosition == 2) {
                    rect.left = width - i;
                    rect.right = i;
                    rect.bottom = i;
                } else {
                    width /= 2;
                    rect.left = width;
                }
                rect.right = width;
                rect.bottom = i;
            }
        }
    }

    public static final class c extends SpanSizeLookup {
        c() {
        }

        public final int getSpanSize(int i) {
            return i == 0 ? 3 : 1;
        }
    }

    static final class e<T, R> implements ajfc<gpb, ajdb> {
        private /* synthetic */ BitmojiSelfiePresenter a;

        e(BitmojiSelfiePresenter bitmojiSelfiePresenter) {
            this.a = bitmojiSelfiePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gpb gpb = (gpb) obj;
            akcr.b(gpb, "it");
            return gpb.a(null, this.a.b);
        }
    }

    static final class f implements ajev {
        private /* synthetic */ BitmojiSelfiePresenter a;

        f(BitmojiSelfiePresenter bitmojiSelfiePresenter) {
            this.a = bitmojiSelfiePresenter;
        }

        public final void run() {
            BitmojiSelfiePresenter.a(this.a).setState(0);
            ((achb) this.a.i.get()).a(false);
            this.a.c = true;
        }
    }

    static final class g<T> implements ajfb<abkq> {
        private /* synthetic */ BitmojiSelfiePresenter a;

        g(BitmojiSelfiePresenter bitmojiSelfiePresenter) {
            this.a = bitmojiSelfiePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = ((abkq) obj).l;
            if (obj != null) {
                this.a.d.a(obj);
            }
        }
    }

    public BitmojiSelfiePresenter(Context context, zgb zgb, gpb gpb, aipn<BitmojiFsnHttpInterface> aipn, aipn<dgt> aipn2, aipn<achb<zjm, zjk>> aipn3, aipn<ddd> aipn4) {
        akcr.b(context, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(aipn, "bitmojiFsnHttpInterface");
        akcr.b(aipn2, "bitmojiTemplateManager");
        akcr.b(aipn3, "navigationHost");
        akcr.b(aipn4, "bitmojiEventsAnalytics");
        this.f = context;
        this.g = gpb;
        this.h = aipn;
        this.s = aipn2;
        this.i = aipn3;
        this.j = aipn4;
        Object i = ajwl.i("");
        akcr.a(i, "BehaviorSubject.createDefault(\"\")");
        this.d = i;
        this.r = new a(this);
    }

    /* renamed from: a */
    public final void takeTarget(dho dho) {
        akcr.b(dho, "target");
        super.takeTarget(dho);
        dho.getLifecycle().a(this);
        this.m.a(this.g.c().d().d((ajfb) new g(this)));
    }

    public final void dropTarget() {
        dho dho = (dho) getTarget();
        if (dho != null) {
            j lifecycle = dho.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        if (!(this.b == null || this.c)) {
            dho = (dho) getTarget();
            if (dho != null) {
                aaua c = dho.c();
                if (c != null) {
                    ddd ddd = (ddd) this.j.get();
                    akcr.b(c, "source");
                    aazo aazo = new aazo();
                    aazo.a(c);
                    aazo.a(ddd.a);
                    ((dib) ddd.b.get()).a((aajt) aazo);
                }
            }
        }
        this.m.dispose();
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        dho dho = (dho) getTarget();
        if (dho != null) {
            aaua c = dho.c();
            if (c != null) {
                ddd ddd = (ddd) this.j.get();
                akcr.b(c, "source");
                aazk aazk = new aazk();
                aazk.a(aabq.SELFIE);
                aazk.a(c);
                aazk.b(ddd.a);
                ((dib) ddd.b.get()).a((aajt) aazk);
            }
        }
        if (this.k.compareAndSet(false, true)) {
            Object obj = (dho) getTarget();
            if (obj != null) {
                akcr.a(obj, "target");
                Object a = obj.a();
                akcr.a(a, "target.recyclerView");
                this.q = a;
                SaveBitmojiSelfieButton b = obj.b();
                b.setState(0);
                b.setOnClickListener(this.r);
                this.e = b;
                this.o = new zkf();
                zkf zkf = this.o;
                String str = "bus";
                if (zkf == null) {
                    akcr.a(str);
                }
                zkf.a(this);
                this.n = new zms(dgr.class);
                dhr dhr = new dhr();
                gpb gpb = this.g;
                Object obj2 = this.s.get();
                akcr.a(obj2, "bitmojiTemplateManager.get()");
                obj = ImmutableList.of(dhr, new dhq(gpb, (dgt) obj2, this.d));
                akcr.a(obj, "ImmutableList.of(\n      …selectedSelfieIdSubject))");
                zms zms = this.n;
                if (zms == null) {
                    akcr.a("viewFactory");
                }
                zkf zkf2 = this.o;
                if (zkf2 == null) {
                    akcr.a(str);
                }
                zke a2 = zkf2.a();
                akcr.a((Object) a2, "bus.eventDispatcher");
                this.p = new zmh(zms, a2, (ajdw) this.a.b(), (ajdw) this.a.l(), ajyu.k((Iterable) obj), 32);
                RecyclerView recyclerView = this.q;
                str = "recyclerView";
                if (recyclerView == null) {
                    akcr.a(str);
                }
                zmh zmh = this.p;
                String str2 = "adapter";
                if (zmh == null) {
                    akcr.a(str2);
                }
                recyclerView.setAdapter(zmh);
                recyclerView = this.q;
                if (recyclerView == null) {
                    akcr.a(str);
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f, 3);
                gridLayoutManager.setSpanSizeLookup(new c());
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.q;
                if (recyclerView == null) {
                    akcr.a(str);
                }
                recyclerView.addItemDecoration(new b());
                zmh zmh2 = this.p;
                if (zmh2 == null) {
                    akcr.a(str2);
                }
                zln.bindTo$default(this, zmh2.e(), this, null, null, 6, null);
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSelfieItemSelected(dhe dhe) {
        akcr.b(dhe, "bitmojiSelfieItemClickEvent");
        if (this.l.compareAndSet(false, true)) {
            dho dho = (dho) getTarget();
            if (dho != null) {
                aaua c = dho.c();
                if (c != null) {
                    ddd ddd = (ddd) this.j.get();
                    Long valueOf = Long.valueOf(Long.parseLong(dhe.a.b));
                    akcr.b(c, "source");
                    aazn aazn = new aazn();
                    aazn.a(aabr.TAP);
                    aazn.a(c);
                    aazn.a(valueOf);
                    aazn.a(ddd.a);
                    ((dib) ddd.b.get()).a((aajt) aazn);
                }
            }
            if (this.b == null) {
                SaveBitmojiSelfieButton saveBitmojiSelfieButton = this.e;
                if (saveBitmojiSelfieButton == null) {
                    akcr.a("saveButton");
                }
                saveBitmojiSelfieButton.setVisibility(0);
            }
            this.b = dhe.a.b;
            this.d.a(dhe.a.b);
            this.l.set(false);
        }
    }
}
