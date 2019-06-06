package defpackage;

import com.google.common.base.Supplier;

/* renamed from: kre */
public final class kre {
    private final Supplier<dib> a;
    private final zfw b;
    private final ajei c;

    public kre(Supplier<dib> supplier, zfw zfw, ajei ajei) {
        akcr.b(supplier, "blizzardEventLogger");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "disposableContainer");
        this.a = supplier;
        this.b = zfw;
        this.c = ajei;
    }

    public final void a(akbk<? extends aajt> akbk) {
        akcr.b(akbk, "createEvent");
        Object obj = this.a.get();
        akcr.a(obj, "blizzardEventLogger.get()");
        krf.a((dib) obj, akbk, this.b.h(), this.c);
    }
}
