package defpackage;

import android.database.Cursor;

/* renamed from: mpo */
public interface mpo {

    /* renamed from: mpo$a */
    public interface a<T extends mpo> {
        T create(long j, String str, byte[] bArr);
    }

    /* renamed from: mpo$c */
    public static final class c<T extends mpo> {
        public final a<T> a;

        /* renamed from: mpo$c$a */
        final class a extends ainx {
            private final String a;

            a(String str) {
                super("SELECT *\nFROM LensPersistentStorage\nWHERE lensId = ?1", new aioa("LensPersistentStorage"));
                this.a = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.a);
            }
        }

        public c(a<T> aVar) {
            this.a = aVar;
        }

        public final ainx a(String str) {
            return new a(str);
        }

        public final d<T> a() {
            return new d(this);
        }
    }

    /* renamed from: mpo$d */
    public static final class d<T extends mpo> implements ainw<T> {
        private final c<T> a;

        public d(c<T> cVar) {
            this.a = cVar;
        }

        /* renamed from: a */
        public final T map(Cursor cursor) {
            return this.a.a.create(cursor.getLong(0), cursor.getString(1), cursor.getBlob(2));
        }
    }

    /* renamed from: mpo$b */
    public static final class b extends ainy {
        public b(pa paVar) {
            super("LensPersistentStorage", paVar.a("DELETE FROM LensPersistentStorage"));
        }
    }

    /* renamed from: mpo$e */
    public static final class e extends ainy {
        public e(pa paVar) {
            super("LensPersistentStorage", paVar.a("INSERT OR REPLACE INTO LensPersistentStorage(lensId, data)\nVALUES (?, ?)"));
        }

        public final void a(String str, byte[] bArr) {
            bindString(1, str);
            bindBlob(2, bArr);
        }
    }

    long _id();

    byte[] data();

    String lensId();
}
