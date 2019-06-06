package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;

public final class ByteStreams {
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream() {
        public final String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public final void write(int i) {
        }

        public final void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(bArr);
        }
    };

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] createBuffer = createBuffer();
        long j = 0;
        while (true) {
            int read = inputStream.read(createBuffer);
            if (read == -1) {
                return j;
            }
            outputStream.write(createBuffer, 0, read);
            j += (long) read;
        }
    }

    static byte[] createBuffer() {
        return new byte[8192];
    }
}
