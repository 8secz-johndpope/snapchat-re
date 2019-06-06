package defpackage;

import defpackage.aiva.a.a;
import java.util.Collection;

/* renamed from: aiwq */
final class aiwq {
    private final Object a;
    private final Collection<a> b;

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        synchronized (this.a) {
            this.b.add(aVar);
        }
    }
}
