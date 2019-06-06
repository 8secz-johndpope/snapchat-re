package defpackage;

import defpackage.aox.a;

/* renamed from: aoy */
public final class aoy<R> implements aov<R> {
    private final a a;
    private aou<R> b;

    aoy(a aVar) {
        this.a = aVar;
    }

    public final aou<R> a(boolean z, boolean z2) {
        if (z || !z2) {
            return aow.a;
        }
        if (this.b == null) {
            this.b = new aox(this.a);
        }
        return this.b;
    }
}
