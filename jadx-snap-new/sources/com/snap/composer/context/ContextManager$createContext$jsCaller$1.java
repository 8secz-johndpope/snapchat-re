package com.snap.composer.context;

import com.snap.composer.actions.JSCaller;
import com.snap.composer.nativebridge.ContextNative;
import defpackage.akcr;

public final class ContextManager$createContext$jsCaller$1 implements JSCaller {
    private /* synthetic */ ContextNative a;

    ContextManager$createContext$jsCaller$1(ContextNative contextNative) {
        this.a = contextNative;
    }

    public final void call(String str, Object[] objArr) {
        akcr.b(str, "function");
        akcr.b(objArr, "parameters");
        this.a.callJSFunction(str, objArr);
    }
}
