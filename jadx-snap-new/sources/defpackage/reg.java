package defpackage;

/* renamed from: reg */
public final class reg {
    Long a;
    private final ajei b;
    private final ftl c;
    private final ihh d;
    private final gpb e;

    /* renamed from: reg$1 */
    static final class 1<T> implements ajfb<gpa> {
        private /* synthetic */ reg a;

        1(reg reg) {
            this.a = reg;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            gpa gpa = (gpa) obj;
            reg reg = this.a;
            abkq abkq = gpa.a;
            reg.a = abkq != null ? abkq.p : null;
        }
    }

    public reg(ajei ajei, ftl ftl, ihh ihh, gpb gpb) {
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(ftl, "configurationProvider");
        akcr.b(ihh, "clock");
        akcr.b(gpb, "userAuthStore");
        this.b = ajei;
        this.c = ftl;
        this.d = ihh;
        this.e = gpb;
        Object f = this.e.f().f((ajfb) new 1(this));
        akcr.a(f, "userAuthStore.observeUse…reatedTimestamp\n        }");
        std.a(f, this.b);
    }

    private final long c() {
        Object a = akre.a(this.c.h(qyi.SHOW_NEWLY_ADDED_FRIENDS_IN_FEED_CUTOFF_DAYS));
        akcr.a(a, "Duration.standardDays(days)");
        return a.b;
    }

    public final boolean a() {
        return b() < this.d.a();
    }

    public final long b() {
        Long l = this.a;
        return l == null ? 0 : l.longValue() + c();
    }
}
