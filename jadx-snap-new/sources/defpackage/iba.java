package defpackage;

/* renamed from: iba */
public final class iba {
    private final whp a;
    private final ajwy<hyk> b;
    private wip c = null;

    public iba(whp whp, ajwy<hyk> ajwy) {
        this.a = whp;
        this.b = ajwy;
    }

    /* JADX WARNING: Missing block: B:18:0x0046, code skipped:
            return;
     */
    private synchronized void d() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r4);
        return;
    L_0x0007:
        r0 = r4.a;	 Catch:{ all -> 0x0047 }
        r0 = r0.a();	 Catch:{ all -> 0x0047 }
        r4.c = r0;	 Catch:{ all -> 0x0047 }
        r0 = r4.c;	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0045;
    L_0x0013:
        r0 = r4.c;	 Catch:{ all -> 0x0047 }
        r0 = r0.a;	 Catch:{ all -> 0x0047 }
        r1 = r4.c;	 Catch:{ all -> 0x0047 }
        r1 = r1.b;	 Catch:{ all -> 0x0047 }
        r2 = r4.c;	 Catch:{ all -> 0x0047 }
        r2 = r2.c;	 Catch:{ all -> 0x0047 }
        r0 = r0.length;	 Catch:{ all -> 0x0047 }
        if (r0 != 0) goto L_0x0032;
    L_0x0022:
        r0 = 0;
        r4.c = r0;	 Catch:{ all -> 0x0047 }
        r0 = r4.b;	 Catch:{ all -> 0x0047 }
        r0 = r0.get();	 Catch:{ all -> 0x0047 }
        r0 = (defpackage.hyk) r0;	 Catch:{ all -> 0x0047 }
        r3 = "iwek_length_0";
        r0.b(r3);	 Catch:{ all -> 0x0047 }
    L_0x0032:
        r0 = r1.length;	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0038;
    L_0x0035:
        r0 = r2.length;	 Catch:{ all -> 0x0047 }
        if (r0 != 0) goto L_0x0045;
    L_0x0038:
        r0 = r4.b;	 Catch:{ all -> 0x0047 }
        r0 = r0.get();	 Catch:{ all -> 0x0047 }
        r0 = (defpackage.hyk) r0;	 Catch:{ all -> 0x0047 }
        r1 = "betas_length_0";
        r0.c(r1);	 Catch:{ all -> 0x0047 }
    L_0x0045:
        monitor-exit(r4);
        return;
    L_0x0047:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iba.d():void");
    }

    /* JADX WARNING: Missing block: B:8:0x0021, code skipped:
            return;
     */
    public final synchronized void a(defpackage.wip r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.d();	 Catch:{ all -> 0x006e }
        r0 = 0;
        if (r3 != 0) goto L_0x0022;
    L_0x0007:
        r3 = r2.c;	 Catch:{ all -> 0x006e }
        if (r3 == 0) goto L_0x0020;
    L_0x000b:
        r2.c = r0;	 Catch:{ all -> 0x006e }
        r3 = r2.a;	 Catch:{ all -> 0x006e }
        r3 = r3.b();	 Catch:{ all -> 0x006e }
        r0 = r2.b;	 Catch:{ all -> 0x006e }
        r0 = r0.get();	 Catch:{ all -> 0x006e }
        r0 = (defpackage.hyk) r0;	 Catch:{ all -> 0x006e }
        r1 = "purge";
        r0.a(r1, r3);	 Catch:{ all -> 0x006e }
    L_0x0020:
        monitor-exit(r2);
        return;
    L_0x0022:
        r1 = r2.c;	 Catch:{ all -> 0x006e }
        r1 = r3.equals(r1);	 Catch:{ all -> 0x006e }
        if (r1 == 0) goto L_0x0039;
    L_0x002a:
        r3 = r2.b;	 Catch:{ all -> 0x006e }
        r3 = r3.get();	 Catch:{ all -> 0x006e }
        r3 = (defpackage.hyk) r3;	 Catch:{ all -> 0x006e }
        r1 = "keys_match";
        r3.a(r1, r0);	 Catch:{ all -> 0x006e }
        monitor-exit(r2);
        return;
    L_0x0039:
        r1 = r2.b;	 Catch:{ all -> 0x006e }
        r1 = r1.get();	 Catch:{ all -> 0x006e }
        r1 = (defpackage.hyk) r1;	 Catch:{ all -> 0x006e }
        r1.a();	 Catch:{ all -> 0x006e }
        r2.c = r3;	 Catch:{ all -> 0x006e }
        r3 = r2.a;	 Catch:{ all -> 0x006e }
        r1 = r2.c;	 Catch:{ all -> 0x006e }
        r3 = r3.a(r1);	 Catch:{ all -> 0x006e }
        if (r3 == 0) goto L_0x005f;
    L_0x0050:
        r3 = r2.b;	 Catch:{ all -> 0x006e }
        r3 = r3.get();	 Catch:{ all -> 0x006e }
        r3 = (defpackage.hyk) r3;	 Catch:{ all -> 0x006e }
        r1 = "write_success";
        r3.a(r1, r0);	 Catch:{ all -> 0x006e }
        monitor-exit(r2);
        return;
    L_0x005f:
        r3 = r2.b;	 Catch:{ all -> 0x006e }
        r3 = r3.get();	 Catch:{ all -> 0x006e }
        r3 = (defpackage.hyk) r3;	 Catch:{ all -> 0x006e }
        r1 = "write_failure";
        r3.a(r1, r0);	 Catch:{ all -> 0x006e }
        monitor-exit(r2);
        return;
    L_0x006e:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iba.a(wip):void");
    }

    public final synchronized byte[] a() {
        d();
        if (this.c == null) {
            return null;
        }
        return this.c.a;
    }

    public final synchronized byte[] b() {
        d();
        if (this.c == null) {
            return null;
        }
        return this.c.b;
    }

    public final synchronized byte[] c() {
        d();
        if (this.c == null) {
            return null;
        }
        return this.c.c;
    }
}
