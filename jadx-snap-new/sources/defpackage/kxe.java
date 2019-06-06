package defpackage;

import android.graphics.Point;
import com.google.common.base.Optional;
import defpackage.kqe.j;
import defpackage.lqf.b.b;
import defpackage.lqf.b.b.c;
import defpackage.lqh.a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kxe */
public interface kxe {

    /* renamed from: kxe$h */
    public static final class h implements kxe {
        private final ajdp<Point> a;
        private final ajdp<ebn> b;
        private final ajdp<lqf> c;

        public h(ajdp<Point> ajdp, ajdp<ebn> ajdp2, ajdp<lqf> ajdp3) {
            akcr.b(ajdp, "singleTapObservable");
            akcr.b(ajdp2, "longPressUpdateObservable");
            akcr.b(ajdp3, "cameraLifecycle");
            this.a = ajdp;
            this.b = ajdp2;
            this.c = ajdp3;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object b = ajdp.b((ajdt) new o(this.a, this.c).a(lqh), (ajdt) new k(this.b, this.c).a(lqh));
            akcr.a(b, "Observable.merge(\n      …e).attach(cameraUseCase))");
            return b;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.h;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.kxe.h) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$h.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            ajdp ajdp2 = this.b;
            hashCode = (hashCode + (ajdp2 != null ? ajdp2.hashCode() : 0)) * 31;
            ajdp2 = this.c;
            if (ajdp2 != null) {
                i = ajdp2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Default(singleTapObservable=");
            stringBuilder.append(this.a);
            stringBuilder.append(", longPressUpdateObservable=");
            stringBuilder.append(this.b);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$f */
    public static final class f implements kxe {
        final ajdp<lqf> a;
        final zfw b;
        final long c;
        final TimeUnit d;

        /* renamed from: kxe$f$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: kxe$f$d */
        static final class d<T1, T2, R> implements ajex<R, T, R> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                ajxm ajxm = (ajxm) obj;
                lqf lqf = (lqf) obj2;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                akcr.b(lqf, "lifecycle");
                lqf lqf2 = (lqf) ajxm.a;
                boolean booleanValue = ((Boolean) ajxm.b).booleanValue();
                boolean z = false;
                Object obj3 = ((lqf2 instanceof b.a) || (lqf2 instanceof c)) ? 1 : null;
                Object obj4 = ((lqf instanceof lqf.b.a) || (lqf instanceof b.b)) ? 1 : null;
                if (booleanValue || !(obj3 == null || obj4 == null)) {
                    z = true;
                }
                return ajxs.a(lqf, Boolean.valueOf(z));
            }
        }

        /* renamed from: kxe$f$e */
        static final class e<T> implements ajfl<ajxm<? extends lqf, ? extends Boolean>> {
            public static final e a = new e();

            e() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                return ((lqf) ajxm.a) instanceof lqf.b.a;
            }
        }

        /* renamed from: kxe$f$f */
        static final class f<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
            private /* synthetic */ f a;

            /* renamed from: kxe$f$f$1 */
            static final class 1<T> implements ajfl<lqf> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ boolean test(Object obj) {
                    lqf lqf = (lqf) obj;
                    akcr.b(lqf, "it");
                    return lqf instanceof b.b;
                }
            }

