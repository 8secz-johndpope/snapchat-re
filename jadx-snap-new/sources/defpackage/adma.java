package defpackage;

import android.util.Log;
import java.util.Map;
import java.util.UUID;

/* renamed from: adma */
public abstract class adma implements Runnable {
    private final int a;
    private final a b;
    private b c;
    private final Object d;
    private boolean e;
    private boolean f;
    protected final UUID g;
    public volatile c h;
    private boolean i;
    private boolean j;
    private Throwable k;

    /* renamed from: adma$a */
    public interface a {
    }

    /* renamed from: adma$b */
    public interface b {
        void a(int i);
    }

    /* renamed from: adma$c */
    public enum c {
        INVALID(false, false),
        INVALID_MEDIA_FORMAT(false, true),
        CONFIG_ERROR(false, true),
        RUNNING(false, false),
        ABORTED(false, false),
        FAILED(false, true),
        FINISHED(true, false),
        TIMEOUT(false, true);
        
        private final boolean mIsFailure;
        private final boolean mIsSuccess;

        private c(boolean z, boolean z2) {
            this.mIsSuccess = z;
            this.mIsFailure = z2;
        }

        public final boolean a() {
            return this.mIsSuccess;
        }
    }

    protected adma(a aVar, b bVar) {
        this(abpu.a(), 20, null, null);
    }

    protected adma(UUID uuid, int i, a aVar, b bVar) {
        this.h = c.INVALID;
        this.d = new Object();
        this.e = false;
        this.f = false;
        this.i = false;
        this.j = false;
        this.k = null;
        this.g = uuid;
        this.a = i;
        this.b = aVar;
        this.c = bVar;
    }

    private void a(c cVar, Throwable th) {
        this.k = th;
        b();
        b(cVar);
    }

    private String b() {
        Throwable th = this.k;
        if (th == null) {
            return null;
        }
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return String.format("Failed due to: %s\nStack trace: %s", new Object[]{th.toString(), Log.getStackTraceString(th)});
    }

    public abstract c a();

    public abstract void a(b bVar);

    /* Access modifiers changed, original: protected|final */
    public final void a(c cVar) {
        this.h = cVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(c cVar) {
        if (this.h != c.ABORTED) {
            this.h = cVar;
        }
        synchronized (this.d) {
            this.f = true;
            c cVar2 = this.h;
        }
    }

    /* Access modifiers changed, original: protected */
    public String e() {
        return "Task ended successfully.";
    }

    public final UUID f() {
        return this.g;
    }

    public final c g() {
        return this.h;
    }

    public final Throwable h() {
        return this.k;
    }

    public Map<String, Integer> i() {
        return null;
    }

    public void run() {
        synchronized (this.d) {
            this.e = true;
        }
        try {
            a(this.c);
            synchronized (this.d) {
                this.f = true;
                c cVar = this.h;
                e();
            }
            synchronized (this.d) {
            }
        } catch (adkd e) {
            adni.a("Task failed during setup", e);
            a(c.CONFIG_ERROR, e);
            synchronized (this.d) {
            }
        } catch (adkc e2) {
            adni.a("Task failed during transcoding", e2);
            a(c.FAILED, e2);
            synchronized (this.d) {
            }
        } catch (adjw e22) {
            adni.a("Task failed with OpenGL error", e22);
            a(c.FAILED, e22);
            synchronized (this.d) {
            }
        } catch (adju e222) {
            adni.a("Task aborted by exception", e222);
            a(c.ABORTED, e222);
            synchronized (this.d) {
            }
        } catch (adjx e2222) {
            adni.a("Task failed by invalid media format", e2222);
            a(c.INVALID_MEDIA_FORMAT, e2222);
            synchronized (this.d) {
            }
        } catch (adjz e22222) {
            adni.a("Task failed with general media engine exception", e22222);
            a(c.FAILED, e22222);
            synchronized (this.d) {
            }
        } catch (Error | RuntimeException e222222) {
            try {
                adni.a("General failure during transcoding", e222222);
                a(c.FAILED, e222222);
                synchronized (this.d) {
                }
            } catch (Throwable th) {
                synchronized (this.d) {
                }
            }
        }
    }
}
