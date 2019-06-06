package defpackage;

import android.database.Cursor;
import java.util.List;

/* renamed from: aimz */
public final class aimz {
    static final b a = new 1();
    static final ajdu<c, c> b = new 2();
    public final b c;
    public final ajdu<c, c> d;

    /* renamed from: aimz$a */
    public static final class a {
        public b a = aimz.a;
        public ajdu<c, c> b = aimz.b;
    }

    /* renamed from: aimz$1 */
    static class 1 implements b {
        1() {
        }
    }

    /* renamed from: aimz$2 */
    static class 2 implements ajdu<c, c> {
        2() {
        }

        public final /* bridge */ /* synthetic */ ajdt apply(ajdp ajdp) {
            return ajdp;
        }
    }

    /* renamed from: aimz$b */
    public interface b {
    }

    /* renamed from: aimz$c */
    public static abstract class c {
        public static <T> ajds<T, c> a(ajfc<Cursor, T> ajfc) {
            return new aimy(ajfc, null);
        }

        public static <T> ajds<T, c> a(ajfc<Cursor, T> ajfc, T t) {
            if (t != null) {
                return new aimy(ajfc, t);
            }
            throw new NullPointerException("defaultValue == null");
        }

        public static <T> ajds<List<T>, c> b(ajfc<Cursor, T> ajfc) {
            return new aimx(ajfc);
        }

        public abstract Cursor a();
    }

    public aimz(b bVar, ajdu<c, c> ajdu) {
        this.c = bVar;
        this.d = ajdu;
    }
}
