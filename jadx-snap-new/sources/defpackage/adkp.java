package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: adkp */
public final class adkp {
    public final ReentrantLock a = new ReentrantLock(true);
    boolean b = false;
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private int i;
    private boolean j = false;
    private boolean k = false;
    private a l = a.PREPARING;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    /* renamed from: adkp$a */
    public enum a {
        PREPARING,
        PLAYING,
        PAUSED
    }

    private void b(int i) {
        r();
        this.i = i;
    }

    public final void a(int i) {
        try {
            this.a.lock();
            b(i);
        } finally {
            m();
        }
    }

    public final void a(a aVar) {
        r();
        this.l = (a) Preconditions.checkNotNull(aVar);
    }

    public final void a(boolean z) {
        r();
        this.b = z;
    }

    public final boolean a() {
        r();
        return this.m;
    }

    public final void b() {
        r();
        this.m = true;
    }

    public final void b(boolean z) {
        r();
        this.c = z;
    }

    public final void c(boolean z) {
        r();
        this.o = z;
    }

    public final boolean c() {
        r();
        return this.n;
    }

    public final void d() {
        r();
        this.n = true;
    }

    public final void d(boolean z) {
        r();
        this.d = z;
    }

    public final void e(boolean z) {
        r();
        this.e = z;
    }

    public final boolean e() {
        r();
        return this.g;
    }

    public final void f() {
        r();
        this.g = true;
    }

    public final void f(boolean z) {
        r();
        this.f = z;
    }

    public final void g(boolean z) {
        r();
        this.j = z;
    }

    public final boolean g() {
        r();
        return this.h;
    }

    public final void h() {
        r();
        this.h = true;
    }

    public final boolean i() {
        try {
            this.a.lock();
            boolean j = j();
            return j;
        } finally {
            m();
        }
    }

    public final boolean j() {
        r();
        return this.i != 0;
    }

    public final boolean k() {
        r();
        return this.o;
    }

    public final boolean l() {
        try {
            this.a.lock();
            boolean z = this.g;
            return z;
        } finally {
            this.a.unlock();
        }
    }

    public final void m() {
        r();
        this.a.unlock();
    }

    public final boolean n() {
        r();
        return this.j;
    }

    public final boolean o() {
        try {
            this.a.lock();
            boolean n = n();
            return n;
        } finally {
            m();
        }
    }

    public final a p() {
        r();
        return this.l;
    }

    public final a q() {
        try {
            this.a.lock();
            a p = p();
            return p;
        } finally {
            m();
        }
    }

    /* Access modifiers changed, original: final */
    public final void r() {
        if (!this.a.isHeldByCurrentThread()) {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("AudioExtractorDone", this.m).add("AudioDecoderDone", this.n).add("BufferedAudioProviderDone", this.b).add("AudioPlayerDone", this.c).add("VideoExtractorDone", this.o).add("VideoDecoderDone", this.d).add("VideoRendererDone", this.e).add("BufferedVideoProviderDone", this.f).add("Aborted", this.g).add("HasPendingAbortAfterRestart", this.h).add("IsRestarting", this.j).add("HasPendingRestart", false).add("PlayState", this.l).toString();
    }
}
