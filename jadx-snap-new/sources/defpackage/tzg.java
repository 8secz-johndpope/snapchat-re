package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: tzg */
public final class tzg {
    private final Set<String> a = new LinkedHashSet();
    private final ajwl<Set<String>> b;

    public tzg() {
        Object i = ajwl.i(this.a);
        akcr.a(i, "BehaviorSubject.createDefault<Set<String>>(set)");
        this.b = i;
    }

    public final ajdp<Set<String>> a() {
        Object f = this.b.f();
        akcr.a(f, "currentEditingToolSubject.hide()");
        return f;
    }

    public final void a(String str) {
        akcr.b(str, "toolId");
        if (this.a.add(str)) {
            this.b.a(this.a);
        }
    }

    public final void b(String str) {
        akcr.b(str, "toolId");
        if (this.a.remove(str)) {
            this.b.a(this.a);
        }
    }
}
