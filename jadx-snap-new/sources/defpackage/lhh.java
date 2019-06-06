package defpackage;

import com.snap.lenses.app.data.LensesHttpInterface;
import defpackage.mph.a;
import defpackage.mph.b;

/* renamed from: lhh */
public final class lhh implements mph {
    final ajxe a = ajxh.a(new a(this));
    final ajxe b = ajxh.a(f.a);
    final ajws<a> c;
    final mxa d;
    final zfw e;
    private final ajxe f;

    /* renamed from: lhh$a */
    static final class a extends akcs implements akbk<LensesHttpInterface> {
        private /* synthetic */ lhh a;

        a(lhh lhh) {
            this.a = lhh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LensesHttpInterface) this.a.d.a(LensesHttpInterface.class);
        }
    }

    /* renamed from: lhh$c */
    static final class c extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ lhh a;

        /* renamed from: lhh$c$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                a aVar = (a) obj;
                akcr.b(aVar, "request");
                lhh lhh = this.a.a;
                StringBuilder stringBuilder;
                if (lhi.b.containsKey(aVar.b)) {
                    wjd wjd = (wjd) lhi.b.get(aVar.b);
                    String str = aVar.e;
                    if (str.hashCode() == -1575588001 && str.equals("application/x-protobuf")) {
                        LensesHttpInterface lensesHttpInterface = (LensesHttpInterface) lhh.a.b();
                        String str2 = aVar.b;
                        if (wjd == null) {
                            akcr.a();
                        }
                        Object a = wjd.a();
                        akcr.a(a, "scopeId!!.serverSideScopeName");
                        Object create = akhu.create((akho) lhh.b.b(), aVar.c);
                        akcr.a(create, "RequestBody.create(protoMediaType, request.data)");
                        obj = lensesHttpInterface.performProtoRequest(str2, a, create).f(new d(aVar)).g(new e(aVar)).b((ajdw) lhh.e.g()).i();
                        akcr.a(obj, "responseSingle.map {\n   …          .toObservable()");
                        return obj;
                    }
                    stringBuilder = new StringBuilder("Unsupported content type: ");
                    stringBuilder.append(aVar.e);
                    throw new UnsupportedOperationException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder("No scopeId listed for URI: ");
                stringBuilder.append(aVar.b);
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
        }

        c(lhh lhh) {
            this.a = lhh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.c.a((ajdw) this.a.e.b()).k((ajfc) new 1(this))).a();
        }
    }

    /* renamed from: lhh$f */
    static final class f extends akcs implements akbk<akho> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return akho.a("application/x-protobuf");
        }
    }

    /* renamed from: lhh$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ a a;

        d(a aVar) {
            this.a = aVar;
        }

        /* JADX WARNING: Missing block: B:5:0x002c, code skipped:
            if (r1 == null) goto L_0x002e;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.akws) r9;
            r0 = "it";
            defpackage.akcr.b(r9, r0);
            r0 = r9.e();
            r1 = "it.message()";
            if (r0 == 0) goto L_0x0047;
        L_0x000f:
            r0 = new mph$b$c;
            r2 = r8.a;
            r3 = r2.a;
            r2 = r8.a;
            r4 = r2.b;
            r5 = r9.c();
            defpackage.akcr.a(r5, r1);
            r1 = r9.f();
            r1 = (defpackage.akhw) r1;
            if (r1 == 0) goto L_0x002e;
        L_0x0028:
            r1 = r1.e();
            if (r1 != 0) goto L_0x0030;
        L_0x002e:
            r1 = defpackage.lhi.a;
        L_0x0030:
            r6 = r1;
            r9 = r9.d();
            r1 = "Content-Type";
            r9 = r9.a(r1);
            if (r9 != 0) goto L_0x003f;
        L_0x003d:
            r9 = "";
        L_0x003f:
            r7 = r9;
            r2 = r0;
            r2.<init>(r3, r4, r5, r6, r7);
        L_0x0044:
            r0 = (defpackage.mph.b) r0;
            return r0;
        L_0x0047:
            r0 = new mph$b$b$d;
            r2 = r8.a;
            r3 = r9.b();
            r9 = r9.c();
            defpackage.akcr.a(r9, r1);
            r0.<init>(r2, r3, r9);
            goto L_0x0044;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lhh$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: lhh$e */
    static final class e<T, R> implements ajfc<Throwable, b> {
        private /* synthetic */ a a;

        e(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            a aVar = this.a;
            Object obj2 = null;
            if (!(th instanceof akwn)) {
                th = null;
            }
            akwn akwn = (akwn) th;
            if (akwn != null) {
                obj2 = Integer.valueOf(akwn.a());
            }
            return new b.b.a(aVar, String.valueOf(obj2));
        }
    }

    /* renamed from: lhh$b */
    static final class b extends akcq implements akbl<a, ajxw> {
        b(ajws ajws) {
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
            a aVar = (a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lhh.class), "httpInterface", "getHttpInterface()Lcom/snap/lenses/app/data/LensesHttpInterface;"), new akdc(akde.a(lhh.class), "protoMediaType", "getProtoMediaType()Lokhttp3/MediaType;"), new akdc(akde.a(lhh.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public lhh(mxa mxa, zfw zfw) {
        akcr.b(mxa, "remoteServiceFactory");
        akcr.b(zfw, "qualifiedSchedulers");
        this.d = mxa;
        this.e = zfw;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Request>().toSerialized()");
        this.c = r;
        this.f = ajxh.a(new c(this));
    }

    public final ajfb<a> a() {
        return new lhj(new b(this.c));
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "request");
        return akgb.b(aVar.b, "https://us-central1-gcp.api.snapchat.com", false);
    }

    public final ajdp<b> b() {
        return (ajdp) this.f.b();
    }
}
