package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import defpackage.blq.a;
import defpackage.bly.b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bld */
public final class bld implements blb {
    final CopyOnWriteArraySet<a> a;
    int b;
    boolean c;
    boolean d;
    blp e;
    bla f;
    blo g;
    int h;
    int i;
    long j;
    private final bls[] k;
    private final bwv l;
    private final bww m;
    private final Handler n;
    private final ble o;
    private final Handler p;
    private final b q;
    private final bly.a r;
    private final ArrayDeque<a> s;
    private boolean t;
    private int u;
    private boolean v;

    /* renamed from: bld$a */
    static final class a {
        private final blo a;
        private final Set<defpackage.blq.a> b;
        private final bwv c;
        private final boolean d;
        private final int e;
        private final int f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final boolean k;
        private final boolean l;

        public a(blo blo, blo blo2, Set<defpackage.blq.a> set, bwv bwv, boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
            this.a = blo;
            this.b = set;
            this.c = bwv;
            this.d = z;
            this.e = i;
            this.f = i2;
            this.g = z2;
            this.h = z3;
            boolean z5 = false;
            z = z4 || blo2.f != blo.f;
            this.i = z;
            z = (blo2.a == blo.a && blo2.b == blo.b) ? false : true;
            this.j = z;
            this.k = blo2.g != blo.g;
            if (blo2.i != blo.i) {
                z5 = true;
            }
            this.l = z5;
        }

        public final void a() {
            if (this.j || this.f == 0) {
                for (defpackage.blq.a onTimelineChanged : this.b) {
                    onTimelineChanged.onTimelineChanged(this.a.a, this.a.b, this.f);
                }
            }
            if (this.d) {
                for (defpackage.blq.a onTimelineChanged2 : this.b) {
                    onTimelineChanged2.onPositionDiscontinuity(this.e);
                }
            }
            if (this.l) {
                this.c.a(this.a.i.d);
                for (defpackage.blq.a onTimelineChanged22 : this.b) {
                    onTimelineChanged22.onTracksChanged(this.a.h, this.a.i.c);
                }
            }
            if (this.k) {
                for (defpackage.blq.a onTimelineChanged222 : this.b) {
                    onTimelineChanged222.onLoadingChanged(this.a.g);
                }
            }
            if (this.i) {
                for (defpackage.blq.a onTimelineChanged2222 : this.b) {
                    onTimelineChanged2222.onPlayerStateChanged(this.h, this.a.f);
                }
            }
            if (this.g) {
                for (defpackage.blq.a onTimelineChanged22222 : this.b) {
                    onTimelineChanged22222.onSeekProcessed();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public bld(bls[] blsArr, bwv bwv, blj blj, byq byq) {
        StringBuilder stringBuilder = new StringBuilder("Init ");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" [ExoPlayerLib/2.8.4] [");
        stringBuilder.append(bzo.e);
        stringBuilder.append("]");
        Log.i("ExoPlayerImpl", stringBuilder.toString());
        byo.b(blsArr.length > 0);
        this.k = (bls[]) byo.a((Object) blsArr);
        this.l = (bwv) byo.a((Object) bwv);
        this.t = false;
        this.u = 0;
        this.v = false;
        this.a = new CopyOnWriteArraySet();
        this.m = new bww(new blu[blsArr.length], new bwt[blsArr.length], null);
        this.q = new b();
        this.r = new bly.a();
        this.e = blp.a;
        this.n = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                bld bld = bld.this;
                int i = message.what;
                boolean z = true;
                Iterator it;
                if (i == 0) {
                    blo blo = (blo) message.obj;
                    i = message.arg1;
                    if (message.arg2 == -1) {
                        z = false;
                    }
                    int i2 = message.arg2;
                    bld.b -= i;
                    if (bld.b == 0) {
                        blo a = blo.d == -9223372036854775807L ? blo.a(blo.c, 0, blo.e) : blo;
                        if ((!bld.g.a.a() || bld.c) && a.a.a()) {
                            bld.i = 0;
                            bld.h = 0;
                            bld.j = 0;
                        }
                        int i3 = bld.c ? 0 : 2;
                        boolean z2 = bld.d;
                        bld.c = false;
                        bld.d = false;
                        bld.a(a, z, i2, i3, z2, false);
                    }
                } else if (i == 1) {
                    blp blp = (blp) message.obj;
                    if (!bld.e.equals(blp)) {
                        bld.e = blp;
                        it = bld.a.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).onPlaybackParametersChanged(blp);
                        }
                    }
                } else if (i == 2) {
                    bla bla = (bla) message.obj;
                    bld.f = bla;
                    it = bld.a.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).onPlayerError(bla);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        };
        this.g = new blo(bly.a, 0, bss.a, this.m);
        this.s = new ArrayDeque();
        this.o = new ble(blsArr, bwv, this.m, blj, this.t, this.u, this.n, this, byq);
        this.p = new Handler(this.o.b.getLooper());
    }

