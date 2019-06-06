package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.jf.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: abqz */
public final class abqz {
    private static final Supplier<abqz> b = Suppliers.memoize(new 1());
    public final List<Object> a;

    /* renamed from: abqz$a */
    public static class a {
        public static final c<a> a = new c(10);
    }

    /* renamed from: abqz$1 */
    static class 1 implements Supplier<abqz> {
        1() {
        }

        public final /* synthetic */ Object get() {
            return new abqz();
        }
    }

    private abqz() {
        this.a = new CopyOnWriteArrayList();
    }

    /* synthetic */ abqz(byte b) {
        this();
    }

    public static abqz a() {
        return (abqz) b.get();
    }
}
