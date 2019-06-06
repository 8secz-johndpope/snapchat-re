package defpackage;

import java.util.Map;

/* renamed from: acrc */
public final class acrc extends ajdx<Map<String, alhq>> {
    private final acrg a;
    private final long b;

    /* renamed from: acrc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acrc$b */
    public static final class b implements acrj, ajej {
        private boolean a;
        private ajdz<? super Map<String, alhq>> b;
        private final acrg c;

        public b(ajdz<? super Map<String, alhq>> ajdz, acrg acrg) {
            akcr.b(acrg, "friendLocationManager");
            this.b = ajdz;
            this.c = acrg;
        }

        /* JADX WARNING: Missing block: B:20:0x0031, code skipped:
            return;
     */
        public final void a(defpackage.acrd r2, java.util.List<defpackage.alhm> r3, double r4) {
            /*
            r1 = this;
            r0 = "result";
            defpackage.akcr.b(r2, r0);
            monitor-enter(r1);
            r0 = r1.a;	 Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r1);
            return;
        L_0x000c:
            r0 = r2.b;	 Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0014;
        L_0x0010:
            r0 = r2.a;	 Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x001e;
        L_0x0014:
            r2 = r2.c;	 Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0019;
        L_0x0018:
            goto L_0x001e;
        L_0x0019:
            r2 = r1.c;	 Catch:{ all -> 0x0032 }
            r2.a(r3, r4);	 Catch:{ all -> 0x0032 }
        L_0x001e:
            r2 = r1.b;	 Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0030;
        L_0x0022:
            r3 = r1.c;	 Catch:{ all -> 0x0032 }
            r3 = r3.a();	 Catch:{ all -> 0x0032 }
            r4 = "friendLocationManager.fr…ocationsIncludingSelfCopy";
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0032 }
            r2.b_(r3);	 Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r1);
            return;
        L_0x0032:
            r2 = move-exception;
            monitor-exit(r1);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acrc$b.a(acrd, java.util.List, double):void");
        }

        public final void dispose() {
            synchronized (this) {
                this.b = null;
                this.a = true;
            }
        }

        public final boolean isDisposed() {
            return this.a;
        }
    }

    static {
        a aVar = new a();
    }

    public acrc(acrg acrg, long j) {
        akcr.b(acrg, "friendLocationManager");
        this.a = acrg;
        this.b = j;
    }

    public final void b(ajdz<? super Map<String, alhq>> ajdz) {
        akcr.b(ajdz, "observer");
        b bVar = new b(ajdz, this.a);
        ajdz.a((ajej) bVar);
        long j = this.b;
        if (j <= 0 || !this.a.a(j)) {
            this.a.o().a(bVar);
            return;
        }
        Object a = this.a.a();
        akcr.a(a, "friendLocationManager.fr…ocationsIncludingSelfCopy");
        ajdz.b_(a);
    }
}
