package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import defpackage.aif.a;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: anc */
public final class anc implements air<amu> {
    private static final a a = new a();
    private final a b;
    private final ajr c;
    private final a d;

    /* renamed from: anc$a */
    static class a {
        a() {
        }
    }

    public anc(ajr ajr) {
        this(ajr, a);
    }

    private anc(ajr ajr, a aVar) {
        this.c = ajr;
        this.b = new amt(ajr);
        this.d = aVar;
    }

    private boolean a(ajn<amu> ajn, OutputStream outputStream) {
        long a = apo.a();
        amu amu = (amu) ajn.a();
        ais ais = amu.a.d;
        if (ais instanceof alt) {
            return anc.a(amu.a.b, outputStream);
        }
        byte[] bArr = amu.a.b;
        aii aii = new aii();
        aii.a(bArr);
        aih a2 = aii.a();
        aif aif = new aif(this.b);
        aif.a(a2, bArr);
        aif.a();
        aij aij = new aij();
        if (!aij.a(outputStream)) {
            return false;
        }
        int i = 0;
        while (i < aif.f.c) {
            alw alw = new alw(aif.c(), this.c);
            ajn a3 = ais.a(alw, amu.getIntrinsicWidth(), amu.getIntrinsicHeight());
            if (!alw.equals(a3)) {
                alw.c();
            }
            try {
                if (aij.a((Bitmap) a3.a())) {
                    aij.a = Math.round(((float) aif.a(aif.d)) / 10.0f);
                    aif.a();
                    a3.c();
                    i++;
                } else {
                    a3.c();
                    return false;
                }
            } catch (Throwable th) {
                a3.c();
                throw th;
            }
        }
        boolean a4 = aij.a();
        String str = "GifEncoder";
        if (Log.isLoggable(str, 2)) {
            StringBuilder stringBuilder = new StringBuilder("Encoded gif with ");
            stringBuilder.append(aif.f.c);
            stringBuilder.append(" frames and ");
            stringBuilder.append(amu.a.b.length);
            stringBuilder.append(" bytes in ");
            stringBuilder.append(apo.a(a));
            stringBuilder.append(" ms");
            Log.v(str, stringBuilder.toString());
        }
        return a4;
    }

    private static boolean a(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException e) {
            String str = "GifEncoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to write data to output stream in GifResourceEncoder", e);
            }
            return false;
        }
    }

    public final String a() {
        return "";
    }
}
