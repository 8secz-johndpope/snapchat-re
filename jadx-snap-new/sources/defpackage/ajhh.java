package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajhh */
public final class ajhh extends ajcx {
    private ajda a;

    /* renamed from: ajhh$a */
    static final class a extends AtomicReference<ajej> implements ajcy, ajej {
        private ajcz a;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        private boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != ajfp.DISPOSED) {
                ajej ajej = (ajej) getAndSet(ajfp.DISPOSED);
                if (ajej != ajfp.DISPOSED) {
                    try {
                        this.a.a(th);
                        return true;
                    } finally {
                        if (ajej != null) {
                            ajej.dispose();
                        }
                    }
                }
            }
            return false;
        }

        /* JADX WARNING: Failed to extract finally block: empty outs */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A:{RETURN, REMOVE} */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A:{RETURN, REMOVE} */
        /* JADX WARNING: Missing block: B:8:0x001e, code skipped:
            return;
     */
        public final void a() {
            /*
            r2 = this;
            r0 = r2.get();
            r1 = defpackage.ajfp.DISPOSED;
            if (r0 == r1) goto L_0x0026;
        L_0x0008:
            r0 = defpackage.ajfp.DISPOSED;
            r0 = r2.getAndSet(r0);
            r0 = (defpackage.ajej) r0;
            r1 = defpackage.ajfp.DISPOSED;
            if (r0 == r1) goto L_0x0026;
        L_0x0014:
            r1 = r2.a;	 Catch:{ all -> 0x001f }
            r1.a();	 Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0026;
        L_0x001b:
            r0.dispose();
            return;
        L_0x001f:
            r1 = move-exception;
            if (r0 == 0) goto L_0x0025;
        L_0x0022:
            r0.dispose();
        L_0x0025:
            throw r1;
        L_0x0026:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhh$a.a():void");
        }

        public final void a(ajej ajej) {
            ajfp.a((AtomicReference) this, ajej);
        }

        public final void a(ajfa ajfa) {
            ajfp.a((AtomicReference) this, new ajfn(ajfa));
        }

        public final void a(Throwable th) {
            if (!b(th)) {
                ajvo.a(th);
            }
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    public ajhh(ajda ajda) {
        this.a = ajda;
    }

    public final void b(ajcz ajcz) {
        ajej aVar = new a(ajcz);
        ajcz.a(aVar);
        try {
            this.a.subscribe(aVar);
        } catch (Throwable th) {
            ajep.a(th);
            aVar.a(th);
        }
    }
}
