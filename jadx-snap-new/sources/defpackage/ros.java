package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ros */
public final class ros implements abjm {
    private final rrn a;

    public ros(rrn rrn) {
        akcr.b(rrn, "talkRepository");
        this.a = rrn;
    }

    public final List<abjv> a(String str) {
        akcr.b(str, "conversationId");
        return ajyu.h((Collection) this.a.a(str));
    }
}
