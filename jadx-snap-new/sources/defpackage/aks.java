package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: aks */
public final class aks implements ain<akr> {
    private final ain<InputStream> a;
    private final ain<ParcelFileDescriptor> b;
    private String c;

    public aks(ain<InputStream> ain, ain<ParcelFileDescriptor> ain2) {
        this.a = ain;
        this.b = ain2;
    }

    public final String a() {
        if (this.c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.a());
            stringBuilder.append(this.b.a());
            this.c = stringBuilder.toString();
        }
        return this.c;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        ain ain;
        akr akr = (akr) obj;
        if (akr.a != null) {
            ain = this.a;
            obj = akr.a;
        } else {
            ain = this.b;
            obj = akr.b;
        }
        return ain.a(obj, outputStream);
    }
}
