package defpackage;

import defpackage.elf.c;
import defpackage.elf.d;
import defpackage.elf.e;

/* renamed from: elc */
public final class elc implements dno {
    private final ajwy<elf> a;

    public elc(ajwy<elf> ajwy) {
        akcr.b(ajwy, "eventListenerProvider");
        this.a = ajwy;
    }

    public final ajej start() {
        Object a;
        String str;
        if (abnl.g) {
            elf elf = (elf) this.a.get();
            elf.f.a((achk) elf);
            elf.f.a((achh) elf);
            ajdp a2 = ajdp.a((ajdt) elf.g, (ajdt) elf.h, (ajex) new c());
            if (a2 == null) {
                akcr.a();
            }
            a = ajek.a((ajev) new d(elf, a2.a((ajdw) elf.a.l()).f((ajfb) new elg(new e(elf)))));
            str = "Disposables.fromAction {…vator's start\")\n        }";
        } else {
            a = ajfq.INSTANCE;
            str = "Disposables.disposed()";
        }
        akcr.a(a, str);
        return a;
    }
}
