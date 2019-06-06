package defpackage;

import defpackage.akgx.a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: gmh */
public final class gmh extends gmg {
    private final ryw<ryz> c;
    private final Set<glu> d;

    private gmh(ryw<ryz> ryw, akht akht, Set<glu> set, Executor executor) {
        super(akht, executor);
        this.c = ryw;
        this.d = new HashSet(set);
    }

    public static a a(aipn<ryw<ryz>> aipn, Set<glu> set, Executor executor) {
        return new -$$Lambda$gmh$lMelCQTGqtQauJbeL_MDECfOp90(executor, aipn, set);
    }

    /* renamed from: a */
    public final akgx clone() {
        return new gmh(this.c, this.a, this.d, this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final gmg.a a(ryz ryz, rzv<sai> rzv) {
        for (glu a : this.d) {
            ryz = a.a(ryz);
        }
        ryw ryw = this.c;
        rzv.getClass();
        rzb a2 = ryw.a(ryz, new -$$Lambda$VldcxhPcVeVsdZBVEiUnPwIJg_k(rzv));
        a2.getClass();
        return new -$$Lambda$L9pU5-MIPvuTQjdbO04SiokXg5o(a2);
    }
}
