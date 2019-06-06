package defpackage;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

/* renamed from: ajar */
public abstract class ajar<S extends ajar<S>> {
    protected final aiug a;
    protected final aiuf b;

    protected ajar(aiug aiug) {
        this(aiug, aiuf.a);
    }

    protected ajar(aiug aiug, aiuf aiuf) {
        this.a = (aiug) Preconditions.checkNotNull(aiug, "channel");
        this.b = (aiuf) Preconditions.checkNotNull(aiuf, "callOptions");
    }

    public final S a() {
        return a(this.a, this.b.a());
    }

    public abstract S a(aiug aiug, aiuf aiuf);

    public final S a(TimeUnit timeUnit) {
        return a(this.a, this.b.a(aius.a(1000, timeUnit)));
    }

    public final S a(aiui... aiuiArr) {
        return a(aiuj.a(this.a, aiuiArr), this.b);
    }
}
