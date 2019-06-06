package defpackage;

import com.snap.core.db.record.DataConsumption;
import com.snap.core.db.record.DataConsumption.Impl;
import com.snap.core.db.record.DataConsumptionQueries;
import java.util.Collection;
import java.util.List;

/* renamed from: fxw */
final class fxw extends aing implements DataConsumptionQueries {
    final List<ainb<?>> a = ainr.a();
    final List<ainb<?>> b = ainr.a();
    final fxx c;
    final aino d;
    private final List<ainb<?>> e = ainr.a();
    private final List<ainb<?>> f = ainr.a();

    /* renamed from: fxw$j */
    static final class j extends akcq implements akcf<Long, String, String, String, String, Long, Long, adsh, Impl> {
        public static final j a = new j();

        j() {
            super(8);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(Impl.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/snapchat/network/nano/DataConsumptionBlob;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            String str4 = (String) obj5;
            Long l = (Long) obj6;
            Long l2 = (Long) obj7;
            adsh adsh = (adsh) obj8;
            akcr.b(str, "p2");
            akcr.b(str2, "p3");
            return new Impl(longValue, str, str2, str3, str4, l, l2, adsh);
        }
    }

    /* renamed from: fxw$i */
    static final class i extends akcs implements akbl<ainn, T> {
        private /* synthetic */ fxw a;
        private /* synthetic */ akcf b;

        i(fxw fxw, akcf akcf) {
            this.a = fxw;
            this.b = akcf;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcf akcf = this.b;
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
            String string4 = ainn.getString(4);
            Long l2 = ainn.getLong(5);
            Long l3 = ainn.getLong(6);
            byte[] bytes = ainn.getBytes(7);
            return akcf.invoke(l, string, string2, string3, string4, l2, l3, bytes != null ? (adsh) this.a.c.b.getBlobAdapter().decode(bytes) : null);
        }
    }

    /* renamed from: fxw$a */
    final class a<T> extends ainb<T> {
        final Collection<String> a;
        private /* synthetic */ fxw b;

        /* renamed from: fxw$a$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
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

        public a(fxw fxw, Collection<String> collection, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(collection, "contentObjectId");
            akcr.b(akbl, "mapper");
            this.b = fxw;
            super(fxw.a, akbl);
            this.a = collection;
        }

        public final ainn a() {
            String a = aing.a(this.a.size(), 1);
            aino aino = this.b.d;
            StringBuilder stringBuilder = new StringBuilder("\n            |SELECT *\n            |FROM DataConsumption\n            |WHERE contentObjectId IN ");
            stringBuilder.append(a);
            stringBuilder.append("\n            |AND coalesce(firstAccessedTimestamp, 0) = 0\n            |ORDER BY _id DESC\n            ");
            return aino.executeQuery(null, akfu.a(stringBuilder.toString(), "|"), this.a.size(), new a(this));
        }
    }

    /* renamed from: fxw$b */
    final class b<T> extends ainb<T> {
        final Long a;
        private /* synthetic */ fxw b;

        /* renamed from: fxw$b$a */
        static final class a extends akcs implements akbl<ainp, ajxw> {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ainp ainp = (ainp) obj;
                akcr.b(ainp, "receiver$0");
                ainp.bindLong(1, this.a.a);
                return ajxw.a;
            }
        }

        public b(fxw fxw, Long l, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(akbl, "mapper");
            this.b = fxw;
            super(fxw.b, akbl);
            this.a = l;
        }

