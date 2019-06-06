package defpackage;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.brightcove.player.event.Event;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tqj */
public final class tqj implements ajej, zlx {
    public LinearLayoutManager a;
    public final ajwl<Integer> b;
    public final ajwl<tqh> c;
    public final ajwl<Boolean> d;
    public final ajwo<zmy> e;
    public final ajxe f;
    public final ajdp<MotionEvent> g;
    public final ajdp<zmy> h;
    public final ajdp<tqh> i;
    public final ajei j;
    public final Activity k;
    public final toc l;
    public final zfw m;
    public final cjp n;
    public final ajwl<Boolean> o;
    public final ncd p;
    final zmp q;
    public final RecyclerView r;
    private final AtomicBoolean s = new AtomicBoolean(false);
    private final ajwl<MotionEvent> t;
    private final ajxe u;
    private final DisplayMetrics v;

    /* renamed from: tqj$b */
    static final class b extends akcs implements akbk<ajdp<Integer>> {
        private /* synthetic */ tqj a;

        b(tqj tqj) {
            this.a = tqj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.e((ajdt) this.a.q.a());
        }
    }

    /* renamed from: tqj$a */
    static final class a extends akcs implements akbk<ajdp<Boolean>> {
        private /* synthetic */ tqj a;

        /* renamed from: tqj$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Integer num = (Integer) obj;
                akcr.b(num, "it");
                return Boolean.valueOf(num.intValue() == 0);
            }
        }

        /* renamed from: tqj$a$2 */
        static final class 2<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                boolean z = !((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue();
                return Boolean.valueOf(z);
            }
        }

        a(tqj tqj) {
            this.a = tqj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.a((ajdt) this.a.d, (ajdt) this.a.b.p(1.a), (ajex) 2.a).j(ajfu.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tqj.class), "scrollStateChanges", "getScrollStateChanges()Lio/reactivex/Observable;"), new akdc(akde.a(tqj.class), "isFilterSectionUpdateEnabled", "isFilterSectionUpdateEnabled()Lio/reactivex/Observable;")};
    }

    public tqj(Activity activity, toc toc, zfw zfw, DisplayMetrics displayMetrics, cjp cjp, ajwl<Boolean> ajwl, ncd ncd, zmp zmp, RecyclerView recyclerView) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(toc, "previewFeature");
        akcr.b(zfw, "schedulers");
        akcr.b(displayMetrics, "displayMetrics");
        akcr.b(cjp, "adInfoNavigator");
        akcr.b(ajwl, "locationEnabledSubject");
        akcr.b(ncd, "locationPermissionsRequester");
        akcr.b(zmp, "scrollListener");
        akcr.b(recyclerView, "recyclerView");
        this.k = activity;
        this.l = toc;
        this.m = zfw;
        this.v = displayMetrics;
        this.n = cjp;
        this.o = ajwl;
        this.p = ncd;
        this.q = zmp;
        this.r = recyclerView;
        Object i = ajwl.i(Integer.valueOf(0));
        akcr.a(i, "BehaviorSubject.createDe…erView.SCROLL_STATE_IDLE)");
        this.b = i;
        i = new ajwl();
        akcr.a(i, "BehaviorSubject.create<MotionEvent>()");
        this.t = i;
        i = new ajwl();
        akcr.a(i, "BehaviorSubject.create<EditingState>()");
        this.c = i;
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, "BehaviorSubject.createDefault(false)");
        this.d = i;
        i = new ajwo();
        akcr.a(i, "PublishSubject.create<AdapterViewModel>()");
        this.e = i;
        this.u = ajxh.a(new b(this));
        this.f = ajxh.a(new a(this));
        this.g = this.t;
        i = this.e.j(ajfu.a);
        akcr.a(i, "currentViewModelSubject.distinctUntilChanged()");
        this.h = i;
        this.i = this.c;
        this.j = new ajei();
    }

    public final ajdp<Integer> a() {
        return (ajdp) this.u.b();
    }

    public final void a(int i) {
        this.b.a(Integer.valueOf(i));
    }

    public final void a(MotionEvent motionEvent) {
        akcr.b(motionEvent, "state");
        this.t.a((Object) motionEvent);
    }

    public final void dispose() {
        if (this.s.compareAndSet(false, true)) {
            this.j.dispose();
        }
    }

    /* JADX WARNING: Missing block: B:20:0x0060, code skipped:
            if (defpackage.akcr.a(r2.r, r3.r) != false) goto L_0x0065;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0065;
    L_0x0002:
        r0 = r3 instanceof defpackage.tqj;
        if (r0 == 0) goto L_0x0063;
    L_0x0006:
        r3 = (defpackage.tqj) r3;
        r0 = r2.k;
        r1 = r3.k;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0012:
        r0 = r2.l;
        r1 = r3.l;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x001c:
        r0 = r2.m;
        r1 = r3.m;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0026:
        r0 = r2.v;
        r1 = r3.v;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0030:
        r0 = r2.n;
        r1 = r3.n;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x003a:
        r0 = r2.o;
        r1 = r3.o;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0044:
        r0 = r2.p;
        r1 = r3.p;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x004e:
        r0 = r2.q;
        r1 = r3.q;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0063;
    L_0x0058:
        r0 = r2.r;
        r3 = r3.r;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0065;
    L_0x0063:
        r3 = 0;
        return r3;
    L_0x0065:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Activity activity = this.k;
        int i = 0;
        int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
        toc toc = this.l;
        hashCode = (hashCode + (toc != null ? toc.hashCode() : 0)) * 31;
        zfw zfw = this.m;
        hashCode = (hashCode + (zfw != null ? zfw.hashCode() : 0)) * 31;
        DisplayMetrics displayMetrics = this.v;
        hashCode = (hashCode + (displayMetrics != null ? displayMetrics.hashCode() : 0)) * 31;
        cjp cjp = this.n;
        hashCode = (hashCode + (cjp != null ? cjp.hashCode() : 0)) * 31;
        ajwl ajwl = this.o;
        hashCode = (hashCode + (ajwl != null ? ajwl.hashCode() : 0)) * 31;
        ncd ncd = this.p;
        hashCode = (hashCode + (ncd != null ? ncd.hashCode() : 0)) * 31;
        zmp zmp = this.q;
        hashCode = (hashCode + (zmp != null ? zmp.hashCode() : 0)) * 31;
        RecyclerView recyclerView = this.r;
        if (recyclerView != null) {
            i = recyclerView.hashCode();
        }
        return hashCode + i;
    }

    public final boolean isDisposed() {
        return this.s.get();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FiltersCarouselBindingContext(activity=");
        stringBuilder.append(this.k);
        stringBuilder.append(", previewFeature=");
        stringBuilder.append(this.l);
        stringBuilder.append(", schedulers=");
        stringBuilder.append(this.m);
        stringBuilder.append(", displayMetrics=");
        stringBuilder.append(this.v);
        stringBuilder.append(", adInfoNavigator=");
        stringBuilder.append(this.n);
        stringBuilder.append(", locationEnabledSubject=");
        stringBuilder.append(this.o);
        stringBuilder.append(", locationPermissionsRequester=");
        stringBuilder.append(this.p);
        stringBuilder.append(", scrollListener=");
        stringBuilder.append(this.q);
        stringBuilder.append(", recyclerView=");
        stringBuilder.append(this.r);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
