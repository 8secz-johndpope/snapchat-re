package defpackage;

import com.google.common.base.Supplier;

/* renamed from: eji */
public final class eji implements Supplier<Boolean> {
    private final Supplier<Boolean> a;
    private final ilv b;
    private boolean c = false;

    public eji(Supplier<Boolean> supplier, ilv ilv) {
        this.a = supplier;
        this.b = ilv;
    }

    public final /* synthetic */ Object get() {
        if (((Boolean) this.a.get()).booleanValue()) {
            return Boolean.TRUE;
        }
        if (!this.c) {
            this.b.c(inq.KEY_EVENT_INTERCEPTION_BUG, 1);
            this.c = true;
        }
        return Boolean.FALSE;
    }
}
