package defpackage;

import defpackage.iaj.a;
import java.util.Collection;
import java.util.List;

/* renamed from: iar */
final class iar extends aing implements iaf {
    final List<ainb<?>> a = ainr.a();
    final aino b;
    private final List<ainb<?>> c = ainr.a();
    private final iao d;

    /* renamed from: iar$f */
    static final class f extends akcq implements akbw<String, String, a> {
        public static final f a = new f();

        f() {
            super(2);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new a((String) obj, (String) obj2);
        }
    }

    /* renamed from: iar$e */
    static final class e extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akbw a;

        e(akbw akbw) {
            this.a = akbw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            return this.a.invoke(ainn.getString(0), ainn.getString(1));
        }
    }

    /* renamed from: iar$g */
    static final class g extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;

        g(String str, String str2) {
            this.a = str;
            this.b = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            ainp.bindString(2, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: iar$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ iar b;

        /* renamed from: iar$a$a */
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

        public a(iar iar, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.b = iar;
            super(iar.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            aino aino = this.b.b;
            StringBuilder stringBuilder = new StringBuilder("\n        |SELECT *\n        |FROM fidelius_user_device_table\n        |WHERE hashed_out_beta ");
            stringBuilder.append(this.a == null ? "IS" : "=");
            stringBuilder.append(" ?1\n        ");
            return aino.executeQuery(null, akfu.a(stringBuilder.toString(), "|"), 1, new a(this));
        }
    }

    /* renamed from: iar$b */
    static final class b extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;

        b(String str) {
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

    /* renamed from: iar$c */
    static final class c extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akbw a;

        c(akbw akbw) {
            this.a = akbw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            return this.a.invoke(ainn.getString(0), ainn.getString(1));
        }
    }

    /* renamed from: iar$d */
    static final class d extends akcq implements akbw<String, String, a> {
        public static final d a = new d();

        d() {
            super(2);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new a((String) obj, (String) obj2);
        }
    }

    public iar(iao iao, aino aino) {
        akcr.b(iao, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.d = iao;
        this.b = aino;
    }

    public final ainb<iaj> a() {
        akbw akbw = f.a;
        akcr.b(akbw, "mapper");
        return ainc.a(91, this.c, this.b, akfu.a("\n    |SELECT *\n    |FROM fidelius_user_device_table\n    ", "|"), new e(akbw));
    }

    public final ainb<iaj> a(String str) {
        akbw akbw = d.a;
        akcr.b(akbw, "mapper");
        return new a(this, str, new c(akbw));
    }

    public final void a(String str, String str2) {
        this.b.execute(Integer.valueOf(92), akfu.a("\n        |INSERT OR REPLACE INTO fidelius_user_device_table (\n        |    hashed_out_beta,\n        |    database_name\n        |)\n        |VALUES(?1,?2)\n        ", "|"), 2, new g(str, str2));
        a(ajyu.d((Collection) this.d.c.a, (Iterable) this.d.c.c));
    }

    public final void b() {
        this.b.execute(Integer.valueOf(94), "DELETE FROM fidelius_user_device_table", 0, null);
        a(ajyu.d((Collection) this.d.c.a, (Iterable) this.d.c.c));
    }

    public final void b(String str) {
        aino aino = this.b;
        StringBuilder stringBuilder = new StringBuilder("\n        |DELETE FROM fidelius_user_device_table\n        |WHERE hashed_out_beta ");
        stringBuilder.append(str == null ? "IS" : "=");
        stringBuilder.append(" ?1\n        ");
        aino.execute(null, akfu.a(stringBuilder.toString(), "|"), 1, new b(str));
        a(ajyu.d((Collection) this.d.c.a, (Iterable) this.d.c.c));
    }
}
