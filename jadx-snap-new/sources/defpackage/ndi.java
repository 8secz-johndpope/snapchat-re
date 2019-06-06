package defpackage;

import defpackage.ndj.b;
import java.util.concurrent.TimeUnit;

/* renamed from: ndi */
public final class ndi implements ndg {
    final aipn<ndj> a;
    private final ajdw b;
    private final ajws<Boolean> c;
    private final ajws<Boolean> d;
    private final aipn<ajei> e;

    /* renamed from: ndi$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: ndi$1 */
    static final class 1<T1, T2, T3, T4, R> implements ajfe<Boolean, Boolean, Long, Boolean, a> {
        public static final 1 a = new 1();

        1() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            long longValue = ((Number) obj3).longValue();
            ((Boolean) obj4).booleanValue();
            return new a(booleanValue, booleanValue2, longValue);
        }
    }

    /* renamed from: ndi$2 */
    static final class 2<T, R> implements ajfc<T, R> {
        private /* synthetic */ ndi a;

        2(ndi ndi) {
            this.a = ndi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            return !((ncc) ((ndj) this.a.a.get()).b.get()).a() ? ndl.a : !aVar.a ? ndl.a : aVar.b ? ndl.a : new ndu(ndy.START, Long.valueOf(aVar.c));
        }
    }

    /* renamed from: ndi$3 */
    static final class 3<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ndi a;

        3(ndi ndi) {
            this.a = ndi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ndu ndu = (ndu) obj;
            akcr.b(ndu, "it");
            ndj ndj = (ndj) this.a.a.get();
            akcr.b(ndu, "pollerState");
            int i = ndk.a[ndu.a.ordinal()];
            String str = "Observable.empty()";
            if (i == 1) {
                obj = ajvo.a(ajot.a);
                akcr.a(obj, str);
                return obj;
            } else if (i == 2) {
                Long l = ndu.b;
                if (l != null) {
                    obj = ajdp.a(0, l.longValue(), TimeUnit.MILLISECONDS).u(new b(ndj)).b(ndj.a);
                    akcr.a(obj, "Observable.interval(0, i…       .subscribeOn(idle)");
                    return obj;
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, str);
                return obj;
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: ndi$4 */
    static final class 4<T> implements ajfb<ajxw> {
        public static final 4 a = new 4();

        4() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ndi$5 */
    static final class 5<T> implements ajfb<Throwable> {
        public static final 5 a = new 5();

        5() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ndi$a */
    static final class a {
        final boolean a;
        final boolean b;
        final long c;

        public a(boolean z, boolean z2, long j) {
            this.a = z;
            this.b = z2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) != null) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            if ((this.c == aVar.c ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            boolean z = this.b;
            if (!z) {
                i2 = z;
            }
            i = (i + i2) * 31;
            long j = this.c;
            return i + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CombinedStatus(locationStarted=");
            stringBuilder.append(this.a);
            stringBuilder.append(", inMap=");
            stringBuilder.append(this.b);
            stringBuilder.append(", serverUpdateInterval=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static {
        b bVar = new b();
    }

    public ndi(aipn<ajei> aipn, aipn<ncx> aipn2, aipn<ide> aipn3, aipn<zgb> aipn4, nco nco, aipn<ndj> aipn5) {
        akcr.b(aipn, "compositeDisposable");
        akcr.b(aipn2, "mapLocationManager");
        akcr.b(aipn3, "attributedFeature");
        akcr.b(aipn4, "schedulersProvider");
        akcr.b(nco, "serverIntervalManager");
        akcr.b(aipn5, "gpsStateResolver");
        this.e = aipn;
        this.a = aipn5;
        aipn4.get();
        this.b = zgb.a(((ide) aipn3.get()).callsite("GpsPollerImpl")).j();
        Object r = ajwl.i(Boolean.FALSE).r();
        akcr.a(r, "BehaviorSubject.createDe…an>(false).toSerialized()");
        this.c = r;
        r = ajwl.i(Boolean.FALSE).r();
        akcr.a(r, "BehaviorSubject.createDe…ult(false).toSerialized()");
        this.d = r;
        ajej a = ajdp.a((ajdt) this.c, (ajdt) ((ncx) aipn2.get()).a(), (ajdt) nco.a, (ajdt) this.d, (ajfe) 1.a).a(this.b).p(new 2(this)).j(ajfu.a).u(new 3(this)).a((ajfb) 4.a, (ajfb) 5.a);
        Object obj = this.e.get();
        akcr.a(obj, "compositeDisposable.get()");
        igk.a(a, (ajfo) obj);
    }

    public final void a() {
        this.d.a((Object) Boolean.TRUE);
    }

    public final void a(String str) {
        akcr.b(str, "tag");
        this.c.a((Object) Boolean.TRUE);
    }

    public final void b(String str) {
        akcr.b(str, "tag");
        this.c.a((Object) Boolean.FALSE);
    }
}
