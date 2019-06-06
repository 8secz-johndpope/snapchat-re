package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.common.collect.ImmutableSet;
import com.samsung.android.sdk.camera.SCamera;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.absn.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Set;

/* renamed from: absi */
public final class absi {
    private static final Set<String> b = ImmutableSet.of("sony");
    private static final Set<String> c = ImmutableSet.of("blu dash l2", "lon-al00", "lon-l29", "redmi note 4", "stf-l09", "stf-l19", "vtr-l09", "vky-al00", "cubot_manito", "moto c", "alba 5400", "e6810", "lenovo a7020a48");
    final int a;
    private final Context d;
    private final boolean e;
    private final int f;
    private final int g;
    private final String h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private boolean l;
    private final absg m;
    private final Point n;
    private final Point o;
    private final Point p;

    /* renamed from: absi$a */
    public static class a {
        public static final absi a = new absi(AppContext.get(), (byte) 0);
    }

    private absi(Context context) {
        this(context, context.getResources().getConfiguration().smallestScreenWidthDp >= 600, new absg());
    }

    /* synthetic */ absi(Context context, byte b) {
        this(context);
    }

    private absi(Context context, boolean z, absg absg) {
        this.l = false;
        this.n = new Point();
        this.o = new Point();
        this.p = new Point();
        this.h = absi.j();
        this.i = absi.i();
        this.k = c.contains(Build.MODEL.toLowerCase(Locale.US));
        this.d = context;
        this.j = g();
        this.e = z;
        this.a = a("navigation_bar_height");
        this.f = a("navigation_bar_height_landscape");
        this.g = a("navigation_bar_width");
        this.m = absg;
        c();
    }

    private static int a(int i, int i2) {
        return Math.min(i - i2, a.a.a);
    }

    private int a(String str) {
        Resources resources = this.d.getResources();
        int identifier = resources.getIdentifier(str, "dimen", "android");
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
    }

    public static absi a() {
        return a.a;
    }

    private static void a(Context context, Point point, Point point2, Point point3) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        if (point.x < point2.x) {
            point3.set(point2.x - point.x, point.y);
        } else if (point.y >= point2.y) {
            point3.set(0, 0);
        } else if (abnl.p) {
            point3.set(point.x, absi.a(point2.y, point.y));
        } else {
            point3.set(point.x, point2.y - point.y);
        }
    }

    private boolean g() {
        if (Build.MANUFACTURER.equalsIgnoreCase("xiaomi")) {
            try {
                if (Global.getInt(this.d.getContentResolver(), "force_fsg_nav_bar") == 1) {
                    return true;
                }
            } catch (SettingNotFoundException unused) {
            }
        }
        return false;
    }

    private static boolean h() {
        return Build.MANUFACTURER.equalsIgnoreCase("palm");
    }

    private static boolean i() {
        if ("meizu".equals(Build.BRAND.toLowerCase(Locale.US))) {
            if (VERSION.SDK_INT >= 21) {
                return true;
            }
            try {
                Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]);
                return true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
        }
        return false;
    }

    private static String j() {
        if (b.contains(Build.BRAND.toLowerCase(Locale.US))) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, new Object[]{"qemu.hw.mainkeys"});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    public final int a(boolean z) {
        if (!z) {
            return 0;
        }
        absi.a(this.d, this.n, this.o, this.p);
        return this.p.y;
    }

    @Deprecated
    public final int b(boolean z) {
        if (!z) {
            return 0;
        }
        if (!this.e) {
            return d();
        }
        if (!b()) {
            return 0;
        }
        absi.a(this.d, this.n, this.o, this.p);
        return this.p.x;
    }

    @Deprecated
    public final boolean b() {
        Resources resources = this.d.getResources();
        if (System.getInt(this.d.getContentResolver(), "dev_force_show_navbar", 0) == 1) {
            return true;
        }
        if (absi.h() || a.a.a || this.j) {
            return false;
        }
        String str = this.h;
        if (str != null) {
            if (TextUtils.equals(str, "0")) {
                return true;
            }
            if (TextUtils.equals(this.h, SCamera.CAMERA_ID_FRONT)) {
                return false;
            }
        }
        if (this.i) {
            return false;
        }
        if (this.m.a) {
            return this.l;
        }
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (!this.k && identifier > 0) {
            return resources.getBoolean(identifier);
        }
        return (KeyCharacterMap.deviceHasKey(4) || KeyCharacterMap.deviceHasKey(3) || ViewConfiguration.get(this.d).hasPermanentMenuKey()) ? false : true;
    }

    public final void c() {
        if (this.m.a) {
            this.l = this.m.a();
        }
    }

    @Deprecated
    public final int d() {
        return a(b());
    }

    public final int e() {
        return a.a.c() ? d() : 0;
    }

    public final int f() {
        return e();
    }
}
