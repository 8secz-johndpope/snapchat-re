package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: trn */
public final class trn implements aiqc<tzt> {
    private final ajwy<Map<String, tza>> a;
    private final ajwy<Set<tvr>> b;
    private final ajwy<List<String>> c;

    public static tzt a(aipn<Map<String, tza>> aipn, aipn<Set<tvr>> aipn2, List<String> list) {
        return (tzt) aiqf.a(trg.a((aipn) aipn, (aipn) aipn2, (List) list), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return trn.a(aiqb.b(this.a), aiqb.b(this.b), (List) this.c.get());
    }
}
