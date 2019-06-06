package com.snap.composer.actions;

import defpackage.akcr;

public final class ComposerJavaScriptAction implements ComposerAction {
    private final String a;
    private final JSCaller b;

    public ComposerJavaScriptAction(String str, JSCaller jSCaller) {
        akcr.b(str, "javascriptFunctionName");
        akcr.b(jSCaller, "caller");
        this.a = str;
        this.b = jSCaller;
    }

    public final Object perform(Object[] objArr) {
        akcr.b(objArr, "parameters");
        this.b.call(this.a, objArr);
        return null;
    }
}
