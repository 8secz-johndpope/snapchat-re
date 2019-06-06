package com.snap.composer.utils;

import defpackage.akaw;
import defpackage.akcr;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ByteBufferUtils {
    public static final ByteBufferUtils INSTANCE = new ByteBufferUtils();

    private ByteBufferUtils() {
    }

    public final ByteBuffer fromStream(InputStream inputStream) {
        akcr.b(inputStream, "inputStream");
        byte[] a = akaw.a(inputStream);
        Object allocateDirect = ByteBuffer.allocateDirect(a.length);
        allocateDirect.put(a);
        akcr.a(allocateDirect, "output");
        return allocateDirect;
    }
}