            f(f fVar) {
                this.a = fVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajdp) obj, "<anonymous parameter 0>");
                return this.a.a.a((ajfl) 1.a);
            }
        }

        /* renamed from: kxe$f$b */
        public static final class b<T> implements ajfl<Object> {
            public static final b a = new b();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lqh.b.a;
            }
        }

        /* renamed from: kxe$f$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ f a;
            final /* synthetic */ AtomicReference b;

            /* renamed from: kxe$f$c$a */
            static final class a extends akcs implements akbl<mhs, ajdp<ajxw>> {
                final /* synthetic */ c a;

                a(c cVar) {
                    this.a = cVar;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    final mhs mhs = (mhs) obj;
                    akcr.b(mhs, "identifier");
                    obj = ajdp.b((Callable) new Callable<T>(this) {
                        private /* synthetic */ a a;

                        public final /* synthetic */ Object call() {
                            this.a.a.b.set(mhs);
                            return ajxw.a;
                        }
                    });
                    akcr.a(obj, "fromCallable {\n         …                        }");
                    return obj;
                }
            }

            c(f fVar, AtomicReference atomicReference) {
                this.a = fVar;
                this.b = atomicReference;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                ajxm ajxm2 = (ajxm) ajxm.a;
                lqh.b bVar = (lqh.b) ajxm.b;
                lqf.a aVar = (lqf) ajxm2.a;
                boolean booleanValue = ((Boolean) ajxm2.b).booleanValue();
                boolean z = aVar instanceof lqf.b.a;
                String str = "DeactivateOnCameraStreamingStop";
                if (z || akcr.a((Object) aVar, lqf.a.a)) {
                    if (!(bVar instanceof defpackage.lqh.b.a.c)) {
                        return bVar instanceof lqh.b.a.a ? (z && akcr.a((mhs) this.b.get(), defpackage.mhs.c.a)) ? ajdp.b(a.b.a) : ajvo.a(ajot.a) : ajvo.a(ajot.a);
                    } else {
                        final akbl aVar2 = new a(this);
                        if (!booleanValue && aVar != lqf.a.a) {
                            return ((ajdp) aVar2.invoke(((defpackage.lqh.b.a.c) bVar).a)).u(new ajfc<T, ajdt<? extends R>>(this) {
                                private /* synthetic */ c b;

                                /* renamed from: kxe$f$c$1$1 */
                                static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                                    private /* synthetic */ 1 a;

                                    1(1 1) {
                                        this.a = 1;
                                    }

                                    public final /* synthetic */ Object apply(Object obj) {
                                        akcr.b((Long) obj, "<anonymous parameter 0>");
                                        return (ajdp) aVar2.invoke(defpackage.mhs.c.a);
                                    }
                                }

                                /* renamed from: kxe$f$c$1$2 */
                                static final class 2<T, R> implements ajfc<T, R> {
                                    public static final 2 a = new 2();

                                    2() {
                                    }

                                    public final /* synthetic */ Object apply(Object obj) {
                                        akcr.b((ajxw) obj, "<anonymous parameter 0>");
                                        return a.b.a;
                                    }
                                }

                                /* renamed from: kxe$f$c$1$3 */
                                static final class 3<T> implements ajfl<lqf> {
                                    public static final 3 a = new 3();

                                    3() {
                                    }

                                    public final /* synthetic */ boolean test(Object obj) {
                                        lqf lqf = (lqf) obj;
                                        akcr.b(lqf, "it");
                                        return lqf instanceof b;
                                    }
                                }

                                public final /* synthetic */ Object apply(Object obj) {
                                    akcr.b((ajxw) obj, "<anonymous parameter 0>");
                                    return ajdp.a(3, this.b.a.d, (ajdw) this.b.a.b.b()).u(new 1(this)).p(2.a).j((ajdt) this.b.a.a.a((ajfl) 3.a));
                                }
                            }).h(new a.a.a(str, 3));
                        }
                        obj = myu.a((ajdp) aVar2.invoke(((defpackage.lqh.b.a.c) bVar).a));
                        if (aVar != lqf.a.a) {
                            obj = obj.h(new a.a.a(str, 3));
                        }
                        return obj;
                    }
                } else if (aVar instanceof b) {
                    mhs mhs = (mhs) this.b.getAndSet(defpackage.mhs.c.a);
                    if (!(bVar instanceof lqh.b.b)) {
                        if (mhs instanceof mhs.b) {
                            return ajdp.b(new defpackage.lqh.a.a.c((mhs.b) mhs, false, str, 14));
                        }
                        if (!(mhs instanceof defpackage.mhs.c)) {
                            throw new ajxk();
                        }
                    }
                    return ajvo.a(ajot.a);
                } else {
                    throw new ajxk();
                }
            }
        }

        static {
            a aVar = new a();
        }

        public /* synthetic */ f(ajdp ajdp, zfw zfw) {
            this(ajdp, zfw, TimeUnit.SECONDS);
        }

        private f(ajdp<lqf> ajdp, zfw zfw, TimeUnit timeUnit) {
            akcr.b(ajdp, "cameraLifecycle");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(timeUnit, "selectedLensDeactivationTimeoutTimeUnit");
            this.a = ajdp;
            this.b = zfw;
            this.c = 3;
            this.d = timeUnit;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object t = this.a.b(ajxs.a(lqf.a.a, Boolean.FALSE), (ajex) d.a).b(1).c((ajfl) e.a).t(new f(this));
            AtomicReference atomicReference = new AtomicReference(mhs.c.a);
            akcr.a(t, "cameraLifecycleState");
            ajdp a = myu.a(t, lqh.b());
            Object a2 = lqh.b().a((ajfl) b.a).a(lqh.b.a.class);
            akcr.a(a2, "this.filter { it is R }.cast(R::class.java)");
            a2 = a.d((ajdt) a2);
            akcr.a(a2, "pairLatest(cameraLifecyc…eraUseCase.whenActivated)");
            a2 = mip.c(a2, "DeactivateOnCameraStreamingStop:downstream").a((ajfc) new c(this, atomicReference));
            akcr.a(a2, "pairLatest(cameraLifecyc…  }\n                    }");
            return a2;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.f;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.kxe.f) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.d;
            r3 = r3.d;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$f.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            zfw zfw = this.b;
            hashCode = (((hashCode + (zfw != null ? zfw.hashCode() : 0)) * 31) + 3) * 31;
            TimeUnit timeUnit = this.d;
            if (timeUnit != null) {
                i = timeUnit.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("DeactivateOnCameraStreamingStop(cameraLifecycle=");
            stringBuilder.append(this.a);
            stringBuilder.append(", qualifiedSchedulers=");
            stringBuilder.append(this.b);
            stringBuilder.append(", selectedLensDeactivationTimeout=3");
            stringBuilder.append(", selectedLensDeactivationTimeoutTimeUnit=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$i */
    public static final class i {

        /* renamed from: kxe$i$b */
        public static final class b implements kxe {
            private /* synthetic */ kxe a;
            private /* synthetic */ kxe b;

            b(kxe kxe, kxe kxe2) {
                this.a = kxe;
                this.b = kxe2;
            }

            public final ajdp<a> a(lqh lqh) {
                akcr.b(lqh, "cameraUseCase");
                Object e = this.a.a(lqh).e((ajdt) this.b.a(lqh));
                akcr.a(e, "this@CameraUseCaseAction…er.attach(cameraUseCase))");
                return e;
            }

            public final kxe a(kxe kxe) {
                akcr.b(kxe, "other");
                return i.a((kxe) this, kxe);
            }
        }

        /* renamed from: kxe$i$a */
        public static final class a implements kxe {
            final /* synthetic */ kxe a;
            private /* synthetic */ ajdp b;

            /* renamed from: kxe$i$a$a */
            static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ a a;
                private /* synthetic */ lqh b;

                a(a aVar, lqh lqh) {
                    this.a = aVar;
                    this.b = lqh;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    akcr.b(bool, "enabled");
                    if (bool.booleanValue()) {
                        return this.a.a.a(this.b);
                    }
                    obj = ajvo.a(ajot.a);
                    akcr.a(obj, "empty()");
                    return obj;
                }
            }

            a(kxe kxe, ajdp ajdp) {
                this.a = kxe;
                this.b = ajdp;
            }

            public final ajdp<defpackage.lqh.a> a(lqh lqh) {
                akcr.b(lqh, "cameraUseCase");
                Object u = this.b.u(new a(this, lqh));
                akcr.a(u, "condition.switchMap { en…      }\n                }");
                return u;
            }

            public final kxe a(kxe kxe) {
                akcr.b(kxe, "other");
                return i.a((kxe) this, kxe);
            }
        }

        public static kxe a(kxe kxe, ajdp<Boolean> ajdp) {
            akcr.b(ajdp, "condition");
            return new a(kxe, ajdp);
        }

        public static kxe a(kxe kxe, kxe kxe2) {
            akcr.b(kxe2, "other");
            return new b(kxe, kxe2);
        }
    }

    /* renamed from: kxe$v */
    public static final class v implements kxe {
        final mwe a;
        final ajdp<lqf> b;
        private final ajdj<mhs.b> c;

        /* renamed from: kxe$v$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ v a;

            a(v vVar) {
                this.a = vVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mhs.b bVar = (mhs.b) obj;
                akcr.b(bVar, "identifier");
                return kxg.a(this.a.b).p(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        akcr.b((ajxm) obj, "it");
                        return bVar;
                    }
                });
            }
        }

        /* renamed from: kxe$v$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ v a;
            private /* synthetic */ lqh b;

            b(v vVar, lqh lqh) {
                this.a = vVar;
                this.b = lqh;
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.mhs.b bVar = (defpackage.mhs.b) obj;
                akcr.b(bVar, "it");
                return new u(this.a.a, bVar).a(this.b);
            }
        }

        public v(mwe mwe, ajdj<mhs.b> ajdj, ajdp<lqf> ajdp) {
            akcr.b(mwe, "lensRepository");
            akcr.b(ajdj, "permanentLens");
            akcr.b(ajdp, "cameraLifecycle");
            this.a = mwe;
            this.c = ajdj;
            this.b = ajdp;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object u = this.c.b((ajfc) new a(this)).u(new b(this, lqh));
            akcr.a(u, "permanentLens.flatMapObs…).attach(cameraUseCase) }");
            return u;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.v;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.kxe.v) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$v.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mwe mwe = this.a;
            int i = 0;
            int hashCode = (mwe != null ? mwe.hashCode() : 0) * 31;
            ajdj ajdj = this.c;
            hashCode = (hashCode + (ajdj != null ? ajdj.hashCode() : 0)) * 31;
            ajdp ajdp = this.b;
            if (ajdp != null) {
                i = ajdp.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithPermanentLensOnCameraOpen(lensRepository=");
            stringBuilder.append(this.a);
            stringBuilder.append(", permanentLens=");
            stringBuilder.append(this.c);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$t */
    public static final class t implements kxe {
        final mwe a;
        private final ajdp<Object> b;
        private final ajdp<lqf> c;

        /* renamed from: kxe$t$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ t a;
            private /* synthetic */ lqh b;

            a(t tVar, lqh lqh) {
                this.a = tVar;
                this.b = lqh;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajxm) obj, "it");
                return new s(this.a.a).a(this.b);
            }
        }

        public t(mwe mwe, ajdp<Object> ajdp, ajdp<lqf> ajdp2) {
            akcr.b(mwe, "lensRepository");
            akcr.b(ajdp, "activationSignal");
            akcr.b(ajdp2, "cameraLifecycle");
            this.a = mwe;
            this.b = ajdp;
            this.c = ajdp2;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object d = this.c.d((ajdt) this.b);
            akcr.a(d, "cameraLifecycle\n        …ription(activationSignal)");
            Object u = kxg.a(d).u(new a(this, lqh));
            akcr.a(u, "cameraLifecycle\n        …se)\n                    }");
            return u;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.t;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.kxe.t) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$t.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mwe mwe = this.a;
            int i = 0;
            int hashCode = (mwe != null ? mwe.hashCode() : 0) * 31;
            ajdp ajdp = this.b;
            hashCode = (hashCode + (ajdp != null ? ajdp.hashCode() : 0)) * 31;
            ajdp = this.c;
            if (ajdp != null) {
                i = ajdp.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithFirstAvailableLensOnCameraOpen(lensRepository=");
            stringBuilder.append(this.a);
            stringBuilder.append(", activationSignal=");
            stringBuilder.append(this.b);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$w */
    public static final class w implements kxe {
        final mwe a;
        final ajdp<lqf> b;
        private final ajdp<mhs.b> c;

        /* renamed from: kxe$w$a */
        static final class a<T, R> implements ajfc<T, ajdt<U>> {
            private /* synthetic */ w a;

            a(w wVar) {
                this.a = wVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((mhs.b) obj, "it");
                obj = this.a.b.b(lqf.b.class);
                akcr.a(obj, "ofType(R::class.java)");
                return obj;
            }
        }

        /* renamed from: kxe$w$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ w a;
            private /* synthetic */ lqh b;

            b(w wVar, lqh lqh) {
                this.a = wVar;
                this.b = lqh;
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.mhs.b bVar = (defpackage.mhs.b) obj;
                akcr.b(bVar, "it");
                return new u(this.a.a, bVar).a(this.b);
            }
        }

        public w(mwe mwe, ajdp<mhs.b> ajdp, ajdp<lqf> ajdp2) {
            akcr.b(mwe, "lensRepository");
            akcr.b(ajdp, "selectedLens");
            akcr.b(ajdp2, "cameraLifecycle");
            this.a = mwe;
            this.c = ajdp;
            this.b = ajdp2;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object u = this.c.i((ajfc) new a(this)).u(new b(this, lqh));
            akcr.a(u, "selectedLens.delay { cam…).attach(cameraUseCase) }");
            return u;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.w;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.kxe.w) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$w.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mwe mwe = this.a;
            int i = 0;
            int hashCode = (mwe != null ? mwe.hashCode() : 0) * 31;
            ajdp ajdp = this.c;
            hashCode = (hashCode + (ajdp != null ? ajdp.hashCode() : 0)) * 31;
            ajdp = this.b;
            if (ajdp != null) {
                i = ajdp.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithSelectedLensOnCameraOpen(lensRepository=");
            stringBuilder.append(this.a);
            stringBuilder.append(", selectedLens=");
            stringBuilder.append(this.c);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$j */
    public static final class j implements kxe {
        final ajdp<lqf> a;
        private final ajdp<Object> b;

        /* renamed from: kxe$j$c */
        static final class c<T, R> implements ajfc<T, R> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "it");
                return new a.a.a("IdleOnCameraOpen", 3);
            }
        }

        /* renamed from: kxe$j$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: kxe$j$b */
        static final class b<T, R> implements ajfc<T, ajdt<U>> {
            private /* synthetic */ j a;

            /* renamed from: kxe$j$b$1 */
            static final class 1<T> implements ajfl<lqf> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ boolean test(Object obj) {
                    lqf lqf = (lqf) obj;
                    akcr.b(lqf, "it");
                    return lqf instanceof defpackage.lqf.b.b;
                }
            }

            b(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "<anonymous parameter 0>");
                return this.a.a.a((ajfl) 1.a);
            }
        }

        static {
            a aVar = new a();
        }

        public j(ajdp<Object> ajdp, ajdp<lqf> ajdp2) {
            akcr.b(ajdp, "activationSignal");
            akcr.b(ajdp2, "cameraLifecycle");
            this.b = ajdp;
            this.a = ajdp2;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object p = this.b.i((ajfc) new b(this)).p(c.a);
            akcr.a(p, "activationSignal\n       …ctivate.Idle(tag = TAG) }");
            return p;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.a, r3.a) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.j;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.j) r3;
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.a;
            r3 = r3.a;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$j.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.b;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            ajdp ajdp2 = this.a;
            if (ajdp2 != null) {
                i = ajdp2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("IdleOnCameraOpen(activationSignal=");
            stringBuilder.append(this.b);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$e */
    public static final class e implements kxe {
        private final ajdp<lqf> a;

        /* renamed from: kxe$e$a */
        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                lqf lqf = (lqf) obj;
                akcr.b(lqf, "it");
                return Boolean.valueOf(lqf instanceof lqf.b);
            }
        }

        /* renamed from: kxe$e$b */
        static final class b<T> implements ajfl<Boolean> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "opened");
                return !bool.booleanValue();
            }
        }

        /* renamed from: kxe$e$c */
        static final class c<T, R> implements ajfc<T, R> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Boolean) obj, "it");
                return a.b.a;
            }
        }

        public e(ajdp<lqf> ajdp) {
            akcr.b(ajdp, "cameraLifecycle");
            this.a = ajdp;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object p = this.a.p(a.a).a((ajfl) b.a).p(c.a);
            akcr.a(p, "cameraLifecycle\n        …eCase.Action.Deactivate }");
            return p;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.kxe.e) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kxe.e;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kxe.e) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$e.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            return ajdp != null ? ajdp.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("DeactivateOnCameraClose(cameraLifecycle=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$c */
    public static final class c implements kxe {
        final ajxe a = ajxh.a(new d(this));
        final mhi<? extends mha> b;

        /* renamed from: kxe$c$a */
        static final class a<T1, T2> implements ajey<lqh.b, lqh.b> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ boolean test(Object obj, Object obj2) {
                lqh.b bVar = (lqh.b) obj;
                obj2 = (lqh.b) obj2;
                akcr.b(bVar, "old");
                akcr.b(obj2, "new");
                if (bVar instanceof defpackage.lqh.b.a) {
                    return obj2 instanceof defpackage.lqh.b.a;
                }
                if (bVar instanceof lqh.b.b) {
                    return akcr.a(obj2, lqh.b.b.a);
                }
                throw new ajxk();
            }
        }

        /* renamed from: kxe$c$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            b(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                defpackage.lqh.b bVar = (defpackage.lqh.b) obj;
                akcr.b(bVar, "it");
                if (bVar instanceof defpackage.lqh.b.a) {
                    return ((mha) this.a.a.b()).b();
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "Observable.empty()");
                return obj;
            }
        }

        /* renamed from: kxe$c$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "it");
                return ajvo.a(ajot.a);
            }
        }

        /* renamed from: kxe$c$d */
        static final class d extends akcs implements akbk<mha> {
            private /* synthetic */ c a;

            d(c cVar) {
                this.a = cVar;
                super(0);
            }

            private mha a() {
                return (mha) this.a.b.a();
            }

            public final /* synthetic */ Object invoke() {
                return a();
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(c.class), "userComponent", "getUserComponent()Lcom/snap/lenses/common/Attachable;");
        }

        public c(mhi<? extends mha> mhi) {
            akcr.b(mhi, "componentBuilder");
            this.b = mhi;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object u = lqh.b().a((ajey) a.a).u(new b(this)).u(c.a);
            akcr.a(u, "cameraUseCase.outputs\n  …>()\n                    }");
            return u;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.b, ((defpackage.kxe.c) r2).b) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kxe.c;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kxe.c) r2;
            r0 = r1.b;
            r2 = r2.b;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mhi mhi = this.b;
            return mhi != null ? mhi.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AttachComponentWhenActivated(componentBuilder=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$a */
    public static final class a implements kxe {
        private final ajdp<ebs> a;
        private final ajdp<ebk> b;
        private final kqf c;

        /* renamed from: kxe$a$d */
        static final class d<T, R> implements ajfc<T, R> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                ebk ebk = (ebk) obj;
                akcr.b(ebk, "it");
                return Optional.of(ebk);
            }
        }

        /* renamed from: kxe$a$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lqh.b.a;
            }
        }

        /* renamed from: kxe$a$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final b a = new b();

            b() {
            }

            /* JADX WARNING: Missing block: B:10:0x0037, code skipped:
            r3 = defpackage.ajdp.b(r3);
     */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
                /*
                r2 = this;
                r3 = (defpackage.ajxm) r3;
                r0 = "it";
                defpackage.akcr.b(r3, r0);
                r0 = r3.a;
                r0 = (defpackage.ebs) r0;
                r1 = defpackage.ebs.d.b;
                r1 = defpackage.akcr.a(r0, r1);
                if (r1 == 0) goto L_0x0048;
            L_0x0013:
                r3 = r3.b;
                r3 = (com.google.common.base.Optional) r3;
                r3 = r3.orNull();
                r3 = (defpackage.ebk) r3;
                if (r3 != 0) goto L_0x0020;
            L_0x001f:
                goto L_0x003c;
            L_0x0020:
                r0 = defpackage.kxf.a;
                r3 = r3.ordinal();
                r3 = r0[r3];
                switch(r3) {
                    case 1: goto L_0x0035;
                    case 2: goto L_0x0032;
                    case 3: goto L_0x0032;
                    case 4: goto L_0x0032;
                    case 5: goto L_0x002f;
                    case 6: goto L_0x002c;
                    case 7: goto L_0x003c;
                    default: goto L_0x002b;
                };
            L_0x002b:
                goto L_0x003c;
            L_0x002c:
                r3 = defpackage.kqe.h.b;
                goto L_0x0037;
            L_0x002f:
                r3 = defpackage.kqe.y.b;
                goto L_0x0037;
            L_0x0032:
                r3 = defpackage.kqe.aj.b;
                goto L_0x0037;
            L_0x0035:
                r3 = defpackage.kqe.g.b;
            L_0x0037:
                r3 = defpackage.ajdp.b(r3);
                goto L_0x0042;
            L_0x003c:
                r3 = defpackage.ajot.a;
                r3 = defpackage.ajvo.a(r3);
            L_0x0042:
                r0 = "when (it.second.orNull()…                        }";
            L_0x0044:
                defpackage.akcr.a(r3, r0);
                return r3;
            L_0x0048:
                r3 = r0 instanceof defpackage.ebs.a;
                if (r3 == 0) goto L_0x0055;
            L_0x004c:
                r3 = defpackage.kqe.ai.b;
                r3 = defpackage.ajdp.b(r3);
                r0 = "just(AnalyticsEvent.OnStreamingEnded)";
                goto L_0x0044;
            L_0x0055:
                r3 = defpackage.ajot.a;
                r3 = defpackage.ajvo.a(r3);
                r0 = "empty()";
                goto L_0x0044;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$a$b.apply(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: kxe$a$c */
        static final class c extends akcq implements akbl<kqe, ajxw> {
            c(kqf kqf) {
                super(1, kqf);
            }

            public final String getName() {
                return "handle";
            }

            public final akej getOwner() {
                return akde.a(kqf.class);
            }

            public final String getSignature() {
                return "handle(Lcom/snap/lenses/analytics/AnalyticsEvent;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                kqe kqe = (kqe) obj;
                akcr.b(kqe, "p1");
                ((kqf) this.receiver).a(kqe);
                return ajxw.a;
            }
        }

        public a(ajdp<ebs> ajdp, ajdp<ebk> ajdp2, kqf kqf) {
            akcr.b(ajdp, "streamingStateObservable");
            akcr.b(ajdp2, "captureStateObservable");
            akcr.b(kqf, "analyticsEventHandler");
            this.a = ajdp;
            this.b = ajdp2;
            this.c = kqf;
        }

        public final ajdp<defpackage.lqh.a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object h = this.b.p(d.a).h(Optional.absent());
            ajdp ajdp = this.a;
            akcr.a(h, "optionalCaptureStateObservable");
            ajdp a = myu.a(ajdp, h);
            Object a2 = lqh.b().a((ajfl) a.a).a(defpackage.lqh.b.a.class);
            akcr.a(a2, "this.filter { it is R }.cast(R::class.java)");
            ajdp d = a.d((ajdt) a2).u(b.a).j(ajfu.a).d((ajfb) new kxh(new c(this.c)));
            akcr.a((Object) d, "pairLatest(streamingStat…ticsEventHandler::handle)");
            return myu.a(d);
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.kxe.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            ajdp ajdp2 = this.b;
            hashCode = (hashCode + (ajdp2 != null ? ajdp2.hashCode() : 0)) * 31;
            kqf kqf = this.c;
            if (kqf != null) {
                i = kqf.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AnalyticsCameraLifecycle(streamingStateObservable=");
            stringBuilder.append(this.a);
            stringBuilder.append(", captureStateObservable=");
            stringBuilder.append(this.b);
            stringBuilder.append(", analyticsEventHandler=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$q */
    public static final class q implements kxe {
        final kqf a;
        private final miw b;

        /* renamed from: kxe$q$a */
        static final class a<T> implements ajfb<Long> {
            private /* synthetic */ q a;

            a(q qVar) {
                this.a = qVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (Long) obj;
                kqf kqf = this.a.a;
                akcr.a(obj, "it");
                kqf.a(new j(obj.longValue()));
            }
        }

        public q(miw miw, kqf kqf) {
            akcr.b(miw, "configurationRepository");
            akcr.b(kqf, "analyticsEventHandler");
            this.b = miw;
            this.a = kqf;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            ajdp d = this.b.a(miw.b.a.a).e(mja.DEVICE_CLUSTER).d((ajfb) new a(this));
            akcr.a((Object) d, "configurationRepository.…OnDeviceClusterSet(it)) }");
            return myu.a(d);
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.a, r3.a) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.q;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.q) r3;
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.a;
            r3 = r3.a;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$q.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            miw miw = this.b;
            int i = 0;
            int hashCode = (miw != null ? miw.hashCode() : 0) * 31;
            kqf kqf = this.a;
            if (kqf != null) {
                i = kqf.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithDeviceCluster(configurationRepository=");
            stringBuilder.append(this.b);
            stringBuilder.append(", analyticsEventHandler=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$r */
    public static final class r implements kxe {
        final ajdv<Boolean> a;
        final mwe b;

        /* renamed from: kxe$r$b */
        static final class b extends akcs implements akbk<ajvl<Boolean>> {
            final /* synthetic */ r a;
            private /* synthetic */ lqh b;

            /* renamed from: kxe$r$b$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ b a;

                /* renamed from: kxe$r$b$1$1 */
                static final class 1<T> implements ajfl<List<? extends mux>> {
                    public static final 1 a = new 1();

                    1() {
                    }

                    public final /* synthetic */ boolean test(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "it");
                        return !((Collection) list).isEmpty();
                    }
                }

                /* renamed from: kxe$r$b$1$2 */
                static final class 2<T, R> implements ajfc<T, R> {
                    public static final 2 a = new 2();

                    2() {
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        akcr.b(list, "it");
                        return Boolean.valueOf(((mux) ajyu.f(list)).t == null);
                    }
                }

                1(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    defpackage.lqh.b bVar = (defpackage.lqh.b) obj;
                    akcr.b(bVar, "it");
                    if (bVar instanceof defpackage.lqh.b.a.c) {
                        ajdp j = this.a.a.b.a(new defpackage.mwe.a.b(((defpackage.lqh.b.a.c) bVar).a)).b((ajfl) 1.a).h().d((ajfc) 2.a).j();
                        akcr.a((Object) j, "lensRepository.query(Len…          .toObservable()");
                        return mip.a(j, "WithDisabledForSnappablesObserver#query");
                    }
                    obj = ajdp.b(Boolean.TRUE);
                    akcr.a(obj, "just(true)");
                    return obj;
                }
            }

            b(r rVar, lqh lqh) {
                this.a = rVar;
                this.b = lqh;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return (ajvl) this.b.b().u(new 1(this)).c((ajdv) new ajvl(this.a.a));
            }
        }

        /* renamed from: kxe$r$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public r(ajdv<Boolean> ajdv, mwe mwe) {
            akcr.b(ajdv, "observer");
            akcr.b(mwe, "lensRepository");
            this.a = ajdv;
            this.b = mwe;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            return myu.a(myu.b((akbk) new b(this, lqh)));
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.r;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.r) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$r.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdv ajdv = this.a;
            int i = 0;
            int hashCode = (ajdv != null ? ajdv.hashCode() : 0) * 31;
            mwe mwe = this.b;
            if (mwe != null) {
                i = mwe.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithDisabledForSnappablesObserver(observer=");
            stringBuilder.append(this.a);
            stringBuilder.append(", lensRepository=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$d */
    public static final class d implements kxe {
        final ajxe a = ajxh.a(new e(this));
        final ajdp<lqf> b;
        final mhi<? extends mha> c;
        private final zfw d;

        /* renamed from: kxe$d$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof b.b;
            }
        }

        /* renamed from: kxe$d$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ d a;

            b(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.lqf.b.b.b) obj, "it");
                return ((mha) this.a.a.b()).b();
            }
        }

        /* renamed from: kxe$d$c */
        static final class c<T> implements ajfl<lqf> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                lqf lqf = (lqf) obj;
                akcr.b(lqf, "it");
                return lqf instanceof lqf.a;
            }
        }

        /* renamed from: kxe$d$d */
        static final class d<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
            private /* synthetic */ d a;

            /* renamed from: kxe$d$d$1 */
            static final class 1<T> implements ajfl<lqf> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ boolean test(Object obj) {
                    lqf lqf = (lqf) obj;
                    akcr.b(lqf, "it");
                    return lqf instanceof lqf.b;
                }
            }

            d(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajdp) obj, "<anonymous parameter 0>");
                return this.a.b.a((ajfl) 1.a);
            }
        }

        /* renamed from: kxe$d$e */
        static final class e extends akcs implements akbk<mha> {
            private /* synthetic */ d a;

            e(d dVar) {
                this.a = dVar;
                super(0);
            }

            private mha a() {
                return (mha) this.a.c.a();
            }

            public final /* synthetic */ Object invoke() {
                return a();
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(d.class), "component", "getComponent()Lcom/snap/lenses/common/Attachable;");
        }

        public d(ajdp<lqf> ajdp, mhi<? extends mha> mhi, zfw zfw) {
            akcr.b(ajdp, "cameraLifecycle");
            akcr.b(mhi, "componentBuilder");
            akcr.b(zfw, "qualifiedSchedulers");
            this.b = ajdp;
            this.c = mhi;
            this.d = zfw;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object a = this.b.a((ajfl) a.a).a(b.b.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            ajdp t = a.c(1).a((ajdw) this.d.h()).u(new b(this)).j((ajdt) this.b.a((ajfl) c.a)).t(new d(this));
            akcr.a((Object) t, "cameraLifecycle\n        …ameraLifecycle.Opened } }");
            return myu.a(t);
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.d;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.kxe.d) r3;
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.d;
            r3 = r3.d;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.b;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            mhi mhi = this.c;
            hashCode = (hashCode + (mhi != null ? mhi.hashCode() : 0)) * 31;
            zfw zfw = this.d;
            if (zfw != null) {
                i = zfw.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AttachComponentWhenCameraOpened(cameraLifecycle=");
            stringBuilder.append(this.b);
            stringBuilder.append(", componentBuilder=");
            stringBuilder.append(this.c);
            stringBuilder.append(", qualifiedSchedulers=");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$b */
    public static final class b implements kxe {
        final mhi<? extends mha> a;
        private final ajxe b = ajxh.a(new a(this));

        /* renamed from: kxe$b$a */
        static final class a extends akcs implements akbk<mha> {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
                super(0);
            }

            private mha a() {
                return (mha) this.a.a.a();
            }

            public final /* synthetic */ Object invoke() {
                return a();
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(b.class), "component", "getComponent()Lcom/snap/lenses/common/Attachable;");
        }

        public b(mhi<? extends mha> mhi) {
            akcr.b(mhi, "componentBuilder");
            this.a = mhi;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            return myu.a(((mha) this.b.b()).b());
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.kxe.b) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kxe.b;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kxe.b) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mhi mhi = this.a;
            return mhi != null ? mhi.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("AttachComponentImmediately(componentBuilder=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$g */
    public static final class g implements kxe {
        private final ajdp<achi<zjm, zjk>> a;

        /* renamed from: kxe$g$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                achi achi = (achi) obj;
                akcr.b(achi, "navigationEvent");
                return (akcr.a(((zjm) achi.e.e()).b(), (Object) "Preview") && akcr.a(((zjm) achi.f.e()).b(), (Object) "Camera") && !achi.j) ? ajdp.b(defpackage.lqh.a.b.a) : ajvo.a(ajot.a);
            }
        }

        public g(ajdp<achi<zjm, zjk>> ajdp) {
            akcr.b(ajdp, "navigationEventObservable");
            this.a = ajdp;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object u = this.a.u(a.a);
            akcr.a(u, "navigationEventObservabl…  }\n                    }");
            return u;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.kxe.g) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kxe.g;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kxe.g) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$g.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            return ajdp != null ? ajdp.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("DeactivateOnEnteringCameraFromPreviewAsNotLastNavigable(navigationEventObservable=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$m */
    public static final class m implements kxe {
        final mni a;
        final lkn b;

        /* renamed from: kxe$m$b */
        static final class b<T> implements ajfl<defpackage.lqh.b> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                defpackage.lqh.b bVar = (defpackage.lqh.b) obj;
                akcr.b(bVar, "it");
                return bVar instanceof defpackage.lqh.b.a;
            }
        }

        /* renamed from: kxe$m$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ m a;

            /* renamed from: kxe$m$c$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ c a;

                1(c cVar) {
                    this.a = cVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    mnk mnk = (mnk) obj;
                    akcr.b(mnk, "status");
                    return mnk instanceof mnk.b ? ajvo.a(ajot.a) : this.a.a.b.a(lkn.b.a.a).h();
                }
            }

            c(m mVar) {
                this.a = mVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                lqh.b bVar = (lqh.b) obj;
                akcr.b(bVar, "result");
                return bVar instanceof lqh.b.a ? this.a.a.a().d((ajfc) new 1(this)) : ajvo.a(ajot.a);
            }
        }

        /* renamed from: kxe$m$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public m(mni mni, lkn lkn) {
            akcr.b(mni, "nativeSupportAssessor");
            akcr.b(lkn, "notifier");
            this.a = mni;
            this.b = lkn;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object c = lqh.b().a((ajfl) b.a).c(1);
            akcr.a(c, "cameraUseCase.outputs\n  …                 .take(1)");
            ajdp u = mip.c(c, "NotifyWhenNativeSupportIsNotAvailable:downstream").u(new c(this));
            akcr.a((Object) u, "cameraUseCase.outputs\n  …  }\n                    }");
            return myu.a(u);
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.m;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.m) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$m.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mni mni = this.a;
            int i = 0;
            int hashCode = (mni != null ? mni.hashCode() : 0) * 31;
            lkn lkn = this.b;
            if (lkn != null) {
                i = lkn.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("NotifyWhenNativeSupportIsNotAvailable(nativeSupportAssessor=");
            stringBuilder.append(this.a);
            stringBuilder.append(", notifier=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$l */
    public static final class l implements kxe {
        final ajdp<mmt> a;
        final ajdp<achi<zjm, zjk>> b;

        /* renamed from: kxe$l$b */
        public static final class b<T1, T2> implements ajey<defpackage.lqh.b, defpackage.lqh.b> {
            public static final b a = new b();

            public final /* synthetic */ boolean test(Object obj, Object obj2) {
                defpackage.lqh.b bVar = (defpackage.lqh.b) obj;
                obj2 = (defpackage.lqh.b) obj2;
                akcr.b(bVar, "old");
                akcr.b(obj2, "new");
                if (bVar instanceof defpackage.lqh.b.a) {
                    return obj2 instanceof defpackage.lqh.b.a;
                }
                if (bVar instanceof defpackage.lqh.b.b) {
                    return akcr.a(obj2, defpackage.lqh.b.b.a);
                }
                throw new ajxk();
            }
        }

        /* renamed from: kxe$l$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ l a;

            /* renamed from: kxe$l$c$1 */
            static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
                private /* synthetic */ c a;

                1(c cVar) {
                    this.a = cVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    achi achi = (achi) obj;
                    akcr.b(achi, "navigationEvent");
                    final mjh.a aVar = (akcr.a(((zjm) achi.f.e()).b(), (Object) "Camera") ^ 1) != 0 ? mjh.a.a.b.c : mjh.a.b.b.c;
                    return this.a.a.a.u(new ajfc<T, ajdt<? extends R>>() {
                        public final /* synthetic */ Object apply(Object obj) {
                            mmt mmt = (mmt) obj;
                            akcr.b(mmt, "it");
                            ajdp i = mmt.c().b().b(aVar).i();
                            akcr.a((Object) i, "it.audioPlayer.volume\n  …          .toObservable()");
                            return myu.a(i);
                        }
                    });
                }
            }

            c(l lVar) {
                this.a = lVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                lqh.b bVar = (lqh.b) obj;
                akcr.b(bVar, "result");
                return bVar instanceof lqh.b.a ? this.a.b.u(new 1(this)) : ajvo.a(ajot.a);
            }
        }

        /* renamed from: kxe$l$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public l(ajdp<mmt> ajdp, ajdp<achi<zjm, zjk>> ajdp2) {
            akcr.b(ajdp, "lensCore");
            akcr.b(ajdp2, "navigationEvents");
            this.a = ajdp;
            this.b = ajdp2;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object a = lqh.b().a((ajey) b.a);
            akcr.a(a, "distinctUntilChanged { o…activated\n        }\n    }");
            a = mip.c(a, "MuteAudioWhenNavigatingOutOfCamera:downstream").u(new c(this));
            akcr.a(a, "cameraUseCase.outputs.wh…  }\n                    }");
            return a;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.l;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.l) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$l.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            ajdp ajdp2 = this.b;
            if (ajdp2 != null) {
                i = ajdp2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("MuteAudioWhenNavigatingOutOfCamera(lensCore=");
            stringBuilder.append(this.a);
            stringBuilder.append(", navigationEvents=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$o */
    public static final class o implements kxe {
        private final ajdp<Point> a;
        private final ajdp<lqf> b;

        public o(ajdp<Point> ajdp, ajdp<lqf> ajdp2) {
            akcr.b(ajdp, "singleTapObservable");
            akcr.b(ajdp2, "cameraLifecycle");
            this.a = ajdp;
            this.b = ajdp2;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object b = ajdp.b((ajdt) new n(this.a, this.b).a(lqh), (ajdt) new p(this.a).a(lqh));
            akcr.a(b, "Observable.merge(\n      …e).attach(cameraUseCase))");
            return b;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.o;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.o) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$o.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            ajdp ajdp2 = this.b;
            if (ajdp2 != null) {
                i = ajdp2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("TapToActivateAndRestart(singleTapObservable=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$n */
    public static final class n implements kxe {
        final ajdp<Point> a;
        private final ajdp<lqf> b;

        /* renamed from: kxe$n$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: kxe$n$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ lqh a;
            private /* synthetic */ n b;

            /* renamed from: kxe$n$b$a */
            public static final class a<T> implements ajfl<Object> {
                public static final a a = new a();

                public final boolean test(Object obj) {
                    akcr.b(obj, "it");
                    return obj instanceof defpackage.lqh.b.a;
                }
            }

            /* renamed from: kxe$n$b$1 */
            static final class 1<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
                private /* synthetic */ b a;

                /* renamed from: kxe$n$b$1$a */
                public static final class a<T> implements ajfl<Object> {
                    public static final a a = new a();

                    public final boolean test(Object obj) {
                        akcr.b(obj, "it");
                        return obj instanceof defpackage.lqh.b.b;
                    }
                }

                1(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((ajdp) obj, "<anonymous parameter 0>");
                    obj = this.a.a.b().a((ajfl) a.a).a(defpackage.lqh.b.b.class);
                    akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
                    return obj;
                }
            }

            /* renamed from: kxe$n$b$2 */
            static final class 2<T, R> implements ajfc<T, R> {
                public static final 2 a = new 2();

                2() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    Point point = (Point) obj;
                    akcr.b(point, "it");
                    return new a.a.a(point.x, point.y, "TapToActivate");
                }
            }

            b(n nVar, lqh lqh) {
                this.b = nVar;
                this.a = lqh;
            }

            public final /* synthetic */ Object apply(Object obj) {
                lqf lqf = (lqf) obj;
                akcr.b(lqf, "it");
                if (!(lqf instanceof defpackage.lqf.b.b.b)) {
                    return ajvo.a(ajot.a);
                }
                ajdp c = this.b.a.c(1);
                Object a = this.a.b().a((ajfl) a.a).a(defpackage.lqh.b.a.class);
                akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
                return c.j((ajdt) a).t(new 1(this)).p(2.a);
            }
        }

        static {
            a aVar = new a();
        }

        public n(ajdp<Point> ajdp, ajdp<lqf> ajdp2) {
            akcr.b(ajdp, "singleTapObservable");
            akcr.b(ajdp2, "cameraLifecycle");
            this.a = ajdp;
            this.b = ajdp2;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object u = this.b.u(new b(this, lqh));
            akcr.a(u, "cameraLifecycle\n        …  }\n                    }");
            return u;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.n;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.n) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$n.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            ajdp ajdp2 = this.b;
            if (ajdp2 != null) {
                i = ajdp2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("TapToActivate(singleTapObservable=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$p */
    public static final class p implements kxe {
        private final ajdp<Point> a;

        /* renamed from: kxe$p$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lqh.b.a;
            }
        }

        /* renamed from: kxe$p$b */
        public static final class b<T> implements ajfl<Object> {
            public static final b a = new b();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.lqh.b.b;
            }
        }

        /* renamed from: kxe$p$c */
        static final class c<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
            private /* synthetic */ lqh a;

            /* renamed from: kxe$p$c$a */
            public static final class a<T> implements ajfl<Object> {
                public static final a a = new a();

                public final boolean test(Object obj) {
                    akcr.b(obj, "it");
                    return obj instanceof defpackage.lqh.b.a;
                }
            }

            c(lqh lqh) {
                this.a = lqh;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajdp) obj, "<anonymous parameter 0>");
                obj = this.a.b().a((ajfl) a.a).a(lqh.b.a.class);
                akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
                return obj;
            }
        }

        /* renamed from: kxe$p$d */
        static final class d<T, R> implements ajfc<T, R> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Point point = (Point) obj;
                akcr.b(point, "it");
                return new a.c(point.x, point.y);
            }
        }

        public p(ajdp<Point> ajdp) {
            akcr.b(ajdp, "singleTapObservable");
            this.a = ajdp;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            ajdp ajdp = this.a;
            Object a = lqh.b().a((ajfl) a.a).a(lqh.b.a.class);
            String str = "this.filter { it is R }.cast(R::class.java)";
            akcr.a(a, str);
            ajdp = ajdp.g((ajdt) a);
            a = lqh.b().a((ajfl) b.a).a(lqh.b.b.class);
            akcr.a(a, str);
            Object p = ajdp.j((ajdt) a).t(new c(lqh)).p(d.a);
            akcr.a(p, "singleTapObservable\n    …ion.Restart(it.x, it.y) }");
            return p;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.kxe.p) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kxe.p;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kxe.p) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$p.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            return ajdp != null ? ajdp.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("TapToRestart(singleTapObservable=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$k */
    public static final class k implements kxe {
        final ajdp<ebn> a;
        private final ajdp<lqf> b;

        /* renamed from: kxe$k$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: kxe$k$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ lqh a;
            private /* synthetic */ k b;

            /* renamed from: kxe$k$b$1 */
            static final class 1<T> implements ajfl<ebn> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ boolean test(Object obj) {
                    ebn ebn = (ebn) obj;
                    akcr.b(ebn, "it");
                    return ebn.a == ebn.a.START;
                }
            }

            /* renamed from: kxe$k$b$a */
            public static final class a<T> implements ajfl<Object> {
                public static final a a = new a();

                public final boolean test(Object obj) {
                    akcr.b(obj, "it");
                    return obj instanceof defpackage.lqh.b.a;
                }
            }

            /* renamed from: kxe$k$b$2 */
            static final class 2<T, R> implements ajfc<ajdp<Object>, ajdt<?>> {
                private /* synthetic */ b a;

                /* renamed from: kxe$k$b$2$a */
                public static final class a<T> implements ajfl<Object> {
                    public static final a a = new a();

                    public final boolean test(Object obj) {
                        akcr.b(obj, "it");
                        return obj instanceof defpackage.lqh.b.b;
                    }
                }

                2(b bVar) {
                    this.a = bVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((ajdp) obj, "<anonymous parameter 0>");
                    obj = this.a.a.b().a((ajfl) a.a).a(defpackage.lqh.b.b.class);
                    akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
                    return obj;
                }
            }

            /* renamed from: kxe$k$b$3 */
            static final class 3<T, R> implements ajfc<T, R> {
                public static final 3 a = new 3();

                3() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    ebn ebn = (ebn) obj;
                    akcr.b(ebn, "it");
                    return new a.a.a(ebn.b.x, ebn.b.y, "LongPressToActivate");
                }
            }

            b(k kVar, lqh lqh) {
                this.b = kVar;
                this.a = lqh;
            }

            public final /* synthetic */ Object apply(Object obj) {
                lqf lqf = (lqf) obj;
                akcr.b(lqf, "it");
                if (!(lqf instanceof defpackage.lqf.b.b.b)) {
                    return ajvo.a(ajot.a);
                }
                ajdp c = this.b.a.a((ajfl) 1.a).c(1);
                Object a = this.a.b().a((ajfl) a.a).a(defpackage.lqh.b.a.class);
                akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
                return c.j((ajdt) a).t(new 2(this)).p(3.a);
            }
        }

        static {
            a aVar = new a();
        }

        public k(ajdp<ebn> ajdp, ajdp<lqf> ajdp2) {
            akcr.b(ajdp, "longPressUpdateObservable");
            akcr.b(ajdp2, "cameraLifecycle");
            this.a = ajdp;
            this.b = ajdp2;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            Object u = this.b.u(new b(this, lqh));
            akcr.a(u, "cameraLifecycle\n        …  }\n                    }");
            return u;
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.k;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.k) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$k.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            ajdp ajdp = this.a;
            int i = 0;
            int hashCode = (ajdp != null ? ajdp.hashCode() : 0) * 31;
            ajdp ajdp2 = this.b;
            if (ajdp2 != null) {
                i = ajdp2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("LongPressToActivate(longPressUpdateObservable=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cameraLifecycle=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$s */
    public static final class s implements kxe {
        private final mwe a;

        /* renamed from: kxe$s$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public s(mwe mwe) {
            akcr.b(mwe, "lensRepository");
            this.a = mwe;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            return kxg.a(this.a, mwe.a.a.a, "WithFirstAvailableLens");
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.kxe.s) r2).a) != false) goto L_0x0015;
     */
        public final boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof defpackage.kxe.s;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (defpackage.kxe.s) r2;
            r0 = r1.a;
            r2 = r2.a;
            r2 = defpackage.akcr.a(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$s.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mwe mwe = this.a;
            return mwe != null ? mwe.hashCode() : 0;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithFirstAvailableLens(lensRepository=");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: kxe$u */
    public static final class u implements kxe {
        private final mwe a;
        private final mhs.b b;

        /* renamed from: kxe$u$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            a aVar = new a();
        }

        public u(mwe mwe, mhs.b bVar) {
            akcr.b(mwe, "lensRepository");
            akcr.b(bVar, "id");
            this.a = mwe;
            this.b = bVar;
        }

        public final ajdp<a> a(lqh lqh) {
            akcr.b(lqh, "cameraUseCase");
            return kxg.a(this.a, new mwe.a.b(this.b), "WithLensById");
        }

        public final kxe a(kxe kxe) {
            akcr.b(kxe, "other");
            return i.a((kxe) this, kxe);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.kxe.u;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.kxe.u) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe$u.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            mwe mwe = this.a;
            int i = 0;
            int hashCode = (mwe != null ? mwe.hashCode() : 0) * 31;
            mhs.b bVar = this.b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("WithLensById(lensRepository=");
            stringBuilder.append(this.a);
            stringBuilder.append(", id=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    ajdp<a> a(lqh lqh);

    kxe a(kxe kxe);
}
