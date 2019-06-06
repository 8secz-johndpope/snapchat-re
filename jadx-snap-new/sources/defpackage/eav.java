package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: eav */
public final class eav extends abms {

    /* renamed from: eav$a */
    public interface a {
        void execute();
    }

    /* renamed from: eav$b */
    public enum b {
        ;

        static {
            a = new int[]{1, 2, 3, 4, 5};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public eav(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        int[] a = b.a();
        if (message.what < 0 || message.what >= a.length || !(message.obj instanceof a)) {
            super.handleMessage(message);
        } else {
            ((a) message.obj).execute();
        }
    }
}
