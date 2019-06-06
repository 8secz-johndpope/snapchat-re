package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.listener.HintsListener;
import defpackage.mmk.b;

/* renamed from: mkw */
public final class mkw implements mmk {
    final ajws<b> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: mkw$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        final /* synthetic */ mkw a;

        /* renamed from: mkw$1$a */
        public static final class a implements HintsListener {
            private /* synthetic */ 1 a;

            a(1 1) {
                this.a = 1;
            }

            public final void hideHint(String str) {
                akcr.b(str, "filterId");
                mhs a = defpackage.mhs.a.a(str);
                if (!(a instanceof mhs.b)) {
                    a = null;
                }
                mhs.b bVar = (mhs.b) a;
                if (bVar != null) {
                    this.a.a.a.a((Object) new defpackage.mmk.b.a(bVar));
                }
            }

            public final void showHint(String str, String str2) {
                akcr.b(str, "filterId");
                akcr.b(str2, "hintId");
                mhs a = defpackage.mhs.a.a(str);
                mhs a2 = defpackage.mhs.a.a(str2);
                if ((a instanceof mhs.b) && (a2 instanceof mhs.b)) {
                    this.a.a.a.a((Object) new b.b((mhs.b) a, (mhs.b) a2));
                }
            }
        }

        1(mkw mkw) {
            this.a = mkw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setHintsListener(new a(this));
            return ajxw.a;
        }
    }

    /* renamed from: mkw$a */
    static final class a extends akcs implements akbk<ajdp<b>> {
        private /* synthetic */ mkw a;

        a(mkw mkw) {
            this.a = mkw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mkw.class), "requests", "getRequests()Lio/reactivex/Observable;");
    }

    public mkw(mkx mkx) {
        akcr.b(mkx, "lensCore");
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Hi…Request>().toSerialized()");
        this.a = r;
        mkx.c(new 1(this));
    }

    public final ajdp<b> a() {
        return (ajdp) this.b.b();
    }
}
