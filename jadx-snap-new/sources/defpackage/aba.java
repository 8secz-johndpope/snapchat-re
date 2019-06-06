package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: aba */
final class aba {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: aba$a */
    static final class a implements Callback {
        a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((aax) message.obj).d();
            return true;
        }
    }

    aba() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(aax<?> aax) {
        if (this.a) {
            this.b.obtainMessage(1, aax).sendToTarget();
            return;
        }
        this.a = true;
        aax.d();
        this.a = false;
    }
}
