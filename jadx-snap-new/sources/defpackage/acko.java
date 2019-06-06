package defpackage;

import java.util.Comparator;

/* renamed from: acko */
public final class acko implements Comparator<ackn> {
    public static int a(ackn ackn, ackn ackn2) {
        return Float.compare(ackn2.a(), ackn.a());
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return acko.a((ackn) obj, (ackn) obj2);
    }
}
