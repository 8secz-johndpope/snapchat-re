package defpackage;

import defpackage.iak.a;
import java.util.Collection;
import java.util.List;

/* renamed from: ias */
final class ias extends aing implements iag {
    final List<ainb<?>> a = ainr.a();
    final aino b;
    private final List<ainb<?>> c = ainr.a();
    private final iao d;

    /* renamed from: ias$c */
    static final class c extends akcq implements akca<String, byte[], byte[], a> {
        public static final c a = new c();

        c() {
            super(3);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;[B[B)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            byte[] bArr = (byte[]) obj2;
            byte[] bArr2 = (byte[]) obj3;
            akcr.b(str, "p1");
            return new a(str, bArr, bArr2);
        }
    }

    /* renamed from: ias$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ ias b;

        /* renamed from: ias$a$a */
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

        public a(ias ias, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "hashed_beta");
            akcr.b(akbl, "mapper");
            this.b = ias;
            super(ias.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.b.executeQuery(Integer.valueOf(109), akfu.a("\n        |SELECT *\n        |FROM fidelius_user_identity\n        |WHERE hashed_beta = ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: ias$b */
    static final class b extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akca a;

        b(akca akca) {
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
            return akca.invoke(string, ainn.getBytes(1), ainn.getBytes(2));
        }
    }

    /* renamed from: ias$d */
    static final class d extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ byte[] b;
        private /* synthetic */ byte[] c;

        d(String str, byte[] bArr, byte[] bArr2) {
            this.a = str;
            this.b = bArr;
            this.c = bArr2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            ainp.bindBytes(2, this.b);
            ainp.bindBytes(3, this.c);
            return ajxw.a;
        }
    }

    public ias(iao iao, aino aino) {
        akcr.b(iao, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.d = iao;
        this.b = aino;
    }

    public final ainb<iak> a(String str) {
        String str2 = "hashed_beta";
        akcr.b(str, str2);
        akca akca = c.a;
        akcr.b(str, str2);
        akcr.b(akca, "mapper");
        return new a(this, str, new b(akca));
    }

    public final void a(String str, byte[] bArr, byte[] bArr2) {
        akcr.b(str, "hashed_beta");
        this.b.execute(Integer.valueOf(111), akfu.a("\n        |INSERT OR REPLACE INTO fidelius_user_identity (\n        |    hashed_beta,\n        |    out_beta,\n        |    in_beta\n        |)\n        |VALUES(?1,?2,?3)\n        ", "|"), 3, new d(str, bArr, bArr2));
        a(ajyu.d((Collection) this.d.d.a, (Iterable) this.d.d.c));
    }
}
