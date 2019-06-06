package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import com.snap.core.db.DbConstantsKt;
import defpackage.xem.a;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xdb */
public abstract class xdb {
    public xbd a;
    public xex b = new xex();
    public xdd c;
    public String d = "";
    BluetoothDevice e;
    public AtomicBoolean f = new AtomicBoolean();
    public int g = -1;
    protected boolean h;
    public boolean i;
    public boolean j;
    public AtomicBoolean k = new AtomicBoolean();
    public long l;
    protected MessageNano m;
    public xcl n = xcl.BLE_DISCONNECTED;
    public boolean o;
    public int p;
    private b q;
    private final xhj r = new xhj();
    private long s;
    private byte[] t;
    private byte[] u;

    /* renamed from: xdb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xdb$b */
    public static class b {
        public int a = DbConstantsKt.MAX_QUERY_VARIABLE_COUNT;
        public int b = DbConstantsKt.MAX_QUERY_VARIABLE_COUNT;
        public int c = DbConstantsKt.MAX_QUERY_VARIABLE_COUNT;
        public int d = DbConstantsKt.MAX_QUERY_VARIABLE_COUNT;
        public long e;

        /* renamed from: xdb$b$a */
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

        public void a(MessageNano messageNano) {
            akcr.b(messageNano, "tempReport");
            throw new UnsupportedOperationException("Not implemented in parent class");
        }
    }

    /* renamed from: xdb$c */
    public static final class c<V> implements Callable<Object> {
        private /* synthetic */ xdb a;

        public c(xdb xdb) {
            this.a = xdb;
        }

        public final /* synthetic */ Object call() {
            this.a.i();
            return Optional.fromNullable(null);
        }
    }

    /* renamed from: xdb$f */
    static final class f<V> implements Callable<T> {
        private /* synthetic */ xbp a;
        private /* synthetic */ xdb b;

        f(xbp xbp, xdb xdb) {
            this.a = xbp;
            this.b = xdb;
        }

