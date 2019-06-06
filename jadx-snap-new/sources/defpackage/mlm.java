package defpackage;

import com.brightcove.player.event.Event;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.ScreenZone;
import com.looksery.sdk.domain.ScreenZoneInfo;
import defpackage.mop.a;
import defpackage.mop.b.b;
import defpackage.mop.b.c;
import defpackage.mop.b.d;
import defpackage.mop.b.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: mlm */
public final class mlm implements mop {
    final mkx a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: mlm$a */
    static final class a extends akcs implements akbk<mid<? super defpackage.mop.a, ajxw>> {
        private /* synthetic */ mlm a;

        /* renamed from: mlm$a$a */
        public static final class a implements mid<defpackage.mop.a, ajxw> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = false;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;

            /* renamed from: mlm$a$a$2 */
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

            public final ajxw a(defpackage.mop.a aVar) {
                ajxw ajxw;
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
                        aVar = aVar;
                        abpq abpq = aVar.b;
                        lSCoreManagerWrapper.setInputImageSize(abpq.a(), abpq.b());
                        abpq = aVar.c;
                        lSCoreManagerWrapper.setScreenSize(abpq.a(), abpq.b());
                        Iterable<Object> iterable = aVar.a;
                        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                        for (Object obj : iterable) {
                            Object obj2;
                            ScreenZone screenZone;
                            if (akcr.a(obj2, b.a)) {
                                screenZone = ScreenZone.FULL_FRAME;
                            } else if (akcr.a(obj2, defpackage.mop.b.a.a)) {
                                screenZone = ScreenZone.CAPTURE;
                            } else if (akcr.a(obj2, c.a)) {
                                screenZone = ScreenZone.PREVIEW;
                            } else {
                                ScreenZoneInfo screenZoneInfo;
                                if (obj2 instanceof d) {
                                    d dVar = (d) obj2;
                                    screenZoneInfo = new ScreenZoneInfo(ScreenZone.ROUND_BUTTON, dVar.a, dVar.b, dVar.c, dVar.d, dVar.e);
                                } else if (obj2 instanceof e) {
                                    e eVar = (e) obj2;
                                    screenZoneInfo = new ScreenZoneInfo(ScreenZone.TOP_BAR, eVar.a, eVar.b, eVar.c, eVar.d, eVar.e);
                                } else {
                                    throw new ajxk();
                                }
                                obj2 = r6;
                                arrayList.add(obj2);
                            }
                            obj2 = mln.a(screenZone);
                            arrayList.add(obj2);
                        }
                        Object[] toArray = ((List) arrayList).toArray(new ScreenZoneInfo[0]);
                        if (toArray != null) {
                            lSCoreManagerWrapper.updateScreenZonesInfo((ScreenZoneInfo[]) toArray);
                            ajxw = ajxw.a;
                        } else {
                            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                    Object currentThread = Thread.currentThread();
                    akcr.a(currentThread, "currentThread()");
                    stringBuilder.append(currentThread.getId());
                    stringBuilder.append("] while expecting id [");
                    stringBuilder.append(mpn.a);
                    stringBuilder.append(']');
                    throw new IllegalStateException(stringBuilder.toString());
                }
                ajxw = null;
                if (ajxw == null) {
                    ajxw = this.h;
                }
                if (isEmpty != 0) {
                    long a2 = this.d.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a2);
                    }
                }
                return ajxw;
            }

            public final ajdx<ajxw> b(final defpackage.mop.a aVar) {
                Object b;
                String str;
                if (this.c.isDisposed()) {
                    b = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    b = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<ajxw> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(aVar));
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

            public final ajdp<R> c(defpackage.mop.a aVar) {
                return defpackage.mid.a.a(this, aVar);
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

        a(mlm mlm) {
            this.a = mlm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a.a, "DefaultScreenZonesProcessor#process", ajxw.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mlm.class), "process", "getProcess()Lcom/snap/lenses/common/Operation;");
    }

    public mlm(mkx mkx) {
        akcr.b(mkx, "lensCore");
        this.a = mkx;
    }

    public final mid<a, ajxw> a() {
        return (mid) this.b.b();
    }
}
