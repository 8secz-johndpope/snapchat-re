package com.snap.spectacles.base.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.aipp;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajxr;
import defpackage.akcr;
import defpackage.xbd;
import defpackage.xcl;
import defpackage.xcp;
import defpackage.xdb;
import defpackage.xep;
import defpackage.xge;
import defpackage.xgi;
import defpackage.xgj;
import defpackage.xgq;
import defpackage.xgr;
import defpackage.xgs;
import defpackage.xgt;
import defpackage.xhq;
import defpackage.xju;
import java.util.HashSet;
import java.util.Set;

public class SpectaclesService extends Service {
    public xbd a;
    public Set<xgs> b;
    private Set<xgs> c;
    private xgr d;
    private ajei e = new ajei();

    public enum b {
        START_SCAN,
        STOP_SCAN,
        STOP_SCAN_AND_CLEAR_UNPAIRED_DEVICES,
        CLEAR_SNAPCODE_DETECTED_DEVICES_CACHE,
        EVALUATE_HEART_BEAT,
        SEND_HEARTBEAT,
        START_WIFI,
        STOP_WIFI,
        SCHEDULE_WATCHDOG,
        HANDLE_WATCHDOG,
        CONTENT_DOWNLOAD_OVER_WIFI(false, true),
        FETCH_FIRMWARE_LOGS(false, true),
        CONTENT_DELETION_OVER_WIFI(false, true),
        FIRMWARE_UPLOAD_OVER_WIFI(false, true),
        FETCH_ANALYTICS_FILE(false, true),
        GENUINE_AUTH_ANDROID_P_AND_LATER(false, true),
        BT_CLASSIC_GENUINE_AUTH(true),
        BT_CLASSIC_DOWNLOAD(true),
        BT_CLASSIC_DELETE(true),
        REQUEST_STOP_SERVICE,
        EXECUTE_STOP_SERVICE,
        ON_CREATE,
        ON_DESTROY,
        START_SCAN_BACKGROUND_OTA_UPDATE,
        DISCONNECT_BT_COMPONENTS,
        HANDLE_BLUETOOTH_ENABLED,
        HANDLE_OTA_CHECK,
        UNKNOWN;
        
        public boolean mForBtClassic;
        public boolean mForWifi;

        private b(boolean z) {
            this(r2, r3, z, false);
        }

        private b(boolean z, boolean z2) {
            this.mForBtClassic = z;
            this.mForWifi = z2;
        }

        public static b a(String str) {
            try {
                return valueOf(str);
            } catch (Exception unused) {
                return UNKNOWN;
            }
        }

        public final Intent a(Context context) {
            return new Intent(context, SpectaclesService.class).setAction(name());
        }
    }

    public enum a {
        SERIAL_NUMBER,
        LATEST_VERSION,
        LATEST_VERSION_DIGEST,
        SCAN_MODE,
        SCAN_PERIOD,
        LAGUNA_USER_ID,
        FETCH_FIRMWARE_LOGS,
        DOWNLOAD_TRIGGER,
        WIFI_DISCONNECT_REASON,
        BLUETOOTH_ADDRESS,
        AMBA_OPERATION,
        CONTENT_TRANSFER_MODE,
        ACTION_NAME,
        STOPPED_FROM_NOTIFICATION,
        SERVICE_START_FOREGROUND
    }

