package defpackage;

import android.opengl.GLES20;
import android.view.Surface;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.adne.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adkm */
public final class adkm implements a {
    public final adnd a;
    public final AtomicBoolean b;
    public final adne c;
    public final adgs d;
    public final Surface e;
    public final adhz f;
    public final adhl g;
    public adhi h;
    public final ajwy<adhq> i;
    public long j;
    public adhg k;
    public adhp l;
    public adiv m;
    public adib n;
    public volatile boolean o;
    public volatile int p;
    public volatile int q;
    private final AtomicBoolean r;
    private final adie s;
    private final adkh t;
    private final boolean u;
    private int v;
    private int w;

    private adkm(adgs adgs, Surface surface, adhl adhl, adhi adhi, ajwy<adhq> ajwy, adkh adkh, adhz adhz, boolean z) {
        this.a = new adnd(3000000);
        this.r = new AtomicBoolean(true);
        this.b = new AtomicBoolean(true);
        this.c = new adne(this.r);
        this.s = new adie();
        this.j = 0;
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.d = (adgs) Preconditions.checkNotNull(adgs);
        this.e = (Surface) Preconditions.checkNotNull(surface);
        this.g = (adhl) Preconditions.checkNotNull(adhl);
        this.h = (adhi) Preconditions.checkNotNull(adhi);
        this.i = (ajwy) Preconditions.checkNotNull(ajwy);
        this.t = adkh;
        this.f = adhz;
        this.u = z;
    }

    public adkm(adgs adgs, Surface surface, adnj adnj, adhl adhl, adhi adhi, ajwy<adhq> ajwy, adkh adkh, boolean z) {
        adnj adnj2 = adnj;
        this(adgs, surface, adhl, adhi, (ajwy) ajwy, adkh, new adhz(adnj), z);
    }

    public final void a() {
        this.j = System.currentTimeMillis();
        while (this.b.get()) {
            this.a.a();
            if (this.r.getAndSet(false)) {
                adhu b = this.l.b();
                b.c();
                long currentTimeMillis = this.u ? (System.currentTimeMillis() - this.j) * 1000 : 0;
                this.v = b.a;
                this.w = b.b;
                this.m.a(this.n.a, currentTimeMillis, this.s, b);
                this.l.e();
                adkh adkh = this.t;
                if (adkh != null) {
                    adkh.a();
                }
                GLES20.glBindFramebuffer(36160, 0);
                if (!(this.p == -1 || this.q == -1 || (this.v == this.p && this.w == this.q))) {
                    if (!(this.w == 0 || this.v == 0)) {
                        this.s.b(((float) this.p) / ((float) this.v), ((float) this.q) / ((float) this.w));
                    }
                    this.r.set(true);
                }
            }
            if (!this.r.get() && this.b.get()) {
                this.a.b();
            }
        }
        if (this.o) {
            GLES20.glClearColor(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
            GLES20.glClear(16384);
            this.l.e();
        }
    }

    public final void b() {
        a e = null;
        this.c.a = null;
        adiv adiv = this.m;
        if (adiv != null) {
            try {
                adiv.e();
            } catch (adjz e2) {
                e = e2;
            }
        }
        adib adib = this.n;
        if (adib != null) {
            try {
                adib.c();
                adib.b();
            } catch (adjz e3) {
                if (e == null) {
                    e = e3;
                }
            }
        }
        try {
            this.f.a();
        } catch (adjz e32) {
            if (e == null) {
                e = e32;
            }
        }
        adhp adhp = this.l;
        if (adhp != null) {
            try {
                adhp.a();
            } catch (adjz e322) {
                if (e == null) {
                    e = e322;
                }
            }
        }
        adhg adhg = this.k;
        if (adhg != null) {
            try {
                adhg.b();
            } catch (adjz e3222) {
                if (e == null) {
                    e = e3222;
                }
            }
        }
        if (e != null) {
            throw e;
        }
    }

    public final void k() {
        this.a.c();
    }
}
