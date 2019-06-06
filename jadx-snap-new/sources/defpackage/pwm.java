package defpackage;

import java.util.concurrent.Callable;

/* renamed from: pwm */
final class pwm implements Callable {
    private final /* synthetic */ akbk a;

    pwm(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}
