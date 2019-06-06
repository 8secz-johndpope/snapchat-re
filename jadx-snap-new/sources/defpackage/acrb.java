package defpackage;

import java.util.Comparator;

/* renamed from: acrb */
public final class acrb implements Comparator<acxe> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        acxe acxe = (acxe) obj;
        acxe acxe2 = (acxe) obj2;
        akcr.b(acxe, "p1");
        akcr.b(acxe2, "p2");
        return acxe.d > acxe2.d ? -1 : acxe.d < acxe2.d ? 1 : 0;
    }
}
