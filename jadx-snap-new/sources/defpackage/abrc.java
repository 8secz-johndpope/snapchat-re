package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.Observable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: abrc */
public final class abrc extends Observable {
    public static final Supplier<abrc> c = Suppliers.memoize(new 1());
    public AtomicLong a = new AtomicLong(-1);
    public AtomicLong b = new AtomicLong(-1);

    /* renamed from: abrc$1 */
    static class 1 implements Supplier<abrc> {
        1() {
        }

        public final /* synthetic */ Object get() {
            return new abrc();
        }
    }
}
