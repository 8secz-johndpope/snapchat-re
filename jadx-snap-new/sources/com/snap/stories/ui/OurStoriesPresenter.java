package com.snap.stories.ui;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StorySnapRecordBase;
import com.snapchat.android.R;
import defpackage.aedh;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwl;
import defpackage.ajwm;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.gpb;
import defpackage.ihi;
import defpackage.s;
import defpackage.yhx;
import defpackage.yhy;
import defpackage.yik;
import defpackage.yik.o;
import defpackage.yik.p;
import defpackage.yit;
import defpackage.yph;
import defpackage.ypj;
import defpackage.ypq;
import defpackage.ypu;
import defpackage.ypx;
import defpackage.ypy;
import defpackage.yrj;
import defpackage.yrn;
import defpackage.yrp;
import defpackage.yrz;
import defpackage.ysa;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zlx;
import defpackage.zmh;
import defpackage.zms;
import defpackage.znh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public class OurStoriesPresenter extends zll<ypj> implements defpackage.k {
    final zfw a = zgb.a(yhy.j.callsite("OurStoriesPresenter"));
    final ajwm b;
    final ajwl<Boolean> c;
    final ajwl<b> d;
    final yhx e;
    private final AtomicBoolean f = new AtomicBoolean();
    private zlx g;
    private zms h;
    private zkf i;
    private zmh j;
    private final ajwl<Boolean> k;
    private long l;
    private final c m;
    private final ajxe n;
    private final ajxe o;
    private final yik p;
    private final gpb q;
    private final ihi r;
    private final ypu s;
    private final ypy t;
    private final ypx u;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public enum b {
        ERROR,
        EMPTY,
        LOADED
    }

    static final class f implements OnTouchListener {
        public static final f a = new f();

        f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    public static final class c extends AdapterDataObserver {
        private /* synthetic */ OurStoriesPresenter a;

        c(OurStoriesPresenter ourStoriesPresenter) {
            this.a = ourStoriesPresenter;
        }

        public final void onItemRangeInserted(int i, int i2) {
            this.a.b.i();
        }
    }

    static final class g<T> implements ajfb<ajej> {
        private /* synthetic */ OurStoriesPresenter a;

        g(OurStoriesPresenter ourStoriesPresenter) {
            this.a = ourStoriesPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c.a(Boolean.TRUE);
        }
    }

    static final class h<T, R> implements ajfc<Throwable, Boolean> {
        private /* synthetic */ OurStoriesPresenter a;

        h(OurStoriesPresenter ourStoriesPresenter) {
            this.a = ourStoriesPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            this.a.d.a(b.ERROR);
            return Boolean.FALSE;
        }
    }

    static final class i<T> implements ajfb<Boolean> {
        private /* synthetic */ OurStoriesPresenter a;

        i(OurStoriesPresenter ourStoriesPresenter) {
            this.a = ourStoriesPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            this.a.c.a(Boolean.FALSE);
            if (((b) this.a.d.p()) != b.ERROR) {
                akcr.a(obj, "hasSyncedData");
                this.a.d.a(obj.booleanValue() ? b.LOADED : b.EMPTY);
            }
        }
    }

    static final class l<T> implements ajfb<b> {
        private /* synthetic */ OurStoriesPresenter a;
        private /* synthetic */ ypj b;

        l(OurStoriesPresenter ourStoriesPresenter, ypj ypj) {
            this.a = ourStoriesPresenter;
            this.b = ypj;
        }

        public final /* synthetic */ void accept(Object obj) {
            OurStoriesPresenter.a(this.a);
        }
    }

    static final class m<T> implements ajfb<Boolean> {
        private /* synthetic */ OurStoriesPresenter a;
        private /* synthetic */ ypj b;

        m(OurStoriesPresenter ourStoriesPresenter, ypj ypj) {
            this.a = ourStoriesPresenter;
            this.b = ypj;
        }

        public final /* synthetic */ void accept(Object obj) {
            OurStoriesPresenter.a(this.a);
        }
    }

    static final class d extends akcs implements akbl<Long, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<Throwable, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbk<TextView> {
        private /* synthetic */ OurStoriesPresenter a;

        j(OurStoriesPresenter ourStoriesPresenter) {
            this.a = ourStoriesPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ypj ypj = (ypj) this.a.getTarget();
            if (ypj != null) {
                ViewGroup b = ypj.b();
                if (b != null) {
                    return (TextView) b.findViewById(R.id.our_stories_status_message);
                }
            }
            return null;
        }
    }

    static final class k extends akcs implements akbk<ajdp<znh<StoryManagementStorySnapRecord>>> {
        final /* synthetic */ OurStoriesPresenter a;

        /* renamed from: com.snap.stories.ui.OurStoriesPresenter$k$1 */
        static final class AnonymousClass1<T> implements ajfb<znh<StoryManagementStorySnapRecord>> {
            private /* synthetic */ k a;

            AnonymousClass1(k kVar) {
                this.a = kVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                znh znh = (znh) obj;
                if (((b) this.a.a.d.p()) != b.ERROR) {
                    this.a.a.d.a(znh.a() > 0 ? b.LOADED : b.EMPTY);
                }
            }
        }

        /* renamed from: com.snap.stories.ui.OurStoriesPresenter$k$2 */
        static final class AnonymousClass2<T> implements ajfb<Throwable> {
            private /* synthetic */ k a;

            AnonymousClass2(k kVar) {
                this.a = kVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.d.a(b.ERROR);
            }
        }

        k(OurStoriesPresenter ourStoriesPresenter) {
            this.a = ourStoriesPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.e.c().a((ajdw) this.a.a.l()).b((ajfb) new AnonymousClass1(this)).c((ajfb) new AnonymousClass2(this));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(OurStoriesPresenter.class), "statusMsgTextView", "getStatusMsgTextView()Landroid/widget/TextView;"), new akdc(akde.a(OurStoriesPresenter.class), "storySnapsList", "getStorySnapsList()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public OurStoriesPresenter(zgb zgb, yik yik, yhx yhx, gpb gpb, ihi ihi, ypu ypu, ypy ypy, ypx ypx) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(yik, "storiesNetworkApi");
        akcr.b(yhx, "storiesDataProvider");
        akcr.b(gpb, "userAuth");
        akcr.b(ihi, "dateTimeUtils");
        akcr.b(ypu, "storySaver");
        akcr.b(ypy, "storySnapOperaLauncher");
        akcr.b(ypx, "storySnapDeleter");
        this.p = yik;
        this.e = yhx;
        this.q = gpb;
        this.r = ihi;
        this.s = ypu;
        this.t = ypy;
        this.u = ypx;
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        this.b = ajwm;
        ajwm = ajwl.i(Boolean.FALSE);
        String str = "BehaviorSubject.createDefault(false)";
        akcr.a(ajwm, str);
        this.k = ajwm;
        ajwm = ajwl.i(Boolean.FALSE);
        akcr.a(ajwm, str);
        this.c = ajwm;
        ajwm = ajwl.i(b.EMPTY);
        akcr.a(ajwm, "BehaviorSubject.createDefault(DataState.EMPTY)");
        this.d = ajwm;
        this.m = new c(this);
        this.n = ajxh.a(new j(this));
        this.o = ajxh.a(new k(this));
    }

    /* renamed from: a */
    public final void takeTarget(ypj ypj) {
        ypj ypj2 = ypj;
        akcr.b(ypj2, "target");
        super.takeTarget(ypj);
        this.i = (zkf) zln.bindTo$default(this, new zkf(), this, null, null, 6, null);
        zkf zkf = this.i;
        String str = "bus";
        if (zkf == null) {
            akcr.a(str);
        }
        zln.bindTo$default(this, zkf.a(this), this, null, null, 6, null);
        zln.bindTo$default(this, this.d.b((ajdw) this.a.l()).f((ajfb) new l(this, ypj2)), this, null, null, 6, null);
        zln.bindTo$default(this, this.c.b((ajdw) this.a.l()).f((ajfb) new m(this, ypj2)), this, null, null, 6, null);
        List arrayList = new ArrayList();
        arrayList.add(new ysa(this.c));
        Object obj = (ajdp) this.o.b();
        akcr.a(obj, "storySnapsList");
        arrayList.add(new yrz(obj, this.b, this.r));
        this.g = (zlx) zln.bindTo$default(this, new ypq(this.a, this.q), this, null, null, 6, null);
        zlx zlx = this.g;
        if (zlx == null) {
            akcr.a("bindingContext");
        }
        this.h = new zms(zlx, yph.class);
        zms zms = this.h;
        if (zms == null) {
            akcr.a("viewFactory");
        }
        zkf zkf2 = this.i;
        if (zkf2 == null) {
            akcr.a(str);
        }
        zke a = zkf2.a();
        akcr.a((Object) a, "bus.eventDispatcher");
        this.j = new zmh(zms, a, (ajdw) this.a.b(), (ajdw) this.a.l(), arrayList, 32);
        zmh zmh = this.j;
        str = "postedSnapAdapter";
        if (zmh == null) {
            akcr.a(str);
        }
        zln.bindTo$default(this, zmh.e(), this, null, null, 6, null);
        zmh = this.j;
        if (zmh == null) {
            akcr.a(str);
        }
        zmh.registerAdapterDataObserver(this.m);
        yik yik = this.p;
        Object d = yik.c().fetchOurStories(new aedh()).b((ajdw) yik.d.g()).a((ajfc) new o(yik)).d((ajfb) p.a);
        akcr.a(d, "storiesHttpInterface.fet…fetching Our Stories.\") }");
        zln.bindTo$default(this, d.a((ajdw) this.a.l()).b((ajfb) new g(this)).g(new h(this)).e((ajfb) new i(this)), this, null, null, 6, null);
        ypj.getLifecycle().a(this);
        this.l = SystemClock.elapsedRealtime();
    }

    public void dropTarget() {
        ypj ypj = (ypj) getTarget();
        if (ypj != null) {
            defpackage.j lifecycle = ypj.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        if (this.j != null) {
            zmh zmh = this.j;
            if (zmh == null) {
                akcr.a("postedSnapAdapter");
            }
            zmh.unregisterAdapterDataObserver(this.m);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final ajej onClickDeleteSnap(yrj yrj) {
        akcr.b(yrj, "event");
        return zln.bindTo$default(this, yit.a(this.u.a((StorySnapRecordBase) yrj.a, yhy.c), (akbl) e.a, (akbl) d.a), this, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final ajej onClickPostedSnap(yrp yrp) {
        akcr.b(yrp, "event");
        return zln.bindTo$default(this, this.t.a(yrp), this, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClickSaveSnap(yrn yrn) {
        akcr.b(yrn, "event");
        this.s.a((StorySnapRecordBase) yrn.a, yhy.d);
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        if (this.f.compareAndSet(false, true)) {
            ypj ypj = (ypj) getTarget();
            if (ypj != null) {
                RecyclerView a = ypj.a();
                if (a != null) {
                    ypj ypj2 = (ypj) getTarget();
                    Context d = ypj2 != null ? ypj2.d() : null;
                    if (d != null) {
                        a.setLayoutManager(new LinearLayoutManager(d, 1, false));
                    }
                    zmh zmh = this.j;
                    if (zmh == null) {
                        akcr.a("postedSnapAdapter");
                    }
                    a.setAdapter(zmh);
                    a.setOnTouchListener(f.a);
                    a.setItemAnimator(null);
                    zln.bindTo$default(this, this.u, this, null, null, 6, null);
                }
            }
        }
    }
}
