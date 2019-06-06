package defpackage;

import android.graphics.Bitmap;
import java.io.InputStream;

/* renamed from: anf */
public final class anf implements aiq<akr, and> {
    private static final b a = new b();
    private static final a b = new a();
    private final aiq<akr, Bitmap> c;
    private final aiq<InputStream, amu> d;
    private final ajr e;
    private final b f;
    private final a g;
    private String h;

    /* renamed from: anf$b */
    static class b {
        b() {
        }
    }

    /* renamed from: anf$a */
    static class a {
        a() {
        }
    }

    public anf(aiq<akr, Bitmap> aiq, aiq<InputStream, amu> aiq2, ajr ajr) {
        this(aiq, aiq2, ajr, a, b);
    }

    private anf(aiq<akr, Bitmap> aiq, aiq<InputStream, amu> aiq2, ajr ajr, b bVar, a aVar) {
        this.c = aiq;
        this.d = aiq2;
        this.e = ajr;
        this.f = bVar;
        this.g = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058 A:{Catch:{ all -> 0x0074 }} */
    private defpackage.ajn<defpackage.and> a(defpackage.akr r9, int r10, int r11) {
        /*
        r8 = this;
        r0 = defpackage.apl.a;
        r1 = r0.a();
        r2 = r9.a;	 Catch:{ all -> 0x0074 }
        r3 = 0;
        if (r2 == 0) goto L_0x0064;
    L_0x000b:
        r2 = r9.a;	 Catch:{ all -> 0x0074 }
        r4 = new ami;	 Catch:{ all -> 0x0074 }
        r4.<init>(r2, r1);	 Catch:{ all -> 0x0074 }
        r2 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r4.mark(r2);	 Catch:{ all -> 0x0074 }
        r2 = new amf;	 Catch:{ all -> 0x0074 }
        r2.<init>(r4);	 Catch:{ all -> 0x0074 }
        r2 = r2.a();	 Catch:{ all -> 0x0074 }
        r4.reset();	 Catch:{ all -> 0x0074 }
        r5 = defpackage.amf.a.GIF;	 Catch:{ all -> 0x0074 }
        if (r2 != r5) goto L_0x0055;
    L_0x0027:
        r2 = r8.d;	 Catch:{ all -> 0x0074 }
        r2 = r2.a(r4, r10, r11);	 Catch:{ all -> 0x0074 }
        if (r2 == 0) goto L_0x0055;
    L_0x002f:
        r5 = r2.a();	 Catch:{ all -> 0x0074 }
        r5 = (defpackage.amu) r5;	 Catch:{ all -> 0x0074 }
        r6 = r5.b;	 Catch:{ all -> 0x0074 }
        r6 = r6.f;	 Catch:{ all -> 0x0074 }
        r6 = r6.c;	 Catch:{ all -> 0x0074 }
        r7 = 1;
        if (r6 <= r7) goto L_0x0044;
    L_0x003e:
        r5 = new and;	 Catch:{ all -> 0x0074 }
        r5.<init>(r3, r2);	 Catch:{ all -> 0x0074 }
        goto L_0x0056;
    L_0x0044:
        r2 = new alw;	 Catch:{ all -> 0x0074 }
        r5 = r5.a;	 Catch:{ all -> 0x0074 }
        r5 = r5.i;	 Catch:{ all -> 0x0074 }
        r6 = r8.e;	 Catch:{ all -> 0x0074 }
        r2.<init>(r5, r6);	 Catch:{ all -> 0x0074 }
        r5 = new and;	 Catch:{ all -> 0x0074 }
        r5.<init>(r2, r3);	 Catch:{ all -> 0x0074 }
        goto L_0x0056;
    L_0x0055:
        r5 = r3;
    L_0x0056:
        if (r5 != 0) goto L_0x0068;
    L_0x0058:
        r2 = new akr;	 Catch:{ all -> 0x0074 }
        r9 = r9.b;	 Catch:{ all -> 0x0074 }
        r2.<init>(r4, r9);	 Catch:{ all -> 0x0074 }
        r5 = r8.b(r2, r10, r11);	 Catch:{ all -> 0x0074 }
        goto L_0x0068;
    L_0x0064:
        r5 = r8.b(r9, r10, r11);	 Catch:{ all -> 0x0074 }
    L_0x0068:
        r0.a(r1);
        if (r5 == 0) goto L_0x0073;
    L_0x006d:
        r9 = new ane;
        r9.<init>(r5);
        return r9;
    L_0x0073:
        return r3;
    L_0x0074:
        r9 = move-exception;
        r0.a(r1);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anf.a(akr, int, int):ajn");
    }

    private and b(akr akr, int i, int i2) {
        ajn a = this.c.a(akr, i, i2);
        return a != null ? new and(a, null) : null;
    }

    public final String a() {
        if (this.h == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d.a());
            stringBuilder.append(this.c.a());
            this.h = stringBuilder.toString();
        }
        return this.h;
    }
}
