package defpackage;

/* renamed from: lhl */
public final class lhl {

    /* renamed from: lhl$a */
    static final class a extends akcs implements akbw<zjm, acih, ajcx> {
        final /* synthetic */ zjw a;

        a(zjw zjw) {
            this.a = zjw;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            final zjm zjm = (zjm) obj;
            final acih acih = (acih) obj2;
            akcr.b(zjm, "pageType");
            obj = ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ a a;

                public final void run() {
                    if (this.a.a.d.c && akcr.a(zjm, (zjm) this.a.a.d.h())) {
                        acih acih = acih;
                        if (acih != null) {
                            this.a.a.d.a(acih, zjm);
                            return;
                        } else {
                            akcr.a(ajvo.a(ajhn.a), "Completable.complete()");
                            return;
                        }
                    }
                    zjw.a(this.a.a, zjm, true, null, acih, 4);
                }
            });
            akcr.a(obj, "Completable.fromAction {… payload)\n        }\n    }");
            return obj;
        }
    }

    public static final akbw<zjm, acih, ajcx> a(zjw zjw) {
        akcr.b(zjw, "receiver$0");
        return new a(zjw);
    }
}
