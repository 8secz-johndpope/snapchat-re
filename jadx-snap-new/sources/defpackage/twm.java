package defpackage;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.ui.view.ViewFinder;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState;
import com.snap.ui.view.multisnap.MultiSnapThumbnailViewModel;
import com.snap.ui.view.multisnap.MultiSnapThumbnailViewModelKt;
import com.snap.ui.view.multisnap.ThumbnailDeletedEvent;
import com.snap.ui.view.multisnap.ThumbnailInteractionEvent;
import com.snap.ui.view.multisnap.ThumbnailRecyclerView;
import com.snap.ui.view.multisnap.ThumbnailSplitEvent;
import com.snap.ui.view.multisnap.ThumbnailTouchEvent;
import com.snap.ui.view.multisnap.ThumbnailTrimmedEvent;
import com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType;
import com.snap.ui.view.multisnap.TrimmingListener;
import com.snapchat.android.R;
import defpackage.admm.a;
import defpackage.tyb.f;
import defpackage.tyb.g;
import defpackage.tyb.h;
import defpackage.tyb.i;
import defpackage.tyb.j;
import defpackage.tyb.o;
import defpackage.tyb.p;
import defpackage.tzk.b;
import defpackage.tzk.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: twm */
public final class twm implements toh, zgj {
    public static final String s = s;
    private final ajws<ThumbnailSplitEvent> A;
    private ajej B;
    private final be C;
    private final zgb D;
    private final ViewFinder E;
    private final zkf F;
    private final tvd G;
    private final toi H;
    private final jwa I;
    private final ajdp<tpd> J;
    private final ajdp<tpk> K;
    private final ajde<tps> L;
    private final tpv M;
    private final achb<zjm, zjk> N;
    private final tww O;
    private final ajdp<MotionEvent> P;
    private final tpj Q;
    final ajwl<List<twr>> a;
    final ajws<ThumbnailInteractionEvent> b;
    final Semaphore c;
    final ajws<ajxm<jwu, String>> d;
    boolean e;
    final ajei f;
    twq g;
    final toc h;
    final twz i;
    final ajdv<uaq> j;
    final ajdv<tzk> k;
    final ajdv<Boolean> l;
    final aipn<txi> m;
    final tyb n;
    final twj o;
    final twt p;
    final ajwy<twd> q;
    final tzg r;
    private final ajxe t = ajxh.a(new b(this));
    private final ajxe u = ajxh.a(new s(this));
    private final ajxe v;
    private final ajxe w;
    private final ajxe x;
    private final ajxe y;
    private final tvu z;

    /* renamed from: twm$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static int a(int i, txi txi) {
            akcr.b(txi, "mediaPlayer");
            try {
                acay acay = txi.j;
                List<Number> v = acay != null ? acay.v() : null;
                if (v == null) {
                    return i;
                }
                if (v.isEmpty()) {
                    return i;
                }
                akcr.b(v, "keyFrameTimesUs");
                TreeSet treeSet = new TreeSet();
                for (Number longValue : v) {
                    treeSet.add(Integer.valueOf((int) (longValue.longValue() / 1000)));
                }
                Integer num = (Integer) treeSet.ceiling(Integer.valueOf(i));
                Integer num2 = (Integer) treeSet.floor(Integer.valueOf(i));
                if (num == null) {
                    return i;
                }
                if (num2 != null && Math.abs(i - num2.intValue()) < Math.abs(i - num.intValue())) {
                    num = num2;
                }
                return num.intValue();
            } catch (IllegalStateException unused) {
                return i;
            }
        }
    }

    /* renamed from: twm$au */
    public static final class au extends SimpleOnGestureListener {
        private /* synthetic */ twm a;

