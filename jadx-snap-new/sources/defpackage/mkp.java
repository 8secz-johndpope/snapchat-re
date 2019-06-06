package defpackage;

import com.brightcove.player.event.Event;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.AspectRatioMode;
import com.looksery.sdk.domain.ComplexEffectDescriptor;
import com.looksery.sdk.domain.ComplexEffectDescriptor.Builder;
import com.looksery.sdk.domain.LensInfo;
import com.looksery.sdk.listener.LensLifeCycleListener;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.mhn.a;
import defpackage.miq.e;
import defpackage.mmi.b;
import defpackage.mmi.c;
import defpackage.mmi.c.a.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: mkp */
public final class mkp implements mmi {
    final mhn a = new mhn();
    final ajwl<c> b;
    final mkx c;
    final mka d;
    final zfw e;
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;

    /* renamed from: mkp$1 */
    static final class 1 implements ajev {
        private /* synthetic */ mkp a;

        1(mkp mkp) {
            this.a = mkp;
        }

        public final void run() {
            this.a.a.a((akbl) a.a);
        }
    }

    /* renamed from: mkp$2 */
    static final class 2 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        final /* synthetic */ mkp a;

        /* renamed from: mkp$2$a */
        public static final class a implements LensLifeCycleListener {
            private /* synthetic */ 2 a;

            /* renamed from: mkp$2$a$a */
            static final class a extends akcs implements akbl<String, Boolean> {
                private /* synthetic */ LensInfo a;

                a(LensInfo lensInfo) {
                    this.a = lensInfo;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    obj = (String) obj;
                    akcr.b(obj, "it");
                    return Boolean.valueOf(akcr.a(obj, this.a.getLensId()) ^ 1);
                }
            }

            a(2 2) {
                this.a = 2;
            }

            private final b a(LensInfo lensInfo) {
                List list;
                if (lensInfo.supportsPresetApi()) {
                    Object presetImages = lensInfo.getPresetImages();
                    akcr.a(presetImages, "presetImages");
                    Collection arrayList = new ArrayList(presetImages.length);
                    for (String b : presetImages) {
                        Object b2 = defpackage.miq.a.b(b);
                        if (b2 instanceof defpackage.miq.d.a) {
                            b2 = this.a.a.d.b((defpackage.miq.d.a) b2);
                        }
                        arrayList.add(b2);
                    }
                    list = (List) arrayList;
                } else {
                    list = ajyw.a;
                }
                return mks.a(lensInfo, list);
            }

            public final void onLensResourcesLoaded(LensInfo lensInfo) {
                akcr.b(lensInfo, "lensInfo");
                this.a.a.b.a(new defpackage.mmi.c.a.b(a(lensInfo)));
            }

            public final void onLensTurnOff(LensInfo lensInfo) {
                akcr.b(lensInfo, "lensInfo");
                this.a.a.b.a(new defpackage.mmi.c.a.c(mks.a(lensInfo, ajyw.a)));
            }

            public final void onLensTurnOn(LensInfo lensInfo) {
                akcr.b(lensInfo, "lensInfo");
                this.a.a.a.a((akbl) new a(lensInfo));
                this.a.a.b.a(new d(a(lensInfo)));
            }
        }

