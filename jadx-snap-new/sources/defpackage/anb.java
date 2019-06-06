package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: anb */
public final class anb implements aiq<InputStream, amu> {
    private static final b a = new b();
    private static final a b = new a();
    private final Context c;
    private final b d;
    private final ajr e;
    private final a f;
    private final amt g;

    /* renamed from: anb$b */
    static class b {
        private final Queue<aii> a = aps.a(0);

        b() {
        }

        public final synchronized aii a(byte[] bArr) {
            aii aii;
            aii = (aii) this.a.poll();
            if (aii == null) {
                aii = new aii();
            }
            return aii.a(bArr);
        }

        public final synchronized void a(aii aii) {
            aii.a = null;
            aii.b = null;
            this.a.offer(aii);
        }
    }

    /* renamed from: anb$a */
    static class a {
        private final Queue<aif> a = aps.a(0);

        a() {
        }

        public final synchronized aif a(defpackage.aif.a aVar) {
            aif aif;
            aif = (aif) this.a.poll();
            if (aif == null) {
                aif = new aif(aVar);
            }
            return aif;
        }

        public final synchronized void a(aif aif) {
            aif.f = null;
            aif.e = null;
            aif.b = null;
            aif.c = null;
            if (aif.h != null) {
                aif.g.a(aif.h);
            }
            aif.h = null;
            aif.a = null;
            this.a.offer(aif);
        }
    }

    public anb(Context context, ajr ajr) {
        this(context, ajr, a, b);
    }

    private anb(Context context, ajr ajr, b bVar, a aVar) {
        this.c = context.getApplicationContext();
        this.e = ajr;
        this.f = aVar;
        this.g = new amt(ajr);
        this.d = bVar;
    }

    private amw a(InputStream inputStream, int i, int i2) {
        byte[] a = anb.a(inputStream);
        aii a2 = this.d.a(a);
        aif a3 = this.f.a(this.g);
        try {
            aih a4 = a2.a();
            amw amw = null;
            if (a4.c > 0) {
                if (a4.b == 0) {
                    a3.a(a4, a);
                    a3.a();
                    Bitmap c = a3.c();
                    if (c != null) {
                        amw = new amw(new amu(this.c, this.g, this.e, (alt) alt.a, i, i2, a4, a, c));
                    }
                }
            }
            this.d.a(a2);
            this.f.a(a3);
            return amw;
        } catch (Throwable th) {
            this.d.a(a2);
            this.f.a(a3);
        }
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e) {
            Log.w("GifResourceDecoder", "Error reading data from stream", e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final String a() {
        return "";
    }
}
