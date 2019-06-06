package com.snap.composer.actions;

import defpackage.akbl;
import defpackage.akcr;

public final class ComposerRunnableAction implements ComposerAction {
    private final akbl<Object[], Object> a;

    public ComposerRunnableAction(akbl<? super Object[], ? extends Object> akbl) {
        akcr.b(akbl, "closure");
        this.a = akbl;
    }

    public final akbl<Object[], Object> getClosure() {
        return this.a;
    }

    public final Object perform(Object[] objArr) {
        akcr.b(objArr, "parameters");
        return this.a.invoke(objArr);
    }
}
