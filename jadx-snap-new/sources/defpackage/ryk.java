package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ryk */
public final class ryk implements ifa {
    private final Set<iey> a;
    private final ajwy<c> b;
    private final ajdw c;
    private final ihh d;
    private final WifiManager e;
    private final TelephonyManager f;
    private final ajwl<Optional<NetworkInfo>> g;
    private final Map<Integer, String> h;
    private final AtomicInteger i;
    private final ajei j;
    private volatile ajej k;
    private volatile WifiInfo l;
    private volatile String m;
    private volatile Optional<NetworkInfo> n;
    private volatile long o;

    /* renamed from: ryk$a */
    enum a {
        NETWORK_TYPE_UNKNOWN(0),
        NETWORK_TYPE_GPRS(1),
        NETWORK_TYPE_EDGE(2),
        NETWORK_TYPE_UMTS(3),
        NETWORK_TYPE_CDMA(4),
        NETWORK_TYPE_EVDO_0(5),
        NETWORK_TYPE_EVDO_A(6),
        NETWORK_TYPE_1xRTT(7),
        NETWORK_TYPE_HSDPA(8),
        NETWORK_TYPE_HSUPA(9),
        NETWORK_TYPE_HSPA(10),
        NETWORK_TYPE_IDEN(11),
        NETWORK_TYPE_EVDO_B(12),
        NETWORK_TYPE_LTE(13),
        NETWORK_TYPE_EHRPD(14),
        NETWORK_TYPE_HSPAP(15),
        NETWORK_TYPE_GSM(16),
        NETWORK_TYPE_TD_SCDMA(17),
        NETWORK_TYPE_IWLAN(18);
        
        final int type;

        private a(int i) {
            this.type = i;
        }
    }

    /* renamed from: ryk$c */
    public static class c {
        private final Context a;
        private final b b;
        private final ConnectivityManager c;
        private final ajdw d;

        c(Context context, b bVar, ConnectivityManager connectivityManager, ajdw ajdw) {
            this.a = context;
            this.b = bVar;
            this.c = connectivityManager;
            this.d = ajdw;
        }

        private Optional<NetworkInfo> a(Intent intent) {
            String str = "networkInfo";
            NetworkInfo b = b();
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra(str);
            Object obj = networkInfo == null ? (NetworkInfo) intent.getParcelableExtra(str) : networkInfo;
            if (b != null) {
                if (obj == null || b.isConnectedOrConnecting() || !obj.isConnectedOrConnecting()) {
                    obj = b;
                }
            }
            return Optional.fromNullable(obj);
        }

        private static /* synthetic */ void c() {
        }

        public final ajdp<Optional<NetworkInfo>> a() {
            return this.b.create(this.a, this.d).d(-$$Lambda$ryk$c$ZUgAuYgHnTLabbxhjB0PB0pa6ro.INSTANCE).p(new -$$Lambda$ryk$c$SbQBcfWBbMWQxpcfs1jkDu_ouMo(this)).p(-$$Lambda$ryk$c$q2aD_Jp0AJo7XTgG9S1UCFi6J80.INSTANCE);
        }

        public final NetworkInfo b() {
            return this.c == null ? null : this.c.getActiveNetworkInfo();
        }
    }

    /* renamed from: ryk$b */
    interface b {
        public static final b a = -$$Lambda$ryk$b$TWoE3Gw2shTKXDG_JWvX21DyF3g.INSTANCE;

        /* renamed from: ryk$b$-CC */
        public final /* synthetic */ class -CC {
        }

        ajdp<Intent> create(Context context, ajdw ajdw);
    }

    public ryk(Context context, zgb zgb, ajwy<ftl> ajwy, Set<iey> set, ihh ihh) {
        this(set, ajwy, ihh, new -$$Lambda$ryk$T0fmoQ8BBexyqBTQhRWrHDLLuU4(context, zgb), zgb.a(ryl.a, "NetworkStatusManager").b(), (WifiManager) context.getApplicationContext().getSystemService(MapboxEvent.KEY_WIFI), (TelephonyManager) context.getSystemService("phone"));
    }

