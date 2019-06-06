package defpackage;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snapchat.android.framework.misc.AppContext;
import java.util.Locale;

/* renamed from: dii */
public final class dii {
    final diw a;
    final ifb b;
    private long c = 0;
    private int d = 0;
    private NetworkInfo e;
    private final ajwy<div> f;
    private final dhw g;
    private final ajwy<dim> h;
    private final ConnectivityManager i;
    private final dja j;
    private dli k;
    private final Supplier<aabe> l = Suppliers.memoize(new 1());

    /* renamed from: dii$1 */
    class 1 implements Supplier<aabe> {
        1() {
        }

        private aabe a() {
            try {
                return aabe.valueOf(((ifb) Preconditions.checkNotNull(dii.this.b)).c().toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final /* synthetic */ Object get() {
            return a();
        }
    }

    public dii(ajwy<div> ajwy, dhw dhw, ajwy<dim> ajwy2, dja dja, ifb ifb, diw diw) {
        this.f = ajwy;
        this.g = dhw;
        this.h = ajwy2;
        this.b = ifb;
        this.j = dja;
        this.a = diw;
        Application application = AppContext.get();
        this.i = application != null ? (ConnectivityManager) application.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY) : null;
    }

    private aabe c() {
        return (aabe) this.l.get();
    }

    public final String a() {
        dli dli = this.k;
        return dli == null ? null : dli.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0185  */
    public final void a(defpackage.aajt r7) {
        /*
        r6 = this;
        r0 = r6.f;	 Catch:{ all -> 0x018e }
        r0 = r0.get();	 Catch:{ all -> 0x018e }
        r0 = (defpackage.div) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.a;	 Catch:{ all -> 0x018e }
        r7.setSessionId(r0);	 Catch:{ all -> 0x018e }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x018e }
        r0 = (double) r0;
        r2 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r0);
        r0 = r0 / r2;
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ all -> 0x018e }
        r7.setClientTs(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.g;	 Catch:{ all -> 0x018e }
        r0 = r0.a();	 Catch:{ all -> 0x018e }
        r2 = 3;
        r0 = r0 << r2;
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x018e }
        r7.setConnectionDownloadBandwidthBps(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.b;	 Catch:{ all -> 0x018e }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x018e }
        r0 = (defpackage.ifb) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.g();	 Catch:{ all -> 0x018e }
        r7.setOsMinorVersion(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.b;	 Catch:{ all -> 0x018e }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x018e }
        r0 = (defpackage.ifb) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.d();	 Catch:{ all -> 0x018e }
        r7.setOsType(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.b;	 Catch:{ all -> 0x018e }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x018e }
        r0 = (defpackage.ifb) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.i();	 Catch:{ all -> 0x018e }
        r7.setAppBuild(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.b;	 Catch:{ all -> 0x018e }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x018e }
        r0 = (defpackage.ifb) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.f();	 Catch:{ all -> 0x018e }
        r7.setOsVersion(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.b;	 Catch:{ all -> 0x018e }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x018e }
        r0 = (defpackage.ifb) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.j();	 Catch:{ all -> 0x018e }
        r7.setUserAgent(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.b;	 Catch:{ all -> 0x018e }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x018e }
        r0 = (defpackage.ifb) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.h();	 Catch:{ all -> 0x018e }
        r7.setAppVersion(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.b;	 Catch:{ all -> 0x018e }
        r0 = com.google.common.base.Preconditions.checkNotNull(r0);	 Catch:{ all -> 0x018e }
        r0 = (defpackage.ifb) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.e();	 Catch:{ all -> 0x018e }
        r7.setDeviceModel(r0);	 Catch:{ all -> 0x018e }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x018e }
        r2 = r6.c;	 Catch:{ all -> 0x018e }
        r0 = r0 - r2;
        r2 = r6.e;	 Catch:{ all -> 0x018e }
        r3 = 0;
        if (r2 == 0) goto L_0x00b5;
    L_0x00a6:
        r2 = r6.e;	 Catch:{ all -> 0x018e }
        r2 = r2.isConnected();	 Catch:{ all -> 0x018e }
        if (r2 == 0) goto L_0x00b5;
    L_0x00ae:
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x00c9;
    L_0x00b5:
        r0 = r6.i;	 Catch:{ all -> 0x018e }
        if (r0 == 0) goto L_0x00c0;
    L_0x00b9:
        r0 = r6.i;	 Catch:{ all -> 0x018e }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ all -> 0x018e }
        goto L_0x00c1;
    L_0x00c0:
        r0 = r3;
    L_0x00c1:
        r6.e = r0;	 Catch:{ all -> 0x018e }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x018e }
        r6.c = r0;	 Catch:{ all -> 0x018e }
    L_0x00c9:
        r0 = r6.e;	 Catch:{ all -> 0x018e }
        r1 = 1;
        if (r0 == 0) goto L_0x00e9;
    L_0x00ce:
        r0 = r6.e;	 Catch:{ all -> 0x018e }
        r0 = r0.isConnectedOrConnecting();	 Catch:{ all -> 0x018e }
        if (r0 != 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x00e9;
    L_0x00d7:
        r0 = r6.e;	 Catch:{ all -> 0x018e }
        r0 = r0.getType();	 Catch:{ all -> 0x018e }
        if (r0 == 0) goto L_0x00e6;
    L_0x00df:
        if (r0 == r1) goto L_0x00e3;
    L_0x00e1:
        r0 = r3;
        goto L_0x00eb;
    L_0x00e3:
        r0 = defpackage.aagy.WIFI;	 Catch:{ all -> 0x018e }
        goto L_0x00eb;
    L_0x00e6:
        r0 = defpackage.aagy.MOBILE;	 Catch:{ all -> 0x018e }
        goto L_0x00eb;
    L_0x00e9:
        r0 = defpackage.aagy.UNREACHABLE;	 Catch:{ all -> 0x018e }
    L_0x00eb:
        r7.setDeviceConnectivity(r0);	 Catch:{ all -> 0x018e }
        r0 = java.util.Locale.getDefault();	 Catch:{ all -> 0x018e }
        r0 = r0.getLanguage();	 Catch:{ all -> 0x018e }
        r7.setLocale(r0);	 Catch:{ all -> 0x018e }
        r0 = r6.c();	 Catch:{ all -> 0x018e }
        if (r0 == 0) goto L_0x0106;
    L_0x00ff:
        r0 = r6.c();	 Catch:{ all -> 0x018e }
        r7.setAppVariant(r0);	 Catch:{ all -> 0x018e }
    L_0x0106:
        r0 = r6.k;	 Catch:{ all -> 0x018e }
        if (r0 == 0) goto L_0x0114;
    L_0x010a:
        r0 = r6.k;	 Catch:{ all -> 0x018e }
        r0 = r0.c();	 Catch:{ all -> 0x018e }
        if (r0 == 0) goto L_0x0114;
    L_0x0112:
        r0 = 1;
        goto L_0x0115;
    L_0x0114:
        r0 = 0;
    L_0x0115:
        if (r0 == 0) goto L_0x0134;
    L_0x0117:
        r2 = r6.k;	 Catch:{ all -> 0x018e }
        if (r2 != 0) goto L_0x011d;
    L_0x011b:
        r2 = r3;
        goto L_0x0123;
    L_0x011d:
        r2 = r6.k;	 Catch:{ all -> 0x018e }
        r2 = r2.d();	 Catch:{ all -> 0x018e }
    L_0x0123:
        r7.setHasBitmoji(r2);	 Catch:{ all -> 0x018e }
        r2 = r6.k;	 Catch:{ all -> 0x018e }
        if (r2 != 0) goto L_0x012b;
    L_0x012a:
        goto L_0x0131;
    L_0x012b:
        r2 = r6.k;	 Catch:{ all -> 0x018e }
        r3 = r2.a();	 Catch:{ all -> 0x018e }
    L_0x0131:
        r7.setFriendCount(r3);	 Catch:{ all -> 0x018e }
    L_0x0134:
        r2 = r6.j;	 Catch:{ all -> 0x018e }
        if (r2 == 0) goto L_0x0145;
    L_0x0138:
        r2 = r6.j;	 Catch:{ all -> 0x018e }
        r2 = r2.getDataSaverEnabled();	 Catch:{ all -> 0x018e }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x018e }
        r7.setAppTravelMode(r2);	 Catch:{ all -> 0x018e }
    L_0x0145:
        r2 = r7 instanceof defpackage.abhw;	 Catch:{ all -> 0x018e }
        if (r2 == 0) goto L_0x0177;
    L_0x0149:
        r2 = r7;
        r2 = (defpackage.abhw) r2;	 Catch:{ all -> 0x018e }
        r3 = r2.getUserNotTracked();	 Catch:{ all -> 0x018e }
        r4 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x018e }
        r3 = r4.equals(r3);	 Catch:{ all -> 0x018e }
        r3 = r3 ^ r1;
        if (r3 == 0) goto L_0x0177;
    L_0x0159:
        if (r0 == 0) goto L_0x0168;
    L_0x015b:
        r0 = r2.getUserId();	 Catch:{ all -> 0x018e }
        if (r0 != 0) goto L_0x0168;
    L_0x0161:
        r0 = r6.a();	 Catch:{ all -> 0x018e }
        r2.setUserId(r0);	 Catch:{ all -> 0x018e }
    L_0x0168:
        r0 = r6.h;	 Catch:{ all -> 0x018e }
        r0 = r0.get();	 Catch:{ all -> 0x018e }
        r0 = (defpackage.dim) r0;	 Catch:{ all -> 0x018e }
        r0 = r0.b();	 Catch:{ all -> 0x018e }
        r2.setClientId(r0);	 Catch:{ all -> 0x018e }
    L_0x0177:
        r0 = r7 instanceof defpackage.aaaf;	 Catch:{ all -> 0x018e }
        if (r0 == 0) goto L_0x0180;
    L_0x017b:
        r0 = r6.d;	 Catch:{ all -> 0x018e }
        r0 = r0 + r1;
        r6.d = r0;	 Catch:{ all -> 0x018e }
    L_0x0180:
        r0 = r6.d;	 Catch:{ all -> 0x018e }
        r1 = 2;
        if (r0 >= r1) goto L_0x0188;
    L_0x0185:
        r0 = defpackage.aabb.COLD;	 Catch:{ all -> 0x018e }
        goto L_0x018a;
    L_0x0188:
        r0 = defpackage.aabb.WARM;	 Catch:{ all -> 0x018e }
    L_0x018a:
        r7.setAppStartupType(r0);	 Catch:{ all -> 0x018e }
        return;
    L_0x018e:
        r7 = move-exception;
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dii.a(aajt):void");
    }

    public final void a(dli dli) {
        this.k = dli;
    }

    public final String b() {
        dli dli = this.k;
        return dli == null ? null : dli.e();
    }
}
