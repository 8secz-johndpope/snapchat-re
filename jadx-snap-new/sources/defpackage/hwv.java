package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: hwv */
public final class hwv {
    final ajdx<SharedPreferences> a;
    final Context b;
    private final ajdw c = zgb.a(hxd.a.callsite("BlacklistedClientStudiesStore")).f();
    private final zgb d;

    /* renamed from: hwv$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hwv$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ hwv a;

        d(hwv hwv) {
            this.a = hwv;
        }

        public final /* synthetic */ Object call() {
            return this.a.b.getSharedPreferences("BlacklistedClientStudiesStore", 0);
        }
    }

    /* renamed from: hwv$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ Collection a;

        b(Collection collection) {
            this.a = collection;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SharedPreferences sharedPreferences = (SharedPreferences) obj;
            akcr.b(sharedPreferences, "it");
            sharedPreferences.edit().putStringSet("BlacklistedStudies", new HashSet(this.a)).apply();
            return ajxw.a;
        }
    }

    /* renamed from: hwv$c */
    static final class c<T> implements ajfb<ajxw> {
        private /* synthetic */ Collection a;

        c(Collection collection) {
            this.a = collection;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    public hwv(zgb zgb, Context context) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(context, "context");
        this.d = zgb;
        this.b = context;
        Object b = ajdx.c((Callable) new d(this)).a().b(this.c);
        akcr.a(b, "Single\n            .from…  .subscribeOn(scheduler)");
        this.a = b;
    }
}
