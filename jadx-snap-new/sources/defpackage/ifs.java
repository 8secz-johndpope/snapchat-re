package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.DeadSystemException;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Lists;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.abrk.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ifs */
// PermissionHelper
public final class ifs {
    static final Supplier<Map<ifu, List<String>>> a = Suppliers.memoize(-$$Lambda$ifs$Okj2Ku4cfN1sMvvsNSvXNv15FEY.INSTANCE);
    private static final Supplier<Map<String, aauf>> e = Suppliers.memoize(-$$Lambda$ifs$rXI1o6U0XiN7mDXkgwN0LpQ7Nr4.INSTANCE);
    private static final Supplier<Map<ifv, aaud>> f = Suppliers.memoize(-$$Lambda$ifs$tJUdjKve2ZZxESDBf8_MnJU7KhI.INSTANCE);
    final Map<String, ifw> b = new HashMap();
    public final ajwo<ifx> c = new ajwo();
    public final ift d = new ift(AppContext.get());
    private final Supplier<Boolean> g = Suppliers.memoize(-$$Lambda$ifs$4qO5EKaj-Q_orzwkInAyoh96teA.INSTANCE);
    private final ajwo<aajt> h = new ajwo();
    private final Supplier<SharedPreferences> i = Suppliers.memoize(-$$Lambda$ifs$taPg5_V-xpKiVq2kPlPhiI_KJGw.INSTANCE);
    private final Supplier<ify> j = Suppliers.memoize(new -$$Lambda$ifs$zQNky_J71YFABR8o-UkjLA8z0E4(this));

    /* renamed from: ifs$a */
    public static class a {
        public static final ifs a = new ifs();
    }

    ifs() {
    }

    public static ifs a() {
        return a.a;
    }

    private void a(Activity activity, List<String> list) {
        for (String str : list) {
            this.b.put(str, new ifw(str, fq.a(activity, str), a(str)));
        }
    }

    private boolean a(String str, String str2, String str3) {
        if (b() && !TextUtils.isEmpty(str)) {
            return a(str);
        }
        AppOpsManager s = ifs.s();
        if (s != null) {
            if (VERSION.SDK_INT >= 23 && !TextUtils.isEmpty(str2)) {
                return s.checkOpNoThrow(str2, Binder.getCallingUid(), "com.snapchat.android.framework") == 0;
            } else {
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        int i = s.getClass().getField(str3).getInt(s);
                        Application application = AppContext.get();
                        AppOpsManager s2 = ifs.s();
                        if (s2 != null) {
                            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(s2, new Object[]{Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), application.getPackageName()})).intValue() == 0;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return true;
    }

    private ajcx b(ifu ifu) {
        return ajcx.a(new -$$Lambda$ifs$dWCJhg2eKSQQ5Cy9Q8xGn1cnkh8(this, ifu));
    }

    private /* synthetic */ void c(ifu ifu) {
        ((SharedPreferences) this.i.get()).edit().putBoolean(ifu.name(), true).apply();
    }

    public static boolean c() {
        boolean z = true;
        try {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) AppContext.get().getSystemService("device_policy");
            if (devicePolicyManager != null) {
                if (!devicePolicyManager.getCameraDisabled(null)) {
                    return true;
                }
                z = false;
            }
        } catch (Exception unused) {
        }
        return z;
    }