    /* renamed from: com.snap.spectacles.base.service.SpectaclesService$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[xgj.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.xgj.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.xgj.BLE_STATE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.xgj.PAIRED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.xgj.FIRMWARE_UPDATE_FAILED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.base.service.SpectaclesService$AnonymousClass3.<clinit>():void");
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        xhq.d("onCreate", new Object[0]);
        aipp.a((Service) this);
        this.e.a(this.a.e().b().f((ajfb) new ajfb<ajxr<xdb, xgj, xgi>>() {
            public final /* synthetic */ void accept(Object obj) {
                ajxr ajxr = (ajxr) obj;
                xcl xcl = ((xgi) ajxr.c).a;
                xep xep = ((xgi) ajxr.c).b;
                xdb xdb = (xdb) ajxr.a;
                int i = AnonymousClass3.a[((xgj) ajxr.b).ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        long j = ((SharedPreferences) SpectaclesService.this.a.b().a.get()).getLong(defpackage.xfn.a.PAIRING_FAILURE_TIMESTAMP.name(), -1);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (j > 0 && elapsedRealtime - j <= 1800000) {
                            xhq.a("Detected a pairing failure, will be fetching firmware logs", new Object[0]);
                            SpectaclesService.this.a.b().a(defpackage.xfn.a.PAIRING_FAILURE_TIMESTAMP, -1);
                            xcp xcp = xcp.PAIRING_FAILURE;
                            xcp.mSubject = SpectaclesService.this.a.b().a(defpackage.xfn.a.PAIRING_FAILURE_STAGE, "");
                            SpectaclesService.this.a.h().a(xdb, xcp);
                        }
                    } else if (i == 3) {
                        xhq.a("Firmware update failed, will try to fetch the firmware logs", new Object[0]);
                        SpectaclesService.this.a.h().a(xdb, xcp.FIRMWARE_UPDATE_FAILURE);
                    }
                } else if (xcl.a(xcl.BLE_CONNECTED) && xep.a(xep.WIFI_DISCONNECTED)) {
                    xhq.c("onDeviceUpdate ble disconnected p2p active bleState=%s wifiState=%s", xcl, xep);
                }
            }
        }));
        this.e.a(this.a.e().a().f((ajfb) new ajfb<xge>() {
            public final /* synthetic */ void accept(Object obj) {
                xge xge = (xge) obj;
                if (xge.b == defpackage.xge.a.BLE_ENCRYPTION_COMPLETE) {
                    xdb xdb = xge.a;
                    if (!(xdb.q() && (xdb.r() == null || TextUtils.equals(xdb.a.k().a.j().b(xdb.d), xdb.r())))) {
                        if (!(xdb instanceof xju)) {
                            xhq.c("Device already authenticated through ble. Ready for User Association Request", new Object[0]);
                            xdb.g(SpectaclesService.this.a.b().d());
                        } else if (VERSION.SDK_INT > 26) {
                            xhq.c("Use wifi for Genuine Auth", new Object[0]);
                            SpectaclesService.this.a.h().a(xdb, defpackage.xcu.a.GENUINE_AUTHENTICATION);
                        } else {
                            xhq.c("Use Bluetooth Classic for Genuine Auth", new Object[0]);
                            xgq h = SpectaclesService.this.a.h();
                            akcr.b(xdb, "spectaclesDevice");
                            Intent putExtra = b.BT_CLASSIC_GENUINE_AUTH.a(h.c).putExtra(a.BLUETOOTH_ADDRESS.name(), xdb.i());
                            akcr.a((Object) putExtra, "serviceIntent");
                            h.a(putExtra, h.c);
                        }
                    }
                }
            }
        }));
        xbd xbd = this.a;
        xbd.a(xbd.l().a());
        this.d = this.a.n().g();
        xgr xgr = this.d;
        xbd xbd2 = this.a;
        xgr.a = this;
        xgr.c = xbd2;
        xgr.d = xgr.c.n();
        this.d.f();
        this.c = new HashSet(this.b);
        this.c.add(this.a.n().a());
        this.c.add(this.a.n().c());
        this.c.add(this.a.n().i());
        this.c.add(this.a.c());
        for (xgs b : this.c) {
            b.b();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (xhq.a()) {
            xhq.d("onDestroy", new Object[0]);
            this.a.f().a("SpectaclesService.onDestroy");
        }
        this.e.a();
        this.d.g();
        for (xgs c : this.c) {
            c.c();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            xgt h = this.a.n().h();
            akcr.b(this, "service");
            akcr.b(intent, "intent");
            if (intent.getBooleanExtra(a.SERVICE_START_FOREGROUND.name(), false)) {
                h.a((Service) this);
            }
            b a = b.a(intent.getAction());
            xhq.d("onStartCommand startId: %d serviceAction: %s", Integer.valueOf(i2), a);
            this.d.obtainMessage(0, i2, 0, intent).sendToTarget();
        }
        return 2;
    }
}
