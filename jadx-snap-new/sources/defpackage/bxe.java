package defpackage;

import android.net.Uri;

/* renamed from: bxe */
public interface bxe {

    /* renamed from: bxe$a */
    public interface a {
        bxe createDataSource();
    }

    void close();

    Uri getUri();

    long open(bxh bxh);

    int read(byte[] bArr, int i, int i2);
}
