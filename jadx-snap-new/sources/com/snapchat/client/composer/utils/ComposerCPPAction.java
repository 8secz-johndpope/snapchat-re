package com.snapchat.client.composer.utils;

import com.snap.composer.actions.ComposerAction;
import com.snapchat.client.composer.NativeBridge;

public class ComposerCPPAction extends CppObjectWrapper implements ComposerAction {
    public ComposerCPPAction(long j) {
        super(j);
    }

    public Object perform(Object[] objArr) {
        if (getNativeHandle() != 0) {
            return NativeBridge.performAction(getNativeHandle(), objArr);
        }
        throw new RuntimeException("Cannot call action: native handle was already destroyed.");
    }
}
