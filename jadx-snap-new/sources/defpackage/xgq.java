package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.snap.spectacles.base.service.SpectaclesService.a;
import com.snap.spectacles.base.service.SpectaclesService.b;

/* renamed from: xgq */
public final class xgq {
    final ajwy<xfn> a;
    final ajwy<xgk> b;
    public final Context c;
    private final ajxe d = ajxh.a(new c(this));
    private final ajxe e = ajxh.a(new b(this));

    /* renamed from: xgq$a */
    public enum a {
        BLE_MEDIA_RESPONSE(true),
        WATCHDOG(true),
        USER_ASSOCIATION(true),
        RECORDING_START(false),
        INVALID(false);
        
        public boolean isContentExists;

        private a(boolean z) {
            this.isContentExists = z;
        }
    }

    /* renamed from: xgq$c */
    static final class c extends akcs implements akbk<xfn> {
        private /* synthetic */ xgq a;

        c(xgq xgq) {
            this.a = xgq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xfn) this.a.a.get();
        }
    }

    /* renamed from: xgq$b */
    static final class b extends akcs implements akbk<xgk> {
        private /* synthetic */ xgq a;

        b(xgq xgq) {
            this.a = xgq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xgk) this.a.b.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xgq.class), "preferences", "getPreferences()Lcom/snap/spectacles/base/persistence/SpectaclesPreferences;"), new akdc(akde.a(xgq.class), "eventObservables", "getEventObservables()Lcom/snap/spectacles/base/rx/SpectaclesEventObservables;")};
    }

    public xgq(ajwy<xfn> ajwy, ajwy<xgk> ajwy2, Context context) {
        akcr.b(ajwy, "preferencesLazy");
        akcr.b(ajwy2, "eventObservablesLazy");
        akcr.b(context, "mContext");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = context;
    }

    private final xfn e() {
        return (xfn) this.d.b();
    }

    private final xgk f() {
        return (xgk) this.e.b();
    }

    public final void a() {
        if (xhq.a()) {
            StringBuilder stringBuilder = new StringBuilder("stopScanAndClearUnpairedDevices debug stack: ");
            stringBuilder.append(Log.getStackTraceString(new Throwable()));
            xhq.d(stringBuilder.toString(), new Object[0]);
        }
        Intent a = b.STOP_SCAN_AND_CLEAR_UNPAIRED_DEVICES.a(this.c);
        akcr.a((Object) a, "ServiceAction.STOP_SCAN_…teServiceIntent(mContext)");
        a(a, this.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    public final void a(android.content.Intent r4, android.content.Context r5) {
        /*
        r3 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 26;
        if (r0 < r1) goto L_0x0043;
    L_0x0006:
        r0 = r3.f();
        r0 = r0.h();
        r0 = r0.q();
        if (r0 == 0) goto L_0x002d;
    L_0x0014:
        r0 = r3.f();
        r0 = r0.h();
        r1 = "eventObservables.applicationEventObservable";
        defpackage.akcr.a(r0, r1);
        r0 = r0.p();
        r0 = (defpackage.xgd) r0;
        r1 = defpackage.xgd.APPLICATION_FOREGROUNDED;
        if (r0 != r1) goto L_0x002d;
    L_0x002b:
        r0 = 1;
        goto L_0x002e;
    L_0x002d:
        r0 = 0;
    L_0x002e:
        r1 = com.snap.spectacles.base.service.SpectaclesService.a.SERVICE_START_FOREGROUND;
        r1 = r1.name();
        r2 = r0 ^ 1;
        r4.putExtra(r1, r2);
        if (r0 == 0) goto L_0x003f;
    L_0x003b:
        r5.startService(r4);
        return;
    L_0x003f:
        r5.startForegroundService(r4);
        return;
    L_0x0043:
        r5.startService(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgq.a(android.content.Intent, android.content.Context):void");
    }

    public final void a(xdb xdb) {
        akcr.b(xdb, "spectaclesDevice");
        Intent putExtra = b.BT_CLASSIC_DOWNLOAD.a(this.c).putExtra(a.SERIAL_NUMBER.name(), xdb.d);
        akcr.a((Object) putExtra, "serviceIntent");
        a(putExtra, this.c);
    }

    public final void a(xdb xdb, xcp xcp) {
        akcr.b(xdb, "spectaclesDevice");
        akcr.b(xcp, "downloadReason");
        xhq.d("startWifiToFetchLogs ".concat(String.valueOf(xdb)), new Object[0]);
        Object e = e();
        akcr.a(e, "preferences");
        if (e.k()) {
            Intent putExtra = b.START_WIFI.a(this.c).putExtra(a.SERIAL_NUMBER.name(), xdb.d).putExtra(a.FETCH_FIRMWARE_LOGS.name(), xcp.ordinal());
            akcr.a((Object) putExtra, "ServiceAction.START_WIFI…, downloadReason.ordinal)");
            a(putExtra, this.c);
            return;
        }
        xhq.d("Logs won't be fetched since internal reporting is disabled", new Object[0]);
    }

    public final void a(xdb xdb, xcu.a aVar) {
        akcr.b(xdb, "spectaclesDevice");
        akcr.b(aVar, "ambaOperation");
        Intent putExtra = b.START_WIFI.a(this.c).putExtra(a.SERIAL_NUMBER.name(), xdb.d).putExtra(a.AMBA_OPERATION.name(), aVar.ordinal());
        akcr.a((Object) putExtra, "ServiceAction.START_WIFI…e, ambaOperation.ordinal)");
        a(putExtra, this.c);
    }

    public final void a(xed.a aVar, long j) {
        akcr.b(aVar, "scanMode");
        StringBuilder stringBuilder = new StringBuilder("startScan ");
        stringBuilder.append(aVar);
        stringBuilder.append(" scanPeriod=");
        stringBuilder.append(j);
        xhq.d(stringBuilder.toString(), new Object[0]);
        Intent putExtra = b.START_SCAN.a(this.c).putExtra(a.SCAN_MODE.name(), aVar).putExtra(a.SCAN_PERIOD.name(), j);
        akcr.a((Object) putExtra, "ServiceAction.START_SCAN…_PERIOD.name, scanPeriod)");
        a(putExtra, this.c);
    }

    public final void a(xem.a aVar) {
        akcr.b(aVar, "disconnectReason");
        Intent putExtra = b.STOP_WIFI.a(this.c).putExtra(a.WIFI_DISCONNECT_REASON.name(), aVar.name());
        akcr.a((Object) putExtra, "ServiceAction.STOP_WIFI.…e, disconnectReason.name)");
        a(putExtra, this.c);
    }

    public final boolean a(xdb xdb, a aVar) {
        akcr.b(xdb, "spectaclesDevice");
        xhq.d("startWifiForContentDownload ".concat(String.valueOf(xdb)), new Object[0]);
        if (xdb.j) {
            xhq.a("startWifiForContentDownload NOOP because of FIRMWARE_UPDATE_REQUIRED", new Object[0]);
            return false;
        }
        Intent putExtra = b.START_WIFI.a(this.c).putExtra(a.SERIAL_NUMBER.name(), xdb.d);
        if (aVar != null) {
            putExtra.putExtra(a.DOWNLOAD_TRIGGER.name(), aVar.ordinal());
            putExtra.putExtra(a.AMBA_OPERATION.name(), xcu.a.DOWNLOAD.ordinal());
        }
        akcr.a((Object) putExtra, "serviceIntent");
        a(putExtra, this.c);
        return true;
    }

    public final void b() {
        Intent a = b.EVALUATE_HEART_BEAT.a(this.c);
        akcr.a((Object) a, "ServiceAction.EVALUATE_H…teServiceIntent(mContext)");
        a(a, this.c);
    }

    public final void c() {
        Intent a = b.SCHEDULE_WATCHDOG.a(this.c);
        akcr.a((Object) a, "ServiceAction.SCHEDULE_W…teServiceIntent(mContext)");
        a(a, this.c);
    }

    public final void d() {
        Intent a = b.EXECUTE_STOP_SERVICE.a(this.c);
        akcr.a((Object) a, "ServiceAction.EXECUTE_ST…teServiceIntent(mContext)");
        a(a, this.c);
    }
}
