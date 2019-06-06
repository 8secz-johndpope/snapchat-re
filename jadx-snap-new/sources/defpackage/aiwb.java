package defpackage;

import com.google.common.base.Preconditions;
import defpackage.aiwe.a;
import defpackage.aiyf.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiwb */
public abstract class aiwb extends aiwe implements aiws, c {
    static final Logger a = Logger.getLogger(aiwb.class.getName());
    public final aizf b;
    private final aixm c;
    private boolean d;
    private aivl e;
    private volatile boolean f;

    /* renamed from: aiwb$b */
    public interface b {
        void a(int i);

        void a(aivl aivl, byte[] bArr);

        void a(aivw aivw);

        void a(aizg aizg, boolean z, boolean z2, int i);
    }

    /* renamed from: aiwb$c */
    public static abstract class c extends a {
        aiwt a;
        boolean b;
        aiuu c = aiuu.a;
        protected volatile boolean d;
        boolean e;
        private final aiza j;
        private boolean k;
        private boolean l = false;
        private Runnable m;
        private aivl n;
        private aivw o;

        protected c(int i, aiza aiza, aizf aizf) {
            super(i, aiza, aizf);
            this.j = (aiza) Preconditions.checkNotNull(aiza, "statsTraceCtx");
        }

        private void a(aivw aivw, int i, aivl aivl) {
            if (!this.k) {
                this.k = true;
                this.j.a(aivw);
                this.a.a(aivw, i, aivl);
                if (this.h != null) {
                    this.h.a(aivw.b());
                }
            }
        }

        /* Access modifiers changed, original: protected|final|bridge|synthetic */
        public final /* bridge */ /* synthetic */ aizc a() {
            return this.a;
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(aivl aivl, aivw aivw) {
            Preconditions.checkNotNull(aivw, "status");
            Preconditions.checkNotNull(aivl, "trailers");
            if (this.e) {
                aiwb.a.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{aivw, aivl});
                return;
            }
            this.n = aivl;
            this.o = aivw;
            b(false);
        }

        public final void a(final aivw aivw, final int i, boolean z, final aivl aivl) {
            Preconditions.checkNotNull(aivw, "status");
            Preconditions.checkNotNull(aivl, "trailers");
            if (!this.e || z) {
                this.e = true;
                c();
                if (this.l) {
                    this.m = null;
                    a(aivw, i, aivl);
                    return;
                }
                this.m = new Runnable() {
                    public final void run() {
                        c.this.a(aivw, i, aivl);
                    }
                };
                b(z);
            }
        }

        public final void a(aivw aivw, boolean z, aivl aivl) {
            a(aivw, 1, z, aivl);
        }

        public void a(boolean z) {
            this.l = true;
            aivw aivw = this.o;
            if (aivw != null) {
                if (aivw.b() && z) {
                    this.o = aivw.i.a("Encountered end-of-stream mid-frame");
                    this.n = new aivl();
                }
                a(this.o, false, this.n);
            } else {
                Preconditions.checkState(this.e, "status should have been reported on deframer closed");
            }
            Runnable runnable = this.m;
            if (runnable != null) {
                runnable.run();
                this.m = null;
            }
        }
    }

    /* renamed from: aiwb$a */
    class a implements aixm {
        private aivl a;
        private boolean b;
        private final aiza c;
        private byte[] d;

        public a(aivl aivl, aiza aiza) {
            this.a = (aivl) Preconditions.checkNotNull(aivl, "headers");
            this.c = (aiza) Preconditions.checkNotNull(aiza, "statsTraceCtx");
        }

        public final aixm a(aium aium) {
            return this;
        }

        public final void a() {
        }

        public final void a(int i) {
        }

        public final void a(InputStream inputStream) {
            Preconditions.checkState(this.d == null, "writePayload should not be called multiple times");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                aixv.a(inputStream, byteArrayOutputStream);
                this.d = byteArrayOutputStream.toByteArray();
                this.c.a();
                aiza aiza = this.c;
                byte[] bArr = this.d;
                aiza.a(0, (long) bArr.length, (long) bArr.length);
                this.c.a((long) this.d.length);
                this.c.b((long) this.d.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public final boolean b() {
            return this.b;
        }

        public final void c() {
            boolean z = true;
            this.b = true;
            if (this.d == null) {
                z = false;
            }
            Preconditions.checkState(z, "Lack of request message. GET request is only supported for unary requests");
            aiwb.this.b().a(this.a, this.d);
            this.d = null;
            this.a = null;
        }
    }

    protected aiwb(aizh aizh, aiza aiza, aizf aizf, aivl aivl, boolean z) {
        Preconditions.checkNotNull(aivl, "headers");
        this.b = (aizf) Preconditions.checkNotNull(aizf, "transportTracer");
        this.d = z;
        if (z) {
            this.c = new a(aivl, aiza);
            return;
        }
        this.c = new aiyf(this, aizh, aiza);
        this.e = aivl;
    }

    /* renamed from: a */
    public abstract c e();

    public final void a(int i) {
        this.c.a(i);
    }

    public final void a(aius aius) {
        this.e.b(aixo.b);
        this.e.a(aixo.b, Long.valueOf(Math.max(0, aius.a(TimeUnit.NANOSECONDS))));
    }

    public final void a(aiuu aiuu) {
        c a = e();
        Preconditions.checkState(a.a == null, "Already called start");
        a.c = (aiuu) Preconditions.checkNotNull(aiuu, "decompressorRegistry");
    }

    public final void a(aivw aivw) {
        Preconditions.checkArgument(aivw.b() ^ 1, "Should not cancel with OK status");
        this.f = true;
        b().a(aivw);
    }

    public final void a(aiwt aiwt) {
        c a = e();
        Preconditions.checkState(a.a == null, "Already called setListener");
        a.a = (aiwt) Preconditions.checkNotNull(aiwt, "listener");
        if (!this.d) {
            b().a(this.e, null);
            this.e = null;
        }
    }

    public final void a(aizg aizg, boolean z, boolean z2, int i) {
        boolean z3 = aizg != null || z;
        Preconditions.checkArgument(z3, "null frame before EOS");
        b().a(aizg, z, z2, i);
    }

    public abstract b b();

    public final void b(int i) {
        e().f.a(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final aixm c() {
        return this.c;
    }

    public final void c(int i) {
        b().a(i);
    }

    public final void d() {
        if (!e().d) {
            e().d = true;
            g();
        }
    }
}
