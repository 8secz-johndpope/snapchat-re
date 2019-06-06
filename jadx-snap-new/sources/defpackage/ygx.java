package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ygx */
public class ygx {
    public final ajei a = new ajei();
    public final ajwl<ygy> b;
    public final ajwl<Long> c;
    public final ajwl<ygv> d;
    public final ConcurrentHashMap<String, ygu> e;
    public final zfw f;
    final ajxe g;
    long h;
    private ygw i;
    private final zfy j;
    private final ihh k;

    /* renamed from: ygx$f */
    static final class f extends akcs implements akbk<ygs> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ygs();
        }
    }

    /* renamed from: ygx$a */
    public static final class a<V> implements Callable<T> {
        private /* synthetic */ ygx a;

        public a(ygx ygx) {
            this.a = ygx;
        }

        public final /* synthetic */ Object call() {
            this.a.g.b();
            return Long.valueOf(ygs.c());
        }
    }

    /* renamed from: ygx$b */
    public static final class b<T> implements ajfb<Long> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ygx$c */
    public static final class c<T> implements ajfb<Long> {
        private /* synthetic */ ygx a;

        public c(ygx ygx) {
            this.a = ygx;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            ygx ygx = this.a;
            akcr.a(obj, "availableBytes");
            ygx.a(obj.longValue(), 0);
        }
    }

    /* renamed from: ygx$d */
    public static final class d<T> implements ajfb<ygv> {
        private /* synthetic */ ygx a;

        public d(ygx ygx) {
            this.a = ygx;
        }

        public final /* synthetic */ void accept(Object obj) {
            ygv ygv = (ygv) obj;
            String str = ygv.a;
            ygu ygu = (ygu) this.a.e.get(str);
            if (ygu != null) {
                ygu.a++;
                if (ygv.b) {
                    ygu.b++;
                }
            }
            if (this.a.e.get(str) == null) {
                this.a.e.put(str, new ygu(str, ygv.b));
            }
        }
    }

    /* renamed from: ygx$e */
    public static final class e<T> implements ajfb<Long> {
        private /* synthetic */ ygx a;

        public e(ygx ygx) {
            this.a = ygx;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Long) obj;
            ygx ygx = this.a;
            long j = ygx.h;
            akcr.a(obj, "it");
            ygx.a(j, obj.longValue());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ygx.class), "storageInformation", "getStorageInformation()Lcom/snap/storage/io/StorageInformation;");
    }

    public ygx(zfy zfy, ihh ihh) {
        akcr.b(zfy, "qualifiedSchedulersProvider");
        akcr.b(ihh, "clock");
        this.j = zfy;
        this.k = ihh;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<StorageStateUpdate>()");
        this.b = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Long>()");
        this.c = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<FileGroupCacheUpdate>()");
        this.d = ajwl;
        this.e = new ConcurrentHashMap();
        ajwl = zfy.a(yet.a.callsite("StorageStateMonitorRx"));
        akcr.a(ajwl, "qualifiedSchedulersProvi…gerFeature.callsite(TAG))");
        this.f = ajwl;
        this.g = ajxh.a(f.a);
        this.h = -1;
        this.i = ygw.NOT_INITIALIZED;
    }

    public final void a(long j, long j2) {
        if (j != -1) {
            this.h = j - j2;
            j = ygs.a(this.h);
            ygw ygw = (0 <= j && 40 >= j) ? ygw.EMERGENCY : (41 <= j && 200 >= j) ? ygw.LOW : (201 <= j && 500 >= j) ? ygw.MEDIUM : ygw.NORMAL;
            this.i = ygw;
            this.b.a(new ygy(ygw, this.k.c()));
        }
    }
}