        2(mkp mkp) {
            this.a = mkp;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setLensLifeCycleListener(new a(this));
            return ajxw.a;
        }
    }

    /* renamed from: mkp$a */
    static final class a extends akcs implements akbk<mid<? super mmi.d, Boolean>> {
        final /* synthetic */ mkp a;

        /* renamed from: mkp$a$a */
        public static final class a implements mid<mmi.d, Boolean> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            final /* synthetic */ a d;
            private mhk e;
            private /* synthetic */ boolean f = true;
            private /* synthetic */ String g;
            private /* synthetic */ boolean h;
            private /* synthetic */ Object i;

            /* renamed from: mkp$a$a$a */
            static final class a extends akcs implements akbl<String, Boolean> {
                private /* synthetic */ LSCoreManagerWrapper a;
                private /* synthetic */ mmi.d b;
                private /* synthetic */ Set c;
                private /* synthetic */ a d;

                a(LSCoreManagerWrapper lSCoreManagerWrapper, mmi.d dVar, Set set, a aVar) {
                    this.a = lSCoreManagerWrapper;
                    this.b = dVar;
                    this.c = set;
                    this.d = aVar;
                    super(1);
                }

                public final boolean a(String str) {
                    akcr.b(str, MessageMediaRefModel.URI);
                    mks.a(this.a);
                    if (!mkp.a(this.d.d.a, this.b.a)) {
                        this.d.d.a.b.a(new defpackage.mmi.c.a.a(this.b));
                    }
                    this.a.setInitializationEffectEnabled(false);
                    Builder newBuilder = ComplexEffectDescriptor.newBuilder(this.b.a.a, str);
                    String str2 = this.b.g;
                    if (str2 != null) {
                        newBuilder.setConfig(str2);
                    }
                    byte[] bArr = this.b.h;
                    if (bArr != null) {
                        newBuilder.setLaunchMetadata(bArr);
                    }
                    ComplexEffectDescriptor build = newBuilder.build();
                    if (this.b.e) {
                        this.a.applyComplexEffectAsync(build);
                    } else {
                        this.a.applyComplexEffect(build);
                    }
                    this.d.d.a.a.a(this.b.a.a, this.c);
                    miq miq = this.b.f;
                    if (miq instanceof e) {
                        this.a.setOverlay(((e) miq).a(), AspectRatioMode.PRESERVE_TO_FIT_WIDTH);
                    }
                    return true;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(a((String) obj));
                }
            }

            /* renamed from: mkp$a$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj, a aVar) {
                this.c = mkx;
                this.g = str;
                this.h = true;
                this.i = obj;
                this.d = aVar;
                this.a = new CopyOnWriteArrayList();
                this.e = mkx.c;
                this.b = mkx.d;
            }

            private final Boolean d(mmi.d dVar) {
                Boolean valueOf;
                int isEmpty = this.a.isEmpty() ^ 1;
                long a = isEmpty != 0 ? this.e.a(TimeUnit.MILLISECONDS) : 0;
                mkx mkx = this.c;
                boolean z = this.h;
                if ((mkx.isDisposed() ^ 1) != 0) {
                    mpn mpn = (mpn) mkx.a.b();
                    if (!z || mpn.a()) {
                        String a2;
                        boolean z2;
                        LSCoreManagerWrapper lSCoreManagerWrapper = mpn.b;
                        if (z) {
                            mkx.a(lSCoreManagerWrapper);
                        }
                        ajxm ajxm = (ajxm) dVar;
                        mmi.d dVar2 = (mmi.d) ajxm.a;
                        Set set = (Set) ajxm.b;
                        miq miq = dVar2.b;
                        a aVar = new a(lSCoreManagerWrapper, dVar2, set, this);
                        if (miq instanceof defpackage.miq.c.a) {
                            a2 = mnp.a((defpackage.miq.c.a) miq);
                        } else if (miq instanceof defpackage.miq.d.a) {
                            a2 = ((defpackage.miq.d.a) miq).a();
                        } else {
                            z2 = false;
                            valueOf = Boolean.valueOf(z2);
                        }
                        z2 = aVar.a(a2);
                        valueOf = Boolean.valueOf(z2);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                        Object currentThread = Thread.currentThread();
                        akcr.a(currentThread, "currentThread()");
                        stringBuilder.append(currentThread.getId());
                        stringBuilder.append("] while expecting id [");
                        stringBuilder.append(mpn.a);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                    valueOf = this.i;
                }
                if (isEmpty != 0) {
                    long a3 = this.e.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a3);
                    }
                }
                return valueOf;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            public final Boolean a(mmi.d dVar) {
                return this.f ? d(dVar) : d(dVar);
            }

            public final ajdx<Boolean> b(final mmi.d dVar) {
                Object b;
                String str;
                if (this.c.isDisposed()) {
                    b = ajdx.b(this.i);
                    str = "Single.just(defaultValue)";
                } else {
                    b = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<Boolean> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(dVar));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(b, str);
                return b;
            }

            public final ajdp<R> c(mmi.d dVar) {
                return defpackage.mid.a.a(this, dVar);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.g);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.i);
                stringBuilder.append(", trace: ");
                stringBuilder.append(this.f);
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: mkp$a$b */
        public static final class b implements mid<mmi.d, Boolean> {
            final /* synthetic */ mid a;
            final /* synthetic */ a b;

            /* renamed from: mkp$a$b$c */
            static final class c<V> implements Callable<T> {
                private /* synthetic */ mmi.d a;
                private /* synthetic */ b b;

                c(mmi.d dVar, b bVar) {
                    this.a = dVar;
                    this.b = bVar;
                }

                public final /* synthetic */ Object call() {
                    Set a = this.b.b.a.a.a(this.a.a.a);
                    return a == null ? ajyy.a : a;
                }
            }

            /* renamed from: mkp$a$b$d */
            static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
                private /* synthetic */ defpackage.mmi.d a;
                private /* synthetic */ b b;

                d(defpackage.mmi.d dVar, b bVar) {
                    this.a = dVar;
                    this.b = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    defpackage.miq.d.a aVar;
                    final Set set = (Set) obj;
                    akcr.b(set, "oldDisposable");
                    Collection arrayList = new ArrayList();
                    for (miq miq : ajym.b((Object[]) new miq[]{this.a.b, this.a.f})) {
                        miq miq2;
                        if (!(miq2 instanceof defpackage.miq.d.a)) {
                            miq2 = null;
                        }
                        aVar = (defpackage.miq.d.a) miq2;
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    Iterable<defpackage.miq.d.a> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (defpackage.miq.d.a aVar2 : iterable) {
                        arrayList2.add(this.b.b.a.d.a(aVar2));
                    }
                    List list = (List) arrayList2;
                    ajdx b = list.isEmpty() ? ajdx.b((Object) ajyy.a) : list.size() == 1 ? ((ajdx) list.get(0)).f(new mkt(mkq.a)) : ajdx.a((Iterable) list, (ajfc) mkr.a);
                    return b.c((ajfb) new ajfb<Set<? extends ajej>>() {
                        public final /* synthetic */ void accept(Object obj) {
                            obj = (Set) obj;
                            akcr.a(obj, "newDisposable");
                            Iterable iterable = (Iterable) obj;
                            Object obj2 = set;
                            String str = "oldDisposable";
                            akcr.a(obj2, str);
                            Set b = ajyu.b(iterable, (Iterable) obj2);
                            obj2 = set;
                            akcr.a(obj2, str);
                            for (ajej dispose : ajzu.a((Set) obj2, (Iterable) b)) {
                                dispose.dispose();
                            }
                        }
                    });
                }
            }

            /* renamed from: mkp$a$b$a */
            static final class a<V> implements Callable<T> {
                private /* synthetic */ mmi.d a;
                private /* synthetic */ b b;

                a(mmi.d dVar, b bVar) {
                    this.a = dVar;
                    this.b = bVar;
                }

                public final /* synthetic */ Object call() {
                    Set a = this.b.b.a.a.a(this.a.a.a);
                    return a == null ? ajyy.a : a;
                }
            }

            /* renamed from: mkp$a$b$b */
            static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
                private /* synthetic */ mmi.d a;
                private /* synthetic */ b b;

                b(mmi.d dVar, b bVar) {
                    this.a = dVar;
                    this.b = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    defpackage.miq.d.a aVar;
                    final Set set = (Set) obj;
                    akcr.b(set, "oldDisposable");
                    Collection arrayList = new ArrayList();
                    for (miq miq : ajym.b((Object[]) new miq[]{this.a.b, this.a.f})) {
                        miq miq2;
                        if (!(miq2 instanceof defpackage.miq.d.a)) {
                            miq2 = null;
                        }
                        aVar = (defpackage.miq.d.a) miq2;
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    Iterable<defpackage.miq.d.a> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (defpackage.miq.d.a aVar2 : iterable) {
                        arrayList2.add(this.b.b.a.d.a(aVar2));
                    }
                    List list = (List) arrayList2;
                    ajdx b = list.isEmpty() ? ajdx.b((Object) ajyy.a) : list.size() == 1 ? ((ajdx) list.get(0)).f(new mkt(mkq.a)) : ajdx.a((Iterable) list, (ajfc) mkr.a);
                    return b.c((ajfb) new ajfb<Set<? extends ajej>>() {
                        public final /* synthetic */ void accept(Object obj) {
                            obj = (Set) obj;
                            akcr.a(obj, "newDisposable");
                            Iterable iterable = (Iterable) obj;
                            Object obj2 = set;
                            String str = "oldDisposable";
                            akcr.a(obj2, str);
                            Set b = ajyu.b(iterable, (Iterable) obj2);
                            obj2 = set;
                            akcr.a(obj2, str);
                            for (ajej dispose : ajzu.a((Set) obj2, (Iterable) b)) {
                                dispose.dispose();
                            }
                        }
                    });
                }
            }

            public b(mid mid, a aVar) {
                this.a = mid;
                this.b = aVar;
            }

            public final ajdp<min> a(long j, TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                return this.a.a(j, timeUnit);
            }

            public final Boolean a(mmi.d dVar) {
                mmi.d dVar2 = dVar;
                ajdx a = ajdx.c((Callable) new a(dVar2, this)).a((ajfc) new b(dVar2, this));
                akcr.a((Object) a, "Single.fromCallable<Set<…          }\n            }");
                return this.a.a(ajxs.a(dVar, mip.a(a, "DefaultFilterApplicator#updateResources").b()));
            }

            public final ajdx<Boolean> b(final mmi.d dVar) {
                mmi.d dVar2 = dVar;
                ajdx a = ajdx.c((Callable) new c(dVar2, this)).a((ajfc) new d(dVar2, this));
                akcr.a((Object) a, "Single.fromCallable<Set<…          }\n            }");
                Object a2 = mip.a(a, "DefaultFilterApplicator#updateResources").a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                    private /* synthetic */ b a;

                    public final /* synthetic */ Object apply(Object obj) {
                        return this.a.a.b(ajxs.a(dVar, obj));
                    }
                });
                akcr.a(a2, "prehookFactory(input)\n  …n.toSingle(input to it) }");
                return a2;
            }

            public final ajdp<Boolean> c(mmi.d dVar) {
                return defpackage.mid.a.a(this, dVar);
            }
        }

        a(mkp mkp) {
            this.a = mkp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new b(new a(this.a.c, "DefaultFilterApplicator#applyFilter", Boolean.FALSE, this), this);
        }
    }

    /* renamed from: mkp$d */
    static final class d extends akcs implements akbk<mid<? super Object, Boolean>> {
        final /* synthetic */ mkp a;

        /* renamed from: mkp$d$a */
        public static final class a implements mid<Object, Boolean> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = true;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;
            private /* synthetic */ d i;

            /* renamed from: mkp$d$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj, d dVar) {
                this.c = mkx;
                this.f = str;
                this.g = true;
                this.h = obj;
                this.i = dVar;
                this.a = new CopyOnWriteArrayList();
                this.d = mkx.c;
                this.b = mkx.d;
            }

            private final Boolean a() {
                Boolean valueOf;
                boolean z = true;
                int isEmpty = this.a.isEmpty() ^ 1;
                long a = isEmpty != 0 ? this.d.a(TimeUnit.MILLISECONDS) : 0;
                mkx mkx = this.c;
                boolean z2 = this.g;
                if ((mkx.isDisposed() ^ 1) != 0) {
                    mpn mpn = (mpn) mkx.a.b();
                    if (!z2 || mpn.a()) {
                        LSCoreManagerWrapper lSCoreManagerWrapper = mpn.b;
                        if (z2) {
                            mkx.a(lSCoreManagerWrapper);
                        }
                        if (lSCoreManagerWrapper.hasComplexEffect()) {
                            lSCoreManagerWrapper.removeAppliedComplexEffect();
                            mks.a(lSCoreManagerWrapper);
                            this.i.a.b.a(c.b.a);
                        } else {
                            z = false;
                        }
                        valueOf = Boolean.valueOf(z);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                        Object currentThread = Thread.currentThread();
                        akcr.a(currentThread, "currentThread()");
                        stringBuilder.append(currentThread.getId());
                        stringBuilder.append("] while expecting id [");
                        stringBuilder.append(mpn.a);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                    valueOf = this.h;
                }
                if (isEmpty != 0) {
                    long a2 = this.d.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a2);
                    }
                }
                return valueOf;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            public final Boolean a(Object obj) {
                return this.e ? a() : a();
            }

            public final ajdx<Boolean> b(final Object obj) {
                String str;
                if (this.c.isDisposed()) {
                    obj = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    obj = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<Boolean> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(obj));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(obj, str);
                return obj;
            }

            public final ajdp<R> c(Object obj) {
                return defpackage.mid.a.a(this, obj);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.h);
                stringBuilder.append(", trace: ");
                stringBuilder.append(this.e);
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }

        /* renamed from: mkp$d$b */
        public static final class b implements mid<Object, Boolean> {
            final /* synthetic */ d a;
            private final /* synthetic */ mid b;
            private /* synthetic */ mid c;

            /* renamed from: mkp$d$b$a */
            static final class a implements Runnable {
                private /* synthetic */ b a;

                a(b bVar) {
                    this.a = bVar;
                }

                public final void run() {
                    this.a.a.a.a.a((akbl) defpackage.mhn.a.a);
                }
            }

            public b(mid mid, d dVar) {
                this.c = mid;
                this.a = dVar;
                this.b = mid;
            }

            public final ajdp<min> a(long j, TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                return this.b.a(j, timeUnit);
            }

            public final Boolean a(Object obj) {
                obj = this.c.a(obj);
                Object b = ajcx.a((Runnable) new a(this)).b((ajdw) this.a.a.e.f());
                akcr.a(b, "Completable.fromRunnable…qualifiedSchedulers.io())");
                b.b();
                return obj;
            }

            public final ajdx<Boolean> b(final Object obj) {
                obj = this.c.b(obj).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                    final /* synthetic */ b a;

                    /* renamed from: mkp$d$b$1$a */
                    static final class a implements Runnable {
                        private /* synthetic */ 1 a;

                        a(1 1) {
                            this.a = 1;
                        }

                        public final void run() {
                            this.a.a.a.a.a.a((akbl) defpackage.mhn.a.a);
                        }
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        Object b = ajcx.a((Runnable) new a(this)).b((ajdw) this.a.a.a.e.f());
                        akcr.a(b, "Completable.fromRunnable…qualifiedSchedulers.io())");
                        return b.a(obj);
                    }
                });
                akcr.a(obj, "operation.toSingle(input…                        }");
                return obj;
            }

            public final ajdp<Boolean> c(Object obj) {
                return this.b.c(obj);
            }
        }

        d(mkp mkp) {
            this.a = mkp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new b(new a(this.a.c, "DefaultFilterApplicator#removeAppliedFilter", Boolean.FALSE, this), this);
        }
    }

    /* renamed from: mkp$c */
    static final class c extends akcs implements akbk<mid<? super Object, Boolean>> {
        private /* synthetic */ mkp a;

        /* renamed from: mkp$c$a */
        public static final class a implements mid<Object, Boolean> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = false;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;

            /* renamed from: mkp$c$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj) {
                this.c = mkx;
                this.f = str;
                this.g = true;
                this.h = obj;
                this.a = new CopyOnWriteArrayList();
                this.d = mkx.c;
                this.b = mkx.d;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            public final Boolean a(Object obj) {
                Boolean valueOf;
                int isEmpty = this.a.isEmpty() ^ 1;
                long a = isEmpty != 0 ? this.d.a(TimeUnit.MILLISECONDS) : 0;
                mkx mkx = this.c;
                boolean z = this.g;
                if ((mkx.isDisposed() ^ 1) != 0) {
                    mpn mpn = (mpn) mkx.a.b();
                    if (!z || mpn.a()) {
                        LSCoreManagerWrapper lSCoreManagerWrapper = mpn.b;
                        if (z) {
                            mkx.a(lSCoreManagerWrapper);
                        }
                        valueOf = Boolean.valueOf(lSCoreManagerWrapper.hasComplexEffect());
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                        Object currentThread = Thread.currentThread();
                        akcr.a(currentThread, "currentThread()");
                        stringBuilder.append(currentThread.getId());
                        stringBuilder.append("] while expecting id [");
                        stringBuilder.append(mpn.a);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                    valueOf = this.h;
                }
                if (isEmpty != 0) {
                    long a2 = this.d.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a2);
                    }
                }
                return valueOf;
            }

            public final ajdx<Boolean> b(final Object obj) {
                String str;
                if (this.c.isDisposed()) {
                    obj = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    obj = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<Boolean> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(obj));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(obj, str);
                return obj;
            }

            public final ajdp<R> c(Object obj) {
                return defpackage.mid.a.a(this, obj);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.h);
                stringBuilder.append(", trace: false]");
                return stringBuilder.toString();
            }
        }

        c(mkp mkp) {
            this.a = mkp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a.c, "DefaultFilterApplicator#hasAppliedFilter", Boolean.FALSE);
        }
    }

    /* renamed from: mkp$b */
    static final class b extends akcs implements akbk<ajdp<c>> {
        private /* synthetic */ mkp a;

        b(mkp mkp) {
            this.a = mkp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.f().j().c(0, TimeUnit.MILLISECONDS, this.a.e.b());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mkp.class), "applyFilter", "getApplyFilter()Lcom/snap/lenses/common/Operation;"), new akdc(akde.a(mkp.class), "removeAppliedFilter", "getRemoveAppliedFilter()Lcom/snap/lenses/common/Operation;"), new akdc(akde.a(mkp.class), "hasAppliedFilter", "getHasAppliedFilter()Lcom/snap/lenses/common/Operation;"), new akdc(akde.a(mkp.class), "filterLifecycle", "getFilterLifecycle()Lio/reactivex/Observable;")};
    }

    public mkp(mkx mkx, mka mka, zfw zfw) {
        akcr.b(mkx, "lensCore");
        akcr.b(mka, "coreResourceManager");
        akcr.b(zfw, "qualifiedSchedulers");
        this.c = mkx;
        this.d = mka;
        this.e = zfw;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<F…icator.FilterLifecycle>()");
        this.b = ajwl;
        mkx = this.c;
        ajej a = ajek.a((ajev) new 1(this));
        akcr.a((Object) a, "Disposables.fromAction {…nager.clearAndDispose() }");
        mkx.a(a);
        this.c.c(new 2(this));
        this.f = ajxh.a(ajxj.PUBLICATION, new a(this));
        this.g = ajxh.a(ajxj.PUBLICATION, new d(this));
        this.h = ajxh.a(ajxj.PUBLICATION, new c(this));
        this.i = ajxh.a(new b(this));
    }

    public static final /* synthetic */ boolean a(mkp mkp, mhs mhs) {
        c cVar = (c) mkp.b.p();
        return (cVar == null || !(cVar instanceof c.a)) ? false : akcr.a(((c.a) cVar).a, (Object) mhs);
    }

    public final mid<mmi.d, Boolean> a() {
        return (mid) this.f.b();
    }

    public final ajdp<c> b() {
        return (ajdp) this.i.b();
    }

    public final mid<Object, Boolean> c() {
        return (mid) this.h.b();
    }

    public final mid<Object, Boolean> d() {
        return (mid) this.g.b();
    }
}