    private ryk(Set<iey> set, ajwy<ftl> ajwy, ihh ihh, ajwy<c> ajwy2, ajdw ajdw, WifiManager wifiManager, TelephonyManager telephonyManager) {
        this.g = new ajwl();
        this.h = new HashMap();
        int i = 0;
        this.i = new AtomicInteger(0);
        this.j = new ajei();
        this.l = null;
        this.m = null;
        this.n = Optional.absent();
        this.o = 15000;
        this.a = set;
        this.b = ajwy2;
        this.c = ajdw;
        this.d = ihh;
        this.e = wifiManager;
        this.f = telephonyManager;
        a[] values = a.values();
        int length = values.length;
        while (i < length) {
            a aVar = values[i];
            this.h.put(Integer.valueOf(aVar.type), aVar.name());
            i++;
        }
        this.j.a(((ftl) ajwy.get()).i(rxp.CONNECTIVITY_SOURCE_FRESHNESS_THRESHOLD_MILLIS).b(ajdw).c(Long.valueOf(15000)).e(new -$$Lambda$ryk$E-1i0VIN6jmNz-dpBsKsy8uWU7w(this)));
    }

    private void a(Optional<NetworkInfo> optional) {
        WifiInfo wifiInfo;
        this.n = optional;
        NetworkInfo networkInfo = (NetworkInfo) optional.orNull();
        String str = null;
        if (this.e == null || !ryk.a(networkInfo)) {
            wifiInfo = null;
        } else {
            wifiInfo = this.e.getConnectionInfo();
            if (wifiInfo != null) {
                str = wifiInfo.getSSID();
            }
            this.m = str;
        }
        this.l = wifiInfo;
        this.g.a((Object) optional);
    }

