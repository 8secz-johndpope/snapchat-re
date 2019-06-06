package defpackage;

import com.snap.core.db.record.UploadedMediaModel;
import defpackage.ohp.a;
import java.util.List;

/* renamed from: ohu */
final class ohu extends aing implements ohl {
    final List<ainb<?>> a = ainr.a();
    final aino b;
    private final oht c;

    /* renamed from: ohu$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ ohu b;

        /* renamed from: ohu$a$a */
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

        public a(ohu ohu, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "lookup_uri");
            akcr.b(akbl, "mapper");
            this.b = ohu;
            super(ohu.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.b.executeQuery(Integer.valueOf(3), akfu.a("\n        |SELECT *\n        |FROM media_package_file_lookup\n        |WHERE lookup_uri = ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: ohu$b */
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

    /* renamed from: ohu$c */
    static final class c extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            ainp.bindString(2, this.b);
            ainp.bindString(3, this.c);
            return ajxw.a;
        }
    }

    /* renamed from: ohu$d */
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
            String string2 = ainn.getString(2);
            if (string2 == null) {
                akcr.a();
            }
            String string3 = ainn.getString(3);
            if (string3 == null) {
                akcr.a();
            }
            return akcb.invoke(l, string, string2, string3);
        }
    }

    /* renamed from: ohu$e */
    static final class e extends akcq implements akcb<Long, String, String, String, a> {
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
            return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            akcr.b(str, "p2");
            akcr.b(str2, "p3");
            akcr.b(str3, "p4");
            return new a(longValue, str, str2, str3);
        }
    }

    public ohu(oht oht, aino aino) {
        akcr.b(oht, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.c = oht;
        this.b = aino;
    }

    public final ainb<ohp> a(String str) {
        String str2 = "lookup_uri";
        akcr.b(str, str2);
        akcb akcb = e.a;
        akcr.b(str, str2);
        akcr.b(akcb, "mapper");
        return new a(this, str, new d(akcb));
    }

    public final void a(String str, String str2, String str3) {
        akcr.b(str, UploadedMediaModel.SESSION_ID);
        akcr.b(str2, "file_uri");
        akcr.b(str3, "lookup_uri");
        this.b.execute(Integer.valueOf(4), akfu.a("\n        |INSERT OR REPLACE INTO media_package_file_lookup (\n        |    session_id,\n        |    file_uri,\n        |    lookup_uri\n        |)\n        |VALUES(?1,?2,?3)\n        ", "|"), 3, new c(str, str2, str3));
        a(this.c.b.a);
    }

    public final void b(String str) {
        akcr.b(str, UploadedMediaModel.SESSION_ID);
        this.b.execute(Integer.valueOf(5), akfu.a("\n        |DELETE FROM media_package_file_lookup\n        |WHERE session_id = ?1\n        ", "|"), 1, new b(str));
        a(this.c.b.a);
    }
}
