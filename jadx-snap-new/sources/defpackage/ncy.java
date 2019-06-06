package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ndb.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ncy */
public final class ncy extends ndo implements LocationListener {
    private final a e;
    private final Looper f;
    private final Object g;
    private final ncc h;
    private boolean i;
    private boolean j;
    private final AtomicBoolean k;

    /* renamed from: ncy$a */
    static class a {
        final LocationManager a;

        a(LocationManager locationManager) {
            this.a = locationManager;
        }

        private boolean b(String str) {
            try {
                return this.a.isProviderEnabled(str);
            } catch (RuntimeException unused) {
                return false;
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(ncy ncy) {
            try {
                this.a.removeUpdates(ncy);
            } catch (RuntimeException unused) {
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean a(String str) {
            try {
                return b(str);
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    public ncy(String str, LocationManager locationManager, Looper looper, abka abka, ncc ncc, ajwy<nbt> ajwy) {
        this(str, locationManager, looper, a.a, ndv.a, abka, ncc, ajwy);
    }

    private ncy(String str, LocationManager locationManager, Looper looper, ndx ndx, ndv ndv, abka abka, ncc ncc, ajwy<nbt> ajwy) {
        super(str, ndx, ndv, abka, ajwy);
        this.g = new Object();
        this.i = false;
        this.j = false;
        this.k = new AtomicBoolean(false);
        this.e = new a(locationManager);
        this.f = looper;
        this.h = ncc;
    }

    private void a(String str) {
        nbt d = d();
        synchronized (this.g) {
            if (d != null) {
                d.b(nbu.a(str));
            }
            this.j = true;
        }
    }

    private void b(String str) {
        synchronized (this.g) {
            if (this.j) {
                nbt d = d();
                if (d != null) {
                    d.c(nbu.a(str));
                }
            }
            this.j = false;
        }
    }

    private void g() {
        a aVar = this.e;
        String str = this.a;
        long d = this.d.d(this.c);
        this.d.e(this.c);
        try {
            aVar.a.requestLocationUpdates(str, d, MapboxConstants.MINIMUM_ZOOM, this, this.f);
        } catch (RemoteException | RuntimeException unused) {
        }
    }

    private boolean h() {
        return this.h.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(Location location) {
        return nbu.a(location.getProvider());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    public final void a() {
        /*
        r3 = this;
        r0 = "stopLocationTracking must be called from a bg thread";
        defpackage.abmr.a(r0);
        r0 = r3.k;
        r1 = 0;
        r2 = 1;
        r0 = r0.compareAndSet(r2, r1);
        if (r0 == 0) goto L_0x0029;
    L_0x000f:
        r0 = r3.g;
        monitor-enter(r0);
        r2 = r3.i;	 Catch:{ all -> 0x0026 }
        if (r2 != 0) goto L_0x0018;
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        return;
    L_0x0018:
        r2 = r3.a;	 Catch:{ all -> 0x0026 }
        r3.b(r2);	 Catch:{ all -> 0x0026 }
        r2 = r3.e;	 Catch:{ all -> 0x0026 }
        r2.a(r3);	 Catch:{ RemoteException -> 0x0022 }
    L_0x0022:
        r3.i = r1;	 Catch:{ all -> 0x0026 }
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        return;
    L_0x0026:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        throw r1;
    L_0x0029:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncy.a():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002e */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|17|18|19|20) */
    /* JADX WARNING: Missing block: B:22:0x0040, code skipped:
            return;
     */
    public final void b() {
        /*
        r4 = this;
        r0 = "startLocationTracking must be called from a bg thread";
        defpackage.abmr.a(r0);
        r0 = r4.k;
        r1 = 1;
        r2 = 0;
        r0 = r0.compareAndSet(r2, r1);
        if (r0 == 0) goto L_0x0044;
    L_0x000f:
        r0 = r4.g;
        monitor-enter(r0);
        r2 = r4.i;	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x0018;
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        return;
    L_0x0018:
        r2 = r4.e;	 Catch:{ all -> 0x0041 }
        r3 = r4.a;	 Catch:{ all -> 0x0041 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x003f;
    L_0x0022:
        r2 = r4.h();	 Catch:{ all -> 0x0041 }
        if (r2 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x003f;
    L_0x0029:
        r2 = r4.e;	 Catch:{ all -> 0x0041 }
        r2.a(r4);	 Catch:{ RemoteException -> 0x002e }
    L_0x002e:
        r2 = r4.a;	 Catch:{ all -> 0x0041 }
        r4.b(r2);	 Catch:{ all -> 0x0041 }
        r4.g();	 Catch:{ all -> 0x0041 }
        r2 = r4.a;	 Catch:{ all -> 0x0041 }
        r4.a(r2);	 Catch:{ all -> 0x0041 }
        r4.i = r1;	 Catch:{ all -> 0x0041 }
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        return;
    L_0x003f:
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        return;
    L_0x0041:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        throw r1;
    L_0x0044:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncy.b():void");
    }

    public final void onProviderDisabled(String str) {
        synchronized (this.g) {
            this.i = false;
        }
    }

    public final void onProviderEnabled(String str) {
        b();
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