        au(twm twm) {
            this.a = twm;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            twm twm = this.a;
            Object obj = (List) twm.a.p();
            if (obj != null) {
                akcr.a(obj, "it");
                Iterable<twr> iterable = (Iterable) obj;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (twr twr : iterable) {
                    arrayList.add(new twr(twr, null, null, null, null, twm.n.f() != 1 ? ThumbnailViewState.NEUTRAL : ThumbnailViewState.SINGLE_DEMOTED, null, null, null, null, false, false, false, false, null, 32734));
                }
                twm.a((List) arrayList);
            }
            twm.n.j();
            twm.e = false;
            twm.r.b(twm.s);
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: twm$bf */
    static final class bf<V> implements Callable<T> {
        private /* synthetic */ twm a;
        private /* synthetic */ List b;
        private /* synthetic */ String c;

        bf(twm twm, List list, String str) {
            this.a = twm;
            this.b = list;
            this.c = str;
        }

        public final /* synthetic */ Object call() {
            Collection arrayList = new ArrayList();
            for (Object next : this.b) {
                if ((1 ^ akcr.a(((twr) next).getThumbnailKey(), this.c)) != 0) {
                    arrayList.add(next);
                }
            }
            Iterable<twr> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (twr twr : iterable) {
                twr twr2 = new twr(twr, null, null, null, null, ThumbnailViewState.NEUTRAL, null, null, null, null, this.a.n.f() > 1, false, false, false, null, 31710);
                twr2.addTo(this.a.f);
                arrayList2.add(twr2);
            }
            return (List) arrayList2;
        }
    }

    /* renamed from: twm$bg */
    static final class bg<V> implements Callable<T> {
        private /* synthetic */ twm a;
        private /* synthetic */ String b;
        private /* synthetic */ Optional c;
        private /* synthetic */ abyy d;

        bg(twm twm, String str, Optional optional, abyy abyy) {
            this.a = twm;
            this.b = str;
            this.c = optional;
            this.d = abyy;
        }

        private Optional<twu> a() {
            kaz kaz;
            try {
                if (this.a.c.tryAcquire(TelemetryConstants.FLUSH_DELAY_MS, TimeUnit.MILLISECONDS)) {
                    twt twt = this.a.p;
                    abyy abyy = this.d;
                    kaz kaz2 = (kaz) this.c.orNull();
                    akcr.b(abyy, "edits");
                    twu twu = new twu(abyy, kaz2, (jwa) twt.a.b(), twt.c, twt.d, twt.e, twt.f, twt.g, (zfw) twt.b.b());
                    ajvv.a((ajej) twu, this.a.f);
                    Optional of = Optional.of(twu);
                    kaz = (kaz) this.c.orNull();
                    if (kaz != null) {
                        kaz.dispose();
                    }
                    return of;
                }
                Optional<twu> absent = Optional.absent();
                return absent;
            } finally {
                kaz = (kaz) this.c.orNull();
                if (kaz != null) {
                    kaz.dispose();
                }
            }
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: twm$aa */
    static final class aa<T> implements ajfb<Throwable> {
        private /* synthetic */ twm a;
        private /* synthetic */ String b;

        aa(twm twm, String str) {
            this.a = twm;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c.release();
        }
    }

    /* renamed from: twm$ab */
    static final class ab<T> implements ajfl<List<ajxm<? extends jwu, ? extends String>>> {
        public static final ab a = new ab();

        ab() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: twm$ac */
    static final class ac<T, R> implements ajfc<T, R> {
        private /* synthetic */ twm a;

        ac(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<ajxm> list = (List) obj;
            akcr.b(list, "it");
            if (this.a.c.tryAcquire(TelemetryConstants.FLUSH_DELAY_MS, TimeUnit.MILLISECONDS)) {
                return list;
            }
            for (ajxm ajxm : list) {
                ((jwu) ajxm.a).a.dispose();
            }
            return ajyw.a;
        }
    }

    /* renamed from: twm$ad */
    static final class ad<T> implements ajfl<List<? extends ajxm<? extends jwu, ? extends String>>> {
        public static final ad a = new ad();

        ad() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: twm$ae */
    static final class ae<T1, T2, R> implements ajex<List<? extends ajxm<? extends jwu, ? extends String>>, List<? extends twr>, ajxm<? extends List<? extends ajxm<? extends jwu, ? extends String>>, ? extends List<? extends twr>>> {
        public static final ae a = new ae();

        ae() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            akcr.b(list, "t1");
            akcr.b(list2, "t2");
            return ajxs.a(list, list2);
        }
    }

    /* renamed from: twm$af */
    static final class af<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ twm a;

        af(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            final Object obj2 = (List) ajxm.a;
            final List list = (List) ajxm.b;
            return ajdp.b(obj2).p(new ajfc<T, R>(this) {
                private /* synthetic */ af a;

                private List<twr> a(List<ajxm<jwu, String>> list) {
                    List<ajxm<jwu, String>> list2 = list;
                    akcr.b(list2, "newThumbnails");
                    try {
                        twm twm = this.a.a;
                        Iterable<twr> iterable = list;
                        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                        for (twr twr : iterable) {
                            Collection arrayList2 = new ArrayList();
                            for (Object next : list2) {
                                if (akcr.a((String) ((ajxm) next).b, twr.getThumbnailKey())) {
                                    arrayList2.add(next);
                                }
                            }
                            Iterable<ajxm> iterable2 = (List) arrayList2;
                            Collection arrayList3 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                            for (ajxm ajxm : iterable2) {
                                arrayList3.add(ajxs.a(((jwu) ajxm.a).a, Integer.valueOf(((jwu) ajxm.a).b)));
                            }
                            arrayList.add(ajxs.a(twr, (List) arrayList3));
                        }
                        List list3 = (List) arrayList;
                        Iterable<ajxm> iterable3 = list3;
                        Collection arrayList4 = new ArrayList(ajyn.a((Iterable) iterable3, 10));
                        for (ajxm ajxm2 : iterable3) {
                            Object obj;
                            twr twr2 = (twr) ajxm2.a;
                            List list4 = (List) ajxm2.b;
                            if ((list4.isEmpty() ^ 1) != 0) {
                                twr twr3 = new twr(twr2, null, twr2.getBaseBitmaps(), null, list4, null, null, null, null, null, false, false, false, false, null, 32746);
                                twr3.addTo(twm.f);
                            } else {
                                obj = twr2;
                            }
                            arrayList4.add(obj);
                        }
                        List list5 = (List) arrayList4;
                        Iterable<ajxm> iterable4 = list3;
                        Collection arrayList5 = new ArrayList(ajyn.a((Iterable) iterable4, 10));
                        for (ajxm ajxm3 : iterable4) {
                            twr twr4 = (twr) ajxm3.a;
                            if ((((List) ajxm3.b).isEmpty() ^ 1) != 0) {
                                twr4.dispose();
                            }
                            arrayList5.add(ajxw.a);
                        }
                        return list5;
                    } catch (Exception unused) {
                        return ajyw.a;
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return a((List) obj);
                }
            }).a((ajev) new ajev() {
                public final void run() {
                    for (ajxm ajxm : obj2) {
                        ((jwu) ajxm.a).a.dispose();
                    }
                }
            });
        }
    }

    /* renamed from: twm$ag */
    static final class ag implements ajev {
        private /* synthetic */ twm a;

        ag(twm twm) {
            this.a = twm;
        }

        public final void run() {
            if (this.a.f.isDisposed()) {
                this.a.e();
            }
        }
    }

    /* renamed from: twm$ah */
    static final class ah<T> implements ajfb<List<? extends twr>> {
        private /* synthetic */ twm a;

        ah(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            try {
                String str = "newModels";
                if (!this.a.f.isDisposed()) {
                    akcr.a(obj, str);
                    if ((((Collection) obj).isEmpty() ^ 1) != 0) {
                        List list = (List) this.a.a.p();
                        if (list != null) {
                            ArrayList arrayList = new ArrayList(list);
                            arrayList.removeAll((Collection) obj);
                            tws.a(arrayList);
                        }
                        this.a.a.a(obj);
                        this.a.c.release();
                    }
                }
                akcr.a(obj, str);
                tws.a(obj);
                this.a.c.release();
            } catch (Throwable th) {
                this.a.c.release();
            }
        }
    }

    /* renamed from: twm$ai */
    static final class ai<T> implements ajfb<Throwable> {
        private /* synthetic */ twm a;

        ai(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c.release();
        }
    }

    /* renamed from: twm$aj */
    static final class aj<T, R> implements ajfc<T, R> {
        private /* synthetic */ twm a;
        private /* synthetic */ List b;
        private /* synthetic */ String c;
        private /* synthetic */ int d;
        private /* synthetic */ ajdv e;

        aj(twm twm, List list, String str, int i, ajdv ajdv) {
            this.a = twm;
            this.b = list;
            this.c = str;
            this.d = i;
            this.e = ajdv;
        }

        private List<twr> a(ajxm<String, String> ajxm) {
            twr twr;
            ajxm<String, String> ajxm2 = ajxm;
            akcr.b(ajxm2, "<name for destructuring parameter 0>");
            String str = (String) ajxm2.a;
            String str2 = (String) ajxm2.b;
            Collection arrayList = new ArrayList();
            for (twr twr2 : this.b) {
                List a;
                Collection collection;
                if ((akcr.a(twr2.getThumbnailKey(), this.c) ^ 1) != 0) {
                    a = ajyl.a(new twr(twr2, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 32766));
                    collection = arrayList;
                } else {
                    NavigableMap copyAtLeastOne$default = MultiSnapThumbnailViewModelKt.copyAtLeastOne$default(twr2.getBaseBitmaps(), null, Integer.valueOf(this.d), null, 5, null);
                    NavigableMap copyAtLeastOne$default2 = MultiSnapThumbnailViewModelKt.copyAtLeastOne$default(twr2.getBaseBitmaps(), Integer.valueOf(this.d), null, null, 6, null);
                    a = 2;
                    try {
                        twr[] twrArr = new twr[2];
                        twr twr3 = twr;
                        twr[] twrArr2 = twrArr;
                        collection = arrayList;
                        twr = new twr(twr2, str, copyAtLeastOne$default, null, null, ThumbnailViewState.DEMOTED, Integer.valueOf(this.d), str, null, null, true, false, false, true, this.e, 6424);
                        twr twr4 = twr3;
                        twr4.addTo(this.a.f);
                        twrArr2[0] = twr4;
                        twr twr5 = new twr(twr2, null, copyAtLeastOne$default2, null, null, ThumbnailViewState.SELECTED, null, null, null, null, true, false, false, false, null, 31450);
                        twr5.addTo(this.a.f);
                        twrArr2[1] = twr5;
                        a = ajym.b((Object[]) twrArr2);
                    } finally {
                        MultiSnapThumbnailViewModelKt.dispose(copyAtLeastOne$default);
                        MultiSnapThumbnailViewModelKt.dispose(copyAtLeastOne$default2);
                    }
                }
                Collection collection2 = collection;
                ajyr.a(collection2, (Iterable) a);
                arrayList = collection2;
            }
            List list = (List) arrayList;
            for (twr twr6 : this.b) {
                if (akcr.a(twr6.getThumbnailKey(), this.c)) {
                    twr6.dispose();
                }
            }
            this.a.o.a(str2);
            for (Object next : list) {
                if (akcr.a(((twr) next).getThumbnailKey(), this.c)) {
                    break;
                }
            }
            Object next2 = null;
            twr twr7 = (twr) next2;
            if (twr7 != null) {
                this.a.a(twr7);
            }
            return list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((ajxm) obj);
        }
    }

    /* renamed from: twm$ak */
    static final class ak<T, R> implements ajfc<Throwable, List<? extends twr>> {
        private /* synthetic */ twm a;

        ak(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            ((twd) this.a.y.b()).c("Failed to update view models after splitting");
            return ajyw.a;
        }
    }

    /* renamed from: twm$al */
    static final class al<T> implements ajfb<tpd> {
        private /* synthetic */ twm a;

        al(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            tpd tpd = (tpd) obj;
            if (tpd != null) {
                int i = twn.a[tpd.ordinal()];
                if (i == 1 || i == 2) {
                    twm.a(this.a).c.setVisibility(8);
                    return;
                }
                if (i == 3) {
                    twm.a(this.a).c.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: twm$am */
    static final class am<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ twm a;

        /* renamed from: twm$am$1 */
        static final class 1<T, R> implements ajfc<Object[], R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "items");
                List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
                if (asList == null) {
                    throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if (asList != null) {
                    return asList;
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.collections.List<com.snap.media.api.manager.MediaPackageReader>");
                }
            }
        }

        am(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<abyi> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abyi a : iterable) {
                arrayList.add(this.a.i.a(a));
            }
            return ajdx.a((Iterable) (List) arrayList, (ajfc) 1.a);
        }
    }

    /* renamed from: twm$an */
    static final class an<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ twm a;

        /* renamed from: twm$an$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ an a;

            /* renamed from: twm$an$1$1 */
            static final class 1<T, R> implements ajfc<T, K> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    jwu jwu = (jwu) obj;
                    akcr.b(jwu, "it");
                    return Integer.valueOf(jwu.b);
                }
            }

            /* renamed from: twm$an$1$2 */
            static final class 2<T, R> implements ajfc<T, V> {
                public static final 2 a = new 2();

                2() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    jwu jwu = (jwu) obj;
                    akcr.b(jwu, "it");
                    return jwu.a;
                }
            }

            1(an anVar) {
                this.a = anVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final odx odx = (odx) obj;
                akcr.b(odx, "mediaReader");
                Map i = odx.i();
                Object obj2 = (i == null || i.isEmpty()) ? 1 : null;
                if (obj2 == null) {
                    return ajdx.b(ajxs.a(odx, new ConcurrentSkipListMap(odx.i())));
                }
                Long l = odx.b().e.u;
                long longValue = l != null ? l.longValue() : 0;
                ofa d = this.a.a.d();
                idd a = this.a.a.a();
                abyi b = odx.b();
                akdz akeb = new akeb(0, longValue);
                akcr.b(akeb, "receiver$0");
                longValue = TelemetryConstants.FLUSH_DELAY_MS;
                akee.a(true, Long.valueOf(TelemetryConstants.FLUSH_DELAY_MS));
                long j = akeb.a;
                long j2 = akeb.b;
                if (akeb.c <= 0) {
                    longValue = -10000;
                }
                return d.a(a, b, ajyu.k(new akdz(j, j2, longValue)), twm.a(this.a.a).a(), this.a.a.f, a.HARDWARE_FIRST).a((ajfc) 1.a, (ajfc) 2.a).f(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        Map map = (Map) obj;
                        akcr.b(map, "it");
                        return ajxs.a(odx, new ConcurrentSkipListMap(map));
                    }
                });
            }
        }

        an(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            if ((list.isEmpty() ^ 1) != 0) {
                return ajdp.b((Iterable) list).g((ajfc) new 1(this)).a(16);
            }
            throw new IllegalStateException("MediaPackageReader list can't be empty".toString());
        }
    }

    /* renamed from: twm$ao */
    static final class ao<T, R> implements ajfc<T, R> {
        private /* synthetic */ twm a;

        ao(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "mediaReaderAndThumbnailPairs");
            twm twm = this.a;
            Iterable<ajxm> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ajxm ajxm : iterable) {
                arrayList.add(((odx) ajxm.a).b());
            }
            List list2 = (List) arrayList;
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (ajxm ajxm2 : iterable) {
                arrayList2.add(ajxs.a(((odx) ajxm2.a).b().b, ajxm2.b));
            }
            twm.a(twm, list2, ajzm.a((Iterable) (List) arrayList2));
            return ajxw.a;
        }
    }

    /* renamed from: twm$ap */
    static final class ap<T> implements ajfb<ajxw> {
        public static final ap a = new ap();

        ap() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: twm$aq */
    static final class aq<T> implements ajfb<Throwable> {
        public static final aq a = new aq();

        aq() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: twm$as */
    static final class as<T> implements ajfb<MotionEvent> {
        private /* synthetic */ GestureDetector a;

        as(GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.onTouchEvent((MotionEvent) obj);
        }
    }

    /* renamed from: twm$av */
    static final class av<T> implements ajfb<ajxr<? extends String, ? extends abyy, ? extends Optional<kaz<jwj>>>> {
        private /* synthetic */ twm a;

        av(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxr ajxr = (ajxr) obj;
            twm twm = this.a;
            String str = (String) ajxr.a;
            obj = ajdp.b((Callable) new bg(twm, str, (Optional) ajxr.c, (abyy) ajxr.b)).a((ajfl) bh.a).a((ajdt) twm.a, (ajex) bi.a).p(new bj(twm, str)).a((ajfc) new bk(twm), false);
            akcr.a(obj, "Observable.fromCallable …plete()\n                }");
            ajej e = obj.e();
            akcr.a((Object) e, "updateWithNewOverlay(it.…nd, it.third).subscribe()");
            ajvv.a(e, this.a.f);
        }
    }

    /* renamed from: twm$aw */
    static final class aw implements ajev {
        private /* synthetic */ List a;

        aw(List list) {
            this.a = list;
        }

        public final void run() {
            tws.a(this.a);
        }
    }

    /* renamed from: twm$ax */
    static final class ax<T> implements ajfb<List<? extends twr>> {
        private /* synthetic */ twm a;

        ax(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            if (!this.a.f.isDisposed()) {
                this.a.a.a(obj);
            }
        }
    }

    /* renamed from: twm$bb */
    static final class bb<T> implements ajfb<tpk> {
        private /* synthetic */ twm a;

        bb(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            int dimensionPixelOffset = twm.a(this.a).c.getResources().getDimensionPixelOffset(((tpk) obj).a.isEmpty() ? R.dimen.preview_thumbnail_animation_translation_Y : R.dimen.preview_thumbnail_animation_translation_Y_chat_reply);
            obj = ObjectAnimator.ofFloat(twm.a(this.a).c, "translationY", new float[]{(float) dimensionPixelOffset});
            akcr.a(obj, "animation");
            obj.setDuration(300);
            obj.start();
        }
    }

    /* renamed from: twm$bc */
    static final class bc<T> implements ajfb<Throwable> {
        public static final bc a = new bc();

        bc() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: twm$be */
    public static final class be implements TrimmingListener {
        private /* synthetic */ twm a;

        be(twm twm) {
            this.a = twm;
        }

        public final void onTrimmingHandleDraggingFinished(String str, int i, Integer num, TrimmingType trimmingType) {
            akcr.b(str, "segmentKey");
            akcr.b(trimmingType, "type");
            this.a.k.a(new b());
            this.a.l.a(Boolean.FALSE);
            this.a.c().n();
        }

        public final void onTrimmingHandleDraggingStart() {
            this.a.k.a(new c());
            this.a.l.a(Boolean.TRUE);
            this.a.c().o();
        }

        public final void onTrimmingHandleDraggingUpdated(String str, int i, TrimmingType trimmingType) {
            akcr.b(str, "segmentKey");
            akcr.b(trimmingType, "type");
            this.a.o.a(str, i);
        }
    }

    /* renamed from: twm$bh */
    static final class bh<T> implements ajfl<Optional<twu>> {
        public static final bh a = new bh();

        bh() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: twm$bi */
    static final class bi<T1, T2, R> implements ajex<Optional<twu>, List<? extends twr>, ajxm<? extends twu, ? extends List<? extends twr>>> {
        public static final bi a = new bi();

        bi() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            Optional optional = (Optional) obj;
            List list = (List) obj2;
            akcr.b(optional, "t1");
            akcr.b(list, "t2");
            return ajxs.a(optional.get(), list);
        }
    }

    /* renamed from: twm$bj */
    static final class bj<T, R> implements ajfc<T, R> {
        private /* synthetic */ twm a;
        private /* synthetic */ String b;

        bj(twm twm, String str) {
            this.a = twm;
            this.b = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0085 in {7, 8, 9, 12, 15} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private java.util.List<defpackage.twr> a(defpackage.ajxm<defpackage.twu, ? extends java.util.List<defpackage.twr>> r23) {
            /*
            r22 = this;
            r1 = r22;
            r0 = r23;
            r2 = "<name for destructuring parameter 0>";
            defpackage.akcr.b(r0, r2);
            r2 = r0.a;
            r2 = (defpackage.twu) r2;
            r0 = r0.b;
            r0 = (java.util.List) r0;
            r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0080 }
            r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0080 }
            r4 = 10;	 Catch:{ all -> 0x0080 }
            r4 = defpackage.ajyn.a(r0, r4);	 Catch:{ all -> 0x0080 }
            r3.<init>(r4);	 Catch:{ all -> 0x0080 }
            r7 = r3;	 Catch:{ all -> 0x0080 }
            r7 = (java.util.Collection) r7;	 Catch:{ all -> 0x0080 }
            r0 = r0.iterator();	 Catch:{ all -> 0x0080 }
            r3 = r0.hasNext();	 Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0078;	 Catch:{ all -> 0x0080 }
            r3 = r0.next();	 Catch:{ all -> 0x0080 }
            r20 = r3;	 Catch:{ all -> 0x0080 }
            r20 = (defpackage.twr) r20;	 Catch:{ all -> 0x0080 }
            r3 = r20.getThumbnailKey();	 Catch:{ all -> 0x0080 }
            r4 = r1.b;	 Catch:{ all -> 0x0080 }
            r3 = defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x006c;	 Catch:{ all -> 0x0080 }
            r4 = new twr;	 Catch:{ all -> 0x0080 }
            r5 = 0;	 Catch:{ all -> 0x0080 }
            r6 = 0;	 Catch:{ all -> 0x0080 }
            r8 = 0;	 Catch:{ all -> 0x0080 }
            r9 = 0;	 Catch:{ all -> 0x0080 }
            r10 = 0;	 Catch:{ all -> 0x0080 }
            r11 = 0;	 Catch:{ all -> 0x0080 }
            r12 = 0;	 Catch:{ all -> 0x0080 }
            r13 = 0;	 Catch:{ all -> 0x0080 }
            r14 = 0;	 Catch:{ all -> 0x0080 }
            r15 = 0;	 Catch:{ all -> 0x0080 }
            r16 = 0;	 Catch:{ all -> 0x0080 }
            r17 = 0;	 Catch:{ all -> 0x0080 }
            r18 = 0;	 Catch:{ all -> 0x0080 }
            r19 = 32758; // 0x7ff6 float:4.5904E-41 double:1.61846E-319;	 Catch:{ all -> 0x0080 }
            r3 = r4;	 Catch:{ all -> 0x0080 }
            r21 = r4;	 Catch:{ all -> 0x0080 }
            r4 = r20;	 Catch:{ all -> 0x0080 }
            r23 = r0;	 Catch:{ all -> 0x0080 }
            r0 = r7;	 Catch:{ all -> 0x0080 }
            r7 = r2;	 Catch:{ all -> 0x0080 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x0080 }
            r3 = r1.a;	 Catch:{ all -> 0x0080 }
            r3 = r3.f;	 Catch:{ all -> 0x0080 }
            r4 = r21;	 Catch:{ all -> 0x0080 }
            r4.addTo(r3);	 Catch:{ all -> 0x0080 }
            r20.dispose();	 Catch:{ all -> 0x0080 }
            goto L_0x0071;	 Catch:{ all -> 0x0080 }
            r23 = r0;	 Catch:{ all -> 0x0080 }
            r0 = r7;	 Catch:{ all -> 0x0080 }
            r4 = r20;	 Catch:{ all -> 0x0080 }
            r0.add(r4);	 Catch:{ all -> 0x0080 }
            r7 = r0;	 Catch:{ all -> 0x0080 }
            r0 = r23;	 Catch:{ all -> 0x0080 }
            goto L_0x0025;	 Catch:{ all -> 0x0080 }
            r0 = r7;	 Catch:{ all -> 0x0080 }
            r7 = r0;	 Catch:{ all -> 0x0080 }
            r7 = (java.util.List) r7;	 Catch:{ all -> 0x0080 }
            r2.dispose();
            return r7;
            r0 = move-exception;
            r2.dispose();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.twm$bj.a(ajxm):java.util.List");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((ajxm) obj);
        }
    }

    /* renamed from: twm$bk */
    static final class bk<T, R> implements ajfc<List<? extends twr>, ajdb> {
        private /* synthetic */ twm a;

        bk(twm twm) {
            this.a = twm;
        }

        private ajcx a(List<twr> list) {
            akcr.b(list, "newModels");
            try {
                this.a.a((List) list);
                return ajvo.a(ajhn.a);
            } finally {
                this.a.c.release();
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    /* renamed from: twm$c */
    static final class c implements ajev {
        private /* synthetic */ twm a;

        c(twm twm) {
            this.a = twm;
        }

        public final void run() {
            twd.a((twd) this.a.q.get(), twb.MULTISNAP_THUMBNAIL_GEN_END, null, 6);
        }
    }

    /* renamed from: twm$d */
    static final class d<T> implements ajfb<jwu> {
        private /* synthetic */ twm a;
        private /* synthetic */ twr b;

        d(twm twm, twr twr) {
            this.a = twm;
            this.b = twr;
        }

        public final /* synthetic */ void accept(Object obj) {
            jwu jwu = (jwu) obj;
            ajvv.a((ajej) jwu.a, this.a.f);
            this.a.d.a((Object) ajxs.a(jwu, this.b.getThumbnailKey()));
        }
    }

    /* renamed from: twm$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ twm a;

        e(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((twd) this.a.y.b()).c("Failed to fetch thumbnails");
        }
    }

    /* renamed from: twm$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ twm a;

        f(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ThumbnailInteractionEvent thumbnailInteractionEvent = (ThumbnailInteractionEvent) obj;
            akcr.b(thumbnailInteractionEvent, "it");
            return !this.a.c.tryAcquire(2000, TimeUnit.MILLISECONDS) ? Optional.absent() : Optional.of(thumbnailInteractionEvent);
        }
    }

    /* renamed from: twm$g */
    static final class g<T> implements ajfl<Optional<ThumbnailInteractionEvent>> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: twm$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return (ThumbnailInteractionEvent) optional.get();
        }
    }

    /* renamed from: twm$i */
    static final class i<T1, T2, R> implements ajex<ThumbnailInteractionEvent, List<? extends twr>, ajxm<? extends ThumbnailInteractionEvent, ? extends List<? extends twr>>> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            ThumbnailInteractionEvent thumbnailInteractionEvent = (ThumbnailInteractionEvent) obj;
            List list = (List) obj2;
            akcr.b(thumbnailInteractionEvent, "t1");
            akcr.b(list, "t2");
            return ajxs.a(thumbnailInteractionEvent, list);
        }
    }

    /* renamed from: twm$j */
    static final class j<T> implements ajfl<ajxm<? extends ThumbnailInteractionEvent, ? extends List<? extends twr>>> {
        private /* synthetic */ twm a;

        j(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ boolean test(Object obj) {
            boolean z;
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            ThumbnailInteractionEvent thumbnailInteractionEvent = (ThumbnailInteractionEvent) ajxm.a;
            Iterable<twr> iterable = (List) ajxm.b;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (twr thumbnailKey : iterable) {
                    if (akcr.a(thumbnailInteractionEvent.getSegmentKey(), thumbnailKey.getThumbnailKey())) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                this.a.c.release();
            }
            return z;
        }
    }

    /* renamed from: twm$k */
    static final class k<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ twm a;

        /* renamed from: twm$k$2 */
        static final class 2<T, R> implements ajfc<Throwable, List<? extends twr>> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Throwable) obj, "it");
                return ajyw.a;
            }
        }

        k(twm twm) {
            this.a = twm;
        }

        private ajdp<List<twr>> a(ajxm<? extends ThumbnailInteractionEvent, ? extends List<twr>> ajxm) {
            ajxm<? extends ThumbnailInteractionEvent, ? extends List<twr>> ajxm2 = ajxm;
            akcr.b(ajxm2, "<name for destructuring parameter 0>");
            ThumbnailInteractionEvent thumbnailInteractionEvent = (ThumbnailInteractionEvent) ajxm2.a;
            final List list = (List) ajxm2.b;
            if (thumbnailInteractionEvent instanceof ThumbnailTouchEvent) {
                ajdp<List<twr>> b;
                try {
                    b = ajdp.b(this.a.a(thumbnailInteractionEvent.getSegmentKey(), list));
                    akcr.a((Object) b, "Observable.just(toggleTh….segmentKey, viewModels))");
                    tws.a(list);
                    this.a.b().b(uaj.MULTI_SNAP_TRIMMING);
                } catch (Exception unused) {
                    b = ajdp.b((Object) ajyw.a);
                }
                return b;
            }
            String str = "segmentKey";
            twm twm;
            Object e;
            Object a;
            if (thumbnailInteractionEvent instanceof ThumbnailDeletedEvent) {
                twm = this.a;
                String segmentKey = thumbnailInteractionEvent.getSegmentKey();
                tyb tyb = twm.n;
                akcr.b(segmentKey, str);
                e = tyb.k.b.e((ajfc) new tyb.c(tyb, segmentKey));
                akcr.a(e, "previewDataSource.mediaP…plete()\n                }");
                a = e.a((ajdt) ajdp.b((Callable) new bf(twm, list, segmentKey)));
                akcr.a(a, "segmentManager.markSegme…ed one\n                })");
                return a.c((ajev) new ajev() {
                    public final void run() {
                        tws.a(list);
                    }
                }).r(2.a);
            }
            Integer num = null;
            String str2 = "mediaPlayer";
            String segmentKey2;
            Object c;
            tyb tyb2;
            int c2;
            if (thumbnailInteractionEvent instanceof ThumbnailSplitEvent) {
                String str3;
                twm = this.a;
                segmentKey2 = thumbnailInteractionEvent.getSegmentKey();
                int splitAtMs = ((ThumbnailSplitEvent) thumbnailInteractionEvent).getSplitAtMs();
                ajdv ajdv = this.a.j;
                c = twm.c();
                akcr.a(c, str2);
                splitAtMs = a.a(splitAtMs, c);
                tyb2 = twm.n;
                akcr.b(segmentKey2, str);
                tya tya = (tya) tyb2.a.get(segmentKey2);
                if (tya == null) {
                    StringBuilder stringBuilder = new StringBuilder("splitSegment: segment ");
                    stringBuilder.append(segmentKey2);
                    stringBuilder.append(" does not exist");
                    e = ajdx.b((Throwable) new Exception(stringBuilder.toString()));
                    str3 = "Single.error(Exception(\"…mentKey does not exist\"))";
                } else {
                    if (!(tya instanceof tyd)) {
                        tya = null;
                    }
                    tyd tyd = (tyd) tya;
                    str3 = "splitSegment is called on segment ";
                    StringBuilder stringBuilder2;
                    if (tyd == null) {
                        stringBuilder2 = new StringBuilder(str3);
                        stringBuilder2.append(segmentKey2);
                        stringBuilder2.append(", which is NOT a VideoSegment");
                        e = ajdx.b((Throwable) new Exception(stringBuilder2.toString()));
                        str3 = "Single.error(Exception(\"… is NOT a VideoSegment\"))";
                    } else if (tyb2.a(splitAtMs, segmentKey2)) {
                        c2 = tyd.c();
                        int a2 = tyd.a();
                        if (c2 > splitAtMs || a2 < splitAtMs) {
                            stringBuilder2 = new StringBuilder("splitSegment: split timestamp ");
                            stringBuilder2.append(splitAtMs);
                            stringBuilder2.append(" outside of trimming bound [");
                            stringBuilder2.append(c2);
                            stringBuilder2.append(ppy.d);
                            stringBuilder2.append(a2);
                            stringBuilder2.append(']');
                            e = ajdx.b((Throwable) new Exception(stringBuilder2.toString()));
                            str3 = "Single.error(Exception(\"…mp, $trimEndTimestamp]\"))";
                        } else {
                            odu odu = tyb2.l;
                            idd a3 = tyb2.a();
                            abyi abyi = tyd.a;
                            e = odu.a(a3, abyi, splitAtMs - abyi.a().a).a((ajfl) f.a).f(new g(tyd, splitAtMs, segmentKey2)).c((ajfc) new h(tyb2, tyd)).a((ajdw) tyb2.b().l()).a((ajfb) new i(tyb2, segmentKey2, splitAtMs)).f(new j(tyb2));
                            str3 = "mediaPackageManager.spli…rightSegment.segmentKey }";
                        }
                    } else {
                        stringBuilder2 = new StringBuilder(str3);
                        stringBuilder2.append(segmentKey2);
                        stringBuilder2.append(" with invalid timestamp ");
                        stringBuilder2.append(splitAtMs);
                        e = ajdx.b((Throwable) new Exception(stringBuilder2.toString()));
                        str3 = "Single.error(\n          …tamp $splitAtTimestamp\"))";
                    }
                }
                akcr.a(e, str3);
                a = e.i().p(new aj(twm, list, segmentKey2, splitAtMs, ajdv)).r(new ak(twm));
                akcr.a(a, "segmentManager.splitSegm…yList()\n                }");
                return a;
            } else if (!(thumbnailInteractionEvent instanceof ThumbnailTrimmedEvent)) {
                return ajdp.b((Object) ajyw.a);
            } else {
                ThumbnailTrimmedEvent thumbnailTrimmedEvent = (ThumbnailTrimmedEvent) thumbnailInteractionEvent;
                Integer rightTrimTimestampMs = thumbnailTrimmedEvent.getRightTrimTimestampMs();
                int leftTrimTimestampMs = thumbnailTrimmedEvent.getLeftTrimTimestampMs();
                c = this.a.c();
                akcr.a(c, str2);
                leftTrimTimestampMs = a.a(leftTrimTimestampMs, c);
                if (rightTrimTimestampMs != null) {
                    c2 = rightTrimTimestampMs.intValue();
                    Object c3 = this.a.c();
                    akcr.a(c3, str2);
                    num = Integer.valueOf(a.a(c2, c3));
                }
                tyb2 = this.a.n;
                segmentKey2 = thumbnailInteractionEvent.getSegmentKey();
                akcr.b(segmentKey2, str);
                e = ajdx.c((Callable) new o(tyb2, segmentKey2, leftTrimTimestampMs, num)).e((ajfc) new p(tyb2, leftTrimTimestampMs, num));
                akcr.a(e, "Single.fromCallable {\n  …)\n            }\n        }");
                twm twm2 = this.a;
                Object segmentKey3 = thumbnailInteractionEvent.getSegmentKey();
                Integer valueOf = Integer.valueOf(thumbnailTrimmedEvent.getLeftTrimTimestampMs());
                Integer rightTrimTimestampMs2 = thumbnailTrimmedEvent.getRightTrimTimestampMs();
                Iterable<twr> iterable = list;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (twr twr : iterable) {
                    Object obj;
                    Collection collection;
                    if (akcr.a(twr.getSegmentKey(), segmentKey3)) {
                        twr twr2 = r7;
                        Collection collection2 = arrayList;
                        twr twr3 = new twr(twr, null, null, null, null, null, null, null, valueOf, rightTrimTimestampMs2, false, false, false, false, null, 31998);
                        obj = twr2;
                        obj.addTo(twm2.f);
                        twr.dispose();
                        collection = collection2;
                    } else {
                        collection = arrayList;
                        obj = twr;
                    }
                    collection.add(obj);
                    arrayList = collection;
                }
                return e.a((ajdt) ajdp.b((List) arrayList));
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((ajxm) obj);
        }
    }

    /* renamed from: twm$l */
    static final class l<T> implements ajfb<List<? extends twr>> {
        private /* synthetic */ twm a;

        l(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            try {
                twm twm = this.a;
                akcr.a((Object) list, "newModels");
                twm.a(list);
            } finally {
                this.a.c.release();
            }
        }
    }

    /* renamed from: twm$t */
    static final class t<T> implements ajfl<T> {
        private /* synthetic */ twm a;

        t(twm twm) {
            this.a = twm;
        }

        public final boolean test(T t) {
            return this.a.n.f() > 1 && this.a.n.g() == null;
        }
    }

    /* renamed from: twm$u */
    static final class u<T, R> implements ajfc<T, R> {
        private /* synthetic */ twm a;
        private /* synthetic */ String b;

        u(twm twm, String str) {
            this.a = twm;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return !this.a.c.tryAcquire(2000, TimeUnit.MILLISECONDS) ? Optional.absent() : Optional.of(obj);
        }
    }

    /* renamed from: twm$v */
    static final class v<T> implements ajfl<Optional<T>> {
        public static final v a = new v();

        v() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.isPresent();
        }
    }

    /* renamed from: twm$w */
    static final class w<T, R> implements ajfc<T, R> {
        public static final w a = new w();

        w() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return optional.get();
        }
    }

    /* renamed from: twm$x */
    static final class x<T1, T2, R> implements ajex<T, List<? extends twr>, List<? extends twr>> {
        public static final x a = new x();

        x() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            List list = (List) obj2;
            akcr.b(list, "models");
            return list;
        }
    }

    /* renamed from: twm$y */
    static final class y<T, R> implements ajfc<T, R> {
        private /* synthetic */ twm a;
        private /* synthetic */ String b;

        y(twm twm, String str) {
            this.a = twm;
            this.b = str;
        }

        private List<twr> a(List<twr> list) {
            akcr.b(list, "it");
            try {
                twm twm = this.a;
                String str = twm.n.j;
                if (str == null) {
                    return list;
                }
                if ((akcr.a(twm.n.i(), (Object) str) ^ 1) == 0) {
                    return list;
                }
                List<twr> a = twm.a(str, (List) list);
                tws.a(list);
                return a;
            } catch (Exception unused) {
                return ajyw.a;
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    /* renamed from: twm$z */
    static final class z<T> implements ajfb<List<? extends twr>> {
        private /* synthetic */ twm a;

        z(twm twm) {
            this.a = twm;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            try {
                akcr.a(obj, "it");
                if ((((Collection) obj).isEmpty() ^ 1) != 0) {
                    this.a.a.a(obj);
                }
                this.a.c.release();
            } catch (Throwable th) {
                this.a.c.release();
            }
        }
    }

    /* renamed from: twm$ar */
    static final class ar extends akcs implements akbl<Set<? extends String>, Boolean> {
        private /* synthetic */ twm a;

        ar(twm twm) {
            this.a = twm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "it");
            boolean z = true;
            if (!(this.a.e && set.contains(twm.s) && set.size() == 1)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: twm$az */
    static final class az extends akcs implements akbl<tzi, ajxw> {
        private /* synthetic */ twm a;

        /* renamed from: twm$az$1 */
        static final class 1<T> implements ajfl<tzh> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                tzh tzh = (tzh) obj;
                akcr.b(tzh, "it");
                return tzh.b == tzh.a.START;
            }
        }

        az(twm twm) {
            this.a = twm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            tzi tzi = (tzi) obj;
            akcr.b(tzi, "it");
            twm twm = this.a;
            ajdp a = tzi.n().a((ajfl) 1.a);
            akcr.a((Object) a, "it.snapEditingStatus.fil…ent.EditingStatus.START }");
            twm.a(twm, a, "editing status change");
            return ajxw.a;
        }
    }

    /* renamed from: twm$b */
    static final class b extends akcs implements akbk<idd> {
        private /* synthetic */ twm a;

        b(twm twm) {
            this.a = twm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.h.callsite("PreviewThumbnailPresenter");
        }
    }

    /* renamed from: twm$ba */
    static final class ba extends akcs implements akbl<tpq, ajxw> {
        private /* synthetic */ twm a;

        ba(twm twm) {
            this.a = twm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            tpq tpq = (tpq) obj;
            akcr.b(tpq, "it");
            twm.a(this.a, tpq.b(), "observe edits changed");
            return ajxw.a;
        }
    }

    /* renamed from: twm$bd */
    static final class bd extends akcs implements akbk<ofa> {
        private /* synthetic */ aipn a;

        bd(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ofa) this.a.get();
        }
    }

    /* renamed from: twm$m */
    static final class m extends akcs implements akbk<txi> {
        private /* synthetic */ twm a;

        m(twm twm) {
            this.a = twm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (txi) this.a.m.get();
        }
    }

    /* renamed from: twm$n */
    static final class n extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ twm a;
        private /* synthetic */ ThumbnailDeletedEvent b;

        n(twm twm, ThumbnailDeletedEvent thumbnailDeletedEvent) {
            this.a = twm;
            this.b = thumbnailDeletedEvent;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.b.a((Object) this.b);
            return ajxw.a;
        }
    }

    /* renamed from: twm$o */
    static final class o extends akcs implements akbl<View, ajxw> {
        public static final o a = new o();

        o() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: twm$p */
    static final class p extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ twm a;
        private /* synthetic */ ThumbnailDeletedEvent b;

        p(twm twm, ThumbnailDeletedEvent thumbnailDeletedEvent) {
            this.a = twm;
            this.b = thumbnailDeletedEvent;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.b().b(uaj.MULTI_SNAP_DELETION);
            this.a.b.a((Object) this.b);
            return ajxw.a;
        }
    }

    /* renamed from: twm$q */
    static final class q extends akcs implements akbk<twd> {
        private /* synthetic */ ajwy a;

        q(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (twd) this.a.get();
        }
    }

    /* renamed from: twm$r */
    static final class r extends akcs implements akbk<uav> {
        private /* synthetic */ ajwy a;

        r(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uav) this.a.get();
        }
    }

    /* renamed from: twm$s */
    static final class s extends akcs implements akbk<zfw> {
        private /* synthetic */ twm a;

        s(twm twm) {
            this.a = twm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.h.callsite("PreviewThumbnailPresenter"));
        }
    }

    /* renamed from: twm$at */
    static final class at extends akcq implements akbk<ajxw> {
        at(twm twm) {
            super(0, twm);
        }

        public final String getName() {
            return "onDispose";
        }

        public final akej getOwner() {
            return akde.a(twm.class);
        }

        public final String getSignature() {
            return "onDispose()V";
        }

        public final /* synthetic */ Object invoke() {
            twm twm = (twm) this.receiver;
            twm.e();
            twm.o.dispose();
            twq twq = twm.g;
            String str = "previewThumbnailTarget";
            if (twq == null) {
                akcr.a(str);
            }
            ThumbnailRecyclerView thumbnailRecyclerView = twq.b;
            if (thumbnailRecyclerView != null) {
                thumbnailRecyclerView.recycle();
            }
            twq twq2 = twm.g;
            if (twq2 == null) {
                akcr.a(str);
            }
            twq2.b = null;
            twq2.a = null;
            return ajxw.a;
        }
    }

    /* renamed from: twm$ay */
    static final class ay extends akcq implements akbl<List<? extends MultiSnapThumbnailViewModel>, ajxw> {
        ay(twq twq) {
            super(1, twq);
        }

        public final String getName() {
            return "updateViewModels";
        }

        public final akej getOwner() {
            return akde.a(twq.class);
        }

        public final String getSignature() {
            return "updateViewModels(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            twq twq = (twq) this.receiver;
            akcr.b(list, "viewModels");
            zmf zmf = twq.a;
            if (zmf != null) {
                zmf.a((znh) new znf(list));
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(twm.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(twm.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(twm.class), "previewTooltipRepository", "getPreviewTooltipRepository()Lcom/snap/preview/tooltips/PreviewTooltipRepository;"), new akdc(akde.a(twm.class), "mediaPlayer", "getMediaPlayer()Lcom/snap/preview/player/PreviewMediaPlayer;"), new akdc(akde.a(twm.class), "thumbnailGenerator", "getThumbnailGenerator()Lcom/snap/media/api/rendering/MediaThumbnailGenerator;"), new akdc(akde.a(twm.class), "previewMetricsPlugin", "getPreviewMetricsPlugin()Lcom/snap/preview/metrics/PreviewMetricsPlugin;")};
        a aVar = new a();
    }

    public twm(toc toc, zgb zgb, ViewFinder viewFinder, zkf zkf, tvd tvd, twz twz, toi toi, jwa jwa, tvp tvp, ajdp<tpd> ajdp, ajdp<tpk> ajdp2, ajdv<uaq> ajdv, ajde<tps> ajde, ajdv<tzk> ajdv2, ajdv<Boolean> ajdv3, aipn<txi> aipn, tyb tyb, twj twj, aipn<ofa> aipn2, tpv tpv, ajwy<uav> ajwy, twt twt, achb<zjm, zjk> achb, tww tww, ajwy<twd> ajwy2, tzg tzg, ajdp<MotionEvent> ajdp3, tpj tpj, ajwy<twd> ajwy3) {
        toc toc2 = toc;
        zgb zgb2 = zgb;
        ViewFinder viewFinder2 = viewFinder;
        zkf zkf2 = zkf;
        tvd tvd2 = tvd;
        twz twz2 = twz;
        toi toi2 = toi;
        jwa jwa2 = jwa;
        tvp tvp2 = tvp;
        ajdp<tpd> ajdp4 = ajdp;
        ajdp<tpk> ajdp5 = ajdp2;
        ajdv<uaq> ajdv4 = ajdv;
        ajde<tps> ajde2 = ajde;
        ajdv<tzk> ajdv5 = ajdv2;
        ajdv<Boolean> ajdv6 = ajdv3;
        aipn<txi> aipn3 = aipn;
        akcr.b(toc2, "previewFeature");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(viewFinder2, "viewFinder");
        akcr.b(zkf2, "eventBus");
        akcr.b(tvd2, "previewDataSource");
        akcr.b(twz2, "previewMediaReaderManager");
        akcr.b(toi2, "analyticsProviderStorage");
        akcr.b(jwa2, "bitmapFactory");
        akcr.b(tvp2, "editsComposer");
        akcr.b(ajdp4, "previewControlEventObservable");
        akcr.b(ajdp5, "sendToDataObservable");
        akcr.b(ajdv4, "tooltipVisibilityObserver");
        akcr.b(ajde2, "segmentSwitchFlowable");
        akcr.b(ajdv5, "overlayEventObserver");
        akcr.b(ajdv6, "hideSendAndDiscardButtonEventObserver");
        akcr.b(aipn, "mediaPlayerLazy");
        akcr.b(tyb, "segmentManager");
        akcr.b(twj, "multiSnapPlaybackController");
        akcr.b(aipn2, "thumbnailGeneratorLazy");
        akcr.b(tpv, "toolsProvider");
        akcr.b(ajwy, "previewTooltipRepository");
        akcr.b(twt, "composingOperationFactory");
        akcr.b(achb, "navigationHost");
        akcr.b(tww, "playheadPresenterFactory");
        akcr.b(ajwy2, "previewMetricsPluginProvider");
        akcr.b(tzg, "currentEditingToolManager");
        akcr.b(ajdp3, "gestureEventObservable");
        akcr.b(tpj, "previewPreloadedConfigs");
        akcr.b(ajwy3, "previewMetricsPlugin");
        aipn<txi> aipn4 = aipn;
        this.h = toc2;
        this.D = zgb2;
        this.E = viewFinder2;
        this.F = zkf2;
        this.G = tvd2;
        this.i = twz2;
        this.H = toi2;
        this.I = jwa2;
        this.J = ajdp4;
        this.K = ajdp5;
        this.j = ajdv4;
        this.L = ajde2;
        this.k = ajdv5;
        this.l = ajdv6;
        this.m = aipn4;
        twj twj2 = twj;
        this.n = tyb;
        this.o = twj2;
        ajwy<uav> ajwy4 = ajwy;
        this.M = tpv;
        achb<zjm, zjk> achb2 = achb;
        this.p = twt;
        this.N = achb2;
        ajwy<twd> ajwy5 = ajwy2;
        this.O = tww;
        this.q = ajwy5;
        ajdp<MotionEvent> ajdp6 = ajdp3;
        this.r = tzg;
        this.P = ajdp6;
        ajwy5 = ajwy3;
        this.Q = tpj;
        this.v = ajxh.a(new r(ajwy4));
        this.w = ajxh.a(new m(this));
        this.x = ajxh.a(new bd(aipn2));
        this.y = ajxh.a(new q(ajwy5));
        this.z = (tvu) tvp;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.a = ajwl;
        ajwl = new ajwo();
        String str = "PublishSubject.create()";
        akcr.a(ajwl, str);
        this.b = (ajws) ajwl;
        this.c = new Semaphore(1);
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.A = (ajws) ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, str);
        this.d = (ajws) ajwl;
        this.f = new ajei();
        this.C = new be(this);
    }

    private final zfw f() {
        return (zfw) this.u.b();
    }

    /* Access modifiers changed, original: final */
    public final idd a() {
        return (idd) this.t.b();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:14:0x0054, code skipped:
            if (defpackage.akcr.a(r1, r7.getThumbnailKey()) != false) goto L_0x006c;
     */
    /* JADX WARNING: Missing block: B:22:0x0077, code skipped:
            if (defpackage.akcr.a(r1, r7.getThumbnailKey()) != false) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:24:0x0082, code skipped:
            if (defpackage.akcr.a(r1, r7.getThumbnailKey()) != false) goto L_0x0088;
     */
    public final java.util.List<defpackage.twr> a(java.lang.String r24, java.util.List<defpackage.twr> r25) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r2 = r25;
        r2 = (java.lang.Iterable) r2;
        r3 = new java.util.ArrayList;
        r4 = 10;
        r4 = defpackage.ajyn.a(r2, r4);
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r2 = r2.iterator();
    L_0x0019:
        r4 = r2.hasNext();
        r5 = 1;
        if (r4 == 0) goto L_0x00ac;
    L_0x0020:
        r4 = r2.next();
        r7 = r4;
        r7 = (defpackage.twr) r7;
        r4 = new twr;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r6 = r7.getDisplayMode();
        r12 = defpackage.twn.b;
        r6 = r6.ordinal();
        r6 = r12[r6];
        if (r6 == r5) goto L_0x0088;
    L_0x003b:
        r12 = 2;
        if (r6 == r12) goto L_0x007a;
    L_0x003e:
        r12 = 3;
        if (r6 == r12) goto L_0x0060;
    L_0x0041:
        r12 = 4;
        if (r6 != r12) goto L_0x005a;
    L_0x0044:
        r6 = r0.n;
        r6 = r6.f();
        if (r6 == r5) goto L_0x0057;
    L_0x004c:
        r5 = r7.getThumbnailKey();
        r5 = defpackage.akcr.a(r1, r5);
        if (r5 == 0) goto L_0x0085;
    L_0x0056:
        goto L_0x006c;
    L_0x0057:
        r5 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.SINGLE_DEMOTED;
        goto L_0x008a;
    L_0x005a:
        r1 = new ajxk;
        r1.<init>();
        throw r1;
    L_0x0060:
        r5 = r0.n;
        r5 = r5.i();
        r5 = defpackage.akcr.a(r1, r5);
        if (r5 == 0) goto L_0x006f;
    L_0x006c:
        r5 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.NEUTRAL;
        goto L_0x008a;
    L_0x006f:
        r5 = r7.getThumbnailKey();
        r5 = defpackage.akcr.a(r1, r5);
        if (r5 == 0) goto L_0x0085;
    L_0x0079:
        goto L_0x0088;
    L_0x007a:
        r5 = r7.getThumbnailKey();
        r5 = defpackage.akcr.a(r1, r5);
        if (r5 == 0) goto L_0x0085;
    L_0x0084:
        goto L_0x0088;
    L_0x0085:
        r5 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.DEMOTED;
        goto L_0x008a;
    L_0x0088:
        r5 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.SELECTED;
    L_0x008a:
        r12 = r5;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = r7.isDeletionEnabled();
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 31710; // 0x7bde float:4.4435E-41 double:1.5667E-319;
        r6 = r4;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        r5 = r0.f;
        r4.addTo(r5);
        r3.add(r4);
        goto L_0x0019;
    L_0x00ac:
        r3 = (java.util.List) r3;
        r1 = r3;
        r1 = (java.lang.Iterable) r1;
        r1 = r1.iterator();
    L_0x00b5:
        r2 = r1.hasNext();
        r4 = 0;
        if (r2 == 0) goto L_0x00d1;
    L_0x00bc:
        r2 = r1.next();
        r6 = r2;
        r6 = (defpackage.twr) r6;
        r6 = r6.getDisplayMode();
        r7 = com.snap.ui.view.multisnap.MultiSnapThumbnailView.ThumbnailViewState.SELECTED;
        if (r6 != r7) goto L_0x00cd;
    L_0x00cb:
        r6 = 1;
        goto L_0x00ce;
    L_0x00cd:
        r6 = 0;
    L_0x00ce:
        if (r6 == 0) goto L_0x00b5;
    L_0x00d0:
        goto L_0x00d2;
    L_0x00d1:
        r2 = 0;
    L_0x00d2:
        r2 = (defpackage.twr) r2;
        if (r2 == 0) goto L_0x0127;
    L_0x00d6:
        r1 = r0.n;
        r4 = r2.getThumbnailKey();
        r6 = "segmentKey";
        defpackage.akcr.b(r4, r6);
        r1.j();
        r6 = r1.a;
        r6 = r6.get(r4);
        r6 = (defpackage.tya) r6;
        if (r6 == 0) goto L_0x00f1;
    L_0x00ee:
        r6.a(r5);
    L_0x00f1:
        r1 = r1.g;
        r1.a(r4);
        r1 = r0.n;
        r1 = r1.j;
        r4 = r2.getThumbnailKey();
        r1 = defpackage.akcr.a(r1, r4);
        r1 = r1 ^ r5;
        if (r1 == 0) goto L_0x0114;
    L_0x0105:
        r1 = r2.getSegmentKey();
        if (r1 == 0) goto L_0x0114;
    L_0x010b:
        r1 = r0.o;
        r4 = r2.getSegmentKey();
        r1.a(r4);
    L_0x0114:
        r1 = r2.isImage();
        if (r1 != 0) goto L_0x011d;
    L_0x011a:
        r0.a(r2);
    L_0x011d:
        r0.e = r5;
        r1 = r0.r;
        r2 = s;
        r1.a(r2);
        goto L_0x0138;
    L_0x0127:
        r1 = r0;
        r1 = (defpackage.twm) r1;
        r2 = r1.n;
        r2.j();
        r1.e = r4;
        r1 = r1.r;
        r2 = s;
        r1.b(r2);
    L_0x0138:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twm.a(java.lang.String, java.util.List):java.util.List");
    }

    public final void a(aaim aaim, akez<? extends aaim> akez) {
        akcr.b(aaim, "directSnapPreview");
        akcr.b(akez, "segmentEvents");
        aaim.c(Long.valueOf((long) ((Number) this.o.d.b()).intValue()));
        aaim.d(Long.valueOf((long) ((Number) this.o.e.b()).intValue()));
        aaim.e(Long.valueOf((long) ((Number) this.o.f.b()).intValue()));
        aaim.a((aasf) this.o.g.b());
        aaim.b(Boolean.valueOf(((Boolean) this.o.h.b()).booleanValue()));
        aaim.c(Boolean.valueOf(((Boolean) this.o.i.b()).booleanValue()));
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
    }

    /* Access modifiers changed, original: final */
    public final void a(List<twr> list) {
        if (this.f.isDisposed() || list.isEmpty()) {
            tws.a(list);
            return;
        }
        List list2 = (List) this.a.p();
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2);
            arrayList.removeAll(list);
            tws.a(arrayList);
        }
        this.a.a((Object) list);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x0102 in {7, 11, 16, 19, 22, 25, 27, 30} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final synchronized void a(defpackage.twr r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r10.q;	 Catch:{ all -> 0x00ff }
        r0 = r0.get();	 Catch:{ all -> 0x00ff }
        r0 = (defpackage.twd) r0;	 Catch:{ all -> 0x00ff }
        r1 = defpackage.twb.MULTISNAP_THUMBNAIL_GEN_START;	 Catch:{ all -> 0x00ff }
        r2 = 0;	 Catch:{ all -> 0x00ff }
        r3 = 6;	 Catch:{ all -> 0x00ff }
        defpackage.twd.a(r0, r1, r2, r3);	 Catch:{ all -> 0x00ff }
        r4 = com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewController.Companion;	 Catch:{ all -> 0x00ff }
        r5 = r11.getDisplayMode();	 Catch:{ all -> 0x00ff }
        r6 = r11.getBaseBitmaps();	 Catch:{ all -> 0x00ff }
        r7 = 0;	 Catch:{ all -> 0x00ff }
        r8 = r11.getStartTimestampMs();	 Catch:{ all -> 0x00ff }
        r9 = r11.getEndTimestampMs();	 Catch:{ all -> 0x00ff }
        r0 = r4.getStateThumbnailTimestamps(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00ff }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x00ff }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00ff }
        r1.<init>();	 Catch:{ all -> 0x00ff }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x00ff }
        r0 = r0.iterator();	 Catch:{ all -> 0x00ff }
        r2 = r0.hasNext();	 Catch:{ all -> 0x00ff }
        if (r2 == 0) goto L_0x005d;	 Catch:{ all -> 0x00ff }
        r2 = r0.next();	 Catch:{ all -> 0x00ff }
        r3 = r2;	 Catch:{ all -> 0x00ff }
        r3 = (java.lang.Number) r3;	 Catch:{ all -> 0x00ff }
        r3 = r3.intValue();	 Catch:{ all -> 0x00ff }
        r4 = r11.getBaseBitmaps();	 Catch:{ all -> 0x00ff }
        r4 = r4.keySet();	 Catch:{ all -> 0x00ff }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x00ff }
        r3 = r4.contains(r3);	 Catch:{ all -> 0x00ff }
        r3 = r3 ^ 1;	 Catch:{ all -> 0x00ff }
        if (r3 == 0) goto L_0x0034;	 Catch:{ all -> 0x00ff }
        r1.add(r2);	 Catch:{ all -> 0x00ff }
        goto L_0x0034;	 Catch:{ all -> 0x00ff }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x00ff }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x00ff }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x00ff }
        r2 = 10;	 Catch:{ all -> 0x00ff }
        r2 = defpackage.ajyn.a(r1, r2);	 Catch:{ all -> 0x00ff }
        r0.<init>(r2);	 Catch:{ all -> 0x00ff }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x00ff }
        r1 = r1.iterator();	 Catch:{ all -> 0x00ff }
        r2 = r1.hasNext();	 Catch:{ all -> 0x00ff }
        if (r2 == 0) goto L_0x008b;	 Catch:{ all -> 0x00ff }
        r2 = r1.next();	 Catch:{ all -> 0x00ff }
        r2 = (java.lang.Number) r2;	 Catch:{ all -> 0x00ff }
        r2 = r2.intValue();	 Catch:{ all -> 0x00ff }
        r2 = (long) r2;	 Catch:{ all -> 0x00ff }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x00ff }
        r0.add(r2);	 Catch:{ all -> 0x00ff }
        goto L_0x0072;	 Catch:{ all -> 0x00ff }
        r3 = r0;	 Catch:{ all -> 0x00ff }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x00ff }
        r0 = r10.n;	 Catch:{ all -> 0x00ff }
        r1 = r11.getThumbnailKey();	 Catch:{ all -> 0x00ff }
        r0 = r0.b(r1);	 Catch:{ all -> 0x00ff }
        if (r0 == 0) goto L_0x00fd;	 Catch:{ all -> 0x00ff }
        r2 = r0.b();	 Catch:{ all -> 0x00ff }
        if (r2 != 0) goto L_0x00a1;	 Catch:{ all -> 0x00ff }
        goto L_0x00fd;	 Catch:{ all -> 0x00ff }
        r0 = r10.B;	 Catch:{ all -> 0x00ff }
        if (r0 == 0) goto L_0x00a8;	 Catch:{ all -> 0x00ff }
        r0.dispose();	 Catch:{ all -> 0x00ff }
        r0 = r10.d();	 Catch:{ all -> 0x00ff }
        r1 = r10.a();	 Catch:{ all -> 0x00ff }
        r4 = r10.g;	 Catch:{ all -> 0x00ff }
        if (r4 != 0) goto L_0x00b9;	 Catch:{ all -> 0x00ff }
        r5 = "previewThumbnailTarget";	 Catch:{ all -> 0x00ff }
        defpackage.akcr.a(r5);	 Catch:{ all -> 0x00ff }
        r4 = r4.a();	 Catch:{ all -> 0x00ff }
        r5 = r10.f;	 Catch:{ all -> 0x00ff }
        r6 = defpackage.admm.a.HARDWARE_FIRST;	 Catch:{ all -> 0x00ff }
        r0 = r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x00ff }
        r1 = defpackage.ajot.a;	 Catch:{ all -> 0x00ff }
        r1 = defpackage.ajvo.a(r1);	 Catch:{ all -> 0x00ff }
        r1 = (defpackage.ajdt) r1;	 Catch:{ all -> 0x00ff }
        r0 = r0.f(r1);	 Catch:{ all -> 0x00ff }
        r1 = new twm$c;	 Catch:{ all -> 0x00ff }
        r1.<init>(r10);	 Catch:{ all -> 0x00ff }
        r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x00ff }
        r0 = r0.a(r1);	 Catch:{ all -> 0x00ff }
        r1 = new twm$d;	 Catch:{ all -> 0x00ff }
        r1.<init>(r10, r11);	 Catch:{ all -> 0x00ff }
        r1 = (defpackage.ajfb) r1;	 Catch:{ all -> 0x00ff }
        r11 = new twm$e;	 Catch:{ all -> 0x00ff }
        r11.<init>(r10);	 Catch:{ all -> 0x00ff }
        r11 = (defpackage.ajfb) r11;	 Catch:{ all -> 0x00ff }
        r11 = r0.a(r1, r11);	 Catch:{ all -> 0x00ff }
        r0 = "thumbnailGenerator.gener…age}\")\n                })";	 Catch:{ all -> 0x00ff }
        defpackage.akcr.a(r11, r0);	 Catch:{ all -> 0x00ff }
        r0 = r10.f;	 Catch:{ all -> 0x00ff }
        r11 = defpackage.ajvv.a(r11, r0);	 Catch:{ all -> 0x00ff }
        r10.B = r11;	 Catch:{ all -> 0x00ff }
        monitor-exit(r10);
        return;
        monitor-exit(r10);
        return;
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twm.a(twr):void");
    }

    /* Access modifiers changed, original: final */
    public final uav b() {
        return (uav) this.v.b();
    }

    /* Access modifiers changed, original: final */
    public final txi c() {
        return (txi) this.w.b();
    }

    /* Access modifiers changed, original: final */
    public final ofa d() {
        return (ofa) this.x.b();
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        List<twr> list = (List) this.a.p();
        if (list != null) {
            for (twr twr : list) {
                twr.getPlayheadPresenter().dropTarget();
                twr.dispose();
            }
            this.a.a((Object) ajyw.a);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onThumbnailDeletedEvent(ThumbnailDeletedEvent thumbnailDeletedEvent) {
        ThumbnailDeletedEvent thumbnailDeletedEvent2 = thumbnailDeletedEvent;
        akcr.b(thumbnailDeletedEvent2, "event");
        if (b().a(uaj.MULTI_SNAP_DELETION)) {
            this.b.a((Object) thumbnailDeletedEvent2);
            return;
        }
        zjm zjm = new zjm(this.h, "multisnap_deletion", false, false, true, false, null, false, false, false, false, null, 4076);
        twq twq = this.g;
        if (twq == null) {
            akcr.a("previewThumbnailTarget");
        }
        Object context = twq.c.getContext();
        akcr.a(context, "previewThumbnailTarget.thumbnailContainer.context");
        zgy a = zgy.a.a(new zgy.a(context, this.N, zjm, false, null, 24).a((int) R.string.multi_snap_delete_confirmation_message).a((int) R.string.multi_snap_delete_confirmation_yes_message, (akbl) new n(this, thumbnailDeletedEvent2), true).a((int) R.string.dialog_cancel, (akbl) o.a, true), (akbl) new p(this, thumbnailDeletedEvent2), false, Integer.valueOf(R.string.multi_snap_delete_confirmation_always_yes_message), null, null, 26).a();
        this.N.a((achd) a, a.a, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onThumbnailSplitEvent(ThumbnailSplitEvent thumbnailSplitEvent) {
        akcr.b(thumbnailSplitEvent, "event");
        this.A.a((Object) thumbnailSplitEvent);
        this.b.a((Object) thumbnailSplitEvent);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onThumbnailTouchEvent(ThumbnailTouchEvent thumbnailTouchEvent) {
        akcr.b(thumbnailTouchEvent, "event");
        this.b.a((Object) thumbnailTouchEvent);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onThumbnailTrimmedEvent(ThumbnailTrimmedEvent thumbnailTrimmedEvent) {
        akcr.b(thumbnailTrimmedEvent, "event");
        this.b.a((Object) thumbnailTrimmedEvent);
    }

    public final ajej start() {
        View findViewById = this.E.findViewById(R.id.thumbnail_container);
        if (findViewById == null) {
            akcr.a();
        }
        this.g = new twq((FrameLayout) findViewById, this.F, this.Q.a(), f(), this.I);
        ajej f = this.J.f((ajfb) new al(this));
        akcr.a((Object) f, "previewControlEventObser…}\n            }\n        }");
        ajvv.a(f, this.f);
        f = this.G.b.a((ajdw) f().h()).a((ajfc) new am(this)).a((ajfc) new an(this)).a((ajdw) f().l()).f(new ao(this)).a((ajfb) ap.a, (ajfb) aq.a);
        akcr.a((Object) f, "previewDataSource.mediaP…it.localizedMessage}\") })");
        ajvv.a(f, this.f);
        twq twq = this.g;
        if (twq == null) {
            akcr.a("previewThumbnailTarget");
        }
        f = igs.a(this.P, this.r.a(), (akbl) new ar(this)).f((ajfb) new as(new GestureDetector(twq.c.getContext(), new au(this))));
        akcr.a((Object) f, "gestureEventObservable\n …vent(e)\n                }");
        ajvv.a(f, this.f);
        this.f.a(ajek.a((ajev) new two(new at(this))));
        return this.f;
    }
}
