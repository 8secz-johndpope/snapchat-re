package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: isc */
public final class isc {
    private static final long e = TimeUnit.DAYS.toMillis(30);
    final aipn<ird> a;
    private final zfw b = zgb.a(irc.t.callsite("LongClientIdProvider"));
    private final ajei c = new ajei();
    private String d;

    /* renamed from: isc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: isc$b */
    static final class b implements Runnable {
        private /* synthetic */ isc a;
        private /* synthetic */ String b;

        b(isc isc, String str) {
            this.a = isc;
            this.b = str;
        }

        public final void run() {
            ((ird) this.a.a.get()).b(this.b);
            ((ird) this.a.a.get()).c(isc.c());
        }
    }

    static {
        a aVar = new a();
    }

    public isc(aipn<ird> aipn, zgb zgb) {
        akcr.b(aipn, "store");
        akcr.b(zgb, "schedulersProvider");
        this.a = aipn;
    }

    private final void a(String str) {
        this.c.a(ajcx.a((Runnable) new b(this, str)).b((ajdw) this.b.m()).e());
    }

    static long c() {
        Object akqy = new akqy();
        akcr.a(akqy, "DateTime.now()");
        return akqy.a;
    }

    private final String d() {
        Object uuid = UUID.randomUUID().toString();
        akcr.a(uuid, "UUID.randomUUID().toString()");
        a(uuid);
        return uuid;
    }

    public final synchronized String a() {
        String f;
        if (this.d == null) {
            f = ((ird) this.a.get()).f();
            long g = ((ird) this.a.get()).g();
            if (akgb.a(f) || isc.c() >= g + e) {
                f = d();
            }
            this.d = f;
        }
        f = this.d;
        if (f == null) {
            akcr.a();
        }
        return f;
    }

    public final synchronized void b() {
        this.d = d();
    }
}
