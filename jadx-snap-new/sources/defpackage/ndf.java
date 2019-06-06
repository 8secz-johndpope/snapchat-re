package defpackage;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import defpackage.abkb.b;
import defpackage.ndb.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ndf */
public final class ndf extends ndo implements ConnectionCallbacks, OnConnectionFailedListener, LocationListener {
    private final GoogleApiClient e;
    private final LocationRequest f;
    private final ncc g;
    private final ndp h;
    private final AtomicBoolean i;
    private final Looper j;
    private boolean k;
    private final FusedLocationProviderApi l;
    private volatile int m;
    private final AtomicBoolean n;

    public ndf(GoogleApiClient googleApiClient, abka abka, ajwy<nbt> ajwy, ncc ncc, Looper looper) {
        this(LocationServices.FusedLocationApi, googleApiClient, b.a, a.a, ndv.a, abka, ncc, new ndd(), ajwy, looper);
    }

    private ndf(FusedLocationProviderApi fusedLocationProviderApi, GoogleApiClient googleApiClient, abkb abkb, ndx ndx, ndv ndv, abka abka, ncc ncc, ndp ndp, ajwy<nbt> ajwy, Looper looper) {
        super("Google_API", ndx, ndv, abka, ajwy);
        this.i = new AtomicBoolean(false);
        this.k = false;
        this.m = 105;
        this.n = new AtomicBoolean(false);
        this.g = ncc;
        this.h = ndp;
        this.l = fusedLocationProviderApi;
        this.e = googleApiClient;
        LocationRequest a = this.h.a();
        a.setInterval(this.d.b(this.c));
        a.setFastestInterval(this.d.c(this.c));
        a.setPriority(this.d.a(this.c));
        this.f = a;
        abkb abkb2 = abkb;
        abkb.a(this);
        this.j = looper;
    }

    private void a(int i) {
        synchronized (this.n) {
            this.m = i;
            nbt d = d();
            if (d != null) {
                d.b(nbu.a(i));
            }
            this.n.set(true);
        }
    }

    private void g() {
        this.f.setInterval(this.d.b(this.c));
        this.f.setFastestInterval(this.d.c(this.c));
        this.f.setPriority(this.d.a(this.c));
    }

    private void h() {
        synchronized (this.n) {
            if (this.n.get()) {
                nbt d = d();
                if (d != null) {
                    d.c(nbu.a(this.m));
                }
            }
            this.n.set(false);
        }
    }

    private void i() {
        GoogleApiClient googleApiClient;
        synchronized (this.e) {
            googleApiClient = this.e;
        }
        if (googleApiClient.isConnected() && this.i.get() && !this.k && this.g.a()) {
            try {
                g();
                this.l.removeLocationUpdates(googleApiClient, this);
                h();
                this.l.requestLocationUpdates(googleApiClient, this.f, this, this.j);
                a(this.f.getPriority());
                this.k = true;
            } catch (SecurityException unused) {
            } catch (IllegalStateException e) {
                e.getLocalizedMessage();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(Location location) {
        return nbu.a(this.m);
    }

    public final void a() {
        if (this.i.compareAndSet(true, false)) {
            GoogleApiClient googleApiClient;
            synchronized (this.e) {
                googleApiClient = this.e;
            }
            if (googleApiClient.isConnected()) {
                googleApiClient.unregisterConnectionFailedListener(this);
                googleApiClient.unregisterConnectionCallbacks(this);
                synchronized (this.e) {
                    googleApiClient = this.e;
                }
                if (googleApiClient.isConnected() && !this.i.get() && this.k) {
                    try {
                        this.l.removeLocationUpdates(googleApiClient, this);
                        h();
                        this.k = false;
                    } catch (IllegalStateException unused) {
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.g.a() && this.i.compareAndSet(false, true)) {
            GoogleApiClient googleApiClient;
            synchronized (this.e) {
                googleApiClient = this.e;
            }
            if (googleApiClient.isConnected()) {
                synchronized (this.b) {
                    if (this.b.isEmpty() && this.g.a()) {
                        Object obj = null;
                        try {
                            obj = this.l.getLastLocation(googleApiClient);
                        } catch (IllegalStateException | SecurityException unused) {
                        }
                        if (obj != null) {
                            this.b.add(obj);
                        }
                    }
                }
                i();
                return;
            }
            googleApiClient.registerConnectionCallbacks(this);
            googleApiClient.registerConnectionFailedListener(this);
            googleApiClient.connect();
        }
    }

    public final Location c() {
        Location c = super.c();
        if (c == null && this.g.a()) {
            GoogleApiClient googleApiClient;
            synchronized (this.e) {
                googleApiClient = this.e;
            }
            try {
                c = this.l.getLastLocation(googleApiClient);
                return c;
            } catch (IllegalStateException | SecurityException unused) {
            }
        }
        return c;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002b */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|(3:10|11|(2:13|(1:15)))|16|17) */
    public final void onConnected(android.os.Bundle r3) {
        /*
        r2 = this;
        r3 = r2.e;
        r3.unregisterConnectionFailedListener(r2);
        r3 = r2.e;
        monitor-enter(r3);
        r0 = r2.e;	 Catch:{ all -> 0x0033 }
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        r1 = r2.b;
        monitor-enter(r1);
        r3 = r2.b;	 Catch:{ all -> 0x0030 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0030 }
        if (r3 == 0) goto L_0x002b;
    L_0x0016:
        r3 = r2.g;	 Catch:{ IllegalStateException | SecurityException -> 0x002b, IllegalStateException | SecurityException -> 0x002b }
        r3 = r3.a();	 Catch:{ IllegalStateException | SecurityException -> 0x002b, IllegalStateException | SecurityException -> 0x002b }
        if (r3 == 0) goto L_0x002b;
    L_0x001e:
        r3 = r2.l;	 Catch:{ IllegalStateException | SecurityException -> 0x002b, IllegalStateException | SecurityException -> 0x002b }
        r3 = r3.getLastLocation(r0);	 Catch:{ IllegalStateException | SecurityException -> 0x002b, IllegalStateException | SecurityException -> 0x002b }
        if (r3 == 0) goto L_0x002b;
    L_0x0026:
        r0 = r2.b;	 Catch:{ IllegalStateException | SecurityException -> 0x002b, IllegalStateException | SecurityException -> 0x002b }
        r0.add(r3);	 Catch:{ IllegalStateException | SecurityException -> 0x002b, IllegalStateException | SecurityException -> 0x002b }
    L_0x002b:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        r2.i();
        return;
    L_0x0030:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        throw r3;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0033 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndf.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        GoogleApiClient googleApiClient;
        synchronized (this.e) {
            googleApiClient = this.e;
        }
        googleApiClient.unregisterConnectionFailedListener(this);
        googleApiClient.unregisterConnectionCallbacks(this);
    }

    public final void onConnectionSuspended(int i) {
        GoogleApiClient googleApiClient;
        GoogleApiClient googleApiClient2;
        synchronized (this.e) {
            googleApiClient = this.e;
        }
        synchronized (this.e) {
            googleApiClient2 = this.e;
        }
        if (googleApiClient2.isConnected() && this.i.get() && this.k) {
            try {
                this.l.removeLocationUpdates(googleApiClient2, this);
                h();
                this.k = false;
            } catch (IllegalStateException unused) {
            }
        }
        googleApiClient.registerConnectionFailedListener(this);
        googleApiClient.connect();
    }
}
