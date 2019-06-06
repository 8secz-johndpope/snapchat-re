package com.looksery.sdk.media;

import android.net.Uri;
import com.looksery.sdk.io.ResourceResolver;
import defpackage.bxe;
import defpackage.bxe.a;
import defpackage.bxh;
import java.io.EOFException;
import java.io.InputStream;

final class FileDescriptorDataSource implements bxe {
    private long bytesRemaining;
    private InputStream inputStream;
    private final ResourceResolver resourceResolver;
    private Uri uri;

    static final class Factory implements a {
        private final ResourceResolver resourceResolver;

        Factory(ResourceResolver resourceResolver) {
            this.resourceResolver = resourceResolver;
        }

        public final bxe createDataSource() {
            return new FileDescriptorDataSource(this.resourceResolver);
        }
    }

    private FileDescriptorDataSource(ResourceResolver resourceResolver) {
        this.resourceResolver = resourceResolver;
    }

    public final void close() {
        try {
            if (this.inputStream != null) {
                this.inputStream.close();
            }
            this.uri = null;
            this.inputStream = null;
            this.bytesRemaining = 0;
        } catch (Throwable th) {
            this.uri = null;
            this.inputStream = null;
            this.bytesRemaining = 0;
        }
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final long open(bxh bxh) {
        this.uri = bxh.a;
        this.inputStream = this.resourceResolver.openResourceFd(this.uri).createInputStream();
        if (this.inputStream.skip(bxh.d) >= bxh.d) {
            this.bytesRemaining = bxh.e != -1 ? bxh.e : (long) this.inputStream.available();
            if (this.bytesRemaining == 2147483647L) {
                this.bytesRemaining = -1;
            }
            return this.bytesRemaining;
        }
        throw new EOFException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        int read;
        if (j == -1) {
            read = this.inputStream.read(bArr, i, i2);
            return read == -1 ? -1 : read;
        } else {
            read = this.inputStream.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read == -1) {
                return -1;
            }
            this.bytesRemaining -= (long) read;
            return read;
        }
    }
}
