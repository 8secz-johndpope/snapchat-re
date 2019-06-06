package defpackage;

import defpackage.lqh.b.a;

/* renamed from: low */
final class low {
    final a a;
    private final boolean b;

    public /* synthetic */ low(a aVar) {
        this(aVar, false);
    }

    public low(a aVar, boolean z) {
        akcr.b(aVar, "result");
        this.a = aVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof low) {
                low low = (low) obj;
                if (akcr.a(this.a, low.a)) {
                    if ((this.b == low.b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActivatedResultWithLensState(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", ready=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
