package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: mho */
public final class mho {

    /* renamed from: mho$a */
    public static final class a implements ajej {
        private /* synthetic */ ajej a;
        private /* synthetic */ ajdw b;
        private /* synthetic */ long c;
        private /* synthetic */ TimeUnit d;

        /* renamed from: mho$a$a */
        static final class a extends akcq implements akbk<ajxw> {
            a(a aVar) {
                super(0, aVar);
            }

            public final String getName() {
                return "disposeAction";
            }

            public final akej getOwner() {
                return akde.a(a.class);
            }

            public final String getSignature() {
                return "disposeAction()V";
            }

            public final /* synthetic */ Object invoke() {
                ((a) this.receiver).a();
                return ajxw.a;
            }
        }

        a(ajej ajej, ajdw ajdw, long j, TimeUnit timeUnit) {
            this.a = ajej;
            this.b = ajdw;
            this.c = j;
            this.d = timeUnit;
        }

        /* Access modifiers changed, original: final|declared_synchronized */
        public final synchronized void a() {
            if (!isDisposed()) {
                this.a.dispose();
            }
        }

        public final void dispose() {
            if (!isDisposed()) {
                akcr.a(this.b.a(new mhp(new a(this)), this.c, this.d), "scheduler.scheduleDirect…eAction, delay, timeUnit)");
            }
        }

        public final boolean isDisposed() {
            return this.a.isDisposed();
        }
    }

    public static final ajej a(ajej ajej, long j, TimeUnit timeUnit, ajdw ajdw) {
        akcr.b(ajej, "receiver$0");
        akcr.b(timeUnit, "timeUnit");
        akcr.b(ajdw, "scheduler");
        return new a(ajej, ajdw, j, timeUnit);
    }
}
