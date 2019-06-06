package defpackage;

import com.google.protobuf.nano.MessageNano;
import defpackage.aivm.a;
import defpackage.aivm.c;

/* renamed from: acbx */
public final class acbx {
    private static volatile aivm<acca, accb> a;

    /* renamed from: acbx$a */
    public static final class a extends ajar<a> {
        private a(aiug aiug) {
            super(aiug);
        }

        private a(aiug aiug, aiuf aiuf) {
            super(aiug, aiuf);
        }

        public final accb a(acca acca) {
            return (accb) ajas.a(this.a, acbx.a(), this.b, acca);
        }

        public final /* synthetic */ ajar a(aiug aiug, aiuf aiuf) {
            return new a(aiug, aiuf);
        }
    }

    /* renamed from: acbx$b */
    static final class b<T extends MessageNano> implements ajao<T> {
        private final int a;

        b(int i) {
            this.a = i;
        }

        public final T a() {
            accb acca;
            int i = this.a;
            if (i == 0) {
                acca = new acca();
            } else if (i == 1) {
                acca = new accb();
            } else {
                throw new AssertionError();
            }
            return acca;
        }
    }

    static {
        acbx.a();
    }

    private acbx() {
    }

    public static aivm<acca, accb> a() {
        aivm<acca, accb> aivm = a;
        if (aivm == null) {
            synchronized (acbx.class) {
                aivm = a;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.cdp.cof.CircumstancesService", "targetingQuery");
                    a.e = true;
                    a.a = ajaq.a(new b(0));
                    a.b = ajaq.a(new b(1));
                    aivm = a.a();
                    a = aivm;
                }
            }
        }
        return aivm;
    }
}
