package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: dpi */
public final class dpi {
    public static volatile aipn<dpi> a;
    private a b;

    /* renamed from: dpi$a */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Object obj = message.obj;
        }
    }

    public dpi(Looper looper) {
        this.b = new a(looper);
    }

    public static dpi a() {
        return (dpi) a.get();
    }

    private synchronized a b() {
        if (this.b == null) {
            this.b = new a(abmq.a());
        }
        return this.b;
    }

    public final void a(ecm ecm) {
        Message obtainMessage = b().obtainMessage();
        obtainMessage.obj = ecm;
        obtainMessage.sendToTarget();
    }
}