    private blo a(boolean z, boolean z2, int i) {
        long j;
        if (z) {
            this.h = 0;
            this.i = 0;
            j = 0;
        } else {
            this.h = f();
            this.i = p();
            j = h();
        }
        this.j = j;
        return new blo(z2 ? bly.a : this.g.a, z2 ? null : this.g.b, this.g.c, this.g.d, this.g.e, i, false, z2 ? bss.a : this.g.h, z2 ? this.m : this.g.i);
    }

    private long b(long j) {
        j = bkw.a(j);
        if (this.g.c.a()) {
            return j;
        }
        this.g.a.a(this.g.c.a, this.r, false);
        return j + bkw.a(this.r.d);
    }

    private int p() {
        return r() ? this.i : this.g.c.a;
    }

    private boolean q() {
        return !r() && this.g.c.a();
    }

    private boolean r() {
        return this.g.a.a() || this.b > 0;
    }

    public final int a() {
        return this.g.f;
    }

    public final blr a(blr.b bVar) {
        return new blr(this.o, bVar, this.g.a, f(), this.p);
    }

    public final void a(int i) {
        if (this.u != i) {
            this.u = i;
            this.o.a.a(12, i).sendToTarget();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onRepeatModeChanged(i);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x00b2 in {5, 9, 14, 15, 16, 19, 20, 21, 25, 26, 28} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(long r12) {
        /*
        r11 = this;
        r6 = r11.f();
        r0 = r11.g;
        r7 = r0.a;
        if (r6 < 0) goto L_0x00ac;
        r0 = r7.a();
        if (r0 != 0) goto L_0x0016;
        r0 = r7.b();
        if (r6 >= r0) goto L_0x00ac;
        r8 = 1;
        r11.d = r8;
        r0 = r11.b;
        r0 = r0 + r8;
        r11.b = r0;
        r0 = r11.q();
        r1 = 0;
        if (r0 == 0) goto L_0x0039;
        r12 = "ExoPlayerImpl";
        r13 = "seekTo ignored because an ad is playing";
        android.util.Log.w(r12, r13);
        r12 = r11.n;
        r13 = -1;
        r0 = r11.g;
        r12 = r12.obtainMessage(r1, r8, r13, r0);
        r12.sendToTarget();
        return;
        r11.h = r6;
        r0 = r7.a();
        r2 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r0 == 0) goto L_0x0053;
        r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x004d;
        r2 = 0;
        goto L_0x004e;
        r2 = r12;
        r11.j = r2;
        r11.i = r1;
        goto L_0x0080;
        r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0060;
        r0 = r11.q;
        r0 = r7.a(r6, r0);
        r0 = r0.d;
        goto L_0x0064;
        r0 = defpackage.bkw.b(r12);
        r9 = r0;
        r1 = r11.q;
        r2 = r11.r;
        r0 = r7;
        r3 = r6;
        r4 = r9;
        r0 = r0.a(r1, r2, r3, r4);
        r1 = defpackage.bkw.a(r9);
        r11.j = r1;
        r0 = r0.first;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r11.i = r0;
        r0 = r11.o;
        r12 = defpackage.bkw.b(r12);
        r0 = r0.a;
        r1 = 3;
        r2 = new ble$d;
        r2.<init>(r7, r6, r12);
        r12 = r0.a(r1, r2);
        r12.sendToTarget();
        r12 = r11.a;
        r12 = r12.iterator();
        r13 = r12.hasNext();
        if (r13 == 0) goto L_0x00ab;
        r13 = r12.next();
        r13 = (defpackage.blq.a) r13;
        r13.onPositionDiscontinuity(r8);
        goto L_0x009b;
        return;
        r0 = new bli;
        r0.<init>(r7, r6, r12);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bld.a(long):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(blo blo, boolean z, int i, int i2, boolean z2, boolean z3) {
        int isEmpty = this.s.isEmpty() ^ 1;
        this.s.addLast(new a(blo, this.g, this.a, this.l, z, i, i2, z2, this.t, z3));
        this.g = blo;
        if (isEmpty == 0) {
            while (!this.s.isEmpty()) {
                ((a) this.s.peekFirst()).a();
                this.s.removeFirst();
            }
        }
    }

    public final void a(blp blp) {
        Object blp2;
        if (blp2 == null) {
            blp2 = blp.a;
        }
        this.o.a.a(4, blp2).sendToTarget();
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public final void a(bsj bsj) {
        a(bsj, true, true);
    }

    public final void a(bsj bsj, boolean z, boolean z2) {
        this.f = null;
        blo a = a(z, z2, 2);
        this.c = true;
        this.b++;
        this.o.a(bsj, z, z2);
        a(a, false, 4, 1, false, false);
    }

    public final void a(boolean z) {
        if (this.t != z) {
            this.t = z;
            this.o.a.a(1, (int) z).sendToTarget();
            a(this.g, false, 4, 1, false, true);
        }
    }

    public final void b(a aVar) {
        this.a.remove(aVar);
    }

    public final void b(boolean z) {
        if (z) {
            this.f = null;
        }
        blo a = a(z, z, 1);
        this.b++;
        this.o.a(z);
        a(a, false, 4, 1, false, false);
    }

    public final boolean b() {
        return this.t;
    }

    public final int c() {
        return this.u;
    }

    public final void d() {
        b(false);
    }

    public final void e() {
        StringBuilder stringBuilder = new StringBuilder("Release ");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" [ExoPlayerLib/2.8.4] [");
        stringBuilder.append(bzo.e);
        stringBuilder.append("] [");
        stringBuilder.append(blf.a());
        stringBuilder.append("]");
        Log.i("ExoPlayerImpl", stringBuilder.toString());
        this.o.a();
        this.n.removeCallbacksAndMessages(null);
    }

    public final int f() {
        return r() ? this.h : this.g.a.a(this.g.c.a, this.r, false).b;
    }

    public final long g() {
        bly bly = this.g.a;
        if (bly.a()) {
            return -9223372036854775807L;
        }
        if (!q()) {
            return bkw.a(bly.a(f(), this.q).e);
        }
        bly.a(this.g.c.a, this.r, false);
        return bkw.a(-9223372036854775807L);
    }

    public final long h() {
        return r() ? this.j : b(this.g.j);
    }

    public final long i() {
        return r() ? this.j : b(this.g.k);
    }

    public final int j() {
        long i = i();
        long g = g();
        return (i == -9223372036854775807L || g == -9223372036854775807L) ? 0 : g == 0 ? 100 : bzo.a((int) ((i * 100) / g), 0, 100);
    }

    public final int k() {
        return q() ? this.g.c.b : -1;
    }

    public final int l() {
        return q() ? this.g.c.c : -1;
    }

    public final long m() {
        if (!q()) {
            return h();
        }
        this.g.a.a(this.g.c.a, this.r, false);
        return bkw.a(this.r.d) + bkw.a(this.g.e);
    }

    public final int n() {
        return this.k.length;
    }

    public final bly o() {
        return this.g.a;
    }
}
