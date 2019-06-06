package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class ByteSource {
    protected ByteSource() {
    }

    public long copyTo(ByteSink byteSink) {
        Preconditions.checkNotNull(byteSink);
        Closer create = Closer.create();
        try {
            long copy = ByteStreams.copy((InputStream) create.register(openStream()), (OutputStream) create.register(byteSink.openStream()));
            create.close();
            return copy;
        } catch (Throwable th) {
            create.close();
        }
    }

    public abstract InputStream openStream();
}
