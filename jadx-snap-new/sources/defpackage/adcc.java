package defpackage;

import java.util.Comparator;

/* renamed from: adcc */
public final class adcc implements Comparator<acuu> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        acuu acuu = (acuu) obj;
        acuu acuu2 = (acuu) obj2;
        int compare = Double.compare((double) acuu.k().a.g, (double) acuu2.k().a.g);
        if (!(acuu.k().a.l && acuu2.k().a.l)) {
            if (acuu.k().a.l) {
                return -1;
            }
            if (acuu2.k().a.l) {
                return 1;
            }
        }
        return compare;
    }
}
