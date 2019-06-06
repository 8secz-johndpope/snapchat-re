package defpackage;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adne */
public final class adne {
    public a a;
    private final AtomicBoolean b;

    /* renamed from: adne$a */
    public interface a {
        void k();
    }

    public adne(AtomicBoolean atomicBoolean) {
        this.b = (AtomicBoolean) Preconditions.checkNotNull(atomicBoolean);
    }

    public final void a() {
        this.b.set(true);
        a aVar = this.a;
        if (aVar != null) {
            aVar.k();
        }
    }

    public final void a(a aVar) {
        this.a = aVar;
    }
}
