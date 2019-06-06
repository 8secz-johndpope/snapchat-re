package defpackage;

import defpackage.mmi.c;
import defpackage.mph.a;
import defpackage.mph.b;
import java.util.concurrent.TimeUnit;

/* renamed from: lly */
public final class lly implements mph {
    final ajws<a> a;
    final ajfb<lls> b;
    final zfw c;
    final long d;
    final TimeUnit e;
    private final ajxe f;

    /* renamed from: lly$b */
    static final class b extends akcs implements akbk<ajdp<defpackage.mph.b>> {
        final /* synthetic */ lly a;
        private /* synthetic */ mmt b;

        /* renamed from: lly$b$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.mmi.c.a;
            }
        }

        /* renamed from: lly$b$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                c.a aVar = (c.a) obj;
                akcr.b(aVar, "it");
                return !(aVar instanceof c.a.c) ? ajdp.b(aVar.a) : ajvo.a(ajpu.a);
            }
        }

        b(lly lly, mmt mmt) {
            this.a = lly;
            this.b = mmt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = this.b.a().b().a((ajfl) a.a).a(c.a.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            final ajdj d = a.u(b.a).d();
            return ajpy.k(this.a.a.m(new ajfc<T, ajdn<? extends R>>(this) {
                final /* synthetic */ b a;

                public final /* synthetic */ Object apply(Object obj) {
                    final a aVar = (a) obj;
                    akcr.b(aVar, "request");
                    return d.a((ajfc) new ajfc<T, ajdn<? extends R>>(this) {
                        private /* synthetic */ 1 b;

                        /* renamed from: lly$b$1$1$1 */
                        static final class 1<T, R> implements ajfc<T, R> {
                            private /* synthetic */ 1 a;

                            1(1 1) {
                                this.a = 1;
                            }

                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((lls) obj, "it");
                                obj = aVar;
                                akcr.a(obj, "request");
                                return defpackage.mph.b.a.a(obj);
                            }
                        }

                        /* JADX WARNING: Missing block: B:14:0x007f, code skipped:
            if (r0 == null) goto L_0x0081;
     */
                        public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                            /*
                            r5 = this;
                            r6 = (defpackage.mhs.b) r6;
                            r0 = "activeFilterId";
                            defpackage.akcr.b(r6, r0);
                            r0 = r3;
                            r1 = "request";
                            defpackage.akcr.a(r0, r1);
                            r2 = r0.b;
                            r3 = "init";
                            r2 = defpackage.akgb.c(r2, r3);
                            if (r2 == 0) goto L_0x0027;
                        L_0x0018:
                            r0 = new lls$a;
                            r0.<init>(r6);
                            r0 = defpackage.ajdj.b(r0);
                            r2 = "just(SnappableMetadata.Pending(filterId))";
                        L_0x0023:
                            defpackage.akcr.a(r0, r2);
                            goto L_0x008a;
                        L_0x0027:
                            r2 = r0.b;
                            r3 = "send";
                            r2 = defpackage.akgb.c(r2, r3);
                            if (r2 == 0) goto L_0x0081;
                        L_0x0031:
                            r0 = r0.c;
                            r0 = defpackage.algd.a(r0);
                            r2 = "snappableMessage";
                            defpackage.akcr.a(r0, r2);
                            r2 = r0.a();
                            r3 = "snappableMessage.effectId";
                            defpackage.akcr.a(r2, r3);
                            r2 = defpackage.mhs.a.a(r2);
                            r3 = r2 instanceof defpackage.mhs.b;
                            r4 = 0;
                            if (r3 != 0) goto L_0x004f;
                        L_0x004e:
                            r2 = r4;
                        L_0x004f:
                            r2 = (defpackage.mhs.b) r2;
                            if (r2 != 0) goto L_0x0054;
                        L_0x0053:
                            goto L_0x006c;
                        L_0x0054:
                            r3 = com.google.common.io.BaseEncoding.base64();
                            r0 = (com.google.protobuf.nano.MessageNano) r0;
                            r0 = com.google.protobuf.nano.MessageNano.toByteArray(r0);
                            r0 = r3.encode(r0);
                            r4 = new ajxm;
                            r3 = "lensMetadata";
                            defpackage.akcr.a(r0, r3);
                            r4.<init>(r2, r0);
                        L_0x006c:
                            if (r4 == 0) goto L_0x0081;
                        L_0x006e:
                            r0 = r4.a;
                            r0 = (defpackage.mhs.b) r0;
                            r2 = r4.b;
                            r2 = (java.lang.String) r2;
                            r3 = new lls$b;
                            r3.<init>(r0, r2);
                            r0 = defpackage.ajdj.b(r3);
                            if (r0 != 0) goto L_0x008a;
                        L_0x0081:
                            r0 = defpackage.ajlu.a;
                            r0 = defpackage.ajvo.a(r0);
                            r2 = "empty()";
                            goto L_0x0023;
                        L_0x008a:
                            r2 = r5.b;
                            r2 = r2.a;
                            r2 = r2.a;
                            r2 = r2.b;
                            r0 = r0.c(r2);
                            r2 = "process(request, activeF…appablesMetadataConsumer)";
                            defpackage.akcr.a(r0, r2);
                            r2 = new java.lang.StringBuilder;
                            r3 = "snappable metadata for request:[";
                            r2.<init>(r3);
                            r3 = r3;
                            r2.append(r3);
                            r3 = "]; lens:[";
                            r2.append(r3);
                            r2.append(r6);
                            r6 = 93;
                            r2.append(r6);
                            r6 = new lly$b$1$1$1;
                            r6.<init>(r5);
                            r6 = (defpackage.ajfc) r6;
                            r6 = r0.f(r6);
                            r0 = new mph$b$b$a;
                            r2 = r3;
                            defpackage.akcr.a(r2, r1);
                            r1 = "Error while processing request";
                            r0.<init>(r2, r1);
                            r0 = defpackage.ajdj.b(r0);
                            r0 = (defpackage.ajdn) r0;
                            r6 = r6.b(r0);
                            return r6;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.lly$b$1$1.apply(java.lang.Object):java.lang.Object");
                        }
                    });
                }
            })).g(10, this.a.e, this.a.c.b());
        }
    }

    /* renamed from: lly$a */
    static final class a extends akcq implements akbl<defpackage.mph.a, ajxw> {
        a(ajws ajws) {
            super(1, ajws);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajws.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            defpackage.mph.a aVar = (defpackage.mph.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lly.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public /* synthetic */ lly(mmt mmt, ajfb ajfb, zfw zfw) {
        this(mmt, ajfb, zfw, TimeUnit.SECONDS);
    }

    private lly(mmt mmt, ajfb<lls> ajfb, zfw zfw, TimeUnit timeUnit) {
        akcr.b(mmt, "lensCore");
        akcr.b(ajfb, "snappablesMetadataConsumer");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(timeUnit, "disposeTimeUnit");
        this.b = ajfb;
        this.c = zfw;
        this.d = 10;
        this.e = timeUnit;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Request>().toSerialized()");
        this.a = r;
        this.f = ajxh.a(new b(this, mmt));
    }

    public final ajfb<a> a() {
        return new llz(new a(this.a));
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "request");
        return akgb.b(aVar.b, "app://snappables", false);
    }

    public final ajdp<b> b() {
        return (ajdp) this.f.b();
    }
}
