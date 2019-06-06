package com.snapchat.laguna.crypto.internal;

import android.content.Context;

public class h {
    public static void a(Context context) {
        System.loadLibrary("c++_shared");
        System.loadLibrary("lagunacrypto");
        b(context);
    }

    private static native void b(Context context);
}
