package defpackage;

import defpackage.abln.a;
import defpackage.abln.e;
import defpackage.abln.g;

/* renamed from: ablx */
public final class ablx extends abln {
    public static volatile aipn<ablx> a;
    private final ablz b;
    private float c;
    private Long d;
    private boolean e;

    public ablx(aipn<ablh> aipn, ablz ablz) {
        super(aipn);
        this.b = ablz;
    }

    public static ablx a() {
        return (ablx) a.get();
    }

    public final synchronized abll a(a aVar, e eVar, g gVar) {
        abll a;
        a = super.a(aVar, eVar, gVar);
        ablm f = f();
        if (this.d != null) {
            f.d.put(abmb.PROCESS_CREATED, this.d);
        }
        f.c.put(abma.DISPLAY_REFRESH_RATE, Long.valueOf((long) this.c));
        return a;
    }

    /* JADX WARNING: Missing block: B:7:0x0008, code skipped:
            r4 = ((android.view.WindowManager) r4.getSystemService("window")).getDefaultDisplay().getRefreshRate();
            r0 = r3.b.a();
     */
    /* JADX WARNING: Missing block: B:8:0x001e, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:11:0x0021, code skipped:
            if (r3.e == false) goto L_0x0025;
     */
    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:13:0x0024, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code skipped:
            r3.e = true;
     */
    /* JADX WARNING: Missing block: B:15:0x0028, code skipped:
            if (r0 == null) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:16:0x002a, code skipped:
            r3.d = r0;
            r0 = f();
     */
    /* JADX WARNING: Missing block: B:17:0x0030, code skipped:
            if (r0 == null) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:19:0x003a, code skipped:
            if (r0.d.containsKey(defpackage.abmb.PROCESS_CREATED) != false) goto L_0x0045;
     */
    /* JADX WARNING: Missing block: B:20:0x003c, code skipped:
            r0.d.put(defpackage.abmb.PROCESS_CREATED, r3.d);
     */
    /* JADX WARNING: Missing block: B:21:0x0045, code skipped:
            r3.c = r4;
     */
    /* JADX WARNING: Missing block: B:22:0x0047, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:23:0x0048, code skipped:
            return;
     */
    public final void a(android.content.Context r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.e;	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);	 Catch:{ all -> 0x004c }
        return;
    L_0x0007:
        monitor-exit(r3);	 Catch:{ all -> 0x004c }
        r0 = "window";
        r4 = r4.getSystemService(r0);
        r4 = (android.view.WindowManager) r4;
        r4 = r4.getDefaultDisplay();
        r4 = r4.getRefreshRate();
        r0 = r3.b;
        r0 = r0.a();
        monitor-enter(r3);
        r1 = r3.e;	 Catch:{ all -> 0x0049 }
        if (r1 == 0) goto L_0x0025;
    L_0x0023:
        monitor-exit(r3);	 Catch:{ all -> 0x0049 }
        return;
    L_0x0025:
        r1 = 1;
        r3.e = r1;	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0045;
    L_0x002a:
        r3.d = r0;	 Catch:{ all -> 0x0049 }
        r0 = r3.f();	 Catch:{ all -> 0x0049 }
        if (r0 == 0) goto L_0x0045;
    L_0x0032:
        r1 = r0.d;	 Catch:{ all -> 0x0049 }
        r2 = defpackage.abmb.PROCESS_CREATED;	 Catch:{ all -> 0x0049 }
        r1 = r1.containsKey(r2);	 Catch:{ all -> 0x0049 }
        if (r1 != 0) goto L_0x0045;
    L_0x003c:
        r0 = r0.d;	 Catch:{ all -> 0x0049 }
        r1 = defpackage.abmb.PROCESS_CREATED;	 Catch:{ all -> 0x0049 }
        r2 = r3.d;	 Catch:{ all -> 0x0049 }
        r0.put(r1, r2);	 Catch:{ all -> 0x0049 }
    L_0x0045:
        r3.c = r4;	 Catch:{ all -> 0x0049 }
        monitor-exit(r3);	 Catch:{ all -> 0x0049 }
        return;
    L_0x0049:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0049 }
        throw r4;
    L_0x004c:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x004c }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablx.a(android.content.Context):void");
    }
}
