package defpackage;

import com.google.common.base.Optional;
import com.snapchat.map.egghunt.EggHuntHttpInterface;

/* renamed from: acmz */
public final class acmz {
    static final String e = e;
    static final String f = f;
    static final String g = g;
    static final String h = h;
    static final String i = i;
    static final String j = j;
    private static final String l = l;
    public final zfw a = zgb.a(adcw.b.callsite(l));
    public final ajdx<EggHuntHttpInterface> b;
    final ftl c;
    final nce d;
    private final ajxe k = ajxh.a(new c(this));

    /* renamed from: acmz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acmz$b */
    public enum b {
        SUCCESS,
        DENIED,
        NETWORK_FAILURE
    }

    /* renamed from: acmz$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ acmz a;
        final /* synthetic */ addl b;

        d(acmz acmz, addl addl) {
            this.a = acmz;
            this.b = addl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final EggHuntHttpInterface eggHuntHttpInterface = (EggHuntHttpInterface) obj;
            akcr.b(eggHuntHttpInterface, "it");
            return ((ajdx) this.a.k.b()).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ d a;

                public final /* synthetic */ Object apply(Object obj) {
                    String str = (String) obj;
                    akcr.b(str, "baseUrl");
                    EggHuntHttpInterface eggHuntHttpInterface = eggHuntHttpInterface;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(acmz.g);
                    str = stringBuilder.toString();
                    algi algi = new algi();
                    algi.a(this.a.b.a);
                    algi.a(this.a.b.c);
                    algi.a(this.a.a.d.b());
                    Object a = wjd.MAP_GAMES.a();
                    akcr.a(a, "SnapTokenAccessTokenScop…GAMES.serverSideScopeName");
                    return eggHuntHttpInterface.rpcAcquireGameMarker(str, algi, a);
                }
            });
        }
    }

    /* renamed from: acmz$f */
    public static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ acmz a;

        public f(acmz acmz) {
            this.a = acmz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final EggHuntHttpInterface eggHuntHttpInterface = (EggHuntHttpInterface) obj;
            akcr.b(eggHuntHttpInterface, "it");
            return ((ajdx) this.a.k.b()).a((ajfc) new ajfc<T, ajeb<? extends R>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    String str = (String) obj;
                    akcr.b(str, "baseUrl");
                    EggHuntHttpInterface eggHuntHttpInterface = eggHuntHttpInterface;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(acmz.j);
                    str = stringBuilder.toString();
                    alic alic = new alic();
                    Object a = wjd.MAP_GAMES.a();
                    akcr.a(a, "SnapTokenAccessTokenScop…GAMES.serverSideScopeName");
                    return eggHuntHttpInterface.rpcClearUserMarkers(str, alic, a);
                }
            });
        }
    }

    /* renamed from: acmz$g */
    public static final class g<T, R> implements ajfc<T, R> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "result");
            return Boolean.valueOf(akxa.c() ^ 1);
        }
    }

    /* renamed from: acmz$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ acmz a;

        /* renamed from: acmz$h$a */
        static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ EggHuntHttpInterface a;

            a(EggHuntHttpInterface eggHuntHttpInterface) {
                this.a = eggHuntHttpInterface;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String str = (String) obj;
                akcr.b(str, "baseUrl");
                EggHuntHttpInterface eggHuntHttpInterface = this.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(acmz.i);
                str = stringBuilder.toString();
                alic alic = new alic();
                Object a = wjd.MAP_GAMES.a();
                akcr.a(a, "SnapTokenAccessTokenScop…GAMES.serverSideScopeName");
                return eggHuntHttpInterface.rpcGetCurrentGameState(str, alic, a);
            }
        }

        h(acmz acmz) {
            this.a = acmz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            EggHuntHttpInterface eggHuntHttpInterface = (EggHuntHttpInterface) obj;
            akcr.b(eggHuntHttpInterface, "it");
            obj = ((ajdx) this.a.k.b()).a((ajfc) new a(eggHuntHttpInterface));
            akcr.a(obj, "baseUrlObservable.flatMa…  )\n                    }");
            return obj;
        }
    }

    /* renamed from: acmz$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ acmz a;

        j(acmz acmz) {
            this.a = acmz;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final EggHuntHttpInterface eggHuntHttpInterface = (EggHuntHttpInterface) obj;
            akcr.b(eggHuntHttpInterface, "it");
            return ((ajdx) this.a.k.b()).a((ajfc) new ajfc<T, ajeb<? extends R>>() {
                public final /* synthetic */ Object apply(Object obj) {
                    String str = (String) obj;
                    akcr.b(str, "baseUrl");
                    EggHuntHttpInterface eggHuntHttpInterface = eggHuntHttpInterface;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(acmz.h);
                    str = stringBuilder.toString();
                    alie alie = new alie();
                    Object a = wjd.MAP_GAMES.a();
                    akcr.a(a, "SnapTokenAccessTokenScop…GAMES.serverSideScopeName");
                    return eggHuntHttpInterface.rpcGetCurrentUserGameMarkers(str, alie, a);
                }
            });
        }
    }

    /* renamed from: acmz$c */
    static final class c extends akcs implements akbk<ajdx<String>> {
        private /* synthetic */ acmz a;

        /* renamed from: acmz$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "hitStaging");
                return bool.booleanValue() ? acmz.f : acmz.e;
            }
        }

        c(acmz acmz) {
            this.a = acmz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.p(adew.HIT_STAGING_GAME_SERVER).p(1.a).e().a();
        }
    }

    /* renamed from: acmz$e */
    static final class e extends akcq implements akbl<akxa<algj>, b> {
        e(acmz acmz) {
            super(1, acmz);
        }

        public final String getName() {
            return "unpackAcquireGameMarkerResult";
        }

        public final akej getOwner() {
            return akde.a(acmz.class);
        }

        public final String getSignature() {
            return "unpackAcquireGameMarkerResult(Lretrofit2/adapter/rxjava2/Result;)Lcom/snapchat/map/egghunt/EggHuntClient$EggAcquisitionResult;";
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r2) {
            /*
            r1 = this;
            r2 = (defpackage.akxa) r2;
            r0 = "p1";
            defpackage.akcr.b(r2, r0);
            r0 = r2.a();
            if (r0 == 0) goto L_0x001e;
        L_0x000d:
            r0 = r0.f();
            r0 = (defpackage.algj) r0;
            if (r0 == 0) goto L_0x001e;
        L_0x0015:
            r0 = r0.a();
            r0 = java.lang.Boolean.valueOf(r0);
            goto L_0x001f;
        L_0x001e:
            r0 = 0;
        L_0x001f:
            r2 = r2.c();
            if (r2 == 0) goto L_0x0028;
        L_0x0025:
            r2 = defpackage.acmz.b.NETWORK_FAILURE;
            return r2;
        L_0x0028:
            if (r0 != 0) goto L_0x002d;
        L_0x002a:
            r2 = defpackage.acmz.b.NETWORK_FAILURE;
            return r2;
        L_0x002d:
            r2 = r0.booleanValue();
            if (r2 == 0) goto L_0x0036;
        L_0x0033:
            r2 = defpackage.acmz.b.SUCCESS;
            return r2;
        L_0x0036:
            r2 = defpackage.acmz.b.DENIED;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acmz$e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: acmz$i */
    static final class i extends akcq implements akbl<akxa<alid>, Optional<alid>> {
        i(acmz acmz) {
            super(1, acmz);
        }

        public final String getName() {
            return "unpackCurrentGameStateResult";
        }

        public final akej getOwner() {
            return akde.a(acmz.class);
        }

        public final String getSignature() {
            return "unpackCurrentGameStateResult(Lretrofit2/adapter/rxjava2/Result;)Lcom/google/common/base/Optional;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "p1");
            akws a = akxa.a();
            Object obj2 = a != null ? (alid) a.f() : null;
            String str = "Optional.absent()";
            if (akxa.c()) {
                obj = Optional.absent();
                akcr.a(obj, str);
                return obj;
            } else if (obj2 == null) {
                obj = Optional.absent();
                akcr.a(obj, str);
                return obj;
            } else {
                obj = Optional.of(obj2);
                akcr.a(obj, "Optional.of(body)");
                return obj;
            }
        }
    }

    /* renamed from: acmz$k */
    static final class k extends akcq implements akbl<akxa<alif>, Optional<alhu[]>> {
        k(acmz acmz) {
            super(1, acmz);
        }

        public final String getName() {
            return "unpackCurrentUserGameMarkersResult";
        }

        public final akej getOwner() {
            return akde.a(acmz.class);
        }

        public final String getSignature() {
            return "unpackCurrentUserGameMarkersResult(Lretrofit2/adapter/rxjava2/Result;)Lcom/google/common/base/Optional;";
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (defpackage.akxa) r3;
            r0 = "p1";
            defpackage.akcr.b(r3, r0);
            r0 = r3.a();
            if (r0 == 0) goto L_0x0018;
        L_0x000d:
            r0 = r0.f();
            r0 = (defpackage.alif) r0;
            if (r0 == 0) goto L_0x0018;
        L_0x0015:
            r0 = r0.a;
            goto L_0x0019;
        L_0x0018:
            r0 = 0;
        L_0x0019:
            r3 = r3.c();
            r1 = "Optional.absent()";
            if (r3 == 0) goto L_0x0029;
        L_0x0021:
            r3 = com.google.common.base.Optional.absent();
            defpackage.akcr.a(r3, r1);
            return r3;
        L_0x0029:
            if (r0 != 0) goto L_0x0033;
        L_0x002b:
            r3 = com.google.common.base.Optional.absent();
            defpackage.akcr.a(r3, r1);
            return r3;
        L_0x0033:
            r3 = com.google.common.base.Optional.of(r0);
            r0 = "Optional.of(markers)";
            defpackage.akcr.a(r3, r0);
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acmz$k.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acmz.class), "baseUrlObservable", "getBaseUrlObservable()Lio/reactivex/Single;");
        a aVar = new a();
    }

    public acmz(ajdx<EggHuntHttpInterface> ajdx, ftl ftl, zgb zgb, nce nce) {
        akcr.b(ajdx, "httpInterface");
        akcr.b(ftl, "config");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(nce, "locationPreferences");
        this.b = ajdx;
        this.c = ftl;
        this.d = nce;
    }

    public final ajdx<b> a(addl addl) {
        akcr.b(addl, "egg");
        Object f = this.b.a((ajfc) new d(this, addl)).b((ajdw) this.a.g()).f(new acna(new e(this)));
        akcr.a(f, "httpInterface\n          …kAcquireGameMarkerResult)");
        return f;
    }
}
