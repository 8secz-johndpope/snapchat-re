package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.listener.ExpressionsListener;
import defpackage.mmg.b;

/* renamed from: mko */
public final class mko implements mmg {
    final ajws<b> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: mko$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        final /* synthetic */ mko a;

        /* renamed from: mko$1$a */
        public static final class a implements ExpressionsListener {
            private /* synthetic */ 1 a;

            a(1 1) {
                this.a = 1;
            }

            public final void onExpression(String str) {
                akcr.b(str, "expressionKey");
                this.a.a.a.a((Object) new defpackage.mmg.b.a(str));
            }

            public final void onFaceCountChanged(int i) {
                this.a.a.a.a((Object) new b.b(i));
            }
        }

        1(mko mko) {
            this.a = mko;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setExpressionsListener(new a(this));
            return ajxw.a;
        }
    }

    /* renamed from: mko$a */
    static final class a extends akcs implements akbk<ajdp<b>> {
        private /* synthetic */ mko a;

        a(mko mko) {
            this.a = mko;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mko.class), "reports", "getReports()Lio/reactivex/Observable;");
    }

    public mko(mkx mkx) {
        akcr.b(mkx, "lensCore");
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Fa….Report>().toSerialized()");
        this.a = r;
        mkx.c(new 1(this));
    }

    public final ajdp<b> a() {
        return (ajdp) this.b.b();
    }
}
