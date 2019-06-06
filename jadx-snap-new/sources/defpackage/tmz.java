package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: tmz */
public final class tmz implements tmq {
    private final LinkedHashSet<String> a = new LinkedHashSet();
    private final tmu b;

    public tmz(tmu tmu) {
        akcr.b(tmu, "playStateRepository");
        this.b = tmu;
    }

    public final int a(String str) {
        akcr.b(str, "storyId");
        return this.b.a(str);
    }

    public final Set<String> a() {
        return this.a;
    }

    public final boolean a(Set<String> set) {
        akcr.b(set, "snapIds");
        this.a.addAll(set);
        return this.b.a((Set) set);
    }

    public final String b(String str) {
        akcr.b(str, "storyId");
        return this.b.b(str);
    }
}
