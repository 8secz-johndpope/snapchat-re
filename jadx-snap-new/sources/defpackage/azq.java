package defpackage;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: azq */
abstract class azq {

    @TargetApi(16)
    /* renamed from: azq$a */
    static class a extends azw {
        final Choreographer a;
        final FrameCallback b = new 1();
        boolean c;
        long d;

        /* renamed from: azq$a$1 */
        class 1 implements FrameCallback {
            1() {
            }

            public final void doFrame(long j) {
                if (a.this.c && a.this.e != null) {
                    j = SystemClock.uptimeMillis();
                    a.this.e.a((double) (j - a.this.d));
                    a aVar = a.this;
                    aVar.d = j;
                    aVar.a.postFrameCallback(a.this.b);
                }
            }
        }

        public a(Choreographer choreographer) {
            this.a = choreographer;
        }

        public final void a() {
            if (!this.c) {
                this.c = true;
                this.d = SystemClock.uptimeMillis();
                this.a.removeFrameCallback(this.b);
                this.a.postFrameCallback(this.b);
            }
        }

        public final void b() {
            this.c = false;
            this.a.removeFrameCallback(this.b);
        }
    }

    /* renamed from: azq$b */
    static class b extends azw {
        final Handler a;
        final Runnable b = new 1();
        boolean c;
        long d;

        /* renamed from: azq$b$1 */
        class 1 implements Runnable {
            1() {
            }

            public final void run() {
                if (b.this.c && b.this.e != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    b.this.e.a((double) (uptimeMillis - b.this.d));
                    b bVar = b.this;
                    bVar.d = uptimeMillis;
                    bVar.a.post(b.this.b);
                }
            }
        }

        public b(Handler handler) {
            this.a = handler;
        }

        public final void a() {
            if (!this.c) {
                this.c = true;
                this.d = SystemClock.uptimeMillis();
                this.a.removeCallbacks(this.b);
                this.a.post(this.b);
            }
        }

        public final void b() {
            this.c = false;
            this.a.removeCallbacks(this.b);
        }
    }
}
