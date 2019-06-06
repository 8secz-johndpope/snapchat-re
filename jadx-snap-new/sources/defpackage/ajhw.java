package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajhw */
public final class ajhw extends ajcx {
    private akuw<? extends ajdb> a;
    private int b;
    private boolean c;

    /* renamed from: ajhw$a */
    static final class a extends AtomicInteger implements ajdh<ajdb>, ajej {
        final ajcz a;
        final int b;
        final boolean c;
        final ajul d = new ajul();
        final ajei e = new ajei();
        akuy f;

        /* renamed from: ajhw$a$a */
        final class a extends AtomicReference<ajej> implements ajcz, ajej {
            a() {
            }

            public final void a() {
                a aVar = a.this;
                aVar.e.c(this);
                if (aVar.decrementAndGet() == 0) {
                    Throwable th = (Throwable) aVar.d.get();
                    if (th != null) {
                        aVar.a.a(th);
                        return;
                    } else {
                        aVar.a.a();
                        return;
                    }
                }
                if (aVar.b != Integer.MAX_VALUE) {
                    aVar.f.a(1);
                }
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                a aVar = a.this;
                aVar.e.c(this);
                if (!aVar.c) {
                    aVar.f.b();
                    aVar.e.dispose();
                    if (!ajur.a(aVar.d, th)) {
                        ajvo.a(th);
                    } else if (aVar.getAndSet(0) > 0) {
                        aVar.a.a(ajur.a(aVar.d));
                    }
                } else if (!ajur.a(aVar.d, th)) {
                    ajvo.a(th);
                } else if (aVar.decrementAndGet() == 0) {
                    aVar.a.a(ajur.a(aVar.d));
                } else if (aVar.b != Integer.MAX_VALUE) {
                    aVar.f.a(1);
                }
            }

            public final void dispose() {
                ajfp.a((AtomicReference) this);
            }

            public final boolean isDisposed() {
                return ajfp.a((ajej) get());
            }
        }

        a(ajcz ajcz, int i, boolean z) {
            this.a = ajcz;
            this.b = i;
            this.c = z;
            lazySet(1);
        }

        public final void a() {
            if (decrementAndGet() == 0) {
                if (((Throwable) this.d.get()) != null) {
                    this.a.a(ajur.a(this.d));
                    return;
                }
                this.a.a();
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.f, akuy)) {
                this.f = akuy;
                this.a.a((ajej) this);
                int i = this.b;
                if (i == Integer.MAX_VALUE) {
                    akuy.a(Long.MAX_VALUE);
                    return;
                }
                akuy.a((long) i);
            }
        }

        /* JADX WARNING: Missing block: B:5:0x0016, code skipped:
            if (getAndSet(0) > 0) goto L_0x0018;
     */
        /* JADX WARNING: Missing block: B:13:0x0034, code skipped:
            if (decrementAndGet() == 0) goto L_0x0018;
     */
        public final void a(java.lang.Throwable r2) {
            /*
            r1 = this;
            r0 = r1.c;
            if (r0 != 0) goto L_0x0028;
        L_0x0004:
            r0 = r1.e;
            r0.dispose();
            r0 = r1.d;
            r0 = defpackage.ajur.a(r0, r2);
            if (r0 == 0) goto L_0x0024;
        L_0x0011:
            r2 = 0;
            r2 = r1.getAndSet(r2);
            if (r2 <= 0) goto L_0x003a;
        L_0x0018:
            r2 = r1.a;
            r0 = r1.d;
            r0 = defpackage.ajur.a(r0);
            r2.a(r0);
            return;
        L_0x0024:
            defpackage.ajvo.a(r2);
            return;
        L_0x0028:
            r0 = r1.d;
            r0 = defpackage.ajur.a(r0, r2);
            if (r0 == 0) goto L_0x0037;
        L_0x0030:
            r2 = r1.decrementAndGet();
            if (r2 != 0) goto L_0x003a;
        L_0x0036:
            goto L_0x0018;
        L_0x0037:
            defpackage.ajvo.a(r2);
        L_0x003a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajhw$a.a(java.lang.Throwable):void");
        }

        public final void dispose() {
            this.f.b();
            this.e.dispose();
        }

        public final boolean isDisposed() {
            return this.e.isDisposed();
        }
    }

    public ajhw(akuw<? extends ajdb> akuw, int i, boolean z) {
        this.a = akuw;
        this.b = i;
        this.c = z;
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz, this.b, this.c));
    }
}
