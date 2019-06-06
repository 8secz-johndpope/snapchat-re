package com.snapchat.client.composer.utils;

import com.snapchat.client.composer.NativeBridge;

public class CppObjectWrapper extends NativeHandleWrapper {
    public CppObjectWrapper(long j) {
        super(j);
    }

    /* Access modifiers changed, original: protected */
    public void destroyHandle(long j) {
        NativeBridge.deleteNativeHandle(j);
    }
}
