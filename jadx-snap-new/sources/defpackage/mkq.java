package defpackage;

import java.util.Set;

/* renamed from: mkq */
final class mkq extends akcq implements akbl<ajej, Set<? extends ajej>> {
    public static final mkq a = new mkq();

    mkq() {
        super(1);
    }

    public final String getName() {
        return "setOf";
    }

    public final akej getOwner() {
        return akde.a(ajzr.class, "lenses-core_release");
    }

    public final String getSignature() {
        return "setOf(Ljava/lang/Object;)Ljava/util/Set;";
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ajej ajej = (ajej) obj;
        akcr.b(ajej, "p1");
        return ajzs.a(ajej);
    }
}
