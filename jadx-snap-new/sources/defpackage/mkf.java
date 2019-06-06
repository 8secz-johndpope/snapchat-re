package defpackage;

import com.brightcove.player.event.Event;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.listener.LensBitmoji3dListener;
import defpackage.mjl.b;
import defpackage.mjl.c;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: mkf */
public final class mkf implements mjl {
    final ajws<b> a;
    final mkx b;
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new a(this));

    /* renamed from: mkf$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        final /* synthetic */ mkf a;

        /* renamed from: mkf$1$a */
        static final class a implements LensBitmoji3dListener {
            private /* synthetic */ 1 a;
            private /* synthetic */ LSCoreManagerWrapper b;

            a(1 1, LSCoreManagerWrapper lSCoreManagerWrapper) {
                this.a = 1;
                this.b = lSCoreManagerWrapper;
            }

            public final void requestMetadata() {
                this.b.setBitmoji3dMetadata(mkg.a);
                this.a.a.a.a((Object) b.a);
            }
        }

        1(mkf mkf) {
            this.a = mkf;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setLensBitmoji3dListener(new a(this, lSCoreManagerWrapper));
            return ajxw.a;
        }
    }

    /* renamed from: mkf$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.mjl.b>> {
        private /* synthetic */ mkf a;

        b(mkf mkf) {
            this.a = mkf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f();
        }
    }

    /* renamed from: mkf$a */
    static final class a extends akcs implements akbk<mid<? super c, ajxw>> {
        private /* synthetic */ mkf a;

        /* renamed from: mkf$a$a */
        public static final class a implements mid<c, ajxw> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = false;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;

            /* renamed from: mkf$a$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj) {
                this.c = mkx;
                this.f = str;
                this.g = true;
                this.h = obj;
                this.a = new CopyOnWriteArrayList();
                this.d = mkx.c;
                this.b = mkx.d;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            /* JADX WARNING: Missing block: B:36:0x0100, code skipped:
            if ((r9 instanceof defpackage.mjl.c.b.b) != false) goto L_0x0086;
     */
            public final defpackage.ajxw a(defpackage.mjl.c r9) {
                /*
                r8 = this;
                r0 = r8.a;
                r0 = (java.util.Collection) r0;
                r0 = r0.isEmpty();
                r0 = r0 ^ 1;
                if (r0 == 0) goto L_0x0015;
            L_0x000c:
                r1 = r8.d;
                r2 = java.util.concurrent.TimeUnit.MILLISECONDS;
                r1 = r1.a(r2);
                goto L_0x0017;
            L_0x0015:
                r1 = 0;
            L_0x0017:
                r3 = r8.c;
                r4 = r8.g;
                r5 = r3.isDisposed();
                r5 = r5 ^ 1;
                if (r5 == 0) goto L_0x0106;
            L_0x0023:
                r5 = r3.a;
                r5 = r5.b();
                r5 = (defpackage.mpn) r5;
                if (r4 == 0) goto L_0x0066;
            L_0x002d:
                r6 = r5.a();
                if (r6 == 0) goto L_0x0034;
            L_0x0033:
                goto L_0x0066;
            L_0x0034:
                r9 = new java.lang.IllegalStateException;
                r0 = new java.lang.StringBuilder;
                r1 = "Called on a thread with id [";
                r0.<init>(r1);
                r1 = java.lang.Thread.currentThread();
                r2 = "currentThread()";
                defpackage.akcr.a(r1, r2);
                r1 = r1.getId();
                r0.append(r1);
                r1 = "] while expecting id [";
                r0.append(r1);
                r1 = r5.a;
                r0.append(r1);
                r1 = 93;
                r0.append(r1);
                r0 = r0.toString();
                r9.<init>(r0);
                r9 = (java.lang.Throwable) r9;
                throw r9;
            L_0x0066:
                r5 = r5.b;
                if (r4 == 0) goto L_0x006d;
            L_0x006a:
                r3.a(r5);
            L_0x006d:
                r9 = (defpackage.mjl.c) r9;
                r3 = r9 instanceof defpackage.mjl.c.c;
                if (r3 == 0) goto L_0x00f1;
            L_0x0073:
                r9 = (defpackage.mjl.c.c) r9;
                r3 = r9.a;
                r3 = r3.a;
                r4 = defpackage.mhs.c.a;
                r3 = defpackage.akcr.a(r3, r4);
                if (r3 == 0) goto L_0x008e;
            L_0x0081:
                r9 = defpackage.mkg.b;
                r5.setBitmoji3dMetadata(r9);
            L_0x0086:
                r9 = com.looksery.sdk.BitmojiType.YOURS_BITMOJI;
                r3 = com.looksery.sdk.BitmojiAvailability.NOT_AVAILABLE;
            L_0x008a:
                r5.setBitmojiAvailability(r9, r3);
                goto L_0x0103;
            L_0x008e:
                r3 = r9.b;
                r3 = r3.isEmpty();
                if (r3 == 0) goto L_0x00a9;
            L_0x0096:
                r3 = new com.looksery.sdk.domain.Bitmoji3dData;
                r9 = r9.a;
                r9 = r9.b;
                r4 = com.looksery.sdk.domain.Bitmoji3dData.Availability.AVAILABLE;
                r6 = defpackage.ajyx.a;
                r6 = (java.util.Map) r6;
                r3.<init>(r9, r4, r6);
                r5.setBitmoji3dMetadata(r3);
                goto L_0x00f9;
            L_0x00a9:
                r3 = r9.b;
                r3 = (java.lang.Iterable) r3;
                r4 = new java.util.ArrayList;
                r6 = 10;
                r6 = defpackage.ajyn.a(r3, r6);
                r4.<init>(r6);
                r4 = (java.util.Collection) r4;
                r3 = r3.iterator();
            L_0x00be:
                r6 = r3.hasNext();
                if (r6 == 0) goto L_0x00da;
            L_0x00c4:
                r6 = r3.next();
                r6 = (defpackage.mjl.c.a) r6;
                r7 = r6.a;
                r7 = r7.toString();
                r6 = r6.b;
                r6 = defpackage.ajxs.a(r7, r6);
                r4.add(r6);
                goto L_0x00be;
            L_0x00da:
                r4 = (java.util.List) r4;
                r4 = (java.lang.Iterable) r4;
                r3 = defpackage.ajzm.a(r4);
                r4 = new com.looksery.sdk.domain.Bitmoji3dData;
                r9 = r9.a;
                r9 = r9.b;
                r6 = com.looksery.sdk.domain.Bitmoji3dData.Availability.AVAILABLE;
                r4.<init>(r9, r6, r3);
                r5.setBitmoji3dMetadata(r4);
                goto L_0x00f9;
            L_0x00f1:
                r3 = r9 instanceof defpackage.mjl.c.b;
                if (r3 == 0) goto L_0x0103;
            L_0x00f5:
                r3 = r9 instanceof defpackage.mjl.c.b.a;
                if (r3 == 0) goto L_0x00fe;
            L_0x00f9:
                r9 = com.looksery.sdk.BitmojiType.YOURS_BITMOJI;
                r3 = com.looksery.sdk.BitmojiAvailability.AVAILABLE;
                goto L_0x008a;
            L_0x00fe:
                r9 = r9 instanceof defpackage.mjl.c.b.b;
                if (r9 == 0) goto L_0x0103;
            L_0x0102:
                goto L_0x0086;
            L_0x0103:
                r9 = defpackage.ajxw.a;
                goto L_0x0107;
            L_0x0106:
                r9 = 0;
            L_0x0107:
                if (r9 != 0) goto L_0x010b;
            L_0x0109:
                r9 = r8.h;
            L_0x010b:
                if (r0 == 0) goto L_0x012d;
            L_0x010d:
                r0 = r8.d;
                r3 = java.util.concurrent.TimeUnit.MILLISECONDS;
                r3 = r0.a(r3);
                r3 = r3 - r1;
                r0 = r8.a;
                r0 = r0.iterator();
            L_0x011c:
                r1 = r0.hasNext();
                if (r1 == 0) goto L_0x012d;
            L_0x0122:
                r1 = r0.next();
                r1 = (defpackage.min.a) r1;
                r5 = (double) r3;
                r1.a(r5);
                goto L_0x011c;
            L_0x012d:
                return r9;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mkf$a$a.a(java.lang.Object):java.lang.Object");
            }

            public final ajdx<ajxw> b(final c cVar) {
                Object b;
                String str;
                if (this.c.isDisposed()) {
                    b = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    b = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<ajxw> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(cVar));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(b, str);
                return b;
            }

            public final ajdp<R> c(c cVar) {
                return defpackage.mid.a.a(this, cVar);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.h);
                stringBuilder.append(", trace: false]");
                return stringBuilder.toString();
            }
        }

        a(mkf mkf) {
            this.a = mkf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a.b, "DefaultBitmojiDataProcessor#trigger", ajxw.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mkf.class), "requests", "getRequests()Lio/reactivex/Observable;"), new akdc(akde.a(mkf.class), "process", "getProcess()Lcom/snap/lenses/common/Operation;")};
    }

    public mkf(mkx mkx) {
        akcr.b(mkx, "lensCore");
        this.b = mkx;
        this.b.c(new 1(this));
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Bi…Request>().toSerialized()");
        this.a = r;
    }

    public final ajdp<b> a() {
        return (ajdp) this.c.b();
    }

    public final mid<c, ajxw> b() {
        return (mid) this.d.b();
    }
}
