package defpackage;

import defpackage.iah.a;
import java.util.Collection;
import java.util.List;

/* renamed from: iap */
final class iap extends aing implements iad {
    final List<ainb<?>> a = ainr.a();
    final List<ainb<?>> b = ainr.a();
    final List<ainb<?>> c = ainr.a();
    final aino d;
    private final List<ainb<?>> e = ainr.a();
    private final List<ainb<?>> f = ainr.a();
    private final iao g;

    /* renamed from: iap$o */
    static final class o extends akcq implements akcb<String, String, byte[], Long, a> {
        public static final o a = new o();

        o() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            byte[] bArr = (byte[]) obj3;
            Long l = (Long) obj4;
            akcr.b(str, "p1");
            return new a(str, str2, bArr, l);
        }
    }

    /* renamed from: iap$n */
    static final class n extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akcb a;

        n(akcb akcb) {
            this.a = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.a;
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return akcb.invoke(string, ainn.getString(1), ainn.getBytes(2), ainn.getLong(3));
        }
    }

    /* renamed from: iap$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ iap b;

        /* renamed from: iap$a$a */
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

        public a(iap iap, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "their_out_beta");
            akcr.b(akbl, "mapper");
            this.b = iap;
            super(iap.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.d.executeQuery(Integer.valueOf(95), akfu.a("\n        |SELECT *\n        |FROM fidelius_friend_device_info\n        |WHERE their_out_beta = ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: iap$b */
    final class b<T> extends ainb<T> {
        final String a;
        private /* synthetic */ iap b;

        /* renamed from: iap$b$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindString(1, this.a.a);
                return ajxw.a;
            }
        }

        public b(iap iap, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.b = iap;
            super(iap.b, akbl);
            this.a = str;
        }

        public final ainn a() {
            aino aino = this.b.d;
            StringBuilder stringBuilder = new StringBuilder("\n        |SELECT *\n        |FROM fidelius_friend_device_info\n        |WHERE user_id ");
            stringBuilder.append(this.a == null ? "IS" : "=");
            stringBuilder.append(" ?1\n        ");
            return aino.executeQuery(null, akfu.a(stringBuilder.toString(), "|"), 1, new a(this));
        }
    }

    /* renamed from: iap$c */
    final class c<T> extends ainb<T> {
        final Collection<String> a;
        private /* synthetic */ iap b;

        /* renamed from: iap$c$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                int i = 0;
                for (Object next : this.a.a) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ajym.a();
                    }
                    ainp.bindString(i2, (String) next);
                    i = i2;
                }
                return ajxw.a;
            }
        }

        public c(iap iap, Collection<String> collection, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(collection, "user_id");
            akcr.b(akbl, "mapper");
            this.b = iap;
            super(iap.c, akbl);
            this.a = collection;
        }

        public final ainn a() {
            String a = aing.a(this.a.size(), 1);
            aino aino = this.b.d;
            StringBuilder stringBuilder = new StringBuilder("\n            |SELECT *\n            |FROM fidelius_friend_device_info\n            |WHERE user_id IN ");
            stringBuilder.append(a);
            stringBuilder.append("\n            ");
            return aino.executeQuery(null, akfu.a(stringBuilder.toString(), "|"), this.a.size(), new a(this));
        }
    }

    /* renamed from: iap$d */
    static final class d extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;

        d(String str) {
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

    /* renamed from: iap$e */
    static final class e extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;

        e(String str) {
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

    /* renamed from: iap$f */
    static final class f extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akcb a;

        f(akcb akcb) {
            this.a = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.a;
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return akcb.invoke(string, ainn.getString(1), ainn.getBytes(2), ainn.getLong(3));
        }
    }

    /* renamed from: iap$h */
    static final class h extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akcb a;

        h(akcb akcb) {
            this.a = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.a;
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return akcb.invoke(string, ainn.getString(1), ainn.getBytes(2), ainn.getLong(3));
        }
    }

    /* renamed from: iap$j */
    static final class j extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akcb a;

        j(akcb akcb) {
            this.a = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.a;
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return akcb.invoke(string, ainn.getString(1), ainn.getBytes(2), ainn.getLong(3));
        }
    }

    /* renamed from: iap$l */
    static final class l extends akcs implements akbl<ainn, T> {
        private /* synthetic */ akcb a;

        l(akcb akcb) {
            this.a = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.a;
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return akcb.invoke(string, ainn.getString(1), ainn.getBytes(2), ainn.getLong(3));
        }
    }

    /* renamed from: iap$p */
    static final class p extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ String b;
        private /* synthetic */ byte[] c;
        private /* synthetic */ Long d;

        p(String str, String str2, byte[] bArr, Long l) {
            this.a = str;
            this.b = str2;
            this.c = bArr;
            this.d = l;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            ainp.bindString(2, this.b);
            ainp.bindBytes(3, this.c);
            ainp.bindLong(4, this.d);
            return ajxw.a;
        }
    }

    /* renamed from: iap$g */
    static final class g extends akcq implements akcb<String, String, byte[], Long, a> {
        public static final g a = new g();

        g() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            byte[] bArr = (byte[]) obj3;
            Long l = (Long) obj4;
            akcr.b(str, "p1");
            return new a(str, str2, bArr, l);
        }
    }

    /* renamed from: iap$i */
    static final class i extends akcq implements akcb<String, String, byte[], Long, a> {
        public static final i a = new i();

        i() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            byte[] bArr = (byte[]) obj3;
            Long l = (Long) obj4;
            akcr.b(str, "p1");
            return new a(str, str2, bArr, l);
        }
    }

    /* renamed from: iap$k */
    static final class k extends akcq implements akcb<String, String, byte[], Long, a> {
        public static final k a = new k();

        k() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            byte[] bArr = (byte[]) obj3;
            Long l = (Long) obj4;
            akcr.b(str, "p1");
            return new a(str, str2, bArr, l);
        }
    }

    /* renamed from: iap$m */
    static final class m extends akcq implements akcb<String, String, byte[], Long, a> {
        public static final m a = new m();

        m() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(a.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            byte[] bArr = (byte[]) obj3;
            Long l = (Long) obj4;
            akcr.b(str, "p1");
            return new a(str, str2, bArr, l);
        }
    }

    public iap(iao iao, aino aino) {
        akcr.b(iao, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.g = iao;
        this.d = aino;
    }

    public final ainb<iah> a() {
        akcb akcb = i.a;
        akcr.b(akcb, "mapper");
        return ainc.a(98, this.e, this.d, akfu.a("\n    |SELECT *\n    |FROM fidelius_friend_device_info\n    ", "|"), new h(akcb));
    }

    public final ainb<iah> a(String str) {
        String str2 = "their_out_beta";
        akcr.b(str, str2);
        akcb akcb = g.a;
        akcr.b(str, str2);
        akcr.b(akcb, "mapper");
        return new a(this, str, new f(akcb));
    }

    public final ainb<iah> a(Collection<String> collection) {
        String str = "user_id";
        akcr.b(collection, str);
        akcb akcb = m.a;
        akcr.b(collection, str);
        akcr.b(akcb, "mapper");
        return new c(this, collection, new l(akcb));
    }

    public final void a(String str, String str2, byte[] bArr, Long l) {
        akcr.b(str, "their_out_beta");
        this.d.execute(Integer.valueOf(100), akfu.a("\n        |INSERT OR REPLACE INTO fidelius_friend_device_info (\n        |    their_out_beta,\n        |    user_id,\n        |    mystique,\n        |    version\n        |)\n        |VALUES(?1,?2,?3,?4)\n        ", "|"), 4, new p(str, str2, bArr, l));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.a.a, (Iterable) this.g.a.b), (Iterable) this.g.a.c), (Iterable) this.g.a.e), (Iterable) this.g.a.f));
    }

    public final ainb<iah> b() {
        akcb akcb = o.a;
        akcr.b(akcb, "mapper");
        return ainc.a(99, this.f, this.d, akfu.a("\n    |SELECT *\n    |FROM fidelius_friend_device_info\n    |WHERE mystique IS NULL\n    ", "|"), new n(akcb));
    }

    public final ainb<iah> b(String str) {
        akcb akcb = k.a;
        akcr.b(akcb, "mapper");
        return new b(this, str, new j(akcb));
    }

    public final void c(String str) {
        akcr.b(str, "their_out_beta");
        this.d.execute(Integer.valueOf(101), akfu.a("\n        |DELETE FROM fidelius_friend_device_info\n        |WHERE their_out_beta = ?1\n        ", "|"), 1, new d(str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.a.a, (Iterable) this.g.a.b), (Iterable) this.g.a.c), (Iterable) this.g.a.e), (Iterable) this.g.a.f));
    }

    public final void d(String str) {
        aino aino = this.d;
        StringBuilder stringBuilder = new StringBuilder("\n        |DELETE FROM fidelius_friend_device_info\n        |WHERE user_id ");
        stringBuilder.append(str == null ? "IS" : "=");
        stringBuilder.append(" ?1\n        ");
        aino.execute(null, akfu.a(stringBuilder.toString(), "|"), 1, new e(str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.a.a, (Iterable) this.g.a.b), (Iterable) this.g.a.c), (Iterable) this.g.a.e), (Iterable) this.g.a.f));
    }
}
