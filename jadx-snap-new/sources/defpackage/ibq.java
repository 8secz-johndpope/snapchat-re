package defpackage;

import com.snap.fidelius.impl.FetchFideliusUpdatesDurableJob;

/* renamed from: ibq */
public final class ibq implements hzb {
    final ajwy<hyk> a;
    final ajwy<gqr> b;
    private final ajwy<hwl> c;

    /* renamed from: ibq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ibq$b */
    static final class b implements ajev {
        public static final b a = new b();

        b() {
        }

        public final void run() {
        }
    }

    /* renamed from: ibq$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ ibq a;

        c(ibq ibq) {
            this.a = ibq;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            ((hyk) this.a.a.get()).a("fetch_updates_error", abmt.a(obj));
            gqr gqr = (gqr) this.a.b.get();
            gqt gqt = gqt.NORMAL;
            akcr.a(obj, "it");
            gqr.a(gqt, obj, hyn.a.callsite("MushroomFideliusUpdatesFetcher"));
        }
    }

    static {
        a aVar = new a();
    }

    public ibq(ajwy<hwl> ajwy, ajwy<hyk> ajwy2, ajwy<gqr> ajwy3) {
        akcr.b(ajwy, "durableJobManagerProvider");
        akcr.b(ajwy2, "fideliusEventLoggerProvider");
        akcr.b(ajwy3, "exceptionTrackerProvider");
        this.c = ajwy;
        this.a = ajwy2;
        this.b = ajwy3;
    }

    public final ajej a(String str) {
        String str2 = "myOutBeta";
        akcr.b(str, str2);
        hwl hwl = (hwl) this.c.get();
        akcr.b(str, str2);
        Object a = hwl.a((hwg) new FetchFideliusUpdatesDurableJob(new iau(str))).a((ajev) b.a, (ajfb) new c(this));
        akcr.a(a, "durableJobManagerProvide…(TAG))\n                })");
        return a;
    }
}
