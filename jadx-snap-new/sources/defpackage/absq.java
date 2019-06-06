package defpackage;

import com.google.common.collect.ConcurrentHashMultiset;

/* renamed from: absq */
public final class absq {
    static final absq a = new absq();
    final ConcurrentHashMultiset<String> b = ConcurrentHashMultiset.create();

    public final void a(String str) {
        this.b.removeExactly(str, 1);
    }
}
