package defpackage;

import android.database.Cursor;

/* renamed from: nfl */
public interface nfl {

    /* renamed from: nfl$a */
    public interface a<T extends nfl> {
        T create(long j, String str);
    }

    /* renamed from: nfl$c */
    public static final class c<T extends nfl> {
        public final a<T> a;

        public c(a<T> aVar) {
            this.a = aVar;
        }

        public static ainx a() {
            return new ainx("SELECT *\nFROM BlacklistFriend", new aioa("BlacklistFriend"));
        }
    }

    /* renamed from: nfl$e */
    public static final class e<T extends nfl> implements ainw<T> {
        private final c<T> a;

        public e(c<T> cVar) {
            this.a = cVar;
        }

        public final /* synthetic */ Object map(Cursor cursor) {
            return this.a.a.create(cursor.getLong(0), cursor.getString(1));
        }
    }

    /* renamed from: nfl$b */
    public static final class b extends ainy {
        public b(pa paVar) {
            super("BlacklistFriend", paVar.a("DELETE FROM BlacklistFriend"));
        }
    }

    /* renamed from: nfl$d */
    public static final class d extends ainy {
        public d(pa paVar) {
            super("BlacklistFriend", paVar.a("INSERT OR REPLACE INTO BlacklistFriend(\n    friendId)\nVALUES(?)"));
        }

        public final void a(String str) {
            bindString(1, str);
        }
    }

    long a();

    String b();
}
