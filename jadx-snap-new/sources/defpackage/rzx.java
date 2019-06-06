package defpackage;

import java.util.Set;

/* renamed from: rzx */
public final class rzx implements sag {
    private final ajxe a;

    /* renamed from: rzx$a */
    static final class a extends akcq implements akbk<Set<sag>> {
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
            return (Set) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rzx.class), "detectors", "getDetectors()Ljava/util/Set;");
    }

    public rzx(ajwy<Set<sag>> ajwy) {
        akcr.b(ajwy, "detectorsProvider");
        this.a = ajxh.a(new a(ajwy));
    }

    private final Set<sag> a() {
        return (Set) this.a.b();
    }

    private final boolean b(Throwable th) {
        Object a = a();
        akcr.a(a, "detectors");
        for (Object next : (Iterable) a) {
            if (((sag) next).a(th)) {
                break;
            }
        }
        Object next2 = null;
        return next2 != null;
    }

    public final boolean a(Throwable th) {
        akcr.b(th, "exception");
        Object obj = null;
        Object obj2 = th;
        int i = 0;
        while (i <= 10 && obj2 != null && !akcr.a(obj2, obj)) {
            if (b(obj2)) {
                return true;
            }
            i++;
            obj = obj2;
            Throwable obj22 = obj22.getCause();
        }
        return false;
    }
}
