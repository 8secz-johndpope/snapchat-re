package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: akq */
public final class akq<A> implements akw<A, akr> {
    private final akw<A, InputStream> a;
    private final akw<A, ParcelFileDescriptor> b;

    /* renamed from: akq$a */
    static class a implements aiv<akr> {
        private final aiv<InputStream> a;
        private final aiv<ParcelFileDescriptor> b;

        public a(aiv<InputStream> aiv, aiv<ParcelFileDescriptor> aiv2) {
            this.a = aiv;
            this.b = aiv2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0026 A:{SYNTHETIC, Splitter:B:14:0x0026} */
        private defpackage.akr b(defpackage.aia r6) {
            /*
            r5 = this;
            r0 = r5.a;
            r1 = 2;
            r2 = 0;
            r3 = "IVML";
            if (r0 == 0) goto L_0x0021;
        L_0x0008:
            r0 = r0.a(r6);	 Catch:{ Exception -> 0x000f }
            r0 = (java.io.InputStream) r0;	 Catch:{ Exception -> 0x000f }
            goto L_0x0022;
        L_0x000f:
            r0 = move-exception;
            r4 = android.util.Log.isLoggable(r3, r1);
            if (r4 == 0) goto L_0x001b;
        L_0x0016:
            r4 = "Exception fetching input stream, trying ParcelFileDescriptor";
            android.util.Log.v(r3, r4, r0);
        L_0x001b:
            r4 = r5.b;
            if (r4 == 0) goto L_0x0020;
        L_0x001f:
            goto L_0x0021;
        L_0x0020:
            throw r0;
        L_0x0021:
            r0 = r2;
        L_0x0022:
            r4 = r5.b;
            if (r4 == 0) goto L_0x003d;
        L_0x0026:
            r6 = r4.a(r6);	 Catch:{ Exception -> 0x002d }
            r6 = (android.os.ParcelFileDescriptor) r6;	 Catch:{ Exception -> 0x002d }
            goto L_0x003e;
        L_0x002d:
            r6 = move-exception;
            r1 = android.util.Log.isLoggable(r3, r1);
            if (r1 == 0) goto L_0x0039;
        L_0x0034:
            r1 = "Exception fetching ParcelFileDescriptor";
            android.util.Log.v(r3, r1, r6);
        L_0x0039:
            if (r0 == 0) goto L_0x003c;
        L_0x003b:
            goto L_0x003d;
        L_0x003c:
            throw r6;
        L_0x003d:
            r6 = r2;
        L_0x003e:
            r1 = new akr;
            r1.<init>(r0, r6);
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akq$a.b(aia):akr");
        }

        public final /* synthetic */ Object a(aia aia) {
            return b(aia);
        }

        public final void a() {
            aiv aiv = this.a;
            if (aiv != null) {
                aiv.a();
            }
            aiv = this.b;
            if (aiv != null) {
                aiv.a();
            }
        }

        public final String b() {
            aiv aiv = this.a;
            return aiv != null ? aiv.b() : this.b.b();
        }

        public final void c() {
            aiv aiv = this.a;
            if (aiv != null) {
                aiv.c();
            }
            aiv = this.b;
            if (aiv != null) {
                aiv.c();
            }
        }
    }

    public akq(akw<A, InputStream> akw, akw<A, ParcelFileDescriptor> akw2) {
        if (akw == null && akw2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.a = akw;
        this.b = akw2;
    }

    public final aiv<akr> a(A a, int i, int i2) {
        akw akw = this.a;
        aiv a2 = akw != null ? akw.a(a, i, i2) : null;
        akw akw2 = this.b;
        aiv a3 = akw2 != null ? akw2.a(a, i, i2) : null;
        return (a2 == null && a3 == null) ? null : new a(a2, a3);
    }
}
