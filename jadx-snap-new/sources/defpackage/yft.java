package defpackage;

import defpackage.yfq.b;
import java.util.Collection;
import java.util.List;

/* renamed from: yft */
final class yft extends aing implements yfo {
    final List<ainb<?>> a = ainr.a();
    final List<ainb<?>> b = ainr.a();
    final List<ainb<?>> c = ainr.a();
    final List<ainb<?>> d = ainr.a();
    final List<ainb<?>> e = ainr.a();
    final List<ainb<?>> f = ainr.a();
    final yfv g;
    final aino h;

    /* renamed from: yft$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ yft b;

        /* renamed from: yft$a$a */
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

        public a(yft yft, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "path");
            akcr.b(akbl, "mapper");
            this.b = yft;
            super(yft.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.h.executeQuery(Integer.valueOf(0), akfu.a("\n        |SELECT COUNT(*)\n        |FROM journal_entry\n        |WHERE journal_id IN (SELECT _id FROM journal WHERE path=?1)\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: yft$g */
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

    /* renamed from: yft$d */
    final class d<T> extends ainb<T> {
        final long a;
        final yfk b;
        final Long c;
        final long d;
        final long e;
        final /* synthetic */ yft f;

        /* renamed from: yft$d$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, Long.valueOf(this.a.a));
                ainp.bindLong(2, (Long) this.a.f.g.c.a.encode(this.a.b));
                ainp.bindLong(3, this.a.c);
                ainp.bindLong(4, Long.valueOf(this.a.d));
                ainp.bindLong(5, Long.valueOf(this.a.e));
                return ajxw.a;
            }
        }

        public d(yft yft, long j, yfk yfk, Long l, long j2, long j3, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(yfk, "status");
            akcr.b(akbl, "mapper");
            this.f = yft;
            super(yft.d, akbl);
            this.a = j;
            this.b = yfk;
            this.c = l;
            this.d = j2;
            this.e = j3;
        }

        public final ainn a() {
            return this.f.h.executeQuery(Integer.valueOf(3), akfu.a("\n        |SELECT *\n        |FROM journal_entry\n        |WHERE journal_id = ?1 AND (status == ?2 OR (expiration < ?3 AND expiration != 0)) ORDER BY last_read_time ASC LIMIT ?4 OFFSET ?5\n        ", "|"), 5, new a(this));
        }
    }

    /* renamed from: yft$e */
    final class e<T> extends ainb<T> {
        final long a;
        final long b;
        final long c;
        private /* synthetic */ yft d;

        /* renamed from: yft$e$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, Long.valueOf(this.a.a));
                ainp.bindLong(2, Long.valueOf(this.a.b));
                ainp.bindLong(3, Long.valueOf(this.a.c));
                return ajxw.a;
            }
        }

        public e(yft yft, long j, long j2, long j3, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.d = yft;
            super(yft.c, akbl);
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final ainn a() {
            return this.d.h.executeQuery(Integer.valueOf(2), akfu.a("\n        |SELECT key\n        |FROM journal_entry\n        |WHERE journal_id = ?1 LIMIT ?2 OFFSET ?3\n        ", "|"), 3, new a(this));
        }
    }

    /* renamed from: yft$p */
    static final class p extends akcq implements akbo<Long, Long, String, Long, Integer, yfk, Long, Long, Long, Long, yfj, Long, b> {
        public static final p a = new p();

        p() {
            super(12);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JJLjava/lang/String;JILcom/snap/storage/cache/db/column/FileStatus;JJJJLcom/snap/storage/cache/db/column/ArrayOfLongs;Ljava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            String str = (String) obj3;
            String str2 = str;
            long longValue3 = ((Number) obj4).longValue();
            int intValue = ((Number) obj5).intValue();
            yfk yfk = (yfk) obj6;
            yfk yfk2 = yfk;
            long longValue4 = ((Number) obj7).longValue();
            long longValue5 = ((Number) obj8).longValue();
            long longValue6 = ((Number) obj9).longValue();
            long longValue7 = ((Number) obj10).longValue();
            yfj yfj = (yfj) obj11;
            Long l = (Long) obj12;
            long j = longValue;
            akcr.b(str, "p3");
            akcr.b(yfk, "p6");
            return new b(j, longValue2, str2, longValue3, intValue, yfk2, longValue4, longValue5, longValue6, longValue7, yfj, l);
        }
    }

    /* renamed from: yft$o */
    static final class o extends akcs implements akbl<ainn, T> {
        private /* synthetic */ yft a;
        private /* synthetic */ akbo b;

        o(yft yft, akbo akbo) {
            this.a = yft;
            this.b = akbo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akbo akbo = this.b;
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            Long l2 = ainn.getLong(1);
            if (l2 == null) {
                akcr.a();
            }
            String string = ainn.getString(2);
            if (string == null) {
                akcr.a();
            }
            Long l3 = ainn.getLong(3);
            if (l3 == null) {
                akcr.a();
            }
            Long l4 = ainn.getLong(4);
            if (l4 == null) {
                akcr.a();
            }
            Integer valueOf = Integer.valueOf((int) l4.longValue());
            aina aina = this.a.g.c.a;
            Long l5 = ainn.getLong(5);
            if (l5 == null) {
                akcr.a();
            }
            Object decode = aina.decode(l5);
            Long l6 = ainn.getLong(6);
            if (l6 == null) {
                akcr.a();
            }
            Long l7 = ainn.getLong(7);
            if (l7 == null) {
                akcr.a();
            }
            Long l8 = ainn.getLong(8);
            if (l8 == null) {
                akcr.a();
            }
            Long l9 = ainn.getLong(9);
            if (l9 == null) {
                akcr.a();
            }
            byte[] bytes = ainn.getBytes(10);
            return akbo.invoke(l, l2, string, l3, valueOf, decode, l6, l7, l8, l9, bytes != null ? (yfj) this.a.g.c.b.decode(bytes) : null, ainn.getLong(11));
        }
    }

    /* renamed from: yft$q */
    static final class q extends akcs implements akbl<ainn, String> {
        public static final q a = new q();

        q() {
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

    /* renamed from: yft$m */
    static final class m extends akcs implements akbl<ainn, T> {
        private /* synthetic */ yft a;
        private /* synthetic */ akbo b;

        m(yft yft, akbo akbo) {
            this.a = yft;
            this.b = akbo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akbo akbo = this.b;
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            Long l2 = ainn.getLong(1);
            if (l2 == null) {
                akcr.a();
            }
            String string = ainn.getString(2);
            if (string == null) {
                akcr.a();
            }
            Long l3 = ainn.getLong(3);
            if (l3 == null) {
                akcr.a();
            }
            Long l4 = ainn.getLong(4);
            if (l4 == null) {
                akcr.a();
            }
            Integer valueOf = Integer.valueOf((int) l4.longValue());
            aina aina = this.a.g.c.a;
            Long l5 = ainn.getLong(5);
            if (l5 == null) {
                akcr.a();
            }
            Object decode = aina.decode(l5);
            Long l6 = ainn.getLong(6);
            if (l6 == null) {
                akcr.a();
            }
            Long l7 = ainn.getLong(7);
            if (l7 == null) {
                akcr.a();
            }
            Long l8 = ainn.getLong(8);
            if (l8 == null) {
                akcr.a();
            }
            Long l9 = ainn.getLong(9);
            if (l9 == null) {
                akcr.a();
            }
            byte[] bytes = ainn.getBytes(10);
            return akbo.invoke(l, l2, string, l3, valueOf, decode, l6, l7, l8, l9, bytes != null ? (yfj) this.a.g.c.b.decode(bytes) : null, ainn.getLong(11));
        }
    }

    /* renamed from: yft$j */
    static final class j extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ yft a;
        private /* synthetic */ long b;
        private /* synthetic */ String c;
        private /* synthetic */ long d;
        private /* synthetic */ int e;
        private /* synthetic */ long f;
        private /* synthetic */ yfk g;
        private /* synthetic */ long h;
        private /* synthetic */ long i;
        private /* synthetic */ long j;
        private /* synthetic */ yfj k;
        private /* synthetic */ Long l;

        j(yft yft, long j, String str, long j2, int i, long j3, yfk yfk, long j4, long j5, long j6, yfj yfj, Long l) {
            this.a = yft;
            this.b = j;
            this.c = str;
            this.d = j2;
            this.e = i;
            this.f = j3;
            this.g = yfk;
            this.h = j4;
            this.i = j5;
            this.j = j6;
            this.k = yfj;
            this.l = l;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.b));
            ainp.bindString(2, this.c);
            ainp.bindLong(3, Long.valueOf(this.d));
            ainp.bindLong(4, Long.valueOf((long) this.e));
            ainp.bindLong(5, Long.valueOf(this.f));
            ainp.bindLong(6, (Long) this.a.g.c.a.encode(this.g));
            ainp.bindLong(7, Long.valueOf(this.h));
            ainp.bindLong(8, Long.valueOf(this.i));
            ainp.bindLong(9, Long.valueOf(this.j));
            ainp.bindBytes(10, this.k == null ? null : (byte[]) this.a.g.c.b.encode(this.k));
            ainp.bindLong(11, this.l);
            return ajxw.a;
        }
    }

    /* renamed from: yft$c */
    final class c<T> extends ainb<T> {
        final long a;
        final String b;
        private /* synthetic */ yft c;

        /* renamed from: yft$c$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, Long.valueOf(this.a.a));
                ainp.bindString(2, this.a.b);
                return ajxw.a;
            }
        }

        public c(yft yft, long j, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, "key");
            akcr.b(akbl, "mapper");
            this.c = yft;
            super(yft.e, akbl);
            this.a = j;
            this.b = str;
        }

        public final ainn a() {
            return this.c.h.executeQuery(Integer.valueOf(4), akfu.a("\n        |SELECT *\n        |FROM journal_entry\n        |WHERE journal_id = ?1 AND key = ?2\n        ", "|"), 2, new a(this));
        }
    }

    /* renamed from: yft$n */
    static final class n extends akcq implements akbo<Long, Long, String, Long, Integer, yfk, Long, Long, Long, Long, yfj, Long, b> {
        public static final n a = new n();

        n() {
            super(12);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JJLjava/lang/String;JILcom/snap/storage/cache/db/column/FileStatus;JJJJLcom/snap/storage/cache/db/column/ArrayOfLongs;Ljava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            String str = (String) obj3;
            String str2 = str;
            long longValue3 = ((Number) obj4).longValue();
            int intValue = ((Number) obj5).intValue();
            yfk yfk = (yfk) obj6;
            yfk yfk2 = yfk;
            long longValue4 = ((Number) obj7).longValue();
            long longValue5 = ((Number) obj8).longValue();
            long longValue6 = ((Number) obj9).longValue();
            long longValue7 = ((Number) obj10).longValue();
            yfj yfj = (yfj) obj11;
            Long l = (Long) obj12;
            long j = longValue;
            akcr.b(str, "p3");
            akcr.b(yfk, "p6");
            return new b(j, longValue2, str2, longValue3, intValue, yfk2, longValue4, longValue5, longValue6, longValue7, yfj, l);
        }
    }

    /* renamed from: yft$u */
    static final class u extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;
        private /* synthetic */ long b;
        private /* synthetic */ String c;

        u(long j, long j2, String str) {
            this.a = j;
            this.b = j2;
            this.c = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            ainp.bindLong(2, Long.valueOf(this.b));
            ainp.bindString(3, this.c);
            return ajxw.a;
        }
    }

    /* renamed from: yft$v */
    static final class v extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;
        private /* synthetic */ Long b;
        private /* synthetic */ long c;
        private /* synthetic */ String d;

        v(long j, Long l, long j2, String str) {
            this.a = j;
            this.b = l;
            this.c = j2;
            this.d = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            ainp.bindLong(2, this.b);
            ainp.bindLong(3, Long.valueOf(this.c));
            ainp.bindString(4, this.d);
            return ajxw.a;
        }
    }

    /* renamed from: yft$w */
    static final class w extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;

        w(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            return ajxw.a;
        }
    }

    /* renamed from: yft$i */
    static final class i extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;
        private /* synthetic */ String b;

        i(long j, String str) {
            this.a = j;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            ainp.bindString(2, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: yft$b */
    final class b<T> extends ainb<T> {
        final long a;
        final long b;
        final long c;
        private /* synthetic */ yft d;

        /* renamed from: yft$b$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, Long.valueOf(this.a.a));
                ainp.bindLong(2, Long.valueOf(this.a.b));
                ainp.bindLong(3, Long.valueOf(this.a.c));
                return ajxw.a;
            }
        }

        public b(yft yft, long j, long j2, long j3, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.d = yft;
            super(yft.b, akbl);
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final ainn a() {
            return this.d.h.executeQuery(Integer.valueOf(1), akfu.a("\n        |SELECT *\n        |FROM journal_entry\n        |WHERE journal_id = ?1 ORDER BY last_read_time ASC, _id ASC LIMIT ?2 OFFSET ?3\n        ", "|"), 3, new a(this));
        }
    }

    /* renamed from: yft$f */
    final class f<T> extends ainb<T> {
        final long a;
        final long b;
        final long c;
        private /* synthetic */ yft d;

        /* renamed from: yft$f$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, Long.valueOf(this.a.a));
                ainp.bindLong(2, Long.valueOf(this.a.b));
                ainp.bindLong(3, Long.valueOf(this.a.c));
                return ajxw.a;
            }
        }

        public f(yft yft, long j, long j2, long j3, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.d = yft;
            super(yft.f, akbl);
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final ainn a() {
            return this.d.h.executeQuery(Integer.valueOf(5), akfu.a("\n        |SELECT *\n        |FROM journal_entry\n        |WHERE journal_id=?1\n        |AND lock_count = 0\n        |ORDER BY last_read_time ASC, _id ASC LIMIT ?2 OFFSET ?3\n        ", "|"), 3, new a(this));
        }
    }

    /* renamed from: yft$h */
    static final class h extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;

        h(long j) {
            this.a = j;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            return ajxw.a;
        }
    }

    /* renamed from: yft$k */
    static final class k extends akcs implements akbl<ainn, T> {
        private /* synthetic */ yft a;
        private /* synthetic */ akbo b;

        k(yft yft, akbo akbo) {
            this.a = yft;
            this.b = akbo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akbo akbo = this.b;
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            Long l2 = ainn.getLong(1);
            if (l2 == null) {
                akcr.a();
            }
            String string = ainn.getString(2);
            if (string == null) {
                akcr.a();
            }
            Long l3 = ainn.getLong(3);
            if (l3 == null) {
                akcr.a();
            }
            Long l4 = ainn.getLong(4);
            if (l4 == null) {
                akcr.a();
            }
            Integer valueOf = Integer.valueOf((int) l4.longValue());
            aina aina = this.a.g.c.a;
            Long l5 = ainn.getLong(5);
            if (l5 == null) {
                akcr.a();
            }
            Object decode = aina.decode(l5);
            Long l6 = ainn.getLong(6);
            if (l6 == null) {
                akcr.a();
            }
            Long l7 = ainn.getLong(7);
            if (l7 == null) {
                akcr.a();
            }
            Long l8 = ainn.getLong(8);
            if (l8 == null) {
                akcr.a();
            }
            Long l9 = ainn.getLong(9);
            if (l9 == null) {
                akcr.a();
            }
            byte[] bytes = ainn.getBytes(10);
            return akbo.invoke(l, l2, string, l3, valueOf, decode, l6, l7, l8, l9, bytes != null ? (yfj) this.a.g.c.b.decode(bytes) : null, ainn.getLong(11));
        }
    }

    /* renamed from: yft$r */
    static final class r extends akcs implements akbl<ainn, T> {
        private /* synthetic */ yft a;
        private /* synthetic */ akbo b;

        r(yft yft, akbo akbo) {
            this.a = yft;
            this.b = akbo;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akbo akbo = this.b;
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            Long l2 = ainn.getLong(1);
            if (l2 == null) {
                akcr.a();
            }
            String string = ainn.getString(2);
            if (string == null) {
                akcr.a();
            }
            Long l3 = ainn.getLong(3);
            if (l3 == null) {
                akcr.a();
            }
            Long l4 = ainn.getLong(4);
            if (l4 == null) {
                akcr.a();
            }
            Integer valueOf = Integer.valueOf((int) l4.longValue());
            aina aina = this.a.g.c.a;
            Long l5 = ainn.getLong(5);
            if (l5 == null) {
                akcr.a();
            }
            Object decode = aina.decode(l5);
            Long l6 = ainn.getLong(6);
            if (l6 == null) {
                akcr.a();
            }
            Long l7 = ainn.getLong(7);
            if (l7 == null) {
                akcr.a();
            }
            Long l8 = ainn.getLong(8);
            if (l8 == null) {
                akcr.a();
            }
            Long l9 = ainn.getLong(9);
            if (l9 == null) {
                akcr.a();
            }
            byte[] bytes = ainn.getBytes(10);
            return akbo.invoke(l, l2, string, l3, valueOf, decode, l6, l7, l8, l9, bytes != null ? (yfj) this.a.g.c.b.decode(bytes) : null, ainn.getLong(11));
        }
    }

    /* renamed from: yft$t */
    static final class t extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;
        private /* synthetic */ String b;

        t(long j, String str) {
            this.a = j;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            ainp.bindString(2, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: yft$x */
    static final class x extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ long a;
        private /* synthetic */ String b;

        x(long j, String str) {
            this.a = j;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, Long.valueOf(this.a));
            ainp.bindString(2, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: yft$l */
    static final class l extends akcq implements akbo<Long, Long, String, Long, Integer, yfk, Long, Long, Long, Long, yfj, Long, b> {
        public static final l a = new l();

        l() {
            super(12);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JJLjava/lang/String;JILcom/snap/storage/cache/db/column/FileStatus;JJJJLcom/snap/storage/cache/db/column/ArrayOfLongs;Ljava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            String str = (String) obj3;
            String str2 = str;
            long longValue3 = ((Number) obj4).longValue();
            int intValue = ((Number) obj5).intValue();
            yfk yfk = (yfk) obj6;
            yfk yfk2 = yfk;
            long longValue4 = ((Number) obj7).longValue();
            long longValue5 = ((Number) obj8).longValue();
            long longValue6 = ((Number) obj9).longValue();
            long longValue7 = ((Number) obj10).longValue();
            yfj yfj = (yfj) obj11;
            Long l = (Long) obj12;
            long j = longValue;
            akcr.b(str, "p3");
            akcr.b(yfk, "p6");
            return new b(j, longValue2, str2, longValue3, intValue, yfk2, longValue4, longValue5, longValue6, longValue7, yfj, l);
        }
    }

    /* renamed from: yft$s */
    static final class s extends akcq implements akbo<Long, Long, String, Long, Integer, yfk, Long, Long, Long, Long, yfj, Long, b> {
        public static final s a = new s();

        s() {
            super(12);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JJLjava/lang/String;JILcom/snap/storage/cache/db/column/FileStatus;JJJJLcom/snap/storage/cache/db/column/ArrayOfLongs;Ljava/lang/Long;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            String str = (String) obj3;
            String str2 = str;
            long longValue3 = ((Number) obj4).longValue();
            int intValue = ((Number) obj5).intValue();
            yfk yfk = (yfk) obj6;
            yfk yfk2 = yfk;
            long longValue4 = ((Number) obj7).longValue();
            long longValue5 = ((Number) obj8).longValue();
            long longValue6 = ((Number) obj9).longValue();
            long longValue7 = ((Number) obj10).longValue();
            yfj yfj = (yfj) obj11;
            Long l = (Long) obj12;
            long j = longValue;
            akcr.b(str, "p3");
            akcr.b(yfk, "p6");
            return new b(j, longValue2, str2, longValue3, intValue, yfk2, longValue4, longValue5, longValue6, longValue7, yfj, l);
        }
    }

    public yft(yfv yfv, aino aino) {
        akcr.b(yfv, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.g = yfv;
        this.h = aino;
    }

    public final ainb<yfq> a(long j, long j2, long j3) {
        akbo akbo = l.a;
        akcr.b(akbo, "mapper");
        return new b(this, j, j2, j3, new k(this, akbo));
    }

    public final ainb<yfq> a(long j, String str) {
        String str2 = "key";
        akcr.b(str, str2);
        akbo akbo = n.a;
        akcr.b(str, str2);
        akcr.b(akbo, "mapper");
        return new c(this, j, str, new m(this, akbo));
    }

    public final ainb<yfq> a(long j, yfk yfk, Long l, long j2, long j3) {
        yfk yfk2 = yfk;
        String str = "status";
        akcr.b(yfk2, str);
        akbo akbo = p.a;
        akcr.b(yfk2, str);
        akcr.b(akbo, "mapper");
        return new d(this, j, yfk2, l, j2, j3, new o(this, akbo));
    }

    public final ainb<Long> a(String str) {
        akcr.b(str, "path");
        return new a(this, str, g.a);
    }

    public final void a(long j) {
        this.h.execute(Integer.valueOf(8), akfu.a("\n        |UPDATE journal_entry\n        |SET lock_count = 0\n        |WHERE journal_id = ?1\n        ", "|"), 1, new w(j));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }

    public final void a(long j, long j2, String str) {
        akcr.b(str, "key");
        this.h.execute(Integer.valueOf(9), akfu.a("\n        |UPDATE journal_entry\n        |SET last_read_time = ?1\n        |WHERE journal_id = ?2 AND key = ?3\n        ", "|"), 3, new u(j, j2, str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }

    public final void a(long j, Long l, long j2, String str) {
        String str2 = str;
        akcr.b(str2, "key");
        this.h.execute(Integer.valueOf(10), akfu.a("\n        |UPDATE journal_entry\n        |SET last_read_time = ?1, expiration = ?2\n        |WHERE journal_id = ?3 AND key = ?4\n        ", "|"), 4, new v(j, l, j2, str2));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }

    public final void a(long j, String str, long j2, int i, long j3, yfk yfk, long j4, long j5, long j6, yfj yfj, Long l) {
        long j7 = j;
        String str2 = str;
        long j8 = j2;
        int i2 = i;
        long j9 = j3;
        yfk yfk2 = yfk;
        long j10 = j4;
        long j11 = j5;
        long j12 = j6;
        yfj yfj2 = yfj;
        Long l2 = l;
        akcr.b(str, "key");
        akcr.b(yfk, "status");
        aino aino = this.h;
        aino aino2 = aino;
        Integer valueOf = Integer.valueOf(13);
        aino2.execute(valueOf, akfu.a("\n        |INSERT OR REPLACE INTO journal_entry (\n        |    _id,\n        |    journal_id,\n        |    key,\n        |    sequence_number,\n        |    value_count,\n        |    lock_count,\n        |    status,\n        |    last_update_time,\n        |    last_read_time,\n        |    total_size,\n        |    value_sizes,\n        |    expiration\n        |)\n        |VALUES((SELECT _id FROM journal_entry WHERE journal_id = ?1 AND key = ?2),?1,?2,?3,?4,?5,?6,?7,?8,?9,?10,?11)\n        ", "|"), 11, new j(this, j, str2, j8, i2, j9, yfk2, j10, j11, j12, yfj2, l2));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }

    public final ainb<String> b(long j, long j2, long j3) {
        return new e(this, j, j2, j3, q.a);
    }

    public final void b(long j) {
        this.h.execute(Integer.valueOf(12), akfu.a("\n        |DELETE FROM journal_entry\n        |WHERE journal_id = ?1\n        ", "|"), 1, new h(j));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }

    public final void b(long j, String str) {
        akcr.b(str, "key");
        this.h.execute(Integer.valueOf(6), akfu.a("\n        |UPDATE journal_entry\n        |SET lock_count = lock_count + 1\n        |WHERE journal_id = ?1 AND key = ?2\n        ", "|"), 2, new t(j, str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }

    public final ainb<yfq> c(long j, long j2, long j3) {
        akbo akbo = s.a;
        akcr.b(akbo, "mapper");
        return new f(this, j, j2, j3, new r(this, akbo));
    }

    public final void c(long j, String str) {
        akcr.b(str, "key");
        this.h.execute(Integer.valueOf(7), akfu.a("\n        |UPDATE journal_entry\n        |SET lock_count = lock_count - 1\n        |WHERE journal_id = ?1 AND key = ?2\n        ", "|"), 2, new x(j, str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }

    public final void d(long j, String str) {
        akcr.b(str, "key");
        this.h.execute(Integer.valueOf(11), akfu.a("\n        |DELETE FROM journal_entry\n        |WHERE journal_id = ?1 AND key = ?2\n        ", "|"), 2, new i(j, str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.g.b.a, (Iterable) this.g.b.b), (Iterable) this.g.b.c), (Iterable) this.g.b.d), (Iterable) this.g.b.e), (Iterable) this.g.b.f));
    }
}
