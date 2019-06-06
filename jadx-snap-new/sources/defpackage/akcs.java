package defpackage;

import java.io.Serializable;

/* renamed from: akcs */
// Lambda
public abstract class akcs<R> implements akcp<R>, Serializable {
    private final int arity;

    public akcs(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        Object a = akde.a((akcp) this);
        akcr.a(a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
