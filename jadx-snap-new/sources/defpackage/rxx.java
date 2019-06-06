package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import defpackage.akpm.b;
import defpackage.rzu.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rxx */
public final class rxx extends b {
    final AtomicReference<ByteBuffer> a;
    final ByteBuffer b;
    private final saj c;
    private final sab d;
    private final scd e;
    private final Executor f;
    private final AtomicBoolean g;
    private final AtomicBoolean h;
    private volatile long i = 0;
    private volatile long j = 0;
    private volatile long k = 0;
    private final rxw l;
    private final UUID m;
    private final rzu.b n;
    private final a o;
    private final boolean p;
    private final int q;
    private final ihh r;

    /* renamed from: rxx$a */
    class a extends IOException {
        a() {
            super("Canceled");
        }
    }

    rxx(ihh ihh, int i, saj saj, sab sab, sca sca, Executor executor, rxw rxw, rzu.b bVar, boolean z) {
        this.r = ihh;
        this.b = ByteBuffer.allocateDirect(16384);
        this.c = (saj) Preconditions.checkNotNull(saj);
        this.d = (sab) Preconditions.checkNotNull(sab);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.f = (Executor) Preconditions.checkNotNull(executor);
        this.l = rxw;
        this.o = sab.a().e();
        this.n = bVar;
        this.m = sab.a().a();
        this.e = new scd(ihh, i, sca);
        this.a = new AtomicReference();
        this.p = z;
        this.q = 512000;
    }

    private ByteBuffer a(akpn akpn) {
        ByteBuffer byteBuffer = (ByteBuffer) this.a.get();
        if (this.a.compareAndSet(byteBuffer, null) && byteBuffer != null) {
            byteBuffer.flip();
            this.j += (long) byteBuffer.remaining();
            long e = akpn.e() - this.i;
            this.i += e;
            this.o.a(this.m, e, this.i, this.k, this.j);
        }
        return byteBuffer;
    }

    private static san a(Throwable th) {
        if (th instanceof a) {
            return new san(sam.CANCELLED);
        }
        if (!(th instanceof akpc)) {
            return null;
        }
        int a = ((akpc) th).a();
        return a != 1 ? (a == 4 || a == 6) ? new san(sam.TIMEOUT, a) : new san(sam.CONNECTION_ERROR, a) : new san(sam.DNS_ERROR, a);
    }

    private saq<sai> a(akpn akpn, Throwable th) {
        if (th != null) {
            this.e.close();
            return sbj.a(th, 1, rxx.a(th));
        } else if (akpn == null) {
            this.e.close();
            return sbj.a(new IllegalStateException("Unexpected UrlResponseInfo"), 1, null);
        } else {
            saq.a a = new saq.a().a(sbc.a(akpn.c(), Predicates.alwaysTrue()));
            a.a = akpn.a();
            a.c = akpn.b();
            String d = akpn.d();
            if (d == null || d.isEmpty() || "unknown".equals(d)) {
                d = "http/1.1";
            }
            a.h = d;
            a.g = 1;
            a.f = b(akpn);
            return a.a();
        }
    }

    public static void a(akpm akpm) {
        if (!akpm.d()) {
            akpm.c();
        }
    }

    private void a(akpm akpm, akpn akpn, Throwable th, boolean z) {
        if (this.h.compareAndSet(false, true)) {
            th = rxx.b(th);
            this.e.a(a(akpn), th);
            rxx.a(akpm);
            if (z) {
                this.f.execute(new -$$Lambda$rxx$z0kkkOOI9XOAsIGoGkVq8B8uScw(this, akpn, th));
            }
        }
    }

    private void a(akpn akpn, Throwable th, Executor executor) {
        if (this.g.compareAndSet(false, true)) {
            if (executor != null) {
                executor.execute(new -$$Lambda$rxx$s3XlSd0PMJVOKWklfV1wwqar1II(this, akpn, th));
                return;
            }
            this.d.a(a(akpn, th));
        }
    }

