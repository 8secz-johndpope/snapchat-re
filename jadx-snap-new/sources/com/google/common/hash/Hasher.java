package com.google.common.hash;

import java.nio.charset.Charset;

public interface Hasher {
    HashCode hash();

    Hasher putByte(byte b);

    Hasher putBytes(byte[] bArr, int i, int i2);

    Hasher putString(CharSequence charSequence, Charset charset);

    Hasher putUnencodedChars(CharSequence charSequence);
}
