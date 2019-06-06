package defpackage;

import java.util.concurrent.locks.Lock;

/* renamed from: ibt */
public final class ibt extends ibv {
    private final hzx c;
    private final Lock d;
    private final Lock e;
    private final zfw f = zgb.a(hyn.a.callsite("FideliusDbKeyUnwrapOperation"));

    public ibt(ibb ibb, ajwy<ian> ajwy, hyw hyw, ajwy<hyk> ajwy2, ajwy<hys> ajwy3) {
        super(ajwy, hyw, ajwy2, ajwy3);
        this.c = ibb.c;
        this.d = ibb.d;
        this.e = ibb.e;
    }

    private /* synthetic */ void c(String str) {
        this.e.lock();
        try {
            this.c.d(str);
        } finally {
            this.e.unlock();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(byte[] bArr, String str, String str2, int i) {
        this.f.f().a(new -$$Lambda$ibt$BZtMybmMTSQ0cDsqtayjMiwM1A0(this, str, str2, i, bArr));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final byte[] a(String str) {
        this.d.lock();
        try {
            ice b = this.c.b(str);
            return b == null ? null : b.c;
        } finally {
            this.d.unlock();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(String str) {
        this.f.f().a(new -$$Lambda$ibt$fvByhHgxaXroSF-DuW06SVGoYcs(this, str));
    }
}
