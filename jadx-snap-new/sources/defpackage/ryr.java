package defpackage;

import java.util.Comparator;

/* renamed from: ryr */
public final class ryr implements Comparator<rzf<ryz>> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        rzf rzf = (rzf) obj;
        rzf rzf2 = (rzf) obj2;
        if (rzf.equals(rzf2)) {
            return 0;
        }
        int a = ((ryz) rzf.a()).e().compareTo(((ryz) rzf2.a()).e());
        return a == 0 ? rzf.b() == rzf2.b() ? 0 : rzf.b() < rzf2.b() ? 1 : -1 : a < 0 ? 1 : -1;
    }
}
