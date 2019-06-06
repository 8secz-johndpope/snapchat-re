package defpackage;

import defpackage.iai.a;
import java.util.Collection;
import java.util.List;

/* renamed from: iaq */
final class iaq extends aing implements iae {
    final List<ainb<?>> a = ainr.a();
    final aino b;
    private final List<ainb<?>> c = ainr.a();
    private final List<ainb<?>> d = ainr.a();
    private final iao e;

    /* renamed from: iaq$b */
    static final class b extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ Long a;

        b(Long l) {
            this.a = l;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, this.a);
            return ajxw.a;
        }
    }

    /* renamed from: iaq$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ iaq b;

        /* renamed from: iaq$a$a */
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

        public a(iaq iaq, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "snap_id");
            akcr.b(akbl, "mapper");
            this.b = iaq;
            super(iaq.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.b.executeQuery(Integer.valueOf(103), akfu.a("\n        |SELECT *\n        |FROM fidelius_snap_encryption_key_table\n        |WHERE snap_id = ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: iaq$c */
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

    /* renamed from: iaq$d */
    static final class d extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akca a;

        d(akca akca) {
            this.a = akca;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akca akca = this.a;
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return akca.invoke(string, ainn.getString(1), ainn.getLong(2));
        }
    }

    /* renamed from: iaq$f */
    static final class f extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;
        private /* synthetic */ Long c;

        f(String str, String str2, Long l) {
            this.a = str;
            this.b = str2;
            this.c = l;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            ainp.bindString(2, this.b);
            ainp.bindLong(3, this.c);
            return ajxw.a;
        }
    }

    /* renamed from: iaq$e */
    static final class e extends akcq implements akca<String, String, Long, a> {
        public static final e a = new e();

        e() {
            super(3);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            Long l = (Long) obj3;
            akcr.b(str, "p1");
            return new a(str, str2, l);
        }
    }

    public iaq(iao iao, aino aino) {
        akcr.b(iao, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.e = iao;
        this.b = aino;
    }

    public final ainb<iai> a(String str) {
        String str2 = "snap_id";
        akcr.b(str, str2);
        akca akca = e.a;
        akcr.b(str, str2);
        akcr.b(akca, "mapper");
        return new a(this, str, new d(akca));
    }

    public final void a(Long l) {
        this.b.execute(Integer.valueOf(108), akfu.a("\n        |DELETE FROM fidelius_snap_encryption_key_table\n        |WHERE snap_timestamp <= ?1\n        ", "|"), 1, new b(l));
        a(ajyu.d((Collection) ajyu.d((Collection) this.e.b.a, (Iterable) this.e.b.c), (Iterable) this.e.b.d));
    }

    public final void a(String str, String str2, Long l) {
        akcr.b(str, "snap_id");
        this.b.execute(Integer.valueOf(106), akfu.a("\n        |INSERT OR REPLACE INTO fidelius_snap_encryption_key_table (\n        |    snap_id,\n        |    snap_key,\n        |    snap_timestamp\n        |)\n        |VALUES(?1,?2,?3)\n        ", "|"), 3, new f(str, str2, l));
        a(ajyu.d((Collection) ajyu.d((Collection) this.e.b.a, (Iterable) this.e.b.c), (Iterable) this.e.b.d));
    }

    public final void b(String str) {
        akcr.b(str, "snap_id");
        this.b.execute(Integer.valueOf(107), akfu.a("\n        |DELETE FROM fidelius_snap_encryption_key_table\n        |WHERE snap_id = ?1\n        ", "|"), 1, new c(str));
        a(ajyu.d((Collection) ajyu.d((Collection) this.e.b.a, (Iterable) this.e.b.c), (Iterable) this.e.b.d));
    }
}
