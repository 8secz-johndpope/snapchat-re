package defpackage;

import defpackage.fth.a;

/* renamed from: gup */
public enum gup implements fth {
    ENABLE_DDML_TRAINING(a.a(false)),
    ENABLE_DDML_DATA_GENERATION(a.a(false)),
    DDML_DATA_RENTENTION(a.a(6));
    
    private final a<?> delegate;

    private gup(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.DDML;
    }
}
