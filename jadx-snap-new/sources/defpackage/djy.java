package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: djy */
public final class djy implements aiqc<Map<String, dio>> {
    private final ajwy<List<zyq>> a;
    private final ajwy<Context> b;
    private final ajwy<abss> c;
    private final ajwy<ilv> d;

    public static Map<String, dio> a(List<zyq> list, Context context, abss abss, ilv ilv) {
        HashMap hashMap = new HashMap();
        for (zyq zyq : list) {
            hashMap.put(zyq.a, new dio(zyq.a, context, abss, ilv));
        }
        return (Map) aiqf.a(hashMap, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return djy.a((List) this.a.get(), (Context) this.b.get(), (abss) this.c.get(), (ilv) this.d.get());
    }
}
