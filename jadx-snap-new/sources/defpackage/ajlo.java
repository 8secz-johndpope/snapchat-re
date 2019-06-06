package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajlo */
public final class ajlo<T> extends ajdj<T> {
    private ajdm<T> a;

    /* renamed from: ajlo$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdk<T>, ajej {
        private ajdl<? super T> a;

        a(ajdl<? super T> ajdl) {
            this.a = ajdl;
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajlo$a.a():void");
        }

        public final void a(ajej ajej) {
            ajfp.a((AtomicReference) this, ajej);
        }

        public final void a(T t) {
            if (get() != ajfp.DISPOSED) {
                ajej ajej = (ajej) getAndSet(ajfp.DISPOSED);
                if (ajej != ajfp.DISPOSED) {
                    if (t == null) {
                        try {
                            this.a.a(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (ajej != null) {
                                ajej.dispose();
                            }
                        }
                    } else {
                        this.a.b_(t);
                    }
                    if (ajej != null) {
                        ajej.dispose();
                    }
                }
            }
        }

        public final boolean a(Throwable th) {
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

    public ajlo(ajdm<T> ajdm) {
        this.a = ajdm;
    }

    public final void a(ajdl<? super T> ajdl) {
        ajej aVar = new a(ajdl);
        ajdl.a(aVar);
        try {
            this.a.a(aVar);
        } catch (Throwable th) {
            ajep.a(th);
            if (!aVar.a(th)) {
                ajvo.a(th);
            }
        }
    }
}
