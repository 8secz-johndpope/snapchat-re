package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ctw */
public final class ctw implements ckx {
    private aenr a;
    private final List<afji> b = new ArrayList();

    /* JADX WARNING: Missing block: B:5:0x0009, code skipped:
            if (r0 == null) goto L_0x000b;
     */
    public final defpackage.ajdj<defpackage.aenr> a() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.a;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x000b;
    L_0x0005:
        r0 = defpackage.ajdj.b(r0);	 Catch:{ all -> 0x0018 }
        if (r0 != 0) goto L_0x0016;
    L_0x000b:
        r0 = defpackage.ajlu.a;	 Catch:{ all -> 0x0018 }
        r0 = defpackage.ajvo.a(r0);	 Catch:{ all -> 0x0018 }
        r1 = "Maybe.empty()";
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r2);
        return r0;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctw.a():ajdj");
    }

    public final void a(aenr aenr) {
        akcr.b(aenr, "geofilterResponse");
        synchronized (this) {
            this.a = aenr;
        }
    }

    public final void a(afji afji) {
        akcr.b(afji, "lensCarouselImpressionTrack");
        synchronized (this) {
            this.b.add(afji);
        }
    }

    public final void b() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final List<afji> c() {
        List k;
        synchronized (this) {
            k = ajyu.k(this.b);
        }
        return k;
    }

    public final void d() {
        synchronized (this) {
            this.b.clear();
        }
    }
}
