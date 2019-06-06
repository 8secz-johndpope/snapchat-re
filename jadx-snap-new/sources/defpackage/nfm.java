package defpackage;

import android.database.Cursor;

/* renamed from: nfm */
public interface nfm {

    /* renamed from: nfm$a */
    public interface a<T extends nfm> {
        T create(long j, String str);
    }

    /* renamed from: nfm$c */
    public static final class c<T extends nfm> {
        public final a<T> a;

        public c(a<T> aVar) {
            this.a = aVar;
        }

        public static ainx a() {
            return new ainx("SELECT *\nFROM CustomFriend", new aioa("CustomFriend"));
        }
    }

    /* renamed from: nfm$e */
    public static final class e<T extends nfm> implements ainw<T> {
        private final c<T> a;

        public e(c<T> cVar) {
            this.a = cVar;
        }

        public final /* synthetic */ Object map(Cursor cursor) {
            return this.a.a.create(cursor.getLong(0), cursor.getString(1));
        }
    }

    /* renamed from: nfm$b */
    public static final class b extends ainy {
        public b(pa paVar) {
            super("CustomFriend", paVar.a("DELETE FROM CustomFriend"));
        }
    }

    /* renamed from: nfm$d */
    public static final class d extends ainy {
        public d(pa paVar) {
            super("CustomFriend", paVar.a("INSERT OR REPLACE INTO CustomFriend(\n    friendId)\nVALUES(?)"));
        }

        public final void a(String str) {
            bindString(1, str);
        }
    }

    long a();

    String b();
}
