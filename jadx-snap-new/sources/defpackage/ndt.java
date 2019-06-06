package defpackage;

import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ndt */
public final class ndt implements ndm {
    private static final String n = n;
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicBoolean b = new AtomicBoolean(false);
    private AtomicReference<ndf> c = new AtomicReference();
    private AtomicReference<ncy> d = new AtomicReference();
    private AtomicReference<ncy> e = new AtomicReference();
    private String f = "";
    private final LocationManager g;
    private final abkb h;
    private final GoogleApiClient i;
    private final Handler j;
    private final abka k;
    private final ajwy<nbt> l;
    private final ncc m;

    /* renamed from: ndt$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ndt(LocationManager locationManager, abkb abkb, GoogleApiClient googleApiClient, Handler handler, abka abka, ajwy<nbt> ajwy, ncc ncc) {
        akcr.b(locationManager, "locationManager");
        akcr.b(abkb, "locationParamsProvider");
        akcr.b(googleApiClient, "apiClient");
        akcr.b(handler, "handler");
        akcr.b(abka, "locationParamsEngine");
        akcr.b(ajwy, "locationApiListenerProvider");
        akcr.b(ncc, "locationPermissionsProvider");
        this.g = locationManager;
        this.h = abkb;
        this.i = googleApiClient;
        this.j = handler;
        this.k = abka;
        this.l = ajwy;
        this.m = ncc;
    }

    private final ncy a(String str) {
        Looper looper = this.j.getLooper();
        try {
            if (this.g.getProvider(str) != null) {
                ncy ncy = new ncy(str, this.g, looper, this.k, this.m, this.l);
                this.h.a(ncy);
                return ncy;
            }
        } catch (IllegalArgumentException | SecurityException unused) {
        }
        return null;
    }

    private final void a(abpt<ndo> abpt, AtomicReference<ncy> atomicReference, String str) {
        ncy ncy = (ncy) atomicReference.get();
        if (ncy == null) {
            ncy a = a(str);
            if (a != null) {
                abpt.c(a);
                atomicReference.set(a);
            }
            return;
        }
        abpt.c(ncy);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061 A:{Catch:{ Exception -> 0x007b }} */
    public final defpackage.abpt<defpackage.ndo> a() {
        /*
        r8 = this;
        r0 = new abpt;
        r0.<init>();
        r1 = r8.c;	 Catch:{ Exception -> 0x007b }
        r1 = r1.get();	 Catch:{ Exception -> 0x007b }
        r1 = (defpackage.ndf) r1;	 Catch:{ Exception -> 0x007b }
        if (r1 != 0) goto L_0x0034;
    L_0x000f:
        r1 = new ndf;	 Catch:{ Exception -> 0x007b }
        r3 = r8.i;	 Catch:{ Exception -> 0x007b }
        r4 = r8.k;	 Catch:{ Exception -> 0x007b }
        r5 = r8.l;	 Catch:{ Exception -> 0x007b }
        r6 = r8.m;	 Catch:{ Exception -> 0x007b }
        r2 = r8.j;	 Catch:{ Exception -> 0x007b }
        r7 = r2.getLooper();	 Catch:{ Exception -> 0x007b }
        r2 = r1;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x007b }
        r2 = r8.h;	 Catch:{ Exception -> 0x007b }
        r3 = r1;
        r3 = (defpackage.abkb.c) r3;	 Catch:{ Exception -> 0x007b }
        r2.a(r3);	 Catch:{ Exception -> 0x007b }
        r0.c(r1);	 Catch:{ Exception -> 0x007b }
        r2 = r8.c;	 Catch:{ Exception -> 0x007b }
        r2.set(r1);	 Catch:{ Exception -> 0x007b }
        goto L_0x0037;
    L_0x0034:
        r0.c(r1);	 Catch:{ Exception -> 0x007b }
    L_0x0037:
        r1 = r8.a;	 Catch:{ Exception -> 0x007b }
        r1 = r1.get();	 Catch:{ Exception -> 0x007b }
        r2 = "gps";
        r3 = "network";
        if (r1 != 0) goto L_0x0055;
    L_0x0043:
        r1 = r8.b;	 Catch:{ Exception -> 0x007b }
        r1 = r1.get();	 Catch:{ Exception -> 0x007b }
        if (r1 == 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0055;
    L_0x004c:
        r1 = "NETWORK_PROVIDER";
        r8.f = r1;	 Catch:{ Exception -> 0x007b }
        r1 = new java.lang.String[]{r3};	 Catch:{ Exception -> 0x007b }
        goto L_0x005d;
    L_0x0055:
        r1 = "NETWORK_PROVIDER and GPS_PROVIDER";
        r8.f = r1;	 Catch:{ Exception -> 0x007b }
        r1 = new java.lang.String[]{r3, r2};	 Catch:{ Exception -> 0x007b }
    L_0x005d:
        r4 = r1.length;	 Catch:{ Exception -> 0x007b }
        r5 = 0;
    L_0x005f:
        if (r5 >= r4) goto L_0x007b;
    L_0x0061:
        r6 = r1[r5];	 Catch:{ Exception -> 0x007b }
        r7 = defpackage.akcr.a(r6, r3);	 Catch:{ Exception -> 0x007b }
        if (r7 == 0) goto L_0x006f;
    L_0x0069:
        r7 = r8.d;	 Catch:{ Exception -> 0x007b }
    L_0x006b:
        r8.a(r0, r7, r6);	 Catch:{ Exception -> 0x007b }
        goto L_0x0078;
    L_0x006f:
        r7 = defpackage.akcr.a(r6, r2);	 Catch:{ Exception -> 0x007b }
        if (r7 == 0) goto L_0x0078;
    L_0x0075:
        r7 = r8.e;	 Catch:{ Exception -> 0x007b }
        goto L_0x006b;
    L_0x0078:
        r5 = r5 + 1;
        goto L_0x005f;
    L_0x007b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndt.a():abpt");
    }

    public final void a(StringBuilder stringBuilder) {
        akcr.b(stringBuilder, "builder");
        stringBuilder.append(n);
        String str = "\n";
        stringBuilder.append(str);
        StringBuilder stringBuilder2 = new StringBuilder("Started [");
        stringBuilder2.append(this.f);
        stringBuilder2.append(']');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(str);
        stringBuilder2 = new StringBuilder("Is in map [");
        stringBuilder2.append(this.a.get());
        stringBuilder2.append(']');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(str);
        stringBuilder2 = new StringBuilder("Is polling gps [");
        stringBuilder2.append(this.b.get());
        stringBuilder2.append(']');
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append(str);
    }

    public final void a(boolean z) {
        this.k.a(z);
        this.a.set(z);
    }

    public final void b(boolean z) {
        this.k.b(z);
        this.b.set(z);
    }
}
