package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.bzo.1;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bxr */
public final class bxr implements bxs {
    final ExecutorService a;
    b<? extends c> b;
    IOException c;

    /* renamed from: bxr$a */
    public interface a<T extends c> {
        int a(T t, long j, long j2, IOException iOException);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    /* renamed from: bxr$d */
    public interface d {
        void f();
    }

    /* renamed from: bxr$c */
    public interface c {
        void a();

        void b();
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: bxr$b */
    final class b<T extends c> extends Handler implements Runnable {
        private int a;
        private final T b;
        private final long c;
        private a<T> d;
        private IOException e;
        private int f;
        private volatile Thread g;
        private volatile boolean h;
        private volatile boolean i;

        public b(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.b = t;
            this.d = aVar;
            this.a = i;
            this.c = j;
        }

        private void a() {
            this.e = null;
            bxr.this.a.execute(bxr.this.b);
        }

        private void b() {
            bxr.this.b = null;
        }

        public final void a(long j) {
            byo.b(bxr.this.b == null);
            bxr.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                a();
            }
        }

        public final void a(boolean z) {
            this.i = z;
            this.e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.h = true;
                this.b.a();
                if (this.g != null) {
                    this.g.interrupt();
                }
            }
            if (z) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.d.a(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public final void handleMessage(Message message) {
            if (!this.i) {
                if (message.what == 0) {
                    a();
                } else if (message.what != 4) {
                    b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.c;
                    if (this.h) {
                        this.d.a(this.b, elapsedRealtime, j, false);
                        return;
                    }
                    int i = message.what;
                    if (i == 1) {
                        this.d.a(this.b, elapsedRealtime, j, false);
                    } else if (i != 2) {
                        if (i == 3) {
                            this.e = (IOException) message.obj;
                            int a = this.d.a(this.b, elapsedRealtime, j, this.e);
                            if (a == 3) {
                                bxr.this.c = this.e;
                            } else if (a != 2) {
                                this.f = a == 1 ? 1 : this.f + 1;
                                a((long) Math.min((this.f - 1) * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL, 5000));
                            }
                        }
                    } else {
                        try {
                            this.d.a(this.b, elapsedRealtime, j);
                        } catch (RuntimeException e) {
                            Log.e("LoadTask", "Unexpected exception handling load completed", e);
                            bxr.this.c = new f(e);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public final void run() {
            String str = "LoadTask";
            try {
                this.g = Thread.currentThread();
                if (!this.h) {
                    StringBuilder stringBuilder = new StringBuilder("load:");
                    stringBuilder.append(this.b.getClass().getSimpleName());
                    bzm.a(stringBuilder.toString());
                    this.b.b();
                    bzm.a();
                }
                if (!this.i) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.i) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                byo.b(this.h);
                if (!this.i) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.e(str, "Unexpected exception loading stream", e2);
                if (!this.i) {
                    obtainMessage(3, new f(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.e(str, "OutOfMemory error loading stream", e3);
                if (!this.i) {
                    obtainMessage(3, new f(e3)).sendToTarget();
                }
            } catch (Error e4) {
                Log.e(str, "Unexpected error loading stream", e4);
                if (!this.i) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                bzm.a();
            }
        }
    }

    /* renamed from: bxr$e */
    static final class e implements Runnable {
        private final d a;

        public e(d dVar) {
            this.a = dVar;
        }

        public final void run() {
            this.a.f();
        }
    }

    /* renamed from: bxr$f */
    public static final class f extends IOException {
        public f(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder("Unexpected ");
            stringBuilder.append(th.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append(th.getMessage());
            super(stringBuilder.toString(), th);
        }
    }

    public bxr(String str) {
        this.a = Executors.newSingleThreadExecutor(new 1(str));
    }

    public final <T extends c> long a(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        byo.b(myLooper != null);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t, aVar, i, elapsedRealtime).a(0);
        return elapsedRealtime;
    }

    public final void a(d dVar) {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.a.execute(new e(dVar));
        }
        this.a.shutdown();
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void b() {
        this.b.a(false);
    }
}
