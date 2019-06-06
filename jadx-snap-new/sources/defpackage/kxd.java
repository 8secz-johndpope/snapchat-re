package defpackage;

import defpackage.kxc.a;
import defpackage.kxc.b;
import defpackage.kxc.c;

/* renamed from: kxd */
public final class kxd {
    public static final /* synthetic */ a a(kxc kxc) {
        if (kxc instanceof c) {
            c cVar = (c) kxc;
            return new a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g);
        } else if (kxc instanceof b) {
            b bVar = (b) kxc;
            return new a(Integer.valueOf(bVar.a), Boolean.valueOf(bVar.b), bVar.c, bVar.d, Float.valueOf(bVar.g), Float.valueOf(bVar.h), Float.valueOf(bVar.i));
        } else {
            throw new ajxk();
        }
    }
}
