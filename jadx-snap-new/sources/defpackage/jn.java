package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: jn */
public final class jn {
    LayoutInflater a;
    Handler b;
    c c;
    private Callback d = new 1();

    /* renamed from: jn$a */
    static class a extends LayoutInflater {
        private static final String[] a = new String[]{"android.widget.", "android.webkit.", "android.app."};

        a(Context context) {
            super(context);
        }

        public final LayoutInflater cloneInContext(Context context) {
            return new a(context);
        }

        /* Access modifiers changed, original: protected|final */
        public final View onCreateView(String str, AttributeSet attributeSet) {
            String[] strArr = a;
            int i = 0;
            while (i < 3) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: jn$c */
    static class c extends Thread {
        static final c a;
        ArrayBlockingQueue<b> b = new ArrayBlockingQueue(10);
        defpackage.jf.c<b> c = new defpackage.jf.c(10);

        static {
            c cVar = new c();
            a = cVar;
            cVar.start();
        }

        private c() {
        }

        public final void run() {
            String str = "AsyncLayoutInflater";
            while (true) {
                try {
                    b bVar = (b) this.b.take();
                    try {
                        bVar.d = bVar.a.a.inflate(bVar.c, bVar.b, false);
                    } catch (RuntimeException e) {
                        Log.w(str, "Failed to inflate resource in the background! Retrying on the UI thread", e);
                    }
                    Message.obtain(bVar.a.b, 0, bVar).sendToTarget();
                } catch (InterruptedException e2) {
                    Log.w(str, e2);
                }
            }
        }
    }

    /* renamed from: jn$d */
    public interface d {
        void a(View view, ViewGroup viewGroup);
    }

    /* renamed from: jn$1 */
    class 1 implements Callback {
        1() {
        }

        public final boolean handleMessage(Message message) {
            b bVar = (b) message.obj;
            if (bVar.d == null) {
                bVar.d = jn.this.a.inflate(bVar.c, bVar.b, false);
            }
            bVar.e.a(bVar.d, bVar.b);
            c cVar = jn.this.c;
            bVar.e = null;
            bVar.a = null;
            bVar.b = null;
            bVar.c = 0;
            bVar.d = null;
            cVar.c.a(bVar);
            return true;
        }
    }

    /* renamed from: jn$b */
    static class b {
        jn a;
        ViewGroup b;
        int c;
        View d;
        d e;

        b() {
        }
    }

    public jn(Context context) {
        this.a = new a(context);
        this.b = new Handler(this.d);
        this.c = c.a;
    }

    public final void a(int i, ViewGroup viewGroup, d dVar) {
        b bVar = (b) this.c.c.a();
        if (bVar == null) {
            bVar = new b();
        }
        bVar.a = this;
        bVar.c = i;
        bVar.b = viewGroup;
        bVar.e = dVar;
        try {
            this.c.b.put(bVar);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}
