package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: ajo */
final class ajo {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: ajo$a */
    static class a implements Callback {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((ajn) message.obj).c();
            return true;
        }
    }

    ajo() {
    }

    public final void a(ajn<?> ajn) {
        aps.a();
        if (this.a) {
            this.b.obtainMessage(1, ajn).sendToTarget();
            return;
        }
        this.a = true;
        ajn.c();
        this.a = false;
    }
}
