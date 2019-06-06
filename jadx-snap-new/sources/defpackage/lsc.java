package defpackage;

import defpackage.lsa.d;
import defpackage.lsa.d.b;

/* renamed from: lsc */
final class lsc {
    final d a;
    final boolean b;
    final boolean c;

    public /* synthetic */ lsc() {
        this(b.a, false, false);
    }

    public lsc(d dVar, boolean z, boolean z2) {
        akcr.b(dVar, "carouselUseCase");
        this.a = dVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lsc) {
                lsc lsc = (lsc) obj;
                if (akcr.a(this.a, lsc.a)) {
                    if ((this.b == lsc.b ? 1 : null) != null) {
                        if ((this.c == lsc.c ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        d dVar = this.a;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        int i = this.b;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.c;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CarouselUseCaseScanResult(carouselUseCase=");
        stringBuilder.append(this.a);
        stringBuilder.append(", listChanged=");
        stringBuilder.append(this.b);
        stringBuilder.append(", selectionChanged=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
