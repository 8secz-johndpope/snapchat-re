package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aipg */
public final class aipg {
    final boolean a;
    final int b;
    final aipi c;
    final boolean d;

    /* renamed from: aipg$a */
    public static class a {
        boolean a;
        int b = 1;
        boolean c;
        aipi d;
        private final List<aipi> e = new ArrayList();

        public final a a() {
            this.e.add(defpackage.aioe.a.a);
            return this;
        }

        public final aipg b() {
            defpackage.aipi.a a = new defpackage.aipi.a().a(aipi.a);
            for (aipi a2 : this.e) {
                a.a(a2);
            }
            this.d = a.a();
            return new aipg(this, (byte) 0);
        }
    }

    private aipg(a aVar) {
        this.b = aVar.b;
        this.a = aVar.a;
        this.c = aVar.d;
        this.d = aVar.c;
    }

    /* synthetic */ aipg(a aVar, byte b) {
        this(aVar);
    }
}
