package defpackage;

import defpackage.fth.a;

/* renamed from: vyt */
public enum vyt implements fth {
    EXPERIMENTAL_SECTIONS(a.a(false)),
    TEST_PUBLISHER_SEARCH(a.a(false)),
    FREEFORM_TWEAK(a.a(r2)),
    CUSTOM_ENDPOINT(a.a(r2)),
    MAP_SECTION(a.a(false)),
    V2_EXPERIENCE(a.a(false));
    
    private final a<?> delegate;

    private vyt(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SEARCH;
    }
}
