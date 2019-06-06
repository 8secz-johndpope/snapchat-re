package defpackage;

import defpackage.yfn.a;
import java.util.Collection;
import java.util.List;

/* renamed from: yfu */
final class yfu extends aing implements yfp {
    final List<ainb<?>> a = ainr.a();
    final aino b;
    private final yfv c;

    /* renamed from: yfu$e */
    static final class e extends akcq implements akcb<Long, String, Long, Long, a> {
        public static final e a = new e();

        e() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;JJ)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            long longValue2 = ((Number) obj3).longValue();
            long longValue3 = ((Number) obj4).longValue();
            akcr.b(str, "p2");
            return new a(longValue, str, longValue2, longValue3);
        }
    }

    /* renamed from: yfu$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ yfu b;

        /* renamed from: yfu$a$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindString(1, this.a.a);
                return ajxw.a;
            }
        }

        public a(yfu yfu, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "path");
            akcr.b(akbl, "mapper");
            this.b = yfu;
            super(yfu.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.b.executeQuery(Integer.valueOf(14), "SELECT * FROM journal WHERE path = ?1", 1, new a(this));
        }
    }

    /* renamed from: yfu$d */
    static final class d extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akcb a;

        d(akcb akcb) {
            this.a = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.a;
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            String string = ainn.getString(1);
            if (string == null) {
                akcr.a();
            }
            Long l2 = ainn.getLong(2);
            if (l2 == null) {
                akcr.a();
            }
            Long l3 = ainn.getLong(3);
            if (l3 == null) {
                akcr.a();
            }
            return akcb.invoke(l, string, l2, l3);
        }
    }

    /* renamed from: yfu$b */
    static final class b extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ long b = 0;
        private /* synthetic */ long c = 0;

        b(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            Long valueOf = Long.valueOf(0);
            ainp.bindLong(2, valueOf);
            ainp.bindLong(3, valueOf);
            return ajxw.a;
        }
    }

    /* renamed from: yfu$f */
    static final class f extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;
        private /* synthetic */ long b;
        private /* synthetic */ long c;

        f(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            ainp.bindLong(2, Long.valueOf(this.b));
            ainp.bindLong(3, Long.valueOf(this.c));
            return ajxw.a;
        }
    }

    /* renamed from: yfu$c */
    static final class c extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;

        c(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            return ajxw.a;
        }
    }

    public yfu(yfv yfv, aino aino) {
        akcr.b(yfv, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.c = yfv;
        this.b = aino;
    }

    public final ainb<yfn> a(String str) {
        String str2 = "path";
        akcr.b(str, str2);
        akcb akcb = e.a;
        akcr.b(str, str2);
        akcr.b(akcb, "mapper");
        return new a(this, str, new d(akcb));
    }

    public final void a(long j, long j2, long j3) {
        this.b.execute(Integer.valueOf(16), "UPDATE journal SET size = ?1, locked_size = ?2 WHERE _id = ?3", 3, new f(j, j2, j3));
        a(ajyu.d((Collection) this.c.b.a, (Iterable) this.c.a.a));
    }

    public final void b(String str) {
        akcr.b(str, "path");
        this.b.execute(Integer.valueOf(15), "INSERT INTO journal(path, size, locked_size) VALUES(?1, ?2, ?3)", 3, new b(str));
        a(ajyu.d((Collection) this.c.b.a, (Iterable) this.c.a.a));
    }

    public final void c(String str) {
        akcr.b(str, "path");
        this.b.execute(Integer.valueOf(17), "DELETE FROM journal WHERE path = ?1", 1, new c(str));
        a(ajyu.d((Collection) this.c.b.a, (Iterable) this.c.a.a));
    }
}
