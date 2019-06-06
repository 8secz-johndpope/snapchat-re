package defpackage;

import android.os.Trace;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: ibu */
public final class ibu extends ibx {
    private final hzx c;
    private final Lock d;
    private final Lock e;
    private final zfw f = zgb.a(hyn.a.callsite("FideliusDbKeyWrapOperation"));

    public ibu(ibb ibb, ajwy<ian> ajwy, ajwy<hyk> ajwy2, ajwy<hys> ajwy3) {
        super(ajwy, ajwy2, ajwy3);
        this.c = ibb.c;
        this.d = ibb.d;
        this.e = ibb.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final List<ice> a(String str) {
        zgp.a("getFideliusInfoForRecipient");
        this.d.lock();
        try {
            List<ice> a = iac.a(this.c.c(str));
            return a;
        } finally {
            this.d.unlock();
            Trace.endSection();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final List<ice> a(List<String> list) {
        zgp.a("getFideliusInfoForRecipients");
        this.d.lock();
        try {
            List<ice> a = iac.a(this.c.a((List) list));
            return a;
        } finally {
            this.d.unlock();
            Trace.endSection();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, List<ahqd> list, boolean z) {
        this.e.lock();
        if (z) {
            try {
                this.c.e(str);
            } catch (Throwable th) {
                this.e.unlock();
            }
        }
        new ica(this.c, str, a(str), list, this.a, true).a();
        this.e.unlock();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(byte[] bArr, String str, String str2, int i) {
        this.f.f().a(new -$$Lambda$ibu$7pS67XRsqbgL1nSxFl0ngFV3d4o(this, str, str2, i, bArr));
    }
}
