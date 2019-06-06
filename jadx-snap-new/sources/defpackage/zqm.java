package defpackage;

import defpackage.zpq.c;
import defpackage.zpq.d;
import java.util.concurrent.Callable;

/* renamed from: zqm */
public abstract class zqm {

    /* renamed from: zqm$a */
    public static final class a {

        /* renamed from: zqm$a$a */
        static final class a extends akcq implements akbk<zri> {
            a(ajwy ajwy) {
                super(0, ajwy);
            }

            public final String getName() {
                return "get";
            }

            public final akej getOwner() {
                return akde.a(ajwy.class);
            }

            public final String getSignature() {
                return "get()Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke() {
                return (zri) ((ajwy) this.receiver).get();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public static final c a(ajwy<zrh> ajwy) {
        akcr.b(ajwy, "unlockablesProcessor");
        Object obj = ajwy.get();
        akcr.a(obj, "unlockablesProcessor.get()");
        return (c) obj;
    }

    public static final ajdx<d> b(ajwy<zri> ajwy) {
        akcr.b(ajwy, "unlockablesRepository");
        Object a = ajdx.c((Callable) new zqn(new a(ajwy))).a();
        akcr.a(a, "Single.fromCallable<Unlo…sRepository::get).cache()");
        return a;
    }
}
