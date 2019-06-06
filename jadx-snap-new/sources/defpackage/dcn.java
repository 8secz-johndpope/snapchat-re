package defpackage;

import defpackage.fth.a;
import java.lang.reflect.Type;

/* renamed from: dcn */
public enum dcn implements fth {
    ARE_BENCHMARKS_ENABLED(a.a(false)),
    BLACKLISTED_BENCHMARKS(a.a((Type) acbt.class, new acbt()));
    
    private final a<?> delegate;

    private dcn(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.BENCHMARKS;
    }
}
