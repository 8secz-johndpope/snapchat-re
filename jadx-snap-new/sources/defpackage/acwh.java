package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: acwh */
public final class acwh {
    public static final Comparator<alhq> a = new 1();
    public final List<alhm> b = new ArrayList();
    public final List<alhq> c = new ArrayList();
    public double d;
    public double e;

    /* renamed from: acwh$1 */
    static class 1 implements Comparator<alhq> {
        1() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return Float.compare(((alhq) obj).b, ((alhq) obj2).b);
        }
    }

    public acwh(alhm alhm) {
        this.b.add(alhm);
        Collections.addAll(this.c, alhm.e);
        this.e = (double) alhm.c;
        this.d = (double) alhm.d;
    }
}