        public final ainn a() {
            return this.b.d.executeQuery(Integer.valueOf(20), akfu.a("\n        |SELECT *\n        |FROM DataConsumption\n        |WHERE fetchBeginTimestamp >= ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: fxw$c */
    static final class c extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ Long a;

        c(Long l) {
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

    /* renamed from: fxw$d */
    static final class d extends akcs implements akbl<ainn, T> {
        private /* synthetic */ fxw a;
        private /* synthetic */ akcf b;

        d(fxw fxw, akcf akcf) {
            this.a = fxw;
            this.b = akcf;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcf akcf = this.b;
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
            String string4 = ainn.getString(4);
            Long l2 = ainn.getLong(5);
            Long l3 = ainn.getLong(6);
            byte[] bytes = ainn.getBytes(7);
            return akcf.invoke(l, string, string2, string3, string4, l2, l3, bytes != null ? (adsh) this.a.c.b.getBlobAdapter().decode(bytes) : null);
        }
    }

    /* renamed from: fxw$f */
    static final class f extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ fxw a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ String d;
        private /* synthetic */ String e;
        private /* synthetic */ Long f;
        private /* synthetic */ Long g;
        private /* synthetic */ adsh h;

        f(fxw fxw, String str, String str2, String str3, String str4, Long l, Long l2, adsh adsh) {
            this.a = fxw;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = l;
            this.g = l2;
            this.h = adsh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.b);
            ainp.bindString(2, this.c);
            ainp.bindString(3, this.d);
            ainp.bindString(4, this.e);
            ainp.bindLong(5, this.f);
            ainp.bindLong(6, this.g);
            ainp.bindBytes(7, this.h == null ? null : (byte[]) this.a.c.b.getBlobAdapter().encode(this.h));
            return ajxw.a;
        }
    }

    /* renamed from: fxw$g */
    static final class g extends akcs implements akbl<ainn, T> {
        private /* synthetic */ fxw a;
        private /* synthetic */ akcf b;

        g(fxw fxw, akcf akcf) {
            this.a = fxw;
            this.b = akcf;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcf akcf = this.b;
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
            String string4 = ainn.getString(4);
            Long l2 = ainn.getLong(5);
            Long l3 = ainn.getLong(6);
            byte[] bytes = ainn.getBytes(7);
            return akcf.invoke(l, string, string2, string3, string4, l2, l3, bytes != null ? (adsh) this.a.c.b.getBlobAdapter().decode(bytes) : null);
        }
    }

    /* renamed from: fxw$k */
    static final class k extends akcs implements akbl<ainn, T> {
        private /* synthetic */ fxw a;
        private /* synthetic */ akcf b;

        k(fxw fxw, akcf akcf) {
            this.a = fxw;
            this.b = akcf;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcf akcf = this.b;
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
            String string4 = ainn.getString(4);
            Long l2 = ainn.getLong(5);
            Long l3 = ainn.getLong(6);
            byte[] bytes = ainn.getBytes(7);
            return akcf.invoke(l, string, string2, string3, string4, l2, l3, bytes != null ? (adsh) this.a.c.b.getBlobAdapter().decode(bytes) : null);
        }
    }

    /* renamed from: fxw$m */
    static final class m extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ Long a;
        private /* synthetic */ String b;

        m(Long l, String str) {
            this.a = l;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindLong(1, this.a);
            ainp.bindString(2, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: fxw$e */
    static final class e extends akcq implements akcf<Long, String, String, String, String, Long, Long, adsh, Impl> {
        public static final e a = new e();

        e() {
            super(8);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(Impl.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/snapchat/network/nano/DataConsumptionBlob;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            String str4 = (String) obj5;
            Long l = (Long) obj6;
            Long l2 = (Long) obj7;
            adsh adsh = (adsh) obj8;
            akcr.b(str, "p2");
            akcr.b(str2, "p3");
            return new Impl(longValue, str, str2, str3, str4, l, l2, adsh);
        }
    }

    /* renamed from: fxw$h */
    static final class h extends akcq implements akcf<Long, String, String, String, String, Long, Long, adsh, Impl> {
        public static final h a = new h();

        h() {
            super(8);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(Impl.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/snapchat/network/nano/DataConsumptionBlob;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            String str4 = (String) obj5;
            Long l = (Long) obj6;
            Long l2 = (Long) obj7;
            adsh adsh = (adsh) obj8;
            akcr.b(str, "p2");
            akcr.b(str2, "p3");
            return new Impl(longValue, str, str2, str3, str4, l, l2, adsh);
        }
    }

    /* renamed from: fxw$l */
    static final class l extends akcq implements akcf<Long, String, String, String, String, Long, Long, adsh, Impl> {
        public static final l a = new l();

        l() {
            super(8);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(Impl.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/snapchat/network/nano/DataConsumptionBlob;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            String str4 = (String) obj5;
            Long l = (Long) obj6;
            Long l2 = (Long) obj7;
            adsh adsh = (adsh) obj8;
            akcr.b(str, "p2");
            akcr.b(str2, "p3");
            return new Impl(longValue, str, str2, str3, str4, l, l2, adsh);
        }
    }

    public fxw(fxx fxx, aino aino) {
        akcr.b(fxx, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.c = fxx;
        this.d = aino;
    }

    public final void createFetchBeginTimeIndex() {
        this.d.execute(Integer.valueOf(27), "CREATE INDEX IF NOT EXISTS dataFetchedTime ON DataConsumption(fetchBeginTimestamp)", 0, null);
    }

    public final void createFirstAccessedTimeIndex() {
        this.d.execute(Integer.valueOf(28), "CREATE INDEX IF NOT EXISTS firstAccessTime ON DataConsumption(firstAccessedTimestamp)", 0, null);
    }

    public final void deleteAll() {
        this.d.execute(Integer.valueOf(26), "DELETE FROM DataConsumption", 0, null);
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.c.a.a, (Iterable) this.c.a.e), (Iterable) this.c.a.b), (Iterable) this.c.a.f));
    }

    public final void deleteAllConsumedRows() {
        this.d.execute(Integer.valueOf(24), akfu.a("\n        |DELETE FROM DataConsumption\n        |WHERE firstAccessedTimestamp > 0\n        ", "|"), 0, null);
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.c.a.a, (Iterable) this.c.a.e), (Iterable) this.c.a.b), (Iterable) this.c.a.f));
    }

