package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.LensUserData;
import com.looksery.sdk.listener.UserDataListener;
import defpackage.mpl.b;
import defpackage.mpl.c;

/* renamed from: mma */
public final class mma implements mpl {
    final ajwo<b> a;
    private final mkx b;

    /* renamed from: mma$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        final /* synthetic */ mma a;

        /* renamed from: mma$1$1 */
        static final class 1 implements UserDataListener {
            private /* synthetic */ 1 a;

            1(1 1) {
                this.a = 1;
            }

            public final void requestUserData() {
                this.a.a.a.a(b.a);
            }
        }

        1(mma mma) {
            this.a = mma;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setUserDataListener(new 1(this));
            return ajxw.a;
        }
    }

    /* renamed from: mma$a */
    static final class a extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setUserData((LensUserData) mmb.a.invoke(this.a));
            return ajxw.a;
        }
    }

    public mma(mkx mkx) {
        akcr.b(mkx, "lensCore");
        this.b = mkx;
        this.b.c(new 1(this));
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<UserDataProcessor.Request>()");
        this.a = ajwo;
    }

    public final /* bridge */ /* synthetic */ ajdp a() {
        return this.a;
    }

    /* renamed from: a */
    public final void accept(c cVar) {
        akcr.b(cVar, "result");
        this.b.b(new a(cVar));
    }
}
