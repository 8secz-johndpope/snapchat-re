package defpackage;

import defpackage.mhs.b;

/* renamed from: ltf */
public final class ltf {
    static final <T, R> ajdp<R> a(ajdp<T> ajdp, R r, akbw<? super R, ? super T, ? extends R> akbw) {
        if (akbw != null) {
            akbw = new ltg(akbw);
        }
        return ajdp.b((Object) r, (ajex) akbw).b(1);
    }

    static final mux a(Iterable<mux> iterable, mhs mhs) {
        mux mux = null;
        if (!(mhs instanceof b)) {
            return null;
        }
        for (mux next : iterable) {
            if (akcr.a(next.a, (Object) mhs)) {
                mux = next;
            }
        }
        return mux;
    }
}
