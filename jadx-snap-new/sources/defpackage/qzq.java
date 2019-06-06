package defpackage;

import defpackage.yic.a;
import defpackage.yic.b;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qzq */
public final class qzq implements yic {
    private final ajwl<b> a;
    private final ajwl<String> b;
    private final ConcurrentHashMap<String, a> c = new ConcurrentHashMap();

    public qzq() {
        String str = "";
        Object i = ajwl.i(new b(str, ajyx.a));
        akcr.a(i, "BehaviorSubject.createDe…re.State(\"\", emptyMap()))");
        this.a = i;
        i = ajwl.i(str);
        akcr.a(i, "BehaviorSubject.createDefault(\"\")");
        this.b = i;
    }

    public final /* bridge */ /* synthetic */ ajdp a() {
        return this.a;
    }

    public final void a(String str) {
        akcr.b(str, "storyId");
        this.b.a((Object) str);
        ajwl ajwl = this.a;
        Object p = this.b.p();
        if (p == null) {
            akcr.a();
        }
        akcr.a(p, "latestUserInitiatedStoryLoad.value!!");
        ajwl.a(new b((String) p, this.c));
    }

    public final void a(String str, a aVar) {
        akcr.b(str, "storyId");
        akcr.b(aVar, "state");
        if (((a) this.c.get(str)) != aVar) {
            this.c.put(str, aVar);
            ajwl ajwl = this.a;
            Object p = this.b.p();
            if (p == null) {
                akcr.a();
            }
            akcr.a(p, "latestUserInitiatedStoryLoad.value!!");
            ajwl.a(new b((String) p, this.c));
        }
    }

    public final a b(String str) {
        akcr.b(str, "storyId");
        return (a) this.c.get(str);
    }

    public final b b() {
        Object p = this.a.p();
        if (p == null) {
            akcr.a();
        }
        akcr.a(p, "loadingStateSubject.value!!");
        return (b) p;
    }
}
