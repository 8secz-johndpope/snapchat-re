package defpackage;

import defpackage.kox.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: koy */
public final class koy {
    public final kow a;
    private final kou b;

    public koy(kow kow, kou kou) {
        this.a = kow;
        this.b = kou;
    }

    public static kov a(List<kox> list) {
        kov kov = new kov();
        for (kox kox : list) {
            a aVar = kox.a;
            long j = ((long) kox.b) * ((long) kox.c);
            if (aVar == a.VIDEO_ENCODER) {
                kov.a += j;
            } else if (aVar == a.VIDEO_DECODER) {
                kov.b += j;
            }
        }
        return kov;
    }

    public final long a() {
        return Long.MAX_VALUE - this.a.b.a();
    }

    public final void a(kom kom) {
        kow kow = this.a;
        if (kow.a.size() >= 100) {
            kow.a.poll();
        }
        kow.a.add(new koq(kom));
    }

    public final long b() {
        return this.a.b.a;
    }

    public final void b(List<kox> list) {
        kow kow = this.a;
        kov a = koy.a((List) list);
        kov kov = kow.b;
        akcr.b(a, "other");
        kov.a += a.a;
        kov.b += a.b;
    }

    public final long c() {
        return this.a.b.b;
    }

    public final List<kor> c(List<kor> list) {
        long a = a();
        ArrayList arrayList = new ArrayList();
        for (kor kor : list) {
            long a2 = koy.a(Collections.unmodifiableList(kor.d)).a();
            if (a2 < a) {
                a -= a2;
                arrayList.add(kor);
            }
        }
        return arrayList;
    }
}
