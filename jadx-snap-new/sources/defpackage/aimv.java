package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import defpackage.aimz.b;
import defpackage.aimz.c;
import java.io.Closeable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aimv */
public final class aimv implements Closeable {
    public final ThreadLocal<b> a = new ThreadLocal();
    public final c b = new 1();
    public volatile boolean c;
    private final ab d;
    private final b e;
    private final ajdu<c, c> f;
    private final ajws<Set<String>> g = new ajwo();
    private final ajfb<Object> h = new 2();
    private final ajdw i;

    /* renamed from: aimv$c */
    public interface c extends Closeable {
        void end();

        void markSuccessful();

        boolean yieldIfContendedSafely();

        boolean yieldIfContendedSafely(long j, TimeUnit timeUnit);
    }

    /* renamed from: aimv$1 */
    class 1 implements c {
        1() {
        }

        public final void close() {
            end();
        }

        public final void end() {
            Set set = (b) aimv.this.a.get();
            if (set != null) {
                aimv.this.a.set(set.a);
                boolean z = aimv.this.c;
                aimv.this.b().endTransaction();
                if (set.b) {
                    aimv.this.a(set);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Not in transaction.");
        }

        public final void markSuccessful() {
            boolean z = aimv.this.c;
            aimv.this.b().setTransactionSuccessful();
        }

        public final boolean yieldIfContendedSafely() {
            return aimv.this.b().yieldIfContendedSafely();
        }

        public final boolean yieldIfContendedSafely(long j, TimeUnit timeUnit) {
            return aimv.this.b().yieldIfContendedSafely(timeUnit.toMillis(j));
        }
    }

    /* renamed from: aimv$2 */
    class 2 implements ajfb<Object> {
        2() {
        }

        public final void accept(Object obj) {
            if (aimv.this.a.get() != null) {
                throw new IllegalStateException("Cannot subscribe to observable query in a transaction.");
            }
        }
    }

    /* renamed from: aimv$b */
    public static final class b extends LinkedHashSet<String> implements SQLiteTransactionListener {
        final b a;
        boolean b;

        public b(b bVar) {
            this.a = bVar;
        }

        public final void onBegin() {
        }

        public final void onCommit() {
            this.b = true;
        }

        public final void onRollback() {
        }

        public final String toString() {
            String format = String.format("%08x", new Object[]{Integer.valueOf(System.identityHashCode(this))});
            if (this.a == null) {
                return format;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(format);
            stringBuilder.append(" [");
            stringBuilder.append(this.a.toString());
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    /* renamed from: aimv$a */
    public final class a extends c implements ajfc<Set<String>, c>, ajfl<Set<String>> {
        private final Iterable<String> a;
        private final ad b;

        public a(Iterable<String> iterable, ad adVar) {
            this.a = iterable;
            this.b = adVar;
        }

        public final Cursor a() {
            if (aimv.this.a.get() == null) {
                Cursor query = aimv.this.a().query(this.b);
                boolean z = aimv.this.c;
                return query;
            }
            throw new IllegalStateException("Cannot execute observable query in a transaction.");
        }

        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return this;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Set set = (Set) obj;
            for (String contains : this.a) {
                if (set.contains(contains)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return this.b.getSql();
        }
    }

    public aimv(ab abVar, b bVar, ajdw ajdw, ajdu<c, c> ajdu) {
        this.d = abVar;
        this.e = bVar;
        this.i = ajdw;
        this.f = ajdu;
    }

    public final int a(String str, ae aeVar) {
        Set singleton = Collections.singleton(str);
        boolean z = this.c;
        int executeUpdateDelete = aeVar.executeUpdateDelete();
        if (executeUpdateDelete > 0) {
            a(singleton);
        }
        return executeUpdateDelete;
    }

    public final aa a() {
        return this.d.getReadableDatabase();
    }

    public final aimw a(a aVar) {
        if (this.a.get() == null) {
            return (aimw) this.g.a((ajfl) aVar).p(aVar).h((Object) aVar).a(this.i).a(this.f).e(this.h).y(aimw.a);
        }
        throw new IllegalStateException("Cannot create observable query in transaction. Use query() for a query inside a transaction.");
    }

    public final aimw a(Iterable<String> iterable, ad adVar) {
        return a(new a(iterable, adVar));
    }

    public final Cursor a(ad adVar) {
        Cursor query = a().query(adVar);
        boolean z = this.c;
        return query;
    }

    public final Cursor a(String str, Object... objArr) {
        Cursor query = a().query(str, objArr);
        boolean z = this.c;
        return query;
    }

    public final void a(String str) {
        boolean z = this.c;
        b().execSQL(str);
    }

    public final void a(String str, String str2, Object... objArr) {
        Set singleton = Collections.singleton(str);
        boolean z = this.c;
        b().execSQL(str2, objArr);
        a(singleton);
    }

    /* Access modifiers changed, original: final */
    public final void a(Set<String> set) {
        b bVar = (b) this.a.get();
        if (bVar != null) {
            bVar.addAll(set);
            return;
        }
        boolean z = this.c;
        this.g.a((Object) set);
    }

    public final long b(String str, ae aeVar) {
        Set singleton = Collections.singleton(str);
        boolean z = this.c;
        long executeInsert = aeVar.executeInsert();
        if (executeInsert != -1) {
            a(singleton);
        }
        return executeInsert;
    }

    public final aa b() {
        return this.d.getWritableDatabase();
    }

    public final void close() {
        this.d.close();
    }
}
