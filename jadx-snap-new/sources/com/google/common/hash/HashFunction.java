package com.google.common.hash;

import java.nio.charset.Charset;

public interface HashFunction {
    HashCode hashString(CharSequence charSequence, Charset charset);

    HashCode hashUnencodedChars(CharSequence charSequence);

    Hasher newHasher();
}
