package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: acii */
public class acii<T extends achg, C extends achd<T, C>> extends acig<T, C> {
    private int a;
    private final List<acgu<T>> b;

    public acii(acgu<T> acgu, acih acih) {
        akcr.b(acgu, "navigationAction");
        this((List) ajym.d(acgu), acih);
    }

    private acii(List<? extends acgu<T>> list, acih acih) {
        akcr.b(list, "mNavigationActions");
        super(acih);
        this.b = list;
    }

    private acii(acgu<T>[] acguArr) {
        akcr.b(acguArr, "navigationActions");
        this((List) ajym.d((acgu[]) Arrays.copyOf(acguArr, acguArr.length)), null);
    }

    public final boolean b(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        return this.a == this.b.size();
    }

    public final acgu<T> c(achc<T, C> achc, acjd<T, C> acjd) {
        akcr.b(achc, "navigationSpecs");
        akcr.b(acjd, "navigationStack");
        List list = this.b;
        int i = this.a;
        this.a = i + 1;
        return (acgu) list.get(i);
    }
}
