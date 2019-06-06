package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.listener.PersistenceListener;
import defpackage.mhs.b;
import defpackage.mnq.a;

/* renamed from: mlb */
public final class mlb implements mnq {
    final ajvr<a> a;
    final c b = new c(this);
    final mkx c;
    private final ajxe d;

    /* renamed from: mlb$c */
    public static final class c implements PersistenceListener {
        private /* synthetic */ mlb a;

        c(mlb mlb) {
            this.a = mlb;
        }

        public final void requestRestore(String str) {
            akcr.b(str, "id");
            this.a.a.a(new a.a(new b(str)));
        }

        public final void requestSave(String str, byte[] bArr) {
            akcr.b(str, "id");
            if (bArr == null) {
                bArr = mhj.a;
            }
            this.a.a.a(new a.b(new b(str), bArr));
        }
    }

    /* renamed from: mlb$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ mlb a;

        1(mlb mlb) {
            this.a = mlb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setPersistenceListener(this.a.b);
            return ajxw.a;
        }
    }

    /* renamed from: mlb$b */
    static final class b extends akcs implements akbk<ajdp<a>> {
        private /* synthetic */ mlb a;

        b(mlb mlb) {
            this.a = mlb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.j();
        }
    }

    /* renamed from: mlb$d */
    static final class d extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ mnq.b a;

        d(mnq.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.restorePersistentStore(this.a.a.a, this.a.b);
            return ajxw.a;
        }
    }

    /* renamed from: mlb$a */
    static final class a extends akcq implements akbl<mnq.b, ajxw> {
        a(mlb mlb) {
            super(1, mlb);
        }

        public final String getName() {
            return "processResult";
        }

        public final akej getOwner() {
            return akde.a(mlb.class);
        }

        public final String getSignature() {
            return "processResult(Lcom/snap/lenses/core/PersistenceProcessor$Result;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mnq.b bVar = (mnq.b) obj;
            akcr.b(bVar, "p1");
            ((mlb) this.receiver).c.b(new d(bVar));
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mlb.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mlb(mkx mkx) {
        akcr.b(mkx, "lensCore");
        this.c = mkx;
        Object l = ajvr.l();
        l.m();
        akcr.a(l, "MulticastProcessor.creat…y {\n        start()\n    }");
        this.a = l;
        this.c.c(new 1(this));
        this.d = ajxh.a(new b(this));
    }

    public final ajfb<mnq.b> a() {
        return new mlc(new a(this));
    }

    public final ajdp<a> b() {
        return (ajdp) this.d.b();
    }
}
