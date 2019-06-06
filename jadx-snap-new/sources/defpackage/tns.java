package defpackage;

import defpackage.fth.a;

/* renamed from: tns */
public enum tns implements fth {
    EXAMPLE_GLOBAL_PROP(a.a(false)),
    EXAMPLE_ANOTHER_GLOBAL_PROP(a.a(1)),
    EXAMPLE_ANOTHER_GLOBAL_PROP2(a.a(2)),
    EXAMPLE_GLOBAL_PROP_LONG(a.a(123)),
    EXAMPLE_GLOBAL_PROP_FLOAT(a.a(0.12f)),
    EXAMPLE_GLOBAL_PROP_DOUBLE(a.a(0.141414d)),
    EXAMPLE_GLOBAL_PROP_ENUM(a.a(fti.STRING));
    
    private final a<?> delegate;

    private tns(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.INTERNAL_TESTING;
    }
}
