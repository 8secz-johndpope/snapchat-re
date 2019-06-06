package defpackage;

import defpackage.kom.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: kos */
public final class kos {
    public final List<kom> a = new LinkedList();
    public final List<kom> b = new LinkedList();
    public final Map<String, List<kor>> c = new HashMap();
    public final Map<kor, kon> d = new HashMap();
    private final kok e;
    private final ihh f;

    public kos(kok kok, ihh ihh) {
        this.e = kok;
        this.f = ihh;
    }

    private void a(List<kom> list, kom kom, long j) {
        if (kom.a == b.INVALID) {
            b(list, kom, b(kom));
            return;
        }
        if (kom.c.b != koj.PLAYING) {
            long b = b(kom);
            if (b > j) {
                b(list, kom, b);
            }
        }
    }

    private static void a(koo koo, kom kom) {
        koo.a.add(kom.c.b);
        koo.b.add(kom.c.c);
    }

    private long b(kom kom) {
        return this.f.c() - kom.c.e;
    }

    private void b(List<kom> list, kom kom, long j) {
        list.add(kom);
        this.e.a(kom, j);
    }

    public final List<kom> a(long j) {
        ArrayList arrayList = new ArrayList();
        for (kom a : this.a) {
            a(arrayList, a, j);
        }
        for (kom a2 : this.b) {
            a(arrayList, a2, j);
        }
        return arrayList;
    }

    public final kon a(kor kor) {
        return (kon) this.d.get(kor);
    }

    public final void a(kom kom) {
        (kom.c.b.mPriority == kop.HIGH ? this.a : this.b).add(kom);
    }

    public final boolean a() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c() {
        return this.a.size() + this.b.size();
    }

    public final koo d() {
        koo koo = new koo(new ArrayList(), new ArrayList());
        for (kom a : this.a) {
            kos.a(koo, a);
        }
        for (kom a2 : this.b) {
            kos.a(koo, a2);
        }
        return koo;
    }
}
