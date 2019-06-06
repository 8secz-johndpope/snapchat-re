package defpackage;

import java.io.IOException;

/* renamed from: akjp */
public final class akjp extends IOException {
    public final akjc a;

    public akjp(akjc akjc) {
        super("stream was reset: ".concat(String.valueOf(akjc)));
        this.a = akjc;
    }
}
