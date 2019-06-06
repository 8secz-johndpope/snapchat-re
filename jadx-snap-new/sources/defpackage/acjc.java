package defpackage;

import com.google.common.collect.Lists;
import defpackage.acix.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acjc */
public final class acjc<T extends achg, C extends achd<T, C>> extends acjd<T, C> {
    private final List<acgu<T>> e;

    protected acjc(acjd<T, C> acjd, acgu<T> acgu, aciv<T, C> aciv) {
        super(acjd.a, acjd.b, acjd.c, new ArrayDeque(acjd.d));
        this.e = Lists.newArrayList(acgu);
        if (acgu.c() == acgw.PRESENT) {
            this.d.push(new acje(acgu, aciv));
        } else {
            this.d.pop();
        }
    }

    protected acjc(acjd<T, C> acjd, acig<T, C> acig) {
        super(acjd.a, acjd.b, acjd.c, new ArrayDeque(acjd.d));
        this.e = new ArrayList();
        while (!acig.b(this.c, this)) {
            acgu c = acig.c(this.c, this);
            this.e.add(c);
            if (c.c() == acgw.PRESENT) {
                this.d.push(new acje(c, this.a.a(this.b, c.h())));
            } else {
                this.d.pop();
            }
        }
    }

    public final b a(aciv<T, C> aciv) {
        if (aciv.a == e()) {
            return b.VISIBLE;
        }
        Object obj = 1;
        for (acje a : this.d) {
            aciv a2 = a.a();
            if (a2.a == aciv.a) {
                return obj != null ? b.PARTIALLY_VISIBLE : b.STACKED;
            } else {
                if (!a2.e().a()) {
                    obj = null;
                }
            }
        }
        return b.STACKED;
    }

    public final List<acgu<T>> a() {
        return this.e;
    }
}
