package defpackage;

import java.util.Set;

/* renamed from: iip */
public final class iip {
    public aahp a;
    public final aail b;
    public final aann c;
    public final iiq d;
    public final aaij e;
    public final aahr f;
    public boolean g;

    public /* synthetic */ iip() {
        aail aail = new aail();
        aann aann = new aann();
        iiq iiq = new iiq();
        aaij aaij = new aaij();
        aahr aahr = new aahr();
        aahr.a(Double.valueOf(1.0d));
        aahr.a(Boolean.FALSE);
        aahr.b(Boolean.FALSE);
        aahr.c(Boolean.FALSE);
        aahr.d(Boolean.FALSE);
        aahr.e(Boolean.FALSE);
        aahr.f(Boolean.FALSE);
        aahr.g(Boolean.FALSE);
        aahr.h(Boolean.FALSE);
        aahr.i(Boolean.FALSE);
        this(aail, aann, iiq, aaij, aahr);
    }

    private iip(aail aail, aann aann, iiq iiq, aaij aaij, aahr aahr) {
        akcr.b(aail, "directSnapPreview");
        akcr.b(aann, "geofilterDirectSnapPreview");
        akcr.b(iiq, "unlockablePreviewAnalytics");
        akcr.b(aaij, "directSnapDiscard");
        akcr.b(aahr, "creativeTools");
        this.b = aail;
        this.c = aann;
        this.d = iiq;
        this.e = aaij;
        this.f = aahr;
        this.g = false;
    }

    public final Set<aaim> a() {
        return ajzt.a((Object[]) new aaim[]{this.b, this.c});
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iip) {
                iip iip = (iip) obj;
                if (akcr.a(this.b, iip.b) && akcr.a(this.c, iip.c) && akcr.a(this.d, iip.d) && akcr.a(this.e, iip.e) && akcr.a(this.f, iip.f)) {
                    if ((this.g == iip.g ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        aail aail = this.b;
        int i = 0;
        int hashCode = (aail != null ? aail.hashCode() : 0) * 31;
        aann aann = this.c;
        hashCode = (hashCode + (aann != null ? aann.hashCode() : 0)) * 31;
        iiq iiq = this.d;
        hashCode = (hashCode + (iiq != null ? iiq.hashCode() : 0)) * 31;
        aaij aaij = this.e;
        hashCode = (hashCode + (aaij != null ? aaij.hashCode() : 0)) * 31;
        aahr aahr = this.f;
        if (aahr != null) {
            i = aahr.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.g;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreviewAnalyticsWrapper(directSnapPreview=");
        stringBuilder.append(this.b);
        stringBuilder.append(", geofilterDirectSnapPreview=");
        stringBuilder.append(this.c);
        stringBuilder.append(", unlockablePreviewAnalytics=");
        stringBuilder.append(this.d);
        stringBuilder.append(", directSnapDiscard=");
        stringBuilder.append(this.e);
        stringBuilder.append(", creativeTools=");
        stringBuilder.append(this.f);
        stringBuilder.append(", hasGeoContents=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
