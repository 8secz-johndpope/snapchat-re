package defpackage;

import java.io.File;
import java.io.InputStream;

/* renamed from: amr */
public final class amr<T> implements aiq<File, T> {
    private static final a a = new a();
    private aiq<InputStream, T> b;
    private final a c;

    /* renamed from: amr$a */
    static class a {
        a() {
        }
    }

    public amr(aiq<InputStream, T> aiq) {
        this(aiq, a);
    }

    private amr(aiq<InputStream, T> aiq, a aVar) {
        this.b = aiq;
        this.c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0016 A:{SYNTHETIC, Splitter:B:13:0x0016} */
    private defpackage.ajn<T> a(java.io.File r3, int r4, int r5) {
        /*
        r2 = this;
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ all -> 0x0013 }
        r1.<init>(r3);	 Catch:{ all -> 0x0013 }
        r3 = r2.b;	 Catch:{ all -> 0x0010 }
        r3 = r3.a(r1, r4, r5);	 Catch:{ all -> 0x0010 }
        r1.close();	 Catch:{ IOException -> 0x000f }
    L_0x000f:
        return r3;
    L_0x0010:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0014;
    L_0x0013:
        r3 = move-exception;
    L_0x0014:
        if (r0 == 0) goto L_0x0019;
    L_0x0016:
        r0.close();	 Catch:{ IOException -> 0x0019 }
    L_0x0019:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amr.a(java.io.File, int, int):ajn");
    }

    public final String a() {
        return "";
    }
}
