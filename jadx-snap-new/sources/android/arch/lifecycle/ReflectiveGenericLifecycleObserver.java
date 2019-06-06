package android.arch.lifecycle;

import defpackage.g;
import defpackage.g.a;
import defpackage.j;
import defpackage.l;
import java.util.List;

public class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    private final Object a;
    private final a b = g.a.b(this.a.getClass());

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
    }

    public final void a(l lVar, j.a aVar) {
        a aVar2 = this.b;
        Object obj = this.a;
        a.a((List) aVar2.a.get(aVar), lVar, aVar, obj);
        a.a((List) aVar2.a.get(j.a.ON_ANY), lVar, aVar, obj);
    }
}
