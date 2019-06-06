package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: akr */
public class akr {
    public final InputStream a;
    public final ParcelFileDescriptor b;

    public akr(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = inputStream;
        this.b = parcelFileDescriptor;
    }
}
