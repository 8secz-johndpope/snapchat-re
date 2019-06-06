package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: aclr */
public final class aclr {
    public final aclg a;
    public final nct b;
    final nbo c;
    public final aclq d = new aclq(0);
    private final njw e;

    public aclr(aclg aclg, nct nct, nbo nbo, njw njw) {
        this.a = aclg;
        this.b = nct;
        this.c = nbo;
        this.e = njw;
    }

    public final aclq a() {
        return this.d;
    }

    public final Collection<String> a(String str) {
        alhm b = this.c.b(str);
        if (b == null) {
            return Collections.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (alhq alhq : b.e) {
            if (!TextUtils.isEmpty(alhq.a)) {
                String c = this.e.c(alhq.a);
                if (!TextUtils.isEmpty(c)) {
                    arrayList.add(c);
                }
            }
        }
        return arrayList;
    }

    public final int b() {
        return this.c.b() - 1;
    }

    public final boolean b(String str) {
        acwf f = this.a.f.h.f();
        return (f == null || f.b == null || !f.b.equals(str)) ? false : true;
    }

    public final int c() {
        ackq d = this.a.d();
        if (d == null) {
            return 0;
        }
        HashSet hashSet = d.a.g.c;
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            hashSet2.add(((acvr) it.next()).p.a);
        }
        return hashSet2.size();
    }

    public final int d() {
        ackq d = this.a.d();
        return d == null ? 0 : d.a.g.d;
    }

    public final int e() {
        ackq d = this.a.d();
        return d == null ? 0 : d.a.h.b;
    }

    public final Collection<alhq> f() {
        ArrayList arrayList = new ArrayList();
        ackq d = this.a.d();
        if (d == null) {
            return arrayList;
        }
        for (acvr acvr : d.e()) {
            arrayList.add(acvr.G);
        }
        return arrayList;
    }

    public final int g() {
        ackq d = this.a.d();
        return d == null ? 0 : d.e().size();
    }

    public final HashSet<String> h() {
        HashSet hashSet = new HashSet();
        if (this.a.d() == null) {
            return hashSet;
        }
        Iterator it = this.a.d().c.iterator();
        while (it.hasNext()) {
            hashSet.add(((acuu) it.next()).k().a.b);
        }
        return hashSet;
    }
}
