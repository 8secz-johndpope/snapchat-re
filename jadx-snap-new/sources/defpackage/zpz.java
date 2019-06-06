package defpackage;

import defpackage.zpq.b.a;
import java.util.concurrent.Callable;

/* renamed from: zpz */
public final class zpz {

    /* renamed from: zpz$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
        }

        public final /* synthetic */ Object call() {
            return (zse) this.a.get();
        }
    }

    public static ajdx<a> a(ajwy<zse> ajwy) {
        akcr.b(ajwy, "authPayloadProvider");
        Object a = ajdx.c((Callable) new a(ajwy)).a();
        akcr.a(a, "Single.fromCallable<Unlo…dProvider.get() }.cache()");
        return a;
    }

    public static cin a(aipn<zrf> aipn) {
        akcr.b(aipn, "gtqAuthPayloadProcessor");
        Object obj = aipn.get();
        akcr.a(obj, "gtqAuthPayloadProcessor.get()");
        return (cin) obj;
    }

    public static zsq a() {
        return new zsq(zsw.SNAPCHAT_USER_CONTEXT, (byte) 0);
    }

    public static cin b(aipn<zrg> aipn) {
        akcr.b(aipn, "gtqRequestPayloadProcessor");
        Object obj = aipn.get();
        akcr.a(obj, "gtqRequestPayloadProcessor.get()");
        return (cin) obj;
    }
}
