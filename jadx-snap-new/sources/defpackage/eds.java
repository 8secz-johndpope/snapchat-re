package defpackage;

import com.google.common.base.Predicate;

/* renamed from: eds */
public final class eds implements dnr {
    public achb<zjm, zjk> a;
    public zjm b;

    public final void a(Predicate<Void> predicate) {
        this.a.a((Predicate) predicate);
    }

    public final void a(Predicate<Void> predicate, String str) {
        this.a.a(new achq(this.b, null, predicate, "CameraPageNavigator addNavigationEnabledPredicate ".concat(String.valueOf(str))));
    }

    public final void b(Predicate<Void> predicate, String str) {
        String str2 = "CameraPageNavigator addVerticalNavigationEnabledPredicate ";
        this.a.a(new achq(this.b, vxc.a, predicate, str2.concat(String.valueOf(str))));
        this.a.a(new achq(this.b, ojc.a, predicate, str2.concat(String.valueOf(str))));
        if (abnl.g) {
            this.a.a(new achq(this.b, adcw.a, predicate, str2.concat(String.valueOf(str))));
        }
    }
}
