package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: imp */
public final class imp implements ilw {
    private final ajwo<ajxw> a;
    private final ajei b = new ajei();
    private String c = "";
    private final ajdw d;
    private final aipn<ini> e;
    private final aipn<imz> f;

    /* renamed from: imp$1 */
    static final class 1<T> implements ajfb<ajxw> {
        private /* synthetic */ imp a;

        1(imp imp) {
            this.a = imp;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    /* renamed from: imp$a */
    static final class a<T> implements ajfb<akxa<Void>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: imp$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public imp(ajdw ajdw, aipn<ini> aipn, aipn<imz> aipn2) {
        akcr.b(ajdw, "concurrentScheduler");
        akcr.b(aipn, "metricProcessor");
        akcr.b(aipn2, "grapheneUploader");
        this.d = ajdw;
        this.e = aipn;
        this.f = aipn2;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Unit>()");
        this.a = ajwo;
        ajej l = this.a.b(this.d).e(30, TimeUnit.SECONDS, this.d).d((ajfb) new 1(this)).l();
        akcr.a((Object) l, "flushSubject\n           …             .subscribe()");
        ajvv.a(l, this.b);
    }

    public final synchronized void a() {
        byte[] a = ((ini) this.e.get()).a(this.c);
        if (a != null) {
            imz imz = (imz) this.f.get();
            Object uuid = iig.a().toString();
            akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
            ajej a2 = imz.a(a, uuid).a((ajfb) a.a, (ajfb) b.a);
            akcr.a((Object) a2, "grapheneUploader.get().f…ed to flush metrics.\") })");
            ajvv.a(a2, this.b);
        }
    }

    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.c = str;
    }

    public final void b() {
        this.a.a(ajxw.a);
    }
}
