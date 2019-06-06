package defpackage;

import defpackage.gbm.b;
import java.util.Collection;
import java.util.List;
import org.opencv.imgproc.Imgproc;

/* renamed from: gbp */
final class gbp extends aing implements gbn {
    final List<ainb<?>> a = ainr.a();
    final List<ainb<?>> b = ainr.a();
    final List<ainb<?>> c = ainr.a();
    final List<ainb<?>> d = ainr.a();
    final List<ainb<?>> e = ainr.a();
    final gbo f;
    final aino g;
    private final List<ainb<?>> h = ainr.a();
    private final List<ainb<?>> i = ainr.a();
    private final List<ainb<?>> j = ainr.a();
    private final List<ainb<?>> k = ainr.a();
    private final List<ainb<?>> l = ainr.a();

    /* renamed from: gbp$g */
    static final class g extends akcs implements akbl<ainn, Long> {
        public static final g a = new g();

        g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            return Long.valueOf(l.longValue());
        }
    }

    /* renamed from: gbp$l */
    static final class l extends akcs implements akbl<ainn, String> {
        public static final l a = new l();

        l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return string;
        }
    }

    /* renamed from: gbp$k */
    static final class k extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;

        k(String str) {
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

    /* renamed from: gbp$e */
    final class e<T> extends ainb<T> {
        final String a;
        private /* synthetic */ gbp b;

        /* renamed from: gbp$e$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindString(1, this.a.a);
                return ajxw.a;
            }
        }

        public e(gbp gbp, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "uniqueTag");
            akcr.b(akbl, "mapper");
            this.b = gbp;
            super(gbp.b, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.g.executeQuery(Integer.valueOf(115), akfu.a("\n        |SELECT\n        |    _id,\n        |    uuid,\n        |    type,\n        |    uniqueTag,\n        |    groupTag,\n        |    scheduledTimestamp,\n        |    state,\n        |    scope,\n        |    config,\n        |    metadata,\n        |    attempt\n        |FROM DurableJob\n        |WHERE uniqueTag = ?1\n        |ORDER BY scheduledTimestamp ASC LIMIT 1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: gbp$q */
    static final class q extends akcq implements akbn<Long, String, String, String, String, Long, hwt, hwp, byte[], byte[], Long, b> {
        public static final q a = new q();

        q() {
            super(11);
        }

        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            String str4 = (String) obj5;
            long longValue2 = ((Number) obj6).longValue();
            hwt hwt = (hwt) obj7;
            hwp hwp = (hwp) obj8;
            byte[] bArr = (byte[]) obj9;
            byte[] bArr2 = (byte[]) obj10;
            long longValue3 = ((Number) obj11).longValue();
            akcr.b(str, "p2");
            akcr.b(str2, "p3");
            akcr.b(str3, "p4");
            akcr.b(str4, "p5");
            akcr.b(hwt, "p7");
            akcr.b(hwp, "p8");
            return new b(longValue, str, str2, str3, str4, longValue2, hwt, hwp, bArr, bArr2, longValue3);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/snap/durablejob/internal/DurableJobState;Lcom/snap/durablejob/DurableJobScope;[B[BJ)V";
        }
    }

    /* renamed from: gbp$p */
    static final class p extends akcs implements akbl<ainn, T> {
        private /* synthetic */ gbp a;
        private /* synthetic */ akbn b;

        p(gbp gbp, akbn akbn) {
            this.a = gbp;
            this.b = akbn;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akbn akbn = this.b;
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
            String string4 = ainn.getString(4);
            if (string4 == null) {
                akcr.a();
            }
            Long l2 = ainn.getLong(5);
            if (l2 == null) {
                akcr.a();
            }
            aina aina = this.a.f.b.a;
            Long l3 = ainn.getLong(6);
            if (l3 == null) {
                akcr.a();
            }
            Object decode = aina.decode(l3);
            aina = this.a.f.b.b;
            Long l4 = ainn.getLong(7);
            if (l4 == null) {
                akcr.a();
            }
            Object decode2 = aina.decode(l4);
            byte[] bytes = ainn.getBytes(8);
            byte[] bytes2 = ainn.getBytes(9);
            Long l5 = ainn.getLong(10);
            if (l5 == null) {
                akcr.a();
            }
            return akbn.a(l, string, string2, string3, string4, l2, decode, decode2, bytes, bytes2, l5);
        }
    }

    /* renamed from: gbp$a */
    final class a<T> extends ainb<T> {
        final long a;
        private /* synthetic */ gbp b;

        /* renamed from: gbp$a$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, Long.valueOf(this.a.a));
                return ajxw.a;
            }
        }

        public a(gbp gbp, long j, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.b = gbp;
            super(gbp.e, akbl);
            this.a = j;
        }

        public final ainn a() {
            return this.b.g.executeQuery(Integer.valueOf(Imgproc.COLOR_YUV2RGBA_YVYU), akfu.a("\n        |SELECT COUNT(*)\n        |FROM DurableJob\n        |WHERE scheduledTimestamp <= ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: gbp$f */
    static final class f extends akcs implements akbl<ainn, Long> {
        public static final f a = new f();

        f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            return Long.valueOf(l.longValue());
        }
    }

    /* renamed from: gbp$b */
    final class b<T> extends ainb<T> {
        final String a;
        final hwt b;
        final /* synthetic */ gbp c;

        /* renamed from: gbp$b$a */
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
                ainp.bindLong(2, (Long) this.a.c.f.b.a.encode(this.a.b));
                return ajxw.a;
            }
        }

        public b(gbp gbp, String str, hwt hwt, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "uniqueTag");
            akcr.b(hwt, "state");
            akcr.b(akbl, "mapper");
            this.c = gbp;
            super(gbp.d, akbl);
            this.a = str;
            this.b = hwt;
        }

        public final ainn a() {
            return this.c.g.executeQuery(Integer.valueOf(118), akfu.a("\n        |SELECT COUNT(*)\n        |FROM DurableJob\n        |WHERE uniqueTag = ?1 AND state = ?2\n        ", "|"), 2, new a(this));
        }
    }

    /* renamed from: gbp$h */
    static final class h extends akcs implements akbl<ainn, Long> {
        public static final h a = new h();

        h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            return Long.valueOf(l.longValue());
        }
    }

    /* renamed from: gbp$r */
    static final class r extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ gbp a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ String d;
        private /* synthetic */ String e;
        private /* synthetic */ long f;
        private /* synthetic */ hwt g;
        private /* synthetic */ hwp h;
        private /* synthetic */ byte[] i;
        private /* synthetic */ byte[] j;
        private /* synthetic */ long k;

        r(gbp gbp, String str, String str2, String str3, String str4, long j, hwt hwt, hwp hwp, byte[] bArr, byte[] bArr2, long j2) {
            this.a = gbp;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = j;
            this.g = hwt;
            this.h = hwp;
            this.i = bArr;
            this.j = bArr2;
            this.k = j2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.b);
            ainp.bindString(2, this.c);
            ainp.bindString(3, this.d);
            ainp.bindString(4, this.e);
            ainp.bindLong(5, Long.valueOf(this.f));
            ainp.bindLong(6, (Long) this.a.f.b.a.encode(this.g));
            ainp.bindLong(7, (Long) this.a.f.b.b.encode(this.h));
            ainp.bindBytes(8, this.i);
            ainp.bindBytes(9, this.j);
            ainp.bindLong(10, Long.valueOf(this.k));
            return ajxw.a;
        }
    }

    /* renamed from: gbp$o */
    static final class o extends akcq implements akbn<Long, String, String, String, String, Long, hwt, hwp, byte[], byte[], Long, b> {
        public static final o a = new o();

        o() {
            super(11);
        }

        public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            String str4 = (String) obj5;
            long longValue2 = ((Number) obj6).longValue();
            hwt hwt = (hwt) obj7;
            hwp hwp = (hwp) obj8;
            byte[] bArr = (byte[]) obj9;
            byte[] bArr2 = (byte[]) obj10;
            long longValue3 = ((Number) obj11).longValue();
            akcr.b(str, "p2");
            akcr.b(str2, "p3");
            akcr.b(str3, "p4");
            akcr.b(str4, "p5");
            akcr.b(hwt, "p7");
            akcr.b(hwp, "p8");
            return new b(longValue, str, str2, str3, str4, longValue2, hwt, hwp, bArr, bArr2, longValue3);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/snap/durablejob/internal/DurableJobState;Lcom/snap/durablejob/DurableJobScope;[B[BJ)V";
        }
    }

    /* renamed from: gbp$d */
    final class d<T> extends ainb<T> {
        final String a;
        private /* synthetic */ gbp b;

        /* renamed from: gbp$d$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindString(1, this.a.a);
                return ajxw.a;
            }
        }

        public d(gbp gbp, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "uuid");
            akcr.b(akbl, "mapper");
            this.b = gbp;
            super(gbp.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.g.executeQuery(Integer.valueOf(112), akfu.a("\n        |SELECT\n        |    _id,\n        |    uuid,\n        |    type,\n        |    uniqueTag,\n        |    groupTag,\n        |    scheduledTimestamp,\n        |    state,\n        |    scope,\n        |    config,\n        |    metadata,\n        |    attempt\n        |FROM DurableJob\n        |WHERE uuid = ?1 LIMIT 1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: gbp$n */
    static final class n extends akcs implements akbl<ainn, T> {
        private /* synthetic */ gbp a;
        private /* synthetic */ akbn b;

        n(gbp gbp, akbn akbn) {
            this.a = gbp;
            this.b = akbn;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akbn akbn = this.b;
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
            String string4 = ainn.getString(4);
            if (string4 == null) {
                akcr.a();
            }
            Long l2 = ainn.getLong(5);
            if (l2 == null) {
                akcr.a();
            }
            aina aina = this.a.f.b.a;
            Long l3 = ainn.getLong(6);
            if (l3 == null) {
                akcr.a();
            }
            Object decode = aina.decode(l3);
            aina = this.a.f.b.b;
            Long l4 = ainn.getLong(7);
            if (l4 == null) {
                akcr.a();
            }
            Object decode2 = aina.decode(l4);
            byte[] bytes = ainn.getBytes(8);
            byte[] bytes2 = ainn.getBytes(9);
            Long l5 = ainn.getLong(10);
            if (l5 == null) {
                akcr.a();
            }
            return akbn.a(l, string, string2, string3, string4, l2, decode, decode2, bytes, bytes2, l5);
        }
    }

    /* renamed from: gbp$s */
    static final class s extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ gbp a;
        private /* synthetic */ hwt b;
        private /* synthetic */ long c;
        private /* synthetic */ String d;

        s(gbp gbp, hwt hwt, long j, String str) {
            this.a = gbp;
            this.b = hwt;
            this.c = j;
            this.d = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, (Long) this.a.f.b.a.encode(this.b));
            ainp.bindLong(2, Long.valueOf(this.c));
            ainp.bindString(3, this.d);
            return ajxw.a;
        }
    }

    /* renamed from: gbp$j */
    static final class j extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;

        j(String str) {
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

    /* renamed from: gbp$i */
    static final class i extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ Collection a;

        i(Collection collection) {
            this.a = collection;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            int i = 0;
            for (Object next : this.a) {
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

    /* renamed from: gbp$c */
    final class c<T> extends ainb<T> {
        final hwp a;
        final /* synthetic */ gbp b;

        /* renamed from: gbp$c$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, (Long) this.a.b.f.b.b.encode(this.a.a));
                return ajxw.a;
            }
        }

        public c(gbp gbp, hwp hwp, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(hwp, "scope");
            akcr.b(akbl, "mapper");
            this.b = gbp;
            super(gbp.c, akbl);
            this.a = hwp;
        }

        public final ainn a() {
            return this.b.g.executeQuery(Integer.valueOf(117), akfu.a("\n        |SELECT DISTINCT uniqueTag\n        |FROM DurableJob\n        |WHERE scope = ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: gbp$m */
    static final class m extends akcs implements akbl<ainn, String> {
        public static final m a = new m();

        m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            String string = ainn.getString(0);
            if (string == null) {
                akcr.a();
            }
            return string;
        }
    }

    public gbp(gbo gbo, aino aino) {
        akcr.b(gbo, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.f = gbo;
        this.g = aino;
    }

    public final ainb<String> a() {
        return ainc.a(116, this.j, this.g, akfu.a("\n    |SELECT DISTINCT uniqueTag\n    |FROM DurableJob\n    ", "|"), l.a);
    }

    public final ainb<Long> a(long j) {
        return new a(this, j, f.a);
    }

    public final ainb<String> a(hwp hwp) {
        akcr.b(hwp, "scope");
        return new c(this, hwp, m.a);
    }

    public final ainb<gbm> a(String str) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akbn akbn = o.a;
        akcr.b(str, str2);
        akcr.b(akbn, "mapper");
        return new d(this, str, new n(this, akbn));
    }

    public final ainb<Long> a(String str, hwt hwt) {
        akcr.b(str, "uniqueTag");
        akcr.b(hwt, "state");
        return new b(this, str, hwt, h.a);
    }

    public final void a(hwt hwt, long j, String str) {
        akcr.b(hwt, "state");
        akcr.b(str, "uuid");
        this.g.execute(Integer.valueOf(123), akfu.a("\n        |UPDATE DurableJob\n        |SET\n        |state = ?1,\n        |attempt = ?2\n        |WHERE uuid = ?3\n        ", "|"), 3, new s(this, hwt, j, str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.f.a.a, (Iterable) this.f.a.h), (Iterable) this.f.a.i), (Iterable) this.f.a.b), (Iterable) this.f.a.j), (Iterable) this.f.a.c), (Iterable) this.f.a.d), (Iterable) this.f.a.k), (Iterable) this.f.a.l), (Iterable) this.f.a.e));
    }

    public final void a(String str, String str2, String str3, String str4, long j, hwt hwt, hwp hwp, byte[] bArr, byte[] bArr2, long j2) {
        String str5 = str;
        akcr.b(str5, "uuid");
        String str6 = str2;
        akcr.b(str6, "type");
        String str7 = str3;
        akcr.b(str7, "uniqueTag");
        String str8 = str4;
        akcr.b(str8, "groupTag");
        hwt hwt2 = hwt;
        akcr.b(hwt2, "state");
        hwp hwp2 = hwp;
        akcr.b(hwp2, "scope");
        this.g.execute(Integer.valueOf(Imgproc.COLOR_YUV2BGRA_YVYU), akfu.a("\n        |INSERT OR REPLACE INTO DurableJob (\n        |    uuid,\n        |    type,\n        |    uniqueTag,\n        |    groupTag,\n        |    scheduledTimestamp,\n        |    state,\n        |    scope,\n        |    config,\n        |    metadata,\n        |    attempt\n        |)\n        |VALUES(?1,?2,?3,?4,?5,?6,?7,?8,?9,?10)\n        ", "|"), 10, new r(this, str5, str6, str7, str8, j, hwt2, hwp2, bArr, bArr2, j2));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.f.a.a, (Iterable) this.f.a.h), (Iterable) this.f.a.i), (Iterable) this.f.a.b), (Iterable) this.f.a.j), (Iterable) this.f.a.c), (Iterable) this.f.a.d), (Iterable) this.f.a.k), (Iterable) this.f.a.l), (Iterable) this.f.a.e));
    }

    public final void a(Collection<String> collection) {
        akcr.b(collection, "groupTag");
        String a = aing.a(collection.size(), 1);
        aino aino = this.g;
        StringBuilder stringBuilder = new StringBuilder("\n        |DELETE FROM DurableJob\n        |WHERE groupTag IN ");
        stringBuilder.append(a);
        stringBuilder.append("\n        ");
        aino.execute(null, akfu.a(stringBuilder.toString(), "|"), collection.size(), new i(collection));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.f.a.a, (Iterable) this.f.a.h), (Iterable) this.f.a.i), (Iterable) this.f.a.b), (Iterable) this.f.a.j), (Iterable) this.f.a.c), (Iterable) this.f.a.d), (Iterable) this.f.a.k), (Iterable) this.f.a.l), (Iterable) this.f.a.e));
    }

    public final ainb<Long> b() {
        return ainc.a(120, this.l, this.g, "SELECT COUNT(*) FROM DurableJob", g.a);
    }

    public final ainb<gbm> b(String str) {
        String str2 = "uniqueTag";
        akcr.b(str, str2);
        akbn akbn = q.a;
        akcr.b(str, str2);
        akcr.b(akbn, "mapper");
        return new e(this, str, new p(this, akbn));
    }

    public final void c(String str) {
        akcr.b(str, "uuid");
        this.g.execute(Integer.valueOf(124), akfu.a("\n        |DELETE FROM DurableJob\n        |WHERE uuid = ?1\n        ", "|"), 1, new j(str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.f.a.a, (Iterable) this.f.a.h), (Iterable) this.f.a.i), (Iterable) this.f.a.b), (Iterable) this.f.a.j), (Iterable) this.f.a.c), (Iterable) this.f.a.d), (Iterable) this.f.a.k), (Iterable) this.f.a.l), (Iterable) this.f.a.e));
    }

    public final void d(String str) {
        akcr.b(str, "uniqueTag");
        this.g.execute(Integer.valueOf(126), akfu.a("\n        |DELETE FROM DurableJob\n        |WHERE uniqueTag = ?1\n        ", "|"), 1, new k(str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.f.a.a, (Iterable) this.f.a.h), (Iterable) this.f.a.i), (Iterable) this.f.a.b), (Iterable) this.f.a.j), (Iterable) this.f.a.c), (Iterable) this.f.a.d), (Iterable) this.f.a.k), (Iterable) this.f.a.l), (Iterable) this.f.a.e));
    }
}
