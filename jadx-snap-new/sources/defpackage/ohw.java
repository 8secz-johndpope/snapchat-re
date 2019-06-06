package defpackage;

import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;

/* renamed from: ohw */
final class ohw extends aing implements ohn {
    final List<ainb<?>> a = ainr.a();
    final aino b;
    private final oht c;

    /* renamed from: ohw$a */
    final class a<T> extends ainb<T> {
        final String a;
        private /* synthetic */ ohw b;

        /* renamed from: ohw$a$a */
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

        public a(ohw ohw, String str, akbl<? super ainn, ? extends T> akbl) {
            akcr.b(str, MessageMediaRefModel.URI);
            akcr.b(akbl, "mapper");
            this.b = ohw;
            super(ohw.a, akbl);
            this.a = str;
        }

        public final ainn a() {
            return this.b.b.executeQuery(Integer.valueOf(0), akfu.a("\n        |SELECT mime_type\n        |FROM media_package_shared_files\n        |WHERE uri = ?1\n        ", "|"), 1, new a(this));
        }
    }

    /* renamed from: ohw$b */
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

    /* renamed from: ohw$c */
    static final class c extends akcs implements akbl<ainn, String> {
        public static final c a = new c();

        c() {
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

    /* renamed from: ohw$d */
    static final class d extends akcs implements akbl<ainp, ajxw> {
        private /* synthetic */ String a;
        private /* synthetic */ long b;
        private /* synthetic */ String c;
        private /* synthetic */ String d;
        private /* synthetic */ String e;

        d(String str, long j, String str2, String str3, String str4) {
            this.a = str;
            this.b = j;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ainp ainp = (ainp) obj;
            akcr.b(ainp, "receiver$0");
            ainp.bindString(1, this.a);
            ainp.bindLong(2, Long.valueOf(this.b));
            ainp.bindString(3, this.c);
            ainp.bindString(4, this.d);
            ainp.bindString(5, this.e);
            return ajxw.a;
        }
    }

    public ohw(oht oht, aino aino) {
        akcr.b(oht, "database");
        akcr.b(aino, "driver");
        super(aino);
        this.c = oht;
        this.b = aino;
    }

    public final ainb<String> a(String str) {
        akcr.b(str, MessageMediaRefModel.URI);
        return new a(this, str, c.a);
    }

    public final void a(String str, long j, String str2, String str3, String str4) {
        String str5 = str;
        akcr.b(str, ohk.b);
        String str6 = str2;
        akcr.b(str6, ohk.d);
        String str7 = str3;
        akcr.b(str7, ohk.e);
        String str8 = str4;
        akcr.b(str8, MessageMediaRefModel.URI);
        this.b.execute(Integer.valueOf(1), akfu.a("\n        |INSERT OR REPLACE INTO media_package_shared_files (\n        |    _display_name,\n        |    _size,\n        |    _data,\n        |    mime_type,\n        |    uri\n        |) VALUES (?1, ?2, ?3, ?4, ?5)\n        ", "|"), 5, new d(str5, j, str6, str7, str8));
        a(this.c.c.a);
    }

    public final void b(String str) {
        akcr.b(str, MessageMediaRefModel.URI);
        this.b.execute(Integer.valueOf(2), akfu.a("\n        |DELETE FROM media_package_shared_files\n        |WHERE uri = ?1\n        ", "|"), 1, new b(str));
        a(this.c.c.a);
    }
}
