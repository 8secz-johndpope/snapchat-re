package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acnr */
public final class acnr {
    List<acow> a = new ArrayList();
    final Map<String, Integer> b = new HashMap();
    private final acnu c;

    public acnr(acnu acnu) {
        this.c = acnu;
    }

    public final acow a(int i) {
        return (acow) this.a.get(i);
    }

    public final void a(acov acov) {
        for (acow acow : this.a) {
            acow.b.remove(acov);
        }
        this.b.remove(acov.a);
    }

    public final void a(List<acow> list, int i, int i2) {
        this.c.a(new ArrayList(list), i, i2);
        this.a = list;
        this.b.clear();
        int size = this.a.size();
        for (i = 0; i < size; i++) {
            for (acov acov : ((acow) this.a.get(i)).a()) {
                this.b.put(acov.a, Integer.valueOf(i));
            }
        }
    }
}
