package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.google.common.base.Preconditions;
import defpackage.aiwg.b;
import java.io.InputStream;

/* renamed from: aiwe */
public abstract class aiwe implements aizb {

    /* renamed from: aiwe$a */
    public static abstract class a implements b, defpackage.aiye.a {
        private final aiza a;
        private boolean b;
        private boolean c;
        public aixa f;
        final Object g = new Object();
        protected final aizf h;
        int i;

        protected a(int i, aiza aiza, aizf aizf) {
            this.a = (aiza) Preconditions.checkNotNull(aiza, "statsTraceCtx");
            this.h = (aizf) Preconditions.checkNotNull(aizf, "transportTracer");
            this.f = new aiye(this, aiul.b.a, i, aiza, aizf);
        }

        private boolean d() {
            boolean z;
            synchronized (this.g) {
                z = this.b && this.i < 32768 && !this.c;
            }
            return z;
        }

        private void e() {
            boolean d;
            synchronized (this.g) {
                d = d();
            }
            if (d) {
                a().a();
            }
        }

        public abstract aizc a();

        public final void a(int i) {
            Object obj;
            synchronized (this.g) {
                Preconditions.checkState(this.b, "onStreamAllocated was not called, but it seems the stream is active");
                obj = 1;
                Object obj2 = this.i < 32768 ? 1 : null;
                this.i -= i;
                Object obj3 = this.i < 32768 ? 1 : null;
                if (obj2 != null || obj3 == null) {
                    obj = null;
                }
            }
            if (obj != null) {
                e();
            }
        }

        public final void a(defpackage.aizc.a aVar) {
            a().a(aVar);
        }

        /* Access modifiers changed, original: protected */
        public void b() {
            boolean z = false;
            Preconditions.checkState(a() != null);
            synchronized (this.g) {
                if (!this.b) {
                    z = true;
                }
                Preconditions.checkState(z, "Already allocated");
                this.b = true;
            }
            e();
        }

        /* Access modifiers changed, original: protected|final */
        public final void b(boolean z) {
            if (z) {
                this.f.close();
            } else {
                this.f.a();
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void c() {
            synchronized (this.g) {
                this.c = true;
            }
        }
    }

    public final void a(aium aium) {
        c().a((aium) Preconditions.checkNotNull(aium, "compressor"));
    }

    public final void a(InputStream inputStream) {
        Preconditions.checkNotNull(inputStream, ErrorFields.MESSAGE);
        try {
            if (!c().b()) {
                c().a(inputStream);
            }
            aixo.a(inputStream);
        } catch (Throwable th) {
            aixo.a(inputStream);
        }
    }

    public abstract aixm c();

    public final void d(int i) {
        a e = e();
        synchronized (e.g) {
            e.i += i;
        }
    }

    public abstract a e();

    public final void f() {
        if (!c().b()) {
            c().a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void g() {
        c().c();
    }
}