    public final void deleteOldRecords(Long l) {
        this.d.execute(Integer.valueOf(25), akfu.a("\n        |DELETE FROM DataConsumption\n        |WHERE fetchBeginTimestamp < ?1\n        ", "|"), 1, new c(l));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.c.a.a, (Iterable) this.c.a.e), (Iterable) this.c.a.b), (Iterable) this.c.a.f));
    }

    public final ainb<DataConsumption> filterUnconsumedRows(Collection<String> collection) {
        akcr.b(collection, "contentObjectId");
        return filterUnconsumedRows(collection, e.a);
    }

    public final <T> ainb<T> filterUnconsumedRows(Collection<String> collection, akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf) {
        akcr.b(collection, "contentObjectId");
        akcr.b(akcf, "mapper");
        return new a(this, collection, new d(this, akcf));
    }

    public final void insertRow(String str, String str2, String str3, String str4, Long l, Long l2, adsh adsh) {
        String str5 = str;
        akcr.b(str, "contentObjectId");
        String str6 = str2;
        akcr.b(str6, "networkRequestId");
        this.d.execute(Integer.valueOf(22), akfu.a("\n        |INSERT INTO DataConsumption(contentObjectId, networkRequestId, contentType, featureType, fetchBeginTimestamp, firstAccessedTimestamp, blob)\n        |VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7)\n        ", "|"), 7, new f(this, str5, str6, str3, str4, l, l2, adsh));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.c.a.a, (Iterable) this.c.a.e), (Iterable) this.c.a.b), (Iterable) this.c.a.f));
    }

    public final ainb<DataConsumption> selectAll() {
        return selectAll(h.a);
    }

    public final <T> ainb<T> selectAll(akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf) {
        akcr.b(akcf, "mapper");
        return ainc.a(21, this.f, this.d, akfu.a("\n    |SELECT *\n    |FROM DataConsumption\n    ", "|"), new g(this, akcf));
    }

    public final ainb<DataConsumption> selectAllConsumedRows() {
        return selectAllConsumedRows(j.a);
    }

    public final <T> ainb<T> selectAllConsumedRows(akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf) {
        akcr.b(akcf, "mapper");
        return ainc.a(19, this.e, this.d, akfu.a("\n    |SELECT *\n    |FROM DataConsumption\n    |WHERE firstAccessedTimestamp > 0\n    ", "|"), new i(this, akcf));
    }

    public final ainb<DataConsumption> selectAllNewlyFetchedRows(Long l) {
        return selectAllNewlyFetchedRows(l, l.a);
    }

    public final <T> ainb<T> selectAllNewlyFetchedRows(Long l, akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf) {
        akcr.b(akcf, "mapper");
        return new b(this, l, new k(this, akcf));
    }

    public final void setFirstAccessedTimeToLastestEntry(Long l, String str) {
        akcr.b(str, "contentObjectId");
        this.d.execute(Integer.valueOf(23), akfu.a("\n        |UPDATE DataConsumption\n        |SET firstAccessedTimestamp = ?1\n        |WHERE _id IN (\n        |    SELECT _id\n        |    FROM DataConsumption\n        |    WHERE contentObjectId = ?2\n        |    AND coalesce(firstAccessedTimestamp, 0) = 0\n        |    ORDER BY fetchBeginTimestamp DESC\n        |    LIMIT 1\n        |)\n        ", "|"), 2, new m(l, str));
        a(ajyu.d((Collection) ajyu.d((Collection) ajyu.d((Collection) this.c.a.a, (Iterable) this.c.a.e), (Iterable) this.c.a.b), (Iterable) this.c.a.f));
    }
}