    private static AppOpsManager s() {
        try {
            return (AppOpsManager) AppContext.get().getSystemService("appops");
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean t() {
        return ((ify) this.j.get()).c();
    }

    private /* synthetic */ ify u() {
        ify ify = new ify(a.a, this, this.h, AppContext.get());
        SharedPreferences a = ify.a();
        String str = "migrated";
        if (!a.getBoolean(str, false)) {
            a.edit().putBoolean(str, true).putBoolean("granted", ify.a.b(abro.IS_USER_SPECIFIC_LOCATION_PERMISSION_MODE_ACTIVATED)).apply();
        }
        return ify;
    }

    private static /* synthetic */ Boolean w() {
        boolean z = AppContext.get().getApplicationContext().getApplicationInfo().targetSdkVersion >= 23 && VERSION.SDK_INT >= 23;
        return Boolean.valueOf(z);
    }

    private static /* synthetic */ Map x() {
        String str = "android.permission.CAMERA";
        String str2 = "android.permission.WRITE_EXTERNAL_STORAGE";
        String str3 = "android.permission.RECORD_AUDIO";
        String str4 = "android.permission.READ_CONTACTS";
        String str5 = "android.permission.READ_PHONE_STATE";
        Builder put = ImmutableMap.builder().put(ifu.MAIN_APP_START, Lists.newArrayList(str, str2)).put(ifu.CAMERA_VIDEO_RECORD_START, Lists.newArrayList(str3)).put(ifu.MEMORIES_READ_CAMERA_ROLL, Lists.newArrayList("android.permission.READ_EXTERNAL_STORAGE")).put(ifu.SAVE_TO_CAMERA_ROLL, Lists.newArrayList(str2)).put(ifu.REG_DISPLAY_NAME, Lists.newArrayList(str4)).put(ifu.REG_EMAIL, Lists.newArrayList(str4)).put(ifu.REG_FIND_FRIENDS, Lists.newArrayList(str4)).put(ifu.REG_PHONE_NUMBER, Lists.newArrayList(str5)).put(ifu.IN_APP_FIND_FRIENDS, Lists.newArrayList(str4)).put(ifu.IN_APP_PHONE_NUMBER, Lists.newArrayList(str5));
        ifu ifu = ifu.SPECTACLES_PAIR_START;
        String str6 = PermissionsManager.FINE_LOCATION_PERMISSION;
        return put.put(ifu, Lists.newArrayList(str6)).put(ifu.MAP_LOCATION_OVERLAY, Lists.newArrayList(str6)).put(ifu.SHARE_REQUEST_LOCATION, Lists.newArrayList(str6)).put(ifu.ODG_DRAW_GEOFENCE, Lists.newArrayList(str6)).put(ifu.REG_BLITZ, Lists.newArrayList(str4, str5)).put(ifu.REG_SUPER_BLITZ, Lists.newArrayList(str, str3, str2, str4, str5)).put(ifu.TALK_START_CALL, Lists.newArrayList(str3, str5)).put(ifu.TALK_RECORD_NOTE, Lists.newArrayList(str3)).put(ifu.MAIN_APP_AFTER_CRITICAL_PERMISSIONS_GRANTED, Lists.newArrayList(str3)).put(ifu.NEW_GEO_STORY, Lists.newArrayList(str6)).put(ifu.FILTERS_LOCATION_CAROUSEL, Lists.newArrayList(str6)).put(ifu.PREVIEW_AFTER_TAKING_SNAP, Lists.newArrayList(str6)).build();
    }

    private static /* synthetic */ Map z() {
        String str = "android.permission.RECORD_AUDIO";
        Builder put = ImmutableMap.builder().put("android.permission.CAMERA", aauf.OS_CAMERA).put(str, aauf.OS_MICROPHONE);
        return put.put(PermissionsManager.FINE_LOCATION_PERMISSION, aauf.OS_LOCATION).put("android.permission.READ_EXTERNAL_STORAGE", aauf.OS_PHOTO).put("android.permission.WRITE_EXTERNAL_STORAGE", aauf.OS_PHOTO).put("android.permission.READ_CONTACTS", aauf.OS_CONTACTS).put("android.permission.READ_PHONE_STATE", aauf.OS_PHONE).build();
    }

    public final ajdp<ifx> a(Activity activity, ifu ifu, zfw zfw) {
        List list = (List) ((Map) a.get()).get(ifu);
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return ajdp.b(new IllegalArgumentException("Failed to request permissions due to invalid Activity"));
        }
        if (list == null || list.isEmpty()) {
            return ajdp.b(new IllegalArgumentException("Failed to request permissions because no permissions are registered"));
        }
        if (b()) {
            a(activity, list);
            return zfw == null ? b(ifu).b(new -$$Lambda$ifs$W19jXrM3WElskXWovztkovsq4SI(activity, list, ifu)).a(this.c) : b(ifu).b(new -$$Lambda$ifs$2YaPIP1-XVrUXhyQYTAIQdPqGcU(zfw, activity, list, ifu)).a(this.c);
        } else {
            a(activity, list);
            return b(ifu).b(new -$$Lambda$ifs$Y-HSnrzaG9eP8UaBThRPlS-q5eA(this, list, ifu)).a(this.c);
        }
    }

    @Deprecated
    public final void a(Activity activity, ifu ifu) {
        a(activity, ifu, null).a(-$$Lambda$ifs$K81DZN76CvZp3RltPP5bK-OCLaI.INSTANCE, igu.a("PermissionHelper"));
    }

    public final void a(ifx ifx) {
        this.c.a((Object) ifx);
        for (String str : ifx.a()) {
            aaud aaud = (aaud) ((Map) f.get()).get(ifx.c(str));
            if (aaud != null) {
                aauf aauf = (aauf) ((Map) e.get()).get(str);
                Object aaue = new aaue();
                aaue.a = aauf;
                aaue.b = aaud;
                aaue.c = Boolean.valueOf(aaud == aaud.GRANTED);
                this.h.a(aaue);
            }
        }
    }

    public final boolean a(ifu ifu) {
        return !b() ? true : ((SharedPreferences) this.i.get()).getBoolean(ifu.name(), false);
    }

    public final boolean a(String str) {
        boolean z = false;
        try {
            if (b() ? ContextCompat.checkSelfPermission(AppContext.get(), str) != 0 : he.a(AppContext.get(), str) != 0) {
                z = true;
            }
            return z;
        } catch (SecurityException unused) {
            return true;
        } catch (Exception e) {
            if (VERSION.SDK_INT >= 24 && (e.getCause() instanceof DeadSystemException)) {
                return false;
            }
            throw e;
        }
    }

    public final ajdp<ifx> b(Activity activity, ifu ifu) {
        return a(activity, ifu, null);
    }

    public final boolean b() {
        return ((Boolean) this.g.get()).booleanValue();
    }

    public final boolean d() {
        return a("android.permission.CAMERA", "android:camera", "OP_CAMERA");
    }

    public final boolean e() {
        return a("android.permission.RECORD_AUDIO", "android:record_audio", "OP_RECORD_AUDIO");
    }

    public final boolean f() {
        return a("android.permission.READ_CONTACTS");
    }

    public final boolean g() {
        return a("android.permission.READ_PHONE_STATE");
    }

    public final ajdp<ifx> h() {
        return this.c;
    }

    public final boolean i() {
        return a("android.permission.READ_EXTERNAL_STORAGE");
    }

    public final boolean j() {
        return a("android.permission.WRITE_EXTERNAL_STORAGE", "android:write_external_storage", "OP_WRITE_EXTERNAL_STORAGE");
    }

    public final ifr k() {
        return new ifr(a(PermissionsManager.FINE_LOCATION_PERMISSION), t());
    }

    public final boolean l() {
        boolean a = a(PermissionsManager.FINE_LOCATION_PERMISSION);
        boolean t = t();
        if (b()) {
            if (a && t) {
                return true;
            }
            a = false;
        }
        return a;
    }

    public final boolean m() {
        return ((ify) this.j.get()).d() == ify.a.GRANTED;
    }

    public final boolean n() {
        ify ify = (ify) this.j.get();
        String b = ify.b();
        if (b == null) {
            return false;
        }
        ify.a(ify.a(b), ify.e());
        return true;
    }

    public final ify o() {
        return (ify) this.j.get();
    }

    public final boolean p() {
        return a(ifu.TALK_START_CALL);
    }

    public final ajdp<aajt> q() {
        return this.h;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x01bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x01cf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x01ea */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(1:2)(2:3|(1:5)(3:6|(1:11)(1:10)|(1:13)(2:14|(1:16)(2:17|(1:19)))))|20|21|22|23|24|58|59|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:51|52|53|54|55|56|57) */
    /* JADX WARNING: Missing block: B:62:?, code skipped:
            r4 = r2.a;
            r9 = new android.content.Intent();
            r9.setAction(r1);
            r9.addFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
            r9.addFlags(com.looksery.sdk.audio.AudioPlayer.INFINITY_LOOP_COUNT);
            r9.addFlags(8388608);
            r9.setData(android.net.Uri.fromParts(r0, r3, null));
            defpackage.ift.a(r4, r9);
     */
    /* JADX WARNING: Missing block: B:63:0x0207, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:64:0x0208, code skipped:
            defpackage.ift.a(r2.a);
     */
    /* JADX WARNING: Missing block: B:66:0x020d, code skipped:
            return;
     */
    public final void r() {
        /*
        r15 = this;
        r0 = "package";
        r1 = "android.settings.APPLICATION_DETAILS_SETTINGS";
        r2 = r15.d;
        r3 = r2.a;
        r3 = r3.getPackageName();
        r4 = defpackage.abrr.b();
        r6 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x0019;
    L_0x0016:
        r4 = defpackage.abrr.a.EMUI;
        goto L_0x0068;
    L_0x0019:
        r4 = defpackage.abrr.a();
        r5 = -1;
        if (r4 == r5) goto L_0x0023;
    L_0x0020:
        r4 = defpackage.abrr.a.MIUI;
        goto L_0x0068;
    L_0x0023:
        r4 = "ro.build.display.id";
        r5 = "";
        r4 = defpackage.absm.a(r4, r5);
        r5 = android.text.TextUtils.isEmpty(r4);
        if (r5 != 0) goto L_0x0041;
    L_0x0031:
        r5 = java.util.Locale.US;
        r4 = r4.toLowerCase(r5);
        r5 = "flyme";
        r4 = r4.contains(r5);
        if (r4 == 0) goto L_0x0041;
    L_0x003f:
        r4 = 1;
        goto L_0x0042;
    L_0x0041:
        r4 = 0;
    L_0x0042:
        if (r4 == 0) goto L_0x0047;
    L_0x0044:
        r4 = defpackage.abrr.a.FLYME;
        goto L_0x0068;
    L_0x0047:
        r4 = android.os.Build.HARDWARE;
        r5 = "mt[0-9]*";
        r4 = r4.matches(r5);
        if (r4 == 0) goto L_0x0054;
    L_0x0051:
        r4 = defpackage.abrr.a.MTK;
        goto L_0x0068;
    L_0x0054:
        r4 = android.os.Build.MANUFACTURER;
        r5 = java.util.Locale.US;
        r4 = r4.toUpperCase(r5);
        r5 = defpackage.abrr.a;
        r4 = r5.get(r4);
        r4 = (defpackage.abrr.a) r4;
        if (r4 != 0) goto L_0x0068;
    L_0x0066:
        r4 = defpackage.abrr.a.OTHER;
    L_0x0068:
        r5 = 0;
        r6 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r9 = defpackage.ift.1.a;	 Catch:{ a -> 0x01cf }
        r4 = r4.ordinal();	 Catch:{ a -> 0x01cf }
        r4 = r9[r4];	 Catch:{ a -> 0x01cf }
        r9 = "android.intent.action.MAIN";
        r10 = "packageName";
        switch(r4) {
            case 1: goto L_0x019c;
            case 2: goto L_0x014f;
            case 3: goto L_0x012f;
            case 4: goto L_0x010c;
            case 5: goto L_0x00e9;
            case 6: goto L_0x00c6;
            case 7: goto L_0x00a3;
            case 8: goto L_0x0080;
            default: goto L_0x007e;
        };
    L_0x007e:
        goto L_0x01cf;
    L_0x0080:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r11 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r11.<init>(r9);	 Catch:{ a -> 0x01cf }
        r11.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r11.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r11.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r9 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r12 = "com.qihoo360.mobilesafe";
        r13 = "com.qihoo360.mobilesafe.ui.index.AppEnterActivity";
        r9.<init>(r12, r13);	 Catch:{ a -> 0x01cf }
        r11.setComponent(r9);	 Catch:{ a -> 0x01cf }
        r11.putExtra(r10, r3);	 Catch:{ a -> 0x01cf }
        defpackage.ift.a(r4, r11);	 Catch:{ a -> 0x01cf }
        return;
    L_0x00a3:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r9 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r9.<init>();	 Catch:{ a -> 0x01cf }
        r9.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r11 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r12 = "com.letv.android.letvsafe";
        r13 = "com.letv.android.letvsafe.PermissionAndApps";
        r11.<init>(r12, r13);	 Catch:{ a -> 0x01cf }
        r9.setComponent(r11);	 Catch:{ a -> 0x01cf }
        r9.putExtra(r10, r3);	 Catch:{ a -> 0x01cf }
        defpackage.ift.a(r4, r9);	 Catch:{ a -> 0x01cf }
        return;
    L_0x00c6:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r9 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r9.<init>();	 Catch:{ a -> 0x01cf }
        r9.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r11 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r12 = "com.color.safecenter";
        r13 = "com.color.safecenter.permission.PermissionManagerActivity";
        r11.<init>(r12, r13);	 Catch:{ a -> 0x01cf }
        r9.setComponent(r11);	 Catch:{ a -> 0x01cf }
        r9.putExtra(r10, r3);	 Catch:{ a -> 0x01cf }
        defpackage.ift.a(r4, r9);	 Catch:{ a -> 0x01cf }
        return;
    L_0x00e9:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r11 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r11.<init>(r9);	 Catch:{ a -> 0x01cf }
        r11.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r11.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r11.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r9 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r12 = "com.android.settings";
        r13 = "com.android.settings.Settings$AccessLockSummaryActivity";
        r9.<init>(r12, r13);	 Catch:{ a -> 0x01cf }
        r11.setComponent(r9);	 Catch:{ a -> 0x01cf }
        r11.putExtra(r10, r3);	 Catch:{ a -> 0x01cf }
        defpackage.ift.a(r4, r11);	 Catch:{ a -> 0x01cf }
        return;
    L_0x010c:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r9 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r9.<init>();	 Catch:{ a -> 0x01cf }
        r9.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r11 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r12 = "com.sonymobile.cta";
        r13 = "com.sonymobile.cta.SomcCTAMainActivity";
        r11.<init>(r12, r13);	 Catch:{ a -> 0x01cf }
        r9.setComponent(r11);	 Catch:{ a -> 0x01cf }
        r9.putExtra(r10, r3);	 Catch:{ a -> 0x01cf }
        defpackage.ift.a(r4, r9);	 Catch:{ a -> 0x01cf }
        return;
    L_0x012f:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r9 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r11 = "com.meizu.safe.security.SHOW_APPSEC";
        r9.<init>(r11);	 Catch:{ a -> 0x01cf }
        r11 = "com.meizu.safe";
        r12 = "com.meizu.safe.security.AppSecActivity";
        r9.setClassName(r11, r12);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r9.putExtra(r10, r3);	 Catch:{ a -> 0x01cf }
        defpackage.ift.a(r4, r9);	 Catch:{ a -> 0x01cf }
        return;
    L_0x014f:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r9 = defpackage.abrr.a();	 Catch:{ a -> 0x01cf }
        r10 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r10.<init>();	 Catch:{ a -> 0x01cf }
        r10.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r10.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r10.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r11 = 5;
        if (r9 != r11) goto L_0x0171;
    L_0x0166:
        r10.setAction(r1);	 Catch:{ a -> 0x01cf }
        r9 = android.net.Uri.fromParts(r0, r3, r5);	 Catch:{ a -> 0x01cf }
        r10.setData(r9);	 Catch:{ a -> 0x01cf }
        goto L_0x0198;
    L_0x0171:
        r11 = 6;
        r12 = "extra_pkgname";
        r13 = "com.miui.securitycenter";
        r14 = "miui.intent.action.APP_PERM_EDITOR";
        if (r9 == r11) goto L_0x018a;
    L_0x017a:
        r11 = 7;
        if (r9 != r11) goto L_0x017e;
    L_0x017d:
        goto L_0x018a;
    L_0x017e:
        r10.setAction(r14);	 Catch:{ a -> 0x01cf }
        r9 = "com.miui.permcenter.permissions.PermissionsEditorActivity";
        r10.setClassName(r13, r9);	 Catch:{ a -> 0x01cf }
    L_0x0186:
        r10.putExtra(r12, r3);	 Catch:{ a -> 0x01cf }
        goto L_0x0198;
    L_0x018a:
        r10.setAction(r14);	 Catch:{ a -> 0x01cf }
        r9 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r11 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity";
        r9.<init>(r13, r11);	 Catch:{ a -> 0x01cf }
        r10.setComponent(r9);	 Catch:{ a -> 0x01cf }
        goto L_0x0186;
    L_0x0198:
        defpackage.ift.a(r4, r10);	 Catch:{ a -> 0x01cf }
        return;
    L_0x019c:
        r4 = r2.a;	 Catch:{ a -> 0x01cf }
        r9 = new android.content.Intent;	 Catch:{ a -> 0x01cf }
        r9.<init>();	 Catch:{ a -> 0x01cf }
        r9.addFlags(r8);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r7);	 Catch:{ a -> 0x01cf }
        r9.addFlags(r6);	 Catch:{ a -> 0x01cf }
        r9.putExtra(r10, r3);	 Catch:{ a -> 0x01cf }
        r10 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r11 = "com.huawei.systemmanager";
        r12 = "com.huawei.permissionmanager.ui.SingleAppActivity";
        r10.<init>(r11, r12);	 Catch:{ a -> 0x01cf }
        r9.setComponent(r10);	 Catch:{ a -> 0x01cf }
        defpackage.ift.a(r4, r9);	 Catch:{ Exception -> 0x01bf }
        goto L_0x01cb;
    L_0x01bf:
        r10 = new android.content.ComponentName;	 Catch:{ a -> 0x01cf }
        r11 = "com.Android.settings";
        r12 = "com.android.settings.permission.TabItem";
        r10.<init>(r11, r12);	 Catch:{ a -> 0x01cf }
        r9.setComponent(r10);	 Catch:{ a -> 0x01cf }
    L_0x01cb:
        defpackage.ift.a(r4, r9);	 Catch:{ a -> 0x01cf }
        return;
    L_0x01cf:
        r4 = r2.a;	 Catch:{ a -> 0x01ea }
        r9 = new android.content.Intent;	 Catch:{ a -> 0x01ea }
        r10 = "android.intent.action.MANAGE_APP_PERMISSIONS";
        r9.<init>(r10);	 Catch:{ a -> 0x01ea }
        r9.addFlags(r8);	 Catch:{ a -> 0x01ea }
        r9.addFlags(r7);	 Catch:{ a -> 0x01ea }
        r9.addFlags(r6);	 Catch:{ a -> 0x01ea }
        r10 = "android.intent.extra.PACKAGE_NAME";
        r9.putExtra(r10, r3);	 Catch:{ a -> 0x01ea }
        defpackage.ift.a(r4, r9);	 Catch:{ a -> 0x01ea }
        return;
    L_0x01ea:
        r4 = r2.a;	 Catch:{ a -> 0x0208 }
        r9 = new android.content.Intent;	 Catch:{ a -> 0x0208 }
        r9.<init>();	 Catch:{ a -> 0x0208 }
        r9.setAction(r1);	 Catch:{ a -> 0x0208 }
        r9.addFlags(r8);	 Catch:{ a -> 0x0208 }
        r9.addFlags(r7);	 Catch:{ a -> 0x0208 }
        r9.addFlags(r6);	 Catch:{ a -> 0x0208 }
        r0 = android.net.Uri.fromParts(r0, r3, r5);	 Catch:{ a -> 0x0208 }
        r9.setData(r0);	 Catch:{ a -> 0x0208 }
        defpackage.ift.a(r4, r9);	 Catch:{ a -> 0x0208 }
        return;
    L_0x0208:
        r0 = r2.a;
        defpackage.ift.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifs.r():void");
    }
}