        public final /* synthetic */ Object call() {
            xeh d = this.a.d();
            xdb c = d.c();
            boolean z = c != null && ((TextUtils.equals(c.i(), this.b.i()) || TextUtils.equals(c.d, this.b.d)) && d.f().b(xeg.DISCOVERING));
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: xdb$h */
    static final class h implements Runnable {
        private /* synthetic */ xdb a;
        private /* synthetic */ boolean b;

        h(xdb xdb, boolean z) {
            this.a = xdb;
            this.b = z;
        }

        public final void run() {
            xdb xdb;
            this.a.a.k().c().a(this.b, this.a.d);
            if (this.a.o() != 0) {
                xdb = this.a;
                xdb.a.k().c().c(System.currentTimeMillis(), xdb.d);
            }
            if (this.b) {
                xdb = this.a;
                xdb.a.k().c().a(xdb.r(), xdb.d);
            }
        }
    }

    /* renamed from: xdb$d */
    public static final class d implements ajev {
        private /* synthetic */ xdb a;

        public d(xdb xdb) {
            this.a = xdb;
        }

        /* JADX WARNING: Missing block: B:12:0x0027, code skipped:
            if (r0.e == null) goto L_0x003b;
     */
        /* JADX WARNING: Missing block: B:13:0x0029, code skipped:
            r1 = r0.s();
     */
        /* JADX WARNING: Missing block: B:14:0x002d, code skipped:
            if (r1 == null) goto L_0x0036;
     */
        /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            r1 = r1.a(r0.e);
     */
        /* JADX WARNING: Missing block: B:16:0x0036, code skipped:
            r1 = false;
     */
        /* JADX WARNING: Missing block: B:17:0x0037, code skipped:
            if (r1 == false) goto L_0x003b;
     */
        /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            r1 = true;
     */
        /* JADX WARNING: Missing block: B:19:0x003b, code skipped:
            r1 = false;
     */
        /* JADX WARNING: Missing block: B:20:0x003c, code skipped:
            r3 = new java.lang.StringBuilder("executeConnect successful=");
            r3.append(r1);
            r3.append(" for ");
            r3.append(r0.d);
            defpackage.xhq.d(r3.toString(), new java.lang.Object[0]);
     */
        /* JADX WARNING: Missing block: B:21:0x0059, code skipped:
            if (r1 != false) goto L_0x0060;
     */
        /* JADX WARNING: Missing block: B:22:0x005b, code skipped:
            r0.a(defpackage.xcl.BLE_DISCONNECTED);
     */
        /* JADX WARNING: Missing block: B:23:0x0060, code skipped:
            return;
     */
        public final void run() {
            /*
            r5 = this;
            r0 = r5.a;
            monitor-enter(r0);
            r1 = r0.n;	 Catch:{ all -> 0x0061 }
            r2 = defpackage.xcl.BLE_ATTEMPT_TO_CONNECT;	 Catch:{ all -> 0x0061 }
            r1 = r1.d(r2);	 Catch:{ all -> 0x0061 }
            r2 = 0;
            if (r1 == 0) goto L_0x001f;
        L_0x000e:
            r1 = "executeConnect - Already BLE_ATTEMPT_TO_CONNECT or higher - No op: ";
            r3 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0061 }
            r1 = r1.concat(r3);	 Catch:{ all -> 0x0061 }
            r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0061 }
            defpackage.xhq.a(r1, r2);	 Catch:{ all -> 0x0061 }
            monitor-exit(r0);
            return;
        L_0x001f:
            r1 = defpackage.xcl.BLE_ATTEMPT_TO_CONNECT;	 Catch:{ all -> 0x0061 }
            r0.a(r1);	 Catch:{ all -> 0x0061 }
            monitor-exit(r0);
            r1 = r0.e;
            if (r1 == 0) goto L_0x003b;
        L_0x0029:
            r1 = r0.s();
            if (r1 == 0) goto L_0x0036;
        L_0x002f:
            r3 = r0.e;
            r1 = r1.a(r3);
            goto L_0x0037;
        L_0x0036:
            r1 = 0;
        L_0x0037:
            if (r1 == 0) goto L_0x003b;
        L_0x0039:
            r1 = 1;
            goto L_0x003c;
        L_0x003b:
            r1 = 0;
        L_0x003c:
            r3 = new java.lang.StringBuilder;
            r4 = "executeConnect successful=";
            r3.<init>(r4);
            r3.append(r1);
            r4 = " for ";
            r3.append(r4);
            r4 = r0.d;
            r3.append(r4);
            r3 = r3.toString();
            r2 = new java.lang.Object[r2];
            defpackage.xhq.d(r3, r2);
            if (r1 != 0) goto L_0x0060;
        L_0x005b:
            r1 = defpackage.xcl.BLE_DISCONNECTED;
            r0.a(r1);
        L_0x0060:
            return;
        L_0x0061:
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xdb$d.run():void");
        }
    }

    /* renamed from: xdb$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ xdb a;

        e(xdb xdb) {
            this.a = xdb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            if (optional.isPresent()) {
                ((xds) optional.get()).a();
            }
            xdb xdb = this.a;
            xhq.d("disconnectBtClassicIfNecessary", new Object[0]);
            xbp n = xdb.a.n();
            if (n != null) {
                ajdx.c((Callable) new f(n, xdb)).b(ajwh.c).a(ajef.a()).c((ajfb) new g(n, xdb)).c();
            }
            return ajxw.a;
        }
    }

    /* renamed from: xdb$g */
    static final class g<T> implements ajfb<Boolean> {
        private /* synthetic */ xbp a;
        private /* synthetic */ xdb b;

        g(xbp xbp, xdb xdb) {
            this.a = xbp;
            this.b = xdb;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "disconnect");
            if (obj.booleanValue()) {
                this.a.d().e();
                this.a.e().b(this.b).a().a(true);
            }
        }
    }

    static {
        a aVar = new a();
    }

    public xdb(xbd xbd) {
        akcr.b(xbd, "component");
        this.a = xbd;
    }

    private void P() {
        a(null);
        a(xcl.BLE_DISCONNECTED);
        a(false);
        b(false);
    }

    private void a(a aVar) {
        akcr.b(aVar, "disconnectReason");
        xhq.d("disconnectWifiIfNecessary", new Object[0]);
        xbp n = this.a.n();
        if (n != null) {
            xem b = n.b();
            xdb c = b.c();
            if (c == null) {
                return;
            }
            if (TextUtils.equals(c.i(), i()) || TextUtils.equals(c.d, this.d)) {
                b.a(aVar);
            }
        }
    }

    public final xeg A() {
        xbp n = this.a.n();
        if (n != null) {
            xdb c = n.d().c();
            if (c != null && TextUtils.equals(c.d, this.d)) {
                Object f = n.d().f();
                akcr.a(f, "it.bluetoothClassicManager().state");
                return f;
            }
        }
        return xeg.INACTIVE;
    }

    public final boolean B() {
        return !TextUtils.isEmpty((CharSequence) i()) && this.a.k().c().m(this.d);
    }

    public final void C() {
        this.a.e().a(this, xgj.DEVICE_INFO);
    }

    public final xfh D() {
        Object g = this.a.k().c().g(this.d);
        akcr.a(g, "spectaclesCoreComponent.…MediaCounts(serialNumber)");
        return g;
    }

    public final xfh E() {
        Object f = this.a.k().c().f(this.d);
        akcr.a(f, "spectaclesCoreComponent.…MediaCounts(serialNumber)");
        return f;
    }

    public final void F() {
        this.a.k().c().g(this.a.k().c().j(this.d), this.d);
        this.a.k().c().e(this.a.k().c().h(this.d), this.d);
        this.a.k().c().f(this.a.k().c().i(this.d), this.d);
    }

    public final long G() {
        return this.a.k().c().k(this.d);
    }

    public final void H() {
        if (xhq.a()) {
            this.a.f().a("Successfully received all statuses over BLE");
        }
        if (q()) {
            a(xcl.BLE_SYNCED);
            xdv t = t();
            if (t != null) {
                t.a();
            }
        } else {
            a(this.a.j().a(this) ? xcl.BLE_UNPAIR_ACTION_REQUIRED : xcl.BLE_NAME_ACTION_REQUIRED);
            Object b = this.a.j().b(this.d);
            if (!(b == null || (akcr.a(b, (Object) this) ^ 1) == 0 || !xhq.a())) {
                StringBuilder stringBuilder = new StringBuilder("Unpair the existing laguna device for the same serial number ");
                stringBuilder.append(this.d);
                xhq.a(stringBuilder.toString(), new Object[0]);
                this.a.f().a("Trying to pair an already paired device...\n(✖╭╮✖)").b();
            }
        }
        this.a.j().b(this);
    }

    public abstract void I();

    public abstract void J();

    public abstract void K();

    public abstract xcm L();

    public abstract abcq M();

    public abstract boolean N();

    public abstract boolean O();

    public abstract xcy a();

    public final void a(int i) {
        this.a.k().c().h(i, this.d);
    }

    public final void a(long j) {
        this.a.k().c().a(j, this.d);
    }

    public final void a(BluetoothDevice bluetoothDevice) {
        this.e = bluetoothDevice;
        bluetoothDevice = this.e;
        if (bluetoothDevice != null) {
            String name = bluetoothDevice.getName();
            if (name != null) {
                c(name);
            }
        }
    }

    public abstract void a(MessageNano messageNano);

    public final void a(String str) {
        akcr.b(str, "<set-?>");
        this.d = str;
    }

    public final void a(String str, String str2, xeb xeb) {
        akcr.b(str, "targetHash");
        akcr.b(str2, "targetVersionTag");
        akcr.b(xeb, "callback");
        xcx b = new xcx.a().a(str).b(str2).a((int) xhe.a(new Date())).a().b();
        xdv t = t();
        if (t != null) {
            t.a(b, xeb);
        }
    }

    public final void a(xcl xcl) {
        akcr.b(xcl, "value");
        synchronized (this) {
            StringBuilder stringBuilder = new StringBuilder("setBleState newState=");
            stringBuilder.append(xcl);
            stringBuilder.append(" oldState= ");
            stringBuilder.append(this.n);
            stringBuilder.append("  device=");
            stringBuilder.append(this);
            xhq.d(stringBuilder.toString(), new Object[0]);
            Object obj = this.n != xcl ? 1 : null;
            this.n = xcl;
            if (obj != null) {
                xhq.d("setBleState -> onDeviceUpdate device=".concat(String.valueOf(this)), new Object[0]);
                this.s = SystemClock.elapsedRealtime();
                this.a.e().a(this, xgj.BLE_STATE, new xgi(this.n, z(), null));
                if (this.n == xcl.BLE_SYNCED) {
                    xhq.d("BLE_SYNCED -> onBleEncryptionComplete", new Object[0]);
                    this.a.e().a(this);
                }
            }
        }
    }

    public final void a(b bVar) {
        akcr.b(bVar, "<set-?>");
        this.q = bVar;
    }

    public final void a(xeb xeb) {
        akcr.b(xeb, "responseCallback");
        xdv t = t();
        if (t != null) {
            t.k(xeb);
        }
    }

    public final void a(xeb xeb, int i) {
        akcr.b(xeb, "callback");
        xdv t = t();
        if (t != null) {
            t.c(xeb, i);
        }
    }

    public final void a(xfa xfa) {
        if (xfa != null) {
            this.a.k().c().a(xfa.a, xfa.b, xfa.c, this.d);
        }
    }

    public final void a(boolean z) {
        this.i = z;
        if (z) {
            this.a.e().a(this, xgj.FIRMWARE_UPDATE_AVAILABLE);
        }
    }

    public final void a(boolean z, xeb xeb) {
        akcr.b(xeb, "callback");
        xdv t = t();
        if (t != null) {
            t.b(z, xeb);
        }
    }

    public final void a(byte[] bArr) {
        this.t = bArr;
        if ((((CharSequence) this.d).length() > 0 ? 1 : null) != null) {
            this.a.k().c().a(bArr, this.d);
        }
    }

    public final boolean a(String str, String str2) {
        akcr.b(str, "currentVersionStr");
        akcr.b(str2, "latestVersionStr");
        if (!this.a.b().i()) {
            return b(str, str2);
        }
        CharSequence charSequence = str2;
        return (TextUtils.isEmpty(charSequence) || TextUtils.equals(str, charSequence)) ? false : true;
    }

    public final b b() {
        b bVar = this.q;
        if (bVar == null) {
            akcr.a("temperatureReport");
        }
        return bVar;
    }

    public final void b(int i) {
        this.a.k().c().a(i, this.d);
    }

    public final void b(String str) {
        this.a.k().c().b(str, this.d);
    }

    public final void b(xeb xeb) {
        akcr.b(xeb, "responseCallback");
        xdv t = t();
        if (t != null) {
            t.n(xeb);
        }
    }

    public final void b(xeb xeb, int i) {
        akcr.b(xeb, "callback");
        xdv t = t();
        if (t != null) {
            t.b(xeb, i);
        }
    }

    public final void b(boolean z) {
        this.j = z;
        if (z) {
            this.a.e().a(this, xgj.FIRMWARE_UPDATE_REQUIRED);
        }
    }

    public final void b(byte[] bArr) {
        akcr.b(bArr, "<set-?>");
        this.u = bArr;
    }

    public abstract boolean b(String str, String str2);

    public final xci c() {
        xbp n = this.a.n();
        if (n != null) {
            xcj j = n.j();
            if (j != null) {
                return j.a(this);
            }
        }
        return null;
    }

    public final void c(int i) {
        this.a.k().c().i(i, this.d);
    }

    public final void c(String str) {
        this.a.k().c().d(str, this.d);
    }

    public final void c(xeb xeb) {
        akcr.b(xeb, "responseCallback");
        xdv t = t();
        if (t != null) {
            t.d(xeb);
        }
    }

    public final void c(xeb xeb, int i) {
        akcr.b(xeb, "callback");
        xdv t = t();
        if (t != null) {
            t.a(xeb, i);
        }
    }

    public final void c(boolean z) {
        this.a.k().a(new h(this, z));
        if (z) {
            String q = this.a.k().c().q(this.d);
            if (q != null) {
                xdv t = t();
                if (t != null) {
                    t.a(q);
                }
            }
        }
    }

    public final void d(String str) {
        this.a.k().c().e(str, this.d);
    }

    public final void d(xeb xeb) {
        akcr.b(xeb, "callback");
        xdv t = t();
        if (t != null) {
            t.j(xeb);
        }
    }

    public final void d(boolean z) {
        this.a.k().c().b(this.d, z);
    }

    public final byte[] d() {
        byte[] bArr = this.t;
        return bArr == null ? this.a.k().c().p(this.d) : bArr;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e(String str) {
        Object obj;
        akcr.b(str, "serialNumber");
        if (new akfr("[0-9a-fA-F]{16}").a(str)) {
            obj = 1;
        } else {
            xhq.a("Wrong serialNumber ".concat(String.valueOf(str)), new Object[0]);
            obj = null;
        }
        if (obj != null) {
            xbb j = this.a.j();
            byte[] bArr = this.u;
            if (bArr == null) {
                akcr.a("pairingCode");
            }
            j.a(str, bArr, false);
            this.d = str;
            BluetoothDevice bluetoothDevice = this.e;
            if (bluetoothDevice == null) {
                akcr.a();
            }
            c(bluetoothDevice.getName());
            a(d());
            a(System.currentTimeMillis());
            this.b.a = str;
            return;
        }
        throw new IllegalArgumentException("Invalid serial number");
    }

    public final void e(xeb xeb) {
        akcr.b(xeb, "callback");
        xdv t = t();
        if (t != null) {
            t.o(xeb);
        }
    }

    public final void e(boolean z) {
        this.k.set(z);
        this.l = System.currentTimeMillis();
    }

    public final byte[] e() {
        byte[] bArr = this.u;
        if (bArr == null) {
            akcr.a("pairingCode");
        }
        return bArr;
    }

    public final long f() {
        return this.a.k().c().e(this.d);
    }

    public final boolean f(String str) {
        akcr.b(str, "latestVersion");
        if (!TextUtils.isEmpty(str)) {
            String h = h();
            if (h == null) {
                akcr.a();
            }
            if (a(h, str)) {
                return false;
            }
        }
        return true;
    }

    public abstract void g(String str);

    public final byte[] g() {
        return this.a.k().c().u(this.d);
    }

    public final String h() {
        return this.a.k().c().d(this.d);
    }

    public final String i() {
        BluetoothDevice bluetoothDevice = this.e;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        String b = this.a.k().c().b(this.d);
        if (BluetoothAdapter.checkBluetoothAddress(b)) {
            a(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(b));
        }
        return b;
    }

    public final int j() {
        return this.a.k().c().l(this.d);
    }

    public final xfa k() {
        return this.a.k().c().s(this.d);
    }

    public final int l() {
        Integer c = this.a.k().c().c(this.d);
        return c != null ? c.intValue() : xcm.UNKNOWN.a();
    }

    public final boolean m() {
        return this.a.k().c().o(this.d);
    }

    public final int n() {
        return this.a.k().c().v(this.d);
    }

    public final long o() {
        return this.a.k().c().t(this.d);
    }

    public final String p() {
        return this.a.k().c().r(this.d);
    }

    public final boolean q() {
        return this.a.k().c().m(this.d);
    }

    public final String r() {
        BluetoothDevice bluetoothDevice = this.e;
        return bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
    }

    /* Access modifiers changed, original: final */
    public final xds s() {
        xbp n = this.a.n();
        if (n != null) {
            xdy f = n.f();
            if (f != null) {
                return f.a(this);
            }
        }
        return null;
    }

    public final xdv t() {
        xbp n = this.a.n();
        if (n != null) {
            xdy f = n.f();
            if (f != null) {
                return f.b(this);
            }
        }
        return null;
    }

    public String toString() {
        if (!xhq.a()) {
            return this.d;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("[serial=");
        stringBuilder.append(this.d);
        stringBuilder.append(" instance=@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        String str = " ";
        stringBuilder.append(str);
        stringBuilder.append(this.n);
        stringBuilder.append(str);
        stringBuilder.append(z());
        stringBuilder.append(str);
        stringBuilder.append(A());
        stringBuilder.append(" battery=");
        stringBuilder.append(a());
        stringBuilder.append(" storagePercent=");
        stringBuilder.append(this.g);
        stringBuilder.append(" firmwareVersion=");
        xdd xdd = this.c;
        stringBuilder.append(xdd != null ? xdd.toString() : null);
        stringBuilder.append(" firmwareUpdateRequired=");
        stringBuilder.append(this.j);
        stringBuilder.append(" firmwareUpdateAvailable=");
        stringBuilder.append(this.i);
        stringBuilder.append(" pendingMediaUpdate=");
        stringBuilder.append(this.o);
        stringBuilder.append(" recording=");
        stringBuilder.append(this.k);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void u() {
        xhq.d("Tearing down all Bluetooth connections", new Object[0]);
        ajdx.b(Optional.fromNullable(s())).f(new e(this)).b(ajef.a()).c();
    }

    public final void v() {
        u();
        a(a.DEVICE_DISCONNECT);
    }

    public final void w() {
        xhq.d("onDeleted() ".concat(String.valueOf(this)), new Object[0]);
        u();
        a(a.SPECS_FORGOTTEN);
        P();
        xci c = c();
        if (c != null) {
            c.t();
        }
        if (!TextUtils.isEmpty(this.d)) {
            c(false);
            this.a.k().c().b(false, this.d);
        }
        this.a.e().a(this, xgj.DELETED);
    }

    public final void x() {
        xhq.d("onUnpaired() ".concat(String.valueOf(this)), new Object[0]);
        v();
        P();
        xci c = c();
        if (c != null) {
            c.t();
        }
        c(false);
        this.a.e().a(this, xgj.UNPAIRED);
    }

    public final boolean y() {
        return this.n.d(xcl.BLE_SYNCED);
    }

    public final xep z() {
        xbp n = this.a.n();
        if (n != null) {
            xdb c = n.b().c();
            if (c != null && TextUtils.equals(c.d, this.d)) {
                Object h = n.b().h();
                akcr.a(h, "it.wifiManager().wifiState");
                return h;
            }
        }
        return xep.WIFI_DISCONNECTED;
    }
}
