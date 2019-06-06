package defpackage;

import defpackage.kxe.i;
import defpackage.kxz.a;
import defpackage.lqh.b;
import defpackage.lqh.b.a.c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kxm */
public final class kxm implements kxe, kxz {
    final AtomicReference<a> a = new AtomicReference(kxm.a(this.b));
    final dpv b;
    private final ajdp<achi<zjm, zjk>> c;
    private final ajdp<dpq> d;

    /* renamed from: kxm$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ kxm a;

        a(kxm kxm) {
            this.a = kxm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "result");
            return ((bVar instanceof c) || (bVar instanceof defpackage.lqh.b.a.a)) ? ajdp.b(kxm.a(this.a.b)) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: kxm$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            achi achi = (achi) obj;
            akcr.b(achi, "navigationEvent");
            return (akcr.a(((zjm) achi.e.e()).b(), (Object) "Preview") && akcr.a(((zjm) achi.f.e()).b(), (Object) "Camera") && achi.j) ? ajdp.b(a.PreviewCancel) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: kxm$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            dpq dpq = (dpq) obj;
            akcr.b(dpq, "it");
            return dpq instanceof dpq.a.b ? ajdp.b(a.Restart) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: kxm$d */
    static final class d<T> implements ajfb<a> {
        private /* synthetic */ kxm a;

        d(kxm kxm) {
            this.a = kxm;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.set((a) obj);
        }
    }

    public kxm(dpv dpv, ajdp<achi<zjm, zjk>> ajdp, ajdp<dpq> ajdp2) {
        akcr.b(dpv, "lensesCameraLaunchState");
        akcr.b(ajdp, "navigationEventObservable");
        akcr.b(ajdp2, "lensesCameraAction");
        this.b = dpv;
        this.c = ajdp;
        this.d = ajdp2;
    }

    static a a(dpv dpv) {
        return dpv instanceof dpv.a.b.c ? a.StoryReply : dpv instanceof dpv.a.b.a ? a.ChatReply : dpv instanceof dpv.a.b.b ? a.Map : a.LiveCamera;
    }

    public final ajdp<lqh.a> a(lqh lqh) {
        akcr.b(lqh, "cameraUseCase");
        ajdp d = lqh.b().u(new a(this)).e((ajdt) this.c.u(b.a)).e((ajdt) this.d.u(c.a)).d((ajfb) new d(this));
        akcr.a((Object) d, "cameraUseCase.outputs\n  …yPoint)\n                }");
        return myu.a(d);
    }

    public final ajdx<a> a() {
        Object obj = (a) this.a.get();
        if (obj == null) {
            obj = a.LiveCamera;
        }
        obj = ajdx.b(obj);
        akcr.a(obj, "Single.just(lensEntryPoi…er.EntryPoint.LiveCamera)");
        return obj;
    }

    public final kxe a(kxe kxe) {
        akcr.b(kxe, "other");
        return i.a((kxe) this, kxe);
    }
}
