package com.snapchat.laguna.crypto;

import android.content.Context;
import com.snapchat.laguna.crypto.internal.h;

public class LibLagunaCrypto {
    public static void loadLibrary(Context context) {
        h.a(context);
    }
}
