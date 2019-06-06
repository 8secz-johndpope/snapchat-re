package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public abstract class ByteSink {

    final class AsCharSink extends CharSink {
        private final Charset charset;

        private AsCharSink(Charset charset) {
            this.charset = (Charset) Preconditions.checkNotNull(charset);
        }

        public final Writer openStream() {
            return new OutputStreamWriter(ByteSink.this.openStream(), this.charset);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ByteSink.this.toString());
            stringBuilder.append(".asCharSink(");
            stringBuilder.append(this.charset);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    protected ByteSink() {
    }

    public CharSink asCharSink(Charset charset) {
        return new AsCharSink(charset);
    }

    public abstract OutputStream openStream();

    public void write(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Closer create = Closer.create();
        try {
            OutputStream outputStream = (OutputStream) create.register(openStream());
            outputStream.write(bArr);
            outputStream.flush();
            create.close();
        } catch (Throwable th) {
            create.close();
        }
    }
}
