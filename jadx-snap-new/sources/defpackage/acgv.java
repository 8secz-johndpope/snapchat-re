package defpackage;

import android.util.ArrayMap;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: acgv */
public class acgv<T extends achg> {
    public final ArrayMap<T, Supplier<achd<T, ? extends achd<T, ?>>>> a;
    private Map<achr, acgu<T>> b;

    /* renamed from: acgv$a */
    public static class a<T extends achg> {
        final Map<achr, acgu<T>> a = new EnumMap(achr.class);

        public final a<T> a(acgu<T> acgu) {
            achr a = acgu.a();
            Preconditions.checkArgument(this.a.get(a) == null);
            this.a.put(a, acgu);
            return this;
        }

        public final acgv<T> a() {
            return new acgv(this, (byte) 0);
        }
    }

    /* renamed from: acgv$b */
    public static class b<T extends achg, C extends achd<T, C>> {
        final Map<achr, acgu<T>> a = new EnumMap(achr.class);
        final Map<T, Supplier<achd<T, ? extends achd<T, ?>>>> b = new ArrayMap();

        b() {
        }

        public final b<T, C> a(acgu<T> acgu) {
            achr achr = (achr) Preconditions.checkNotNull(acgu.a());
            Preconditions.checkArgument(this.a.get(achr) == null);
            this.a.put(achr, acgu);
            return this;
        }

        public final b<T, C> a(T t, Supplier<achd<T, ?>> supplier) {
            this.b.put(t, supplier);
            return this;
        }

        public final acgv<T> a() {
            return new acgv(this, (byte) 0);
        }
    }

    private acgv(a<T> aVar) {
        this.b = new EnumMap(aVar.a);
        this.a = new ArrayMap();
    }

    private acgv(b<T, ? extends achd<T, ?>> bVar) {
        this.b = new EnumMap(bVar.a);
        this.a = new ArrayMap();
        this.a.putAll(bVar.b);
    }

    @Deprecated
    public acgv(Map<achr, acgu<T>> map) {
        this.b = map;
        this.a = new ArrayMap();
    }

    public static <U extends achg> a<U> a() {
        return new a();
    }

    public static <U extends achg, V extends achd<U, V>> b<U, V> b() {
        return new b();
    }

    public acgu<T> a(achr achr) {
        return (acgu) this.b.get(achr);
    }
}
