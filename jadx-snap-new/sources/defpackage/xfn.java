package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import defpackage.xba.a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xfn */
public final class xfn implements a {
    private static final String c = System.getProperty("line.separator");
    public xgz<SharedPreferences> a = new 1();
    final Context b;
    private xhm d = new xhm();

    /* renamed from: xfn$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.xfn.a.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.xfn.a.a.BOOLEAN;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.xfn.a.a.INTEGER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.xfn.a.a.STRING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.xfn.a.a.STRING_SET;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xfn$2.<clinit>():void");
        }
    }

    /* renamed from: xfn$a */
    public enum a {
        LAGUNA_USER_ID(a.STRING, b.USER),
        USER_LOGGED_IN(a.BOOLEAN, b.USER),
        RESTARTED_FIRMWARE_DUE_TO_WIFI_RECONNECT_GIVE_UP(a.BOOLEAN, b.USER),
        BLUETOOTH_CLASSIC_UUID(a.STRING, b.USER),
        MISSING_CONTENT_IDS(a.STRING_SET, b.USER),
        AUTO_IMPORT_MODE_MUSHROOM(a.BOOLEAN, b.USER),
        IS_MASTER_MODE(a.BOOLEAN, b.APP),
        IS_INTERNAL_BUILD(a.BOOLEAN, b.APP),
        IS_INTERNAL_REPORTING_ENABLED(a.BOOLEAN, b.APP),
        ENABLE_HEVC(a.BOOLEAN, b.APP),
        MALIBU_DEV_KEY_ONLY(a.BOOLEAN, b.APP),
        ENABLE_NEWPORT(a.BOOLEAN, b.APP),
        DEBUG_TOAST_ENABLED(a.BOOLEAN, b.DEBUG),
        BLE_SCANNER_LOG_ENABLED(a.BOOLEAN, b.DEBUG),
        COPY_CONTENT_TO_EXTERNAL(a.BOOLEAN, b.DEBUG),
        MOCKED_BATTERY_PERCENTAGE(a.INTEGER, b.DEBUG),
        PAIRING_FAILURE_TIMESTAMP(a.LONG, b.DEBUG),
        PAIRING_FAILURE_STAGE(a.STRING, b.DEBUG),
        TRANSFER_STRESS_TEST(a.BOOLEAN, b.DEBUG),
        FORCE_WIFI_AP_TRANSFER(a.BOOLEAN, b.DEBUG),
        PRIORITIZE_CONTENT(a.BOOLEAN, b.DEBUG),
        TRANSFER_RECV_BUFFER_SIZE(a.INTEGER, b.DEBUG);
        
        a mDataType;
        b mScope;

        /* renamed from: xfn$a$a */
        public enum a {
            private static final /* synthetic */ a[] $VALUES = null;
            public static final a BOOLEAN = null;
            public static final a INTEGER = null;
            public static final a LONG = null;
            public static final a STRING = null;
            public static final a STRING_SET = null;

            static {
                INTEGER = new a("INTEGER", 0);
                LONG = new a("LONG", 1);
                BOOLEAN = new a("BOOLEAN", 2);
                STRING = new a("STRING", 3);
                STRING_SET = new a("STRING_SET", 4);
                $VALUES = new a[]{INTEGER, LONG, BOOLEAN, STRING, STRING_SET};
            }

