package defpackage;

import defpackage.acpv.b;

/* renamed from: acnv */
public final class acnv {
    final boolean a;
    final boolean b;
    final nkh c;
    final b d;

    public acnv(boolean z, boolean z2, nkh nkh, b bVar) {
        akcr.b(nkh, "friend");
        akcr.b(bVar, "exploreData");
        this.a = z;
        this.b = z2;
        this.c = nkh;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acnv) {
                acnv acnv = (acnv) obj;
                if ((this.a == acnv.a ? 1 : null) != null) {
                    if (!((this.b == acnv.b ? 1 : null) != null && akcr.a(this.c, acnv.c) && akcr.a(this.d, acnv.d))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.b;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        nkh nkh = this.c;
        int i3 = 0;
        i = (i + (nkh != null ? nkh.hashCode() : 0)) * 31;
        b bVar = this.d;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return i + i3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MapCarouselBoundUserData(isMe=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isFromCarousel=");
        stringBuilder.append(this.b);
        stringBuilder.append(", friend=");
        stringBuilder.append(this.c);
        stringBuilder.append(", exploreData=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
