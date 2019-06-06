package defpackage;

import android.view.View;
import defpackage.uai.a;

/* renamed from: uak */
public final class uak extends uaq {
    public final uaj a;
    public final boolean b;
    public final View c;
    public final a d;
    public final boolean e;

    public uak(uaj uaj, boolean z, View view, a aVar, boolean z2) {
        akcr.b(uaj, "tooltipType");
        super();
        this.a = uaj;
        this.b = z;
        this.c = view;
        this.d = aVar;
        this.e = z2;
    }

    public /* synthetic */ uak(uaj uaj, boolean z, View view, a aVar, boolean z2, int i) {
        this(uaj, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : view, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uak) {
                uak uak = (uak) obj;
                if (akcr.a(this.a, uak.a)) {
                    if ((this.b == uak.b ? 1 : null) != null && akcr.a(this.c, uak.c) && akcr.a(this.d, uak.d)) {
                        if ((this.e == uak.e ? 1 : null) != null) {
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
        uaj uaj = this.a;
        int i = 0;
        int hashCode = (uaj != null ? uaj.hashCode() : 0) * 31;
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        View view = this.c;
        hashCode = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
        a aVar = this.d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.e;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShowTooltipData(tooltipType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", shouldForceFadeAfterShow=");
        stringBuilder.append(this.b);
        stringBuilder.append(", targetView=");
        stringBuilder.append(this.c);
        stringBuilder.append(", modifier=");
        stringBuilder.append(this.d);
        stringBuilder.append(", onlyShowIfNotVisible=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