    public static boolean a(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    private boolean a(Optional<NetworkInfo> optional, Optional<NetworkInfo> optional2) {
        return (optional == null && optional2 == null) ? true : (optional == null || optional2 == null) ? false : (optional.isPresent() || optional2.isPresent()) ? (optional.isPresent() && optional2.isPresent()) ? ((NetworkInfo) optional.get()).toString().equals(((NetworkInfo) optional2.get()).toString()) : false : true;
    }

    private ajej n() {
        synchronized (this) {
            this.i.incrementAndGet();
            o();
            this.k = ((c) this.b.get()).a().a(new -$$Lambda$ryk$twVbSGFu1xWaU8UVqXubvsoW-Eo(this)).d(new -$$Lambda$ryk$G2EWF0qCTtIlZMIFCcoSHk4K_G0(this)).f(Optional.absent()).c(-$$Lambda$ryk$kkcDJ4Eup3YKc8TSZCYdmKCnNos.INSTANCE).l();
        }
        return ajek.a(new -$$Lambda$ryk$uJC-FbGvIrpmXYJT5_uQCtxbsrQ(this));
    }

    private synchronized void o() {
        if (this.k != null) {
            this.k.dispose();
        }
        this.k = null;
    }

    private boolean p() {
        if (this.o < 0) {
            return false;
        }
        long c = this.d.c();
        for (iey a : this.a) {
            long a2 = a.a();
            if (a2 != -1 && a2 + this.o > c) {
                return true;
            }
        }
        return false;
    }

    private /* synthetic */ void q() {
        if (this.i.decrementAndGet() == 0) {
            o();
        }
    }

    public final String a() {
        TelephonyManager telephonyManager = this.f;
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
    }

    public final String b() {
        String name = a.NETWORK_TYPE_UNKNOWN.name();
        TelephonyManager telephonyManager = this.f;
        if (telephonyManager == null) {
            return name;
        }
        int networkType = telephonyManager.getNetworkType();
        return this.h.containsKey(Integer.valueOf(networkType)) ? (String) this.h.get(Integer.valueOf(networkType)) : name;
    }

    public final String c() {
        TelephonyManager telephonyManager = this.f;
        String networkOperator = telephonyManager == null ? null : telephonyManager.getNetworkOperator();
        if (networkOperator == null || networkOperator.length() <= 3) {
            return null;
        }
        String substring = networkOperator.substring(0, 3);
        networkOperator = networkOperator.substring(3);
        return String.format("%s-%s", new Object[]{substring, networkOperator});
    }

    public final String d() {
        NetworkInfo f = f();
        if (f == null || !f.isConnectedOrConnecting()) {
            return "not_reachable";
        }
        int type = f.getType();
        return type != 0 ? type != 1 ? "unknown" : MapboxEvent.KEY_WIFI : "wwan";
    }

    public final ajdp<Optional<NetworkInfo>> e() {
        return ajdp.a(new -$$Lambda$ryk$aeMATAvr1gyTEbDCdGUiXQGJe6w(this)).b(this.c);
    }

    public final NetworkInfo f() {
        Object obj;
        synchronized (this) {
            obj = this.k == null ? 1 : null;
        }
        if (obj == null) {
            return this.g.q() ? (NetworkInfo) ((Optional) this.g.p()).orNull() : null;
        } else {
            NetworkInfo b = ((c) this.b.get()).b();
            a(b == null ? Optional.absent() : Optional.of(b));
            return b;
        }
    }

    public final defpackage.iex g() {
        /*
        r5 = this;
        r0 = r5.d();
        r1 = r0.hashCode();
        r2 = 3;
        r3 = 2;
        r4 = 1;
        switch(r1) {
            case -1382484255: goto L_0x002d;
            case -284840886: goto L_0x0023;
            case 3649301: goto L_0x0019;
            case 3662605: goto L_0x000f;
            default: goto L_0x000e;
        };
    L_0x000e:
        goto L_0x0037;
    L_0x000f:
        r1 = "wwan";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0037;
    L_0x0017:
        r0 = 1;
        goto L_0x0038;
    L_0x0019:
        r1 = "wifi";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0037;
    L_0x0021:
        r0 = 0;
        goto L_0x0038;
    L_0x0023:
        r1 = "unknown";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0037;
    L_0x002b:
        r0 = 2;
        goto L_0x0038;
    L_0x002d:
        r1 = "not_reachable";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0037;
    L_0x0035:
        r0 = 3;
        goto L_0x0038;
    L_0x0037:
        r0 = -1;
    L_0x0038:
        if (r0 == 0) goto L_0x004c;
    L_0x003a:
        if (r0 == r4) goto L_0x0049;
    L_0x003c:
        if (r0 == r3) goto L_0x0046;
    L_0x003e:
        if (r0 == r2) goto L_0x0043;
    L_0x0040:
        r0 = defpackage.iex.UNRECOGNIZED_VALUE;
        return r0;
    L_0x0043:
        r0 = defpackage.iex.NOT_REACHABLE;
        return r0;
    L_0x0046:
        r0 = defpackage.iex.UNRECOGNIZED_VALUE;
        return r0;
    L_0x0049:
        r0 = defpackage.iex.WWAN;
        return r0;
    L_0x004c:
        r0 = defpackage.iex.WIFI;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryk.g():iex");
    }

    public final WifiInfo h() {
        return (this.e == null || !ryk.a(f())) ? null : this.e.getConnectionInfo();
    }

    public final boolean i() {
        NetworkInfo f = f();
        return f != null && f.isConnected() && f.getType() == 0;
    }

    public final WifiInfo j() {
        return this.l;
    }

    public final boolean k() {
        return ryk.a(f());
    }

    public final boolean l() {
        NetworkInfo f = f();
        return (f != null && f.isConnected()) || p();
    }

    public final boolean m() {
        NetworkInfo f = f();
        if (f == null || !f.isConnected()) {
            return false;
        }
        int type = f.getType();
        return type == 1 || type == 9;
    }
}
