package defpackage;

import com.google.common.base.MoreObjects;
import defpackage.aizc.a;

/* renamed from: aixj */
abstract class aixj implements aiwt {
    aixj() {
    }

    public final void a() {
        b().a();
    }

    public final void a(aivl aivl) {
        b().a(aivl);
    }

    public void a(aivw aivw, int i, aivl aivl) {
        b().a(aivw, i, aivl);
    }

    public void a(aivw aivw, aivl aivl) {
        b().a(aivw, aivl);
    }

    public final void a(a aVar) {
        b().a(aVar);
    }

    public abstract aiwt b();

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("delegate", b()).toString();
    }
}