    private boolean a(akov akov) {
        try {
            if (!this.g.get() && this.l.a(akov)) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static Throwable b(Throwable th) {
        return th instanceof akpc ? rxt.a((akpc) th) : th;
    }

    private sai b(akpn akpn) {
        Map c = akpn.c();
        List<String> a = sbc.a(c, "Content-Encoding");
        if (a != null) {
            for (String str : a) {
                if (!"gzip".equalsIgnoreCase(str)) {
                    if (Tags.BR.equalsIgnoreCase(str)) {
                    }
                }
                return sbg.a(sbc.a(c), -1, sbc.b(c), this.e);
            }
        }
        return sbg.a(sbc.a(c), sbc.b(c), this.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A:{Catch:{ Throwable -> 0x0044 }} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A:{Catch:{ Throwable -> 0x0044 }} */
    public final void a(final defpackage.akpm r8, final defpackage.akpn r9) {
        /*
        r7 = this;
        r0 = 1;
        r1 = r9.c();	 Catch:{ Throwable -> 0x0044 }
        r1 = defpackage.sbc.b(r1);	 Catch:{ Throwable -> 0x0044 }
        r7.k = r1;	 Catch:{ Throwable -> 0x0044 }
        r1 = r7.k;	 Catch:{ Throwable -> 0x0044 }
        r3 = r7.p;	 Catch:{ Throwable -> 0x0044 }
        r4 = 0;
        if (r3 == 0) goto L_0x0022;
    L_0x0012:
        r5 = 0;
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r3 < 0) goto L_0x0020;
    L_0x0018:
        r5 = 512000; // 0x7d000 float:7.17465E-40 double:2.529616E-318;
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r3 >= 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0022;
    L_0x0020:
        r1 = 0;
        goto L_0x0023;
    L_0x0022:
        r1 = 1;
    L_0x0023:
        r2 = r7.e;	 Catch:{ Throwable -> 0x0044 }
        r3 = new rxx$1;	 Catch:{ Throwable -> 0x0044 }
        r3.<init>(r9, r8);	 Catch:{ Throwable -> 0x0044 }
        r2.a(r3, r1);	 Catch:{ Throwable -> 0x0044 }
        r2 = r7.o;	 Catch:{ Throwable -> 0x0044 }
        r3 = r7.m;	 Catch:{ Throwable -> 0x0044 }
        r5 = r7.k;	 Catch:{ Throwable -> 0x0044 }
        if (r1 != 0) goto L_0x0036;
    L_0x0035:
        r4 = 1;
    L_0x0036:
        r2.a(r3, r5, r4);	 Catch:{ Throwable -> 0x0044 }
        if (r1 != 0) goto L_0x0041;
    L_0x003b:
        r1 = 0;
        r2 = r7.f;	 Catch:{ Throwable -> 0x0044 }
        r7.a(r9, r1, r2);	 Catch:{ Throwable -> 0x0044 }
    L_0x0041:
        return;
    L_0x0042:
        r8 = move-exception;
        goto L_0x0049;
    L_0x0044:
        r1 = move-exception;
        r7.a(r8, r9, r1, r0);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0049:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxx.a(akpm, akpn):void");
    }

    public final void a(akpm akpm, akpn akpn, akov akov) {
        a(akpm, akpn, (Throwable) akov, !a(akov));
    }

    public final void a(akpm akpm, akpn akpn, String str) {
        try {
            if (this.c.canRedirect(this.d.a().b(), str)) {
                this.d.a().g().c(new ifl(this.r));
                this.d.a().g().a(str);
                akpm.b();
                return;
            }
            String str2 = "url redirect is not allowed from %s to %s";
            Object[] objArr = new Object[2];
            String str3 = "%s bytes:%d/%d/%d@%s %s";
            Object[] objArr2 = new Object[6];
            objArr2[0] = Thread.currentThread().getName();
            objArr2[1] = Long.valueOf(this.j);
            objArr2[2] = Long.valueOf(this.i);
            objArr2[3] = Long.valueOf(akpn == null ? -1 : sbc.b(akpn.c()));
            objArr2[4] = sbi.a(this.d.a().b());
            objArr2[5] = this.m;
            objArr[0] = String.format(str3, objArr2);
            objArr[1] = str;
            throw new IOException(String.format(str2, objArr));
        } catch (Throwable th) {
            a(akpm, akpn, th, true);
        }
    }

    public final void a(akpm akpm, akpn akpn, ByteBuffer byteBuffer) {
        try {
            Object obj = null;
            Preconditions.checkState(byteBuffer == this.b);
            ByteBuffer byteBuffer2 = (ByteBuffer) Preconditions.checkNotNull(this.a.get());
            byteBuffer.flip();
            byteBuffer2.put(byteBuffer);
            Preconditions.checkState(!byteBuffer.hasRemaining());
            byteBuffer.clear();
            if (byteBuffer2.capacity() - byteBuffer2.position() > 16384) {
                obj = 1;
            }
            if (obj != null) {
                akpm.a(byteBuffer);
            } else {
                this.e.a((ByteBuffer) Preconditions.checkNotNull(a(akpn)));
            }
        } catch (Throwable th) {
            a(akpm, akpn, th, true);
        }
    }

    public final void b(akpm akpm, akpn akpn) {
        a(akpm, akpn, null, true);
    }

    public final void c(akpm akpm, akpn akpn) {
        a(akpm, akpn, new a(), true);
    }
}
