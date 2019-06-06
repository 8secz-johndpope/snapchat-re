package defpackage;

import com.google.common.base.Supplier;
import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import defpackage.mou.c;
import defpackage.mph.a;
import defpackage.mph.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: mlo */
public final class mlo implements mou, mph {
    final ajws<a> a;
    final ajws<mou.a> b;
    final ajws<c> c;
    final zfw d;
    final Supplier<iha> e;
    private final ajxe f = ajxh.a(new c(this));
    private final ajxe g = ajxh.a(new e(this));

    /* renamed from: mlo$c */
    static final class c extends akcs implements akbk<ajdp<b>> {
        final /* synthetic */ mlo a;

        /* renamed from: mlo$c$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                a aVar = (a) obj;
                akcr.b(aVar, "request");
                mlo mlo = this.a.a;
                if ((akcr.a(aVar.d, LensTextInputConstants.REQUEST_METHOD) ^ 1) != 0) {
                    obj = ajdp.b(new b.b.a(aVar, "Unsupported request method"));
                    akcr.a(obj, "Observable.just(UriDataH…pported request method\"))");
                    return obj;
                } else if (akgb.c(aVar.b, LensTextInputConstants.PATH_REQUEST_KEYBOARD)) {
                    mmm mmm = (mmm) ((iha) mlo.e.get()).a((InputStream) new ByteArrayInputStream(aVar.c), mmm.class);
                    mlo.c.a((Object) new defpackage.mou.c.b(mmm.a, mmm.b, mmm.c, mmq.a.a(mmm.d), mom.a.a(mmm.e)));
                    obj = mlo.b.a((ajdw) mlo.d.b()).p(new d(mlo, aVar));
                    akcr.a(obj, "actionRelay\n            …                        }");
                    return obj;
                } else {
                    String str = "Observable.just(UriDataH…se.emptySuccess(request))";
                    if (akgb.c(aVar.b, LensTextInputConstants.PATH_DISMISS_KEYBOARD)) {
                        mlo.c.a((Object) defpackage.mou.c.a.a);
                        obj = ajdp.b(b.a.a(aVar));
                        akcr.a(obj, str);
                        return obj;
                    } else if (akgb.c(aVar.b, LensTextInputConstants.PATH_SELECTED_TEXT_RANGE)) {
                        mmn mmn = (mmn) ((iha) mlo.e.get()).a((InputStream) new ByteArrayInputStream(aVar.c), mmn.class);
                        mlo.c.a((Object) new defpackage.mou.c.c(mmn.a, mmn.b));
                        obj = ajdp.b(b.a.a(aVar));
                        akcr.a(obj, str);
                        return obj;
                    } else {
                        obj = ajdp.b(new b.b.a(aVar, "Unsupported request path"));
                        akcr.a(obj, "Observable.just(UriDataH…supported request path\"))");
                        return obj;
                    }
                }
            }
        }

        c(mlo mlo) {
            this.a = mlo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.a.a((ajdw) this.a.d.b()).k((ajfc) new 1(this))).a();
        }
    }

    /* renamed from: mlo$e */
    static final class e extends akcs implements akbk<ajdp<c>> {
        private /* synthetic */ mlo a;

        e(mlo mlo) {
            this.a = mlo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.f();
        }
    }

    /* renamed from: mlo$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ mlo a;
        private /* synthetic */ a b;

        d(mlo mlo, a aVar) {
            this.a = mlo;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object mmo;
            mou.a aVar = (mou.a) obj;
            akcr.b(aVar, "it");
            mhs.b bVar = this.b.a;
            String str = this.b.b;
            iha iha = (iha) this.a.e.get();
            if (aVar instanceof mou.a.a) {
                mmo = new mmo(((mou.a.a) aVar).a);
            } else if (aVar instanceof mou.a.b) {
                mou.a.b bVar2 = (mou.a.b) aVar;
                mmp mmp = new mmp(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.e);
            } else {
                throw new ajxk();
            }
            Object a = iha.a(mmo);
            akcr.a(a, "serializationHelperSuppl…                        )");
            return new b.c(bVar, str, "", a, this.b.e);
        }
    }

    /* renamed from: mlo$a */
    static final class a extends akcq implements akbl<defpackage.mou.a, ajxw> {
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
            defpackage.mou.a aVar = (defpackage.mou.a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: mlo$b */
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
        aken[] akenArr = new aken[]{new akdc(akde.a(mlo.class), "outputs", "getOutputs()Lio/reactivex/Observable;"), new akdc(akde.a(mlo.class), "results", "getResults()Lio/reactivex/Observable;")};
    }

    public mlo(zfw zfw, Supplier<iha> supplier) {
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(supplier, "serializationHelperSupplier");
        this.d = zfw;
        this.e = supplier;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Request>().toSerialized()");
        this.a = r;
        r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Te….Action>().toSerialized()");
        this.b = r;
        r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Te….Result>().toSerialized()");
        this.c = r;
    }

    public final ajfb<a> a() {
        return new mlp(new b(this.a));
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "request");
        return akgb.b(aVar.b, LensTextInputConstants.SCHEME_AND_HOST, false);
    }

    public final ajdp<b> b() {
        return (ajdp) this.f.b();
    }

    public final ajfb<mou.a> c() {
        return new mlp(new a(this.b));
    }

    public final ajdp<c> d() {
        return (ajdp) this.g.b();
    }
}