            private a(String str, int i) {
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        /* renamed from: xfn$a$b */
        public enum b {
            private static final /* synthetic */ b[] $VALUES = null;
            public static final b APP = null;
            public static final b DEBUG = null;
            public static final b USER = null;

            static {
                USER = new b("USER", 0);
                APP = new b("APP", 1);
                DEBUG = new b("DEBUG", 2);
                $VALUES = new b[]{USER, APP, DEBUG};
            }

            private b(String str, int i) {
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        private a(a aVar, b bVar) {
            this.mDataType = aVar;
            this.mScope = bVar;
        }
    }

    /* renamed from: xfn$1 */
    class 1 extends xgz<SharedPreferences> {
        1() {
        }

        public final /* synthetic */ Object a() {
            return xfn.this.b.getSharedPreferences("Laguna", 0);
        }
    }

    public xfn(Context context) {
        this.b = context;
    }

    private int a(a aVar) {
        return ((SharedPreferences) this.a.get()).getInt(aVar.name(), -1);
    }

    private void b(a aVar) {
        ((SharedPreferences) this.a.get()).edit().remove(aVar.name()).apply();
    }

    private void b(a aVar, boolean z) {
        ((SharedPreferences) this.a.get()).edit().putBoolean(aVar.name(), z).apply();
    }

    private void r() {
        for (a aVar : a.values()) {
            if (aVar.mScope == b.USER) {
                b(aVar);
            }
        }
    }

    public final String a(a aVar, String str) {
        return ((SharedPreferences) this.a.get()).getString(aVar.name(), str);
    }

    public final Set<String> a(a aVar, Set<String> set) {
        return ((SharedPreferences) this.a.get()).getStringSet(aVar.name(), set);
    }

    public final void a(int i) {
        ((SharedPreferences) this.a.get()).edit().putInt(a.MOCKED_BATTERY_PERCENTAGE.name(), i).apply();
    }

    public final void a(String str) {
        String str2 = "";
        String str3 = "-";
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            String d = d();
            int equals = TextUtils.equals(str.replaceAll(str3, str2), d) ^ 1;
            if (xhq.a()) {
                xhq.d("hasUserIdChanged OLD=%s NEW=%s changed=%b", d, r5, Boolean.valueOf(equals));
            }
            i = equals;
        }
        if (i != 0) {
            r();
            b(a.LAGUNA_USER_ID, str.replaceAll(str3, str2));
            e();
        }
        b(a.USER_LOGGED_IN, true);
    }

    public final void a(a aVar, long j) {
        ((SharedPreferences) this.a.get()).edit().putLong(aVar.name(), j).apply();
    }

    public final void a(boolean z) {
        xhq.d("setRestartedFirmwareDueToWifiReconnectGiveUp %b", Boolean.valueOf(z));
        b(a.RESTARTED_FIRMWARE_DUE_TO_WIFI_RECONNECT_GIVE_UP, z);
    }

    public final boolean a() {
        return a(a.DEBUG_TOAST_ENABLED, false);
    }

    public final boolean a(a aVar, boolean z) {
        return ((SharedPreferences) this.a.get()).getBoolean(aVar.name(), z);
    }

    public final void b(int i) {
        ((SharedPreferences) this.a.get()).edit().putInt(a.TRANSFER_RECV_BUFFER_SIZE.name(), i).apply();
    }

    public final void b(a aVar, String str) {
        ((SharedPreferences) this.a.get()).edit().putString(aVar.name(), str).apply();
    }

    public final void b(boolean z) {
        b(a.IS_MASTER_MODE, z);
    }

    public final boolean b() {
        return a(a.BLE_SCANNER_LOG_ENABLED, false);
    }

    public final void c(boolean z) {
        b(a.IS_INTERNAL_BUILD, z);
    }

    public final boolean c() {
        xhq.d("hasRestartedFirmwareDueToWifiReconnectGiveUp %b", Boolean.valueOf(a(a.RESTARTED_FIRMWARE_DUE_TO_WIFI_RECONNECT_GIVE_UP, false)));
        return a(a.RESTARTED_FIRMWARE_DUE_TO_WIFI_RECONNECT_GIVE_UP, false);
    }

    public final String d() {
        return a(a.LAGUNA_USER_ID, null);
    }

    public final void d(boolean z) {
        b(a.IS_INTERNAL_REPORTING_ENABLED, z);
    }

    public final String e() {
        String a = xhm.a();
        b(a.BLUETOOTH_CLASSIC_UUID, a);
        if (xhq.a()) {
            xhq.d("saveNewBluetoothClassicUuid %s", a);
        }
        return a;
    }

    public final void e(boolean z) {
        b(a.MALIBU_DEV_KEY_ONLY, z);
    }

    public final void f(boolean z) {
        b(a.ENABLE_NEWPORT, z);
    }

    public final boolean f() {
        return a(a.USER_LOGGED_IN, true);
    }

    public final String g() {
        StringBuffer stringBuffer = new StringBuffer();
        for (a aVar : a.values()) {
            String format;
            if (((SharedPreferences) this.a.get()).contains(aVar.name())) {
                Object[] objArr;
                int i = 2.a[aVar.mDataType.ordinal()];
                String str = "Type:%s, Scope:%s, Key:%s, Value:%s";
                if (i == 1) {
                    objArr = new Object[]{aVar.mDataType.name(), aVar.mScope.name(), aVar.name(), Boolean.valueOf(a(aVar, false))};
                } else if (i == 2) {
                    objArr = new Object[]{aVar.mDataType.name(), aVar.mScope.name(), aVar.name(), Integer.valueOf(a(aVar))};
                } else if (i == 3) {
                    objArr = new Object[]{aVar.mDataType.name(), aVar.mScope.name(), aVar.name(), a(aVar, "")};
                } else if (i != 4) {
                } else {
                    objArr = new Object[]{aVar.mDataType.name(), aVar.mScope.name(), aVar.name(), a(aVar, new HashSet())};
                }
                format = String.format(str, objArr);
            } else {
                format = String.format("Type:%s, Scope:%s, Key not present:%s", new Object[]{aVar.mDataType.name(), aVar.mScope.name(), aVar.name()});
            }
            stringBuffer.append(format);
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    public final void g(boolean z) {
        b(a.AUTO_IMPORT_MODE_MUSHROOM, z);
    }

    public final void h() {
        r();
        b(a.USER_LOGGED_IN, false);
    }

    public final void h(boolean z) {
        ((SharedPreferences) this.a.get()).edit().putBoolean(a.ENABLE_HEVC.name(), z).apply();
    }

    public final boolean i() {
        return a(a.IS_MASTER_MODE, false);
    }

    public final boolean j() {
        return a(a.IS_INTERNAL_BUILD, false);
    }

    public final boolean k() {
        return a(a.IS_INTERNAL_REPORTING_ENABLED, false);
    }

    public final boolean l() {
        return a(a.MALIBU_DEV_KEY_ONLY, false);
    }

    public final boolean m() {
        return a(a.AUTO_IMPORT_MODE_MUSHROOM, false);
    }

    public final boolean n() {
        return ((SharedPreferences) this.a.get()).contains(a.MOCKED_BATTERY_PERCENTAGE.name());
    }

    public final int o() {
        return a(a.MOCKED_BATTERY_PERCENTAGE);
    }

    public final void p() {
        ((SharedPreferences) this.a.get()).edit().remove(a.MOCKED_BATTERY_PERCENTAGE.name()).apply();
    }

    public final boolean q() {
        return ((SharedPreferences) this.a.get()).getBoolean(a.ENABLE_HEVC.name(), false);
    }
}
