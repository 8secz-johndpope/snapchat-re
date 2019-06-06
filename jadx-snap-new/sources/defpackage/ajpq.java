package defpackage;

/* renamed from: ajpq */
public final class ajpq<R, T> extends ajnp<T, R> {
    private ajds<? extends R, ? super T> b;

    public ajpq(ajdt<T> ajdt, ajds<? extends R, ? super T> ajds) {
        super(ajdt);
        this.b = ajds;
    }

    public final void a_(ajdv<? super R> ajdv) {
        try {
            Object a = this.b.a(ajdv);
            StringBuilder stringBuilder = new StringBuilder("Operator ");
            stringBuilder.append(this.b);
            stringBuilder.append(" returned a null Observer");
            this.a.a((ajdv) ajfv.a(a, stringBuilder.toString()));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ajep.a(th);
            ajvo.a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }
}
