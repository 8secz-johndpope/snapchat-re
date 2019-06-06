package defpackage;

import com.snap.core.db.record.UploadedMediaModel;
import defpackage.oho.b;
import java.util.Collection;
import java.util.List;

/* renamed from: ohv */
final class ohv extends aing implements ohm {
    final List<ainb<?>> a = ainr.a();
    final oht b;
    final aino c;
    private final List<ainb<?>> d = ainr.a();

    /* renamed from: ohv$f */
    static final class f extends akcq implements akcb<Long, String, byte[], odz, b> {
        public static final f a = new f();

        f() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;[BLcom/snap/media/api/manager/MediaPackageState;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            byte[] bArr = (byte[]) obj3;
            odz odz = (odz) obj4;
            akcr.b(str, "p2");
            akcr.b(odz, "p4");
            return new b(longValue, str, bArr, odz);
        }
    }

    /* renamed from: ohv$e */
    static final class e extends akcs implements akbl<ainn, T> {
        private /* synthetic */ ohv a;
        private /* synthetic */ akcb b;

        e(ohv ohv, akcb akcb) {
            this.a = ohv;
            this.b = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.b;
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            String string = ainn.getString(1);
            if (string == null) {
                akcr.a();
            }
            byte[] bytes = ainn.getBytes(2);
            aina aina = this.a.b.d.a;
            Long l2 = ainn.getLong(3);
            if (l2 == null) {
                akcr.a();
            }
            return akcb.invoke(l, string, bytes, aina.decode(l2));
        }
    }

    /* renamed from: ohv$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ ohv b;

        /* renamed from: ohv$a$a */
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

        public a(ohv ohv, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, UploadedMediaModel.SESSION_ID);
            akcr.b(akbl, "mapper");
            this.b = ohv;
            super(ohv.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.c.executeQuery(Integer.valueOf(6), akfu.a("\n        |SELECT *\n        |FROM media_package\n        |WHERE session_id = ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: ohv$d */
    static final class d extends akcq implements akcb<Long, String, byte[], odz, b> {
        public static final d a = new d();

        d() {
            super(4);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(b.class);
        }

        public final String getSignature() {
            return "<init>(JLjava/lang/String;[BLcom/snap/media/api/manager/MediaPackageState;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            long longValue = ((Number) obj).longValue();
            String str = (String) obj2;
            byte[] bArr = (byte[]) obj3;
            odz odz = (odz) obj4;
            akcr.b(str, "p2");
            akcr.b(odz, "p4");
            return new b(longValue, str, bArr, odz);
        }
    }

    /* renamed from: ohv$c */
    static final class c extends akcs implements akbl<ainn, T> {
        private /* synthetic */ ohv a;
        private /* synthetic */ akcb b;

        c(ohv ohv, akcb akcb) {
            this.a = ohv;
            this.b = akcb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainn ainn = (ainn) obj;
            akcr.b(ainn, "cursor");
            akcb akcb = this.b;
            Long l = ainn.getLong(0);
            if (l == null) {
                akcr.a();
            }
            String string = ainn.getString(1);
            if (string == null) {
                akcr.a();
            }
            byte[] bytes = ainn.getBytes(2);
            aina aina = this.a.b.d.a;
            Long l2 = ainn.getLong(3);
            if (l2 == null) {
                akcr.a();
            }
            return akcb.invoke(l, string, bytes, aina.decode(l2));
        }
    }

    /* renamed from: ohv$b */
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

    /* renamed from: ohv$g */
    static final class g extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ ohv a;
        private /* synthetic */ String b;
        private /* synthetic */ byte[] c;
        private /* synthetic */ odz d;

        g(ohv ohv, String str, byte[] bArr, odz odz) {
            this.a = ohv;
            this.b = str;
            this.c = bArr;
            this.d = odz;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.b);
            ainp.bindBytes(2, this.c);
            ainp.bindLong(3, (Long) this.a.b.d.a.encode(this.d));
            return ajxw.a;
        }
    }

    public ohv(oht oht, aino aino) {
        akcr.b(oht, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.b = oht;
        this.c = aino;
    }

    public final ainb<oho> a() {
        akcb akcb = f.a;
        akcr.b(akcb, "mapper");
        return ainc.a(7, this.d, this.c, akfu.a("\n    |SELECT *\n    |FROM media_package\n    |WHERE state = 1\n    ", "|"), new e(this, akcb));
    }

    public final ainb<oho> a(String str) {
        String str2 = UploadedMediaModel.SESSION_ID;
        akcr.b(str, str2);
        akcb akcb = d.a;
        akcr.b(str, str2);
        akcr.b(akcb, "mapper");
        return new a(this, str, new c(this, akcb));
    }

    public final void a(String str, byte[] bArr, odz odz) {
        akcr.b(str, UploadedMediaModel.SESSION_ID);
        akcr.b(odz, "state");
        this.c.execute(Integer.valueOf(8), akfu.a("\n        |INSERT OR REPLACE INTO media_package (\n        |    session_id,\n        |    data,\n        |    state\n        |)\n        |VALUES(?1,?2,?3)\n        ", "|"), 3, new g(this, str, bArr, odz));
        a(ajyu.d((Collection) this.b.a.a, (Iterable) this.b.a.d));
    }

    public final void b(String str) {
        akcr.b(str, UploadedMediaModel.SESSION_ID);
        this.c.execute(Integer.valueOf(9), akfu.a("\n        |DELETE FROM media_package\n        |WHERE session_id = ?1\n        ", "|"), 1, new b(str));
        a(ajyu.d((Collection) this.b.a.a, (Iterable) this.b.a.d));
    }
}
